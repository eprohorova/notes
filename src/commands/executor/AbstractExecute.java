package src.commands.executor;

import src.repozitory.NoteRepozitory;
import src.repozitory.impl.NoteRepozitoryImpl;

public abstract class AbstractExecute implements Executor {
    protected static final NoteRepozitory NOTE_REPOSITORY = new NoteRepozitoryImpl();
}