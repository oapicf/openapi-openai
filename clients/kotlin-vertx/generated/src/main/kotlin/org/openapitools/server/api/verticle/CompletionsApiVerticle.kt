package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CompletionsApiVerticle())
}

class CompletionsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.CompletionsApiImpl").newInstance() as CompletionsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CompletionsApi.address)
            .register(CompletionsApi::class.java,instance)
    }
}