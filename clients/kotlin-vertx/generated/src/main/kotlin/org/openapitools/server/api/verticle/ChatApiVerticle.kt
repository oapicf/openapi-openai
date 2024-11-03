package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ChatApiVerticle())
}

class ChatApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ChatApiImpl").newInstance() as ChatApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ChatApi.address)
            .register(ChatApi::class.java,instance)
    }
}