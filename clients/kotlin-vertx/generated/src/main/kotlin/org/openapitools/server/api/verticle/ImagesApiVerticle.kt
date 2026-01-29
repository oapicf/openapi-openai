package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ImagesApiVerticle())
}

class ImagesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ImagesApiImpl").newInstance() as ImagesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ImagesApi.address)
            .register(ImagesApi::class.java,instance)
    }
}