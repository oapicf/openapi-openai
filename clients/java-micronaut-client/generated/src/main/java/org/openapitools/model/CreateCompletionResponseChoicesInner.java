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
import org.openapitools.model.CreateCompletionResponseChoicesInnerLogprobs;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * CreateCompletionResponseChoicesInner
 */
@JsonPropertyOrder({
  CreateCompletionResponseChoicesInner.JSON_PROPERTY_FINISH_REASON,
  CreateCompletionResponseChoicesInner.JSON_PROPERTY_INDEX,
  CreateCompletionResponseChoicesInner.JSON_PROPERTY_LOGPROBS,
  CreateCompletionResponseChoicesInner.JSON_PROPERTY_TEXT
})
@JsonTypeName("CreateCompletionResponse_choices_inner")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-04-14T13:37:52.123317469Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class CreateCompletionResponseChoicesInner {
    /**
     * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters. 
     */
    public enum FinishReasonEnum {
        STOP("stop"),
        LENGTH("length"),
        CONTENT_FILTER("content_filter");

        private String value;

        FinishReasonEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FinishReasonEnum fromValue(String value) {
            for (FinishReasonEnum b : FinishReasonEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_FINISH_REASON = "finish_reason";
    private FinishReasonEnum finishReason;

    public static final String JSON_PROPERTY_INDEX = "index";
    private Integer index;

    public static final String JSON_PROPERTY_LOGPROBS = "logprobs";
    private CreateCompletionResponseChoicesInnerLogprobs logprobs;

    public static final String JSON_PROPERTY_TEXT = "text";
    private String text;

    public CreateCompletionResponseChoicesInner(FinishReasonEnum finishReason, Integer index, CreateCompletionResponseChoicesInnerLogprobs logprobs, String text) {
        this.finishReason = finishReason;
        this.index = index;
        this.logprobs = logprobs;
        this.text = text;
    }

    public CreateCompletionResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
        this.finishReason = finishReason;
        return this;
    }

    /**
     * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters. 
     * @return finishReason
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_FINISH_REASON)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public FinishReasonEnum getFinishReason() {
        return finishReason;
    }

    @JsonProperty(JSON_PROPERTY_FINISH_REASON)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFinishReason(FinishReasonEnum finishReason) {
        this.finishReason = finishReason;
    }

    public CreateCompletionResponseChoicesInner index(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * Get index
     * @return index
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getIndex() {
        return index;
    }

    @JsonProperty(JSON_PROPERTY_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIndex(Integer index) {
        this.index = index;
    }

    public CreateCompletionResponseChoicesInner logprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
        this.logprobs = logprobs;
        return this;
    }

    /**
     * Get logprobs
     * @return logprobs
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_LOGPROBS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CreateCompletionResponseChoicesInnerLogprobs getLogprobs() {
        return logprobs;
    }

    @JsonProperty(JSON_PROPERTY_LOGPROBS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLogprobs(CreateCompletionResponseChoicesInnerLogprobs logprobs) {
        this.logprobs = logprobs;
    }

    public CreateCompletionResponseChoicesInner text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get text
     * @return text
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getText() {
        return text;
    }

    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCompletionResponseChoicesInner createCompletionResponseChoicesInner = (CreateCompletionResponseChoicesInner) o;
        return Objects.equals(this.finishReason, createCompletionResponseChoicesInner.finishReason) &&
            Objects.equals(this.index, createCompletionResponseChoicesInner.index) &&
            Objects.equals(this.logprobs, createCompletionResponseChoicesInner.logprobs) &&
            Objects.equals(this.text, createCompletionResponseChoicesInner.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finishReason, index, logprobs, text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCompletionResponseChoicesInner {\n");
        sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

