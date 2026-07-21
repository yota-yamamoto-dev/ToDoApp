package ToDo;

import java.util.ArrayList;

//処理
public class TodoService {
    //データ
    private ArrayList<String> todoList = new ArrayList<>();

    //追加
    public void addTask(String task) {
        todoList.add(task);
    }

    //一覧表示
    public void showTask() {
        System.out.println("===== タスク一覧 =====");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + ". " + todoList.get(i));
        }
    }

    //削除
    public void deleteTask(int deleteNum) {
        if (deleteNum >= 1 && deleteNum <= todoList.size()) {
            String removedTask = todoList.remove(deleteNum - 1);
            System.out.println("「" + removedTask + "」を削除しました。");
        } else {
            System.out.println("存在しない番号です。");
        }
    }
}
