package com.juvenileexecutive.jnexapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.juvenileexecutive.jnexapp.fragment.AccountFragment;
import com.juvenileexecutive.jnexapp.fragment.CartFragment;
import com.juvenileexecutive.jnexapp.fragment.CategoryFragment;
import com.juvenileexecutive.jnexapp.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav;
        final HomeFragment homeFragment;
        final CategoryFragment categoryFragment;
        final CartFragment cartFragment;
        final AccountFragment accountFragment;

        bottomNav = findViewById(R.id.bottomNav);
        homeFragment = new HomeFragment();
        categoryFragment = new CategoryFragment();
        cartFragment = new CartFragment();
        accountFragment = new AccountFragment();

        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.btnHome:
                        setFragment(homeFragment);
                        break;

                    case R.id.btnCategory:
                        setFragment(categoryFragment);
                        break;

                    case R.id.btnCart:
                        setFragment(cartFragment);
                        break;

                    case R.id.btnAccount:
                        setFragment(accountFragment);
                        break;
                }

                return true;
            }
        });
        bottomNav.setSelectedItemId(R.id.btnHome);
    }

    private void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }
}
