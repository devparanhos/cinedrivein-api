package br.com.renovatiu.cinedrivein.core.validation.email

import jakarta.validation.Constraint
import jakarta.validation.Payload
import kotlin.reflect.KClass

@Constraint(validatedBy = [EmailAvailableValidation::class])
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class EmailAvailableAnnotation(
    val message: String = "E-mail já cadastrado",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
)
