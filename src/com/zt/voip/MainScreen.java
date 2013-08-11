package com.zt.voip;

import android.app.Activity;
import android.net.sip.SipManager;
import android.os.Bundle;

public class MainScreen extends Activity {

    public SipManager mSipManager;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    private void init(){

        //инициализируем сип манагер
        if(mSipManager == null) {
            mSipManager = SipManager.newInstance(this);
        }



    }

}
