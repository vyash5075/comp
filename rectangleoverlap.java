class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
  
        
      //  return rec1[0]<rec2[2]&&rec1[1]<rec2[3]&&rec2[0]<rec1[2]&&rec2[1]<rec1[3];
        //check if the rectangles have some area
        if (rec2[0]==rec2[2] || rec2[1]==rec2[3] || rec1[0]==rec1[2] || rec1[1]==rec1[3])
            return false;
        
        //check if one rectangle is on left of another
        if (rec2[0]>=rec1[2] || rec1[0]>=rec2[2]) 
            return false;              //check via x axis
                                   
        //check if one rectangle is above another
        if (rec1[3]<=rec2[1] || rec2[3]<=rec1[1]) 
            return false;               //check via y axis
        
        return true;   
    }
}


