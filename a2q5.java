import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a2q5{

    public static void main(String[] args){

        int[][] list= {{10,12},{11,12},{10,11},{2,8},{6,10},{10,10}};
        
    

        int mid=list.length/2;

        int left[][] = new int[mid][2];
        int right[][]= new int[list.length-mid][2];
        List<Integer> ansL  = new ArrayList<Integer>(); 
        List<Integer> ansR  = new ArrayList<Integer>();
         
        int stationL=0;
        int stationR=0;
        int largeL=-1;
        int indexL=0,indexR=0; 
        int x1=0,x2=0,y1=0,y2=0;
        Boolean inLeft=false;
        Boolean inRight=false;

        //first two for loops split the input lsit into two divide
        for (int i=0; i< mid; i++){
                left[i][0]= list[i][0];
                left[i][1]= list[i][1];
                
        }
        int coutner=0;
        for (int i=mid;i<list.length;i++){
                right[coutner][0]= list[i][0];
                right[coutner][1]= list[i][1];
                coutner+=1;
        }

        // the next two nested for loops gose throught the left and right side of the input list and 
        for (int i=0; i< left.length; i++){
            
            stationL=0;
            for (int j=0; j<left.length;j++){
                x1= left[i][0];
                y1= left[i][1];
                x2= left[j][0];
                y2= left[j][1];

                if(x1>x2 && y1>y2){
                    stationL+=1;
                }
            }
            
            if (stationL>0){
            if(stationL>largeL){
                largeL=stationL;
                indexL=i;
                ansL.clear();
            }
            
            else if(stationL==largeL){
                ansL.add(i);
                inLeft= true;
            }
        }

        }

        int largeR=-1;

         for (int i=0; i< right.length; i++){
            
            stationR=0;
            for (int j=0; j<right.length;j++){
                x1= right[i][0];
                y1= right[i][1];
                x2= right[j][0];
                y2= right[j][1];

                if(x1>x2 && y1>y2){
                    stationR+=1;
                }
            }
   
            if (stationR>0){
            if(stationR>largeR){
                largeR=stationR;
                indexR=i;
                ansR.clear();
            }
            
            else if(stationR==largeR){
                ansR.add(i);
                inRight=true;

            }
        }

        }
            if(inLeft==false && inRight==false){
                x1= left[indexL][0];
                y1= left[indexL][1];
                x2= right[indexR][0];
                y2= right[indexR][1];
                if (x1>x2 && y1>y2){
                    largeL=largeL+largeR;
                    System.out.println("the ansswer is ("+x1+","+y1+") and the numebr of stations are "+largeL);
                }
                else{
                    largeR=largeR+largeL;
                     System.out.println("the ansswer is ("+x2+","+y2+") and ( "+x1+ ","+y1+")  the numebr of stations are "+largeR);
                }

            }

            else{

                if(largeL>largeR){
                    if(inLeft==true){
                        System.out.print("The answers are ");
                        for (int j=0; j<ansL.size();j++){
                            System.out.print(ansL.get(j));
                            
                        }
                    }
                    else{
                    largeL=largeL+largeR;
                    System.out.println("the answer is ("+x1+","+y1+") and the numebr of stations are "+largeL);

                    }
                }
                else{
                    if(inLeft==true && inRight== true){
                        System.out.print("The answers are ");
                        for (int j=0; j<ansL.size();j++){
                            System.out.print(ansL.get(j)+" ");
                            
                        }
                
                        for (int j=0; j<ansR.size();j++){
                            System.out.print(ansR.get(j)+" ");
                            
                            
                        }
                    }           
                    else if (inLeft==true && inRight== false){
                        System.out.print("The answers are ");
                        for (int j=0; j<ansL.size();j++){
                            System.out.print(ansL.get(j)+" ");
                            
                            
                        }
                        x1= left[indexL][0];
                        y1= left[indexL][1];
                        System.out.print("("+x1+","+y1+")");
                    }

                     else if (inLeft==false && inRight== true){
                        System.out.print("The answers are ");
                        for (int j=0; j<ansR.size();j++){
                            System.out.print("("+right[ansR.get(j)][0]+","+right[ansR.get(j)][1]+") ");
                            
                            
                        }
                        x1= left[indexR][0];
                        y1= left[indexR][1];
                        System.out.print("("+x1+","+y1+")");
                    }
                }
                
            }

            

        

        



    }

}