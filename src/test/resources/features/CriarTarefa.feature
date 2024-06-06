#language: pt

Funcionalidade: Criar tarefa
	
Esquema do Cenário: Criar tarefa com sucesso no sistema
	Dado que eu esteja logado no sistema
	E esteja na tela de criação de tarefa
	Quando crio uma nova tarefa
		| categoria     | <categoria>    |
		| frequencia    | <frequencia>   |
		| gravidade     | <gravidade>    |
		| prioridade    | <prioridade>   |
		| plataforma    | <plataforma>   |
		| so            | <so>           |
		| versao so     | <versao so>    |
		| resumo        | <resumo>       |
		| descricao     | <descricao>    |
		| passos        | <passos>       |
		| informacoes   | <informacoes>  |
		| marcadores    | <marcadores>   |
		| arquivos      | <arquivos>     |
		| visibilidade  | <visibilidade> |
	Então vejo que a tarefa foi criada
	
	Exemplos:
				|categoria														|frequencia			|gravidade|prioridade	|plataforma	|so				|versao so|resumo	|descricao|passos	|informacoes|marcadores	|arquivos								|visibilidade	|
				|	[Todos os Projetos] categoria teste	|às vezes				|texto		|alta				|	abc				|	W				|	1.2			|resumo	|descricao|passos	|informacoes|abc				|Imagem_criar_tarefa.png|público			|
				|	[Todos os Projetos] categoria teste	|não se tentou	|pequeno	|normal			|	[blank]		|	[blank]	|	[blank]	|resumo	|descricao|[blank]|[blank]		|[blank]		|[blank]								|público			|				
				
				
Cenário: Criar tarefa sem sucesso no sistema
	Dado que eu esteja logado no sistema
	E esteja na tela de criação de tarefa
	Quando crio uma nova tarefa
		| categoria    | (selecione)              |
		| frequencia   | às vezes                 |
		| gravidade    | texto                    |
		| prioridade   | alta                     |
		| plataforma   | abc                      |
		| so           | W                        |
		| versao so    | 1.2                      |
		| resumo       | resumo                   |
		| descricao    | descricao                |
		| passos       | passos                   |
		| informacoes  | informacoes              |
		| marcadores   | abc                      |
		| arquivos     | Imagem_criar_tarefa.png  |
		| visibilidade | público                  |
	Então vejo que a tarefa não foi criada
				