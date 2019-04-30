package restfulApi1.student.API.Service;

import org.springframework.stereotype.Service;
import restfulApi1.student.API.Model.Abilities;
import restfulApi1.student.API.Model.Champion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ChampionService {
    private List<Abilities> renekton = new ArrayList<>(
            Arrays.asList(
            new Abilities("Reign of Anger", "passive", "Renekton gains 5 fury per autoattack. When out of combat for 12 seconds, he loses 4 fury every second."),
            new Abilities("Cull the weak", "Q", "Renekton swings his blade dealing medium physical damage to nearby enemies and healing for a percentage of the damage dealt."),
            new Abilities("Ruthless Predator", "W", "Renekton's next attack gains 50 range and swings twice, dealing massive damage and stunning the target"),
            new Abilities("Slice and Dice", "E", "Renekton dashes when he hits a enemie he can dash again for bonus damage and armor reduction"),
            new Abilities("Dominus", "R", "Renekton empowers himself with dark energies, gaining 20 fury, increased size and bonus health for 15 seconds.")

                    ));
    private List<Abilities> irelia = new ArrayList<>(
            Arrays.asList(
                    new Abilities("Ionian Fervor", "passive", "Irelia gains 1 Ionian Fervor stack for every enemy champion hit by her abilities"),
                    new Abilities("Bladesurge", "Q", "Irelia dashes forward to strike her target, healing herself. If the target is marked or dies to bladesurge, its cooldown refreshes"),
                    new Abilities("Defiant Dance", "W", "First cast: Irelia winds up for up to 1.5 seconds, during which she reduces incoming physical damage by 50%. Second cast she swipes her blade dealing physical damage"),
                    new Abilities("Flawless Duet", "E", "Irelia sends out 2 blades which converge on eachother. Enemies caught in between are damaged, stunned and marked"),
                    new Abilities("Vanguard's Edge", "R", "Irelia fires a massive number of blades that explode outwards upon hitting enemie champion. Enemies hit by the blades are damaged and marked")

            ));
    private List<Abilities> morgana = new ArrayList<>(
            Arrays.asList(
                    new Abilities("Reign of Anger", "passive", "Renekton gains 5 fury per autoattack. When out of combat for 12 seconds, he loses 4 fury every second."),
                    new Abilities("Dark binding", "Q", "Morgana binds an enemy in place with dark magic, forcing them to feed the pain theyve caused and dealing magic damage"),
                    new Abilities("Tormented Shadow", "W", "Morgana casts a cursed shadow on an area, damaging enemies who stand in it"),
                    new Abilities("Black Shield", "E", "Morgana anoints an ally with a protective barrier of starfire, which absorbs magical damage and disabling effects until broken"),
                    new Abilities("Soul Shackles", "R", "Morgana lashes chains of dark pain onto nearby enemy champions, gaining movement speed towards them. The chains slow and after a delay stun those who are unable to break them.")

            ));
    private List<Abilities> caitlyn = new ArrayList<>(
            Arrays.asList(
                    new Abilities("Headshot", "passive", "Every few basic attacks, or against a target she has trapped or netted, Caitlyn will fire a headshot dealing bonus damage that scales with her critical strike chance"),
                    new Abilities("Piltover Peacemaker", "Q", "Caitlyn revs up her rifle for 1 second to unleash a penetrating shot that deals physical damage"),
                    new Abilities("Yordle Snap Trap", "W", "Caitlyn sets a trap to find sneaky yordles. When sprung the trap reveals and immobilizes the enemy champion for 1.5 seconds"),
                    new Abilities("90 Caliber Net", "E", "Caitlyn fires a heavy net to slow her target. The recoil knocks Caitlyn back"),
                    new Abilities("Ace in the Hole", "R", "Caitlyn takes time to line up the perfect shot, dealing massive damage to a single target at a huge range. Enemy champions can intercept the bullet for their ally.")

            ));
    private List<Abilities> amumu = new ArrayList<>(
            Arrays.asList(
                    new Abilities("Cursed Touch", "passive", "Amumu's basic attacks Curse enemies for 3 seconds, causing them to take 10% bonus true damage from any magic damage dealt to them"),
                    new Abilities("Bandage Toss", "Q", "Amumu tosses a sticky bandage at a target, stunning and damaging the target while he pulls himself to them"),
                    new Abilities("Despair", "W", "Amumu cries, refreshing curses on nearby enemies and dealing magic damage equal to a percentage of their max health each second"),
                    new Abilities("Tantrum", "E", "Amumu tantrums dealing magic damage to surrounding units. Basic attacks that hit Amumu reduce tantrum's cooldown by 0.5 seconds"),
                    new Abilities("Curse of the sad Mummy", "R", "Amumu entangles surrounding enemy units in bandages, applying his Curse, damaging them and rendering them unable to attack or move.")

            ));

    private List<Champion> champions = new ArrayList<>(
            Arrays.asList(
                    new Champion(1, "Renekton", "Fighter", "Top", renekton),
                    new Champion(2, "Irelia", "Fighter", "Middle", irelia),
                    new Champion(3, "Morgana", "Mage", "Support", morgana),
                    new Champion(4, "Amumu", "Tank", "Jungle", amumu),
                    new Champion(5, "Caitlyn", "Ranged", "Adc", caitlyn)
            )
    );

    public List<Champion> getChampionsByRole (String name)
    {
        Stream<Champion> championStream = champions.stream().filter(champion -> champion.getType().equals(name));
        return championStream.collect(Collectors.toList());
    }

    public Champion getChampion (int id)
    {

        return champions.stream().filter(champion -> champion.getId() == id).findFirst().orElse(null);
    }

    public String getChampionInformatie (int id)
    {
        return champions.stream().filter(champion -> champion.getId() == id).findFirst().orElse(null).toString();
    }

    public void addChampion (Champion champion)
    {
        champions.add(champion);
    }

    public List<Champion> getChampions() {
        return champions.stream().collect(Collectors.toList());
    }

    public String getChampionsTekstAll()
    {
        String heroesInTekst = "";
        for (Champion heroes: champions
             ) {
            heroesInTekst += heroes.toString();
        }
        return heroesInTekst;
    }
}
