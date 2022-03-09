package model;



public class Car {
   private String model;
   private int id;
   private String owner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Car(int id, String owner, String model) {
        this.model = model;
        this.id = id;
        this.owner = owner;
    }


    @Override
    public String toString() {
        return "Car{id=" + id +
                "model='" + model + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
