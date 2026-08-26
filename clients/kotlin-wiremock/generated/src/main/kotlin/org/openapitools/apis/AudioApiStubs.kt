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
open class AudioApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation createSpeech.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateSpeechStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createSpeech(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateSpeechStubBuilder =
        CreateSpeechStubBuilder(objectMapper, post(urlPathTemplate("/audio/speech"))
            .configurer()
        )

    /**
     * Construct a stub for the operation createTranscription.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateTranscriptionStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createTranscription(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateTranscriptionStubBuilder =
        CreateTranscriptionStubBuilder(objectMapper, post(urlPathTemplate("/audio/transcriptions"))
            .configurer()
        )

    /**
     * Construct a stub for the operation createTranslation.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateTranslationStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createTranslation(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateTranslationStubBuilder =
        CreateTranslationStubBuilder(objectMapper, post(urlPathTemplate("/audio/translations"))
            .configurer()
        )
}
