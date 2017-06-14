package com.example.deneme.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button temizle;
    Button deneme,deneme2,deneme3,deneme4,deneme5,deneme6,deneme7,deneme8,deneme9,deneme0,esit,toplama,carpim,bolme,cikarma;
    TextView t;
    String a=null;
    String b=null;
    String c=null;
    int sonuc = 0;
    int f = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        deneme = (Button)findViewById(R.id.deneme);
        deneme2 = (Button)findViewById(R.id.deneme2);
        deneme3 = (Button)findViewById(R.id.deneme3) ;
        deneme4 = (Button)findViewById(R.id.deneme4);
        deneme5 = (Button)findViewById(R.id.deneme5);
        deneme6 = (Button)findViewById(R.id.deneme6) ;
        deneme7 = (Button)findViewById(R.id.deneme7);
        deneme8 = (Button)findViewById(R.id.deneme8);
        deneme9 = (Button)findViewById(R.id.deneme9) ;
        deneme0 = (Button)findViewById(R.id.deneme0) ;
        esit = (Button)findViewById(R.id.denemeesittir);
        toplama = (Button)findViewById(R.id.denemearti);
        cikarma = (Button)findViewById(R.id.denemeeksi);
        carpim = (Button)findViewById(R.id.denemecarpim);
        bolme = (Button)findViewById(R.id.denemebolme);
        temizle = (Button) findViewById(R.id.denemetemizle);
        t = (TextView) findViewById(R.id.denemetext);
        deneme.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {

                if(a==null)
                {
                    a = deneme.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + deneme.getText().toString();
                    t.setText(a);
                }

            }
        });
        deneme2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {

                if(a==null)
                {
                    a = deneme2.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + deneme2.getText().toString();
                    t.setText(a);
                }



            }
        });
        deneme3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(a==null)
                {
                    a = deneme3.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + deneme3.getText().toString();
                    t.setText(a);
                }
            }
        });
        deneme4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(a==null)
                {
                    a = deneme4.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + deneme4.getText().toString();
                    t.setText(a);
                }
            }
        });
        deneme5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(a==null)
                {
                    a = deneme5.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + deneme5.getText().toString();
                    t.setText(a);
                }
            }
        });
        deneme6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(a==null)
                {
                    a = deneme6.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + deneme6.getText().toString();
                    t.setText(a);
                }
            }
        });
        deneme7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(a==null)
                {
                    a = deneme7.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + deneme7.getText().toString();
                    t.setText(a);
                }
            }
        });
        deneme8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(a==null)
                {
                    a = deneme8.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + deneme8.getText().toString();
                    t.setText(a);
                }
            }
        });
        deneme9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(a==null)
                {
                    a = deneme9.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + deneme9.getText().toString();
                    t.setText(a);
                }
            }
        });
        deneme0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(a==null)
                {
                    a = deneme0.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + deneme0.getText().toString();
                    t.setText(a);
                }
            }
        });




        toplama.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                b = a;
                a= null;
                t.setText("");
                c = "toplama";

            }
        });
        cikarma.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                b = a;
                a= null;
                t.setText("");
                c = "cikarma";

            }
        });
        bolme.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                b = a;
                t.setText("");
                a= null;
                c = "bolme";

            }
        });
        carpim.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                b = a;
                t.setText("");
                a= null;
                c = "carpim";

            }
        });

        temizle.setOnClickListener(new View.OnClickListener(

        ) {
            @Override
            public void onClick(View v) {
                t.setText("");
                f = 0;
                sonuc = 0;
                a = null;
                b =null;
                c = null;
            }
        });
        esit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(c)
                {
                    case "toplama":
                        if(f!=0)
                        {
                            sonuc = f + Integer.parseInt(t.getText().toString());

                        }
                        else
                        {
                            sonuc = Integer.parseInt(b) + Integer.parseInt(t.getText().toString());
                        }

                        break;
                    case "cikarma":
                        if(f!=0)
                        {
                            sonuc = f - Integer.parseInt(t.getText().toString());

                        }
                        else
                        {
                            sonuc = Integer.parseInt(b)-Integer.parseInt(t.getText().toString());
                        }
                        break;
                    case "carpim":
                        if(f!=0)
                        {
                            sonuc = f*Integer.parseInt(t.getText().toString());

                        }
                        else{
                            sonuc = Integer.parseInt(b)*Integer.parseInt(t.getText().toString());

                        }
                        break;
                    case "bolme":
                        if(f!=0)
                        {
                            sonuc = f/Integer.parseInt(t.getText().toString());

                        }
                        else{
                            sonuc = Integer.parseInt(b)/Integer.parseInt(t.getText().toString());
                        }
                        break;
                }


                t.setText(String.valueOf(sonuc));
                f = sonuc;
                a = null;
                sonuc = 0;

            }
        });
    }


}
