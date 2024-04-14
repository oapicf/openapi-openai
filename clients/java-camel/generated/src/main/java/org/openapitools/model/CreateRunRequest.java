package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateRunRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-04-14T13:40:33.442815767Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateRunRequest {

  private String assistantId;

  private JsonNullable<CreateRunRequestModel> model = JsonNullable.<CreateRunRequestModel>undefined();

  private JsonNullable<String> instructions = JsonNullable.<String>undefined();

  private JsonNullable<String> additionalInstructions = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid CreateMessageRequest>> additionalMessages = JsonNullable.<List<@Valid CreateMessageRequest>>undefined();

  @Valid
  private JsonNullable<List<AssistantObjectToolsInner>> tools = JsonNullable.<List<AssistantObjectToolsInner>>undefined();

  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  private JsonNullable<@DecimalMin("0") @DecimalMax("2") BigDecimal> temperature = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<Boolean> stream = JsonNullable.<Boolean>undefined();

  private JsonNullable<@Min(256) Integer> maxPromptTokens = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(256) Integer> maxCompletionTokens = JsonNullable.<Integer>undefined();

  private TruncationObject truncationStrategy;

  private AssistantsApiToolChoiceOption toolChoice;

  private AssistantsApiResponseFormatOption responseFormat;

  public CreateRunRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateRunRequest(String assistantId) {
    this.assistantId = assistantId;
  }

  public CreateRunRequest assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

  /**
   * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
   * @return assistantId
  */
  @NotNull 
  @Schema(name = "assistant_id", description = "The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assistant_id")
  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  public CreateRunRequest model(CreateRunRequestModel model) {
    this.model = JsonNullable.of(model);
    return this;
  }

  /**
   * Get model
   * @return model
  */
  @Valid 
  @Schema(name = "model", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("model")
  public JsonNullable<CreateRunRequestModel> getModel() {
    return model;
  }

  public void setModel(JsonNullable<CreateRunRequestModel> model) {
    this.model = model;
  }

  public CreateRunRequest instructions(String instructions) {
    this.instructions = JsonNullable.of(instructions);
    return this;
  }

  /**
   * Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
   * @return instructions
  */
  
  @Schema(name = "instructions", description = "Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instructions")
  public JsonNullable<String> getInstructions() {
    return instructions;
  }

  public void setInstructions(JsonNullable<String> instructions) {
    this.instructions = instructions;
  }

  public CreateRunRequest additionalInstructions(String additionalInstructions) {
    this.additionalInstructions = JsonNullable.of(additionalInstructions);
    return this;
  }

  /**
   * Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
   * @return additionalInstructions
  */
  
  @Schema(name = "additional_instructions", description = "Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additional_instructions")
  public JsonNullable<String> getAdditionalInstructions() {
    return additionalInstructions;
  }

  public void setAdditionalInstructions(JsonNullable<String> additionalInstructions) {
    this.additionalInstructions = additionalInstructions;
  }

  public CreateRunRequest additionalMessages(List<@Valid CreateMessageRequest> additionalMessages) {
    this.additionalMessages = JsonNullable.of(additionalMessages);
    return this;
  }

  public CreateRunRequest addAdditionalMessagesItem(CreateMessageRequest additionalMessagesItem) {
    if (this.additionalMessages == null || !this.additionalMessages.isPresent()) {
      this.additionalMessages = JsonNullable.of(new ArrayList<>());
    }
    this.additionalMessages.get().add(additionalMessagesItem);
    return this;
  }

  /**
   * Adds additional messages to the thread before creating the run.
   * @return additionalMessages
  */
  @Valid 
  @Schema(name = "additional_messages", description = "Adds additional messages to the thread before creating the run.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additional_messages")
  public JsonNullable<List<@Valid CreateMessageRequest>> getAdditionalMessages() {
    return additionalMessages;
  }

  public void setAdditionalMessages(JsonNullable<List<@Valid CreateMessageRequest>> additionalMessages) {
    this.additionalMessages = additionalMessages;
  }

  public CreateRunRequest tools(List<AssistantObjectToolsInner> tools) {
    this.tools = JsonNullable.of(tools);
    return this;
  }

  public CreateRunRequest addToolsItem(AssistantObjectToolsInner toolsItem) {
    if (this.tools == null || !this.tools.isPresent()) {
      this.tools = JsonNullable.of(new ArrayList<>());
    }
    this.tools.get().add(toolsItem);
    return this;
  }

  /**
   * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
   * @return tools
  */
  @Valid @Size(max = 20) 
  @Schema(name = "tools", description = "Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tools")
  public JsonNullable<List<AssistantObjectToolsInner>> getTools() {
    return tools;
  }

  public void setTools(JsonNullable<List<AssistantObjectToolsInner>> tools) {
    this.tools = tools;
  }

  public CreateRunRequest metadata(Object metadata) {
    this.metadata = JsonNullable.of(metadata);
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   * @return metadata
  */
  
  @Schema(name = "metadata", description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public JsonNullable<Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  public CreateRunRequest temperature(BigDecimal temperature) {
    this.temperature = JsonNullable.of(temperature);
    return this;
  }

  /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
   * minimum: 0
   * maximum: 2
   * @return temperature
  */
  @Valid @DecimalMin("0") @DecimalMax("2") 
  @Schema(name = "temperature", example = "1", description = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temperature")
  public JsonNullable<@DecimalMin("0") @DecimalMax("2") BigDecimal> getTemperature() {
    return temperature;
  }

  public void setTemperature(JsonNullable<BigDecimal> temperature) {
    this.temperature = temperature;
  }

  public CreateRunRequest stream(Boolean stream) {
    this.stream = JsonNullable.of(stream);
    return this;
  }

  /**
   * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
   * @return stream
  */
  
  @Schema(name = "stream", description = "If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stream")
  public JsonNullable<Boolean> getStream() {
    return stream;
  }

  public void setStream(JsonNullable<Boolean> stream) {
    this.stream = stream;
  }

  public CreateRunRequest maxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = JsonNullable.of(maxPromptTokens);
    return this;
  }

  /**
   * The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
   * minimum: 256
   * @return maxPromptTokens
  */
  @Min(256) 
  @Schema(name = "max_prompt_tokens", description = "The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_prompt_tokens")
  public JsonNullable<@Min(256) Integer> getMaxPromptTokens() {
    return maxPromptTokens;
  }

  public void setMaxPromptTokens(JsonNullable<Integer> maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
  }

  public CreateRunRequest maxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = JsonNullable.of(maxCompletionTokens);
    return this;
  }

  /**
   * The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
   * minimum: 256
   * @return maxCompletionTokens
  */
  @Min(256) 
  @Schema(name = "max_completion_tokens", description = "The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_completion_tokens")
  public JsonNullable<@Min(256) Integer> getMaxCompletionTokens() {
    return maxCompletionTokens;
  }

  public void setMaxCompletionTokens(JsonNullable<Integer> maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  public CreateRunRequest truncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
    return this;
  }

  /**
   * Get truncationStrategy
   * @return truncationStrategy
  */
  @Valid 
  @Schema(name = "truncation_strategy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("truncation_strategy")
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
  */
  @Valid 
  @Schema(name = "tool_choice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tool_choice")
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
  */
  @Valid 
  @Schema(name = "response_format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        equalsNullable(this.model, createRunRequest.model) &&
        equalsNullable(this.instructions, createRunRequest.instructions) &&
        equalsNullable(this.additionalInstructions, createRunRequest.additionalInstructions) &&
        equalsNullable(this.additionalMessages, createRunRequest.additionalMessages) &&
        equalsNullable(this.tools, createRunRequest.tools) &&
        equalsNullable(this.metadata, createRunRequest.metadata) &&
        equalsNullable(this.temperature, createRunRequest.temperature) &&
        equalsNullable(this.stream, createRunRequest.stream) &&
        equalsNullable(this.maxPromptTokens, createRunRequest.maxPromptTokens) &&
        equalsNullable(this.maxCompletionTokens, createRunRequest.maxCompletionTokens) &&
        Objects.equals(this.truncationStrategy, createRunRequest.truncationStrategy) &&
        Objects.equals(this.toolChoice, createRunRequest.toolChoice) &&
        Objects.equals(this.responseFormat, createRunRequest.responseFormat);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assistantId, hashCodeNullable(model), hashCodeNullable(instructions), hashCodeNullable(additionalInstructions), hashCodeNullable(additionalMessages), hashCodeNullable(tools), hashCodeNullable(metadata), hashCodeNullable(temperature), hashCodeNullable(stream), hashCodeNullable(maxPromptTokens), hashCodeNullable(maxCompletionTokens), truncationStrategy, toolChoice, responseFormat);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

