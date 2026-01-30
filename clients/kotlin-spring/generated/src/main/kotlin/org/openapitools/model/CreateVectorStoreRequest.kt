package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateVectorStoreRequestChunkingStrategy
import org.openapitools.model.VectorStoreExpirationAfter
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
 * @param fileIds A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
 * @param name The name of the vector store.
 * @param expiresAfter 
 * @param chunkingStrategy 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 */
data class CreateVectorStoreRequest(

    @get:Size(max=500)
    @Schema(example = "null", description = "A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.")
    @get:JsonProperty("file_ids") val fileIds: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "The name of the vector store.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("expires_after") val expiresAfter: VectorStoreExpirationAfter? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("chunking_strategy") val chunkingStrategy: CreateVectorStoreRequestChunkingStrategy? = null,

    @field:Valid
    @Schema(example = "null", description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
    @get:JsonProperty("metadata") val metadata: kotlin.Any? = null
) {

}

