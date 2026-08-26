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
import org.openapitools.server.api.model.DeleteModelResponse
import org.openapitools.server.api.model.ListModelsResponse
import org.openapitools.server.api.model.Model

@MiskTest(startService = true)
internal class ModelsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var modelsApi: ModelsApiAction

    /**
     * To test ModelsApiAction.deleteModel
     */
    @Test
    fun `should handle deleteModel`() {
        val model = TODO()
        val response: DeleteModelResponse = modelsApi.deleteModel(model)
    }

    /**
     * To test ModelsApiAction.listModels
     */
    @Test
    fun `should handle listModels`() {
        val response: ListModelsResponse = modelsApi.listModels()
    }

    /**
     * To test ModelsApiAction.retrieveModel
     */
    @Test
    fun `should handle retrieveModel`() {
        val model = TODO()
        val response: Model = modelsApi.retrieveModel(model)
    }
}
