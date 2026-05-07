# ProjetoAP1: Celular e Bateria em Java

> Uma simulação orientada a objetos que mostra como um celular consome, recarrega e controla sua bateria.

## Visão geral

O **ProjetoAP1** é um exercício de **Programação Orientada a Objetos** em Java. O sistema modela duas classes principais: `Celular` e `Bateria`. A relação entre elas usa composição, pois o celular possui uma bateria e delega a ela ações como carregar e gastar energia.[1]

| Classe | Responsabilidade |
|---|---|
| `Bateria` | Armazena porcentagem atual, capacidade em mAh e regras de consumo. |
| `Celular` | Guarda marca, modelo e uma bateria associada. |
| `Main` | Executa cenários de teste para carga, uso e consumo inválido. |

## Regras implementadas

A bateria pode ser carregada até 100%, pode perder carga durante o uso e impede consumo negativo. Quando o consumo é maior ou igual à carga disponível, a porcentagem é zerada e o programa informa que a bateria descarregou.

```text
Celular
   └── Bateria
          ├── carregarBateria()
          └── gastarBateria(consumo)
```

## Como executar

```bash
git clone https://github.com/uliguimaraes/ProjetoAP1.git
cd ProjetoAP1
javac src/*.java
java -cp src Main
```

## Possíveis evoluções

O projeto pode crescer com diferentes modos de consumo, histórico de carregamentos, validação para capacidade em mAh, simulação de aplicativos abertos e uma interface de menu para interação com o usuário.

## Referências

[1]: https://docs.oracle.com/en/java/ "Java documentation"
