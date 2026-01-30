package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
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
 * @param vectorStoreIds The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
 * @param vectorStores A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
 */
data class CreateAssistantRequestToolResourcesFileSearch(

    @get:Size(max=1)
    @Schema(example = "null", description = "The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. ")
    @get:JsonProperty("vector_store_ids") val vectorStoreIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(max=1)
    @Schema(example = "null", description = "A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. ")
    @get:JsonProperty("vector_stores") val vectorStores: kotlin.collections.List<CreateAssistantRequestToolResourcesFileSearchVectorStoresInner>? = null
) {

}

