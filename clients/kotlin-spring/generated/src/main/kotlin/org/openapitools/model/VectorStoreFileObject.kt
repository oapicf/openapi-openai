package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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

    @Schema(required = true, description = "The identifier, which can be referenced in API endpoints.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(required = true, description = "The object type, which is always `vector_store.file`.")
    @param:JsonProperty("object")
    @get:JsonProperty("object", required = true) val `object`: VectorStoreFileObject.`Object`,

    @Schema(required = true, description = "The total vector store usage in bytes. Note that this may be different from the original file size.")
    @param:JsonProperty("usage_bytes")
    @get:JsonProperty("usage_bytes", required = true) val usageBytes: kotlin.Int,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the vector store file was created.")
    @param:JsonProperty("created_at")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(required = true, description = "The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.")
    @param:JsonProperty("vector_store_id")
    @get:JsonProperty("vector_store_id", required = true) val vectorStoreId: kotlin.String,

    @Schema(required = true, description = "The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.")
    @param:JsonProperty("status")
    @get:JsonProperty("status", required = true) val status: VectorStoreFileObject.Status,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("last_error")
    @get:JsonProperty("last_error", required = true) val lastError: VectorStoreFileObjectLastError?,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("chunking_strategy")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum '&#x60;Object&#x60;'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Status'")
            }
        }
    }

}

