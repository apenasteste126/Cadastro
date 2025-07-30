package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas Vinda";
    }

    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado";
    }

    @GetMapping("/todos")
    public String mostratTodosOsNinjas() {
        return "Mostrar Ninja";
    }

    @GetMapping("/todosID")
    public String mostratTodosOsNinjasPorId() {
        return "Mostrar Ninja por ID";
    }

    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "Alterar Ninja por ID";
    }

    @DeleteMapping("/deletarID")
    public String deletarPorId() {
        return "Ninja Deletado por ID";
    }
}
