public class question_four
{

  public static boolean anagram(String one,  String two)
  {
    if(one.length() != two.length())
    {
      return false;
    }
    int[] letter = new int[256];
    int count_num = 0;
    int uniqueCharacter = 0;
    char[] one_array = one.toCharArray();
    for(char c : one_array)
    {
      if(letter[c] == 0)
      {
        uniqueCharacter = 0;
      }
      letter[c]++;

    }
    for(int i = 0; i < two.length(); i++)
    {
      char c = two.charAt(i);
      if(letter[c] == 0)
      {
        return false;
      }
      if(letter[c] != 0)
      {
        letter[c]--;
      }
    }
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
