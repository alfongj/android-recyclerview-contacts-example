package es.alfongj.contactstest.presenter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import es.alfongj.contactstest.R;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_host, new ContactsFragment())
                .commit();
    }
}
