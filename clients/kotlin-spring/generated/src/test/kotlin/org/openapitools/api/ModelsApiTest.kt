package org.openapitools.api

import org.openapitools.model.DeleteModelResponse
import org.openapitools.model.ListModelsResponse
import org.openapitools.model.Model
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ModelsApiTest {

    private val api: ModelsApiController = ModelsApiController()

    /**
     * To test ModelsApiController.deleteModel
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteModelTest() {
        val model: kotlin.String = TODO()
        val response: ResponseEntity<DeleteModelResponse> = api.deleteModel(model)

        // TODO: test validations
    }

    /**
     * To test ModelsApiController.listModels
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listModelsTest() {
        val response: ResponseEntity<ListModelsResponse> = api.listModels()

        // TODO: test validations
    }

    /**
     * To test ModelsApiController.retrieveModel
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun retrieveModelTest() {
        val model: kotlin.String = TODO()
        val response: ResponseEntity<Model> = api.retrieveModel(model)

        // TODO: test validations
    }
}
