public class Class4A0003 {
    private Class4A0003Interface userService;

    public Class4A0003(Class4A0003Interface userService) {
        this.userService = userService;
    }

    // Pattern: 引数を使ったメソッドのMock：引数あり(単一)
    public String func4A0003(int userId) {
        return userService.getUserName(userId);
    }
}

interface Class4A0003Interface {
    String getUserName(int userId);
}