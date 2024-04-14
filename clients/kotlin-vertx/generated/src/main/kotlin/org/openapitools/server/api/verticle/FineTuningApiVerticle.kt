package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(FineTuningApiVerticle())
}

class FineTuningApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.FineTuningApiImpl").newInstance() as FineTuningApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(FineTuningApi.address)
            .register(FineTuningApi::class.java,instance)
    }
}