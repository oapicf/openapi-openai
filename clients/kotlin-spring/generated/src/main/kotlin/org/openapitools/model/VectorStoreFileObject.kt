package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.VectorStoreFileObjectChunkingStrategy
import org.openapitools.model.VectorStoreFileObjectLastError
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
 * A list of files attached to a vector store.
 * @param id The identifier, which can be referenced in API endpoints.
 * @param &#x60;object&#x60; The object type, which is always `vector_store.file`.
 * @param usageBytes The total vector store usage in bytes. Note that this may be different from the original file size.
 * @param createdAt The Unix timestamp (in seconds) for when the vector store file was created.
 * @param vectorStoreId The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
 * @param status The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
 * @param lastError 
 * @param chunkingStrategy 
 */
data class VectorStoreFileObject(

    @Schema(example = "null", required = true, description = "The identifier, which can be referenced in API endpoints.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always `vector_store.file`.")
    @get:JsonProperty("object", required = true) val `object`: VectorStoreFileObject.`Object`,

    @Schema(example = "null", required = true, description = "The total vector store usage in bytes. Note that this may be different from the original file size.")
    @get:JsonProperty("usage_bytes", required = true) val usageBytes: kotlin.Int,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the vector store file was created.")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.")
    @get:JsonProperty("vector_store_id", required = true) val vectorStoreId: kotlin.String,

    @Schema(example = "null", required = true, description = "The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.")
    @get:JsonProperty("status", required = true) val status: VectorStoreFileObject.Status,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("last_error", required = true) val lastError: VectorStoreFileObjectLastError?,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("chunking_strategy") val chunkingStrategy: VectorStoreFileObjectChunkingStrategy? = null
) {

    /**
    * The object type, which is always `vector_store.file`.
    * Values: vector_storePeriodFile
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        vector_storePeriodFile("vector_store.file");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'VectorStoreFileObject'")
            }
        }
    }

    /**
    * The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'VectorStoreFileObject'")
            }
        }
    }

}

