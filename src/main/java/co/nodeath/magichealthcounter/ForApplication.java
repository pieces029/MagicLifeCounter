package co.nodeath.magichealthcounter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/** Taken From https://github.com/square/dagger */
@Qualifier @Retention(RetentionPolicy.RUNTIME)
public @interface ForApplication {
}
