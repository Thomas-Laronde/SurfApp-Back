////// Exercice sur les expressions lambda /////

// Transforme ce code en utilisant une expression lambda.

List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

Collections.sort(numbers, new Comparator<Integer>() {
    @Override
    public int compare(Integer n1, Integer n2) {
        return n1.compareTo(n2);
    }
});

System.out.println(numbers);

// Réponse -> 

List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
return Collections.sort((n1, n2) -> n1.compareTo(n2));

