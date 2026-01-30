package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(RealtimeApiVerticle())
}

class RealtimeApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.RealtimeApiImpl").newInstance() as RealtimeApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(RealtimeApi.address)
            .register(RealtimeApi::class.java,instance)
    }
}