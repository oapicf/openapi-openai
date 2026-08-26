@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class RealtimeApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation createRealtimeSession.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateRealtimeSessionStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createRealtimeSession(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateRealtimeSessionStubBuilder =
        CreateRealtimeSessionStubBuilder(objectMapper, post(urlPathTemplate("/realtime/sessions"))
            .configurer()
        )
}
