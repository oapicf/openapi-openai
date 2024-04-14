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

/**
 * MessageDeltaContentTextAnnotationsFilePathObjectFilePath
 */
@JsonPropertyOrder({
  MessageDeltaContentTextAnnotationsFilePathObjectFilePath.JSON_PROPERTY_FILE_ID
})
@JsonTypeName("MessageDeltaContentTextAnnotationsFilePathObject_file_path")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-04-14T13:37:52.123317469Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class MessageDeltaContentTextAnnotationsFilePathObjectFilePath {
    public static final String JSON_PROPERTY_FILE_ID = "file_id";
    private String fileId;

    public MessageDeltaContentTextAnnotationsFilePathObjectFilePath() {
    }

    public MessageDeltaContentTextAnnotationsFilePathObjectFilePath fileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * The ID of the file that was generated.
     * @return fileId
     **/
    @Nullable
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessageDeltaContentTextAnnotationsFilePathObjectFilePath messageDeltaContentTextAnnotationsFilePathObjectFilePath = (MessageDeltaContentTextAnnotationsFilePathObjectFilePath) o;
        return Objects.equals(this.fileId, messageDeltaContentTextAnnotationsFilePathObjectFilePath.fileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageDeltaContentTextAnnotationsFilePathObjectFilePath {\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
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

