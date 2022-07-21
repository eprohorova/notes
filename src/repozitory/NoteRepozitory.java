package src.repozitory;

import com.sun.source.doctree.SeeTree;
import src.Note;

import java.util.List;
import java.util.Set;

public interface NoteRepozitory {
    Note save(Note note);

    Set<Note> getAllNotes();

    void delete(String name);
}
