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
import org.openapitools.model.ChatCompletionRequestMessageContentPartImageImageUrl;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ChatCompletionRequestMessageContentPartImage
 */
@JsonPropertyOrder({
  ChatCompletionRequestMessageContentPartImage.JSON_PROPERTY_TYPE,
  ChatCompletionRequestMessageContentPartImage.JSON_PROPERTY_IMAGE_URL
})
@JsonTypeName("ChatCompletionRequestMessageContentPartImage")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class ChatCompletionRequestMessageContentPartImage {
    /**
     * The type of the content part.
     */
    public enum TypeEnum {
        IMAGE_URL("image_url");

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_TYPE = "type";
    private TypeEnum type;

    public static final String JSON_PROPERTY_IMAGE_URL = "image_url";
    private ChatCompletionRequestMessageContentPartImageImageUrl imageUrl;

    public ChatCompletionRequestMessageContentPartImage(TypeEnum type, ChatCompletionRequestMessageContentPartImageImageUrl imageUrl) {
        this.type = type;
        this.imageUrl = imageUrl;
    }

    public ChatCompletionRequestMessageContentPartImage type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the content part.
     * @return type
     */
    @NotNull
    @Schema(name = "type", description = "The type of the content part.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TypeEnum getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ChatCompletionRequestMessageContentPartImage imageUrl(ChatCompletionRequestMessageContentPartImageImageUrl imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Get imageUrl
     * @return imageUrl
     */
    @Valid
    @NotNull
    @Schema(name = "image_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_IMAGE_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ChatCompletionRequestMessageContentPartImageImageUrl getImageUrl() {
        return imageUrl;
    }

    @JsonProperty(JSON_PROPERTY_IMAGE_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setImageUrl(ChatCompletionRequestMessageContentPartImageImageUrl imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChatCompletionRequestMessageContentPartImage chatCompletionRequestMessageContentPartImage = (ChatCompletionRequestMessageContentPartImage) o;
        return Objects.equals(this.type, chatCompletionRequestMessageContentPartImage.type) &&
            Objects.equals(this.imageUrl, chatCompletionRequestMessageContentPartImage.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, imageUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionRequestMessageContentPartImage {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

