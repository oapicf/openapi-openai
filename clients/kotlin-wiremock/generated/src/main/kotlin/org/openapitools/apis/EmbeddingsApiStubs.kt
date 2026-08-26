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
open class EmbeddingsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation createEmbedding.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateEmbeddingStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createEmbedding(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateEmbeddingStubBuilder =
        CreateEmbeddingStubBuilder(objectMapper, post(urlPathTemplate("/embeddings"))
            .configurer()
        )
}
