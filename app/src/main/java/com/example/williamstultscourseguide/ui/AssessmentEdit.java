package com.example.williamstultscourseguide.ui;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.williamstultscourseguide.R;

public class AssessmentEdit extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment_edit);

        mTextView = (TextView) findViewById(R.id.text);

        // Enables Always-on
        //setAmbientEnabled();
    }
}