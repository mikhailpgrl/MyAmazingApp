package com.example.myamazingapp

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity(), PersonAdapter.OnItemClickListener {

    private val random: Int
        get() = Random().nextInt(9)

    private lateinit var personAdapter: PersonAdapter

    private var alertDialog: AlertDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()

        addPersonButton.setOnClickListener {
            personAdapter.addPerson(
                Person(
                    id = random.toString(),
                    name = getRandomName(),
                    description = getRandomDescription(),
                    avatarUrl = getRandomAvatarUrl()
                )
            )
        }
    }

    override fun onItemClicked(id: String) {
        alertDialog = AlertDialog.Builder(this)
            .setTitle("Delete Person")
            .setMessage("Do you want to delete the person from the list")
            .setPositiveButton("Yes") { dialog, _ ->
                personAdapter.removePerson(id)
                dialog.dismiss()
            }.setNegativeButton("No") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

    private fun initRecyclerView() {
        personAdapter = PersonAdapter(this)

        with(personList) {
            this.layoutManager = LinearLayoutManager(context)
            this.adapter = personAdapter
            this.setHasFixedSize(true)
        }
    }

    private fun getRandomName() = resources.getStringArray(R.array.names)[random]

    private fun getRandomDescription() = resources.getStringArray(R.array.sentences)[random]

    private fun getRandomAvatarUrl() = "https://i.pravatar.cc/150?img=$random"

}
