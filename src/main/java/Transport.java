public abstract class  Transport {
    private String name;

    Transport(String name) {
        this.name = name;
    }

    public  void check(Transport transport) {
        System.out.println(transport);
    }
    }

