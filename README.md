<h1>Anotações sobre as aulas</h1>

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




