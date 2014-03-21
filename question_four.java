public class question_four
{

  //compare two strings and see if they are anagrams
  public static boolean anagram(String one,  String two)
  {
    //deafult quality is the same length
    if(one.length() != two.length())
    {
      return false;
    }
    //use a int array to count number of times a letter appears
    int[] letter = new int[256];
    int count_num = 0;
    int uniqueCharacter = 0;
    char[] one_array = one.toCharArray();
    //go through the first string and increment the count
    for(char c : one_array)
    {
      if(letter[c] == 0)
      {
        uniqueCharacter = 0;
      }
      letter[c]++;

    }
    //go through the second string to decrement the count on hits
    for(int i = 0; i < two.length(); i++)
    {
      char c = two.charAt(i);
      //if the second string has a letter that is not in one return false
      if(letter[c] == 0)
      {
        return false;
      }
      if(letter[c] != 0)
      {
        letter[c]--;
      }
    }
    //go through the hit bucket to make sure it is all 0
    for(int i = 0; i < letter.length; i++)
    {
      if(letter[i] != 0)
      {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args)
  {
    		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}, {"cat", "matt"}, {"raj", "jar"}};
        for(String[] pair: pairs)
        {
          System.out.println("first : " + pair[0]);
          System.out.println("second : " + pair[1]);
          System.out.println(anagram(pair[0], pair[1]));

        }

  }
}
