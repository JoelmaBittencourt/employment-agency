# Employment agency

Este é um projeto de um sistema de gerenciamento de funcionários desenvolvido em Java puro. O objetivo é criar uma
aplicação que permita cadastrar e gerenciar funcionários, incluindo informações como nome, código de identificação, 
salário e endereço.

## Classes

O projeto possui as seguintes classes:

### Classe Funcionario

A classe `Funcionario` representa um funcionário e possui os seguintes atributos:

- `nome`: nome do funcionário.
- `codigoDeIdentificacao`: código de identificação do funcionário.
- `salario`: salário do funcionário.
- `endereco`: objeto do tipo `Endereco` que armazena as informações de endereço do funcionário.

A classe `Funcionario` possui um construtor que recebe os parâmetros necessários para inicializar os atributos.
Além disso, possui os métodos getter e setter para cada atributo.

A classe também possui os seguintes métodos:

- `bonusAnual()`: calcula o bônus anual do funcionário com base no salário.
- `getInformacoesFuncionario()`: exibe as informações do funcionário, incluindo o endereço e o bônus anual.

### Classe Endereco

A classe `Endereco` representa as informações de endereço de um funcionário e possui os seguintes atributos:

- `cep`: CEP do endereço.
- `rua`: nome da rua.
- `numero`: número da residência.
- `complemento`: complemento do endereço.

A classe `Endereco` possui um construtor que recebe os parâmetros necessários para inicializar os atributos.
Além disso, possui os métodos getter para cada atributo.

A classe também possui o método `getInformacoesEndereco()` que exibe as informações completas do endereço.

### Classe Gerente

A classe `Gerente` é uma subclasse da classe `Funcionario` e possui um atributo adicional:

- `senha`: senha do gerente.

A classe `Gerente` possui um construtor que recebe os parâmetros necessários para inicializar os atributos,
incluindo o atributo herdado da classe `Funcionario`. Além disso, a classe possui o método getter para o atributo `senha`.

A classe `Gerente` também sobrescreve o método `bonusAnual()` para calcular o bônus anual específico para os gerentes.

## Como executar o projeto

1. Faça o clone deste repositório.
2. Abra o projeto em sua IDE de preferência.
3. Compile e execute a classe principal para iniciar a aplicação.

## Contribuições

Contribuições são bem-vindas! Se você deseja contribuir com melhorias ou correções para este projeto, sinta-se à vontade para abrir uma pull request.
