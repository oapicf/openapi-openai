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
open class DefaultApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation adminApiKeysCreate.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdminApiKeysCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adminApiKeysCreate(configurer: MappingBuilder.() -> MappingBuilder = { this }): AdminApiKeysCreateStubBuilder =
        AdminApiKeysCreateStubBuilder(objectMapper, post(urlPathTemplate("/organization/admin_api_keys"))
            .configurer()
        )

    /**
     * Construct a stub for the operation adminApiKeysDelete.
     *
     * @param keyId path parameter keyId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdminApiKeysDeleteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adminApiKeysDelete(keyId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdminApiKeysDeleteStubBuilder =
        AdminApiKeysDeleteStubBuilder(objectMapper, delete(urlPathTemplate("/organization/admin_api_keys/{key_id}"))
            .withPathParam("key_id", keyId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adminApiKeysGet.
     *
     * @param keyId path parameter keyId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdminApiKeysGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adminApiKeysGet(keyId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdminApiKeysGetStubBuilder =
        AdminApiKeysGetStubBuilder(objectMapper, get(urlPathTemplate("/organization/admin_api_keys/{key_id}"))
            .withPathParam("key_id", keyId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adminApiKeysList.
     *
     * @param after query parameter after pattern.
     * @param order query parameter order pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdminApiKeysListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adminApiKeysList(after: StringValuePattern? = null, order: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdminApiKeysListStubBuilder =
        AdminApiKeysListStubBuilder(objectMapper, get(urlPathTemplate("/organization/admin_api_keys"))
            .apply { after?.let { withQueryParam("after", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )
}
