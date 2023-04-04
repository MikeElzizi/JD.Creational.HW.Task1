public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Безумная")
                .setSurname("Кошатница")
                .setAge(147)
                .setAddress("Тисовая улица")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Которая бдит за Поттером")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            // Все ли поля заполнены
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Проверка возраста
            new PersonBuilder().setAge(-10).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}