package org.openapitools.api

import org.openapitools.model.AssistantObject
import org.openapitools.model.CreateAssistantRequest
import org.openapitools.model.DeleteAssistantResponse
import org.openapitools.model.ListAssistantsResponse
import org.openapitools.model.ModifyAssistantRequest
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class AssistantsApiTest {

    private val api: AssistantsApiController = AssistantsApiController()

    /**
     * To test AssistantsApiController.createAssistant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createAssistantTest() {
        val createAssistantRequest: CreateAssistantRequest = TODO()
        
        val response: ResponseEntity<AssistantObject> = api.createAssistant(createAssistantRequest)

        // TODO: test validations
    }

    /**
     * To test AssistantsApiController.deleteAssistant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteAssistantTest() {
        val assistantId: kotlin.String = TODO()
        
        val response: ResponseEntity<DeleteAssistantResponse> = api.deleteAssistant(assistantId)

        // TODO: test validations
    }

    /**
     * To test AssistantsApiController.getAssistant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAssistantTest() {
        val assistantId: kotlin.String = TODO()
        
        val response: ResponseEntity<AssistantObject> = api.getAssistant(assistantId)

        // TODO: test validations
    }

    /**
     * To test AssistantsApiController.listAssistants
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listAssistantsTest() {
        val limit: kotlin.Int = TODO()
        val order: kotlin.String = TODO()
        val after: kotlin.String? = TODO()
        val before: kotlin.String? = TODO()
        
        val response: ResponseEntity<ListAssistantsResponse> = api.listAssistants(limit, order, after, before)

        // TODO: test validations
    }

    /**
     * To test AssistantsApiController.modifyAssistant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun modifyAssistantTest() {
        val assistantId: kotlin.String = TODO()
        val modifyAssistantRequest: ModifyAssistantRequest = TODO()
        
        val response: ResponseEntity<AssistantObject> = api.modifyAssistant(assistantId, modifyAssistantRequest)

        // TODO: test validations
    }
}
