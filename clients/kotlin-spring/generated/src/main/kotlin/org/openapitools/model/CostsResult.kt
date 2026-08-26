package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CostsResultAmount
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
 * The aggregated costs details of the specific time bucket.
 * @param &#x60;object&#x60; 
 * @param amount 
 * @param lineItem When `group_by=line_item`, this field provides the line item of the grouped costs result.
 * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped costs result.
 */
data class CostsResult(

    @Schema(required = true, description = "")
    @param:JsonProperty("object")
    @get:JsonProperty("object", required = true) val `object`: CostsResult.`Object`,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("amount")
    @get:JsonProperty("amount") val amount: CostsResultAmount? = null,

    @Schema(description = "When `group_by=line_item`, this field provides the line item of the grouped costs result.")
    @param:JsonProperty("line_item")
    @get:JsonProperty("line_item") val lineItem: kotlin.String? = null,

    @Schema(description = "When `group_by=project_id`, this field provides the project ID of the grouped costs result.")
    @param:JsonProperty("project_id")
    @get:JsonProperty("project_id") val projectId: kotlin.String? = null
) : UsageTimeBucketResultInner {

    /**
    * 
    * Values: organizationPeriodCostsPeriodResult
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        organizationPeriodCostsPeriodResult("organization.costs.result");

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

