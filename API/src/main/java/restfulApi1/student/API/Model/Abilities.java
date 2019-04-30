package restfulApi1.student.API.Model;

public class Abilities {
    String id;
    String naam;
    String uitleg;

    public Abilities (String naam, String id, String uitleg)
    {
        this.id = id;
        this.naam = naam;
        this.uitleg = uitleg;
    }

    public String getNaam()
    {
        return this.naam;
    }

    public String getUitleg ()
    {
        return this.uitleg;
    }

    public String getId ()
    {
        return this.id;
    }

    public void setUitleg(String uitleg)
    {
        this.uitleg = uitleg;
    }

    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    @Override
    public String toString()
    {
        String abilitieInfo = "The " + id + " abilitie is named " + naam + " its effects are " + uitleg ;
        return abilitieInfo;
    }
}
