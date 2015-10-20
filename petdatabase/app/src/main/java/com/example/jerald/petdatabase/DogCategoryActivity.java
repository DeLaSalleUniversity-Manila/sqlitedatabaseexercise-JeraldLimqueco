package com.example.jerald.petdatabase;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Jerald on 10/20/2015.
 */
public class DogCategoryActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    ListView listDogs = getListView();
    ArrayAdapter<Dogs> listAdapter = new ArrayAdapter<Dogs>(this,
            android.R.layout.simple_list_item_1,
            Dogs.dogs);
    listDogs.setAdapter(listAdapter);
}

    @Override
    public void onListItemClick(ListView listView,
                                View itemView,
                                int position,
                                long id) {
        Intent intent = new Intent(DogCategoryActivity.this, DogsActivity.class);
        intent.putExtra(DogsActivity.EXTRA_DOGNO, (int) id);
        startActivity(intent);
    }

}
