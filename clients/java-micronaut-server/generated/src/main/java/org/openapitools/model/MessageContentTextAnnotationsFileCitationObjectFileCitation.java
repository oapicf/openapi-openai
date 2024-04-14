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
 * MessageContentTextAnnotationsFileCitationObjectFileCitation
 */
@JsonPropertyOrder({
  MessageContentTextAnnotationsFileCitationObjectFileCitation.JSON_PROPERTY_FILE_ID,
  MessageContentTextAnnotationsFileCitationObjectFileCitation.JSON_PROPERTY_QUOTE
})
@JsonTypeName("MessageContentTextAnnotationsFileCitationObject_file_citation")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class MessageContentTextAnnotationsFileCitationObjectFileCitation {
    public static final String JSON_PROPERTY_FILE_ID = "file_id";
    private String fileId;

    public static final String JSON_PROPERTY_QUOTE = "quote";
    private String quote;

    public MessageContentTextAnnotationsFileCitationObjectFileCitation(String fileId, String quote) {
        this.fileId = fileId;
        this.quote = quote;
    }

    public MessageContentTextAnnotationsFileCitationObjectFileCitation fileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * The ID of the specific File the citation is from.
     * @return fileId
     **/
    @NotNull
    @Schema(name = "file_id", description = "The ID of the specific File the citation is from.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_FILE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getFileId() {
        return fileId;
    }

    @JsonProperty(JSON_PROPERTY_FILE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public MessageContentTextAnnotationsFileCitationObjectFileCitation quote(String quote) {
        this.quote = quote;
        return this;
    }

    /**
     * The specific quote in the file.
     * @return quote
     **/
    @NotNull
    @Schema(name = "quote", description = "The specific quote in the file.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_QUOTE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getQuote() {
        return quote;
    }

    @JsonProperty(JSON_PROPERTY_QUOTE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
        MessageContentTextAnnotationsFileCitationObjectFileCitation messageContentTextAnnotationsFileCitationObjectFileCitation = (MessageContentTextAnnotationsFileCitationObjectFileCitation) o;
        return Objects.equals(this.fileId, messageContentTextAnnotationsFileCitationObjectFileCitation.fileId) &&
            Objects.equals(this.quote, messageContentTextAnnotationsFileCitationObjectFileCitation.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId, quote);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageContentTextAnnotationsFileCitationObjectFileCitation {\n");
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

