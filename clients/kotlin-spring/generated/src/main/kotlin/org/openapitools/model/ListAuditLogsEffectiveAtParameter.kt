package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param gt Return only events whose `effective_at` (Unix seconds) is greater than this value.
 * @param gte Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
 * @param lt Return only events whose `effective_at` (Unix seconds) is less than this value.
 * @param lte Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
 */
data class ListAuditLogsEffectiveAtParameter(

    @Schema(description = "Return only events whose `effective_at` (Unix seconds) is greater than this value.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("gt")
    @get:JsonProperty("gt") val gt: kotlin.Int? = null,

    @Schema(description = "Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("gte")
    @get:JsonProperty("gte") val gte: kotlin.Int? = null,

    @Schema(description = "Return only events whose `effective_at` (Unix seconds) is less than this value.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lt")
    @get:JsonProperty("lt") val lt: kotlin.Int? = null,

    @Schema(description = "Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lte")
    @get:JsonProperty("lte") val lte: kotlin.Int? = null
) {

}

