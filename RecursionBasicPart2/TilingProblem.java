/*Given a "2*1" board and tiles of size "2*1",count the number
  of ways to tile the given using the 2*1 tiles.
  (A tile can either be plased herizontally or vertically.)
 */

package RecursionBasicPart2;

public class TilingProblem {
    public static int Tiling(int n){
        if(n==0||n==1){
            return  1;
        }
          int verticalTile=Tiling(n-1);
          int herozentalTile=Tiling(n-2);
          int totalTile= verticalTile+herozentalTile;
          return totalTile;
    }
    public static void main(String[] args) {
        System.out.println(Tiling(6));
    }
}
