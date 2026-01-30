package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ProjectRateLimit
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
 * @param &#x60;object&#x60; 
 * @param &#x60;data&#x60; 
 * @param firstId 
 * @param lastId 
 * @param hasMore 
 */
data class ProjectRateLimitListResponse(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: ProjectRateLimitListResponse.`Object`,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: kotlin.collections.List<ProjectRateLimit>,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("first_id", required = true) val firstId: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("last_id", required = true) val lastId: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("has_more", required = true) val hasMore: kotlin.Boolean
) {

    /**
    * 
    * Values: list
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        list("list");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProjectRateLimitListResponse'")
            }
        }
    }

}

