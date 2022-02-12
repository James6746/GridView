package com.example.gridview

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var coursesGV: GridView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        coursesGV = findViewById(R.id.idGVcourses)

        val courseModelArrayList = ArrayList<CourseModel>()
        for(i in 0..5){
            courseModelArrayList.add(CourseModel("DSA", R.drawable.ic_launcher_foreground))
            courseModelArrayList.add(CourseModel("JAVA", R.drawable.ic_launcher_foreground))
            courseModelArrayList.add(CourseModel("C++", R.drawable.ic_launcher_foreground))
            courseModelArrayList.add(CourseModel("Python", R.drawable.ic_launcher_foreground))
            courseModelArrayList.add(CourseModel("Javascript", R.drawable.ic_launcher_foreground))
            courseModelArrayList.add(CourseModel("DSA", R.drawable.ic_launcher_foreground))
        }


        val adapter = CourseGVAdapter(this, courseModelArrayList)
        (coursesGV as GridView).setAdapter(adapter)
    }
}