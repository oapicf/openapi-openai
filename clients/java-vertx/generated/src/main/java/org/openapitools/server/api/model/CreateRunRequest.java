package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.AssistantObjectToolsInner;
import org.openapitools.server.api.model.AssistantsApiResponseFormatOption;
import org.openapitools.server.api.model.AssistantsApiToolChoiceOption;
import org.openapitools.server.api.model.CreateMessageRequest;
import org.openapitools.server.api.model.CreateRunRequestModel;
import org.openapitools.server.api.model.TruncationObject;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateRunRequest   {
  
  private String assistantId;
  private CreateRunRequestModel model;
  private String instructions;
  private String additionalInstructions;
  private List<CreateMessageRequest> additionalMessages;
  private List<AssistantObjectToolsInner> tools;
  private Object metadata;
  private BigDecimal temperature = new BigDecimal("1");
  private Boolean stream;
  private Integer maxPromptTokens;
  private Integer maxCompletionTokens;
  private TruncationObject truncationStrategy;
  private AssistantsApiToolChoiceOption toolChoice;
  private AssistantsApiResponseFormatOption responseFormat;

  public CreateRunRequest () {

  }

  public CreateRunRequest (String assistantId, CreateRunRequestModel model, String instructions, String additionalInstructions, List<CreateMessageRequest> additionalMessages, List<AssistantObjectToolsInner> tools, Object metadata, BigDecimal temperature, Boolean stream, Integer maxPromptTokens, Integer maxCompletionTokens, TruncationObject truncationStrategy, AssistantsApiToolChoiceOption toolChoice, AssistantsApiResponseFormatOption responseFormat) {
    this.assistantId = assistantId;
    this.model = model;
    this.instructions = instructions;
    this.additionalInstructions = additionalInstructions;
    this.additionalMessages = additionalMessages;
    this.tools = tools;
    this.metadata = metadata;
    this.temperature = temperature;
    this.stream = stream;
    this.maxPromptTokens = maxPromptTokens;
    this.maxCompletionTokens = maxCompletionTokens;
    this.truncationStrategy = truncationStrategy;
    this.toolChoice = toolChoice;
    this.responseFormat = responseFormat;
  }

    
  @JsonProperty("assistant_id")
  public String getAssistantId() {
    return assistantId;
  }
  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

    
  @JsonProperty("model")
  public CreateRunRequestModel getModel() {
    return model;
  }
  public void setModel(CreateRunRequestModel model) {
    this.model = model;
  }

    
  @JsonProperty("instructions")
  public String getInstructions() {
    return instructions;
  }
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

    
  @JsonProperty("additional_instructions")
  public String getAdditionalInstructions() {
    return additionalInstructions;
  }
  public void setAdditionalInstructions(String additionalInstructions) {
    this.additionalInstructions = additionalInstructions;
  }

    
  @JsonProperty("additional_messages")
  public List<CreateMessageRequest> getAdditionalMessages() {
    return additionalMessages;
  }
  public void setAdditionalMessages(List<CreateMessageRequest> additionalMessages) {
    this.additionalMessages = additionalMessages;
  }

    
  @JsonProperty("tools")
  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }
  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

    
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

    
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
    return temperature;
  }
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

    
  @JsonProperty("stream")
  public Boolean getStream() {
    return stream;
  }
  public void setStream(Boolean stream) {
    this.stream = stream;
  }

    
  @JsonProperty("max_prompt_tokens")
  public Integer getMaxPromptTokens() {
    return maxPromptTokens;
  }
  public void setMaxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
  }

    
  @JsonProperty("max_completion_tokens")
  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }
  public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

    
  @JsonProperty("truncation_strategy")
  public TruncationObject getTruncationStrategy() {
    return truncationStrategy;
  }
  public void setTruncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
  }

    
  @JsonProperty("tool_choice")
  public AssistantsApiToolChoiceOption getToolChoice() {
    return toolChoice;
  }
  public void setToolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }

    
  @JsonProperty("response_format")
  public AssistantsApiResponseFormatOption getResponseFormat() {
    return responseFormat;
  }
  public void setResponseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRunRequest createRunRequest = (CreateRunRequest) o;
    return Objects.equals(assistantId, createRunRequest.assistantId) &&
        Objects.equals(model, createRunRequest.model) &&
        Objects.equals(instructions, createRunRequest.instructions) &&
        Objects.equals(additionalInstructions, createRunRequest.additionalInstructions) &&
        Objects.equals(additionalMessages, createRunRequest.additionalMessages) &&
        Objects.equals(tools, createRunRequest.tools) &&
        Objects.equals(metadata, createRunRequest.metadata) &&
        Objects.equals(temperature, createRunRequest.temperature) &&
        Objects.equals(stream, createRunRequest.stream) &&
        Objects.equals(maxPromptTokens, createRunRequest.maxPromptTokens) &&
        Objects.equals(maxCompletionTokens, createRunRequest.maxCompletionTokens) &&
        Objects.equals(truncationStrategy, createRunRequest.truncationStrategy) &&
        Objects.equals(toolChoice, createRunRequest.toolChoice) &&
        Objects.equals(responseFormat, createRunRequest.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assistantId, model, instructions, additionalInstructions, additionalMessages, tools, metadata, temperature, stream, maxPromptTokens, maxCompletionTokens, truncationStrategy, toolChoice, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRunRequest {\n");
    
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    additionalInstructions: ").append(toIndentedString(additionalInstructions)).append("\n");
    sb.append("    additionalMessages: ").append(toIndentedString(additionalMessages)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    maxPromptTokens: ").append(toIndentedString(maxPromptTokens)).append("\n");
    sb.append("    maxCompletionTokens: ").append(toIndentedString(maxCompletionTokens)).append("\n");
    sb.append("    truncationStrategy: ").append(toIndentedString(truncationStrategy)).append("\n");
    sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
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
