package org.openapitools.model;

import java.util.Objects;
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

/**
 * CreateRunRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-04-14T13:38:52.193957698Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateRunRequest   {
  @JsonProperty("assistant_id")
  private String assistantId;

  @JsonProperty("model")
  private CreateRunRequestModel model;

  @JsonProperty("instructions")
  private String instructions;

  @JsonProperty("additional_instructions")
  private String additionalInstructions;

  @JsonProperty("additional_messages")
  private List<@Valid CreateMessageRequest> additionalMessages = null;

  @JsonProperty("tools")
  private List<AssistantObjectToolsInner> tools = null;

  @JsonProperty("metadata")
  private Object metadata;

  @JsonProperty("temperature")
  private BigDecimal temperature = new BigDecimal("1");

  @JsonProperty("stream")
  private Boolean stream;

  @JsonProperty("max_prompt_tokens")
  private Integer maxPromptTokens;

  @JsonProperty("max_completion_tokens")
  private Integer maxCompletionTokens;

  @JsonProperty("truncation_strategy")
  private TruncationObject truncationStrategy;

  @JsonProperty("tool_choice")
  private AssistantsApiToolChoiceOption toolChoice;

  @JsonProperty("response_format")
  private AssistantsApiResponseFormatOption responseFormat;

  public CreateRunRequest assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

   /**
   * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
   * @return assistantId
  **/
  @ApiModelProperty(required = true, value = "The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.")
  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  public CreateRunRequest model(CreateRunRequestModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(value = "")
  public CreateRunRequestModel getModel() {
    return model;
  }

  public void setModel(CreateRunRequestModel model) {
    this.model = model;
  }

  public CreateRunRequest instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
   * @return instructions
  **/
  @ApiModelProperty(value = "Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.")
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public CreateRunRequest additionalInstructions(String additionalInstructions) {
    this.additionalInstructions = additionalInstructions;
    return this;
  }

   /**
   * Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
   * @return additionalInstructions
  **/
  @ApiModelProperty(value = "Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.")
  public String getAdditionalInstructions() {
    return additionalInstructions;
  }

  public void setAdditionalInstructions(String additionalInstructions) {
    this.additionalInstructions = additionalInstructions;
  }

  public CreateRunRequest additionalMessages(List<@Valid CreateMessageRequest> additionalMessages) {
    this.additionalMessages = additionalMessages;
    return this;
  }

  public CreateRunRequest addAdditionalMessagesItem(CreateMessageRequest additionalMessagesItem) {
    if (this.additionalMessages == null) {
      this.additionalMessages = ;
    }
    this.additionalMessages.add(additionalMessagesItem);
    return this;
  }

   /**
   * Adds additional messages to the thread before creating the run.
   * @return additionalMessages
  **/
  @ApiModelProperty(value = "Adds additional messages to the thread before creating the run.")
  public List<@Valid CreateMessageRequest> getAdditionalMessages() {
    return additionalMessages;
  }

  public void setAdditionalMessages(List<@Valid CreateMessageRequest> additionalMessages) {
    this.additionalMessages = additionalMessages;
  }

  public CreateRunRequest tools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public CreateRunRequest addToolsItem(AssistantObjectToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = ;
    }
    this.tools.add(toolsItem);
    return this;
  }

   /**
   * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
   * @return tools
  **/
  @ApiModelProperty(value = "Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.")
  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  public CreateRunRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   * @return metadata
  **/
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public CreateRunRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

   /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
   * minimum: 0
   * maximum: 2
   * @return temperature
  **/
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. ")
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public CreateRunRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

   /**
   * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
   * @return stream
  **/
  @ApiModelProperty(value = "If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. ")
  public Boolean getStream() {
    return stream;
  }

  public void setStream(Boolean stream) {
    this.stream = stream;
  }

  public CreateRunRequest maxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
    return this;
  }

   /**
   * The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
   * minimum: 256
   * @return maxPromptTokens
  **/
  @ApiModelProperty(value = "The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. ")
  public Integer getMaxPromptTokens() {
    return maxPromptTokens;
  }

  public void setMaxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
  }

  public CreateRunRequest maxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
    return this;
  }

   /**
   * The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
   * minimum: 256
   * @return maxCompletionTokens
  **/
  @ApiModelProperty(value = "The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. ")
  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }

  public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  public CreateRunRequest truncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
    return this;
  }

   /**
   * Get truncationStrategy
   * @return truncationStrategy
  **/
  @ApiModelProperty(value = "")
  public TruncationObject getTruncationStrategy() {
    return truncationStrategy;
  }

  public void setTruncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
  }

  public CreateRunRequest toolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

   /**
   * Get toolChoice
   * @return toolChoice
  **/
  @ApiModelProperty(value = "")
  public AssistantsApiToolChoiceOption getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }

  public CreateRunRequest responseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

   /**
   * Get responseFormat
   * @return responseFormat
  **/
  @ApiModelProperty(value = "")
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
        Objects.equals(this.stream, createRunRequest.stream) &&
        Objects.equals(this.maxPromptTokens, createRunRequest.maxPromptTokens) &&
        Objects.equals(this.maxCompletionTokens, createRunRequest.maxCompletionTokens) &&
        Objects.equals(this.truncationStrategy, createRunRequest.truncationStrategy) &&
        Objects.equals(this.toolChoice, createRunRequest.toolChoice) &&
        Objects.equals(this.responseFormat, createRunRequest.responseFormat);
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

