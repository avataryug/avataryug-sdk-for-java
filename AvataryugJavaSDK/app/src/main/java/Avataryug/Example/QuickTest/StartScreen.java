package Avataryug.Example.QuickTest;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import Avataryug.Example.AvatarLoader.AvatarLoaderLogin;

import com.example.myjavasdkandroid.R;

public class StartScreen extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        Button QuickTestBtn = findViewById(R.id.QuickTestBtn);
        QuickTestBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "Quick Test", LENGTH_SHORT).show();
                Intent i = new Intent(StartScreen.this,MainActivity.class);
                startActivity(i);
            }
        });

        Button AvataLoaderBtn = findViewById(R.id.AvataLoaderBtn);
        AvataLoaderBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(StartScreen.this, AvatarLoaderLogin.class);
                startActivity(i);
                Toast.makeText(getBaseContext(), "Avatar Loader", LENGTH_SHORT).show();
            }
        });
    }
}