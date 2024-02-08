package Avataryug.Example.AvatarLoader;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myjavasdkandroid.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AvatarYugViewer extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar_yug_viewer);

        FloatingActionButton backButton = findViewById(R.id.floatingActionButton3);
        backButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(AvatarYugViewer.this,AvatarLoaderLogin.class);
                startActivity(i);
                Toast.makeText(getBaseContext(), "Avatar Loader BACK", LENGTH_SHORT).show();
            }
        });
    }
}