package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ModelsApiVerticle())
}

class ModelsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ModelsApiImpl").newInstance() as ModelsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ModelsApi.address)
            .register(ModelsApi::class.java,instance)
    }
}