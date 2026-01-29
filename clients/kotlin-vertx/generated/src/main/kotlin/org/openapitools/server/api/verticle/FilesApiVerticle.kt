package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(FilesApiVerticle())
}

class FilesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.FilesApiImpl").newInstance() as FilesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(FilesApi.address)
            .register(FilesApi::class.java,instance)
    }
}