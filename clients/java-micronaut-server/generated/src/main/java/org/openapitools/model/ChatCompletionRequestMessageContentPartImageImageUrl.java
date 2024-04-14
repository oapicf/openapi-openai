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
import java.net.URI;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ChatCompletionRequestMessageContentPartImageImageUrl
 */
@JsonPropertyOrder({
  ChatCompletionRequestMessageContentPartImageImageUrl.JSON_PROPERTY_URL,
  ChatCompletionRequestMessageContentPartImageImageUrl.JSON_PROPERTY_DETAIL
})
@JsonTypeName("ChatCompletionRequestMessageContentPartImage_image_url")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class ChatCompletionRequestMessageContentPartImageImageUrl {
    public static final String JSON_PROPERTY_URL = "url";
    private URI url;

    /**
     * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
     */
    public enum DetailEnum {
        AUTO("auto"),
        LOW("low"),
        HIGH("high");

        private String value;

        DetailEnum(String value) {
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
        public static DetailEnum fromValue(String value) {
            for (DetailEnum b : DetailEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_DETAIL = "detail";
    private DetailEnum detail = DetailEnum.AUTO;

    public ChatCompletionRequestMessageContentPartImageImageUrl(URI url) {
        this.url = url;
    }

    public ChatCompletionRequestMessageContentPartImageImageUrl url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Either a URL of the image or the base64 encoded image data.
     * @return url
     **/
    @NotNull
    @Schema(name = "url", description = "Either a URL of the image or the base64 encoded image data.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public URI getUrl() {
        return url;
    }

    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUrl(URI url) {
        this.url = url;
    }

    public ChatCompletionRequestMessageContentPartImageImageUrl detail(DetailEnum detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
     * @return detail
     **/
    @Nullable
    @Schema(name = "detail", description = "Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DETAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public DetailEnum getDetail() {
        return detail;
    }

    @JsonProperty(JSON_PROPERTY_DETAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDetail(DetailEnum detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChatCompletionRequestMessageContentPartImageImageUrl chatCompletionRequestMessageContentPartImageImageUrl = (ChatCompletionRequestMessageContentPartImageImageUrl) o;
        return Objects.equals(this.url, chatCompletionRequestMessageContentPartImageImageUrl.url) &&
            Objects.equals(this.detail, chatCompletionRequestMessageContentPartImageImageUrl.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionRequestMessageContentPartImageImageUrl {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

