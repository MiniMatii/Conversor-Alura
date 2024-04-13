Proyecto integrador de Alura Back-End (Java) 

Durante los dias de desarrollo de la logica de este algoritmo se utilizo diversos elementos, tales como la API de ExchangeRate y JSON.
El proyecto actualmente cuenta con una funcionalidad que es la de moneda de cambio directo, ingresando los digitos de tu moneda nativa, y las de cambio, mas el monto, recibiras la informacion de cuanto es la cotizacion de esta en el mercado al dia de la fecha (no informara la fecha)
El desarrollo de este algoritmo es ligeramente sencillo de entender; 
datos_moneda.java : 
Encargado de recoger los datos que vienen directamente desde ExchangeRate-API

modif.java:
Encargado de crear el mensaje que recibira en pantalla el usuario una vez realizada la consulta

consulta_moneda.java:
En este archivo, crearemos la peticion a la api con JSON aplicando los metodos aprendidos durante los videos de JavaBackEnd Alura

Menu.java:
Contiene la funcion que mostrara el menu para generar la interaccion con el usuario interesado en el algoritmo

ConversorPrincipal.Java: 
Pantalla principal donde existen las variables y entradas que colocara el usuario, enviara dichas variables a los modulos para generar la respuesta esperada por el usuario y finalmente las mostrará en pantalla.


Como primer proyecto de desarrollo en Java, seguire investigando funcionalidades a implementar para mejorar el codigo y volverlo eficiente.
-Matias Fracchia (MiniMati)