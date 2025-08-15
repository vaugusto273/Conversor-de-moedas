# Conversor de Moedas

![Conversor de Moedas Badge](badge-conversor.png)

Este projeto é um conversor de moedas em Java que utiliza a API [ExchangeRate-API](https://www.exchangerate-api.com/) para obter taxas de câmbio em tempo real. O usuário informa a moeda base, o valor a ser convertido e as moedas de destino, recebendo os valores convertidos em formato de tabela.

## Funcionalidades

- Consulta taxas de câmbio de diversas moedas.
- Conversão de valores entre moedas.
- Interface simples via terminal.
- Suporte a múltiplas moedas de destino em uma única consulta.

## Como usar

1. **Clone o projeto e instale as dependências**
   - Certifique-se de ter o Java 11+ e Maven instalados.

2. **Configure sua chave da API**
   - Crie o arquivo `config.properties` em `src/main/resources/` com o conteúdo:
     ```
     API_KEY=SEU_API_KEY_AQUI
     ```
   - Substitua `SEU_API_KEY_AQUI` pela sua chave da [ExchangeRate-API](https://www.exchangerate-api.com/).

3. **Compile o projeto**
   ```
   mvn clean package
   ```

4. **Execute o programa**
   ```
   java -cp target/classes br.com.alura.challenge.Main
   ```

5. **Siga as instruções no terminal**
   - Digite a moeda base (ex: USD, EUR, BRL).
   - Digite o valor a ser convertido.
   - Digite as moedas de destino separadas por vírgula (ex: BRL,JPY,AUD).

## Exemplo de uso

```
Digite a moeda base (ex: USD, EUR, GBP): 
USD
Digite o valor a ser convertido: 
100
Digite as moedas de destino separadas por vírgula (ex: BRL,JPY,AUD): 
BRL,JPY,AUD

Moeda base: USD
---------------------------------------------
Destino     | Taxa de Câmbio   | Valor Convertido
---------------------------------------------
BRL         | 5.3947           | 539.4700
JPY         | 147.4067         | 14740.6700
AUD         | 1.6200           | 162.0000
---------------------------------------------
```

## Estrutura do projeto

```
conversordemoedas/
├── src/
│   ├── main/
│   │   ├── java/br/com/alura/challenge/
│   │   │   ├── Main.java
│   │   │   ├── ConsultaAPI.java
│   │   │   └── CalculaTaxadeCambio.java
│   │   └── resources/config.properties
│   └── test/
├── pom.xml
```

## Observações

- Não compartilhe sua chave da API publicamente.
- O projeto utiliza a biblioteca [Gson](https://github.com/google/gson) para manipulação de JSON.

## Licença

Este projeto é apenas para fins educacionais.