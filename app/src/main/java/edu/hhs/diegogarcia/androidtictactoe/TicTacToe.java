package edu.hhs.diegogarcia.androidtictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TicTacToe extends AppCompatActivity implements View.OnClickListener {
    private TicTacToeGame mGame;
    // Buttons making up the board
    private Button mBoardButtons[];
    // Various text displayed
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        mBoardButtons[0] = (Button) findViewById(R.id.one);
        mBoardButtons[1] = (Button) findViewById(R.id.two);
        mBoardButtons[2] = (Button) findViewById(R.id.three);
        mBoardButtons[3] = (Button) findViewById(R.id.four);
        mBoardButtons[4] = (Button) findViewById(R.id.five);
        mBoardButtons[5] = (Button) findViewById(R.id.six);
        mBoardButtons[6] = (Button) findViewById(R.id.seven);
        mBoardButtons[7] = (Button) findViewById(R.id.eight);
        mBoardButtons[8] = (Button) findViewById(R.id.nine);
        mInfoTextView = (TextView) findViewById(R.id.information);
        mGame = new TicTacToeGame();
        startNewGame();
    }
    public void startNewGame()
    {
        mGame.clearBoard();
        for(Button i : mBoardButtons)
        {
            i.setText("");
            i.setEnabled(true);
            i.setOnClickListener(this);
            mInfoTextView.setText("You go first.");
        }
    }
    private void setMove(char player, int location) {

        mGame.setMove(player, location);
        mBoardButtons[location].setEnabled(false);
        mBoardButtons[location].setText(String.valueOf(player));
        if (player == TicTacToeGame.HUMAN_PLAYER)
            mBoardButtons[location].setTextColor(Color.rgb(0, 200, 0));
        else
            mBoardButtons[location].setTextColor(Color.rgb(200, 0, 0));
    }

    @Override
    public void onClick(View view)
    {

        switch(view.getId())
        {
            case R.id.one:
                if(mBoardButtons[0].isEnabled()){
                    mGame.setMove();
                    mGame.checkForWinner();
                }break;

            case R.id.two:
                if(mBoardButtons[0].isEnabled()){
                    mGame.setMove();
                    mGame.checkForWinner();
                }break;

            case R.id.three:
                if(mBoardButtons[0].isEnabled()){
                    mGame.setMove();
                    mGame.checkForWinner();
                }break;

            case R.id.four:
                if(mBoardButtons[0].isEnabled()){
                    mGame.setMove();
                    mGame.checkForWinner();
                }break;

            case R.id.five:
                if(mBoardButtons[0].isEnabled()){
                    mGame.setMove();
                    mGame.checkForWinner();
                }break;

            case R.id.six:
                if(mBoardButtons[0].isEnabled()){
                    mGame.setMove();
                    mGame.checkForWinner();
                }break;

            case R.id.seven:
                if(mBoardButtons[0].isEnabled()){
                    mGame.setMove();
                    mGame.checkForWinner();
                }break;

            case R.id.eight:
                if(mBoardButtons[0].isEnabled()){
                    mGame.setMove();
                    mGame.checkForWinner();
                }break;
        }

    }
}
