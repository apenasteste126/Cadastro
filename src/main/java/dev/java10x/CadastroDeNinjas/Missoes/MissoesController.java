package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")

public class MissoesController {
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criada";
    }

    @GetMapping("/listar")
    public String listarMissao() {
        return "Listar missoes";
    }

    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao alterada";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada";
    }
}
