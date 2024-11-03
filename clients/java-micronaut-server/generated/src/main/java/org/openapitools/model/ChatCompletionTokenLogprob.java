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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionTokenLogprobTopLogprobsInner;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ChatCompletionTokenLogprob
 */
@JsonPropertyOrder({
  ChatCompletionTokenLogprob.JSON_PROPERTY_TOKEN,
  ChatCompletionTokenLogprob.JSON_PROPERTY_LOGPROB,
  ChatCompletionTokenLogprob.JSON_PROPERTY_BYTES,
  ChatCompletionTokenLogprob.JSON_PROPERTY_TOP_LOGPROBS
})
@JsonTypeName("ChatCompletionTokenLogprob")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class ChatCompletionTokenLogprob {
    public static final String JSON_PROPERTY_TOKEN = "token";
    private String token;

    public static final String JSON_PROPERTY_LOGPROB = "logprob";
    private BigDecimal logprob;

    public static final String JSON_PROPERTY_BYTES = "bytes";
    private List<Integer> bytes;

    public static final String JSON_PROPERTY_TOP_LOGPROBS = "top_logprobs";
    private List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs = new ArrayList<>();

    public ChatCompletionTokenLogprob(String token, BigDecimal logprob, List<Integer> bytes, List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs) {
        this.token = token;
        this.logprob = logprob;
        this.bytes = bytes;
        this.topLogprobs = topLogprobs;
    }

    public ChatCompletionTokenLogprob token(String token) {
        this.token = token;
        return this;
    }

    /**
     * The token.
     * @return token
     */
    @NotNull
    @Schema(name = "token", description = "The token.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TOKEN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getToken() {
        return token;
    }

    @JsonProperty(JSON_PROPERTY_TOKEN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setToken(String token) {
        this.token = token;
    }

    public ChatCompletionTokenLogprob logprob(BigDecimal logprob) {
        this.logprob = logprob;
        return this;
    }

    /**
     * The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely.
     * @return logprob
     */
    @NotNull
    @Schema(name = "logprob", description = "The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_LOGPROB)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getLogprob() {
        return logprob;
    }

    @JsonProperty(JSON_PROPERTY_LOGPROB)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLogprob(BigDecimal logprob) {
        this.logprob = logprob;
    }

    public ChatCompletionTokenLogprob bytes(List<Integer> bytes) {
        this.bytes = bytes;
        return this;
    }

    public ChatCompletionTokenLogprob addBytesItem(Integer bytesItem) {
        this.bytes.add(bytesItem);
        return this;
    }

    /**
     * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token.
     * @return bytes
     */
    @Nullable
    @Schema(name = "bytes", description = "A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_BYTES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<Integer> getBytes() {
        return bytes;
    }

    @JsonProperty(JSON_PROPERTY_BYTES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBytes(List<Integer> bytes) {
        this.bytes = bytes;
    }

    public ChatCompletionTokenLogprob topLogprobs(List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs) {
        this.topLogprobs = topLogprobs;
        return this;
    }

    public ChatCompletionTokenLogprob addTopLogprobsItem(ChatCompletionTokenLogprobTopLogprobsInner topLogprobsItem) {
        this.topLogprobs.add(topLogprobsItem);
        return this;
    }

    /**
     * List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested &#x60;top_logprobs&#x60; returned.
     * @return topLogprobs
     */
    @NotNull
    @Schema(name = "top_logprobs", description = "List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TOP_LOGPROBS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> getTopLogprobs() {
        return topLogprobs;
    }

    @JsonProperty(JSON_PROPERTY_TOP_LOGPROBS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTopLogprobs(List<@Valid ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs) {
        this.topLogprobs = topLogprobs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChatCompletionTokenLogprob chatCompletionTokenLogprob = (ChatCompletionTokenLogprob) o;
        return Objects.equals(this.token, chatCompletionTokenLogprob.token) &&
            Objects.equals(this.logprob, chatCompletionTokenLogprob.logprob) &&
            Objects.equals(this.bytes, chatCompletionTokenLogprob.bytes) &&
            Objects.equals(this.topLogprobs, chatCompletionTokenLogprob.topLogprobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, logprob, bytes, topLogprobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionTokenLogprob {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    logprob: ").append(toIndentedString(logprob)).append("\n");
        sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
        sb.append("    topLogprobs: ").append(toIndentedString(topLogprobs)).append("\n");
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

