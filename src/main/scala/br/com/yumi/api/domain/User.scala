package br.com.yumi.api.domain

import java.time.LocalDate

case class User(id: Long, name: String, birthday: LocalDate, cpf: String)
