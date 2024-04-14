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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CreateAssistantFileRequest
 */
@JsonPropertyOrder({
  CreateAssistantFileRequest.JSON_PROPERTY_FILE_ID
})
@JsonTypeName("CreateAssistantFileRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class CreateAssistantFileRequest {
    public static final String JSON_PROPERTY_FILE_ID = "file_id";
    private String fileId;

    public CreateAssistantFileRequest(String fileId) {
        this.fileId = fileId;
    }

    public CreateAssistantFileRequest fileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * A [File](/docs/api-reference/files) ID (with &#x60;purpose&#x3D;\&quot;assistants\&quot;&#x60;) that the assistant should use. Useful for tools like &#x60;retrieval&#x60; and &#x60;code_interpreter&#x60; that can access files.
     * @return fileId
     **/
    @NotNull
    @Schema(name = "file_id", description = "A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.", requiredMode = Schema.RequiredMode.REQUIRED)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAssistantFileRequest createAssistantFileRequest = (CreateAssistantFileRequest) o;
        return Objects.equals(this.fileId, createAssistantFileRequest.fileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAssistantFileRequest {\n");
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

