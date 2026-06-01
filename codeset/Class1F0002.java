import java.util.ArrayList;
import java.util.List;

/**
 * 参照渡しのメソッドパターン
 */
public class Class1F0002 {
    private List<String> messages = new ArrayList<>();

    /**
     * リストを引数に取るメソッド（参照渡し）
     * @param messageList 追加するメッセージのリスト
     * @return 現在保持しているメッセージの数
     */
    public int func1F0002(List<String> messageList) {
        if (messageList != null) {
            messages.addAll(messageList);
        }
        return messages.size();
    }

    /**
     * メッセージリストを取得
     * @return 現在のメッセージリスト
     */
    public List<String> getMessages() {
        return new ArrayList<>(messages);  // 防御的コピー
    }

    /**
     * メッセージリストをクリア
     */
    public void clearMessages() {
        messages.clear();
    }
}