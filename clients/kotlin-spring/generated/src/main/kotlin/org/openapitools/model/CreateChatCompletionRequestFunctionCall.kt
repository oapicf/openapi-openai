package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateChatCompletionRequestFunctionCallOneOf
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
 * Controls how the model responds to function calls. \"none\" means the model does not call a function, and responds to the end-user. \"auto\" means the model can pick between an end-user or calling a function.  Specifying a particular function via `{\"name\":\\ \"my_function\"}` forces the model to call that function. \"none\" is the default when no functions are present. \"auto\" is the default if functions are present.
 * @param name The name of the function to call.
 */
data class CreateChatCompletionRequestFunctionCall(

    @Schema(example = "null", required = true, description = "The name of the function to call.")
    @get:JsonProperty("name", required = true) val name: kotlin.String
) {

}

