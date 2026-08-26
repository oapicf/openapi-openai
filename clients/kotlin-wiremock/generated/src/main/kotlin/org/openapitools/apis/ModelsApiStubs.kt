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
open class ModelsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation deleteModel.
     *
     * @param model path parameter model pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteModelStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteModel(model: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteModelStubBuilder =
        DeleteModelStubBuilder(objectMapper, delete(urlPathTemplate("/models/{model}"))
            .withPathParam("model", model)
            .configurer()
        )

    /**
     * Construct a stub for the operation listModels.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListModelsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listModels(configurer: MappingBuilder.() -> MappingBuilder = { this }): ListModelsStubBuilder =
        ListModelsStubBuilder(objectMapper, get(urlPathTemplate("/models"))
            .configurer()
        )

    /**
     * Construct a stub for the operation retrieveModel.
     *
     * @param model path parameter model pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [RetrieveModelStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun retrieveModel(model: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): RetrieveModelStubBuilder =
        RetrieveModelStubBuilder(objectMapper, get(urlPathTemplate("/models/{model}"))
            .withPathParam("model", model)
            .configurer()
        )
}
