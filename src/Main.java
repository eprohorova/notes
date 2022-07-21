package src;

import src.commands.CommandReader;
import src.repozitory.NoteRepozitory;
import src.repozitory.impl.NoteRepozitoryImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Note note = new Note( "name",  "author");

        //Scanner string = new Scanner(System.in);
        //var str = string.nextLine();

        /*int code = Authentication.authenticate();
        if (code==0){
            System.out.println("Success");
        }else {
            System.out.println("Not success");
        }
        //List<Note> notes = new LinkedList<>();
        NoteRepozitory noteRepozitory = new NoteRepozitoryImpl();

        Note note_1 = new Note("my note", "random text");
        Note note_2 = new Note("my note", "random text");
        Note note_3 = new Note("my note", "random text");

        noteRepozitory.save(note_1);
        noteRepozitory.save(note_2);
        noteRepozitory.save(note_3);
        Scanner scanner = new Scanner(System.in);

        while (true){
            var text = scanner.nextLine();

            CommandReader.readCommand(text);

        }*/
        Authentication authentication = new Authentication();
        if (authentication.authenticate() == -1){
            System.out.println("Login failed");
            return;
        }
        CommandReader.startReadCommand();

    }
}
