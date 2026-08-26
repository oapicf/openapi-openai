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
 * @param name The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
 * @param description A description of what the response format is for, used by the model to determine how to respond in the format.
 * @param schema The schema for the response format, described as a JSON Schema object.
 * @param strict Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
 */
data class ResponseFormatJsonSchemaJsonSchema(

    @Schema(required = true, description = "The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(description = "A description of what the response format is for, used by the model to determine how to respond in the format.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(description = "The schema for the response format, described as a JSON Schema object.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("schema")
    @get:JsonProperty("schema") val schema: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @Schema(description = "Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).")
    @param:JsonProperty("strict")
    @get:JsonProperty("strict") val strict: kotlin.Boolean? = false
) {

}

