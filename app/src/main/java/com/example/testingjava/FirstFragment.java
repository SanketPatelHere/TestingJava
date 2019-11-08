package com.example.testingjava;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class FirstFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //View v = LayoutInflater.from(container).inflate(R.layout.a), parent, false;
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
}
