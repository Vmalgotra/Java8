numbers.stream()
List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

numbers ==> [12, 9, 13, 4, 6, 2, 4, 12, 15]
numbers.stream()
$7 ==> java.util.stream.ReferencePipeline$Head@306a30c7. // Creating stream from list results in reference stream as the list elements are wrapper objects

numbers.stream()
Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).count()
Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).reduce(0, Integer::sum)
Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15)
int[] numberArray = {12, 9, 13, 4, 6, 2, 4, 12, 15};
Arrays.stream(numberArray)
jshell> Arrays.stream(numberArray)
$10 ==> java.util.stream.IntPipeline$Head@27fa135a     // Int stream
  
Arrays.stream(numberArray).sum()
Arrays.stream(numberArray).average()
Arrays.stream(numberArray).min()
Arrays.stream(numberArray).max()
IntStream.range(1,10) // Ans 45 range operation excludes the outer bound
IntStream.range(1,10).sum()
IntStream.rangeClosed(1,10).sum() //Ans 55 rangeclosed operation includes the outer bound
IntStream.iterate(1, e -> e + 2).limit(10).sum()
IntStream.iterate(1, e -> e + 2).limit(10).peek(System.out::println).sum() //peek helps us to look into the stream without looking into the stream.
IntStream.iterate(2, e -> e + 2).limit(10).peek(System.out::println).sum()
IntStream.iterate(2, e -> e * 2).limit(10).peek(System.out::println).sum()
IntStream.iterate(2, e -> e * 2).limit(10).boxed().collect(Collectors.toList()) // to convert to list we need to box the primitive
Integer.MAX_VALUE
Long.MAX_VALUE
IntStream.rangeClosed(1,50).reduce(1, (x,y)->x*y) // result is 0 because it exceeds the limit of integer
LongStream.rangeClosed(1,50).reduce(1, (x,y)->x*y) // -ve because the limit of long
LongStream.rangeClosed(1,50).reduce(1L, (x,y)->x*y)  // -ve because the limit of long
LongStream.rangeClosed(1,10).reduce(1, (x,y)->x*y) 
LongStream.rangeClosed(1,20).reduce(1, (x,y)->x*y)
LongStream.rangeClosed(1,40).reduce(1, (x,y)->x*y) // -ve because the limit of long
LongStream.rangeClosed(1,50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply)
