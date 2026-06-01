public class Class4A0019 {
    private Class4A0019Interface queryBuilder;

    public Class4A0019(Class4A0019Interface queryBuilder) {
        this.queryBuilder = queryBuilder;
    }

    // Pattern: メソッドの呼び出しをチェイン
    public String func4A0019(String tableName, String[] columns) {
        Class4A0019Interface query = queryBuilder.init();
        for (String column : columns) {
            query = query.addColumn(column);
        }
        return query
            .from(tableName)
            .where("status", "active")
            .orderBy("id", "DESC")
            .build();
    }
}

interface Class4A0019Interface {
    Class4A0019Interface init();
    Class4A0019Interface addColumn(String column);
    Class4A0019Interface from(String table);
    Class4A0019Interface where(String field, String value);
    Class4A0019Interface orderBy(String field, String direction);
    String build();
}