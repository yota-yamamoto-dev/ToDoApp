package ToDo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //インスタンス生成
        TodoService service = new TodoService();
        //スキャナー
        Scanner sc = new Scanner(System.in);

        while (true) {
            //メニュー表示
            System.out.println("===== ToDoアプリ =====");
            System.out.println("1. タスク追加");
            System.out.println("2. タスク一覧");
            System.out.println("3. タスク削除");
            System.out.println("0. 終了");
            System.out.println();

            //入力番号取得
            System.out.print("番号を入力してください：");
            int num = sc.nextInt();

            //選択機能表示
            switch (num) {
                //追加
                case 1:
                    System.out.print("タスク名を入力してください：");
                    String task = sc.next();
                    service.addTask(task);
                    System.out.println("「" + task + "」を追加しました。");
                    break;
                //一覧表示
                case 2:
                    service.showTask();
                    break;
                //削除
                case 3:
                    service.showTask();
                    System.out.println("削除する番号を選択してください");
                    int deleteNum = sc.nextInt();
                    service.deleteTask(deleteNum);
                    break;
                //終了
                case 0:
                    System.out.println("アプリを終了します。");
                    return;
            }
        }
    }
}
