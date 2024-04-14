package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
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
* The role of the author of a message
* Values: system,user,assistant,tool,function
*/
enum class ChatCompletionRole(val value: kotlin.String) {

    @JsonProperty("system") system("system"),
    @JsonProperty("user") user("user"),
    @JsonProperty("assistant") assistant("assistant"),
    @JsonProperty("tool") tool("tool"),
    @JsonProperty("function") function("function")
}

