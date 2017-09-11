package uio.androidbootcamp.activitiessaveandrestorestate;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private int firstTeamCounter;
    private int secondTeamCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            firstTeamCounter = savedInstanceState.getInt("firstTeamCounter");
            secondTeamCounter = savedInstanceState.getInt("secondTeamCounter");
        }

        Button firstTeamButton = findViewById(R.id.button_first_team);
        firstTeamButton.setText(String.valueOf(firstTeamCounter));
        Button secondTeamButton = findViewById(R.id.button_second_team);
        secondTeamButton.setText(String.valueOf(secondTeamCounter));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("firstTeamCounter", firstTeamCounter);
        outState.putInt("secondTeamCounter", secondTeamCounter);
        super.onSaveInstanceState(outState);
    }

    public void firstTeamIncrement(View view) {
        firstTeamCounter++;
        Button firstTeamButton = findViewById(R.id.button_first_team);
        firstTeamButton.setText(String.valueOf(firstTeamCounter));
    }

    public void secondTeamIncrement(View view) {
        secondTeamCounter++;
        Button secondTeamButton = findViewById(R.id.button_second_team);
        secondTeamButton.setText(String.valueOf(secondTeamCounter));
    }
}
