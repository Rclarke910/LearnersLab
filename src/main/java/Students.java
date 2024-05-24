public final class Students extends People {
    private static final Students INSTANCE = new Students();

    private Students() {
        add(new Student(1L, "Alice"));
        add(new Student(2L, "Bob"));
        add(new Student(3L, "Charlie"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
