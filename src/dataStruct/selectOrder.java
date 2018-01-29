package dataStruct;

import javax.xml.stream.events.StartDocument;

public class selectOrder {
	
	public static void selectSort(int[] array){
		for(int i=0;i<array.length;i++){
			int min=array[i];
			int index=i;
			for(int j=i;j<array.length;j++){
				if(array[j]<min)
				{
					index=j;
					min=array[j];
				}
			}
			array[index]=array[i];
			array[i]=min;
			
		}
	}
    
	
	public static void insertSort(int[] array){
		int j;
		for(int i=1;i<array.length;i++){
			if(array[i-1]>array[i]){
				int temp=array[i];
				for(j=i-1;j>=0&&array[j]>temp;j--){
						array[j+1]=array[j];
						
					}
				array[j+1]=temp;
				}
			}
		}
	
	public static void bubbleSort(int[] array){
		for(int i=array.length-1;i>=1;i--){
			for(int j=0;j<i;j++){
				if(array[j]>array[j+1]){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
		
    
	public static void merge(int[] r,int[] r1,int s,int m,int t){
		int start1=s;int start2=m+1;int index=s;
		while((start1<=m)&&(start2<=t)){
			if(r[start1]<r[start2]){
			     r1[index++]=r[start1++];
			}
			else{
				r1[index++]=r[start2++];
			}
		}
		while(start1<=m){
			r1[index++]=r[start1++];
		}
		while(start2<=t){
			r1[index++]=r[start2++];
		}
	}
	
	public static void mergePass(int[] r,int[] r1,int end,int h){
		int start=0;
		while((start+2*h-1)<=end){
			merge(r, r1, start, start+h-1, start+2*h-1);
		    start+=2*h;
		}
		if((start+h-1)<end){
			merge(r, r1, start, start+h-1, end);
		}
		else{
	    	while(start<=end){
	    		r1[start++]=r[start++];
	    	}
	    	
	    }
	}
	
	public static void mergeSort(int[] r,int[] r1,int n){
		int h=1;
		while(h<n){			
			mergePass(r,r1,n,h);
			h=2*h;
			mergePass(r, r1, n, h);
			h=2*h;
		}
	}
	
	public static int partition(int[] array,int first,int end){
		while(first<end){
			while(first<end&&array[first]<array[end])
				end--;
			if(first<end){
				int temp=array[end];
				array[end]=array[first];
				array[first]=temp;
			}
			while(first<end&&array[first]<array[end])
				first++;
			if(first<end){
				int temp=array[end];
				array[end]=array[first];
				array[first]=temp;
			}		
		}
		return first;
	}
	
	public static void quickSort(int[] array,int first,int end){
		if(first<end){
			int pivot=partition(array, first, end);
			quickSort(array, first, pivot-1);
			quickSort(array, pivot+1, end);
		}
	}

	public static void shellSort(int[] array){
		int i,j,temp;
		int length=array.length;
		int gap=length;
		do{
			gap=gap/2;
			for(i=gap;i<length;i++){
				if(array[i]<array[i-gap]){
					temp=array[gap];
					for(j=i-gap;j>=0&&array[j]>temp;j-=gap){
						array[j+gap]=array[j];
					}
					array[j+gap]=temp;
				}
				
			}
		}while(gap>0);
	}
	
	public static void adjustMaxHeap(int[] array,int s,int length){
		int temp=array[s];
		int child;
		for(child=2*s+1;child<=length-1;child=child*2+1){
			if(child<length-1&&array[child]<array[child+1]){
				child++;
			}
			if(array[child]>temp){
				array[s]=array[child];
			}else{
				break;
			}
			array[child]=temp;
			s=child;
		}
	}

    public static void wrap(int[] array,int i,int j){
    	int temp=array[i];
    	array[i]=array[j];
    	array[j]=temp;
    }
	
    public static void heapSort(int[] array){
    	int length=array.length;
    	for(int i=length/2-1;i>=0;i--){
    		adjustMaxHeap(array, i, length);
    	}
    	for(int i=length-1;i>0;i--){
    		wrap(array, 0, i);
    		adjustMaxHeap(array, 0, i);
    	}
    }
	   
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        int[] array={3,1,23,2,3};
        int[] array1=new int[5];
       // selectOrder.selectSort(array);
       // selectOrder.insertSort(array);
        selectOrder.mergeSort(array, array1, 4);
        for(int i:array){
        	System.out.println(i);
        }
	}

}
