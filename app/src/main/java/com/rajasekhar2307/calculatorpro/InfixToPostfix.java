package com.rajasekhar2307.calculatorpro;

import java.io.IOException;

public class InfixToPostfix {
    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostFix(String expression){

        String result = "";
        Stack stack = new Stack<Double>(1000);
        for (int i = 0; i <expression.length() ; i++) {
            char c = expression.charAt(i);

            //check if char is operator
            if(precedence(c)>0){
                if(i>0 && c=='-' && !Character.isDigit(expression.charAt(i-1)) && expression.charAt(i-1)!=')'){
                    continue;
                }
                else if(i==0 && c=='-') continue;
                while(stack.isEmpty()==false && precedence((Character) stack.peek())>=precedence(c)){
                    result += stack.pop() + " ";
                }
                stack.push(c);
            }else if(c==')'){
                char x = (char) stack.pop();
                while(x!='('){
                    result += x + " ";
                    x = (char) stack.pop();
                }
            }else if(c=='('){
                stack.push(c);
            }else{
                String number = "";
                //character is neither operator nor (
                if((i>1 && expression.charAt(i-1)=='-' && expression.charAt(i-2)=='(')||(i==1 && expression.charAt(i-1)=='-')){
                    number = "-" + c + "";
                }else {
                    number = c+ "";
                }
                for(int k = i;;k++){
                    if(k+1 != expression.length() && (Character.isDigit(expression.charAt(k+1)) || expression.charAt(k+1)=='.')){
                        number =  number + expression.charAt(k+1);
                        i++;
                    }
                    else break;
                }
                result += number + " ";
            }
        }
        while(!stack.isEmpty()) result += stack.pop()+ " ";
        return result;
    }
}

