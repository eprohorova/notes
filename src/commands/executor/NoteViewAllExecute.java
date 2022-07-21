package src.commands.executor;

public class NoteViewAllExecute extends AbstractExecute{

    @Override
    public int execute(String text) {
        return 0;
    }

    private static int viewAllNotes(String command){
        var notes = NOTE_REPOSITORY.getAllNotes();
        for (var note : notes){
            System.out.printf("Название: %s, Текст: %s, Автор: %s /n", note.getName(), note.getTxt(), note.getAuthor());
        }
        return 1;
    }
}
