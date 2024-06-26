package org.openapitools.server

import io.ktor.server.application.*
import io.ktor.serialization.gson.*
import io.ktor.http.*
import io.ktor.server.resources.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.plugins.compression.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.defaultheaders.*
import io.ktor.server.plugins.hsts.*
import com.codahale.metrics.Slf4jReporter
import io.ktor.server.metrics.dropwizard.*
import java.util.concurrent.TimeUnit
import io.ktor.server.routing.*
import com.typesafe.config.ConfigFactory
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.server.config.HoconApplicationConfig
import io.ktor.server.auth.*
import org.openapitools.server.infrastructure.*
import org.openapitools.server.apis.AssistantsApi
import org.openapitools.server.apis.AudioApi
import org.openapitools.server.apis.ChatApi
import org.openapitools.server.apis.CompletionsApi
import org.openapitools.server.apis.EmbeddingsApi
import org.openapitools.server.apis.FilesApi
import org.openapitools.server.apis.FineTuningApi
import org.openapitools.server.apis.ImagesApi
import org.openapitools.server.apis.ModelsApi
import org.openapitools.server.apis.ModerationsApi


internal val settings = HoconApplicationConfig(ConfigFactory.defaultApplication(HTTP::class.java.classLoader))

object HTTP {
    val client = HttpClient(Apache)
}

fun Application.main() {
    install(DefaultHeaders)
    install(DropwizardMetrics) {
        val reporter = Slf4jReporter.forRegistry(registry)
            .outputTo(this@main.log)
            .convertRatesTo(TimeUnit.SECONDS)
            .convertDurationsTo(TimeUnit.MILLISECONDS)
            .build()
        reporter.start(10, TimeUnit.SECONDS)
    }
    install(ContentNegotiation) {
        register(ContentType.Application.Json, GsonConverter())
    }
    install(AutoHeadResponse) // see https://ktor.io/docs/autoheadresponse.html
    install(Compression, ApplicationCompressionConfiguration()) // see https://ktor.io/docs/compression.html
    install(HSTS, ApplicationHstsConfiguration()) // see https://ktor.io/docs/hsts.html
    install(Resources)
    install(Authentication) {
    }
    install(Routing) {
        AssistantsApi()
        AudioApi()
        ChatApi()
        CompletionsApi()
        EmbeddingsApi()
        FilesApi()
        FineTuningApi()
        ImagesApi()
        ModelsApi()
        ModerationsApi()
    }

}
