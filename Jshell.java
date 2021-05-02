List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
numbers.stream().reduce(0, (x,y)->x+y)
numbers.stream().reduce(0, (x,y)->x) // always returns 0 because for every operation it is returing x andin first case x=0 and for all cases x will be 0
numbers.stream().reduce(0, (x,y)->y)
numbers.stream().reduce(0, (x,y)-> x>y ? x:y) /// returns max value from list in case list is having +ve numbers
numbers.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x:y) //returns max value from list in case list even if there are negative integers
numbers.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y ? y:x) // always returns th value of Integer.MIN_VALUE since for each iteration x will be returned
numbers.stream().reduce(Integer.MAX_VALUE, (x,y)-> x>y ? y:x) //returns min value from list in case list even if there are negative integers
numbers.stream().reduce(0, (x,y) -> x*x + y*y)
numbers.stream().map(x -> x*x).reduce(0, Integer::sum)
numbers.stream().map(x -> x*x*x).reduce(0, Integer::sum)
numbers.stream().filter(x -> x%2==1).reduce(0, Integer::sum)
numbers.stream().filter(x -> x%2==0).reduce(0, Integer::sum)
numbers.stream().distinct().forEach(System.out::println)
numbers.stream().sorted().forEach(System.out::println)
numbers.stream().distinct().sorted().forEach(System.out::println)
List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
courses.stream().sorted().forEach(System.out::println)
courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println)
courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println)
courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println)
courses.stream().map(x -> x.length()).collect(Collectors.toList()) //takes a list and returns a list
numbers.stream().map(x -> x*x).collect(Collectors.toList())
