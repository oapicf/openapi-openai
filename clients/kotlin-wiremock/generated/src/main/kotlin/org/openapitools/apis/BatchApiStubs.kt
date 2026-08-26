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
open class BatchApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation cancelBatch.
     *
     * @param batchId path parameter batchId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CancelBatchStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun cancelBatch(batchId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CancelBatchStubBuilder =
        CancelBatchStubBuilder(objectMapper, post(urlPathTemplate("/batches/{batch_id}/cancel"))
            .withPathParam("batch_id", batchId)
            .configurer()
        )

    /**
     * Construct a stub for the operation createBatch.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateBatchStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createBatch(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateBatchStubBuilder =
        CreateBatchStubBuilder(objectMapper, post(urlPathTemplate("/batches"))
            .configurer()
        )

    /**
     * Construct a stub for the operation listBatches.
     *
     * @param after query parameter after pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListBatchesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listBatches(after: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListBatchesStubBuilder =
        ListBatchesStubBuilder(objectMapper, get(urlPathTemplate("/batches"))
            .apply { after?.let { withQueryParam("after", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation retrieveBatch.
     *
     * @param batchId path parameter batchId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [RetrieveBatchStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun retrieveBatch(batchId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): RetrieveBatchStubBuilder =
        RetrieveBatchStubBuilder(objectMapper, get(urlPathTemplate("/batches/{batch_id}"))
            .withPathParam("batch_id", batchId)
            .configurer()
        )
}
