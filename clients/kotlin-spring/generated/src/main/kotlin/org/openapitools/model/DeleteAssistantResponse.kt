package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
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
 * 
 * @param id 
 * @param deleted 
 * @param &#x60;object&#x60; 
 */
data class DeleteAssistantResponse(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("deleted", required = true) val deleted: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: DeleteAssistantResponse.`Object`
    ) {

    /**
    * 
    * Values: assistantPeriodDeleted
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        assistantPeriodDeleted("assistant.deleted");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().first{it -> it.value == value}
            }
        }
    }

}

