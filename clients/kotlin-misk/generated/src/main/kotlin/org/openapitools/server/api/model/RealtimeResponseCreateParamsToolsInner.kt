package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeResponseCreateParamsToolsInner(
    /** The type of the tool, i.e. &#x60;function&#x60;. */
    val type: kotlin.String? = null,
    /** The name of the function. */
    val name: kotlin.String? = null,
    /** The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything).  */
    val description: kotlin.String? = null,
    /** Parameters of the function in JSON Schema. */
    val parameters: kotlin.Any? = null
)
