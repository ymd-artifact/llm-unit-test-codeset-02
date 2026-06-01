public class Class4A0021 {
    private Class4A0021Interface_1 companyService;

    public Class4A0021(Class4A0021Interface_1 companyService) {
        this.companyService = companyService;
    }

    // Pattern: ネストしたMock（3層）
    public String[] func4A0021(String companyId) {
        // 1層目: 会社情報を取得
        Class4A0021Interface_2 company = companyService.getCompany(companyId);
        String companyName = company.getName();

        // 2層目: 部門情報を取得
        Class4A0021Interface_3 department = company.getDepartment();
        String departmentName = department.getName();

        // 3層目: 部門の説明を取得
        String description = department.getDescription();

        // 各レベルの情報を配列で返す
        return new String[]{
            companyName,      // 1層目
            departmentName,   // 2層目
            description      // 3層目
        };
    }
}

interface Class4A0021Interface_1 {
    Class4A0021Interface_2 getCompany(String companyId);
}

interface Class4A0021Interface_2 {
    String getName();
    Class4A0021Interface_3 getDepartment();
}

interface Class4A0021Interface_3 {
    String getName();
    String getDescription();
}