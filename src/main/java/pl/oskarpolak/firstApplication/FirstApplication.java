package pl.oskarpolak.firstApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);

	}

	/*Michał Makaruk: Stwórz stronę logowania, w 2 językach (angielski polski),
	która pozwoli na zalogowanie się loginem i hasłem, a także przesłanie nicku
			(login: oskar, haslo: admin)(nie zapomnij o odpowiedniej walidacji).
	Po logowaniu niepoprawnym wyświetli stosowny komunikat w kolorze czerwonym,
	po zalogowaniu poprawnie wyświetli templatke o nazwie main,
	w której zawarty będzie formularz obliczania raty kredytowej i przywitanie.
	Przywitanie wyglada w sposob nastepujacy, "Witaj, *nick*".
	Formularz kredytu bedzie skladal sie z pol takich jak wpisz:
	kwota kredytu, dochód miesięczny , miesieczne zobowiazania,
	okres kredytowania w mc. Po klikniecu przycisku "sprawdz czy dostaniesz kredyt",
	wyliczysz zdolność kredytową delikwenta algorytmem:
	jeśli dochod miesieczny - zobowiazania miesieczne
	beda o 30% wieksze niz kwota kredytu podzielona przez okres zobowiazania,
	wyswietl userowi odpowiedni komunikat,
	o przyznaniu kredytu. W przeciwnym razie, poinformuj go, ze ma zbyt niskie dochody.  */

}
