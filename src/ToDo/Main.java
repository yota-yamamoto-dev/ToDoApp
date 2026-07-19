package ToDo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //メニュー表示
        System.out.println("===== ToDoアプリ =====");
        System.out.println("1. タスク追加");
        System.out.println("2. タスク一覧");
        System.out.println("3. タスク削除");
        System.out.println("0. 終了");
        System.out.println();

        //入力番号取得
        Scanner sc = new Scanner(System.in);
        System.out.print("番号を入力してください：");
        int num = sc.nextInt();

        //選択機能表示
        switch (num){
            case 1 :
                System.out.print("タスク名を入力してください：");
                String task = sc.next();
                System.out.println("「" + task + "」を追加しました。");
            break;
            case 2 : System.out.println("タスク一覧を選択しました。");
            break;
            case 3 : System.out.println("タスク削除を選択しました。");
            break;
            case 0 : System.out.println("アプリを終了します。");
            break;
        }
    }
}
