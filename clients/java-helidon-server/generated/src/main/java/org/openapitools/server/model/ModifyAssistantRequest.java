package org.openapitools.server.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AssistantObjectToolsInner;
import org.openapitools.server.model.AssistantsApiResponseFormatOption;
import org.openapitools.server.model.ModifyAssistantRequestToolResources;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ModifyAssistantRequest   {

    private String model;
    private String name;
    private String description;
    private String instructions;
    private List<AssistantObjectToolsInner> tools = new ArrayList<>();
    private ModifyAssistantRequestToolResources toolResources;
    private Object metadata;
    private BigDecimal temperature = new BigDecimal("1");
    private BigDecimal topP = new BigDecimal("1");
    private AssistantsApiResponseFormatOption responseFormat;

    /**
     * Default constructor.
     */
    public ModifyAssistantRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create ModifyAssistantRequest.
     *
     * @param model ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
     * @param name The name of the assistant. The maximum length is 256 characters. 
     * @param description The description of the assistant. The maximum length is 512 characters. 
     * @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. 
     * @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;. 
     * @param toolResources toolResources
     * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
     * @param topP An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
     * @param responseFormat responseFormat
     */
    public ModifyAssistantRequest(
        String model, 
        String name, 
        String description, 
        String instructions, 
        List<AssistantObjectToolsInner> tools, 
        ModifyAssistantRequestToolResources toolResources, 
        Object metadata, 
        BigDecimal temperature, 
        BigDecimal topP, 
        AssistantsApiResponseFormatOption responseFormat
    ) {
        this.model = model;
        this.name = name;
        this.description = description;
        this.instructions = instructions;
        this.tools = tools;
        this.toolResources = toolResources;
        this.metadata = metadata;
        this.temperature = temperature;
        this.topP = topP;
        this.responseFormat = responseFormat;
    }



    /**
     * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * The name of the assistant. The maximum length is 256 characters. 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The description of the assistant. The maximum length is 512 characters. 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
     * @return instructions
     */
    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
     * @return tools
     */
    public List<AssistantObjectToolsInner> getTools() {
        return tools;
    }

    public void setTools(List<AssistantObjectToolsInner> tools) {
        this.tools = tools;
    }

    /**
     * Get toolResources
     * @return toolResources
     */
    public ModifyAssistantRequestToolResources getToolResources() {
        return toolResources;
    }

    public void setToolResources(ModifyAssistantRequestToolResources toolResources) {
        this.toolResources = toolResources;
    }

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    /**
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
     * minimum: 0
     * maximum: 2
     * @return temperature
     */
    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    /**
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
     * minimum: 0
     * maximum: 1
     * @return topP
     */
    public BigDecimal getTopP() {
        return topP;
    }

    public void setTopP(BigDecimal topP) {
        this.topP = topP;
    }

    /**
     * Get responseFormat
     * @return responseFormat
     */
    public AssistantsApiResponseFormatOption getResponseFormat() {
        return responseFormat;
    }

    public void setResponseFormat(AssistantsApiResponseFormatOption responseFormat) {
        this.responseFormat = responseFormat;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyAssistantRequest {\n");
        
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
        sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
        sb.append("    toolResources: ").append(toIndentedString(toolResources)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
        sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
        sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
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

