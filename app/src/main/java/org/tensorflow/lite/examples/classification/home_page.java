package org.tensorflow.lite.examples.classification;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;


public class home_page extends AppCompatActivity implements OnClickListener {

    private ImageButton captureButton, uploadButton, exploreButton, homeButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        captureButton = findViewById(R.id.captureButton);
        uploadButton = findViewById(R.id.uploadButton);
        exploreButton = findViewById(R.id.exploreButton);
        homeButton = findViewById(R.id.homeButton);

        //launchCamera(); //put this ont method of on click literners when the show camera button click
    }

    private void launchCamera() {
        startActivity(new Intent(this, ClassifierActivity.class));
    }

    private void launchGallery() {
        //TODO: show Gallery
    }

    @Override
    public void onClick(View view) {
    switch (view.getId()){
        case R.id.captureButton:
            Toast.makeText(this,"captureButton",Toast.LENGTH_SHORT).show();
                break;
        case R.id.uploadButton:
            Toast.makeText(this,"uploadButton",Toast.LENGTH_SHORT).show();
            break;
        case R.id.exploreButton:
            Toast.makeText(this,"exploreButton",Toast.LENGTH_SHORT).show();
            break;
        case R.id.homeButton:
            Toast.makeText(this,"homeButton",Toast.LENGTH_SHORT).show();
            break;
        default:
                break;

    }
    }

    @Override
    protected void onResume() {
        super.onResume();
        captureButton.setOnClickListener(this);
        uploadButton.setOnClickListener(this);
        exploreButton.setOnClickListener(this);
        homeButton.setOnClickListener(this);

    }

    @Override
    protected void onPause() {
        super.onPause();
        captureButton.setOnClickListener(null);
        uploadButton.setOnClickListener(null);
        exploreButton.setOnClickListener(null);
        homeButton.setOnClickListener(null);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
