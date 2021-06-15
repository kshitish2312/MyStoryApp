package com.example.mystoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity3 extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        pdfView=findViewById(R.id.pdf1);
        int story_position=getIntent().getIntExtra("key_position",0);
        if(story_position==0)
        {
            pdfView.fromAsset("Anoldmanlivedinthevillage.pdf").load();

        }
        if(story_position==1)
        {
            pdfView.fromAsset("Thewiseman.pdf").load();

        }
        if(story_position==2)
        {
            pdfView.fromAsset("Thefoolishdonkey.pdf").load();

        }
        if(story_position==3)
        {
            pdfView.fromAsset("Theletter.pdf").load();

        }

        if(story_position==4)
        {
            pdfView.fromAsset("Bestseller.pdf").load();

        }
        if(story_position==5)
        {
            pdfView.fromAsset("Thetortoiseandrabbit.pdf").load();

        }
        if(story_position==6)
        {
            pdfView.fromAsset("Themonkeyandthecrocodile.pdf").load();

        }
        if(story_position==7)
        {
            pdfView.fromAsset("VikramandBetal.pdf").load();

        }
        if(story_position==8)
        {
            pdfView.fromAsset("Birbalskichdi.pdf").load();

        }
        if(story_position==9)
        {
            pdfView.fromAsset("Thepotofwit.pdf").load();

        }
        if(story_position==10)
        {
            pdfView.fromAsset("Thehensofroaster.pdf").load();

        }
        if(story_position==11)
        {
            pdfView.fromAsset("goldcoinsandjustice.pdf").load();

        }
        if(story_position==12)
        {
            pdfView.fromAsset("Whosmangotreeisit.pdf").load();

        }
        if(story_position==13)
        {
            pdfView.fromAsset("Thetamingoftheshrew.pdf").load();

        }
        if(story_position==14)
        {
            pdfView.fromAsset("Themerchantofvenice.pdf").load();

        }





    }
}