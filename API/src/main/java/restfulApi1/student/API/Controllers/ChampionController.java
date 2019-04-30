package restfulApi1.student.API.Controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import java.util.List;

import restfulApi1.student.API.Model.Champion;
import restfulApi1.student.API.Service.ChampionService;
import sun.misc.Request;

import javax.print.attribute.standard.Media;
import java.awt.*;

@RestController
@RequestMapping("/champions")
public class ChampionController {

    private ChampionService service;

    public ChampionController(ChampionService service) {
        this.service = service;
    }

    @RequestMapping(value = "/role/{type}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Champion> getAllChampionsByRole(@PathVariable String type) {
        return service.getChampionsByRole(type);
    }
    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Champion> getAllChampions ()
    {
        return service.getChampions();
    }
    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Champion getChampion(@PathVariable int id)
    {
        return service.getChampion(id);
    }
    @RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void addChampion(@RequestBody Champion champion) {
        service.addChampion(champion);
    }
    @RequestMapping(value = "{id}/tekst", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getChampionInfo (@PathVariable int id)
    {
        return service.getChampionInformatie(id);
    }
    @RequestMapping(value = "/tekst/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String GetChampionInfoAll()
    {
        return service.getChampionsTekstAll();
    }
}

