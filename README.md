<h1>Anotações sobre as aulas</h1>

<h2>Processamento de Dados e Casting</h2>

<h3>PROCESSAMENTO DE DADOS</h3>

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

<h3>CASTING</h3>

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