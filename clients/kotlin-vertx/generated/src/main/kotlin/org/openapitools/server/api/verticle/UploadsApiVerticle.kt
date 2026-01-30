package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(UploadsApiVerticle())
}

class UploadsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.UploadsApiImpl").newInstance() as UploadsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(UploadsApi.address)
            .register(UploadsApi::class.java,instance)
    }
}