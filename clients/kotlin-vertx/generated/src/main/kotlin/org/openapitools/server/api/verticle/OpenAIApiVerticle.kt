package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(OpenAIApiVerticle())
}

class OpenAIApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.OpenAIApiImpl").newInstance() as OpenAIApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(OpenAIApi.address)
            .register(OpenAIApi::class.java,instance)
    }
}