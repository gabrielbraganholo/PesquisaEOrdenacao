class Pessoa:

    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def __lt__(self, outro):
        return (self.nome, self.idade) < (outro.nome, outro.idade)