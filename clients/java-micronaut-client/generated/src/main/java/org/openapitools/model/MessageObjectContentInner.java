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
import org.openapitools.model.MessageContentImageFileObject;
import org.openapitools.model.MessageContentImageFileObjectImageFile;
import org.openapitools.model.MessageContentTextObject;
import org.openapitools.model.MessageContentTextObjectText;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * MessageObjectContentInner
 */
@JsonPropertyOrder({
  MessageObjectContentInner.JSON_PROPERTY_TYPE,
  MessageObjectContentInner.JSON_PROPERTY_IMAGE_FILE,
  MessageObjectContentInner.JSON_PROPERTY_TEXT
})
@JsonTypeName("MessageObject_content_inner")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-03T11:06:40.431829781Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class MessageObjectContentInner {
    /**
     * Always &#x60;image_file&#x60;.
     */
    public enum TypeEnum {
        IMAGE_FILE("image_file"),
        TEXT("text");

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

    public static final String JSON_PROPERTY_IMAGE_FILE = "image_file";
    private MessageContentImageFileObjectImageFile imageFile;

    public static final String JSON_PROPERTY_TEXT = "text";
    private MessageContentTextObjectText text;

    public MessageObjectContentInner(TypeEnum type, MessageContentImageFileObjectImageFile imageFile, MessageContentTextObjectText text) {
        this.type = type;
        this.imageFile = imageFile;
        this.text = text;
    }

    public MessageObjectContentInner type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Always &#x60;image_file&#x60;.
     * @return type
     */
    @NotNull
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

    public MessageObjectContentInner imageFile(MessageContentImageFileObjectImageFile imageFile) {
        this.imageFile = imageFile;
        return this;
    }

    /**
     * Get imageFile
     * @return imageFile
     */
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_IMAGE_FILE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public MessageContentImageFileObjectImageFile getImageFile() {
        return imageFile;
    }

    @JsonProperty(JSON_PROPERTY_IMAGE_FILE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setImageFile(MessageContentImageFileObjectImageFile imageFile) {
        this.imageFile = imageFile;
    }

    public MessageObjectContentInner text(MessageContentTextObjectText text) {
        this.text = text;
        return this;
    }

    /**
     * Get text
     * @return text
     */
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public MessageContentTextObjectText getText() {
        return text;
    }

    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setText(MessageContentTextObjectText text) {
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
        MessageObjectContentInner messageObjectContentInner = (MessageObjectContentInner) o;
        return Objects.equals(this.type, messageObjectContentInner.type) &&
            Objects.equals(this.imageFile, messageObjectContentInner.imageFile) &&
            Objects.equals(this.text, messageObjectContentInner.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, imageFile, text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageObjectContentInner {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
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

