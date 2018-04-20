public class MyInteger {
    private int value;

    public MyInteger(int value) {
    }

    public int getValue() {
        return value;
    }

    public boolean isEven(int value) {
        return ((value % 2) == 0);
    }

    public boolean isOdd(int value) {
        return !isEven(value);
    }

    public boolean isPrime(int value) {
        boolean isPrime = true;
        if (value < 2) isPrime = false;
        else {
            int i = 2;
            while (i <= Math.sqrt(value)) {
                if (value % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }
        return isPrime;
    }

    public boolean isEven(MyInteger value) {
        return isEven(getValue());
    }

    public boolean isOdd(MyInteger value) {
        return isOdd(getValue());
    }

    public boolean isPrime(MyInteger value) {
        return isPrime(getValue());
    }

    public boolean equals (int value) {
        return (value == getValue());
    }

    public boolean equals (MyInteger value) {
        return equals(getValue());
    }

    public int parseInt(String value) {
        return Integer.parseInt(value);
    }
}
