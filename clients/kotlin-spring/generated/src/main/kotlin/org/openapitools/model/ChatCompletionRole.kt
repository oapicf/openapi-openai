package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
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
enum class ChatCompletionRole(@get:JsonValue val value: kotlin.String) {

    system("system"),
    user("user"),
    assistant("assistant"),
    tool("tool"),
    function("function");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ChatCompletionRole {
                return values().first{it -> it.value == value}
        }
    }
}

