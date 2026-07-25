package com.sportspredictor.shared;

/**
 * Contrato del patrón Observer.
 * Implementado por EmailObserver, PushObserver y MensajeriaObserver
 * en el paquete com.sportspredictor.observer (rama: feature/observer).
 */
public interface ObservadorNotificacion {
    void actualizar(Notificacion notificacion);
}
