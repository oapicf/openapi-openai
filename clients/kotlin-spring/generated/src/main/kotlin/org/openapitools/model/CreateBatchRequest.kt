package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param inputFileId The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
 * @param endpoint The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
 * @param completionWindow The time frame within which the batch should be processed. Currently only `24h` is supported.
 * @param metadata Optional custom metadata for the batch.
 */
data class CreateBatchRequest(

    @Schema(example = "null", required = true, description = "The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. ")
    @get:JsonProperty("input_file_id", required = true) val inputFileId: kotlin.String,

    @Schema(example = "null", required = true, description = "The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.")
    @get:JsonProperty("endpoint", required = true) val endpoint: CreateBatchRequest.Endpoint,

    @Schema(example = "null", required = true, description = "The time frame within which the batch should be processed. Currently only `24h` is supported.")
    @get:JsonProperty("completion_window", required = true) val completionWindow: CreateBatchRequest.CompletionWindow,

    @Schema(example = "null", description = "Optional custom metadata for the batch.")
    @get:JsonProperty("metadata") val metadata: kotlin.collections.Map<kotlin.String, kotlin.String>? = null
) {

    /**
    * The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
    * Values: SlashV1SlashChatSlashCompletions,SlashV1SlashEmbeddings,SlashV1SlashCompletions
    */
    enum class Endpoint(@get:JsonValue val value: kotlin.String) {

        SlashV1SlashChatSlashCompletions("/v1/chat/completions"),
        SlashV1SlashEmbeddings("/v1/embeddings"),
        SlashV1SlashCompletions("/v1/completions");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Endpoint {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateBatchRequest'")
            }
        }
    }

    /**
    * The time frame within which the batch should be processed. Currently only `24h` is supported.
    * Values: _24h
    */
    enum class CompletionWindow(@get:JsonValue val value: kotlin.String) {

        _24h("24h");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CompletionWindow {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateBatchRequest'")
            }
        }
    }

}

