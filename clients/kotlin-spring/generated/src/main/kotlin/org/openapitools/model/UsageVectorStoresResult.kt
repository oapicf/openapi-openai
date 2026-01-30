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
 * The aggregated vector stores usage details of the specific time bucket.
 * @param &#x60;object&#x60; 
 * @param usageBytes The vector stores usage in bytes.
 * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 */
data class UsageVectorStoresResult(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: UsageVectorStoresResult.`Object`,

    @Schema(example = "null", required = true, description = "The vector stores usage in bytes.")
    @get:JsonProperty("usage_bytes", required = true) val usageBytes: kotlin.Int,

    @Schema(example = "null", description = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.")
    @get:JsonProperty("project_id") val projectId: kotlin.String? = null
) {

    /**
    * 
    * Values: organizationPeriodUsagePeriodVector_storesPeriodResult
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        organizationPeriodUsagePeriodVector_storesPeriodResult("organization.usage.vector_stores.result");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'UsageVectorStoresResult'")
            }
        }
    }

}

