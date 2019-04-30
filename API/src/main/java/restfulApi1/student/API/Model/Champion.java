package restfulApi1.student.API.Model;

import java.util.List;

public class Champion {

    private int id;
    String name;
    String type;
    String role;
    List<Abilities> abilities;

    public Champion (int id, String name, String type, String role, List<Abilities> abilities)
    {
        this.id = id;
        this.name = name;
        this.type = type;
        this.role = role;
        this.abilities = abilities;
    }

    public Champion () {}

    public String getName ()
    {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getType ()
    {
        return type;
    }
    public void setType (String type)
    {
        this.type = type;
    }

    public String getRole ()
    {
        return role;
    }

    public void setRole (String role)
    {
        this.role = role;
    }

    public int getId ()
    {
        return id;
    }

    @Override
    public String toString()
    {
        String infoChampion = "Champion " + name + " van het type " + type + " vervult de rol van " + role + " met het id: " + id + "\n";

        for (Abilities ability : abilities
             ) {
                infoChampion += ability.toString() + "\n";
        }
        return infoChampion;
    }
}
