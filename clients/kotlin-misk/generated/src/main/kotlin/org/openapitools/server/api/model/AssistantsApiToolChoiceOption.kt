package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssistantsNamedToolChoice
import org.openapitools.server.api.model.AssistantsNamedToolChoiceFunction
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssistantsApiToolChoiceOption(
    /** The type of the tool. If type is &#x60;function&#x60;, the function name must be set */
    val type: kotlin.String,
    val function: AssistantsNamedToolChoiceFunction? = null
)
