courses.stream().collect(Collectors.joining(" ")). // returns the elemengts of list separated by space.
courses.stream().collect(Collectors.joining(","))
"Spring".split("")
courses.stream().map(course -> course.split("")).collect(Collectors.toList()) // returns a stream of string arrays 
 //java.util.stream.ReferencePipeline$3@6d5380c2
  //[[Ljava.lang.String;@443b7951, [Ljava.lang.String;@14514713, [Ljava.lang.String;@69663380, [Ljava.lang.String;@5b37e0d2, [Ljava.lang.String;@4459eb14, [Ljava.lang.String;@5a2e4553] 
  
courses.stream().map(course -> course.split(""))
courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList())
  //[S, p, r, i, n, g, S, p, r, i, n, g, b, o, o, t, D, o, c, k, e, r, F, r, a, m, e, w, o, r, k, M, i, c, r, o, s, e, r, v, i, c, e, A, P, I]
courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList())
  //[S, p, r, i, n, g, b, o, t, D, c, k, e, F, a, m, w, M, s, v, A, P, I]
List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
List<String> courses2 = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course,course2))).collect(Collectors.toList())
  //[[Spring, Spring], [Spring, Springboot], [Spring, Docker], [Spring, Framework], [Spring, Microservice], [Spring, API], [Springboot, Spring], [Springboot, Springboot], [Springboot, Docker], [Springboot, Framework], [Springboot, Microservice], [Springboot, API], [Docker, Spring], [Docker, Springboot], [Docker, Docker], [Docker, Framework], [Docker, Microservice], [Docker, API], [Framework, Spring], [Framework, Springboot], [Framework, Docker], [Framework, Framework], [Framework, Microservice], [Framework, API], [Microservice, Spring], [Microservice, Springboot], [Microservice, Docker], [Microservice, Framework], [Microservice, Microservice], [Microservice, API], [API, Spring], [API, Springboot], [API, Docker], [API, Framework], [API, Microservice], [API, API]]
courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course,course2))).filter(list -> list.get(0).equals(list.get(1))).collect(Collectors.toList())
//$22 ==> [[Spring, Spring], [Springboot, Springboot], [Docker, Docker], [Framework, Framework], [Microservice, Microservice], [API, API]]
  courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course,course2))).filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList())
//[[Spring, Springboot], [Spring, Docker], [Spring, Framework], [Spring, Microservice], [Spring, API], [Springboot, Spring], [Springboot, Docker], [Springboot, Framework], [Springboot, Microservice], [Springboot, API], [Docker, Spring], [Docker, Springboot], [Docker, Framework], [Docker, Microservice], [Docker, API], [Framework, Spring], [Framework, Springboot], [Framework, Docker], [Framework, Microservice], [Framework, API], [Microservice, Spring], [Microservice, Springboot], [Microservice, Docker], [Microservice, Framework], [Microservice, API], [API, Spring], [API, Springboot], [API, Docker], [API, Framework], [API, Microservice]]
  courses.stream().flatMap(course -> courses2.stream().filter(course2 -> course2.length()==course.length()).map(course2 -> List.of(course,course2))).filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList())
// [[Spring, Docker], [Docker, Spring]]
  courses.stream().filter(courses -> courses.length()>11).map(String::toUpperCase).findFirst()
  //$25 ==> Optional[MICROSERVICE]
courses.stream().peek(System.out::println).filter(courses -> courses.length()>11).map(String::toUpperCase).peek(System.out::println).findFirst()
courses.stream().peek(System.out::println).filter(courses -> courses.length()>11).map(String::toUpperCase).peek(System.out::println)
$4.findFirst()
List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
courses.replaceAll( str -> str.toUpperCase())
List<String> modifyableCourses = new ArrayList(courses);
modifyableCourses.replaceAll(str -> str.toUpperCase())
modifyableCourses
modifyableCourses.removeIf(course -> course.length()<6)
modifyableCourses
