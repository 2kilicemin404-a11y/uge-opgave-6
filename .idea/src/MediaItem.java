package src;
public abstract class MediaItem{
    String title;
    int durationSeconds;
    MediaItem(String title, int durationSeconds){
        this.title = title;
        this.durationSeconds = durationSeconds;


    }
   public String getTitle(){
return title;

    }
   public int getDurationSeconds(){
        return durationSeconds;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Duration: " + durationSeconds;
    }
}
