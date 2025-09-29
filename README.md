# CP2-Java
# DDD Checkpoint 2 — Notas

- `aumentarSalario(porcentagem)` interpreta a porcentagem em **pontos percentuais** (10 -> 10%), conforme o enunciado.
- `porcentagemParticipacaoLucros` do Diretor é **fração** (0.10 = 10%). Mantive assim pra evitar ambiguidade de passar 10 como 1000%.
- Encapsulamento: todos os atributos são `private` com getters/setters.
- `Departamento` usa array com capacidade fixa (passada no construtor). `adicionar` retorna `false` se cheio.
- `getSalarioFinal()`:
  - Funcionário: base
  - Gerente: base + bônus
  - Diretor: base + bônus + (base * participação nos lucros)