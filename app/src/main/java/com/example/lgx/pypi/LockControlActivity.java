package com.example.lgx.pypi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LockControlActivity extends Fragment
{
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState )
    {
        View view = inflater.inflate( R.layout.fragment_lockcontrol, null );

        /*

        Button changePasswdBtn = (Button) findViewById(R.id.changePasswdButton) ;
        changePasswdBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event
                // 비밀번호 설정 액티비티로 이동
                Intent lockintent = new Intent( LockControlActivity.this, PasswordSetting.class );
                startActivity( lockintent );
            }
        });

        */
        //생성된 View 객체를 리턴
        return view;
    }
}
