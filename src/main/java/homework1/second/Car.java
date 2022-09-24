package homework1.second;

abstract class Car {
    /**
     * вместо объекта Engine можно прописать String, но здесь я не уверен
     */
    public String engine;
    private String color;
    private String name;

    protected void start() {
        System.out.println("Car starting");
    }

    /**
     * вместо данного абстрактного метода можно создать интерфейс
     */
    abstract void open();

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
