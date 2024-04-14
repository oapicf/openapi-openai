package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssistantObjectToolsInner
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
 * @param model 
 * @param name The name of the assistant. The maximum length is 256 characters. 
 * @param description The description of the assistant. The maximum length is 512 characters. 
 * @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. 
 * @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
 * @param fileIds A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 */
data class ModifyAssistantRequest(

    @Schema(example = "null", description = "")
    @get:JsonProperty("model") val model: kotlin.String? = null,

    @get:Size(max=256)
    @Schema(example = "null", description = "The name of the assistant. The maximum length is 256 characters. ")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @get:Size(max=512)
    @Schema(example = "null", description = "The description of the assistant. The maximum length is 512 characters. ")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @get:Size(max=256000)
    @Schema(example = "null", description = "The system instructions that the assistant uses. The maximum length is 256,000 characters. ")
    @get:JsonProperty("instructions") val instructions: kotlin.String? = null,

    @field:Valid
    @get:Size(max=128)
    @Schema(example = "null", description = "A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. ")
    @get:JsonProperty("tools") val tools: kotlin.collections.List<AssistantObjectToolsInner>? = arrayListOf(),

    @get:Size(max=20)
    @Schema(example = "null", description = "A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. ")
    @get:JsonProperty("file_ids") val fileIds: kotlin.collections.List<kotlin.String>? = arrayListOf(),

    @field:Valid
    @Schema(example = "null", description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
    @get:JsonProperty("metadata") val metadata: kotlin.Any? = null
) {

}

