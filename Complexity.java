// ************************************************************
// Complexity.java
//
// An interface for things that have a difficulty level.
// ************************************************************
public interface Complexity
{
    int MAX_LEVEL = 5; // a constant: the hardest level
    
    void setLevel(int level); // set how hard it is (1 to MAX_LEVEL)
    int getLevel(); // return how hard it is
}