from pessoa import Pessoa


def main():

    pessoas = [
        Pessoa("Carlos", 30),
        Pessoa("Ana", 25),
        Pessoa("Carlos", 20),
        Pessoa("Bruno", 18),
        Pessoa("Ana", 30)
    ]

    pessoas.sort()

    for pessoa in pessoas:
        print(pessoa.nome, pessoa.idade)


if __name__ == "__main__":
    main()