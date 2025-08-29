# Sudoku em Java (Swing)

Este projeto é uma implementação simples de um **Sudoku** utilizando a biblioteca **Swing** do Java.  
A interface gráfica é composta por uma grade 9x9 de campos de texto, permitindo inserir valores manualmente ou carregar valores iniciais via argumentos de execução.

---

## 🚀 Como Executar

### 1) Compilar o código
No terminal, navegue até a pasta onde está o arquivo `Sudoku.java` e compile:

```bash
javac Sudoku.java
```

### 2) Executar o programa
Você pode executar o jogo sem parâmetros (apenas a grade vazia):

```bash
java Sudoku
```

Ou passando valores iniciais já preenchidos (exemplo abaixo):

```bash
java Sudoku "0,0;5;true" "1,1;3;false" "4,4;9;true"
```

---

## 📌 Formato dos argumentos

Cada argumento segue a estrutura:

```
coluna,linha;valor;fixo
```

- **coluna**: índice da coluna (0 a 8)  
- **linha**: índice da linha (0 a 8)  
- **valor**: número a ser exibido na célula (1 a 9)  
- **fixo**: `true` se a célula não pode ser alterada (pré-definida no jogo),  
  ou `false` se a célula pode ser editada  

### Exemplo:

```bash
java Sudoku "0,0;8;true" "1,2;4;false"
```

- `0,0;8;true` → insere o número **8** na posição **linha 0, coluna 0**, e a célula será **fixa** (não editável).  
- `1,2;4;false` → insere o número **4** na posição **linha 2, coluna 1**, mas a célula poderá ser alterada pelo usuário.

---

## 🎨 Funcionalidades

- Interface gráfica com **Swing**.  
- Grade **9x9** de campos de texto.  
- Células fixas destacadas com fundo **azul claro**.  
- Possibilidade de carregar valores iniciais via argumentos.  

---

## 🛠 Requisitos

- **Java JDK 8+**  
- Nenhuma dependência externa  

---

## 📷 Exemplo visual (simulado)

```
+---+---+---+---+---+---+---+---+---+
| 8 |   |   |   |   |   |   |   |   |
|   | 3 |   |   |   |   |   |   |   |
|   |   | 4 |   |   |   |   |   |   |
|   |   |   |   | 9 |   |   |   |   |
...
```

---

## 📌 Observações

- Este código **não valida as regras do Sudoku**, ele apenas exibe e permite a edição dos números.  
- Para transformar em um jogo completo, seria necessário implementar verificação de regras e resolução automática.  

---

## 📦 Como adicionar este README ao seu projeto e subir para o GitHub

Escolha o cenário que se aplica ao seu projeto.

### A) Projeto local **já versionado** em Git (com remoto configurado)
```bash
cd /caminho/do/seu/projeto
# salve este arquivo como README.md na raiz
git add README.md
git commit -m "docs: adiciona README"
git push
```

### B) Projeto local **sem Git** inicializado (ainda não tem repositório no GitHub)
```bash
cd /caminho/do/seu/projeto
# salve este arquivo como README.md na raiz
git init
git add .
git commit -m "feat: Sudoku em Java + README"
git branch -M main
git remote add origin https://github.com/<seu-usuario>/<seu-repo>.git
git push -u origin main
```

### C) Repositório **já existe no GitHub** (sem README) — clonar e adicionar
```bash
git clone https://github.com/<seu-usuario>/<seu-repo>.git
cd <seu-repo>
# copie/cole o README.md para a raiz do repositório
git add README.md
git commit -m "docs: adiciona README"
git push
```

---

✍️ Autor: *Pedro Henrique Barros dos Santos de Souza*
