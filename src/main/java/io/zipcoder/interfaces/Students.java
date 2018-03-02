package io.zipcoder.interfaces;

public final class Students extends People {

    protected static final Students INSTANCE = new Students();

    private Students() {
        Student April = new Student(11L, "April");
        Student Amy = new Student(12L, "Amy");
        Student Bo = new Student(13L, "Bo");
        Student Dan = new Student(14L, "Dan");
        Student Eric = new Student(15L, "Eric");
        Student Gio = new Student(16L, "Gio");
        Student Luis = new Student(17L, "Luis");
        personList.add(April);
        personList.add(Amy);
        personList.add(Bo);
        personList.add(Dan);
        personList.add(Eric);
        personList.add(Gio);
        personList.add(Luis);
    }

    public static Students getInstance() {
        return INSTANCE;
    }


}
