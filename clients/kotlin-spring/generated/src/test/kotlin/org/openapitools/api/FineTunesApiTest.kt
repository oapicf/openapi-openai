package org.openapitools.api

import org.openapitools.model.CreateFineTuneRequest
import org.openapitools.model.FineTune
import org.openapitools.model.ListFineTuneEventsResponse
import org.openapitools.model.ListFineTunesResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class FineTunesApiTest {

    private val api: FineTunesApiController = FineTunesApiController()

    /**
     * To test FineTunesApiController.cancelFineTune
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun cancelFineTuneTest() {
        val fineTuneId: kotlin.String = TODO()
        val response: ResponseEntity<FineTune> = api.cancelFineTune(fineTuneId)

        // TODO: test validations
    }

    /**
     * To test FineTunesApiController.createFineTune
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createFineTuneTest() {
        val createFineTuneRequest: CreateFineTuneRequest = TODO()
        val response: ResponseEntity<FineTune> = api.createFineTune(createFineTuneRequest)

        // TODO: test validations
    }

    /**
     * To test FineTunesApiController.listFineTuneEvents
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listFineTuneEventsTest() {
        val fineTuneId: kotlin.String = TODO()
        val stream: kotlin.Boolean = TODO()
        val response: ResponseEntity<ListFineTuneEventsResponse> = api.listFineTuneEvents(fineTuneId, stream)

        // TODO: test validations
    }

    /**
     * To test FineTunesApiController.listFineTunes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listFineTunesTest() {
        val response: ResponseEntity<ListFineTunesResponse> = api.listFineTunes()

        // TODO: test validations
    }

    /**
     * To test FineTunesApiController.retrieveFineTune
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun retrieveFineTuneTest() {
        val fineTuneId: kotlin.String = TODO()
        val response: ResponseEntity<FineTune> = api.retrieveFineTune(fineTuneId)

        // TODO: test validations
    }
}
