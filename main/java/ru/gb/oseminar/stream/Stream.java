package ru.gb.oseminar.stream;

import ru.gb.oseminar.data.StudentGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    List<StudentGroup> studentGroups;

    public Stream() {
        this.studentGroups = new ArrayList<>();
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        this.studentGroups.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }
}