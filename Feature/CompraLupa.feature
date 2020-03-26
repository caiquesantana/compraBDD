# language: pt
@CompraPelaLupa
Funcionalidade: Compra de produto
  A compra deve ser feita pelo campo de busca.

  Contexto: 
    Dado que estou na tela inicial.

  @PesquisaLupaSucesso
  Esquema do Cenário: Buscar um produto sucesso.
    E insiro o login "<login>"
    E insiro a senha "<senha>"
    E digito o nome do produto desejado no campo de pesquisa "<produto>"
    E clico no produto.
    E adiciono ao carrinho.
    E faco chekout.
    E valido os dados de entrega.
    Quando confirmo o pagamento.
    Então eu valido a compra feita.

    Exemplos: 
      | login       | senha   | produto                           |
      | cauasantana | Caique1 | HP ZBook 17 G2 Mobile Workstation |

  @pesquisarProdutoInexistente
  Esquema do Cenário: pesquisar produto inexistente.
    E insiro o login "<login>"
    E insiro a senha "<senha>"
    E digito o nome do produto desejado no campo de pesquisa "<produto>"
    Entao constata que o produto nao existe "<produto>"

    Exemplos: 
      | login       | senha   | produto    |
      | cauasantana | Caique1 | hot wheels |
