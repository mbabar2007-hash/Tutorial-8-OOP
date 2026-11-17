// ************************************************************
// Question.java
//
// A quiz question with an answer and a difficulty level.
// ************************************************************
public class Question implements Complexity
{
    private String text; // the question to ask
    private String answer; // the correct answer
    private int level; // difficulty, 1 to MAX_LEVEL

    //-----------------------------------------------------------
    // Sets up a question with its answer, at level 1.
    //-----------------------------------------------------------

    public Question(String text, String answer)
    {
        this.text = text;
        this.answer = answer;
        level = 1;
    }

    //-----------------------------------------------------------
    // Sets the difficulty level, kept between 1 and MAX_LEVEL.
    //-----------------------------------------------------------

    public void setLevel(int level)
    {
        if (level < 1)
            level = 1;
        if (level > MAX_LEVEL)
            level = MAX_LEVEL;
        this.level = level;
    }

    //-----------------------------------------------------------
    // Returns the difficulty level.
    //-----------------------------------------------------------

    public int getLevel()
    {
        return level;
    }

    //-----------------------------------------------------------
    // Returns the question text.
    //-----------------------------------------------------------

    public String getText()
    {
        return text;
    }

    //-----------------------------------------------------------
    // Returns the correct answer.
    //-----------------------------------------------------------

    public String getAnswer()
    {
        return answer;
    }
    //-----------------------------------------------------------
    // Returns true if the response matches the answer,
    // ignoring upper/lower case and spaces at either end.
    //-----------------------------------------------------------
    public boolean isCorrect(String response)
    {
        return response.trim().equalsIgnoreCase(answer);
    }
}