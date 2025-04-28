package kadai_018;

public class KatoExec_Chapter18 {

    public static void main(String[] args) {
        // 各インスタンス作成
        KatoTaro_Chapter18 katoTaro = new KatoTaro_Chapter18();
        KatoIchiro_Chapter18 katoIchiro = new KatoIchiro_Chapter18();
        KatoHanako_Chapter18 katoHanako = new KatoHanako_Chapter18();

        // execIntroduceメソッドを呼び出すことで、共通の紹介とそれぞれの紹介を表示
        katoTaro.execIntroduce();
        katoIchiro.execIntroduce();
        katoHanako.execIntroduce();
    }
}
