package co.nodeath.magichealthcounter.ui;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/** Taken From https://github.com/square/dagger */
@Qualifier @Retention(RetentionPolicy.RUNTIME)
public @interface Hide {
}
