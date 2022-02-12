package com.example.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CourseGVAdapterKotlin(context: Context, courseModelArrayList: ArrayList<CourseModel?>?) :
    ArrayAdapter<CourseModel?>(context, 0, courseModelArrayList!!) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listitemView = convertView

        if (listitemView == null) {
            listitemView = LayoutInflater.from(context).inflate(R.layout.card_item, parent, false)
        }

        val courseModel = getItem(position)
        val courseTV = listitemView!!.findViewById<TextView>(R.id.idTVCourse)
        val courseIV = listitemView.findViewById<ImageView>(R.id.idIVcourse)

        courseTV.text = courseModel!!.course_name
        courseIV.setImageResource(courseModel.imgid)
        return listitemView
    }
}