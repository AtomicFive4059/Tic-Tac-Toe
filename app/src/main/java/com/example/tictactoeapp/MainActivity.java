package com.example.tictactoeapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView txtrealScoreX;
    TextView txtrealScoreO;

    ImageView btnImg1;
    ImageView btnImg2;
    ImageView btnImg3;
    ImageView btnImg4;
    ImageView btnImg5;
    ImageView btnImg6;
    ImageView btnImg7;
    ImageView btnImg8;
    ImageView btnImg9;

    Button btnReset;

    String startGame = "X";
    int b1=5,b2=5,b3=5,b4=5,b5=5,b6=5,b7=5,b8=5,b9=5,xCount=0,oCount=0,i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

         txtrealScoreX = findViewById(R.id.realScoreX);
         txtrealScoreO = findViewById(R.id.realScoreO);

         btnImg1 = findViewById(R.id.btnImg1);
         btnImg2 = findViewById(R.id.btnImg2);
         btnImg3 = findViewById(R.id.btnImg3);
         btnImg4 = findViewById(R.id.btnImg4);
         btnImg5 = findViewById(R.id.btnImg5);
         btnImg6 = findViewById(R.id.btnImg6);
         btnImg7 = findViewById(R.id.btnImg7);
         btnImg8 = findViewById(R.id.btnImg8);
         btnImg9 = findViewById(R.id.btnImg9);


         btnReset = findViewById(R.id.btnReset);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnImg1.setImageDrawable(null);
                btnImg2.setImageDrawable(null);
                btnImg3.setImageDrawable(null);
                btnImg4.setImageDrawable(null);
                btnImg5.setImageDrawable(null);
                btnImg6.setImageDrawable(null);
                btnImg7.setImageDrawable(null);
                btnImg8.setImageDrawable(null);
                btnImg9.setImageDrawable(null);

                resetValues();

                xCount = 0;
                oCount = 0;

                txtrealScoreX.setText(String.valueOf(xCount));
                txtrealScoreO.setText(String.valueOf(oCount));
            }
        });


        btnImg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (startGame.equals("X")){
                    btnImg1.setImageResource(R.drawable.letter_x);
                    b1 = 1;
                    i++;
                }else {
                    btnImg1.setImageResource(R.drawable.letter_o);
                    b1 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();
            }
        });


        btnImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (startGame.equals("X")){
                    btnImg2.setImageResource(R.drawable.letter_x);
                    b2 = 1;
                    i++;
                }else {
                    btnImg2.setImageResource(R.drawable.letter_o);
                    b2 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();
            }
        });


        btnImg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (startGame.equals("X")){
                    btnImg3.setImageResource(R.drawable.letter_x);
                    b3 = 1;
                    i++;
                }else {
                    btnImg3.setImageResource(R.drawable.letter_o);
                    b3 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();
            }
        });

        btnImg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (startGame.equals("X")){
                    btnImg4.setImageResource(R.drawable.letter_x);
                    b4 = 1;
                    i++;
                }else {
                    btnImg4.setImageResource(R.drawable.letter_o);
                    b4 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();
            }
        });

        btnImg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (startGame.equals("X")){
                    btnImg5.setImageResource(R.drawable.letter_x);
                    b5 = 1;
                    i++;
                }else {
                    btnImg5.setImageResource(R.drawable.letter_o);
                    b5 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();
            }
        });


        btnImg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (startGame.equals("X")){
                    btnImg6.setImageResource(R.drawable.letter_x);
                    b6 = 1;
                    i++;
                }else {
                    btnImg6.setImageResource(R.drawable.letter_o);
                    b6 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();
            }
        });


        btnImg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (startGame.equals("X")){
                    btnImg7.setImageResource(R.drawable.letter_x);
                    b7 = 1;
                    i++;
                }else {
                    btnImg7.setImageResource(R.drawable.letter_o);
                    b7 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();
            }
        });


        btnImg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (startGame.equals("X")){
                    btnImg8.setImageResource(R.drawable.letter_x);
                    b8 = 1;
                    i++;
                }else {
                    btnImg8.setImageResource(R.drawable.letter_o);
                    b8 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();
            }
        });


        btnImg9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (startGame.equals("X")){
                    btnImg9.setImageResource(R.drawable.letter_x);
                    b9 = 1;
                    i++;
                }else {
                    btnImg9.setImageResource(R.drawable.letter_o);
                    b9 = 0;
                    i++;
                }

                choosePlayer();
                winningGame();
            }
        });

    }


    private void winningGame() {

        if((b1== 1) && (b2 == 1) && (b3 == 1)){

            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player X Is Win ")
                    .setTitle("Congratulation......!!")
                    .setIcon(R.drawable.letter_x)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    })
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            xCount++;
            txtrealScoreX.setText(String.valueOf(xCount));
        }


       else if((b4== 1) && (b5 == 1) && (b6 == 1)){


            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player X Is Win ")
                    .setTitle("Congratulation......!!")
                    .setIcon(R.drawable.letter_x)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    })
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            xCount++;
            txtrealScoreX.setText(String.valueOf(xCount));

        } else if((b7== 1) && (b8 == 1) && (b9 == 1)){


            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player X Is Win ")
                    .setTitle("Congratulation......!!")
                    .setIcon(R.drawable.letter_x)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    })
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            xCount++;
            txtrealScoreX.setText(String.valueOf(xCount));
        }

        else if((b1== 1) && (b4 == 1) && (b7 == 1)){


            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player X Is Win ")
                    .setTitle("Congratulation......!!")
                    .setIcon(R.drawable.letter_x)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    })
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            xCount++;
            txtrealScoreX.setText(String.valueOf(xCount));
        }

        else if((b2 == 1) && (b5 == 1) && (b8 == 1)){


            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player X Is Win ")
                    .setTitle("Congratulation......!!")
                    .setIcon(R.drawable.letter_x)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    })
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            xCount++;
            txtrealScoreX.setText(String.valueOf(xCount));
        }

        else if((b3 == 1) && (b6 == 1) && (b9 == 1)){


            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player X Is Win ")
                    .setTitle("Congratulation......!!")
                    .setIcon(R.drawable.letter_x)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    })
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            xCount++;
            txtrealScoreX.setText(String.valueOf(xCount));
        }

       else if((b1 == 1) && (b5 == 1) && (b9 == 1)){


            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player X Is Win ")
                    .setTitle("Congratulation......!!")
                    .setIcon(R.drawable.letter_x)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    })
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            xCount++;
            txtrealScoreX.setText(String.valueOf(xCount));
        }

      else if((b3 == 1) && (b5 == 1) && (b7 == 1)){


            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player X Is Win ")
                    .setTitle("Congratulation......!!")
                    .setIcon(R.drawable.letter_x)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    })
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            xCount++;
            txtrealScoreX.setText(String.valueOf(xCount));
        }

      else if ((b1 == 0) && (b2 == 0) && (b3 == 0)) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Is Win ")
                    .setTitle("Congratulation......!!")
                    .setIcon(R.drawable.letter_o)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    })
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            oCount++;
            txtrealScoreO.setText(String.valueOf(oCount));

        }

        else if ((b4 == 0) && (b5 == 0) && (b6 == 0)){

            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player O Is Win ")
                    .setTitle("Congratulation......!!")
                    .setIcon(R.drawable.letter_o)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    })
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            oCount++;
            txtrealScoreO.setText(String.valueOf(oCount));

        }

        else if ((b7 == 0) && (b8 == 0) && (b9 == 0)){

            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player O Is Win ")
                    .setTitle("Congratulation......!!")
                    .setIcon(R.drawable.letter_o)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    })
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            oCount++;
            txtrealScoreO.setText(String.valueOf(oCount));

        }

        else if ((b1 == 0) && (b4 == 0) && (b7 == 0)){

            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player O Is Win ")
                    .setTitle("Congratulation......!!")
                    .setIcon(R.drawable.letter_o)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    })
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            oCount++;
            txtrealScoreO.setText(String.valueOf(oCount));

        }

        else if ((b2 == 0) && (b5 == 0) && (b8 == 0)){

            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player O Is Win ")
                    .setTitle("Congratulation......!!")
                    .setIcon(R.drawable.letter_o)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    })
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            oCount++;
            txtrealScoreO.setText(String.valueOf(oCount));

        }

        else if ((b3 == 0) && (b6 == 0) && (b9 == 0)){

            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player O Is Win ")
                    .setTitle("Congratulation......!!")
                    .setIcon(R.drawable.letter_o)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    })
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            oCount++;
            txtrealScoreO.setText(String.valueOf(oCount));

        }

        else if ((b1 == 0) && (b5 == 0) && (b9 == 0)){

            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player O Is Win ")
                    .setTitle("Congratulation......!!")
                    .setIcon(R.drawable.letter_o)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    })
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            oCount++;
            txtrealScoreO.setText(String.valueOf(oCount));

        }

        else if ((b3 == 0) && (b5 == 0) && (b7 == 0)){

            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player O Is Win ")
                    .setTitle("Congratulation......!!")
                    .setIcon(R.drawable.letter_o)

                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    })
                    .setPositiveButton("One More Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            btnImg1.setImageDrawable(null);
                            btnImg2.setImageDrawable(null);
                            btnImg3.setImageDrawable(null);
                            btnImg4.setImageDrawable(null);
                            btnImg5.setImageDrawable(null);
                            btnImg6.setImageDrawable(null);
                            btnImg7.setImageDrawable(null);
                            btnImg8.setImageDrawable(null);
                            btnImg9.setImageDrawable(null);

                            resetValues();
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            oCount++;
            txtrealScoreO.setText(String.valueOf(oCount));

        }else {

            if (i == 9){

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Match Tie")
                        .setIcon(R.drawable.see_you)
                        .setMessage("Hard Fight Haan.......!!")

                        .setNegativeButton("Let's Again", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                btnImg1.setImageDrawable(null);
                                btnImg2.setImageDrawable(null);
                                btnImg3.setImageDrawable(null);
                                btnImg4.setImageDrawable(null);
                                btnImg5.setImageDrawable(null);
                                btnImg6.setImageDrawable(null);
                                btnImg7.setImageDrawable(null);
                                btnImg8.setImageDrawable(null);
                                btnImg9.setImageDrawable(null);

                                resetValues();
                            }
                        })
                        .setPositiveButton("Surrender Myself", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

//                                btnImg1.setImageDrawable(null);
//                                btnImg2.setImageDrawable(null);
//                                btnImg3.setImageDrawable(null);
//                                btnImg4.setImageDrawable(null);
//                                btnImg5.setImageDrawable(null);
//                                btnImg6.setImageDrawable(null);
//                                btnImg7.setImageDrawable(null);
//                                btnImg8.setImageDrawable(null);
//                                btnImg9.setImageDrawable(null);
//
//                                resetValues();

                                finish();
                            }
                        });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        }

    }


    private void choosePlayer() {

        if (startGame.equals("X")){
            startGame = "O";
        }else {
            startGame = "X";
        }

    }


    private void resetValues() {

        b1 = 5;
        b2 = 5;
        b3 = 5;
        b4 = 5;
        b5 = 5;
        b6 = 5;
        b7 = 5;
        b8 = 5;
        b9 = 5;
        i = 0;
    }
}