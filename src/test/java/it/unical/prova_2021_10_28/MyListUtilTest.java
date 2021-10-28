package it.unical.prova_2021_10_28;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.joda.time.DateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	private static MyListUtil listUtil;
	
	@BeforeClass
	public static void prepare() {
		listUtil = new MyListUtil();
		System.out.println(DateTime.now());
	}
	
	@Test
	public void ascendenteWorks() {
		System.out.println(DateTime.now());
		assertEquals(Arrays.asList(1, 5, 7, 23, 37), listUtil.sort(Arrays.asList(1, 5, 37, 23, 7), 0));
		assertEquals(Arrays.asList(43, 128, 1024, 3457), listUtil.sort(Arrays.asList(1024, 43, 3457, 128), 0));
		assertEquals(Arrays.asList(2, 4, 8, 16, 32, 64,128), listUtil.sort(Arrays.asList(32, 16, 8, 64, 2, 128, 4), 0));
		System.out.println(DateTime.now());
	}
	
	@Test
	public void discendenteWorks() {
		System.out.println(DateTime.now());
		assertEquals(Arrays.asList(37, 23, 7, 5, 1), listUtil.sort(Arrays.asList(1, 5, 37, 23, 7), 1));
		assertEquals(Arrays.asList(3457, 1024, 128, 43), listUtil.sort(Arrays.asList(1024, 43, 3457, 128), 1));
		assertEquals(Arrays.asList(128, 64, 32, 16, 8, 4, 2), listUtil.sort(Arrays.asList(32, 16, 8, 64, 2, 128, 4), 1));
		System.out.println(DateTime.now());	
	}
	
	@AfterClass
	public static void finish() {
		System.out.println(DateTime.now());
	}
}
