package org.openapitools.server.api.model

import org.openapitools.server.api.model.ResponseFormatJsonSchemaJsonSchema
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResponseFormatJsonSchema(
    /** The type of response format being defined: &#x60;json_schema&#x60; */
    val type: kotlin.String,
    val jsonSchema: ResponseFormatJsonSchemaJsonSchema
)
