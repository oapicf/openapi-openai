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
open class ChatApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation createChatCompletion.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateChatCompletionStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createChatCompletion(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateChatCompletionStubBuilder =
        CreateChatCompletionStubBuilder(objectMapper, post(urlPathTemplate("/chat/completions"))
            .configurer()
        )
}
