package test;

public class dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int temp=0;
	     int nums[]= {1,2,3,4,5,6,7};
	     int k=3;
	       
	        for(int x=0;x<k;x++){
	            temp=nums[nums.length-1];
	            for(int y=nums.length-1;y>=1;y--){
	                nums[y]=nums[y-1];
	               
	            }
	             nums[0]=temp;
	        }
	    }
	
	}

