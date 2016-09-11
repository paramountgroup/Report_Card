package us.theparamountgroup.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Create an ArrayList of StudentGrdes objects
    ArrayList<StudentGrades> studentGrades = new ArrayList<StudentGrades>();
    studentGrades.add(new StudentGrades("Google Analytics", "A", 4));
    studentGrades.add(new StudentGrades("Android Basics Nanodegree", "A", 4));
    studentGrades.add(new StudentGrades("Front End Web Developer", "A", 4));


    // Create an {@link StudentGradesAdapter}, whose data source is a list of
    // {@link StudentGrades}s. The adapter knows how to create list item views for each item
    // in the list.
    StudentGradesAdapter gradesAdapter = new StudentGradesAdapter(this, studentGrades);

    // Get a reference to the ListView, and attach the adapter to the listView.
    ListView listView = (ListView) findViewById(R.id.listview_grades);
    listView.setAdapter(gradesAdapter);
}
