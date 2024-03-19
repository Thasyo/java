<h1>Anotações sobre as aulas</h1>

<h1>Sessão 04 - Estrutura Sequencial</h1>

<h2><strong>PROCESSAMENTO DE DADOS E CASTING</strong></h2>

<h3>Processamento de Dados</h3>

<ul>
    <li>O Processamento de dados é feito por meio do comando de atribuição -> " = "</li>
    <li>Sintaxe: nome_variável = expressão</li>
</ul>

<h4>Exemplos:</h4>

<pre>
    <code> 
        Exemplo 01:

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;

        System.out.println(area);

        A saída desse código será: 35.0
    </code>
</pre>

<pre>
    <code> 
        Exemplo 02:
        
        int x;
        double y;

        x = 5;
        y = 2 * x

        System.out.println(x);
        System.out.println(y);

        A saída desse código será: x = 5 e y = 10.0
    </code>
</pre>

<h3>Casting</h3>

<ul>
    <li>É a conversão explícita de um tipo para outro.</li>
    <li>É necessário quando o compilador não é capaz de “adivinhar” que o 
    resultado de uma expressão deve ser de outro tipo.</li>
</ul>

<h4>Exemplos:</h4>

<pre>
    <code> 
        Exemplo 01:

        int a, b;
        double resultado;

        a = 5;
        b = 2;
        resultado = a / b;

        System.out.println(resultado);

        Esse código vai dá erro, pois o resultado da expressão está sendo de outro tipo. O correto seria aplicar o conceito de Casting e explicitar a conversão de tipo.
    </code>
</pre>

<pre>
    <code> 
        Exemplo 01 (CORREÇÃO):

        int a, b;
        double resultado;

        a = 5;
        b = 2;
        resultado = (double) a / b;

        System.out.println(resultado);

        Com essa alteração, o código roda limpo e o resultado é: 2.5
    </code>
</pre>


<h2><strong>ENTRADA DE DADOS</strong></h2>

<h3>Scanner</h3>

<ul>
    <li>Para fazer entrada de dados, nós vamos criar um objeto do tipo "Scanner".</li>
    <li>Fórmula: Scanner sc = new Scanner(System.in);</li>
    <li>Para o Scanner funcionar, você precisa importar: import java.util.Scanner;</li>
    <li>Quando for inserir algo com o teclado, utilize o seguinte método:
        <ul>
            <li>Para String: sc.next();</li>
            <li>Para Inteiros: sc.nextInt();</li>
            <li>Para Double: sc.nextDouble();</li>
            <li>Para Char: sc.next().charAt(0);</li>
            <li>Para String: sc.next();</li>
            <li>Para ler um texto completo até a quebra de linha: sc.nextLine();</li>
        </ul>
    </li>
    <li>E quando não precisar mais do Scanner, você o desabilita no final: sc.close();</li>
</ul>

<pre>
    <code> 
        Exemplo 01:

        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    </code>
</pre>

<pre>
    <code> 
        Exemplo 02:

        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    </code>
</pre>

<h4>ATENÇÃO: QUEBRA DE LINHA PENDENTE</h4>

<ul>
    <li>Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linha fica "pendente" na entrada padrão. </li>
    <li>Se você então fizer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine().</li>
</ul>

<pre>
    <code> 
        Exemplo 03:

        Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
    </code>
</pre>

<h2><strong>FUNÇÕES MATEMÁTICAS</strong></h2>

<ul>
    <li>O Java nos reserva algumas funções matemáticas para o desenvolvedor para facilitar algumas operações</li>
    <li>Abaixo segue algumas funções matemáticas existentes no Java:
        <ul>
            <li>A = Math.sqrt(x); ->  a variável A recebe a raiz quadrada de x</li>
            <li>A = Math.pow(x, y); -> a variável A recebe o resultado de x elevado a y</li>
            <li>A = Math.abs(x); -> a variável A recebe o valor absoluto de x</li>
        </ul>
    </li>
</ul>

<pre>
    <code> 
        Exemplo 01:

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);


        A SAÍDA DESSE PROGRAMA É:

            Raiz quadrada de 3.0 = 1.7320508075688772
            Raiz quadrada de 4.0 = 2.0
            Raiz quadrada de 25 = 5.0

            3.0 elevado a 4.0 = 81.0
            3.0 elevado ao quadrado = 9.0
            5 elevado ao quadrado = 25.0
            
            Valor absoluto de 4.0 = 4.0
            Valor absoluto de -5.0 = 5.0
    </code>
</pre>


<h1>Sessão 05 - Estrutura Condicional</h1>

## EXPRESSÕES COMPARATIVAS

- Expressão -> Resultado -> Boolean (verdadeiro ou falso)
    
    - Exemplo : 5<=10 ? falso

### Operadores Comparativos

- "<" = Menor

- ">" = Maior

- "<=" = Menor ou igual

- ">=" = Maior ou igual

- "==" = Igual

- "!=" = Diferente

#### Exemplos de expressões comparativas

- Suponha que x é igual a 5.

    - X > 0 = True  

    - X == 3 = False

    - 10 <= 30 = True 

    - X != 2 = True

## EXPRESSÕES LÓGICAS

- Expressão -> Resultado -> Boolean (verdadeiro ou falso)

### Operadores Lógicos

- && = E -> Para ser True, todas as expressões devem ser verdadeiras.

- || = OU -> Para ser True, apenas umas das expressões devem ser verdadeiras.

- ! = NÃO -> Inverte a condição. True para False e False para true. 

#### Exemplos de expressões lógicas

##### Operador Lógico && (E): Suponha que x é igual a 5.

    - (X > 0) && (X != 3) - (Resultado: True) 

    - (X <= 20) && (X == 10) - (Resultado: False)

    - (X <= 20) && (X == 10) && (X != 3) - (Resultado: False)

##### Operador Lógico || (OU): Suponha que x é igual a 5.

    - X == 10 || X <= 20 - (Resultado: True) 

    - X > 0 || X != 3 - (Resultado: True)

    - X <= 0 || X != 3 || X != 5 - (Resultado: True)

##### Operador Lógico ! (NÃO): Suponha que x é igual a 5.

    - !(X == 10) - (Resultado: True) 

    - !(X >= 2) - (Resultado: False)

## EXPRESSÕES CONDICIONAIS

- É uma estrutura de controle que permite definir que um certo bloco de comandos somente será executado dependendo de uma condição.

### Sintaxe de estrutura condicional

#### Simples

<pre>
    <code>
        if (condição) {
            comando 01;
            comando 02;
        };
    </code>
</pre>

#### Composta

<pre>
    <code>
        if (condição) {
            comando 01;
            comando 02;
        } else {
            comando 03;
            comando 04;
        };
    </code>
</pre>

#### Encadeamento de estruturas condicionais

<pre>
    <code>
        if (condição 01) {
            comando 01;
            comando 02;
        } else if (condição 02) {
            comando 03;
            comando 04
        } else {
            comando 05;
            comando 06;
        };
    </code>
</pre>

### Exemplos de expressões lógicas

<pre>
    <code>

        Scanner sc = new Scanner(System.in);

        int hour;

        System.out.println("Que horas são? ");
        hour = sc.nextInt();

        if (hour < 12) {
            System.out.println("Bom dia, calabreso!");
        } else if (hour < 18) {
            System.out.println("Boa tarde, caramelo!");
        } else {
            System.out.println("Boa noite, cinderela!");
        };

        sc.close();
    </code>
</pre>

## Operadores de atribuição cumulativa

- a += b; => a = a + b;

- a -= b; => a = a - b;

- a *= b; => a = a * b;

- a /= b; => a = a / b;

- a %= b; => a = a % b;

#### Exemplo

<pre>
    <code>

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();
        double conta = 50.0;

        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        
        sc.close();
    </code>
</pre>

## SWITCH CASE

- Quando se tem várias opções de fluxo a serem tratadas com base no valor de uma variável, ao invés de várias estruturas if-else encadeadas, alguns preferem utilizar a estrutura switch-case.

### Estrutura do Switch Case

<pre>
    <code>
        switch ( expressão ) {
            case valor1:
                comando1
                comando2
                break;
            case valor2:
                comando3
                comando4
                break;

                .
                .
                . 

            default:
                comando5
                comando6
                break;
        }
    </code>
</pre>

### Exemplo 

<pre>
    <code>
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }

        System.out.println("Dia da semana: " + dia);

        sc.close();
    </code>
</pre>

## Expressão condicional ternária

- Estrutura ocional ao if-else, quando se deseja decidir um valor com base em uma condição;

### Sintaxe

- (condição) ? valor_se_verdadeiro : valor_se_falso;

- (2 > 4) ? 50 : 80 => Resultado: 80;

- (10 != 3) ? "Maria" : "João" => Resultado: Maria;

### Exemplo

<pre>
    <code>
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);

    </code>
</pre>

## Escopo e Inicialização

- Escopo de uma variável: é a região do programa onde a variável é 
válida, ou seja, onde ela pode ser referenciada.

- Uma variável não pode ser usada se não for iniciada.

<h1>Sessão 06 - Estrutura Repetitivas</h1>

## Estrutura Repetitiva - WHILE

- É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.
- Quando usar: quando não se sabe previamente a quantidade de repetições que será realizada.

### Sintaxe do While

<pre>
    <code>
        while ( condição ) {
            comando 1
            comando 2
        }

        Regras:

            - Quando a expressão for verdadeira, executa os comandos e volta pra cima e repete o processo;
            - Quando a expressão for falsa, pula a estrutura de repetição e os comandos; 
    </code>
</pre>

### Exemplo de While

- Fazer um programa que lê números inteiros até que um zero seja lido. Ao final mostra a soma dos números lidos.

<pre>
    <code>
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int sum = 0;

        while(number != 0){
            sum += number;
            number = sc.nextInt();
        }

        System.out.println(sum);

        sc.close();
    </code>
</pre>

## Estrutura Repetitiva - FOR

- É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
- Quando usar: quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.

### Sintaxe do for

<pre>
    <code>
        for ( início ; condição ; incremento) {
            comando 1
            comando 2
        }

        Regras:

            - "início": Executa somente na primeira vez;
            - "condição": V = executa e volta, F = pula fora; 
            - "incremento": Executa toda vez que voltar; 
    </code>
</pre>

### Exemplo do for

- Fazer um programa que lê um valor inteiro N e depois N números inteiros. Ao final, mostra a soma dos N números lidos.

<pre>
    <code>
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < 3 ; i++) {
            int x = sc.nextInt();
            sum += x;
        }

        System.out.println(sum);

        sc.close();
    </code>
</pre>

<h1>Sessão 07 - Outros Tópicos Básicos do Java</h1>

## RESTRIÇÕES PARA NOMES

- Não pode começar com números: use uma letra ou _ no início
- Não usar acentos ou til
- Não pode ter espaço em branco
- Sugestão obrigatória: use nomes que tenham um significado

### Exemplos

    Errado:                             

        int 5minutes;                               
        int salário;
        int salario do funcionario;                                            

    Correto:

        int _5minutes;
        int salario;
        int salarioDoFuncionario;

## CONVENÇÕES

- Camel Case: lastName
    
    - pacotes
    - atributos
    - métodos
    - variáveis e parâmetros

- Pascal Case: ProductService
    
    - classes

### Exemplo

    package entities;

    public class Account {

        private String holder;
        private Double balance;

        public Account(String holder, Double balance) {
            this.holder = holder;
            this.balance = balance;
        }

        public String getHolder() {
            return holder;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            balance -= amount;
        }

    }

## OPERADORES BITWISE

- São operadores que fazem operações lógicas bit a bit em valores

- Nós temos os seguintes operadores bitwise:

    - & = Operação "E" bit a bit => Só é verdadeira quando todas as proprosições forem verdadeiras.
    - | = Operação "OU" bit a bit => Só é falso quando todas as proposições forem falsas.
    - ^ = Operação "OU-EXCLUSIVO" bit a bit => Só é verdadeira quando apenas UMA proposição for verdadeira.

### Exemplos

    Scanner sc = new Scanner(System.in);

    int mask = 0b100000;
    int n = sc.nextInt();

    if ((n & mask) != 0) {
        System.out.println("6th bit is true!");
    } else {
        System.out.println("6th bit is false");
    }
    
    sc.close()


## FUNÇÕES PARA STRINGS

- Formatar strings: 

    - toLowerCase() => Deixa toda a string em caixa baixa. 
    
    - toUpperCase() => Deixa toda a string em caixa alta.
    
    - trim() => Retira os espaços do início e do final da string.

- Recortar strings:

    - susbstring(início) => Começa uma nova string a partir da posição indicada no "início".
    
    - substring(início, fim) => Começa uma nova string a partir da posição indicada no "início" e finaliza a nova string indicada na posição "fim".
    
- Substituir strings:

    - Replace(char, char) => troca a char inicial, pela char final.

    - Replace(string, string) => troca a string inicial, pela string final.

- Buscar strings: 

    - IndexOf("string") => indica a primeira posição da string denotada no parâmetro.

    - LastIndexOf("string") => indica a última posição da string denotada no parâmetro.

- str.Split(" ") => Criar um array da string "str", a partir do parâmetro.

### Exemplo

    Exemplo 01:

    String original = "abcde FGHIJ ABC abc DEFG   ";

    String s01 = original.toLowerCase();
    String s02 = original.toUpperCase();
    String s03 = original.trim();
    String s04 = original.substring(2);
    String s05 = original.substring(2, 9);
    String s06 = original.replace('a', 'x');
    String s07 = original.replace("abc", "xy");
    int i = original.indexOf("bc");
    int j = original.lastIndexOf("bc");

    System.out.println("Original: -" + original + "-");
    System.out.println("toLowerCase: -" + s01 + "-");
    System.out.println("toUpperCase: -" + s02 + "-");
    System.out.println("trim: -" + s03 + "-");
    System.out.println("substring(2): -" + s04 + "-");
    System.out.println("substring(2, 9): -" + s05 + "-");
    System.out.println("replace('a', 'x'): -" + s06 + "-");
    System.out.println("replace('abc', 'xy'): -" + s07 + "-");
    System.out.println("Index of 'bc': " + i);
    System.out.println("Last index of 'bc': " + j);

    Resposta do programa:

        Original: -abcde FGHIJ ABC abc DEFG   -

        toLowerCase: -abcde fghij abc abc defg   -

        toUpperCase: -ABCDE FGHIJ ABC ABC DEFG   -

        trim: -abcde FGHIJ ABC abc DEFG-

        substring(2): -cde FGHIJ ABC abc DEFG   -

        substring(2, 9): -cde FGH-

        replace('a', 'x'): -xbcde FGHIJ ABC xbc DEFG   -

        replace('abc', 'xy'): -xyde FGHIJ ABC xy DEFG   -

        Index of 'bc': 1

        Last index of 'bc': 17



    Exemplo 02:

    String s = "Thasyo Peres Leite";

    String[] vect = s.split(" ");

    String word1 = vect[0];
    String word2 = vect[1];
    String word3 = vect[2];

    System.out.println(word1);
    System.out.println(word2);
    System.out.println(word3);

    Reposta do programa:

        Thasyo
        Peres
        Leite



 






