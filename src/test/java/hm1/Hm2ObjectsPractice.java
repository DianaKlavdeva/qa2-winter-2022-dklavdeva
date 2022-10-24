package hm1;

import org.junit.jupiter.api.Test;

public class Hm2ObjectsPractice {
    @Test
    public void workingWithBoy() {
        Boy firstBoy = new Boy();

        firstBoy.setAge(30);
        firstBoy.setClothingSize('M');
        firstBoy.setName("Tom");
        firstBoy.setHeight(180);
        firstBoy.setWeight(75.30);
        firstBoy.setEyeColor("blue");
        firstBoy.setShoeSize(42);

        Boy secondBoy = new Boy();
        secondBoy.setAge(25);
        secondBoy.setClothingSize('S');
        secondBoy.setName("Peter");
        secondBoy.setHeight(190);
        secondBoy.setWeight(70.00);
        secondBoy.setEyeColor("green");
        secondBoy.setShoeSize(45);

        System.out.println("Hello, boys!");
        System.out.println("1st boy:");
        System.out.println(firstBoy.getAge());

        System.out.println("2nd boy:");
        System.out.println(secondBoy.getAge());
    }

    @Test
    public void workingWithBus() {
        Bus firstBus = new Bus();

        firstBus.setManufacturer("Volvo");
        firstBus.setDoorQuantity(3);
        firstBus.setAirConditioning(true);

        Bus secondBus = new Bus();
        secondBus.setColour("red");
        secondBus.setSeatQuantity(53);
        secondBus.setLength(10.50);

        System.out.println("My new bus");
        System.out.println("1st bus:");
        System.out.println(firstBus.getManufacturer());

        System.out.println("2nd bus:");
        System.out.println(secondBus.getColour());
        System.out.println(secondBus.getSeatQuantity());
    }

    @Test
    public void workingWithCake() {
        Cake firstCake = new Cake();

        firstCake.setCakeName("Vecriga");
        firstCake.setCalories(540);
        firstCake.setWeight(100.00);

        Cake secondCake = new Cake();
        secondCake.setCakeName("Eklers");
        secondCake.setGlutenFree(false);
        secondCake.setSugar(10.25);

        System.out.println("Favourite cake");
        System.out.println("1st cake:");
        System.out.println(firstCake.getCakeName());
        System.out.println(firstCake.getCalories());

        System.out.println("2nd cake:");
        System.out.println(secondCake.getCakeName());
        System.out.println(secondCake.getSugar());
        System.out.println(secondCake.isGlutenFree());
    }

    @Test
    public void WorkingWithCarpet() {
        Carpet firstCarpet = new Carpet();

        firstCarpet.setLength(2.50);
        firstCarpet.setWidth(2.00);
        firstCarpet.setPrice(58.90);

        Carpet secondCarpet = new Carpet();
        secondCarpet.setLength(3.63);
        secondCarpet.setWidth(2.58);
        secondCarpet.setColour("grey");
        secondCarpet.setProfessionalCleaning(true);

        System.out.println("Carpets shop");
        System.out.println("1st carpet:");
        System.out.println(firstCarpet.getLength());
        System.out.println(firstCarpet.getWidth());

        System.out.println("2nd carpet:");
        System.out.println(secondCarpet.getLength());
        System.out.println(secondCarpet.getColour());
        System.out.println(secondCarpet.isProfessionalCleaning());
    }

    @Test
    public void WorkingWithCoffeeMachine() {
        CoffeeMachine firstCoffeeMachine = new CoffeeMachine();

        firstCoffeeMachine.setBrand("Philips");
        firstCoffeeMachine.setFinishing("plastic");
        firstCoffeeMachine.setWaterContainerCapacity(1.5);

        CoffeeMachine secondCofeeMachine = new CoffeeMachine();
        secondCofeeMachine.setBrand("Electrolux");
        secondCofeeMachine.setColour("black");
        secondCofeeMachine.setAromaFunction(true);

        System.out.println("We love coffee");
        System.out.println("1st coffee machine:");
        System.out.println(firstCoffeeMachine.getBrand());
        System.out.println(firstCoffeeMachine.getWaterContainerCapacity());

        System.out.println("2nd coffee machine:");
        System.out.println(secondCofeeMachine.getBrand());
        System.out.println(secondCofeeMachine.getColour());
        System.out.println(secondCofeeMachine.isAromaFunction());
    }

    @Test
    public void WorkingWithFanta() {
        Fanta firstFanta = new Fanta();

        firstFanta.setPrice(0.89);
        firstFanta.setVolume(0.50);
        firstFanta.setBarcode(123456789);

        Fanta secondFanta = new Fanta();
        secondFanta.setPrice(0.56);
        secondFanta.setVolume(0.250);
        secondFanta.setZeroSugar(false);

        System.out.println("Fanta");
        System.out.println("1st Fanta:");
        System.out.println(firstFanta.getPrice());
        System.out.println(firstFanta.getVolume());

        System.out.println("2nd Fanta:");
        System.out.println(secondFanta.getPrice());
        System.out.println(secondFanta.getVolume());
        System.out.println(secondFanta.isZeroSugar());
    }

    @Test
    public void WorkingWithHouse() {
        House firstHouse = new House();

        firstHouse.setAddress("Vienibas 42, Daugavpils");
        firstHouse.setDoorQuantity(3);
        firstHouse.setApartmentPrice(24.500);

        House secondHouse = new House();
        secondHouse.setAddress("Vienibas 44, Daugavpils");
        secondHouse.setApartmentPrice(30.500);
        secondHouse.setCurrencyPrice('€');

        System.out.println("Sweet home");
        System.out.println("1st house:");
        System.out.println(firstHouse.getAddress());
        System.out.println(firstHouse.getApartmentPrice());

        System.out.println("2nd house:");
        System.out.println(secondHouse.getAddress());
        System.out.println(secondHouse.getApartmentPrice());
        System.out.println(secondHouse.getCurrencyPrice());
    }
@Test
    public void WorkingWithSofa() {
        Sofa firstSofa = new Sofa();

        firstSofa.setColour("grey");
        firstSofa.setPrice(632.14);
        firstSofa.setCornerDirection("left");
        firstSofa.setCorner(true);

        Sofa secondSofa = new Sofa();
        secondSofa.setColour("black");
        secondSofa.setCorner(false);
        secondSofa.setPrice(478.90);

        System.out.println("I like to sleep");
        System.out.println("1st sofa:");
        System.out.println(firstSofa.getColour());
        System.out.println(firstSofa.getPrice());
        System.out.println(firstSofa.getCornerDirection());

        System.out.println("2nd sofa:");
        System.out.println(secondSofa.getColour());
        System.out.println(secondSofa.getPrice());
        System.out.println(secondSofa.isCorner());
    }

    @Test
    public void WorkingWithTree () {
        Tree firstTree = new Tree();

        firstTree.setTreeType("coniferous");
        firstTree.setName("pine");
        firstTree.setTotalHeight(15);

        Tree secondTree = new Tree();
        secondTree.setTreeType("deciduous");
        secondTree.setName("maple");
        secondTree.setAge(25);

        System.out.println("Forest");
        System.out.println("1st tree:");
        System.out.println(firstTree.getTreeType());
        System.out.println(firstTree.getName());

        System.out.println("2nd tree:");
        System.out.println(secondTree.getTreeType());
        System.out.println(secondTree.getName());
        System.out.println(secondTree.getAge());
    }
    @Test
    public void WorkingWithTv () {
        Tv firstTv = new Tv();

        firstTv.setBrand("LG");
        firstTv.setDiagonal(32);
        firstTv.setTotalPrice(605);
        firstTv.setCurrencyPrice('€');
        firstTv.setScreenType("Oled");

        Tv secondTv = new Tv();
        secondTv.setBrand("Samsung");
        secondTv.setSmartTv(true);
        secondTv.setScreenType("Oled");

        System.out.println("TV shop");
        System.out.println("1st Tv:");
        System.out.println(firstTv.getBrand());
        System.out.println(firstTv.getDiagonal());
        System.out.println(firstTv.getTotalPrice());
        System.out.println(firstTv.getCurrencyPrice());

        System.out.println("2nd Tv:");
        System.out.println(secondTv.getBrand());
        System.out.println(secondTv.isSmartTv());
        System.out.println(secondTv.getScreenType());
    }
}

