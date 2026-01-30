package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.VectorStoreExpirationAfter
import org.openapitools.model.VectorStoreObjectFileCounts
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
 * A vector store is a collection of processed files can be used by the `file_search` tool.
 * @param id The identifier, which can be referenced in API endpoints.
 * @param &#x60;object&#x60; The object type, which is always `vector_store`.
 * @param createdAt The Unix timestamp (in seconds) for when the vector store was created.
 * @param name The name of the vector store.
 * @param usageBytes The total number of bytes used by the files in the vector store.
 * @param fileCounts 
 * @param status The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
 * @param lastActiveAt The Unix timestamp (in seconds) for when the vector store was last active.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @param expiresAfter 
 * @param expiresAt The Unix timestamp (in seconds) for when the vector store will expire.
 */
data class VectorStoreObject(

    @Schema(example = "null", required = true, description = "The identifier, which can be referenced in API endpoints.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always `vector_store`.")
    @get:JsonProperty("object", required = true) val `object`: VectorStoreObject.`Object`,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the vector store was created.")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "The name of the vector store.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "The total number of bytes used by the files in the vector store.")
    @get:JsonProperty("usage_bytes", required = true) val usageBytes: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("file_counts", required = true) val fileCounts: VectorStoreObjectFileCounts,

    @Schema(example = "null", required = true, description = "The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.")
    @get:JsonProperty("status", required = true) val status: VectorStoreObject.Status,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the vector store was last active.")
    @get:JsonProperty("last_active_at", required = true) val lastActiveAt: kotlin.Int?,

    @field:Valid
    @Schema(example = "null", required = true, description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
    @get:JsonProperty("metadata", required = true) val metadata: kotlin.Any?,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("expires_after") val expiresAfter: VectorStoreExpirationAfter? = null,

    @Schema(example = "null", description = "The Unix timestamp (in seconds) for when the vector store will expire.")
    @get:JsonProperty("expires_at") val expiresAt: kotlin.Int? = null
) {

    /**
    * The object type, which is always `vector_store`.
    * Values: vector_store
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        vector_store("vector_store");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'VectorStoreObject'")
            }
        }
    }

    /**
    * The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
    * Values: expired,in_progress,completed
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        expired("expired"),
        in_progress("in_progress"),
        completed("completed");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'VectorStoreObject'")
            }
        }
    }

}

