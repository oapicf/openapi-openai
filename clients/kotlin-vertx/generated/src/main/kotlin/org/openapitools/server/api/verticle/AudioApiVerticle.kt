package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(AudioApiVerticle())
}

class AudioApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.AudioApiImpl").newInstance() as AudioApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(AudioApi.address)
            .register(AudioApi::class.java,instance)
    }
}