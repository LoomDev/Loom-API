package org.loomdev.api.plugin.annotation;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation injects an {@link Configuration} instance.
 */
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
public @interface Configuration {

    /**
     * The path of the configuration relative to the plugin directory.
     *
     * @return The path.
     */
    String path();

}
