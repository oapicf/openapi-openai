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
open class ImagesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation createImage.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateImageStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createImage(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateImageStubBuilder =
        CreateImageStubBuilder(objectMapper, post(urlPathTemplate("/images/generations"))
            .configurer()
        )

    /**
     * Construct a stub for the operation createImageEdit.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateImageEditStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createImageEdit(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateImageEditStubBuilder =
        CreateImageEditStubBuilder(objectMapper, post(urlPathTemplate("/images/edits"))
            .configurer()
        )

    /**
     * Construct a stub for the operation createImageVariation.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateImageVariationStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createImageVariation(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateImageVariationStubBuilder =
        CreateImageVariationStubBuilder(objectMapper, post(urlPathTemplate("/images/variations"))
            .configurer()
        )
}
