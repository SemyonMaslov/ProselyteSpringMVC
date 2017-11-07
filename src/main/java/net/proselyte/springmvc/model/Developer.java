package net.proselyte.springmvc.model;

public class Developer {
    private int num1;
    private int num2;


    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }


    @Override
    public String toString() {
        return "Сумма чисел {" +

                "  Число 1 " + num1 +

                ", Число 2 '" + num2 + '\'' +

                ", Результат = '" + num1 + num2 + '\'' +

                '}';
    }

}

