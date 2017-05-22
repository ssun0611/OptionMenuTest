package rlathfdl463.kr.hs.emirim.optionmenutest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super. onCreateOptionsMenu(menu);
        MenuInflater mInflater= getMenuInflater();
        mInflater.inflate(R.menu.menu1,menu); //두번째 메뉴는 위에 쓴 menu
        return true;
    }
}
