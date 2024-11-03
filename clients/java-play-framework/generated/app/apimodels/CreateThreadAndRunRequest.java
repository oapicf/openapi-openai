package apimodels;

import apimodels.AssistantsApiResponseFormatOption;
import apimodels.AssistantsApiToolChoiceOption;
import apimodels.CreateRunRequestModel;
import apimodels.CreateThreadAndRunRequestToolsInner;
import apimodels.CreateThreadRequest;
import apimodels.TruncationObject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateThreadAndRunRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-03T11:07:27.411323426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateThreadAndRunRequest   {
  @JsonProperty("assistant_id")
  @NotNull

  private String assistantId;

  @JsonProperty("thread")
  @Valid

  private CreateThreadRequest thread;

  @JsonProperty("model")
  @Valid

  private CreateRunRequestModel model;

  @JsonProperty("instructions")
  
  private String instructions;

  @JsonProperty("tools")
  @Size(max=20)
@Valid

  private List<CreateThreadAndRunRequestToolsInner> tools = null;

  @JsonProperty("metadata")
  
  private Object metadata;

  @JsonProperty("temperature")
  @DecimalMin("0")
@DecimalMax("2")
@Valid

  private BigDecimal temperature = new BigDecimal("1");

  @JsonProperty("stream")
  
  private Boolean stream;

  @JsonProperty("max_prompt_tokens")
  @Min(256)

  private Integer maxPromptTokens;

  @JsonProperty("max_completion_tokens")
  @Min(256)

  private Integer maxCompletionTokens;

  @JsonProperty("truncation_strategy")
  @Valid

  private TruncationObject truncationStrategy;

  @JsonProperty("tool_choice")
  @Valid

  private AssistantsApiToolChoiceOption toolChoice;

  @JsonProperty("response_format")
  @Valid

  private AssistantsApiResponseFormatOption responseFormat;

  public CreateThreadAndRunRequest assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

   /**
   * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
   * @return assistantId
  **/
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
  **/
  public CreateThreadRequest getThread() {
    return thread;
  }

  public void setThread(CreateThreadRequest thread) {
    this.thread = thread;
  }

  public CreateThreadAndRunRequest model(CreateRunRequestModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public CreateRunRequestModel getModel() {
    return model;
  }

  public void setModel(CreateRunRequestModel model) {
    this.model = model;
  }

  public CreateThreadAndRunRequest instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
   * @return instructions
  **/
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public CreateThreadAndRunRequest tools(List<CreateThreadAndRunRequestToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public CreateThreadAndRunRequest addToolsItem(CreateThreadAndRunRequestToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

   /**
   * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
   * @return tools
  **/
  public List<CreateThreadAndRunRequestToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<CreateThreadAndRunRequestToolsInner> tools) {
    this.tools = tools;
  }

  public CreateThreadAndRunRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   * @return metadata
  **/
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public CreateThreadAndRunRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

   /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
   * minimum: 0
   * maximum: 2
   * @return temperature
  **/
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public CreateThreadAndRunRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

   /**
   * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
   * @return stream
  **/
  public Boolean getStream() {
    return stream;
  }

  public void setStream(Boolean stream) {
    this.stream = stream;
  }

  public CreateThreadAndRunRequest maxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
    return this;
  }

   /**
   * The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
   * minimum: 256
   * @return maxPromptTokens
  **/
  public Integer getMaxPromptTokens() {
    return maxPromptTokens;
  }

  public void setMaxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
  }

  public CreateThreadAndRunRequest maxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
    return this;
  }

   /**
   * The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
   * minimum: 256
   * @return maxCompletionTokens
  **/
  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }

  public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  public CreateThreadAndRunRequest truncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
    return this;
  }

   /**
   * Get truncationStrategy
   * @return truncationStrategy
  **/
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
  **/
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
  **/
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
        Objects.equals(metadata, createThreadAndRunRequest.metadata) &&
        Objects.equals(temperature, createThreadAndRunRequest.temperature) &&
        Objects.equals(stream, createThreadAndRunRequest.stream) &&
        Objects.equals(maxPromptTokens, createThreadAndRunRequest.maxPromptTokens) &&
        Objects.equals(maxCompletionTokens, createThreadAndRunRequest.maxCompletionTokens) &&
        Objects.equals(truncationStrategy, createThreadAndRunRequest.truncationStrategy) &&
        Objects.equals(toolChoice, createThreadAndRunRequest.toolChoice) &&
        Objects.equals(responseFormat, createThreadAndRunRequest.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assistantId, thread, model, instructions, tools, metadata, temperature, stream, maxPromptTokens, maxCompletionTokens, truncationStrategy, toolChoice, responseFormat);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

