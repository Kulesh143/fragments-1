package com.main.myproject.may29_b;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {
    @Override
    public void onAttach(Context context) {
        System.out.println("Fragment Attach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        System.out.println("Fragment Create");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        System.out.println("Fragment Create View");
        View view = inflater.inflate(R.layout.fragment1_layout,container);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        System.out.println("Fragment Activity Created");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onResume() {
        System.out.println("Fragment Resume");
        super.onResume();
    }

    @Override
    public void onPause() {
        System.out.println("Fragment Pause");
        super.onPause();
    }

    @Override
    public void onDestroy() {
        System.out.println("Fragment Destroy");
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        System.out.println("Fragment Destroy View");
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        System.out.println("Fragment Detach");
        super.onDetach();
    }
}
