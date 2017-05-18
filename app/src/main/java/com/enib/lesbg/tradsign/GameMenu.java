package com.enib.lesbg.tradsign;

import android.app.Activity;
import android.os.Bundle;

import android.app.Dialog;
import android.widget.Button;



public class GameMenu extends Activity {

    private Button bouton;
    private final static int ID_NORMAL_DIALOG = 0;
    private final static int ID_ENERVEE_DIALOG = 1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_menu);
    }

}

// on va creer une boite de dialogue afin d'afficher FAUX ou VRAI selon la réponse !