public class Transport {

    private String name;
    private int seatCount;

    public Transport() {
        System.out.println("Transport object is being created");
    }

    public void setSeatCount(int number) {
        if (number <= 100) {
            this.seatCount = number;
            System.out.println("Seat count has been set.");
        } else {
            System.out.println("Seat count has NOT been set - number of seats too large. Choose fewer number of seats.");
        }
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void changeName () {
        System.out.println("Transport is moving");
    }

    public void options () {
        System.out.println("I can move back and forward");
    }



}


//        1.4 Сделайте геттеры и сеттеры на поля класса. Для сеттера на
//        количество мест реализуйте контроль значений (if .. else) на ваш
//        выбор. Для ветки else можно выводить в консоль сообщение об ошибке.
//        1.5 Создайте экземпляр класса Transport и проинциализируйте его поля
//        сеттерами
//        1.6 Выведите в консоль значения полей объекта класса Transport с
//        использованием геттеров.