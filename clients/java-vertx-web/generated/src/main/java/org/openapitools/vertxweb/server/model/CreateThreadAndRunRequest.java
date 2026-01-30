package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AssistantsApiResponseFormatOption;
import org.openapitools.vertxweb.server.model.AssistantsApiToolChoiceOption;
import org.openapitools.vertxweb.server.model.CreateRunRequestModel;
import org.openapitools.vertxweb.server.model.CreateThreadAndRunRequestToolResources;
import org.openapitools.vertxweb.server.model.CreateThreadAndRunRequestToolsInner;
import org.openapitools.vertxweb.server.model.CreateThreadRequest;
import org.openapitools.vertxweb.server.model.TruncationObject;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateThreadAndRunRequest   {
  
  private String assistantId;
  private CreateThreadRequest thread;
  private CreateRunRequestModel model;
  private String instructions;
  private List<CreateThreadAndRunRequestToolsInner> tools;
  private CreateThreadAndRunRequestToolResources toolResources;
  private Object metadata;
  private BigDecimal temperature = new BigDecimal("1");
  private BigDecimal topP = new BigDecimal("1");
  private Boolean stream;
  private Integer maxPromptTokens;
  private Integer maxCompletionTokens;
  private TruncationObject truncationStrategy;
  private AssistantsApiToolChoiceOption toolChoice;
  private Boolean parallelToolCalls = true;
  private AssistantsApiResponseFormatOption responseFormat;

  public CreateThreadAndRunRequest () {

  }

  public CreateThreadAndRunRequest (String assistantId, CreateThreadRequest thread, CreateRunRequestModel model, String instructions, List<CreateThreadAndRunRequestToolsInner> tools, CreateThreadAndRunRequestToolResources toolResources, Object metadata, BigDecimal temperature, BigDecimal topP, Boolean stream, Integer maxPromptTokens, Integer maxCompletionTokens, TruncationObject truncationStrategy, AssistantsApiToolChoiceOption toolChoice, Boolean parallelToolCalls, AssistantsApiResponseFormatOption responseFormat) {
    this.assistantId = assistantId;
    this.thread = thread;
    this.model = model;
    this.instructions = instructions;
    this.tools = tools;
    this.toolResources = toolResources;
    this.metadata = metadata;
    this.temperature = temperature;
    this.topP = topP;
    this.stream = stream;
    this.maxPromptTokens = maxPromptTokens;
    this.maxCompletionTokens = maxCompletionTokens;
    this.truncationStrategy = truncationStrategy;
    this.toolChoice = toolChoice;
    this.parallelToolCalls = parallelToolCalls;
    this.responseFormat = responseFormat;
  }

    
  @JsonProperty("assistant_id")
  public String getAssistantId() {
    return assistantId;
  }
  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

    
  @JsonProperty("thread")
  public CreateThreadRequest getThread() {
    return thread;
  }
  public void setThread(CreateThreadRequest thread) {
    this.thread = thread;
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

    
  @JsonProperty("tools")
  public List<CreateThreadAndRunRequestToolsInner> getTools() {
    return tools;
  }
  public void setTools(List<CreateThreadAndRunRequestToolsInner> tools) {
    this.tools = tools;
  }

    
  @JsonProperty("tool_resources")
  public CreateThreadAndRunRequestToolResources getToolResources() {
    return toolResources;
  }
  public void setToolResources(CreateThreadAndRunRequestToolResources toolResources) {
    this.toolResources = toolResources;
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

    
  @JsonProperty("top_p")
  public BigDecimal getTopP() {
    return topP;
  }
  public void setTopP(BigDecimal topP) {
    this.topP = topP;
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

    
  @JsonProperty("parallel_tool_calls")
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }
  public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
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
    CreateThreadAndRunRequest createThreadAndRunRequest = (CreateThreadAndRunRequest) o;
    return Objects.equals(assistantId, createThreadAndRunRequest.assistantId) &&
        Objects.equals(thread, createThreadAndRunRequest.thread) &&
        Objects.equals(model, createThreadAndRunRequest.model) &&
        Objects.equals(instructions, createThreadAndRunRequest.instructions) &&
        Objects.equals(tools, createThreadAndRunRequest.tools) &&
        Objects.equals(toolResources, createThreadAndRunRequest.toolResources) &&
        Objects.equals(metadata, createThreadAndRunRequest.metadata) &&
        Objects.equals(temperature, createThreadAndRunRequest.temperature) &&
        Objects.equals(topP, createThreadAndRunRequest.topP) &&
        Objects.equals(stream, createThreadAndRunRequest.stream) &&
        Objects.equals(maxPromptTokens, createThreadAndRunRequest.maxPromptTokens) &&
        Objects.equals(maxCompletionTokens, createThreadAndRunRequest.maxCompletionTokens) &&
        Objects.equals(truncationStrategy, createThreadAndRunRequest.truncationStrategy) &&
        Objects.equals(toolChoice, createThreadAndRunRequest.toolChoice) &&
        Objects.equals(parallelToolCalls, createThreadAndRunRequest.parallelToolCalls) &&
        Objects.equals(responseFormat, createThreadAndRunRequest.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assistantId, thread, model, instructions, tools, toolResources, metadata, temperature, topP, stream, maxPromptTokens, maxCompletionTokens, truncationStrategy, toolChoice, parallelToolCalls, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateThreadAndRunRequest {\n");
    
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    thread: ").append(toIndentedString(thread)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    toolResources: ").append(toIndentedString(toolResources)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    maxPromptTokens: ").append(toIndentedString(maxPromptTokens)).append("\n");
    sb.append("    maxCompletionTokens: ").append(toIndentedString(maxCompletionTokens)).append("\n");
    sb.append("    truncationStrategy: ").append(toIndentedString(truncationStrategy)).append("\n");
    sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
    sb.append("    parallelToolCalls: ").append(toIndentedString(parallelToolCalls)).append("\n");
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
