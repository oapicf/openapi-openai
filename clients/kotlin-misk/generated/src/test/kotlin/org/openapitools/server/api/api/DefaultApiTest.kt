package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
import org.openapitools.server.api.model.AdminApiKey
import org.openapitools.server.api.model.AdminApiKeysCreateRequest
import org.openapitools.server.api.model.AdminApiKeysDelete200Response
import org.openapitools.server.api.model.ApiKeyList

@MiskTest(startService = true)
internal class DefaultApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var defaultApi: DefaultApiAction

    /**
     * To test DefaultApiAction.adminApiKeysCreate
     */
    @Test
    fun `should handle adminApiKeysCreate`() {
        val adminApiKeysCreateRequest = TODO()
        val response: AdminApiKey = defaultApi.adminApiKeysCreate(adminApiKeysCreateRequest)
    }

    /**
     * To test DefaultApiAction.adminApiKeysDelete
     */
    @Test
    fun `should handle adminApiKeysDelete`() {
        val keyId = TODO()
        val response: AdminApiKeysDelete200Response = defaultApi.adminApiKeysDelete(keyId)
    }

    /**
     * To test DefaultApiAction.adminApiKeysGet
     */
    @Test
    fun `should handle adminApiKeysGet`() {
        val keyId = TODO()
        val response: AdminApiKey = defaultApi.adminApiKeysGet(keyId)
    }

    /**
     * To test DefaultApiAction.adminApiKeysList
     */
    @Test
    fun `should handle adminApiKeysList`() {
        val after = TODO()
        val order = TODO()
        val limit = TODO()
        val response: ApiKeyList = defaultApi.adminApiKeysList(after, order, limit)
    }
}
