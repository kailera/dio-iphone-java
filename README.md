``` mermaid
classDiagram 
   
iPhone <|-- ReprodutorMusical
iPhone <|-- AparelhoTelefonico
iPhone <|-- NavegadorInternet

ReprodutorMusical : tocar()
ReprodutorMusical: pausar()
ReprodutorMusical: selecionarMusica(String musica)

AparelhoTelefonico: ligar(String numero)
AparelhoTelefonico: atender() 
AparelhoTelefonico: iniciarCorreioVoz()

NavegadorInternet: exibirPagina(String url)
NavegadorInternet: adicionarNovaAba()
NavegadorInternet: atualizarPagina()
