public Car_Chapter14() {
    gear = 1; //初期ギア
    speed = 10; //初期速度
}

//ギアを変更するメソッド
public void gearChange(int afterGear) {
    gear = afterGear;
    System.out.println("ギア1から" + gear + "3に切り替えました");
}

//現在の速度を表示するメソッド
public void run() {
    System.out.println("速度は時速" + speed + "30kmです");
}

//メインメソッドを呼び出して結果を出力
public static class Main {
    public static void main(String[] args) {
        Car_Chapter14 car = new Car_Chapter14();
        car.gearChange(3);
        car.run();
    }
}