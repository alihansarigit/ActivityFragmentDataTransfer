package com.example.mbura.kodluyoruz30_07;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Activity Fragment arası veri taşıma uygulaması
 * 30-07-2017 Kodluyoruz.org  Kur 201 Hafta 4
 */
public class MainActivity extends AppCompatActivity implements MenuListFragment.OnFragmentInteractionListener {

    private TextView txt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.txt);
    }

    /**
     * Fragment ta tanımladığımız interface i kullanarak veriyi alacağımız ve bu veriyi kullanacağımız
     * yer burası olduğu için OnFragmentInteractionListener ı imlemente ederek
     * onFragmentInteraction metodunu kullanabilmek için gerekli olan ortamı hazırladık.
     *
     * Aldığımız name parametresi bizim fragment tan gelen verimizi String türünde tutmakta.
     * biz bu parametreyi istediğimiz şekilde bu metodun içinde kullanabiliriz.
     * @param name
     */

    @Override
    public void onFragmentInteraction(String name) {
        txt.setText(name);
    }
}
