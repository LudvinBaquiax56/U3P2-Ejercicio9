Algoritmo Ejercicio9
	Definir temperatura1 Como Entero
	Definir temperatura2 Como Entero
	Definir totalTemperatura Como Entero
	Definir numeroTotal Como Entero
	Repetir
		Escribir 'Ingrese la temperatura 1' 
		Leer temperatura1
		Escribir 'Ingrese la temperatura 2' 
		leer temperatura2
		si temperatura1 >= 5 & temperatura1 <= 15
			totalTemperatura = totalTemperatura + temperatura1
			numeroTotal = numeroTotal + 1
		FinSi
		si temperatura2 >= 5 & temperatura2 <= 15
			totalTemperatura = totalTemperatura + temperatura2
			numeroTotal = numeroTotal + 1
		FinSi
	Hasta Que temperatura1 = 0
	promedioTemperaturas = totalTemperatura / numeroTotal
	Escribir 'El promedio de ' numeroTotal ' temperaturas que se encuentran en el rango de 5 y 15 grados es ' promedioTemperaturas
FinAlgoritmo
