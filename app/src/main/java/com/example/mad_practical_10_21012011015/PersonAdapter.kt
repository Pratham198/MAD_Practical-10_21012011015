package com.example.mad_practical_10_21012011015

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class PersonAdapter( context: Context, val personArray:ArrayList<Person> ):ArrayAdapter<Person>(context,0,personArray) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view= LayoutInflater.from(context).inflate(R.layout.person_item,parent,false)
        val contact =getItem(position)
        view.findViewById<TextView>(R.id.person_name).text = personArray[position].name
        view.findViewById<TextView>(R.id.personnumber).text = personArray[position].phoneNo
        view.findViewById<TextView>(R.id.personemail).text = personArray[position].emailId
        view.findViewById<TextView>(R.id.personaddress).text = personArray[position].address
        val button1: Button = view.findViewById(R.id.locationBtn)
        button1.setOnClickListener {
            // Start the MapsActivity when button1 is clicked
            val intent = Intent(context, MapsActivity::class.java)
            context.startActivity(intent)
        }

        return view
    }
}
