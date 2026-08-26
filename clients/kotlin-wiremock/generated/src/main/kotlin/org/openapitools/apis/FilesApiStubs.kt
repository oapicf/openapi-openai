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
open class FilesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation createFile.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateFileStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createFile(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateFileStubBuilder =
        CreateFileStubBuilder(objectMapper, post(urlPathTemplate("/files"))
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteFile.
     *
     * @param fileId path parameter fileId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteFileStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteFile(fileId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteFileStubBuilder =
        DeleteFileStubBuilder(objectMapper, delete(urlPathTemplate("/files/{file_id}"))
            .withPathParam("file_id", fileId)
            .configurer()
        )

    /**
     * Construct a stub for the operation downloadFile.
     *
     * @param fileId path parameter fileId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DownloadFileStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun downloadFile(fileId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DownloadFileStubBuilder =
        DownloadFileStubBuilder(objectMapper, get(urlPathTemplate("/files/{file_id}/content"))
            .withPathParam("file_id", fileId)
            .configurer()
        )

    /**
     * Construct a stub for the operation listFiles.
     *
     * @param purpose query parameter purpose pattern.
     * @param limit query parameter limit pattern.
     * @param order query parameter order pattern.
     * @param after query parameter after pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListFilesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listFiles(purpose: StringValuePattern? = null, limit: StringValuePattern? = null, order: StringValuePattern? = null, after: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListFilesStubBuilder =
        ListFilesStubBuilder(objectMapper, get(urlPathTemplate("/files"))
            .apply { purpose?.let { withQueryParam("purpose", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { after?.let { withQueryParam("after", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation retrieveFile.
     *
     * @param fileId path parameter fileId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [RetrieveFileStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun retrieveFile(fileId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): RetrieveFileStubBuilder =
        RetrieveFileStubBuilder(objectMapper, get(urlPathTemplate("/files/{file_id}"))
            .withPathParam("file_id", fileId)
            .configurer()
        )
}
