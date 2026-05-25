package Arrays;
//forEach loop is used to traverse array elements without using index(also called as enhanced for loop)
public class ForEach {
    static void main() {
        int [] arr = {2,4,6,7,8,5};
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
//syntax: for(datatype variable : ArrayName ){
//use variable;}
