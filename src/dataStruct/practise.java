package dataStruct;

import io.netty.buffer.SwappedByteBuf;

public class practise {
	//选择排序，从小到大排
   public void selectSort(int[] array){
	   for(int i=0;i<array.length;i++){
		   for(int j=i;j<array.length;j++){
			   if(array[i]>array[j]){
				   swap(array, i, j);
			   }
		   }
	   }
   }
   
   public void insertSort3(int[] array){
	   for(int i=1;i<array.length;i++){
		   if(array[i]<array[i-1]){
			   int j=i-1;
			   int temp=array[i];
			   while(j>=0&&array[j]>temp){
				   array[j+1]=array[j];
				   j--;
			   }
			   array[j+1]=temp;
		   }
	   }
   }
   
   //插入排序，从小到大排
   public void insertSort(int[] array){
	   int temp,j;
	   //注意i从1个开始插入，表示原先数组只有1个，然后到2个，3个或者多个
	   for(int i=1;i<array.length;i++){
		   //i表示第i个要插入的值，判断和第i-1个大小，如果大于等于，则直接插入位置i，即不做处理
		   //小于，则表示要从i-1个中插入进去
		   if(array[i]<array[i-1]){			  
			   temp=array[i];		
			   //注意起始是i-1,并且判断条件是j>=0
			   //如果第j个数都比temp要大，说明temp会插在这些数的前面，因此这些数需要后移动
			   for(j=i-1;j>=0&&array[j]>temp;j--){
				   array[j+1]=array[j];
			   }
			   //如果第j个数小于temp，则表示temp要插入到第j+1个位置中
			   array[j+1]=temp;
		   }
	   }
   }
   
  
   
   public void insertSort2(int[] array){
	   int temp,j;
	   for(int i=1;i<array.length;i++){
		   if(array[i-1]>array[i]){
			   temp=array[i];
			   for(j=i-1;j>=0&&array[j]>temp;j--){
				   array[j+1]=array[j];
			   }
			   array[j+1]=temp;
		   }
	   }
   }
  
   public void bubbleSort2(int[] array){
	   int j=array.length-1;
	   while(j>=1){
		   for(int i=0;i<j;i++){
			   if(array[i]>array[i+1]){
				   swap(array, i, i+1);
			   }
		   }
		   j--;
	   }
   }
   
   //冒泡排序
   public void bubbleSort(int[] array){
	   //冒泡是冒到最后，因此循环的逻辑都是以最后一个泡为终点的
	   int j=array.length-1;
	   while(j>=1){
		   for(int i=0;i<j;i++){
			   if(array[i]>array[i+1]){
				   swap(array, i, i+1);
			   }
		   }
		   j--;
	   }
   }
   
   public void merge2(int[] before,int[] after,int start,int middle,int end){
	   int i=start;
	   int j=middle+1;
	   int k=start;
	   while((i<=middle)&&(j<=end)){
		   if(before[i]<before[j]){
			   after[k++]=before[i++];
		   }
		   else{
			   after[k++]=before[j++];
		   }
	   }
	   while(i<=middle){
		   after[k++]=before[i++];
	   }
	   while(j<=end){
		   after[k++]=before[j++];
	   }
   }
   
   public void mergePass2(int[] before,int[] after,int start,int h,int end){
	  int i=start;
	  while((i+2*h-1)<=end){
		  merge(before, after, i, i+h-1, i+2*h-1);
		  i+=2*h;
	  }
	  if((i+h-1)<end){
		  merge(before, after, i, i+h-1, end);
	  }
	  else{
		  while(i<end){
			  after[i]=before[i];
			  i++;
		  }
	  }
   }
   
   public void mergeSort2(int[] array,int[] after){
	   int end=array.length-1;
	   int h=1;
	   while(2*h<=end){
		   mergePass2(array, after, 0, h, end);
		   h=2*h;
		   mergePass2(after, array, 0, h, end);
		   h=2*h;
	   }
   }

   //一次归并行为,before是归并前的数组，after是归并后的数组
   public void merge(int[] before,int[] after,
		   int start,int middle,int end){
	  int i=start;int j=middle+1;int k=start;
	  while(i<=middle&&j<=end){
		  //哪边小，就把那边的值放入归并后的数组中，直到某一边的塞满了
		  //归并的时候，认为2个归并的数组都是有序的
		  if(before[i]<before[j]){
			  after[k++]=before[i++];
		  }
		  else{
			  after[k++]=before[j++];
		  }
	  }
	  while(i<=middle){
		  after[k++]=before[i++];
	  }
	  while(j<=end){
		  after[k++]=before[j++];
	  }
   }
   
   //进行一次归并排序,2个有序序列的长度,lastNum是数组的最大下标
   public void mergePass(int[] before,int[] after,int h,int lastNum){
	   int i=0;
	   while((i+2*h-1)<=lastNum){
		   merge(before, after, i, i+h-1, i+2*h-1);
		   i+=2*h;
	   }
	   //如果剩下的左边序列没有大于总数，则需归并
	   if((i+h-1)<lastNum){
		   merge(before, after,i, i+h-1, lastNum);
	   }
	   //剩下的左边序列大于总数，则无需归并
	   else{
		   while(i<=lastNum){
			   after[i]=before[i];
			   i++;
		   }		   
	   }
   }
   
   //归并排序
   public void mergeSort(int[] before,int[] after){
	   int lastNum=before.length-1;
	   int h=1;
	  //注意，由于在mergePass中需要的是lastNum，即数组最大下标，
	   //此处也用了lastNum，那么在h和最后一个数组相等的时候，表示以这个h为间隔还没有进
	   //行过归并，因此在等于的时候要再归并一次
	   while(h<=lastNum){
		   mergePass(before, after, h, lastNum);
		   h=2*h;
		   mergePass(after, before, h, lastNum);
		   h=2*h;
	   }
   }
   
   public int partition11(int[] array,int first,int end){
	   int i=first;int j=end;
	   while(i<j){
		   while(i<j&&array[i]<array[j]){
			   j--;
		   }
		   if(i<j){
			   swap(array, i, j);
			   i++;
		   }
		   while(i<j&&array[i]<array[j]){
			   i++;
		   }
		   if(i<j){
			   swap(array, i, j);
		   }
	   }
	   return j;
   }
   
   public void fastSort2(int[] array,int first,int end){
	   if(first<end){
		   int middle=partition(array, first, end);
		   fastSort2(array, first, middle-1);
		   fastSort2(array, middle+1, end);
	   }
   }
   
   
   public int partition(int[] array,int first,int end){
	   int i=first;int j=end;
	   //注意此处所有的判断条件都是i<j
	   while(i<j){
		   while(i<j&&array[i]<array[j]){
			   j--;
		   }
		   if(i<j){
			   swap(array, i, j);
			   i++;
		   }
		   while(i<j&&array[i]<array[j]){
			   i++;
		   }
		   if(i<j){
			   swap(array, i, j);
		   }
	   }
	   return j;
   }
   
  
   
   public void fastSort(int[] array,int first,int end){
	   if(first<end){
		   int middle=partition(array, first, end);
		   fastSort(array, first, middle-1);
		   fastSort(array, middle+1, end);
	   }
   }
   public void swap(int[] array,int i,int j){
	       int temp=array[i];
	       array[i]=array[j];
	       array[j]=temp;
   }
   
   //希尔排序,就是分组进行插入排序
   public void shellSort(int[] array){
	   int length=array.length;
	   int j;
	   int gap=length;
	   do{
		   gap=gap/2;
		   //插入排序，只不过需要每个跳跃gap个值，而不是1
		   for(int i=gap;i<length;i++){
			   if(array[i-gap]>array[i]){
				   int temp=array[i];
				   for(j=i-gap;j>=0&&array[j]>temp;j=j-gap){
					   array[j+gap]=array[j];
				   }
				   array[j+gap]=temp;
			   }
		   }		  
	   }
	   //注意此处用while，并且gap>0不能等于0
	   while(gap>0);
   }
   
   //构建堆，length表示需要构建的长度，此处不是array的长度是因为后续可能不用那么长
   //s是父节点的起始位置，注意如果从小到大排序应该用最大堆
   //此处假定的是当前的堆，最大值一定是最上面的那个
   public void buildHeap(int[] array,int s,int length){
	   int temp=array[s];
	   int child;
	   //最后一项，选取当前孩子的左孩子
	   for(child=2*s+1;child<=length-1;child=child*2+1){
		   //如果child=length-1，则说明没有右孩子
		   if((child<length-1)&&(array[child+1]>array[child])){			
				   child++;
		   }
		   //孩子和父节点进行比较,注意此处s=child不能少，因为后面需要让当前孩子跟他的孩子比较
		   //万一还需要交换，用array[s]能找到当前孩子而不会找到最初的那个值
		   if(array[child]>temp){
			   array[s]=array[child];
			   array[child]=temp;
			   s=child;
		   }else{
			   break;
		   }
	   }
   }
   
   public void heapSort(int[] array){
	   //要从最小的一个二叉树开始，最后一个有节点的二叉树的父节点位置是length/2，
	   //按照数组中的位置还需要减一
	   //父子节点关系是s子=2*s父，s是位置
	   //因此算子节点在数组中的位置就是2*(s+1)-1,s为父在数组中的位置
	   //从最小的二叉树开始，一个个构建最大堆
	for(int i=array.length/2-1;i>=0;i--){
		buildHeap(array, i, array.length);
	}
	//交换最后一个值和最上面堆的值，交换后利用堆的特性自动换位置
	for(int i=array.length-1;i>0;i--){
		swap(array, 0, i);
		buildHeap(array, 0, i);
	}
   }
   
   public static void main(String[] args){
	   practise pt=new practise();
	   int[] testArray={2,1,4,3,5,7};
	   int[] afterArray=new int[6];
	  pt.bubbleSort2(testArray);
	   for (int i : testArray) {
		System.out.println(i);
	}
   }
	
}
