package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ProjectsApiVerticle())
}

class ProjectsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ProjectsApiImpl").newInstance() as ProjectsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ProjectsApi.address)
            .register(ProjectsApi::class.java,instance)
    }
}