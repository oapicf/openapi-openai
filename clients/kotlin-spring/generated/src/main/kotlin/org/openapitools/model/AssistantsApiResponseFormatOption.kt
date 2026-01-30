package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ResponseFormatJsonObject
import org.openapitools.model.ResponseFormatJsonSchema
import org.openapitools.model.ResponseFormatJsonSchemaJsonSchema
import org.openapitools.model.ResponseFormatText
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
 * Specifies the format that the model must output. Compatible with [GPT-4o](/docs/models#gpt-4o), [GPT-4 Turbo](/docs/models#gpt-4-turbo-and-gpt-4), and all GPT-3.5 Turbo models since `gpt-3.5-turbo-1106`.  Setting to `{ \"type\": \"json_schema\", \"json_schema\": {...} }` enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
 * @param type The type of response format being defined: `text`
 * @param jsonSchema 
 */
data class AssistantsApiResponseFormatOption(

    @Schema(example = "null", required = true, description = "The type of response format being defined: `text`")
    @get:JsonProperty("type", required = true) val type: AssistantsApiResponseFormatOption.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("json_schema", required = true) val jsonSchema: ResponseFormatJsonSchemaJsonSchema
) {

    /**
    * The type of response format being defined: `text`
    * Values: text,json_object,json_schema
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        text("text"),
        json_object("json_object"),
        json_schema("json_schema");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AssistantsApiResponseFormatOption'")
            }
        }
    }

}

