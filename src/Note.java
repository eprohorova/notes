package src;

import java.time.Instant;
import java.util.Objects;

public class Note {
    private final String name;
    private String txt;
    private final String author;
    private final Instant creationData;
    private Instant updateData;

    public Note(String name, String txt){
        this.name=name;
        this.txt=txt;

        author=null;
        creationData=Instant.now();
    }
    public String getName(){
        return this.name;
    }
    public String getTxt(){
        return this.txt;
    }
    public void setTxt(){
         this.txt=txt;
         this.updateData=Instant.now();
    }
    public String getAuthor(){
        return this.author;
    }
    public Instant getCreationData(){
        return this.creationData;
    }
    public Instant getUpdateData(){
        return this.updateData;
    }
    public void setUpdateData(){
        this.updateData=updateData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(name, note.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
