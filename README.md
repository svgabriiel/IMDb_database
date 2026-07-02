# IMDb Database — Estrutura de Dados

Trabalho acadêmico da matéria de Estrutura de Dados. O projeto carrega e manipula dados do banco de dados da IMDb a partir de arquivos TSV.

## Estrutura do Projeto

```
IMDb_database/
├── src/                          # Código-fonte Java
│   ├── Main.java                 # Classe principal (exemplo de uso)
│   ├── TitleBasic.java           # Representa uma linha do title.basics.tsv
│   └── TitleBasicLoader.java     # Loader que retorna ArrayList<TitleBasic>
│
├── DatabaseTeste/                # Amostras pequenas para testes
│   └── title.basics.sample.tsv   # 1000 linhas do title.basics.tsv
│
├── out/                          # .class compilados (gerado, ignorado)
├── .gitignore
└── README.md
```

## Observações

- A classe `TitleBasic` trata `\N` (valor nulo do TSV) como `null` no Java.
- O arquivo de dados usa tabulação (`\t`) como separador.

## Próximos Passos (sugestão)

- Criar classes equivalentes para as outras tabelas (`NameBasic`, `TitleRating`, etc.)
- Implementar algoritmos de busca e ordenação vistos em aula
