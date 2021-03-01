import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSort {
	static int[] arr = new int[6];
	static int[] arr1 = new int[6];
	@BeforeClass
	public static void BeforeClass() throws Exception {
		  for (int i = 0; i < arr.length; i++) {
			  int rnd = (int) (Math.random() * 31) + 45;
			  arr[i]=rnd;
	        }
		  System.out.println("Не отсортированный массив:" + Arrays.toString(arr));
	}

	@AfterClass
	public static void AfterClass() throws Exception {
		System.out.println("Отсортированный массив:" + Arrays.toString(arr1));
	}

	@Test
	public void test() {
		for (int i = 0; i < arr.length; i++) {
		      for (int j = 0; j < arr.length; j++) {
		          if (arr[j] > arr[i]) {
		             int aj = arr[j];
		             int ai = arr[i];
		             arr[j] = ai;
		             arr[i] = aj;
		          }
		      }
		  }
		arr1 = arr;
		for (int i = 0; i < arr1.length-1; i++) {
	    	  assertTrue(arr1[i]<=arr1[i+1]);
		          }
		      }
		  }