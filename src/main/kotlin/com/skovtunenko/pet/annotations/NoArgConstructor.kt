package com.skovtunenko.pet.annotations

/**
 * **Make sense for Kotlin code only.**
 *
 * For classes marked with this annotation will be generated an additional zero-argument constructor.
 *
 * The generated constructor is **synthetic** so it _can’t be directly called from Java or Kotlin_, but it can be called using reflection.
 *
 * @author Sergiy Kovtunenko
 * @since 3/8/17
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
annotation class NoArgConstructor
