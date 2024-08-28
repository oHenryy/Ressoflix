# Ressoflix

Ressoflix é um aplicativo Android que permite aos usuários navegar e acessar rapidamente informações sobre filmes e músicas. Foi desenvolvido com o intuito de testar as possibilidades dos designs "Front-end" Android, as funcionalidades "Back-end" não eram o foco aqui, mas existem algumas funcionalidades interessantes.

## Funcionalidades

### Tela de Login (MainActivity)

  - **Autenticação:** A aplicação permite o login utilizando credenciais fixas `(email: admin, senha: 123)`. Em caso de falha, uma mensagem de erro é exibida e os campos são limpos para nova tentativa.
  - **Navegação:** Após o login bem-sucedido, o usuário é redirecionado para a tela principal de navegação de conteúdo.

### Tela Principal (homeresso)

  - **Seções de Conteúdo:** A tela principal está dividida em duas seções:
      1. **Filmes:** Inclui uma seleção de filmes. Cada filme, quando clicado, redireciona o usuário para uma página da Wikipedia com mais informações sobre o filme.
      2. **Músicas:** Inclui uma seleção de músicas. Cada música, quando clicada, redireciona o usuário para um vídeo correspondente no YouTube.
  - **Navegação:** Cada item de filme ou música, quando clicado, abre uma URL específica no navegador.

## Estrutura do Projeto
  ```
  - java/
    - com.example.projetoressoflix/
      - homeresso.kt
      - MainActivity.kt
  - res/
    - layout/
      - activity_homeresso.xml
      - activity_main.xml
    - mipmap/
    - values/
    - drawable/
  - AndroidManifest.xml
  - ressoflixicon-playstore.png
```

## Instalação e Execução

  1. **Clonar o Repositório:**

    git clone https://github.com/usuario/RessoFlix.git](https://github.com/oHenryy/Ressoflix.git

  2. **Abrir no Android Studio:**
     
     - Navegue até o diretório do projeto e abra-o no Android Studio.
       
  3. **Compilar e Rodar:**
     
     - Conecte um dispositivo Android ou use um emulador.
     - Compile e execute o aplicativo diretamente pelo Android Studio.

## Requisitos

  - Android SDK
  - Android Studio
  - Dispositivo com Android 5.0 (Lollipop) ou superior
