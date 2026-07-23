package ToDo;

import java.util.ArrayList;

//処理
public class TodoService {
    //データ
    private final ArrayList<Todo> todoList = new ArrayList<>();

    //追加
    public void addTask(String task) {
        Todo todo = new Todo(task);
        todoList.add(todo);
    }

    //一覧表示
    public void showTask() {
        System.out.println("===== タスク一覧 =====");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + ". " + todoList.get(i).getTask());
        }
    }

    //削除
    public void deleteTask(int deleteNum) {
        if (deleteNum >= 1 && deleteNum <= todoList.size()) {
            Todo removedTask = todoList.remove(deleteNum - 1);
            System.out.println("「" + removedTask.getTask() + "」を削除しました。");
        } else {
            System.out.println("存在しない番号です。");
        }
    }
}
