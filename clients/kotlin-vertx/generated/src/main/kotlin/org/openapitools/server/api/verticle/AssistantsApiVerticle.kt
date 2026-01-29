package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(AssistantsApiVerticle())
}

class AssistantsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.AssistantsApiImpl").newInstance() as AssistantsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(AssistantsApi.address)
            .register(AssistantsApi::class.java,instance)
    }
}