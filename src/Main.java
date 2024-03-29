public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend +=2;
        System.out.println(friend);
        friend /=7;
        System.out.println(friend);
        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        //Задача 6
        var boxerOneWeight = 78.2;
        var boxerTwoWeight = 82.7;
        var boxerWeightSum = boxerOneWeight + boxerTwoWeight;
        System.out.println(boxerWeightSum);
        var boxerWeightDiff = boxerTwoWeight - boxerOneWeight;
        System.out.println(boxerWeightDiff);
        //Задача 7
        var boxerWeightDivRest = boxerTwoWeight % boxerOneWeight;
        System.out.println(boxerWeightDivRest);
        //Задача 8
        var totalWorkTime = 640;
        var workerWorkTime = 8;
        var workerQuantity = totalWorkTime / workerWorkTime;
        System.out.println("Всего работников в компании - " + workerQuantity + " человек");
        workerQuantity += 94;
        totalWorkTime = workerQuantity * workerWorkTime;
        System.out.println("Если в компании работает " + workerQuantity + " человек, то всего " + totalWorkTime + " часов работы может быть поделено между сотрудниками");


    }
}