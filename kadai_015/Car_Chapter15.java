//コントラクタ　　　　　　　　//引数の宣言数
public CarExce_Chapter14(int speed, int gear) {
    //初期化処理
    this.speed = speed;
    this.gear = gear;
}

//ギアチェンジした後の処理
public void gearChange(int afterGesr) {
}

//加速した時の速度処理
public void accelerate(int amount) {
    this.speed += amount;
}

//減速した時の速度処理
public void decelerate(int amount) {
    this.speed -= amount;
    //減速した時、if文を使って減速結果を出す
    if (this.speed < 0) {
        this.speed = 0;
    }
}

//runメソッドの呼び出しをして現在の速度結果を実行
public void run() {
    System.out.println("速度は時速" + this.speed + "kmです");
}

public static class Main {
    public static void main(String[] args) {
        CarExce_Chapter14 car = new CarExce_Chapter14(0, 1);
        car.gearChange(2);
        car.accelerate(30);
        car.run();
        car.decelerate(10);
    }
}