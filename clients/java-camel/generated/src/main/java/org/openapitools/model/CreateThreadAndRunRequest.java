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
import org.openapitools.model.AssistantsApiResponseFormatOption;
import org.openapitools.model.AssistantsApiToolChoiceOption;
import org.openapitools.model.CreateRunRequestModel;
import org.openapitools.model.CreateThreadAndRunRequestToolsInner;
import org.openapitools.model.CreateThreadRequest;
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
 * CreateThreadAndRunRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T10:45:13.353144236Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateThreadAndRunRequest {

  private String assistantId;

  private CreateThreadRequest thread;

  private JsonNullable<CreateRunRequestModel> model = JsonNullable.<CreateRunRequestModel>undefined();

  private JsonNullable<String> instructions = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<CreateThreadAndRunRequestToolsInner>> tools = JsonNullable.<List<CreateThreadAndRunRequestToolsInner>>undefined();

  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  private JsonNullable<@DecimalMin(value = "0") @DecimalMax(value = "2") BigDecimal> temperature = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<Boolean> stream = JsonNullable.<Boolean>undefined();

  private JsonNullable<@Min(value = 256) Integer> maxPromptTokens = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = 256) Integer> maxCompletionTokens = JsonNullable.<Integer>undefined();

  private TruncationObject truncationStrategy;

  private AssistantsApiToolChoiceOption toolChoice;

  private AssistantsApiResponseFormatOption responseFormat;

  public CreateThreadAndRunRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateThreadAndRunRequest(String assistantId) {
    this.assistantId = assistantId;
  }

  public CreateThreadAndRunRequest assistantId(String assistantId) {
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

  public CreateThreadAndRunRequest thread(CreateThreadRequest thread) {
    this.thread = thread;
    return this;
  }

  /**
   * Get thread
   * @return thread
   */
  @Valid 
  @Schema(name = "thread", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thread")
  public CreateThreadRequest getThread() {
    return thread;
  }

  public void setThread(CreateThreadRequest thread) {
    this.thread = thread;
  }

  public CreateThreadAndRunRequest model(CreateRunRequestModel model) {
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

  public CreateThreadAndRunRequest instructions(String instructions) {
    this.instructions = JsonNullable.of(instructions);
    return this;
  }

  /**
   * Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
   * @return instructions
   */
  
  @Schema(name = "instructions", description = "Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instructions")
  public JsonNullable<String> getInstructions() {
    return instructions;
  }

  public void setInstructions(JsonNullable<String> instructions) {
    this.instructions = instructions;
  }

  public CreateThreadAndRunRequest tools(List<CreateThreadAndRunRequestToolsInner> tools) {
    this.tools = JsonNullable.of(tools);
    return this;
  }

  public CreateThreadAndRunRequest addToolsItem(CreateThreadAndRunRequestToolsInner toolsItem) {
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
  public JsonNullable<List<CreateThreadAndRunRequestToolsInner>> getTools() {
    return tools;
  }

  public void setTools(JsonNullable<List<CreateThreadAndRunRequestToolsInner>> tools) {
    this.tools = tools;
  }

  public CreateThreadAndRunRequest metadata(Object metadata) {
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

  public CreateThreadAndRunRequest temperature(BigDecimal temperature) {
    this.temperature = JsonNullable.of(temperature);
    return this;
  }

  /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
   * minimum: 0
   * maximum: 2
   * @return temperature
   */
  @Valid @DecimalMin(value = "0") @DecimalMax(value = "2") 
  @Schema(name = "temperature", example = "1", description = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temperature")
  public JsonNullable<@DecimalMin(value = "0") @DecimalMax(value = "2") BigDecimal> getTemperature() {
    return temperature;
  }

  public void setTemperature(JsonNullable<BigDecimal> temperature) {
    this.temperature = temperature;
  }

  public CreateThreadAndRunRequest stream(Boolean stream) {
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

  public CreateThreadAndRunRequest maxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = JsonNullable.of(maxPromptTokens);
    return this;
  }

  /**
   * The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
   * minimum: 256
   * @return maxPromptTokens
   */
  @Min(value = 256) 
  @Schema(name = "max_prompt_tokens", description = "The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_prompt_tokens")
  public JsonNullable<@Min(value = 256) Integer> getMaxPromptTokens() {
    return maxPromptTokens;
  }

  public void setMaxPromptTokens(JsonNullable<Integer> maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
  }

  public CreateThreadAndRunRequest maxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = JsonNullable.of(maxCompletionTokens);
    return this;
  }

  /**
   * The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
   * minimum: 256
   * @return maxCompletionTokens
   */
  @Min(value = 256) 
  @Schema(name = "max_completion_tokens", description = "The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_completion_tokens")
  public JsonNullable<@Min(value = 256) Integer> getMaxCompletionTokens() {
    return maxCompletionTokens;
  }

  public void setMaxCompletionTokens(JsonNullable<Integer> maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  public CreateThreadAndRunRequest truncationStrategy(TruncationObject truncationStrategy) {
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

  public CreateThreadAndRunRequest toolChoice(AssistantsApiToolChoiceOption toolChoice) {
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

  public CreateThreadAndRunRequest responseFormat(AssistantsApiResponseFormatOption responseFormat) {
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
    CreateThreadAndRunRequest createThreadAndRunRequest = (CreateThreadAndRunRequest) o;
    return Objects.equals(this.assistantId, createThreadAndRunRequest.assistantId) &&
        Objects.equals(this.thread, createThreadAndRunRequest.thread) &&
        equalsNullable(this.model, createThreadAndRunRequest.model) &&
        equalsNullable(this.instructions, createThreadAndRunRequest.instructions) &&
        equalsNullable(this.tools, createThreadAndRunRequest.tools) &&
        equalsNullable(this.metadata, createThreadAndRunRequest.metadata) &&
        equalsNullable(this.temperature, createThreadAndRunRequest.temperature) &&
        equalsNullable(this.stream, createThreadAndRunRequest.stream) &&
        equalsNullable(this.maxPromptTokens, createThreadAndRunRequest.maxPromptTokens) &&
        equalsNullable(this.maxCompletionTokens, createThreadAndRunRequest.maxCompletionTokens) &&
        Objects.equals(this.truncationStrategy, createThreadAndRunRequest.truncationStrategy) &&
        Objects.equals(this.toolChoice, createThreadAndRunRequest.toolChoice) &&
        Objects.equals(this.responseFormat, createThreadAndRunRequest.responseFormat);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assistantId, thread, hashCodeNullable(model), hashCodeNullable(instructions), hashCodeNullable(tools), hashCodeNullable(metadata), hashCodeNullable(temperature), hashCodeNullable(stream), hashCodeNullable(maxPromptTokens), hashCodeNullable(maxCompletionTokens), truncationStrategy, toolChoice, responseFormat);
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
    sb.append("class CreateThreadAndRunRequest {\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    thread: ").append(toIndentedString(thread)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
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

