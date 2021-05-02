package vipul;

import java.util.stream.LongStream;

public class Performance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long time = System.currentTimeMillis();
		//System.out.println(LongStream.range(0, 10000000).sum());
		//49999995000000
		//35 ms
		
		// Using parallel we can make use of multiple cores. In functional programming we can do operations in parallel because ther eis no state bbut in structured programming
// we store state in variables and which makes parallelism difficult
		System.out.println(LongStream.range(0, 10000000).parallel().sum());
		
		System.out.println(System.currentTimeMillis() - time);
		
		
	}
