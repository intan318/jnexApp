package com.juvenileexecutive.jnexapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.juvenileexecutive.jnexapp.R;

public class AccountFragment extends Fragment {

    private View AccountView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AccountView = inflater.inflate(R.layout.fragment_account, container, false);
        return AccountView;
    }
}
