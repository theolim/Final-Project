package com.example.theonicolo.ustfoodfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;


public class MainActivity extends ActionBarActivity {

    //List<Contact> Contacts = new ArrayList<Contact>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //listView = (ListView) findViewById(R.id.list);
        //String[] stores = {"Toribox", "Mcdonalds", "Bonchon", "Dimsum Treats"};
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, stores);
        //getListView().setAdapter(adapter);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);

        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("Promo");
        tabSpec.setContent(R.id.Promos);
        tabSpec.setIndicator("Promos");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("nearby");
        tabSpec.setContent(R.id.Nearby);
        tabSpec.setIndicator("Nearby");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("new");
        tabSpec.setContent(R.id.New);
        tabSpec.setIndicator("What's New");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("menu");
        tabSpec.setContent(R.id.Menu);
        tabSpec.setIndicator("Menu");
        tabHost.addTab(tabSpec);

    }

  //  public class ContactListAdapter extends ArrayAdapter<Contact>{
   //     public ContactListAdapter(){
    //        super (MainActivity.this, R.layout.listview_item, Contacts);
     //   }
   // }

    public void underconstruction(View view){
        Intent intent = new Intent(this, underconstruction.class);
        startActivity(intent);
    }

    public void store(View view){
        Intent intent = new Intent(this, storeInfo.class);
        startActivity(intent);
    }


    public void storeDakasi(View view){
        Intent intent = new Intent(this, storeInfoDaksi.class);
        startActivity(intent);
    }
    public void storeToribox(View view){
        Intent intent = new Intent(this, storeInfoToribox.class);
        startActivity(intent);
    }
    public void storeDimsum(View view){
        Intent intent = new Intent(this, storeInfoDimsum.class);
        startActivity(intent);
    }

    public void liststoreChicken(View view){
        Intent intent = new Intent(this, liststoreChicken.class);
        startActivity(intent);

    }

    public void liststore(View view){
        Intent intent = new Intent(this, liststore.class);
        startActivity(intent);

    }

    public void liststoreDap(View view){
        Intent intent = new Intent(this, liststoreDapitan.class);
        startActivity(intent);

    }

    public void liststoreLac(View view){
        Intent intent = new Intent(this, liststoreLacson.class);
        startActivity(intent);

    }

    public void liststoreNov(View view){
        Intent intent = new Intent(this, liststoreNoval.class);
        startActivity(intent);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
