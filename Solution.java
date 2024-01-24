import java.util.Arrays;
public class Solution {

	public static void main(String[] args){
		int[] number1 = {1,2,3,4,5,5,7,8,9};
		int[] array = findErrorNums(number1);
		System.out.println(Arrays.toString(array));
		
	}
 public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int checker = 0;
	if(nums.length == 2){
          
                  if (nums[0]==1 && nums[1] == 1){
                    for(int count = 0; count<nums.length;count++){
                 	 for(int counter = count+1;counter<nums.length;counter++){
                           if(nums[count]==nums[counter]){
                                 result[0] = nums[counter];
                                 result[1] = nums[count]+1;
                            } 
			 }  
                        }           
                     }
				else{
                          		 for(int count = nums.length-1; count>=0;count--){
               				   for(int counter = count-1; counter>=0;counter--){
                              			    if(nums[count]==nums[counter]){
                                      			   result[0] = nums[count];
                                     			     result[1] = nums[count]-1;
                                  		   }
                  			  }

                                   
                            		}    
                 		}

           }else{  
  		int[] array = Arrays.copyOf(nums,nums.length);
			
		Arrays.sort(nums);
		if(array[nums.length-1]==nums[nums.length-1]){
			
                 for(int count = 0; count<nums.length;count++){
			//{1,2,2,4};
                  for( int counter = count+1;counter<nums.length;counter++){
                           if(array[counter]-array[count]==2 ){
				
                                 result[0] = array[counter];
                                 result[1] = array[counter]-1;
				break;
                            } 
				else if(array[counter]-array[count]==0 ){
                                         result[0] = array[counter];
                                          result[1] = array[count]+1;
					break;
                                     } 
				checker = counter;
				break;

		}
			if(nums[checker]-nums[count]==2 || nums[checker]-nums[count]==0){
				break;
		}
		}
																									}else if(array[nums.length-1]!=nums[nums.length-1]){
					for(int count1 = nums.length-1;count1>=0;count1--){
				
							for(int count2 = count1-1;count2>=0;count2--){
								  if(nums[count2]-nums[count1]==2){
                             						    result[0] = nums[count2];
                            						     result[1] = nums[count2]+1;
										
											break;
                         					   } 
								else if(nums[count2]-nums[count1]==0){
                                   				      result[0] = nums[count2];
                                       				   result[1] = nums[count1]-1;
									
									break;
                                 				    } 
								
								checker = count2;
									break;
							}
							if(nums[checker]-nums[count1]==2 || nums[checker]-nums[count1]==0){
									break;
							}
							
					}
		}
		}
				
                return result;
    }
}