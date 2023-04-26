package ie.tudublin;

import java.util.ArrayList;

public class Word {
    private String word;
    ArrayList<Follow> follows = new ArrayList<Follow>();

    public Word(String word, ArrayList<Follow>follows)
    {
        this.word = word;
        this.follows = follows;
    }

    public String toString()
    {
        for (Follow part : follows) {
            part.display();
          }
    }

    public void findFollow(str)
    {

    }

}
