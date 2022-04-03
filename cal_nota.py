# entrada de dados com input que poderia ser int(inteiro), str(string) no caso float ( poderia ter casas decimais).
a = float(input("Insira uma nota da AVA1 de 0 até 100: "))

# while executa um ou mais comandos (variavél a +=1 apenas precisa de uma entrada certa)
# até que uma condição seja verdadeira.
while (a < 0) or (a > 100):
    a = float(input("Não pode ser menor que 0 ou maior que 100 meu jovem!\n \
       Tente novamente:"))
    a +=  1

# if após os dois pontos ( :) será executado sempre que a condição for verdadeira. no caso para de pedir
# a entrada da nota.
    if a <= 101:
        break

b = float(input("Insira uma nota da AVA2 de 0 até 100: "))

while (b < 0) or (b > 100):
    b = float(input("Não pode ser menor que 0 ou maior que 100 meu jovem!\n \
       Tente novamente:"))
    b +=  1
    if b <= 101:
        break

c = float(input('Digite nota A1 de 0 até 10: '))

while (c < 0) or (c > 10):
    c = float(input("Não pode ser menor que 0 ou maior que 10 meu jovem!\n \
        Tente novamente:"))
    c += 1
    if c <= 11:
        break

# cálculos e expressões algébricas.
ava = (a/10 + b/10)/2 * 0.4

a1 = c * 0.6

nota = ava + a1

# condição apresentando maior ou igual a 6.5 imprime Aprovado.
if nota >= 6.5:
    print("%.2f" % nota,'Aprovado')
# se não imprime realizar outra prova.
else:
    print("%.2f" % nota,'Precisa realizar A3')