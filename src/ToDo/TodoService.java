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
        if (todoList.isEmpty()){
            System.out.println("タスクはありません。");
            return;
        }
        System.out.println("===== タスク一覧 =====");
        for (int i = 0; i < todoList.size(); i++) {
            Todo todo = todoList.get(i);

            String mark;

            if (todo.isCompleted()){
                mark = "[✓]";
            } else {
                mark = "[ ]";
            }

            System.out.println((i + 1) + ". " + mark + " " + todo.getTask());
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

    //完了切替
    public void toggleCompleted(int number){
        if (number >= 1 && number <= todoList.size()){
            Todo todo = todoList.get(number - 1);
            todo.setCompleted(!todo.isCompleted());

            if (todo.isCompleted()){
                System.out.println("「" + todo.getTask() + "」を完了にしました。");
            } else {
                System.out.println("「" + todo.getTask() + "」を未完了にしました。");
            }

        } else {
            System.out.println("存在しない番号です。");
        }
    }

    //編集
    public void editTask(int number, String newTask){
        if (number >= 1 && number <= todoList.size()){
            Todo todo = todoList.get(number - 1);
            String oldTask = todo.getTask();
            todo.setTask(newTask);
            System.out.println("「" + oldTask + "」を「" + newTask + "」に変更しました。");
        } else {
            System.out.println("存在しない番号です。");
        }
    }
}
