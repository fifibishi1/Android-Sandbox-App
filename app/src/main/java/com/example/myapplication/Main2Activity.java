package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class Main2Activity extends AppCompatActivity {

    private Button button;
    private Button scrollTx;
    private Button dataTable;
    private Button dialog;
    private Button selectChips;
    private Button floatingBut;
    private Button passcodeButt;
    private Button explore7;
    private Button profileButton;
    private Button creditButton;
    private Button shareButton1;
    private Button shareButton2;
    private Button shareButton3;
    private Button shareButton4;
    private Button shareButton5;
    private Button shareButton6;
    private Button shareButton7;
    private Button shareButton8;
    private Button shareButton9;
    private Button shareButton10;
    private Button shareButton11;
    private Button shareButton12;
    private Button shareButton13;
    private Button shareButton14;
    private Button shareButton15;
    private Button shareButton16;
    private Button shareButton17;
    private Button shareButton18;
    private Button shareButton19;
    private Button shareButton20;
    private Button shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = (Button) findViewById(R.id.explore1);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openContextMenu();
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackground(getResources().getDrawable(R.color.colorPrimary));
        setSupportActionBar(toolbar);

        AccountHeader accountHeader = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.mesmer_logo)
                .withTranslucentStatusBar(true)
                .build();

        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withName("Home");
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withName("Logout");
        final Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .withAccountHeader(accountHeader)
                .addDrawerItems(
                        item1,
                        new DividerDrawerItem(),
                        item2
                        )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        openLogout();
                        return true;
                    }
                })
                .build();
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        result.getActionBarDrawerToggle().setDrawerIndicatorEnabled(true);

        profileButton = (Button) findViewById(R.id.explore);
        profileButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openContextMenu2();
            }
        });

//        floatingBut = (Button) findViewById(R.id.explore9);
//        floatingBut.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                openFloat();
//            }
//        });

        scrollTx = (Button) findViewById(R.id.explore8);
        scrollTx.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openScrollText();
            }
        });

        selectChips= (Button) findViewById(R.id.explore10);
        selectChips.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openSelectChips();
            }
        });

        dataTable = (Button) findViewById(R.id.explore11);
        dataTable.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openDataTable();
            }
        });

        dialog = (Button) findViewById(R.id.explore12);
        dialog.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openDaialog();
            }
        });

        creditButton = (Button) findViewById(R.id.explore4);
        creditButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openCreditForm();
            }
        });

        passcodeButt = (Button) findViewById(R.id.explore20);
        passcodeButt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openPasscode();
            }
        });

        explore7 = (Button) findViewById(R.id.explore7);
        explore7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openDatePick();
            }
        });

        shareButton = (Button) findViewById(R.id.share);
        shareButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openShareMenu();
            }
        });
        shareButton1 = (Button) findViewById(R.id.share1);
        shareButton1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openShareMenu();
            }
        });

//        shareButton2 = (Button) findViewById(R.id.share2);
//        shareButton2.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                openShareMenu();
//            }
//        });
//
//        shareButton3 = (Button) findViewById(R.id.share3);
//        shareButton3.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                openShareMenu();
//            }
//        });

        shareButton4 = (Button) findViewById(R.id.share4);
        shareButton4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openShareMenu();
            }
        });

//        shareButton5 = (Button) findViewById(R.id.share5);
//        shareButton5.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                openShareMenu();
//            }
//        });
//
//        shareButton6 = (Button) findViewById(R.id.share6);
//        shareButton6.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                openShareMenu();
//            }
//        });

        shareButton7 = (Button) findViewById(R.id.share7);
        shareButton7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openShareMenu();
            }
        });

        shareButton8 = (Button) findViewById(R.id.share8);
        shareButton8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openShareMenu();
            }
        });

//        shareButton9 = (Button) findViewById(R.id.share9);
//        shareButton9.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                openShareMenu();
//            }
//        });

        shareButton10 = (Button) findViewById(R.id.share10);
        shareButton10.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openShareMenu();
            }
        });

        shareButton11 = (Button) findViewById(R.id.share11);
        shareButton11.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openShareMenu();
            }
        });

        shareButton12 = (Button) findViewById(R.id.share12);
        shareButton12.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openShareMenu();
            }
        });

//        shareButton13 = (Button) findViewById(R.id.share13);
//        shareButton13.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                openShareMenu();
//            }
//        });
//
//        shareButton14 = (Button) findViewById(R.id.share14);
//        shareButton14.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                openShareMenu();
//            }
//        });
//
//        shareButton15 = (Button) findViewById(R.id.share15);
//        shareButton15.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                openShareMenu();
//            }
//        });
//
//        shareButton16 = (Button) findViewById(R.id.share16);
//        shareButton16.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                openShareMenu();
//            }
//        });
//
//        shareButton17 = (Button) findViewById(R.id.share17);
//        shareButton17.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                openShareMenu();
//            }
//        });
//
//        shareButton18 = (Button) findViewById(R.id.share18);
//        shareButton18.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                openShareMenu();
//            }
//        });
//
//        shareButton19 = (Button) findViewById(R.id.share19);
//        shareButton19.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                openShareMenu();
//            }
//        });
//
//        shareButton20 = (Button) findViewById(R.id.share19);
//        shareButton20.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                openShareMenu();
//            }
//        });
    }

    private void openContextMenu() {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }

    private void openContextMenu2() {
        Intent intent = new Intent(this, createProfile.class);
        startActivity(intent);
    }

    private void openCreditForm() {
        Intent intent = new Intent(this, creditCardForm.class);
        startActivity(intent);
    }

    private void openDatePick() {
        Intent intent = new Intent(this, dateRange.class);
        startActivity(intent);
    }

    private void openScrollText() {
        Intent intent = new Intent(this, scrollText.class);
        startActivity(intent);
    }

    private void openDataTable() {
        Intent intent = new Intent(this, dataTable.class);
        startActivity(intent);
    }

    private void openDaialog() {
        Intent intent = new Intent(this, dialog.class);
        startActivity(intent);
    }

    private void openFloat() {
        Intent intent = new Intent(this, floatingButton.class);
        startActivity(intent);
    }

    private void openLogout() {
        Intent intent = new Intent(this, logout.class);
        startActivity(intent);
    }

    private void openSelectChips() {
        Intent intent = new Intent(this, filterChips.class);
        startActivity(intent);
    }

    private void openPasscode() {
        Intent intent = new Intent(this, passcode.class);
        startActivity(intent);
    }

    private void openShareMenu() {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        String shareBody = "Copy to clipboard";
        String shareSub = "Your Subject here";
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(shareIntent, "Share Using"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_app_bar, menu);
        MenuItem item = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}
