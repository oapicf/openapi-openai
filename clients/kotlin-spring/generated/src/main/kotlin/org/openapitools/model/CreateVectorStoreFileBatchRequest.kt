package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ChunkingStrategyRequestParam
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
 * @param chunkingStrategy 
 */
data class CreateVectorStoreFileBatchRequest(

    @get:Size(min=1,max=500) 
    @Schema(example = "null", required = true, description = "A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.")
    @get:JsonProperty("file_ids", required = true) val fileIds: kotlin.collections.List<kotlin.String>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("chunking_strategy") val chunkingStrategy: ChunkingStrategyRequestParam? = null
) {

}

