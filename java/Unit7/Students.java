import java.util.*;
public class Students
{
    public String name;
    public int tests;
    public int[] score;
    Random rand = new Random();
    public Students(String name, int tests)
    {
        this.name = name;
        score = new int[tests];
    }
    
    public void setScore(int test, int score)
    {
        this.score[test] = score;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        String testscores = "";
        int avg = 0;
        for (int n: score)
        {
            testscores += n + ", ";
            avg += n;
        }
        avg = avg / score.length - 1;
        return (name + ", " + score.length + ", " + testscores + avg);
    }
}