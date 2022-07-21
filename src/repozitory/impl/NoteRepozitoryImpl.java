package src.repozitory.impl;

import src.Note;
import src.repozitory.NoteRepozitory;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class NoteRepozitoryImpl implements NoteRepozitory {

    private static final Set<Note> NOTES = new HashSet<>();

    @Override
    public Note save(Note note) {
        NOTES.add(note);
        return note;
    }

    @Override
    public Set<Note> getAllNotes() {
        return null;
    }

    @Override
    public void delete(String name) {

    }
}
