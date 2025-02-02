
public class Car_Chapter15 {
    //コントラクタ　　　　　　　　//引数の宣言数

    private int speed;
    private int gear;

public Car_Chapter15(int speed, int gear) {
    //初期化処理
    this.speed = speed;
    this.gear = gear;
}

//ギアチェンジした後の処理
public void gearChange(int afterGesr) {
    System.out.println("ギア"+ gear +"から" + aftergear + "に切り替えました");
    gear = afterGear;
    switch (afterGear) {
        case 1 -> this.speed = 10;
        case 2 -> this.speed = 20;
        case 3 -> this.speed = 30;
        case 4 -> this.speed = 40;
        case 5 -> this.speed = 50;
        default -> this.speed = 10;
    }
}

//runメソッドの呼び出しをして現在の速度結果を実行
public void run() {
    System.out.println("速度は時速" + this.speed + "kmです");
}

}