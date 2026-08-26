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
open class UsageApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation usageAudioSpeeches.
     *
     * @param startTime query parameter startTime pattern.
     * @param endTime query parameter endTime pattern.
     * @param bucketWidth query parameter bucketWidth pattern.
     * @param projectIds query parameter projectIds pattern.
     * @param userIds query parameter userIds pattern.
     * @param apiKeyIds query parameter apiKeyIds pattern.
     * @param models query parameter models pattern.
     * @param groupBy query parameter groupBy pattern.
     * @param limit query parameter limit pattern.
     * @param page query parameter page pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UsageAudioSpeechesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun usageAudioSpeeches(startTime: StringValuePattern? = null, endTime: StringValuePattern? = null, bucketWidth: StringValuePattern? = null, projectIds: StringValuePattern? = null, userIds: StringValuePattern? = null, apiKeyIds: StringValuePattern? = null, models: StringValuePattern? = null, groupBy: StringValuePattern? = null, limit: StringValuePattern? = null, page: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UsageAudioSpeechesStubBuilder =
        UsageAudioSpeechesStubBuilder(objectMapper, get(urlPathTemplate("/organization/usage/audio_speeches"))
            .apply { startTime?.let { withQueryParam("start_time", it) } }
            .apply { endTime?.let { withQueryParam("end_time", it) } }
            .apply { bucketWidth?.let { withQueryParam("bucket_width", it) } }
            .apply { projectIds?.let { withQueryParam("project_ids", it) } }
            .apply { userIds?.let { withQueryParam("user_ids", it) } }
            .apply { apiKeyIds?.let { withQueryParam("api_key_ids", it) } }
            .apply { models?.let { withQueryParam("models", it) } }
            .apply { groupBy?.let { withQueryParam("group_by", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { page?.let { withQueryParam("page", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation usageAudioTranscriptions.
     *
     * @param startTime query parameter startTime pattern.
     * @param endTime query parameter endTime pattern.
     * @param bucketWidth query parameter bucketWidth pattern.
     * @param projectIds query parameter projectIds pattern.
     * @param userIds query parameter userIds pattern.
     * @param apiKeyIds query parameter apiKeyIds pattern.
     * @param models query parameter models pattern.
     * @param groupBy query parameter groupBy pattern.
     * @param limit query parameter limit pattern.
     * @param page query parameter page pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UsageAudioTranscriptionsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun usageAudioTranscriptions(startTime: StringValuePattern? = null, endTime: StringValuePattern? = null, bucketWidth: StringValuePattern? = null, projectIds: StringValuePattern? = null, userIds: StringValuePattern? = null, apiKeyIds: StringValuePattern? = null, models: StringValuePattern? = null, groupBy: StringValuePattern? = null, limit: StringValuePattern? = null, page: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UsageAudioTranscriptionsStubBuilder =
        UsageAudioTranscriptionsStubBuilder(objectMapper, get(urlPathTemplate("/organization/usage/audio_transcriptions"))
            .apply { startTime?.let { withQueryParam("start_time", it) } }
            .apply { endTime?.let { withQueryParam("end_time", it) } }
            .apply { bucketWidth?.let { withQueryParam("bucket_width", it) } }
            .apply { projectIds?.let { withQueryParam("project_ids", it) } }
            .apply { userIds?.let { withQueryParam("user_ids", it) } }
            .apply { apiKeyIds?.let { withQueryParam("api_key_ids", it) } }
            .apply { models?.let { withQueryParam("models", it) } }
            .apply { groupBy?.let { withQueryParam("group_by", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { page?.let { withQueryParam("page", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation usageCodeInterpreterSessions.
     *
     * @param startTime query parameter startTime pattern.
     * @param endTime query parameter endTime pattern.
     * @param bucketWidth query parameter bucketWidth pattern.
     * @param projectIds query parameter projectIds pattern.
     * @param groupBy query parameter groupBy pattern.
     * @param limit query parameter limit pattern.
     * @param page query parameter page pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UsageCodeInterpreterSessionsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun usageCodeInterpreterSessions(startTime: StringValuePattern? = null, endTime: StringValuePattern? = null, bucketWidth: StringValuePattern? = null, projectIds: StringValuePattern? = null, groupBy: StringValuePattern? = null, limit: StringValuePattern? = null, page: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UsageCodeInterpreterSessionsStubBuilder =
        UsageCodeInterpreterSessionsStubBuilder(objectMapper, get(urlPathTemplate("/organization/usage/code_interpreter_sessions"))
            .apply { startTime?.let { withQueryParam("start_time", it) } }
            .apply { endTime?.let { withQueryParam("end_time", it) } }
            .apply { bucketWidth?.let { withQueryParam("bucket_width", it) } }
            .apply { projectIds?.let { withQueryParam("project_ids", it) } }
            .apply { groupBy?.let { withQueryParam("group_by", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { page?.let { withQueryParam("page", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation usageCompletions.
     *
     * @param startTime query parameter startTime pattern.
     * @param endTime query parameter endTime pattern.
     * @param bucketWidth query parameter bucketWidth pattern.
     * @param projectIds query parameter projectIds pattern.
     * @param userIds query parameter userIds pattern.
     * @param apiKeyIds query parameter apiKeyIds pattern.
     * @param models query parameter models pattern.
     * @param batch query parameter batch pattern.
     * @param groupBy query parameter groupBy pattern.
     * @param limit query parameter limit pattern.
     * @param page query parameter page pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UsageCompletionsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun usageCompletions(startTime: StringValuePattern? = null, endTime: StringValuePattern? = null, bucketWidth: StringValuePattern? = null, projectIds: StringValuePattern? = null, userIds: StringValuePattern? = null, apiKeyIds: StringValuePattern? = null, models: StringValuePattern? = null, batch: StringValuePattern? = null, groupBy: StringValuePattern? = null, limit: StringValuePattern? = null, page: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UsageCompletionsStubBuilder =
        UsageCompletionsStubBuilder(objectMapper, get(urlPathTemplate("/organization/usage/completions"))
            .apply { startTime?.let { withQueryParam("start_time", it) } }
            .apply { endTime?.let { withQueryParam("end_time", it) } }
            .apply { bucketWidth?.let { withQueryParam("bucket_width", it) } }
            .apply { projectIds?.let { withQueryParam("project_ids", it) } }
            .apply { userIds?.let { withQueryParam("user_ids", it) } }
            .apply { apiKeyIds?.let { withQueryParam("api_key_ids", it) } }
            .apply { models?.let { withQueryParam("models", it) } }
            .apply { batch?.let { withQueryParam("batch", it) } }
            .apply { groupBy?.let { withQueryParam("group_by", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { page?.let { withQueryParam("page", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation usageCosts.
     *
     * @param startTime query parameter startTime pattern.
     * @param endTime query parameter endTime pattern.
     * @param bucketWidth query parameter bucketWidth pattern.
     * @param projectIds query parameter projectIds pattern.
     * @param groupBy query parameter groupBy pattern.
     * @param limit query parameter limit pattern.
     * @param page query parameter page pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UsageCostsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun usageCosts(startTime: StringValuePattern? = null, endTime: StringValuePattern? = null, bucketWidth: StringValuePattern? = null, projectIds: StringValuePattern? = null, groupBy: StringValuePattern? = null, limit: StringValuePattern? = null, page: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UsageCostsStubBuilder =
        UsageCostsStubBuilder(objectMapper, get(urlPathTemplate("/organization/costs"))
            .apply { startTime?.let { withQueryParam("start_time", it) } }
            .apply { endTime?.let { withQueryParam("end_time", it) } }
            .apply { bucketWidth?.let { withQueryParam("bucket_width", it) } }
            .apply { projectIds?.let { withQueryParam("project_ids", it) } }
            .apply { groupBy?.let { withQueryParam("group_by", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { page?.let { withQueryParam("page", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation usageEmbeddings.
     *
     * @param startTime query parameter startTime pattern.
     * @param endTime query parameter endTime pattern.
     * @param bucketWidth query parameter bucketWidth pattern.
     * @param projectIds query parameter projectIds pattern.
     * @param userIds query parameter userIds pattern.
     * @param apiKeyIds query parameter apiKeyIds pattern.
     * @param models query parameter models pattern.
     * @param groupBy query parameter groupBy pattern.
     * @param limit query parameter limit pattern.
     * @param page query parameter page pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UsageEmbeddingsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun usageEmbeddings(startTime: StringValuePattern? = null, endTime: StringValuePattern? = null, bucketWidth: StringValuePattern? = null, projectIds: StringValuePattern? = null, userIds: StringValuePattern? = null, apiKeyIds: StringValuePattern? = null, models: StringValuePattern? = null, groupBy: StringValuePattern? = null, limit: StringValuePattern? = null, page: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UsageEmbeddingsStubBuilder =
        UsageEmbeddingsStubBuilder(objectMapper, get(urlPathTemplate("/organization/usage/embeddings"))
            .apply { startTime?.let { withQueryParam("start_time", it) } }
            .apply { endTime?.let { withQueryParam("end_time", it) } }
            .apply { bucketWidth?.let { withQueryParam("bucket_width", it) } }
            .apply { projectIds?.let { withQueryParam("project_ids", it) } }
            .apply { userIds?.let { withQueryParam("user_ids", it) } }
            .apply { apiKeyIds?.let { withQueryParam("api_key_ids", it) } }
            .apply { models?.let { withQueryParam("models", it) } }
            .apply { groupBy?.let { withQueryParam("group_by", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { page?.let { withQueryParam("page", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation usageImages.
     *
     * @param startTime query parameter startTime pattern.
     * @param endTime query parameter endTime pattern.
     * @param bucketWidth query parameter bucketWidth pattern.
     * @param sources query parameter sources pattern.
     * @param sizes query parameter sizes pattern.
     * @param projectIds query parameter projectIds pattern.
     * @param userIds query parameter userIds pattern.
     * @param apiKeyIds query parameter apiKeyIds pattern.
     * @param models query parameter models pattern.
     * @param groupBy query parameter groupBy pattern.
     * @param limit query parameter limit pattern.
     * @param page query parameter page pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UsageImagesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun usageImages(startTime: StringValuePattern? = null, endTime: StringValuePattern? = null, bucketWidth: StringValuePattern? = null, sources: StringValuePattern? = null, sizes: StringValuePattern? = null, projectIds: StringValuePattern? = null, userIds: StringValuePattern? = null, apiKeyIds: StringValuePattern? = null, models: StringValuePattern? = null, groupBy: StringValuePattern? = null, limit: StringValuePattern? = null, page: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UsageImagesStubBuilder =
        UsageImagesStubBuilder(objectMapper, get(urlPathTemplate("/organization/usage/images"))
            .apply { startTime?.let { withQueryParam("start_time", it) } }
            .apply { endTime?.let { withQueryParam("end_time", it) } }
            .apply { bucketWidth?.let { withQueryParam("bucket_width", it) } }
            .apply { sources?.let { withQueryParam("sources", it) } }
            .apply { sizes?.let { withQueryParam("sizes", it) } }
            .apply { projectIds?.let { withQueryParam("project_ids", it) } }
            .apply { userIds?.let { withQueryParam("user_ids", it) } }
            .apply { apiKeyIds?.let { withQueryParam("api_key_ids", it) } }
            .apply { models?.let { withQueryParam("models", it) } }
            .apply { groupBy?.let { withQueryParam("group_by", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { page?.let { withQueryParam("page", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation usageModerations.
     *
     * @param startTime query parameter startTime pattern.
     * @param endTime query parameter endTime pattern.
     * @param bucketWidth query parameter bucketWidth pattern.
     * @param projectIds query parameter projectIds pattern.
     * @param userIds query parameter userIds pattern.
     * @param apiKeyIds query parameter apiKeyIds pattern.
     * @param models query parameter models pattern.
     * @param groupBy query parameter groupBy pattern.
     * @param limit query parameter limit pattern.
     * @param page query parameter page pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UsageModerationsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun usageModerations(startTime: StringValuePattern? = null, endTime: StringValuePattern? = null, bucketWidth: StringValuePattern? = null, projectIds: StringValuePattern? = null, userIds: StringValuePattern? = null, apiKeyIds: StringValuePattern? = null, models: StringValuePattern? = null, groupBy: StringValuePattern? = null, limit: StringValuePattern? = null, page: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UsageModerationsStubBuilder =
        UsageModerationsStubBuilder(objectMapper, get(urlPathTemplate("/organization/usage/moderations"))
            .apply { startTime?.let { withQueryParam("start_time", it) } }
            .apply { endTime?.let { withQueryParam("end_time", it) } }
            .apply { bucketWidth?.let { withQueryParam("bucket_width", it) } }
            .apply { projectIds?.let { withQueryParam("project_ids", it) } }
            .apply { userIds?.let { withQueryParam("user_ids", it) } }
            .apply { apiKeyIds?.let { withQueryParam("api_key_ids", it) } }
            .apply { models?.let { withQueryParam("models", it) } }
            .apply { groupBy?.let { withQueryParam("group_by", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { page?.let { withQueryParam("page", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation usageVectorStores.
     *
     * @param startTime query parameter startTime pattern.
     * @param endTime query parameter endTime pattern.
     * @param bucketWidth query parameter bucketWidth pattern.
     * @param projectIds query parameter projectIds pattern.
     * @param groupBy query parameter groupBy pattern.
     * @param limit query parameter limit pattern.
     * @param page query parameter page pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [UsageVectorStoresStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun usageVectorStores(startTime: StringValuePattern? = null, endTime: StringValuePattern? = null, bucketWidth: StringValuePattern? = null, projectIds: StringValuePattern? = null, groupBy: StringValuePattern? = null, limit: StringValuePattern? = null, page: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): UsageVectorStoresStubBuilder =
        UsageVectorStoresStubBuilder(objectMapper, get(urlPathTemplate("/organization/usage/vector_stores"))
            .apply { startTime?.let { withQueryParam("start_time", it) } }
            .apply { endTime?.let { withQueryParam("end_time", it) } }
            .apply { bucketWidth?.let { withQueryParam("bucket_width", it) } }
            .apply { projectIds?.let { withQueryParam("project_ids", it) } }
            .apply { groupBy?.let { withQueryParam("group_by", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { page?.let { withQueryParam("page", it) } }
            .configurer()
        )
}
