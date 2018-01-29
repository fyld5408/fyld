package dataStruct;

import io.netty.buffer.SwappedByteBuf;

public class practise {
	//ѡ�����򣬴�С������
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
   
   //�������򣬴�С������
   public void insertSort(int[] array){
	   int temp,j;
	   //ע��i��1����ʼ���룬��ʾԭ������ֻ��1����Ȼ��2����3�����߶��
	   for(int i=1;i<array.length;i++){
		   //i��ʾ��i��Ҫ�����ֵ���жϺ͵�i-1����С��������ڵ��ڣ���ֱ�Ӳ���λ��i������������
		   //С�ڣ����ʾҪ��i-1���в����ȥ
		   if(array[i]<array[i-1]){			  
			   temp=array[i];		
			   //ע����ʼ��i-1,�����ж�������j>=0
			   //�����j��������tempҪ��˵��temp�������Щ����ǰ�棬�����Щ����Ҫ���ƶ�
			   for(j=i-1;j>=0&&array[j]>temp;j--){
				   array[j+1]=array[j];
			   }
			   //�����j����С��temp�����ʾtempҪ���뵽��j+1��λ����
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
   
   //ð������
   public void bubbleSort(int[] array){
	   //ð����ð��������ѭ�����߼����������һ����Ϊ�յ��
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

   //һ�ι鲢��Ϊ,before�ǹ鲢ǰ�����飬after�ǹ鲢�������
   public void merge(int[] before,int[] after,
		   int start,int middle,int end){
	  int i=start;int j=middle+1;int k=start;
	  while(i<=middle&&j<=end){
		  //�ı�С���Ͱ��Ǳߵ�ֵ����鲢��������У�ֱ��ĳһ�ߵ�������
		  //�鲢��ʱ����Ϊ2���鲢�����鶼�������
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
   
   //����һ�ι鲢����,2���������еĳ���,lastNum�����������±�
   public void mergePass(int[] before,int[] after,int h,int lastNum){
	   int i=0;
	   while((i+2*h-1)<=lastNum){
		   merge(before, after, i, i+h-1, i+2*h-1);
		   i+=2*h;
	   }
	   //���ʣ�µ��������û�д�������������鲢
	   if((i+h-1)<lastNum){
		   merge(before, after,i, i+h-1, lastNum);
	   }
	   //ʣ�µ�������д���������������鲢
	   else{
		   while(i<=lastNum){
			   after[i]=before[i];
			   i++;
		   }		   
	   }
   }
   
   //�鲢����
   public void mergeSort(int[] before,int[] after){
	   int lastNum=before.length-1;
	   int h=1;
	  //ע�⣬������mergePass����Ҫ����lastNum������������±꣬
	   //�˴�Ҳ����lastNum����ô��h�����һ��������ȵ�ʱ�򣬱�ʾ�����hΪ�����û�н�
	   //�й��鲢������ڵ��ڵ�ʱ��Ҫ�ٹ鲢һ��
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
	   //ע��˴����е��ж���������i<j
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
   
   //ϣ������,���Ƿ�����в�������
   public void shellSort(int[] array){
	   int length=array.length;
	   int j;
	   int gap=length;
	   do{
		   gap=gap/2;
		   //��������ֻ������Ҫÿ����Ծgap��ֵ��������1
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
	   //ע��˴���while������gap>0���ܵ���0
	   while(gap>0);
   }
   
   //�����ѣ�length��ʾ��Ҫ�����ĳ��ȣ��˴�����array�ĳ�������Ϊ�������ܲ�����ô��
   //s�Ǹ��ڵ����ʼλ�ã�ע�������С��������Ӧ��������
   //�˴��ٶ����ǵ�ǰ�Ķѣ����ֵһ������������Ǹ�
   public void buildHeap(int[] array,int s,int length){
	   int temp=array[s];
	   int child;
	   //���һ�ѡȡ��ǰ���ӵ�����
	   for(child=2*s+1;child<=length-1;child=child*2+1){
		   //���child=length-1����˵��û���Һ���
		   if((child<length-1)&&(array[child+1]>array[child])){			
				   child++;
		   }
		   //���Ӻ͸��ڵ���бȽ�,ע��˴�s=child�����٣���Ϊ������Ҫ�õ�ǰ���Ӹ����ĺ��ӱȽ�
		   //��һ����Ҫ��������array[s]���ҵ���ǰ���Ӷ������ҵ�������Ǹ�ֵ
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
	   //Ҫ����С��һ����������ʼ�����һ���нڵ�Ķ������ĸ��ڵ�λ����length/2��
	   //���������е�λ�û���Ҫ��һ
	   //���ӽڵ��ϵ��s��=2*s����s��λ��
	   //������ӽڵ��������е�λ�þ���2*(s+1)-1,sΪ���������е�λ��
	   //����С�Ķ�������ʼ��һ������������
	for(int i=array.length/2-1;i>=0;i--){
		buildHeap(array, i, array.length);
	}
	//�������һ��ֵ��������ѵ�ֵ�����������öѵ������Զ���λ��
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
