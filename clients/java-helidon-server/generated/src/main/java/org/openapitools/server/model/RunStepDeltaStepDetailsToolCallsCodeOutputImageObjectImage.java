package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage   {

    private String fileId;

    /**
     * Default constructor.
     */
    public RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.
     *
     * @param fileId The [file](/docs/api-reference/files) ID of the image.
     */
    public RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage(
        String fileId
    ) {
        this.fileId = fileId;
    }



    /**
     * The [file](/docs/api-reference/files) ID of the image.
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage {\n");
        
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

