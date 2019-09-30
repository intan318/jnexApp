package com.juvenileexecutive.jnexapp;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.juvenileexecutive.jnexapp.fragment.AccountFragment;
import com.juvenileexecutive.jnexapp.fragment.CategoryFragment;
import com.juvenileexecutive.jnexapp.fragment.HomeFragment;
import com.juvenileexecutive.jnexapp.fragment.MemberFragment;
import com.juvenileexecutive.jnexapp.fragment.SearchFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav;
        final HomeFragment homeFragment;
        final CategoryFragment categoryFragment;
        final MemberFragment memberFragment;
        final AccountFragment accountFragment;
        final SearchFragment searchFragment;

        bottomNav = findViewById(R.id.bottomNav);
        homeFragment = new HomeFragment();
        categoryFragment = new CategoryFragment();
        memberFragment = new MemberFragment();
        accountFragment = new AccountFragment();
        searchFragment = new SearchFragment();

        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.btnHome:
                        setFragment(homeFragment);
                        break;

                    case R.id.btnCategory:
                        setFragment(categoryFragment);
                        break;

                    case R.id.btnSearch:
                        setFragment(searchFragment);
                        break;
                    case R.id.btnMember:
                        setFragment(memberFragment);
                        break;

                    case R.id.btnMenu:
                        setFragment(accountFragment);
                        break;
                }

                return true;
            }
        });
        bottomNav.setSelectedItemId(R.id.btnHome);
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }
}
