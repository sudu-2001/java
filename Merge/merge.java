import java.util.*;

public class merge{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of an array: ");

		int n=sc.nextInt();

		int[] arr=new int[n];

		for(int i=0;i<n;i++){

			System.out.println("Enter the array elements: ");

			arr[i]=sc.nextInt();

		}

		System.out.println("The array elements: "+Arrays.toString(arr));

		mergesort(arr,0,n-1);

		System.out.println("The array after sorting will be: "+Arrays.toString(arr));

	}

	public static void mergesort(int[] arr,int l,int r){

		if(l<r){

			int mid=l+(r-l)/2;

			mergesort(arr,l,mid);

			mergesort(arr,mid+1,r);

			merge(arr,l,mid,r);

		}

	}

	public static void merge(int[] arr,int l,int mid,int r){

		int n1=mid-l+1;

		int n2=r-mid;

		int[] larr=new int[n1];

		int[] rarr=new int[n2];

		for(int i=0;i<n1;i++){

			larr[i]=arr[l+i];

		}

		for(int j=0;j<n2;j++){

			rarr[j]=arr[mid+1+j];

		}

		int i=0;

		int j=0;

		int k=l;

		while(i<n1 && j<n2){

			if(larr[i]<=rarr[j]){

				arr[k]=larr[i];

				i++;

			}

			else{

				arr[k]=rarr[j];

				j++;

			}

			k++;

		}

		while(i<n1){

			arr[k]=larr[i];

			i++;

			k++;

		}

		while(i<n2){

			arr[k]=rarr[j];

			i++;

			k++;

		}

	}

}
