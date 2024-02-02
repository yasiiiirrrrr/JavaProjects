package Tema_07.Ejemplos.InterfComparator;

import java.util.Objects;

public class Futbolista implements Comparable {
    private String DNI;
    private String name;
    private byte age;
    private byte goals;

    //CONSTRUCTORES
    public Futbolista() {
        DNI = "n/a";
        name = "n/a";
        age = 0;
        goals = 0;
    }
    public Futbolista(String DNI, String name, byte age, byte goals) {
        this.DNI = DNI;
        this.name = name;
        this.age = age;
        this.goals = goals;
    }

    //GETTERS Y SETTERS
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public byte getGoals() {
        return goals;
    }
    public void setGoals(byte goals) {
        this.goals = goals;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Futbolista [" +
                "DNI='" + DNI + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", goals=" + goals +
                ']';
    }

    //EQUALS
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Futbolista that = (Futbolista) obj;
        return Objects.equals(DNI, that.DNI);
    }

    //COMPARETO
    @Override
    public int compareTo(Object obj) {
        return this.getDNI().compareTo(((Futbolista)obj).getDNI());
    }

}
