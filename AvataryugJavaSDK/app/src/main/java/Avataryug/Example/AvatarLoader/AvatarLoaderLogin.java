package Avataryug.Example.AvatarLoader;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myjavasdkandroid.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import Avataryug.Example.QuickTest.StartScreen;

public class AvatarLoaderLogin extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar_loader_login);
        FloatingActionButton backButton = findViewById(R.id.floatingActionButton);
        backButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(AvatarLoaderLogin.this, StartScreen.class);
                startActivity(i);
                Toast.makeText(getBaseContext(), "Avatar Loader BACK", LENGTH_SHORT).show();
            }
        });

        Button LoginBtn = findViewById(R.id.loginBtn);
        LoginBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(AvatarLoaderLogin.this,AvatarYugViewer.class);
                startActivity(i);
                Toast.makeText(getBaseContext(), "Avatar Loader Login", LENGTH_SHORT).show();
            }
        });
    }
}