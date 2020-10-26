class Fraction{

    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public Fraction(){
        numerator = 1;
        denominator = 2;
    }

    public void add(Fraction first, Fraction second){
        String words = (first.numerator + "/" + first.denominator + " + " + second.numerator + "/" + second.denominator + " equals: ");
        int placeHolder = first.denominator;
        first.numerator *= second.denominator;
        second.numerator *= placeHolder;
        second.denominator *= placeHolder;
        int newnumerator = first.numerator + second.numerator;
        String finalValue = Integer.toString((int)newnumerator) + "/" + (int)second.denominator;
        System.out.println(words + finalValue);
    }

    public void multiply(Fraction first, Fraction second){
        String words = (first.numerator + "/" + first.denominator + " * " + second.numerator + "/" + second.denominator + " equals: ");
        first.denominator *= second.denominator;
        first.numerator *= second.numerator;
        String finalValue = Integer.toString((int)first.numerator) + "/" + (int)first.denominator;
        System.out.println(words + finalValue);
    }

    public void divide(Fraction first, Fraction second){
        String words = (first.numerator + "/" + first.denominator + " / " + second.numerator + "/" + second.denominator + " equals: ");
        int placeHolder = second.numerator;
        second.numerator = second.denominator;
        second.denominator = placeHolder;
        first.denominator *= second.denominator;
        first.numerator *= second.numerator;
        String finalValue = Integer.toString((int)first.numerator) + "/" + (int)first.denominator;
        System.out.println(words + finalValue);
    }

    public void sub(Fraction first, Fraction second){
        String words = (first.numerator + "/" + first.denominator + " - " + second.numerator + "/" + second.denominator + " equals: ");
        int placeHolder = first.denominator;
        first.denominator *= second.denominator;
        first.numerator *= second.denominator;
        second.numerator *= placeHolder;
        int newnumerator = first.numerator - second.numerator;
        String finalValue = Integer.toString((int)newnumerator) + "/" + (int)first.denominator;
        System.out.println(words + finalValue);
    }

    }
