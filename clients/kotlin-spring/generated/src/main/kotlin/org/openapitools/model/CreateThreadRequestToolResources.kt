package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateAssistantRequestToolResourcesCodeInterpreter
import org.openapitools.model.CreateThreadRequestToolResourcesFileSearch
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
 * A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 * @param codeInterpreter 
 * @param fileSearch 
 */
data class CreateThreadRequestToolResources(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("code_interpreter") val codeInterpreter: CreateAssistantRequestToolResourcesCodeInterpreter? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("file_search") val fileSearch: CreateThreadRequestToolResourcesFileSearch? = null
) {

}

