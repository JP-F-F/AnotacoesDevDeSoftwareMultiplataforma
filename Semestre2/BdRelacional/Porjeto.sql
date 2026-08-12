CREATE DATABASE IF NOT EXISTS Projeto_BD;

CREATE TABLE IF NOT EXISTS IES(
    cod_ies  INT IDENTITY(1,1) NOT NULL,
    nome_ies VARCHAR(25) NOT NULL,
    categoria VARCHAR(20) NOT NULL,
    tipo_administracao VARCHAR(7) NOT NULL,
    acad VARCHAR(20) NOT NULL,
    municipio VARCHAR(20) NOT NULL,
    UF VARCHAR(2) NOT NULL,
    CONSTRAINT chk_tp_adm CHECK(tipo_administracao IN('Pública', 'Privada')),
    CONSTRAINT chk_acad CHECK(acad IN ('Universidade', 'Centro Universitário', 'Faculdade', 'Instituto Federal')),
    CONSTRAINT pk_IES PRIMARY KEY (cod_ies)
);

CREATE TABLE IF NOT EXISTS Campus(
    id_campus INT IDENTITY(1,1) NOT NULL,
    cod_ies INT,
    nome_campus VARCHAR(40) NOT NULL,
    municipio VARCHAR(23) NOT NULL,
    UF VARCHAR(2) NOT NULL,
    CONSTRAINT fk_IES FOREIGN KEY (cod_ies) REFERENCES IES (cod_ies),
    CONSTRAINT pk_Campus PRIMARY KEY (id_campus)
);

CREATE TABLE IF NOT EXISTS Docente(
    id_docente INT IDENTITY(1,1) NOT NULL,
    cod_ies INT,
    nome_docente VARCHAR(20) NOT NULL,
    titulacao VARCHAR(20) NOT NULL,
    regime_trabalho VARCHAR(20),
    sexo CHAR(1) NOT NULL,
    CONSTRAINT fk_Docente PRIMARY KEY (id_docente),
    CONSTRAINT fk_IES FOREIGN KEY (cod_ies) REFERENCES IES (cod_ies),
    CONSTRAINT chk_sexo CHECK(sexo IN('F', 'M'))
);

CREATE TABLE IF NOT EXISTS Curso(
    cod_curso INT IDENTITY(1,1) NOT NULL,
    id_campus INT,
    nome_curso VARCHAR(25) NOT NULL,
    grau_academico VARCHAR(20) NOT NULL,
    modalidade VARCHAR(15) NOT NULL,
    carga_horaria_total FLOAT NOT NULL, -- isso provávelmente precisa duma verificação, mas num sei qual
    numero_vagas INT NOT NULL, -- Não sabia muito bem o que fazer com esse atributo
    CONSTRAINT fk_Curso PRIMARY KEY (cod_curso),
    CONSTRAINT fk_Campus FOREIGN KEY (id_campus) REFERENCES Campus (id_campus),
    CONSTRAINT chk_grau_academico CHECK(grau_academico IN ('Tecnólogo', 'Bacharelado', 'Licenciatura', 'Especialização', 'Mestrado', 'Doutorado')),
    CONSTRAINT chk_modalidade CHECK(modalidade IN('Presencial', 'Semipresencial', 'EAD'))
);

CREATE TABLE IF NOT EXISTS Aluno(
    id_aluno INT IDENTITY(1,1) NOT NULL,
    cod_curso INT,
    nome_aluno VARCHAR(30) NOT NULL,
    ano_ingresso DATE NOT NULL, 
    sexo CHAR(1) NOT NULL,
    cor_raca VARCHAR(10) NOT NULL,
    dt_nascimento DATE NOT NULL,
    situacao VARCHAR(20),
    CONSTRAINT pk_Aluno PRIMARY KEY (id_aluno),
    CONSTRAINT fk_cod_curso FOREIGN KEY (cod_curso) REFERENCES Curso (cod_curso),
    CONSTRAINT chk_sexo CHECK(sexo IN('F', 'M')),
    CONSTRAINT chk_raca CHECK('Branca', 'Preta', 'Parda', 'Amarela', 'Indígena'),
    CONSTRAINT chk_dt_nascimento CHECK(dt_nascimento > '1950-01-01'),
    CONSTRAINT chk_situacao CHECK(situacao IN('Cursando', 'Matrícula Trancada', 'Reprovado'))
);

CREATE TABLE IF NOT EXISTS Matricula(
    id_matricula INT IDENTITY(1,1) NOT NULL,
    id_aluno INT,
    cod_disciplina INT,
    ano DATE NOT NULL,
    semestre INT NOT NULL,
    nota_final FLOAT NOT NULL,
    frequencia INT NOT NULL,
    CONSTRAINT pk_Matriculo PRIMARY KEY (id_matricula),
    CONSTRAINT fk_id_aluno FOREIGN KEY (id_aluno) REFERENCES Aluno (id_aluno),
    CONSTRAINT fk_cod_disciplina FOREIGN KEY (cod_disciplina) REFERENCES Disciplina (cod_disciplina)
);

CREATE TABLE IF NOT EXISTS Disciplina(
    cod_disciplina INT IDENTITY(1,1) NOT NULL,
    cod_curso INT,
    nome_disciplina VARCHAR(20) NOT NULL,
    carga_horaria DATETIME NOT NULL,
    periodo VARCHAR(15) NOT NULL,
    CONSTRAINT pk_Disciplina PRIMARY KEY (cod_disciplina),
    CONSTRAINT fk_cod_curso FOREIGN KEY (cod_curso) REFERENCES Curso (cod_curso),
    CONSTRAINT chk_periodo CHECK(periodo IN('Manhã', 'Tarde', 'Noite', 'Integral'))
);