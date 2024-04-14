/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ChatCompletionMessageToolCallChunkFunction
 */
@JsonPropertyOrder({
  ChatCompletionMessageToolCallChunkFunction.JSON_PROPERTY_NAME,
  ChatCompletionMessageToolCallChunkFunction.JSON_PROPERTY_ARGUMENTS
})
@JsonTypeName("ChatCompletionMessageToolCallChunk_function")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class ChatCompletionMessageToolCallChunkFunction {
    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_ARGUMENTS = "arguments";
    private String arguments;

    public ChatCompletionMessageToolCallChunkFunction() {
    }

    public ChatCompletionMessageToolCallChunkFunction name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the function to call.
     * @return name
     **/
    @Nullable
    @Schema(name = "name", description = "The name of the function to call.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public ChatCompletionMessageToolCallChunkFunction arguments(String arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
     * @return arguments
     **/
    @Nullable
    @Schema(name = "arguments", description = "The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ARGUMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getArguments() {
        return arguments;
    }

    @JsonProperty(JSON_PROPERTY_ARGUMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChatCompletionMessageToolCallChunkFunction chatCompletionMessageToolCallChunkFunction = (ChatCompletionMessageToolCallChunkFunction) o;
        return Objects.equals(this.name, chatCompletionMessageToolCallChunkFunction.name) &&
            Objects.equals(this.arguments, chatCompletionMessageToolCallChunkFunction.arguments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, arguments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionMessageToolCallChunkFunction {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

