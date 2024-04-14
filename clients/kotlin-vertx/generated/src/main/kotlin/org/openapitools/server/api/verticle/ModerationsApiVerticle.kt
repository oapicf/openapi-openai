package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ModerationsApiVerticle())
}

class ModerationsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ModerationsApiImpl").newInstance() as ModerationsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ModerationsApi.address)
            .register(ModerationsApi::class.java,instance)
    }
}