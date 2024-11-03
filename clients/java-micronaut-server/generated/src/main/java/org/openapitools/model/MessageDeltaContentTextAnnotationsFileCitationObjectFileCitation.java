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
 * MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
 */
@JsonPropertyOrder({
  MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.JSON_PROPERTY_FILE_ID,
  MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.JSON_PROPERTY_QUOTE
})
@JsonTypeName("MessageDeltaContentTextAnnotationsFileCitationObject_file_citation")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {
    public static final String JSON_PROPERTY_FILE_ID = "file_id";
    private String fileId;

    public static final String JSON_PROPERTY_QUOTE = "quote";
    private String quote;

    public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation() {
    }

    public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * The ID of the specific File the citation is from.
     * @return fileId
     */
    @Nullable
    @Schema(name = "file_id", description = "The ID of the specific File the citation is from.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_FILE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFileId() {
        return fileId;
    }

    @JsonProperty(JSON_PROPERTY_FILE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation quote(String quote) {
        this.quote = quote;
        return this;
    }

    /**
     * The specific quote in the file.
     * @return quote
     */
    @Nullable
    @Schema(name = "quote", description = "The specific quote in the file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_QUOTE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getQuote() {
        return quote;
    }

    @JsonProperty(JSON_PROPERTY_QUOTE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation messageDeltaContentTextAnnotationsFileCitationObjectFileCitation = (MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation) o;
        return Objects.equals(this.fileId, messageDeltaContentTextAnnotationsFileCitationObjectFileCitation.fileId) &&
            Objects.equals(this.quote, messageDeltaContentTextAnnotationsFileCitationObjectFileCitation.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId, quote);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
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

