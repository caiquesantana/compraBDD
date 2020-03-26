# language: pt
@CompraProduto
Funcionalidade: Compra de produto
  A pesquisa deve ser feita pela home page.

  Contexto: 
    Dado que estou na tela inicial

  @BuscaHomeSucesso
  Esquema do Cenário: Busca de produto pela home com sucesso
    E coloco o login "<login>"
    E coloco a senha "<senha>"
    E clico na categoria LAPTOPS
    E seleciono o produto
    E adiciono ao carrinho
    E vou para a pagina de chekout
    E valido os dados de entrega
    Quando confirmo o pagamento
    Então eu valido a compra feita
    
    Exemplos: 
      | login       | senha   |
      | cauasantana | Caique1 |

  @BuscaHomeFalha
  Esquema do Cenário: Quantidade do produto incorreta ao adicionar ao carrinho
    E coloco o login "<login>"
    E coloco a senha "<senha>"
    E clico na categoria LAPTOPS
    E seleciono o produto
    E adiciono mais de "10" unidades no carrinho
    Então eu comparo a quantidade de produto no carrinho
    
		Exemplos:
      | login       | senha   |
      | cauasantana | Caique1 |