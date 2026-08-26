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
open class FineTuningApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation cancelFineTuningJob.
     *
     * @param fineTuningJobId path parameter fineTuningJobId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CancelFineTuningJobStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun cancelFineTuningJob(fineTuningJobId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CancelFineTuningJobStubBuilder =
        CancelFineTuningJobStubBuilder(objectMapper, post(urlPathTemplate("/fine_tuning/jobs/{fine_tuning_job_id}/cancel"))
            .withPathParam("fine_tuning_job_id", fineTuningJobId)
            .configurer()
        )

    /**
     * Construct a stub for the operation createFineTuningJob.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateFineTuningJobStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createFineTuningJob(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateFineTuningJobStubBuilder =
        CreateFineTuningJobStubBuilder(objectMapper, post(urlPathTemplate("/fine_tuning/jobs"))
            .configurer()
        )

    /**
     * Construct a stub for the operation listFineTuningEvents.
     *
     * @param fineTuningJobId path parameter fineTuningJobId pattern.
     * @param after query parameter after pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListFineTuningEventsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listFineTuningEvents(fineTuningJobId: StringValuePattern, after: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListFineTuningEventsStubBuilder =
        ListFineTuningEventsStubBuilder(objectMapper, get(urlPathTemplate("/fine_tuning/jobs/{fine_tuning_job_id}/events"))
            .withPathParam("fine_tuning_job_id", fineTuningJobId)
            .apply { after?.let { withQueryParam("after", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation listFineTuningJobCheckpoints.
     *
     * @param fineTuningJobId path parameter fineTuningJobId pattern.
     * @param after query parameter after pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListFineTuningJobCheckpointsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listFineTuningJobCheckpoints(fineTuningJobId: StringValuePattern, after: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListFineTuningJobCheckpointsStubBuilder =
        ListFineTuningJobCheckpointsStubBuilder(objectMapper, get(urlPathTemplate("/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints"))
            .withPathParam("fine_tuning_job_id", fineTuningJobId)
            .apply { after?.let { withQueryParam("after", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation listPaginatedFineTuningJobs.
     *
     * @param after query parameter after pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListPaginatedFineTuningJobsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listPaginatedFineTuningJobs(after: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListPaginatedFineTuningJobsStubBuilder =
        ListPaginatedFineTuningJobsStubBuilder(objectMapper, get(urlPathTemplate("/fine_tuning/jobs"))
            .apply { after?.let { withQueryParam("after", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation retrieveFineTuningJob.
     *
     * @param fineTuningJobId path parameter fineTuningJobId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [RetrieveFineTuningJobStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun retrieveFineTuningJob(fineTuningJobId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): RetrieveFineTuningJobStubBuilder =
        RetrieveFineTuningJobStubBuilder(objectMapper, get(urlPathTemplate("/fine_tuning/jobs/{fine_tuning_job_id}"))
            .withPathParam("fine_tuning_job_id", fineTuningJobId)
            .configurer()
        )
}
