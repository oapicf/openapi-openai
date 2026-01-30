package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: CostsResult.`Object`,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("amount") val amount: CostsResultAmount? = null,

    @Schema(example = "null", description = "When `group_by=line_item`, this field provides the line item of the grouped costs result.")
    @get:JsonProperty("line_item") val lineItem: kotlin.String? = null,

    @Schema(example = "null", description = "When `group_by=project_id`, this field provides the project ID of the grouped costs result.")
    @get:JsonProperty("project_id") val projectId: kotlin.String? = null
) {

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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CostsResult'")
            }
        }
    }

}

