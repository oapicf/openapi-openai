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
import org.openapitools.model.ChatCompletionFunctions;
import org.openapitools.model.ChatCompletionRequestMessage;
import org.openapitools.model.CreateChatCompletionRequestFunctionCall;
import org.openapitools.model.CreateChatCompletionRequestModel;
import org.openapitools.model.CreateChatCompletionRequestStop;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateChatCompletionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-16T01:17:43.141820780Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateChatCompletionRequest {

  private CreateChatCompletionRequestModel model;

  @Valid
  private List<@Valid ChatCompletionRequestMessage> messages = new ArrayList<>();

  @Valid
  private List<@Valid ChatCompletionFunctions> functions;

  private CreateChatCompletionRequestFunctionCall functionCall;

  private JsonNullable<@DecimalMin("0") @DecimalMax("2") BigDecimal> temperature = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<@DecimalMin("0") @DecimalMax("1") BigDecimal> topP = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<@Min(1) @Max(128) Integer> n = JsonNullable.<Integer>undefined();

  private JsonNullable<Boolean> stream = JsonNullable.<Boolean>undefined();

  private CreateChatCompletionRequestStop stop = null;

  private Integer maxTokens;

  private JsonNullable<@DecimalMin("-2") @DecimalMax("2") BigDecimal> presencePenalty = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<@DecimalMin("-2") @DecimalMax("2") BigDecimal> frequencyPenalty = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<Object> logitBias = JsonNullable.<Object>undefined();

  private String user;

  public CreateChatCompletionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateChatCompletionRequest(CreateChatCompletionRequestModel model, List<@Valid ChatCompletionRequestMessage> messages) {
    this.model = model;
    this.messages = messages;
  }

  public CreateChatCompletionRequest model(CreateChatCompletionRequestModel model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  */
  @NotNull @Valid 
  @Schema(name = "model", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("model")
  public CreateChatCompletionRequestModel getModel() {
    return model;
  }

  public void setModel(CreateChatCompletionRequestModel model) {
    this.model = model;
  }

  public CreateChatCompletionRequest messages(List<@Valid ChatCompletionRequestMessage> messages) {
    this.messages = messages;
    return this;
  }

  public CreateChatCompletionRequest addMessagesItem(ChatCompletionRequestMessage messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).
   * @return messages
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "messages", description = "A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("messages")
  public List<@Valid ChatCompletionRequestMessage> getMessages() {
    return messages;
  }

  public void setMessages(List<@Valid ChatCompletionRequestMessage> messages) {
    this.messages = messages;
  }

  public CreateChatCompletionRequest functions(List<@Valid ChatCompletionFunctions> functions) {
    this.functions = functions;
    return this;
  }

  public CreateChatCompletionRequest addFunctionsItem(ChatCompletionFunctions functionsItem) {
    if (this.functions == null) {
      this.functions = new ArrayList<>();
    }
    this.functions.add(functionsItem);
    return this;
  }

  /**
   * A list of functions the model may generate JSON inputs for.
   * @return functions
  */
  @Valid @Size(min = 1) 
  @Schema(name = "functions", description = "A list of functions the model may generate JSON inputs for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("functions")
  public List<@Valid ChatCompletionFunctions> getFunctions() {
    return functions;
  }

  public void setFunctions(List<@Valid ChatCompletionFunctions> functions) {
    this.functions = functions;
  }

  public CreateChatCompletionRequest functionCall(CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

  /**
   * Get functionCall
   * @return functionCall
  */
  @Valid 
  @Schema(name = "function_call", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("function_call")
  public CreateChatCompletionRequestFunctionCall getFunctionCall() {
    return functionCall;
  }

  public void setFunctionCall(CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  public CreateChatCompletionRequest temperature(BigDecimal temperature) {
    this.temperature = JsonNullable.of(temperature);
    return this;
  }

  /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
   * minimum: 0
   * maximum: 2
   * @return temperature
  */
  @Valid @DecimalMin("0") @DecimalMax("2") 
  @Schema(name = "temperature", example = "1", description = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temperature")
  public JsonNullable<@DecimalMin("0") @DecimalMax("2") BigDecimal> getTemperature() {
    return temperature;
  }

  public void setTemperature(JsonNullable<BigDecimal> temperature) {
    this.temperature = temperature;
  }

  public CreateChatCompletionRequest topP(BigDecimal topP) {
    this.topP = JsonNullable.of(topP);
    return this;
  }

  /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
   * minimum: 0
   * maximum: 1
   * @return topP
  */
  @Valid @DecimalMin("0") @DecimalMax("1") 
  @Schema(name = "top_p", example = "1", description = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("top_p")
  public JsonNullable<@DecimalMin("0") @DecimalMax("1") BigDecimal> getTopP() {
    return topP;
  }

  public void setTopP(JsonNullable<BigDecimal> topP) {
    this.topP = topP;
  }

  public CreateChatCompletionRequest n(Integer n) {
    this.n = JsonNullable.of(n);
    return this;
  }

  /**
   * How many chat completion choices to generate for each input message.
   * minimum: 1
   * maximum: 128
   * @return n
  */
  @Min(1) @Max(128) 
  @Schema(name = "n", example = "1", description = "How many chat completion choices to generate for each input message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("n")
  public JsonNullable<@Min(1) @Max(128) Integer> getN() {
    return n;
  }

  public void setN(JsonNullable<Integer> n) {
    this.n = n;
  }

  public CreateChatCompletionRequest stream(Boolean stream) {
    this.stream = JsonNullable.of(stream);
    return this;
  }

  /**
   * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
   * @return stream
  */
  
  @Schema(name = "stream", description = "If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stream")
  public JsonNullable<Boolean> getStream() {
    return stream;
  }

  public void setStream(JsonNullable<Boolean> stream) {
    this.stream = stream;
  }

  public CreateChatCompletionRequest stop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
    return this;
  }

  /**
   * Get stop
   * @return stop
  */
  @Valid 
  @Schema(name = "stop", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stop")
  public CreateChatCompletionRequestStop getStop() {
    return stop;
  }

  public void setStop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
  }

  public CreateChatCompletionRequest maxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
    return this;
  }

  /**
   * The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
   * @return maxTokens
  */
  
  @Schema(name = "max_tokens", description = "The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_tokens")
  public Integer getMaxTokens() {
    return maxTokens;
  }

  public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
  }

  public CreateChatCompletionRequest presencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = JsonNullable.of(presencePenalty);
    return this;
  }

  /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
   * minimum: -2
   * maximum: 2
   * @return presencePenalty
  */
  @Valid @DecimalMin("-2") @DecimalMax("2") 
  @Schema(name = "presence_penalty", description = "Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("presence_penalty")
  public JsonNullable<@DecimalMin("-2") @DecimalMax("2") BigDecimal> getPresencePenalty() {
    return presencePenalty;
  }

  public void setPresencePenalty(JsonNullable<BigDecimal> presencePenalty) {
    this.presencePenalty = presencePenalty;
  }

  public CreateChatCompletionRequest frequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = JsonNullable.of(frequencyPenalty);
    return this;
  }

  /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
   * minimum: -2
   * maximum: 2
   * @return frequencyPenalty
  */
  @Valid @DecimalMin("-2") @DecimalMax("2") 
  @Schema(name = "frequency_penalty", description = "Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("frequency_penalty")
  public JsonNullable<@DecimalMin("-2") @DecimalMax("2") BigDecimal> getFrequencyPenalty() {
    return frequencyPenalty;
  }

  public void setFrequencyPenalty(JsonNullable<BigDecimal> frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
  }

  public CreateChatCompletionRequest logitBias(Object logitBias) {
    this.logitBias = JsonNullable.of(logitBias);
    return this;
  }

  /**
   * Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
   * @return logitBias
  */
  
  @Schema(name = "logit_bias", description = "Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logit_bias")
  public JsonNullable<Object> getLogitBias() {
    return logitBias;
  }

  public void setLogitBias(JsonNullable<Object> logitBias) {
    this.logitBias = logitBias;
  }

  public CreateChatCompletionRequest user(String user) {
    this.user = user;
    return this;
  }

  /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   * @return user
  */
  
  @Schema(name = "user", example = "user-1234", description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionRequest createChatCompletionRequest = (CreateChatCompletionRequest) o;
    return Objects.equals(this.model, createChatCompletionRequest.model) &&
        Objects.equals(this.messages, createChatCompletionRequest.messages) &&
        Objects.equals(this.functions, createChatCompletionRequest.functions) &&
        Objects.equals(this.functionCall, createChatCompletionRequest.functionCall) &&
        equalsNullable(this.temperature, createChatCompletionRequest.temperature) &&
        equalsNullable(this.topP, createChatCompletionRequest.topP) &&
        equalsNullable(this.n, createChatCompletionRequest.n) &&
        equalsNullable(this.stream, createChatCompletionRequest.stream) &&
        Objects.equals(this.stop, createChatCompletionRequest.stop) &&
        Objects.equals(this.maxTokens, createChatCompletionRequest.maxTokens) &&
        equalsNullable(this.presencePenalty, createChatCompletionRequest.presencePenalty) &&
        equalsNullable(this.frequencyPenalty, createChatCompletionRequest.frequencyPenalty) &&
        equalsNullable(this.logitBias, createChatCompletionRequest.logitBias) &&
        Objects.equals(this.user, createChatCompletionRequest.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, messages, functions, functionCall, hashCodeNullable(temperature), hashCodeNullable(topP), hashCodeNullable(n), hashCodeNullable(stream), stop, maxTokens, hashCodeNullable(presencePenalty), hashCodeNullable(frequencyPenalty), hashCodeNullable(logitBias), user);
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
    sb.append("class CreateChatCompletionRequest {\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
    sb.append("    presencePenalty: ").append(toIndentedString(presencePenalty)).append("\n");
    sb.append("    frequencyPenalty: ").append(toIndentedString(frequencyPenalty)).append("\n");
    sb.append("    logitBias: ").append(toIndentedString(logitBias)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

