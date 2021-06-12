package com.rajasekhar2307.calculatorpro;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import javax.xml.xpath.XPathExpressionException;

    public class MainActivity extends AppCompatActivity {

    int openParenthesisCount = 0;
    int closeParenthesisCount = 0;
    EditText textArea;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnClear, btnPercentile, btnPow, btnMultiply, btnAdd, btnSubtract, btnDivide, btnDecimal, btnEquals, btnOpenParenthesis, btnCloseParenthesis;
    ImageButton btnBack;
    String infixExpression = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Text Area
        textArea = findViewById(R.id.text_area);

        textArea.setShowSoftInputOnFocus(false);
        if (Build.VERSION.SDK_INT > 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(Color.rgb(0,0,128));
        }


        //Number buttons
        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btnDecimal = findViewById(R.id.btn_decimal);


        //Function buttons
        btnClear = findViewById(R.id.btn_clear);
        btnBack = findViewById(R.id.btn_back);
        btnEquals = findViewById(R.id.btn_equals);

        //Operators
        btnAdd = findViewById(R.id.btn_add);
        btnSubtract = findViewById(R.id.btn_subtract);
        btnMultiply = findViewById(R.id.btn_multiply);
        btnPercentile = findViewById(R.id.btn_percentile);
        btnDivide = findViewById(R.id.btn_divide);
        btnPow = findViewById(R.id.btn_pow);
        btnOpenParenthesis = findViewById(R.id.btn_openparanthesis);
        btnCloseParenthesis = findViewById(R.id.btn_closeparenthesis);

        //Adding Event Listeners
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textArea.setText(textArea.getText().toString() + "0");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textArea.setText(textArea.getText().toString() + "1");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textArea.setText(textArea.getText().toString() + "2");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textArea.setText(textArea.getText().toString() + "3");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textArea.setText(textArea.getText().toString() + "4");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textArea.setText(textArea.getText().toString() + "5");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textArea.setText(textArea.getText().toString() + "6");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textArea.setText(textArea.getText().toString() + "7");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textArea.setText(textArea.getText().toString() + "8");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textArea.setText(textArea.getText().toString() + "9");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textArea.getText().length()>0 && textArea.getText().charAt(textArea.getText().length()-1) == '.')
                    textArea.setText(textArea.getText().toString() + "");
                else
                    textArea.setText(textArea.getText().toString() + ".");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textArea.getText().length()>0 && textArea.getText().charAt(textArea.getText().length()-1) == '+')
                    textArea.setText(textArea.getText().toString() + "");
                else
                    textArea.setText(textArea.getText().toString() + "+");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textArea.getText().length()>0 && textArea.getText().charAt(textArea.getText().length()-1) == '-')
                    textArea.setText(textArea.getText().toString() + "");
                else
                    textArea.setText(textArea.getText().toString() + "-");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textArea.getText().length()>0 && textArea.getText().charAt(textArea.getText().length()-1) == '*')
                    textArea.setText(textArea.getText().toString() + "");
                else
                    textArea.setText(textArea.getText().toString() + "*");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textArea.getText().length()>0 &&textArea.getText().charAt(textArea.getText().length()-1) == '/')
                    textArea.setText(textArea.getText().toString() + "");
                else
                    textArea.setText(textArea.getText().toString() + "/");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btnPercentile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textArea.getText().length()>0 && textArea.getText().charAt(textArea.getText().length()-1) == '%')
                    textArea.setText(textArea.getText().toString() + "");
                else
                    textArea.setText(textArea.getText().toString() + "%");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btnPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textArea.getText().length()>0 && textArea.getText().charAt(textArea.getText().length()-1) == '^')
                    textArea.setText(textArea.getText().toString() + "");
                else
                textArea.setText(textArea.getText().toString() + "^");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btnOpenParenthesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openParenthesisCount+=1;
                textArea.setText(textArea.getText().toString() + "(");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btnCloseParenthesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(closeParenthesisCount< openParenthesisCount){
                    closeParenthesisCount++;
                    textArea.setText(textArea.getText().toString() + ")");
                }
                else{
                    textArea.setText(textArea.getText().toString() + "");
                }
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });

        //Functions
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textArea.setText("");
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textArea.setText(chop(textArea.getText().toString()));
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
            public String chop(String str) {
                if (str != null && str.length() > 0) {
                    str = str.substring(0, str.length() - 1);
                }
                else return "";
                return str;
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String expression = String.valueOf(textArea.getText());

                    while(!Character.isDigit(expression.charAt(expression.length()-1))){
                        expression = expression.substring(0, expression.length()-1);
                    }
//                String expression = "";
                    if(textArea.getText().length()<=0) textArea.setText("");
                    String postfixExpression = transform(expression);
                    System.out.println("expression is : "+postfixExpression);
                    double result = new PostfixEvaluate().eval(postfixExpression);
                    System.out.println("Answer is : "+result);
                    if(result == (long) result){
                        textArea.setText(String.format("%d",(long)result));
                    }
                    else{
                        textArea.setText(result+"");
                    }
                }
                catch (Exception e){
                    if(textArea.getText().length()==0){
                        textArea.setText("");
                    }
                    else
                    textArea.setText("Bad Expression!");
                }
                int pos = textArea.getText().length();
                textArea.setSelection(pos);
            }
        });

        

    }

    public String transform(String exp){
        String input = exp;
        String output;
        InfixToPostfix theTrans = new InfixToPostfix();
        output = theTrans.infixToPostFix(input);
        return output;
    }
}