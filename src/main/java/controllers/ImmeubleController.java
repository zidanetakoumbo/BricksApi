package controllers;

import entities.Immeuble;
import services.ImmeubleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/immeubles")
@CrossOrigin(origins = "*") // Optionnel mais utile pour Frontend
public class ImmeubleController {

    private final ImmeubleService immeubleService;

    public ImmeubleController(ImmeubleService immeubleService) {
        this.immeubleService = immeubleService;
    }

    // CREATE
    @PostMapping
    public Immeuble create(@RequestBody Immeuble immeuble) {
        return immeubleService.save(immeuble);
    }

    // READ : All
    @GetMapping
    public List<Immeuble> getAll() {
        return immeubleService.getAll();
    }

    // READ : By ID
    @GetMapping("/{id}")
    public Immeuble getById(@PathVariable Long id) {
        return immeubleService.getById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Immeuble update(@PathVariable Long id, @RequestBody Immeuble immeuble) {
        return immeubleService.update(id, immeuble);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        immeubleService.delete(id);
    }
}
