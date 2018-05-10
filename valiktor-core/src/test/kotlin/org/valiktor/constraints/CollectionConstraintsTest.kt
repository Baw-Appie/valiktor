package org.valiktor.constraints

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.Test
import org.valiktor.i18n.Locales
import org.valiktor.i18n.interpolatedMessages

class EmptyTest {

    @Test
    fun `should validate messages`() {
        assertThat(Empty.interpolatedMessages()).containsExactly(
                entry(Locales.DEFAULT, "Must be empty"),
                entry(Locales.EN, "Must be empty"),
                entry(Locales.PT_BR, "Deve ser vazio"))
    }
}

class NotEmptyTest {

    @Test
    fun `should validate messages`() {
        assertThat(NotEmpty.interpolatedMessages()).containsExactly(
                entry(Locales.DEFAULT, "Must not be empty"),
                entry(Locales.EN, "Must not be empty"),
                entry(Locales.PT_BR, "Não deve ser vazio"))
    }
}

class ContainsTest {

    @Test
    fun `should validate messages`() {
        assertThat(Contains("test").interpolatedMessages()).containsExactly(
                entry(Locales.DEFAULT, "Must contain test"),
                entry(Locales.EN, "Must contain test"),
                entry(Locales.PT_BR, "Deve conter test"))
    }
}

class ContainsAllTest {

    @Test
    fun `should validate messages`() {
        assertThat(ContainsAll(setOf(1, 2, 3)).interpolatedMessages()).containsExactly(
                entry(Locales.DEFAULT, "Must contain 1, 2, 3"),
                entry(Locales.EN, "Must contain 1, 2, 3"),
                entry(Locales.PT_BR, "Deve conter 1, 2, 3"))
    }
}

class ContainsAnyTest {

    @Test
    fun `should validate messages`() {
        assertThat(ContainsAny(setOf(1, 2, 3)).interpolatedMessages()).containsExactly(
                entry(Locales.DEFAULT, "Must contain 1, 2, 3"),
                entry(Locales.EN, "Must contain 1, 2, 3"),
                entry(Locales.PT_BR, "Deve conter 1, 2, 3"))
    }
}

class NotContainTest {

    @Test
    fun `should validate messages`() {
        assertThat(NotContain("test").interpolatedMessages()).containsExactly(
                entry(Locales.DEFAULT, "Must not contain test"),
                entry(Locales.EN, "Must not contain test"),
                entry(Locales.PT_BR, "Não deve conter test"))
    }
}

class NotContainAllTest {

    @Test
    fun `should validate messages`() {
        assertThat(NotContainAll(setOf(1, 2, 3)).interpolatedMessages()).containsExactly(
                entry(Locales.DEFAULT, "Must not contain 1, 2, 3"),
                entry(Locales.EN, "Must not contain 1, 2, 3"),
                entry(Locales.PT_BR, "Não deve conter 1, 2, 3"))
    }
}

class NotContainAnyTest {

    @Test
    fun `should validate messages`() {
        assertThat(NotContainAny(setOf(1, 2, 3)).interpolatedMessages()).containsExactly(
                entry(Locales.DEFAULT, "Must not contain 1, 2, 3"),
                entry(Locales.EN, "Must not contain 1, 2, 3"),
                entry(Locales.PT_BR, "Não deve conter 1, 2, 3"))
    }
}

class SizeTest {

    @Test
    fun `should validate messages with min`() {
        assertThat(Size(min = 5).interpolatedMessages()).containsExactly(
                entry(Locales.DEFAULT, "Size must be greater than or equal to 5"),
                entry(Locales.EN, "Size must be greater than or equal to 5"),
                entry(Locales.PT_BR, "O tamanho deve ser maior ou igual a 5"))
    }

    @Test
    fun `should validate messages with max`() {
        assertThat(Size(max = 10).interpolatedMessages()).containsExactly(
                entry(Locales.DEFAULT, "Size must be less than or equal to 10"),
                entry(Locales.EN, "Size must be less than or equal to 10"),
                entry(Locales.PT_BR, "O tamanho deve ser menor ou igual a 10"))
    }

    @Test
    fun `should validate messages with min and max`() {
        assertThat(Size(min = 5, max = 10).interpolatedMessages()).containsExactly(
                entry(Locales.DEFAULT, "Size must be between 5 and 10"),
                entry(Locales.EN, "Size must be between 5 and 10"),
                entry(Locales.PT_BR, "O tamanho deve estar entre 5 e 10"))
    }
}