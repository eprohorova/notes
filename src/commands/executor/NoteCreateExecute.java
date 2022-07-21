package src.commands.executor;

import src.Note;
import src.repozitory.NoteRepozitory;
import src.repozitory.impl.NoteRepozitoryImpl;

public class NoteCreateExecute extends AbstractExecute{

    //private static final NoteRepozitory NOTE_REPOSITORY = new NoteRepozitoryImpl();

    @Override
    public int execute(String text) {
        return createNote(text);
    }

    private static int createNote(String command){
        String[] words = command.split(" ");

        String noteName = words[2];

        StringBuilder noteTextSb = new StringBuilder();
        for (int i = 3; i < words.length; i++){
            noteTextSb.append(words[1]);
            noteTextSb.append(" ");
        }
        String noteText = noteTextSb.toString();

        Note newNote = new Note(noteName, noteText);

        NOTE_REPOSITORY.save(newNote);

        System.out.println("Note created");

        return 1;
    }
}
