import java.util.Arrays;
import java.util.Collections;

/*
Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).

For example,

[true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true]
The correct answer would be 17.

Hint: Don't forget to check for bad values like null/undefined

 */
public class CountingSheep {
    public static void main(String[] args) {

    }
    //Solution one
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
    }

    //Solution two
    public int countSheeps2(Boolean[] arrayOfSheeps) {
            int num = 0;
            for (Boolean present : arrayOfSheeps)
                if (present != null && present) num += 1;
            return num;
    }

}
