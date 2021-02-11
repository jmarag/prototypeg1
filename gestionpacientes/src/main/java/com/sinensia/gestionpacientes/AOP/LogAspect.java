package com.sinensia.gestionpacientes.AOP;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	private Logger log = LoggerFactory.getLogger(LogAspect.class);

	// Advice
	@Before("execution(* com.sinensia.gestionpacientes.backend.presentation.restcontrollers.UsuarioController.getAll())")
	public void xxxxxx() {
		log.info("Listado usuarios mostrado.");
	}

	// TODO

	// Advices de creación de logs (INFO) para todos los métodos de la capa de
	// business.

	@Before("execution(* com.sinensia.gestionpacientes.backend.business.services.impl..*(..))")
	public void yyyyyy() {
		log.info("Log de la capa de business.");
	}

	// Advices de creación de logs (INFO) para todos los end-points de los
	// controladores REST. Quiero saber qué parámetros entran y qué objetos
	// devuelven dichos end-points

	@AfterReturning(pointcut = "execution(* com.sinensia.gestionpacientes.backend.presentation.restcontrollers..*(..))", returning = "retorno", argNames = "joinPoint")
	public void zzzzz(Object retorno, JoinPoint joinPoint) throws Throwable {
		log.info("Log de la capa de restcontrollers.");
		log.info("Valor de retorno: " + retorno);
		log.info("Valor de DNI: " + joinPoint.getArgs());
	}

	// Advices de creación de logs (INFO) para todos los métodos de la capa de
	// integración. (interceptamos métodos de interfaces)

	@Before("execution(* com.sinensia.gestionpacientes.backend.integration..*(..))")
	public void wwwww() {
		log.info("Log de la capa de integration.");
	}

}