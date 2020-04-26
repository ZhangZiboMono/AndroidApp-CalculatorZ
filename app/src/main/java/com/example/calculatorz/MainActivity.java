package com.example.calculatorz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private boolean isOpPressed = false;
    private boolean isEqPressed = false;
    private double firstNumber = 0;
    private int secondNumberIndex = 0;
    private char currentOp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);
        final TextView calculatorScreen = findViewById(R.id.calculatorScreen);
        final Button n0 = findViewById(R.id.n0);
        final Button n1 = findViewById(R.id.n1);
        final Button n2 = findViewById(R.id.n2);
        final Button n3 = findViewById(R.id.n3);
        final Button n4 = findViewById(R.id.n4);
        final Button n5 = findViewById(R.id.n5);
        final Button n6 = findViewById(R.id.n6);
        final Button n7 = findViewById(R.id.n7);
        final Button n8 = findViewById(R.id.n8);
        final Button n9 = findViewById(R.id.n9);
        final Button dot = findViewById(R.id.dot);
        final Button equal = findViewById(R.id.equal);
        final Button addition = findViewById(R.id.addition);
        final Button subtraction = findViewById(R.id.subtraction);
        final Button multiplication = findViewById(R.id.multiplication);
        final Button division = findViewById(R.id.division);

        final View.OnClickListener calculatorListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final int id = v.getId();
                switch (id) {
                    case R.id.n0:
                        vibrateButton(30);
                        String screenContent = calculatorScreen.getText().toString();
                        String lastString;
                        if (!screenContent.equals("")) {
                            if (isEqPressed && !screenContent.contains("+") && !screenContent.contains("﹣") && !screenContent.contains("×") && !screenContent.contains("÷")) {
                                calculatorScreen.setText("");
                                isEqPressed = false;
                            }
                            calculatorScreen.append("0");
                            break;
                        }
                        calculatorScreen.append("0");
                        break;
                    case R.id.n1:
                        vibrateButton(30);
                        screenContent = calculatorScreen.getText().toString();
                        if (!screenContent.equals("")) {
                            if (isEqPressed && !screenContent.contains("+") && !screenContent.contains("﹣") && !screenContent.contains("×") && !screenContent.contains("÷")) {
                                calculatorScreen.setText("");
                                isEqPressed = false;
                            }
                            calculatorScreen.append("1");
                            break;
                        }
                        calculatorScreen.append("1");
                        break;
                    case R.id.n2:
                        vibrateButton(30);
                        screenContent = calculatorScreen.getText().toString();
                        if (!screenContent.equals("")) {
                            if (isEqPressed && !screenContent.contains("+") && !screenContent.contains("﹣") && !screenContent.contains("×") && !screenContent.contains("÷")) {
                                calculatorScreen.setText("");
                                isEqPressed = false;
                            }
                            calculatorScreen.append("2");
                            break;
                        }
                        calculatorScreen.append("2");
                        break;
                    case R.id.n3:
                        vibrateButton(30);
                        screenContent = calculatorScreen.getText().toString();
                        if (!screenContent.equals("")) {
                            if (isEqPressed && !screenContent.contains("+") && !screenContent.contains("﹣") && !screenContent.contains("×") && !screenContent.contains("÷")) {
                                calculatorScreen.setText("");
                                isEqPressed = false;
                            }
                            calculatorScreen.append("3");
                            break;
                        }
                        calculatorScreen.append("3");
                        break;
                    case R.id.n4:
                        vibrateButton(30);
                        screenContent = calculatorScreen.getText().toString();
                        if (!screenContent.equals("")) {
                            if (isEqPressed && !screenContent.contains("+") && !screenContent.contains("﹣") && !screenContent.contains("×") && !screenContent.contains("÷")) {
                                calculatorScreen.setText("");
                                isEqPressed = false;
                            }
                            calculatorScreen.append("4");
                            break;
                        }
                        calculatorScreen.append("4");
                        break;
                    case R.id.n5:
                        vibrateButton(30);
                        screenContent = calculatorScreen.getText().toString();
                        if (!screenContent.equals("")) {
                            if (isEqPressed && !screenContent.contains("+") && !screenContent.contains("﹣") && !screenContent.contains("×") && !screenContent.contains("÷")) {
                                calculatorScreen.setText("");
                                isEqPressed = false;
                            }
                            calculatorScreen.append("5");
                            break;
                        }
                        calculatorScreen.append("5");
                        break;
                    case R.id.n6:
                        vibrateButton(30);
                        screenContent = calculatorScreen.getText().toString();
                        if (!screenContent.equals("")) {
                            if (isEqPressed && !screenContent.contains("+") && !screenContent.contains("﹣") && !screenContent.contains("×") && !screenContent.contains("÷")) {
                                calculatorScreen.setText("");
                                isEqPressed = false;
                            }
                            calculatorScreen.append("6");
                            break;
                        }
                        calculatorScreen.append("6");
                        break;
                    case R.id.n7:
                        vibrateButton(30);
                        screenContent = calculatorScreen.getText().toString();
                        if (!screenContent.equals("")) {
                            if (isEqPressed && !screenContent.contains("+") && !screenContent.contains("﹣") && !screenContent.contains("×") && !screenContent.contains("÷")) {
                                calculatorScreen.setText("");
                                isEqPressed = false;
                            }
                            calculatorScreen.append("7");
                            break;
                        }
                        calculatorScreen.append("7");
                        break;
                    case R.id.n8:
                        vibrateButton(30);
                        screenContent = calculatorScreen.getText().toString();
                        if (!screenContent.equals("")) {
                            if (isEqPressed && !screenContent.contains("+") && !screenContent.contains("﹣") && !screenContent.contains("×") && !screenContent.contains("÷")) {
                                calculatorScreen.setText("");
                                isEqPressed = false;
                            }
                            calculatorScreen.append("8");
                            break;
                        }
                        calculatorScreen.append("8");
                        break;
                    case R.id.n9:
                        vibrateButton(30);
                        screenContent = calculatorScreen.getText().toString();
                        if (!screenContent.equals("")) {
                            if (isEqPressed && !screenContent.contains("+") && !screenContent.contains("﹣") && !screenContent.contains("×") && !screenContent.contains("÷")) {
                                calculatorScreen.setText("");
                                isEqPressed = false;
                            }
                            calculatorScreen.append("9");
                            break;
                        }
                        calculatorScreen.append("9");
                        break;
                    case R.id.dot:
                        vibrateButton(30);
                        screenContent = calculatorScreen.getText().toString();
                        if (!screenContent.equals("")) {
                            lastString = screenContent.substring(screenContent.length()-1);
                            boolean resDot = screenContent.contains(".");
                            if (!isEqPressed && screenContent.contains(".") && !screenContent.contains("+") && !screenContent.contains("﹣") && !screenContent.contains("×") && !screenContent.contains("÷")) {
                                break;
                            }
                            if (screenContent.contains("+") || screenContent.contains("﹣") || screenContent.contains("×") || screenContent.contains("÷")) {
                                if (screenContent.substring(secondNumberIndex-1,screenContent.length()).contains(".")) {
                                    break;
                                }
                            }
                            if (isEqPressed && !screenContent.contains("+") && !screenContent.contains("﹣") && !screenContent.contains("×") && !screenContent.contains("÷")) {
                                calculatorScreen.setText("");
                                isEqPressed = false;
                                calculatorScreen.append("0.");
                                break;
                            }
                            if (lastString.equals("+") || lastString.equals("﹣") || lastString.equals("×") || lastString.equals("÷")) {
                                calculatorScreen.append("0.");
                                break;
                            }
                            calculatorScreen.append(".");
                            break;
                        }
                        calculatorScreen.append("0.");
                        break;

                    case R.id.equal:
                        vibrateButton(50);
                        screenContent = calculatorScreen.getText().toString();
                        if (!screenContent.equals("")) {
                            lastString = screenContent.substring(screenContent.length()-1);
                            if (isOpPressed && !lastString.equals("+") && !lastString.equals("﹣") && !lastString.equals("÷") && !lastString.equals("×")) {
                                if (currentOp == '+') {
                                    String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                    double secondNumber = Double.parseDouble(secondNumberString);
                                    double res = firstNumber + secondNumber;
                                    calculatorScreen.setText(String.valueOf(res));
                                }
                                if (currentOp == '-') {
                                    String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                    double secondNumber = Double.parseDouble(secondNumberString);
                                    double res = firstNumber - secondNumber;
                                    calculatorScreen.setText(String.valueOf(res));
                                }
                                if (currentOp == '*') {
                                    String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                    double secondNumber = Double.parseDouble(secondNumberString);
                                    double res = firstNumber * secondNumber;
                                    calculatorScreen.setText(String.valueOf(res));
                                }
                                if (currentOp == '/') {
                                    String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                    double secondNumber = Double.parseDouble(secondNumberString);
                                    double res = firstNumber / secondNumber;
                                    calculatorScreen.setText(String.valueOf(res));
                                }
                                isEqPressed = true;
                                isOpPressed = false;
                            }
                            break;
                        }
                        break;
                    case R.id.addition:
                        vibrateButton(50);
                        screenContent = calculatorScreen.getText().toString();
                        if (!screenContent.equals("")) {
                            lastString = screenContent.substring(screenContent.length()-1);
                            if (screenContent.contains("+") || screenContent.contains("﹣") || screenContent.contains("×") || screenContent.contains("÷")) {
                                if (!lastString.equals("+") && !lastString.equals("﹣") && !lastString.equals("÷") && !lastString.equals("×")) {
                                    if (currentOp == '+') {
                                        String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                        double secondNumber = Double.parseDouble(secondNumberString);
                                        double res = firstNumber + secondNumber;
                                        calculatorScreen.setText(String.valueOf(res));
                                    }
                                    if (currentOp == '-') {
                                        String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                        double secondNumber = Double.parseDouble(secondNumberString);
                                        double res = firstNumber - secondNumber;
                                        calculatorScreen.setText(String.valueOf(res));
                                    }
                                    if (currentOp == '*') {
                                        String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                        double secondNumber = Double.parseDouble(secondNumberString);
                                        double res = firstNumber * secondNumber;
                                        calculatorScreen.setText(String.valueOf(res));
                                    }
                                    if (currentOp == '/') {
                                        String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                        double secondNumber = Double.parseDouble(secondNumberString);
                                        double res = firstNumber / secondNumber;
                                        calculatorScreen.setText(String.valueOf(res));
                                    }
                                    screenContent = calculatorScreen.getText().toString();
                                }
                            }
                            if (lastString.equals("+") || lastString.equals("﹣") || lastString.equals("÷") || lastString.equals("×")) {
                                calculatorScreen.setText(screenContent.substring(0,screenContent.length()-1));
                                screenContent = calculatorScreen.getText().toString();
                            }
                            secondNumberIndex = screenContent.length() + 1;
                            firstNumber = Double.parseDouble(screenContent);
                            calculatorScreen.append("+");
                            isOpPressed = true;
                            currentOp = '+';
                            break;
                        }
                        break;
                    case R.id.subtraction:
                        vibrateButton(50);
                        screenContent = calculatorScreen.getText().toString();
                        if (!screenContent.equals("")) {
                            lastString = screenContent.substring(screenContent.length()-1);
                            if (screenContent.contains("+") || screenContent.contains("﹣") || screenContent.contains("×") || screenContent.contains("÷")) {
                                if (!lastString.equals("+") && !lastString.equals("﹣") && !lastString.equals("÷") && !lastString.equals("×")) {
                                    if (currentOp == '+') {
                                        String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                        double secondNumber = Double.parseDouble(secondNumberString);
                                        double res = firstNumber + secondNumber;
                                        calculatorScreen.setText(String.valueOf(res));
                                    }
                                    if (currentOp == '-') {
                                        String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                        double secondNumber = Double.parseDouble(secondNumberString);
                                        double res = firstNumber - secondNumber;
                                        calculatorScreen.setText(String.valueOf(res));
                                    }
                                    if (currentOp == '*') {
                                        String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                        double secondNumber = Double.parseDouble(secondNumberString);
                                        double res = firstNumber * secondNumber;
                                        calculatorScreen.setText(String.valueOf(res));
                                    }
                                    if (currentOp == '/') {
                                        String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                        double secondNumber = Double.parseDouble(secondNumberString);
                                        double res = firstNumber / secondNumber;
                                        calculatorScreen.setText(String.valueOf(res));
                                    }
                                    screenContent = calculatorScreen.getText().toString();
                                }
                            }
                            if (lastString.equals("+") || lastString.equals("﹣") || lastString.equals("÷") || lastString.equals("×")) {
                                calculatorScreen.setText(screenContent.substring(0,screenContent.length()-1));
                                screenContent = calculatorScreen.getText().toString();
                            }
                            secondNumberIndex = screenContent.length() + 1;
                            firstNumber = Double.parseDouble(screenContent);
                            calculatorScreen.append("﹣");
                            isOpPressed = true;
                            currentOp = '-';
                            break;
                        }
                        break;
                    case R.id.multiplication:
                        vibrateButton(50);
                        screenContent = calculatorScreen.getText().toString();
                        if (!screenContent.equals("")) {
                            lastString = screenContent.substring(screenContent.length()-1);
                            if (screenContent.contains("+") || screenContent.contains("﹣") || screenContent.contains("×") || screenContent.contains("÷")) {
                                if (!lastString.equals("+") && !lastString.equals("﹣") && !lastString.equals("÷") && !lastString.equals("×")) {
                                    if (currentOp == '+') {
                                        String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                        double secondNumber = Double.parseDouble(secondNumberString);
                                        double res = firstNumber + secondNumber;
                                        calculatorScreen.setText(String.valueOf(res));
                                    }
                                    if (currentOp == '-') {
                                        String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                        double secondNumber = Double.parseDouble(secondNumberString);
                                        double res = firstNumber - secondNumber;
                                        calculatorScreen.setText(String.valueOf(res));
                                    }
                                    if (currentOp == '*') {
                                        String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                        double secondNumber = Double.parseDouble(secondNumberString);
                                        double res = firstNumber * secondNumber;
                                        calculatorScreen.setText(String.valueOf(res));
                                    }
                                    if (currentOp == '/') {
                                        String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                        double secondNumber = Double.parseDouble(secondNumberString);
                                        double res = firstNumber / secondNumber;
                                        calculatorScreen.setText(String.valueOf(res));
                                    }
                                    screenContent = calculatorScreen.getText().toString();
                                }
                            }
                            if (lastString.equals("+") || lastString.equals("﹣") || lastString.equals("÷") || lastString.equals("×")) {
                                calculatorScreen.setText(screenContent.substring(0,screenContent.length()-1));
                                screenContent = calculatorScreen.getText().toString();
                            }
                            secondNumberIndex = screenContent.length() + 1;
                            firstNumber = Double.parseDouble(screenContent);
                            calculatorScreen.append("×");
                            isOpPressed = true;
                            currentOp = '*';
                            break;
                        }
                        break;
                    case R.id.division:
                        vibrateButton(50);
                        screenContent = calculatorScreen.getText().toString();
                        if (!screenContent.equals("")) {
                            lastString = screenContent.substring(screenContent.length()-1);
                            if (screenContent.contains("+") || screenContent.contains("﹣") || screenContent.contains("×") || screenContent.contains("÷")) {
                                if (!lastString.equals("+") && !lastString.equals("﹣") && !lastString.equals("÷") && !lastString.equals("×")) {
                                    if (currentOp == '+') {
                                        String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                        double secondNumber = Double.parseDouble(secondNumberString);
                                        double res = firstNumber + secondNumber;
                                        calculatorScreen.setText(String.valueOf(res));
                                    }
                                    if (currentOp == '-') {
                                        String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                        double secondNumber = Double.parseDouble(secondNumberString);
                                        double res = firstNumber - secondNumber;
                                        calculatorScreen.setText(String.valueOf(res));
                                    }
                                    if (currentOp == '*') {
                                        String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                        double secondNumber = Double.parseDouble(secondNumberString);
                                        double res = firstNumber * secondNumber;
                                        calculatorScreen.setText(String.valueOf(res));
                                    }
                                    if (currentOp == '/') {
                                        String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                        double secondNumber = Double.parseDouble(secondNumberString);
                                        double res = firstNumber / secondNumber;
                                        calculatorScreen.setText(String.valueOf(res));
                                    }
                                    screenContent = calculatorScreen.getText().toString();
                                }
                            }
                            if (lastString.equals("+") || lastString.equals("﹣") || lastString.equals("÷") || lastString.equals("×")) {
                                calculatorScreen.setText(screenContent.substring(0,screenContent.length()-1));
                                screenContent = calculatorScreen.getText().toString();
                            }
                            secondNumberIndex = screenContent.length() + 1;
                            firstNumber = Double.parseDouble(screenContent);
                            calculatorScreen.append("÷");
                            isOpPressed = true;
                            currentOp = '/';
                            break;
                        }
                        break;
                }
            }
        };
        n0.setOnClickListener(calculatorListener);
        n1.setOnClickListener(calculatorListener);
        n2.setOnClickListener(calculatorListener);
        n3.setOnClickListener(calculatorListener);
        n4.setOnClickListener(calculatorListener);
        n5.setOnClickListener(calculatorListener);
        n6.setOnClickListener(calculatorListener);
        n7.setOnClickListener(calculatorListener);
        n8.setOnClickListener(calculatorListener);
        n9.setOnClickListener(calculatorListener);
        dot.setOnClickListener(calculatorListener);
        equal.setOnClickListener(calculatorListener);
        addition.setOnClickListener(calculatorListener);
        subtraction.setOnClickListener(calculatorListener);
        multiplication.setOnClickListener(calculatorListener);
        division.setOnClickListener(calculatorListener);

        final Button delete = findViewById(R.id.del);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateButton(50);
                String displayed = calculatorScreen.getText().toString();
                int length = displayed.length();
                if (length > 0) {
                    if (displayed.substring(length - 1).equals("+") || displayed.substring(length - 1).equals("﹣") || displayed.substring(length - 1).equals("÷") || displayed.substring(length - 1).equals("×")) {
                        isOpPressed = false;
                    }
                    displayed = displayed.substring(0,length-1);
                    calculatorScreen.setText(displayed);
                }

            }
        });

        final Button allClear = findViewById(R.id.ac);
        allClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateButton(50);
                calculatorScreen.setText("");
                isEqPressed = false;
                isOpPressed = false;
            }
        });
    }

    private void vibrateButton (long ms) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(VibrationEffect.createOneShot(ms, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(ms);
        }
    }
}
