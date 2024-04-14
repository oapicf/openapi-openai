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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionTokenLogprob;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Log probability information for the choice.
 */
@JsonPropertyOrder({
  CreateChatCompletionResponseChoicesInnerLogprobs.JSON_PROPERTY_CONTENT
})
@JsonTypeName("CreateChatCompletionResponse_choices_inner_logprobs")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-04-14T13:37:52.123317469Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class CreateChatCompletionResponseChoicesInnerLogprobs {
    public static final String JSON_PROPERTY_CONTENT = "content";
    private List<@Valid ChatCompletionTokenLogprob> content;

    public CreateChatCompletionResponseChoicesInnerLogprobs(List<@Valid ChatCompletionTokenLogprob> content) {
        this.content = content;
    }

    public CreateChatCompletionResponseChoicesInnerLogprobs content(List<@Valid ChatCompletionTokenLogprob> content) {
        this.content = content;
        return this;
    }

    public CreateChatCompletionResponseChoicesInnerLogprobs addContentItem(ChatCompletionTokenLogprob contentItem) {
        this.content.add(contentItem);
        return this;
    }

    /**
     * A list of message content tokens with log probability information.
     * @return content
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_CONTENT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid ChatCompletionTokenLogprob> getContent() {
        return content;
    }

    @JsonProperty(JSON_PROPERTY_CONTENT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setContent(List<@Valid ChatCompletionTokenLogprob> content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateChatCompletionResponseChoicesInnerLogprobs createChatCompletionResponseChoicesInnerLogprobs = (CreateChatCompletionResponseChoicesInnerLogprobs) o;
        return Objects.equals(this.content, createChatCompletionResponseChoicesInnerLogprobs.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChatCompletionResponseChoicesInnerLogprobs {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

