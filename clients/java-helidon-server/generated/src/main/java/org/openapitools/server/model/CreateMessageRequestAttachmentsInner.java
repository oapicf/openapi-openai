package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CreateMessageRequestAttachmentsInnerToolsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateMessageRequestAttachmentsInner   {

    private String fileId;
    private List<CreateMessageRequestAttachmentsInnerToolsInner> tools = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CreateMessageRequestAttachmentsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateMessageRequestAttachmentsInner.
     *
     * @param fileId The ID of the file to attach to the message.
     * @param tools The tools to add this file to.
     */
    public CreateMessageRequestAttachmentsInner(
        String fileId, 
        List<CreateMessageRequestAttachmentsInnerToolsInner> tools
    ) {
        this.fileId = fileId;
        this.tools = tools;
    }



    /**
     * The ID of the file to attach to the message.
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * The tools to add this file to.
     * @return tools
     */
    public List<CreateMessageRequestAttachmentsInnerToolsInner> getTools() {
        return tools;
    }

    public void setTools(List<CreateMessageRequestAttachmentsInnerToolsInner> tools) {
        this.tools = tools;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMessageRequestAttachmentsInner {\n");
        
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
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

