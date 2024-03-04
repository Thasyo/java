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


