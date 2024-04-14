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
import org.openapitools.model.MessageDeltaContentTextObjectText;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The text content that is part of a message.
 */
@Schema(name = "MessageDeltaContentTextObject", description = "The text content that is part of a message.")
@JsonPropertyOrder({
  MessageDeltaContentTextObject.JSON_PROPERTY_INDEX,
  MessageDeltaContentTextObject.JSON_PROPERTY_TYPE,
  MessageDeltaContentTextObject.JSON_PROPERTY_TEXT
})
@JsonTypeName("MessageDeltaContentTextObject")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class MessageDeltaContentTextObject {
    public static final String JSON_PROPERTY_INDEX = "index";
    private Integer index;

    /**
     * Always &#x60;text&#x60;.
     */
    public enum TypeEnum {
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

    public static final String JSON_PROPERTY_TEXT = "text";
    private MessageDeltaContentTextObjectText text;

    public MessageDeltaContentTextObject(Integer index, TypeEnum type) {
        this.index = index;
        this.type = type;
    }

    public MessageDeltaContentTextObject index(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * The index of the content part in the message.
     * @return index
     **/
    @NotNull
    @Schema(name = "index", description = "The index of the content part in the message.", requiredMode = Schema.RequiredMode.REQUIRED)
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

    public MessageDeltaContentTextObject type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Always &#x60;text&#x60;.
     * @return type
     **/
    @NotNull
    @Schema(name = "type", description = "Always `text`.", requiredMode = Schema.RequiredMode.REQUIRED)
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

    public MessageDeltaContentTextObject text(MessageDeltaContentTextObjectText text) {
        this.text = text;
        return this;
    }

    /**
     * Get text
     * @return text
     **/
    @Valid
    @Nullable
    @Schema(name = "text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public MessageDeltaContentTextObjectText getText() {
        return text;
    }

    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setText(MessageDeltaContentTextObjectText text) {
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
        MessageDeltaContentTextObject messageDeltaContentTextObject = (MessageDeltaContentTextObject) o;
        return Objects.equals(this.index, messageDeltaContentTextObject.index) &&
            Objects.equals(this.type, messageDeltaContentTextObject.type) &&
            Objects.equals(this.text, messageDeltaContentTextObject.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, type, text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageDeltaContentTextObject {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

