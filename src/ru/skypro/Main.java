package ru.skypro;

public class Main {

    public static void main(String[] args) {
	    int box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);
        // задача 1
        int liftingCapacity = 50; //грузоподьемность
        int stuffWeight = 20; //вес людей
        int capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Ещё можно положить " + capacityLeft + " кг вещей");
        // задача 2
        int appleWeight = 2;
        int orangeWeight = 3;
        int fruitsWeight = appleWeight + orangeWeight;
        System.out.println("Вес фруктов " + fruitsWeight + " кг");
        int meatWeight = 4;
        int waterWeight = 5;
        int tomatoesweight = 2;
        int cucumberWeight = 2;
        int pepersWeight = 2;
        int zuciniWeight = 2;
        int vegetabalesWeight = tomatoesweight + cucumberWeight + pepersWeight + zuciniWeight;
        int foodWeight = meatWeight + waterWeight + vegetabalesWeight + fruitsWeight;
        System.out.println("Общий вес продуктов " + foodWeight + " кг!");

        int leftWeight = capacityLeft - foodWeight;
        System.out.println("Остатоль места в машине на " + leftWeight + " кг.");

        foodWeight = foodWeight * 2;
        System.out.println("Новый вес продуктов " + foodWeight);

        leftWeight = capacityLeft - foodWeight;
        System.out.println("Осталось места в машине " + leftWeight + " кг.");

        int overLoad = (foodWeight + stuffWeight) % liftingCapacity;
        System.out.println("Перегруз в машине на " + overLoad + " кг.");

        int foodInOneCar = foodWeight / 2;
        System.out.println("Продуктов в каждой машине " + foodInOneCar + " кг.");
        //

        byte bananas = 100;




    }
}
