package com.skovtunenko.pet.annotations

/**
 * **Make sense for Kotlin code only.**
 *
 * Meta annotation that combines effect of [AllOpen] and [NoArgConstructor].
 *
 * @author Sergiy Kovtunenko
 * @since 3/8/17
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
@AllOpen
@NoArgConstructor
annotation class AllOpenWithNoArgConstructor
