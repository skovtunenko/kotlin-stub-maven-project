package com.skovtunenko.pet.annotations

/**
 * **Make sense for Kotlin code only.**
 *
 * Annotation that makes classes annotated with a specific annotation and their members open without the explicit open keyword.
 * For instance, when you use Spring, you don't need all the classes to be open,
 * but only classes annotated with specific annotations like @Configuration or @Service.
 *
 * @author Sergiy Kovtunenko
 * @since 3/8/17
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
annotation class AllOpen
