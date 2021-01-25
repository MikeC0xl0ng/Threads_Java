# Threads_Java

TEORIA:

  Un Thread è un singolo flusso sequenziale di istruzioni all’interno di un programma. Si può utilizzare più threads nello stesso momento per eseguire allo stesso tempo task 
  differenti. In Java la classe Thread esiste dal momento del lancio del linguaggio. Il programma scritta da me (Thread1Bodliev.java) crea il thread e gli dà il nome 
  “Thread Jeorge”. Lo tiene in vita per 3 secondi stampando ogni secondo il nome del thread e il numero di secondi rimanenti al termine del programma. Una volta terminato il 
  programma termina la sua esecuzione.

ANALISI:

	 
•	La riga 11 crea unistanza della classe Thread salvandola dentro la variabile tic
•	Riga 11 usa il metodo “setName” della classe Thread inserendo come nome “Thread Jeorge”

 
•	Nella seguente riga noi facciamo vedere tramite il log di output che il nostro Thread esiste stampando la frase 
  “Ecco il thread in corso: “ +  __NOME DEL THREAD__ (nel nostro caso è Thread Jeorge)”
 

•	Dopodiché abbiamo la parte più importante del nostro programma, ovvero lo scorrimento del tempo. Noi usiamo il blocco try-catch per evitare che il programma si blocchi 
dopo aver scontrato un problema di qualsiasi natura. Si crea un loop che va da 0 a 2 (iterazione di 3 valori: 0, 1, 2). Per ogni iterazione noi si fa la stmpa nel log di 
output la frase “Ecco il thread in corso: “ + __ NOME DEL THREAD (nel nostro caso è “Thread Jeorge”), la stampa del tempo rimanente (si stampa il valore di i concatenato 
alla stringa “ secondi rimanenti al termine del processo”) e infine iene richiamato il metodo sleep della classe Thread tramite la sua istanza tic. Tra le parentesi del metodo 
noi mettiamo il valore numerico che corrisponde ai milesecondi della pausa che va a fare “Thread Jeorge”. Nel caso in cui spunta un problema durante l’esecuzione del loop 
(guardare le righe 19-21), noi la gestiamo facendo la stampa nel log di output del messaggio di errore customizzato, nel mio caso ho scelto “Ops… qualcosa è andato storto”. 

 
•	Infine si ha la stampa che indica la terminazione con successo del nostro programma stampando “Il alvoro è stato terminato on successo.”
