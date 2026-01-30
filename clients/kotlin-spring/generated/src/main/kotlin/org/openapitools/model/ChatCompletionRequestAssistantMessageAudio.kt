package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
 * @param id Unique identifier for a previous audio response from the model. 
 */
data class ChatCompletionRequestAssistantMessageAudio(

    @Schema(example = "null", required = true, description = "Unique identifier for a previous audio response from the model. ")
    @get:JsonProperty("id", required = true) val id: kotlin.String
) {

}

