package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.VectorStoreFileBatchObjectFileCounts
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
 * A batch of files attached to a vector store.
 * @param id The identifier, which can be referenced in API endpoints.
 * @param &#x60;object&#x60; The object type, which is always `vector_store.file_batch`.
 * @param createdAt The Unix timestamp (in seconds) for when the vector store files batch was created.
 * @param vectorStoreId The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
 * @param status The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
 * @param fileCounts 
 */
data class VectorStoreFileBatchObject(

    @Schema(example = "null", required = true, description = "The identifier, which can be referenced in API endpoints.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always `vector_store.file_batch`.")
    @get:JsonProperty("object", required = true) val `object`: VectorStoreFileBatchObject.`Object`,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the vector store files batch was created.")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.")
    @get:JsonProperty("vector_store_id", required = true) val vectorStoreId: kotlin.String,

    @Schema(example = "null", required = true, description = "The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.")
    @get:JsonProperty("status", required = true) val status: VectorStoreFileBatchObject.Status,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("file_counts", required = true) val fileCounts: VectorStoreFileBatchObjectFileCounts
) {

    /**
    * The object type, which is always `vector_store.file_batch`.
    * Values: vector_storePeriodFiles_batch
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        vector_storePeriodFiles_batch("vector_store.files_batch");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'VectorStoreFileBatchObject'")
            }
        }
    }

    /**
    * The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
    * Values: in_progress,completed,cancelled,failed
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        in_progress("in_progress"),
        completed("completed"),
        cancelled("cancelled"),
        failed("failed");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'VectorStoreFileBatchObject'")
            }
        }
    }

}

