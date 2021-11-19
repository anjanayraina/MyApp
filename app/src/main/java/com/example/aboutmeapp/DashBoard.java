package com.example.aboutmeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class DashBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        ImageView pdfViewer =findViewById(R.id.button);
        pdfViewer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try{
                 //   Log.e("Tag", "This is onClick message " );
                    Intent i= new Intent(DashBoard.this, PDFReaderActivity.class);

                    startActivity(i);
                }

                catch(Exception exp)
                {
                    Log.e("newTag", "Intent cant be handeled");
                }



            }
        });



    }
}