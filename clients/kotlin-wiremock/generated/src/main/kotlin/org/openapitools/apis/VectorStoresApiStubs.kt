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
open class VectorStoresApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation cancelVectorStoreFileBatch.
     *
     * @param vectorStoreId path parameter vectorStoreId pattern.
     * @param batchId path parameter batchId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CancelVectorStoreFileBatchStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun cancelVectorStoreFileBatch(vectorStoreId: StringValuePattern, batchId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CancelVectorStoreFileBatchStubBuilder =
        CancelVectorStoreFileBatchStubBuilder(objectMapper, post(urlPathTemplate("/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel"))
            .withPathParam("vector_store_id", vectorStoreId)
            .withPathParam("batch_id", batchId)
            .configurer()
        )

    /**
     * Construct a stub for the operation createVectorStore.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateVectorStoreStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createVectorStore(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateVectorStoreStubBuilder =
        CreateVectorStoreStubBuilder(objectMapper, post(urlPathTemplate("/vector_stores"))
            .configurer()
        )

    /**
     * Construct a stub for the operation createVectorStoreFile.
     *
     * @param vectorStoreId path parameter vectorStoreId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateVectorStoreFileStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createVectorStoreFile(vectorStoreId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateVectorStoreFileStubBuilder =
        CreateVectorStoreFileStubBuilder(objectMapper, post(urlPathTemplate("/vector_stores/{vector_store_id}/files"))
            .withPathParam("vector_store_id", vectorStoreId)
            .configurer()
        )

    /**
     * Construct a stub for the operation createVectorStoreFileBatch.
     *
     * @param vectorStoreId path parameter vectorStoreId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateVectorStoreFileBatchStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createVectorStoreFileBatch(vectorStoreId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateVectorStoreFileBatchStubBuilder =
        CreateVectorStoreFileBatchStubBuilder(objectMapper, post(urlPathTemplate("/vector_stores/{vector_store_id}/file_batches"))
            .withPathParam("vector_store_id", vectorStoreId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteVectorStore.
     *
     * @param vectorStoreId path parameter vectorStoreId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteVectorStoreStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteVectorStore(vectorStoreId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteVectorStoreStubBuilder =
        DeleteVectorStoreStubBuilder(objectMapper, delete(urlPathTemplate("/vector_stores/{vector_store_id}"))
            .withPathParam("vector_store_id", vectorStoreId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteVectorStoreFile.
     *
     * @param vectorStoreId path parameter vectorStoreId pattern.
     * @param fileId path parameter fileId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteVectorStoreFileStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteVectorStoreFile(vectorStoreId: StringValuePattern, fileId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteVectorStoreFileStubBuilder =
        DeleteVectorStoreFileStubBuilder(objectMapper, delete(urlPathTemplate("/vector_stores/{vector_store_id}/files/{file_id}"))
            .withPathParam("vector_store_id", vectorStoreId)
            .withPathParam("file_id", fileId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getVectorStore.
     *
     * @param vectorStoreId path parameter vectorStoreId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetVectorStoreStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getVectorStore(vectorStoreId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetVectorStoreStubBuilder =
        GetVectorStoreStubBuilder(objectMapper, get(urlPathTemplate("/vector_stores/{vector_store_id}"))
            .withPathParam("vector_store_id", vectorStoreId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getVectorStoreFile.
     *
     * @param vectorStoreId path parameter vectorStoreId pattern.
     * @param fileId path parameter fileId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetVectorStoreFileStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getVectorStoreFile(vectorStoreId: StringValuePattern, fileId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetVectorStoreFileStubBuilder =
        GetVectorStoreFileStubBuilder(objectMapper, get(urlPathTemplate("/vector_stores/{vector_store_id}/files/{file_id}"))
            .withPathParam("vector_store_id", vectorStoreId)
            .withPathParam("file_id", fileId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getVectorStoreFileBatch.
     *
     * @param vectorStoreId path parameter vectorStoreId pattern.
     * @param batchId path parameter batchId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetVectorStoreFileBatchStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getVectorStoreFileBatch(vectorStoreId: StringValuePattern, batchId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetVectorStoreFileBatchStubBuilder =
        GetVectorStoreFileBatchStubBuilder(objectMapper, get(urlPathTemplate("/vector_stores/{vector_store_id}/file_batches/{batch_id}"))
            .withPathParam("vector_store_id", vectorStoreId)
            .withPathParam("batch_id", batchId)
            .configurer()
        )

    /**
     * Construct a stub for the operation listFilesInVectorStoreBatch.
     *
     * @param vectorStoreId path parameter vectorStoreId pattern.
     * @param batchId path parameter batchId pattern.
     * @param limit query parameter limit pattern.
     * @param order query parameter order pattern.
     * @param after query parameter after pattern.
     * @param before query parameter before pattern.
     * @param filter query parameter filter pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListFilesInVectorStoreBatchStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listFilesInVectorStoreBatch(vectorStoreId: StringValuePattern, batchId: StringValuePattern, limit: StringValuePattern? = null, order: StringValuePattern? = null, after: StringValuePattern? = null, before: StringValuePattern? = null, filter: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListFilesInVectorStoreBatchStubBuilder =
        ListFilesInVectorStoreBatchStubBuilder(objectMapper, get(urlPathTemplate("/vector_stores/{vector_store_id}/file_batches/{batch_id}/files"))
            .withPathParam("vector_store_id", vectorStoreId)
            .withPathParam("batch_id", batchId)
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { after?.let { withQueryParam("after", it) } }
            .apply { before?.let { withQueryParam("before", it) } }
            .apply { filter?.let { withQueryParam("filter", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation listVectorStoreFiles.
     *
     * @param vectorStoreId path parameter vectorStoreId pattern.
     * @param limit query parameter limit pattern.
     * @param order query parameter order pattern.
     * @param after query parameter after pattern.
     * @param before query parameter before pattern.
     * @param filter query parameter filter pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListVectorStoreFilesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listVectorStoreFiles(vectorStoreId: StringValuePattern, limit: StringValuePattern? = null, order: StringValuePattern? = null, after: StringValuePattern? = null, before: StringValuePattern? = null, filter: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListVectorStoreFilesStubBuilder =
        ListVectorStoreFilesStubBuilder(objectMapper, get(urlPathTemplate("/vector_stores/{vector_store_id}/files"))
            .withPathParam("vector_store_id", vectorStoreId)
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { after?.let { withQueryParam("after", it) } }
            .apply { before?.let { withQueryParam("before", it) } }
            .apply { filter?.let { withQueryParam("filter", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation listVectorStores.
     *
     * @param limit query parameter limit pattern.
     * @param order query parameter order pattern.
     * @param after query parameter after pattern.
     * @param before query parameter before pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListVectorStoresStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listVectorStores(limit: StringValuePattern? = null, order: StringValuePattern? = null, after: StringValuePattern? = null, before: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListVectorStoresStubBuilder =
        ListVectorStoresStubBuilder(objectMapper, get(urlPathTemplate("/vector_stores"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { after?.let { withQueryParam("after", it) } }
            .apply { before?.let { withQueryParam("before", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation modifyVectorStore.
     *
     * @param vectorStoreId path parameter vectorStoreId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ModifyVectorStoreStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun modifyVectorStore(vectorStoreId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ModifyVectorStoreStubBuilder =
        ModifyVectorStoreStubBuilder(objectMapper, post(urlPathTemplate("/vector_stores/{vector_store_id}"))
            .withPathParam("vector_store_id", vectorStoreId)
            .configurer()
        )
}
