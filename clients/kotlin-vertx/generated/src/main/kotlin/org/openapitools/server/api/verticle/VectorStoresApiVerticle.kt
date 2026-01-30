package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(VectorStoresApiVerticle())
}

class VectorStoresApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.VectorStoresApiImpl").newInstance() as VectorStoresApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(VectorStoresApi.address)
            .register(VectorStoresApi::class.java,instance)
    }
}