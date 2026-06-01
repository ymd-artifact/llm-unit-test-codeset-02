public class Class4A0016 {
    private Class4A0016Interface_1 userService;

    public Class4A0016(Class4A0016Interface_1 userService) {
        this.userService = userService;
    }

    // Pattern: Mockを返すMock
    public String func4A0016(String userId) {
        // userServiceからuserを取得（1つ目のMock）
        Class4A0016Interface_2 user = userService.getUser(userId);
        // userから直接メールアドレスを取得（最終的な値）
        return user.getEmail();
    }
}

interface Class4A0016Interface_1 {
    Class4A0016Interface_2 getUser(String userId);
}

interface Class4A0016Interface_2 {
    String getEmail();
}