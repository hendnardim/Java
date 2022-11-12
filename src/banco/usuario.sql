CREATE  DATABASE ac2;

CREATE	TABLE	usuario (
	nome varchar (50),
    cpf	varchar (14) not null primary key,
    email varchar (30),
    celular varchar (15), 
    cidade varchar (30),
    UF varchar (2)
)