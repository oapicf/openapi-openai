package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(EmbeddingsApiVerticle())
}

class EmbeddingsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.EmbeddingsApiImpl").newInstance() as EmbeddingsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(EmbeddingsApi.address)
            .register(EmbeddingsApi::class.java,instance)
    }
}