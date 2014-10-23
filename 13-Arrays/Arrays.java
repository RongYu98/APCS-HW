public class Arrays{


public int sum13(int[] nums) {
  int Answer = 0;
  int X = 0;
  while (nums.length>X){
    if (nums[X] == 13) {
      if ((nums.length > X + 1) && (nums[X+1] != 13)){
        Answer = Answer - nums[X + 1];}
    } else {
    Answer = Answer + nums[X];}
    X = X + 1;}
  return Answer;
    
}


public int[] frontPiece(int[] nums) {
  int[] Answer = new int[2];
  if (nums.length<3){
    return nums;}
  Answer[1]=nums[1];
  Answer[0]=nums[0];
  return Answer;
}


}