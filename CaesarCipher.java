/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	private char[] shifted;
	private int shift;

    public CaesarCipher() 
    {

        shift = 1;
        shifter(shift);
    }

    public CaesarCipher(int num)
    {

        shift = num;
        shifter(shift);
    }

    public String encrypt(String message)
    {
        int alphaCheck = 0;

        for(int i = 0; i<message.length(); i++)
        {
            if(message.charAt(i)==(alphabet[alphaCheck]))
            {
                message += shifted[i];
            }
            alphaCheck++;
        }
        return message;
    }

    public String decrypt(String message)
    {
        int alphaCheckTwo = 0;
        for(int i = 0; i<message.length(); i++)
        {
            if(message.charAt(i)==(shifted[alphaCheckTwo]))
            {
                message += alphabet[i];
            }
            alphaCheckTwo++;
        }

        return message;
    }

    public void shifter(int num)
    {

        for(int i = 0; i<alphabet.length; i++)
        {
            shifted[i] = shifted[(i+num)%26];
        }

    }


}