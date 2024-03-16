/*
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
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
  CreateCompletionResponseChoicesInner.JSON_PROPERTY_TEXT,
  CreateCompletionResponseChoicesInner.JSON_PROPERTY_INDEX,
  CreateCompletionResponseChoicesInner.JSON_PROPERTY_LOGPROBS,
  CreateCompletionResponseChoicesInner.JSON_PROPERTY_FINISH_REASON
})
@JsonTypeName("CreateCompletionResponse_choices_inner")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-03-16T01:12:32.706318857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class CreateCompletionResponseChoicesInner {
    public static final String JSON_PROPERTY_TEXT = "text";
    private String text;

    public static final String JSON_PROPERTY_INDEX = "index";
    private Integer index;

    public static final String JSON_PROPERTY_LOGPROBS = "logprobs";
    private CreateCompletionResponseChoicesInnerLogprobs logprobs;

    /**
     * Gets or Sets finishReason
     */
    public enum FinishReasonEnum {
        STOP("stop"),
        LENGTH("length");

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

    public CreateCompletionResponseChoicesInner(String text, Integer index, CreateCompletionResponseChoicesInnerLogprobs logprobs, FinishReasonEnum finishReason) {
        this.text = text;
        this.index = index;
        this.logprobs = logprobs;
        this.finishReason = finishReason;
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

    public CreateCompletionResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
        this.finishReason = finishReason;
        return this;
    }

    /**
     * Get finishReason
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCompletionResponseChoicesInner createCompletionResponseChoicesInner = (CreateCompletionResponseChoicesInner) o;
        return Objects.equals(this.text, createCompletionResponseChoicesInner.text) &&
            Objects.equals(this.index, createCompletionResponseChoicesInner.index) &&
            Objects.equals(this.logprobs, createCompletionResponseChoicesInner.logprobs) &&
            Objects.equals(this.finishReason, createCompletionResponseChoicesInner.finishReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, index, logprobs, finishReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCompletionResponseChoicesInner {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
        sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
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

