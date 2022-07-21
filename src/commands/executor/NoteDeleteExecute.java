package src.commands.executor;

import src.repozitory.NoteRepozitory;
import src.repozitory.impl.NoteRepozitoryImpl;

public class NoteDeleteExecute extends AbstractExecute{

    //private static final NoteRepozitory NOTE_REPOSITORY = new NoteRepozitoryImpl();

    @Override
    public int execute(String text) {
        return 0;
    }

    private static int deleteNote(String command){
        String[] words = command.split(" ");

        String noteName = words[2];

        NOTE_REPOSITORY.delete(noteName);

        return 1;
    }
}
