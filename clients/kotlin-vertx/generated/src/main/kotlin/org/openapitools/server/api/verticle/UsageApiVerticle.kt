package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(UsageApiVerticle())
}

class UsageApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.UsageApiImpl").newInstance() as UsageApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(UsageApi.address)
            .register(UsageApi::class.java,instance)
    }
}