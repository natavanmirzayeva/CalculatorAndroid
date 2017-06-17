package com.example.deneme.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button temizle;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,esit,toplama,carpim,bolme,cikarma;
    TextView t; //sayilarin veya sonucun goruntulendigi textview
    String a=null; //ilk degeri tutan degisken
    String b=null; //hesaplamada kullanilan degisken
    String c=null; //hesaplamanin türünü tutan degisken
    int sonuc = 0;
    int temp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3) ;
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6) ;
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9) ;
        btn0 = (Button)findViewById(R.id.btn0) ;
        esit = (Button)findViewById(R.id.btnesittir);
        toplama = (Button)findViewById(R.id.btnarti);
        cikarma = (Button)findViewById(R.id.btneksi);
        carpim = (Button)findViewById(R.id.btncarpim);
        bolme = (Button)findViewById(R.id.btnbolme);
        temizle = (Button) findViewById(R.id.btntemizle);
        t = (TextView) findViewById(R.id.denemetext);


        btn1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {

                if(a==null)
                {
                    a = btn1.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + btn1.getText().toString();
                    t.setText(a);
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {

                if(a==null)
                {
                    a = btn2.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + btn2.getText().toString();
                    t.setText(a);
                }



            }
        });
        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(a==null)
                {
                    a = btn3.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + btn3.getText().toString();
                    t.setText(a);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(a==null)
                {
                    a = btn4.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + btn4.getText().toString();
                    t.setText(a);
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(a==null)
                {
                    a = btn5.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + btn5.getText().toString();
                    t.setText(a);
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(a==null)
                {
                    a = btn6.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + btn6.getText().toString();
                    t.setText(a);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(a==null)
                {
                    a = btn7.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + btn7.getText().toString();
                    t.setText(a);
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(a==null)
                {
                    a = btn8.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + btn8.getText().toString();
                    t.setText(a);
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(a==null)
                {
                    a = btn9.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + btn9.getText().toString();
                    t.setText(a);
                }
            }
        });
        btn0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(a==null)
                {
                    a = btn0.getText().toString();
                    t.setText(a);
                }
                else
                {
                    a = a + btn0.getText().toString();
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
            public void onClick(View v) { //hesaplamanin sifirlanmasi icin kullanici temizle butonuna tiklar
                t.setText(""); //aksi halde islem kaldigi yerden devam edecegi icin sonuc dogru hesaplanmaz
                temp = 0;
                sonuc = 0;
                a = null;
                b =null;
                c = null;
                //butun degiskenler sifirlanir
            }
        });

        esit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    switch (c) {
                        case "toplama":
                            if (temp != 0) {
                                sonuc = temp + Integer.parseInt(t.getText().toString());//eger herhangi islem bir kere bile yapilmis ise eski sonuca gore hesaplama yapilir

                            } else {
                                sonuc = Integer.parseInt(b) + Integer.parseInt(t.getText().toString());
                            }

                            break;
                        case "cikarma":
                            if (temp != 0) {
                                sonuc = temp - Integer.parseInt(t.getText().toString());

                            } else {
                                sonuc = Integer.parseInt(b) - Integer.parseInt(t.getText().toString());
                            }
                            break;
                        case "carpim":
                            if (temp != 0) {
                                sonuc = temp * Integer.parseInt(t.getText().toString());

                            } else {
                                sonuc = Integer.parseInt(b) * Integer.parseInt(t.getText().toString());

                            }
                            break;
                        case "bolme":
                            if (temp != 0) {
                                sonuc = temp / Integer.parseInt(t.getText().toString());

                            } else {
                                sonuc = Integer.parseInt(b) / Integer.parseInt(t.getText().toString());
                            }
                            break;
                    }
                    }
                    catch(ArithmeticException e)
                    {
                        //kullanici ornegin 0`a bolme gibi bir hata yaparsa karsisina boyle enteresan bir uyari cikacaktir :).
                        Toast toast = Toast.makeText(getApplicationContext(),"Matematiksel hata var,farkli sayilar deneyerek devam ediniz:)",Toast.LENGTH_LONG);
                        toast.show();
                        e.printStackTrace();
                    }

                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }



                t.setText(String.valueOf(sonuc));
                temp = sonuc;//sonucun son degeri islem yapilacak gecici bir degiskene atilir ve bu temp uzerinden
                a = null;    //isleme devam edilir
                sonuc = 0;

            }
        });
    }

}
