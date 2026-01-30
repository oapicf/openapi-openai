package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(InvitesApiVerticle())
}

class InvitesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.InvitesApiImpl").newInstance() as InvitesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(InvitesApi.address)
            .register(InvitesApi::class.java,instance)
    }
}