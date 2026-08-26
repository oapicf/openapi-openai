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
open class UploadsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation addUploadPart.
     *
     * @param uploadId path parameter uploadId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AddUploadPartStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun addUploadPart(uploadId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AddUploadPartStubBuilder =
        AddUploadPartStubBuilder(objectMapper, post(urlPathTemplate("/uploads/{upload_id}/parts"))
            .withPathParam("upload_id", uploadId)
            .configurer()
        )

    /**
     * Construct a stub for the operation cancelUpload.
     *
     * @param uploadId path parameter uploadId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CancelUploadStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun cancelUpload(uploadId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CancelUploadStubBuilder =
        CancelUploadStubBuilder(objectMapper, post(urlPathTemplate("/uploads/{upload_id}/cancel"))
            .withPathParam("upload_id", uploadId)
            .configurer()
        )

    /**
     * Construct a stub for the operation completeUpload.
     *
     * @param uploadId path parameter uploadId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CompleteUploadStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun completeUpload(uploadId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CompleteUploadStubBuilder =
        CompleteUploadStubBuilder(objectMapper, post(urlPathTemplate("/uploads/{upload_id}/complete"))
            .withPathParam("upload_id", uploadId)
            .configurer()
        )

    /**
     * Construct a stub for the operation createUpload.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateUploadStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createUpload(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateUploadStubBuilder =
        CreateUploadStubBuilder(objectMapper, post(urlPathTemplate("/uploads"))
            .configurer()
        )
}
