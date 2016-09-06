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

    // Create an ArrayList of AndroidFlavor objects
    ArrayList<StudentGrades> studentGrades = new ArrayList<StudentGrades>();
    studentGrades.add(new StudentGrades("Google Analytics", "A", 4.00));


    // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
    // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
    // in the list.
    AndroidFlavorAdapter flavorAdapter = new AndroidFlavorAdapter(this, androidFlavors);

    // Get a reference to the ListView, and attach the adapter to the listView.
    ListView listView = (ListView) findViewById(R.id.listview_flavor);
    listView.setAdapter(flavorAdapter);
}
