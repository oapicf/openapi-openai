package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssistantObjectToolsInner;
import org.openapitools.model.AssistantsApiResponseFormatOption;
import org.openapitools.model.AssistantsApiToolChoiceOption;
import org.openapitools.model.CreateMessageRequest;
import org.openapitools.model.CreateRunRequestModel;
import org.openapitools.model.TruncationObject;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateRunRequest   {
  
  private String assistantId;
  private CreateRunRequestModel model;
  private String instructions;
  private String additionalInstructions;
  private List<@Valid CreateMessageRequest> additionalMessages;
  private List<AssistantObjectToolsInner> tools;
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

  /**
   * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
   **/
  
  @ApiModelProperty(required = true, value = "The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.")
  @JsonProperty("assistant_id")
  @NotNull
  public String getAssistantId() {
    return assistantId;
  }
  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("model")
  public CreateRunRequestModel getModel() {
    return model;
  }
  public void setModel(CreateRunRequestModel model) {
    this.model = model;
  }

  /**
   * Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
   **/
  
  @ApiModelProperty(value = "Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.")
  @JsonProperty("instructions")
  public String getInstructions() {
    return instructions;
  }
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  /**
   * Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
   **/
  
  @ApiModelProperty(value = "Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.")
  @JsonProperty("additional_instructions")
  public String getAdditionalInstructions() {
    return additionalInstructions;
  }
  public void setAdditionalInstructions(String additionalInstructions) {
    this.additionalInstructions = additionalInstructions;
  }

  /**
   * Adds additional messages to the thread before creating the run.
   **/
  
  @ApiModelProperty(value = "Adds additional messages to the thread before creating the run.")
  @JsonProperty("additional_messages")
  public List<@Valid CreateMessageRequest> getAdditionalMessages() {
    return additionalMessages;
  }
  public void setAdditionalMessages(List<@Valid CreateMessageRequest> additionalMessages) {
    this.additionalMessages = additionalMessages;
  }

  /**
   * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
   **/
  
  @ApiModelProperty(value = "Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.")
  @JsonProperty("tools")
 @Size(max=20)  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }
  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   **/
  
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  @JsonProperty("metadata")
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
   **/
  
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. ")
  @JsonProperty("temperature")
 @DecimalMin("0") @DecimalMax("2")  public BigDecimal getTemperature() {
    return temperature;
  }
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
   * minimum: 0
   * maximum: 1
   **/
  
  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. ")
  @JsonProperty("top_p")
 @DecimalMin("0") @DecimalMax("1")  public BigDecimal getTopP() {
    return topP;
  }
  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  /**
   * If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. 
   **/
  
  @ApiModelProperty(value = "If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. ")
  @JsonProperty("stream")
  public Boolean getStream() {
    return stream;
  }
  public void setStream(Boolean stream) {
    this.stream = stream;
  }

  /**
   * The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info. 
   * minimum: 256
   **/
  
  @ApiModelProperty(value = "The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. ")
  @JsonProperty("max_prompt_tokens")
 @Min(256)  public Integer getMaxPromptTokens() {
    return maxPromptTokens;
  }
  public void setMaxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
  }

  /**
   * The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info. 
   * minimum: 256
   **/
  
  @ApiModelProperty(value = "The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. ")
  @JsonProperty("max_completion_tokens")
 @Min(256)  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }
  public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("truncation_strategy")
  public TruncationObject getTruncationStrategy() {
    return truncationStrategy;
  }
  public void setTruncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tool_choice")
  public AssistantsApiToolChoiceOption getToolChoice() {
    return toolChoice;
  }
  public void setToolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }

  /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
   **/
  
  @ApiModelProperty(value = "Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.")
  @JsonProperty("parallel_tool_calls")
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }
  public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.assistantId, createRunRequest.assistantId) &&
        Objects.equals(this.model, createRunRequest.model) &&
        Objects.equals(this.instructions, createRunRequest.instructions) &&
        Objects.equals(this.additionalInstructions, createRunRequest.additionalInstructions) &&
        Objects.equals(this.additionalMessages, createRunRequest.additionalMessages) &&
        Objects.equals(this.tools, createRunRequest.tools) &&
        Objects.equals(this.metadata, createRunRequest.metadata) &&
        Objects.equals(this.temperature, createRunRequest.temperature) &&
        Objects.equals(this.topP, createRunRequest.topP) &&
        Objects.equals(this.stream, createRunRequest.stream) &&
        Objects.equals(this.maxPromptTokens, createRunRequest.maxPromptTokens) &&
        Objects.equals(this.maxCompletionTokens, createRunRequest.maxCompletionTokens) &&
        Objects.equals(this.truncationStrategy, createRunRequest.truncationStrategy) &&
        Objects.equals(this.toolChoice, createRunRequest.toolChoice) &&
        Objects.equals(this.parallelToolCalls, createRunRequest.parallelToolCalls) &&
        Objects.equals(this.responseFormat, createRunRequest.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assistantId, model, instructions, additionalInstructions, additionalMessages, tools, metadata, temperature, topP, stream, maxPromptTokens, maxCompletionTokens, truncationStrategy, toolChoice, parallelToolCalls, responseFormat);
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

