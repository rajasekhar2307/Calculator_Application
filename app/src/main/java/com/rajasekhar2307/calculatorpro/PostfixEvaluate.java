package com.rajasekhar2307.calculatorpro;

public class PostfixEvaluate{
    public Stack stack;
    public double eval(String expression){
        int length = expression.length();
        stack = new Stack<Double>(length);
        for(int i=0; i<length; i++){
            String number="";

            char ch = expression.charAt(i);

            if(Character.isDigit(ch)) {
                if(i>0 && expression.charAt(i-1)=='-'){
                    number = "-" + number + ch;
                }
                else{
                    number = number + ch;
                }
                for (int k = i; ; k++) {
                    if (k + 1 != expression.length() && (Character.isDigit(expression.charAt(k + 1)) || expression.charAt(k+1)=='.')) {
                        number = number + expression.charAt(k + 1);
                        i++;
                    } else break;
                }
                Double num = Double.parseDouble(number);
                stack.push(num);
            }
            else if(expression.charAt(i) != ' '){
                if(i!=length-1){
                    if(Character.isDigit(expression.charAt(i+1))){
                       continue;
                    }
                }
                double val1 = (double) stack.pop();
                double val2 = (double) stack.pop();
                switch(ch){
                    case '+': stack.push(val2 + val1);break;
                    case '-': stack.push(val2 - val1);break;
                    case '*': stack.push(val2 * val1);break;
                    case '/': stack.push(val2 / val1);break;
                    case '%': stack.push(val2 % val1);break;
                    case '^': stack.push(Math.pow(val2,val1)); break;
                }
            }
        }
        return (double) stack.pop();
    }
}