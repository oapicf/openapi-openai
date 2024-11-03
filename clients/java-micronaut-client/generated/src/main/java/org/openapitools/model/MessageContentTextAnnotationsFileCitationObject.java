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
import org.openapitools.model.MessageContentTextAnnotationsFileCitationObjectFileCitation;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
 */
@JsonPropertyOrder({
  MessageContentTextAnnotationsFileCitationObject.JSON_PROPERTY_TYPE,
  MessageContentTextAnnotationsFileCitationObject.JSON_PROPERTY_TEXT,
  MessageContentTextAnnotationsFileCitationObject.JSON_PROPERTY_FILE_CITATION,
  MessageContentTextAnnotationsFileCitationObject.JSON_PROPERTY_START_INDEX,
  MessageContentTextAnnotationsFileCitationObject.JSON_PROPERTY_END_INDEX
})
@JsonTypeName("MessageContentTextAnnotationsFileCitationObject")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-03T11:06:40.431829781Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class MessageContentTextAnnotationsFileCitationObject {
    /**
     * Always &#x60;file_citation&#x60;.
     */
    public enum TypeEnum {
        FILE_CITATION("file_citation");

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
    private String text;

    public static final String JSON_PROPERTY_FILE_CITATION = "file_citation";
    private MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation;

    public static final String JSON_PROPERTY_START_INDEX = "start_index";
    private Integer startIndex;

    public static final String JSON_PROPERTY_END_INDEX = "end_index";
    private Integer endIndex;

    public MessageContentTextAnnotationsFileCitationObject(TypeEnum type, String text, MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation, Integer startIndex, Integer endIndex) {
        this.type = type;
        this.text = text;
        this.fileCitation = fileCitation;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public MessageContentTextAnnotationsFileCitationObject type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Always &#x60;file_citation&#x60;.
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

    public MessageContentTextAnnotationsFileCitationObject text(String text) {
        this.text = text;
        return this;
    }

    /**
     * The text in the message content that needs to be replaced.
     * @return text
     */
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

    public MessageContentTextAnnotationsFileCitationObject fileCitation(MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
        this.fileCitation = fileCitation;
        return this;
    }

    /**
     * Get fileCitation
     * @return fileCitation
     */
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_FILE_CITATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public MessageContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
        return fileCitation;
    }

    @JsonProperty(JSON_PROPERTY_FILE_CITATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFileCitation(MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
        this.fileCitation = fileCitation;
    }

    public MessageContentTextAnnotationsFileCitationObject startIndex(Integer startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    /**
     * Get startIndex
     * minimum: 0
     * @return startIndex
     */
    @NotNull
    @Min(0)
    @JsonProperty(JSON_PROPERTY_START_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getStartIndex() {
        return startIndex;
    }

    @JsonProperty(JSON_PROPERTY_START_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public MessageContentTextAnnotationsFileCitationObject endIndex(Integer endIndex) {
        this.endIndex = endIndex;
        return this;
    }

    /**
     * Get endIndex
     * minimum: 0
     * @return endIndex
     */
    @NotNull
    @Min(0)
    @JsonProperty(JSON_PROPERTY_END_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getEndIndex() {
        return endIndex;
    }

    @JsonProperty(JSON_PROPERTY_END_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessageContentTextAnnotationsFileCitationObject messageContentTextAnnotationsFileCitationObject = (MessageContentTextAnnotationsFileCitationObject) o;
        return Objects.equals(this.type, messageContentTextAnnotationsFileCitationObject.type) &&
            Objects.equals(this.text, messageContentTextAnnotationsFileCitationObject.text) &&
            Objects.equals(this.fileCitation, messageContentTextAnnotationsFileCitationObject.fileCitation) &&
            Objects.equals(this.startIndex, messageContentTextAnnotationsFileCitationObject.startIndex) &&
            Objects.equals(this.endIndex, messageContentTextAnnotationsFileCitationObject.endIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, text, fileCitation, startIndex, endIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageContentTextAnnotationsFileCitationObject {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    fileCitation: ").append(toIndentedString(fileCitation)).append("\n");
        sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
        sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
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

