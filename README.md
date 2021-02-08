# Desafio-SLDS
Automação portal solides

Melhorias:
* O usuário só sabe que os dados estão incorretos durante o cadastro quando clica no botão “cadastrar-se” essas informações poderiam ser informadas durante o preenchimento.
* Propor aos desenvolvedores que sejam adicionados Ids para uma melhor precisão na identificação dos elementos.



[CEN001] – Clicar no botão “Cadastre-se em nosso banco de talento”
Dado o candidato clique no botão “Cadastre-se em nosso banco de talento”
Quando estiver no portal 
Então deverá exibir um botão “registre-se”. 

[CEN002] – Realizar o registro no banco de talento
Dado o candidato tenha selecionado o botão “Cadastre-se em nosso banco de talento” ou “Entrar como candidato”
Quando o candidato não estiver cadastrado
E clicar no link “Registre-se”
Então deverá exibir um formulário solicitando e-mail, CPF, senha, repetir senha e um checkbox para concordar com os termos de uso e política de privacidade.

[CEN003] – Acessar o portal com um candidato já cadastrado no banco de talento
Dado o candidato tenha selecionado o botão “Entrar como candidato”
Quando o candidato estiver previamente cadastrado
Então deverá adicionar o e-mail ou CPF e senha válidos
E Clicar no botão “Logar”.

[CEN004] – Logar com dados não adicionados na base de dados
Dado o candidato não esteja previamente cadastrado no portal
Quando digitar um e-mail ou CPF e senha inválidos
Então deverá exibir a seguinte mensagem “A senha não atende às diretrizes básicas”

[CEN005] – Não marcar o Checkbox “Li e concordo com os termos de uso e política de privacidade.” Durante o registro do candidato.
Dado clicar no link “Registre-se”
Quando não for marcado o checkbox “Li e concordo com os termos de uso e política de privacidade.”
Então deverá exibir a seguinte mensagem “Campo Obrigatório”
