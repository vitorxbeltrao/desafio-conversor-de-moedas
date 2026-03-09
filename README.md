# 💱 Conversor de Moedas

Este projeto consiste no desenvolvimento de um **Conversor de Moedas em
Java** que consome dados da **ExchangeRate-API**, permitindo a conversão
entre algumas das principais moedas utilizadas no dia a dia.

A aplicação é executada no **terminal**, onde o usuário escolhe o tipo
de conversão desejada através de um menu interativo.

------------------------------------------------------------------------

# 📌 Funcionalidades

-   Conversão entre **Real (BRL)**, **Dólar (USD)** e **Euro (EUR)**
-   Consumo de dados de câmbio em tempo real através da
    **ExchangeRate-API**
-   Interface simples via **terminal (CLI)**
-   Estrutura de projeto organizada em camadas

------------------------------------------------------------------------

# 🖥️ Exemplo de Menu

Ao executar a aplicação, o seguinte menu é exibido no terminal:

    *********************************
    *      CONVERSOR DE MOEDAS      *
    *********************************

    1 - Real >>> Dólar
    2 - Dólar >>> Real
    3 - Real >>> Euro
    4 - Euro >>> Real
    5 - Dólar >>> Euro
    6 - Euro >>> Dólar
    7 - Sair

    Escolha uma opção válida:

O usuário seleciona a opção desejada e informa o valor que deseja
converter.

------------------------------------------------------------------------

# 🧱 Estrutura do Projeto

    ConversorDeMoedas
    │
    ├── app
    │   └── Main.java
    │
    ├── service
    │   └── ServicoCambio.java
    │
    ├── view
    │   └── Menu.java
    │
    └── config.properties

### 📂 Descrição

**Main.java**\
Responsável por iniciar a aplicação.

**Menu.java**\
Responsável por exibir o menu e interagir com o usuário.

**ServicoCambio.java**\
Responsável por consumir a API de câmbio e retornar as taxas de
conversão.

**config.properties**\
Arquivo utilizado para armazenar a **API Key** da ExchangeRate-API.

------------------------------------------------------------------------

# 🔗 API Utilizada

Este projeto utiliza a API:

**ExchangeRate-API**

Ela fornece taxas de câmbio atualizadas para diversas moedas.

Site oficial:\
https://www.exchangerate-api.com

------------------------------------------------------------------------

# ⚙️ Tecnologias Utilizadas

-   Java
-   Java HTTP Client
-   ExchangeRate-API
-   IntelliJ IDEA

------------------------------------------------------------------------

# ▶️ Como Executar o Projeto

### 1️⃣ Clonar o repositório

``` bash
git clone https://github.com/vitorxbeltrao/desafio-conversor-de-moedas.git
```

### 2️⃣ Configurar a API Key

Crie um arquivo chamado:

    config.properties

Dentro dele adicione:

    apiKey=SUA_API_KEY_AQUI

Você pode obter uma chave gratuita em:\
https://www.exchangerate-api.com

### 3️⃣ Executar o projeto

Compile e execute o arquivo:

    Main.java

Ou utilize o botão **Run** no IntelliJ IDEA.

------------------------------------------------------------------------

# 📚 Objetivo do Projeto

Este projeto foi desenvolvido com fins de **aprendizado**, com foco em:

-   Consumo de APIs REST em Java
-   Organização de projetos em camadas
-   Manipulação de JSON
-   Uso do HttpClient do Java
-   Interação com usuário via terminal

O escopo do projeto foi proposto pelos times da Alura e Oracle ONE para  
o Challenge (desafio) de conclusão de curso, obrigatório para graduação.

------------------------------------------------------------------------

# 👨‍💻 Autor

Projeto desenvolvido por **Vitor Beltrão**.
