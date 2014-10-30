public class ArrayExtra{


public int sum67(int[] nums) {
  boolean is6 = false;
  int answer=0;
  for (int x=0; x<nums.length; x++){
    if (nums[x] == 6){
      is6 = true;}
    if (is6){}
    else {
      answer = answer + nums[x];}
    if (nums[x] == 7){
      is6 = false;}
      }
    return answer;

}


public boolean tripleUp(int[] nums) {
  for (int x=2; x<nums.length; x++){
     if ((nums[x - 2] + 1 == nums[x - 1]) && (nums[x-1] + 1 == nums[x])){
       return true;}}
  return false;
}


public boolean more14(int[] nums) {
  int of1s=0;
  int of4s=0;
  for (int x=0; x < nums.length; x++){
     if (nums[x]==1){
        of1s = of1s + 1;}
     else if (nums[x]==4) {of4s = of4s + 1;}}
  if (of1s>of4s) {
    return true;
    } else {return false;}
}


public int[] tenRun(int[] nums) {
  int first;
  
  if (nums.length==0){
    return nums;}
  
  int x=0;
  while (true){
    if (nums[x]%10==0){
      first = x;
      break;}
    if (x+1==nums.length){
      return nums;}
    x = x + 1;
    }

  int tener = nums[first];
  for (x=first; x<nums.length; x++){
    if (nums[x]%10==0){
      tener=nums[x];}
    else {nums[x] = tener;}
    }
  return nums;
}


public boolean canBalance(int[] nums) {

  int front = 0;
  int back = nums.length - 1;
  int FrontSum = 0;
  int BackSum = 0;
  if (nums.length == 1){
    return false;}
  while (front<=back){
    if (FrontSum < BackSum) {
      FrontSum = FrontSum + nums[front];
      front = front + 1;}
    else {
      BackSum = BackSum + nums[back];
      back = back - 1;}
      }
    return (FrontSum==BackSum);
}


public int[] seriesUp(int n) {
    int[] intArray = new int[n * (n+1) / 2];
    
    int ArrayCounter = 0;
    
    for (int x=1; x<=n; x++){
       for (int counter = 1; counter <= x; counter++){
          intArray[ArrayCounter]=counter;
          ArrayCounter = ArrayCounter + 1;
          }
       }
    return intArray;
}


//I drew the program step by step through an entire example problem,
//and I couldn't find the problem. I did this another few times for other
//problems, but I can't seem to find an error.
public int maxMirror(int[] nums) {
  int[] reverse = new int[nums.length];
  
  for (int i=nums.length-1, x=0; i>0; i=i - 1, x++){
    reverse[x]=nums[i]; }
  
  int max = 0;
  
  for (int i=0; i<nums.length; i++){
    int counter=0;
    int BackFront=0;
    int FrontBack=i;
    boolean notContinuous=true;
    
    while (BackFront<nums.length && FrontBack<nums.length){
      if (notContinuous){
        if (nums[FrontBack]!=nums[BackFront]) {
          BackFront=BackFront + 1;}
        else {
          notContinuous=false;
          counter = 1;
          BackFront = BackFront + 1;
          FrontBack = FrontBack + 1;}
      //for if it isn't continuous
      
      //for if continuous
      }else {
        if (nums[FrontBack]==nums[BackFront]){
          counter = counter + 1;
          BackFront = BackFront + 1;
          FrontBack = FrontBack + 1;}
        else {
          FrontBack = i; //to reset it
          notContinuous = true;
           }
        }
        if (counter > max){
            max = counter;}
      }//while
    }//for
  return max;      
}


}