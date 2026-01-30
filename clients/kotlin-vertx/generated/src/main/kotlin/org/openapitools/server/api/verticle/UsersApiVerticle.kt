package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(UsersApiVerticle())
}

class UsersApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.UsersApiImpl").newInstance() as UsersApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(UsersApi.address)
            .register(UsersApi::class.java,instance)
    }
}