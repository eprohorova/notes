package src.commands;

import src.Note;
import src.commands.executor.NoteCreateExecute;
import src.commands.executor.NoteDeleteExecute;
import src.commands.executor.NoteViewAllExecute;
import src.repozitory.NoteRepozitory;
import src.repozitory.impl.NoteRepozitoryImpl;

import java.util.Scanner;

public class CommandReader {

    //private static final NoteRepozitory noteRepozitory = new NoteRepozitoryImpl();

    public static int startReadCommand(){
        System.out.println("Program started");
        Scanner scanner = new Scanner(System.in);

        while (true){
            var text = scanner.nextLine();
            int code = CommandReader.readCommand(text);

            if (code == 0){
                break;
            }
        }
        return 0;
    }
    /**
     * create note;
     * all notes;
     * delete note.
     *
     * example: create note / noteName, noteText, /
     * @param command
     * @return
     */
    private static int readCommand(String command){

       if (command.contains("create note")){
           return new NoteCreateExecute().execute (command);
       }
       if (command.contains("oll notes")){
           return new NoteViewAllExecute().execute (command);
       }
       if (command.contains("delete note")){
           return new NoteDeleteExecute().execute (command);
       }
       if (command.contains("exit")){
           return 0;
       }

       return -1;
    }

    /*private static int createNote(String command){
        String[] words = command.split(" ");

        String noteName = words[2];

        StringBuilder noteTextSb = new StringBuilder();
        for (int i = 3; i < words.length; i++){
            noteTextSb.append(words[1]);
            noteTextSb.append(" ");
        }
        String noteText = noteTextSb.toString();

        Note newNote = new Note(noteName, noteText);

        noteRepozitory.save(newNote);

        System.out.println("Note created");

        return 1;
    }*/
    /*private static int viewAllNotes(String command){
        var notes = noteRepozitory.getAllNotes();
        for (var note : notes){
            System.out.printf("Название: %s, Текст: %s, Автор: %s /n", note.getName(), note.getTxt(), note.getAuthor());
        }
        return 1;
    }*/
    /*private static int deleteNote(String command){
        String[] words = command.split(" ");

        String noteName = words[2];

        noteRepozitory.delete(noteName);

        return 1;
    }*/
}
