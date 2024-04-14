package org.openapitools.model

import java.util.Objects
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
 * Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
 * @param id 
 * @param deleted 
 * @param &#x60;object&#x60; 
 */
data class DeleteAssistantFileResponse(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("deleted", required = true) val deleted: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: DeleteAssistantFileResponse.`Object`
) {

    /**
    * 
    * Values: assistantPeriodFilePeriodDeleted
    */
    enum class `Object`(val value: kotlin.String) {

        @JsonProperty("assistant.file.deleted") assistantPeriodFilePeriodDeleted("assistant.file.deleted")
    }

}

