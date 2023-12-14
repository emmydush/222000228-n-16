class transip {
    public static void main(String[] args) {

        cars cars = new cars();
        V8 v8 = new V8();
        bmw bmw = new bmw();

        cars.show();
        v8.show();
        v8.colour();

        cars.show();
        bmw.show();
        bmw.showcolour();
    }
}

class cars {
    public void show() {
        System.out.println("show the cars");
    }

}

class V8 extends cars {
    public void show() {
        System.out.println("show a v8");
    }

    public void colour() {
        System.out.println("this is v8");
    }
}

class bmw extends cars {
    public void show() {
        System.out.println(" show bmw");
    }

    public void showcolour() {
        System.out.println("this is a bmw! from germany");
    }
}
