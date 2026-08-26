package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.UsageTimeBucketResultInner
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
 * @param startTime 
 * @param endTime 
 * @param result 
 */
data class UsageTimeBucket(

    @Schema(required = true, description = "")
    @param:JsonProperty("object")
    @get:JsonProperty("object", required = true) val `object`: UsageTimeBucket.`Object`,

    @Schema(required = true, description = "")
    @param:JsonProperty("start_time")
    @get:JsonProperty("start_time", required = true) val startTime: kotlin.Int,

    @Schema(required = true, description = "")
    @param:JsonProperty("end_time")
    @get:JsonProperty("end_time", required = true) val endTime: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("result")
    @get:JsonProperty("result", required = true) val result: kotlin.collections.List<UsageTimeBucketResultInner>
) {

    /**
    * 
    * Values: bucket
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        bucket("bucket");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum '&#x60;Object&#x60;'")
            }
        }
    }

}

