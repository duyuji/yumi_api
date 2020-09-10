package br.com.yumi.api.domain

case class Address(street: String, number: String, neighborhood: String, cep: String, city: City, state: State, country: Country)