package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(BatchApiVerticle())
}

class BatchApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.BatchApiImpl").newInstance() as BatchApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(BatchApi.address)
            .register(BatchApi::class.java,instance)
    }
}