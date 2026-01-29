package apimodels;

import apimodels.ChatCompletionFunctions;
import apimodels.ChatCompletionRequestMessage;
import apimodels.ChatCompletionTool;
import apimodels.ChatCompletionToolChoiceOption;
import apimodels.CreateChatCompletionRequestFunctionCall;
import apimodels.CreateChatCompletionRequestModel;
import apimodels.CreateChatCompletionRequestResponseFormat;
import apimodels.CreateChatCompletionRequestStop;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateChatCompletionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T10:45:05.350526304Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateChatCompletionRequest   {
  @JsonProperty("messages")
  @NotNull
@Size(min=1)
@Valid

  private List<ChatCompletionRequestMessage> messages = new ArrayList<>();

  @JsonProperty("model")
  @NotNull
@Valid

  private CreateChatCompletionRequestModel model;

  @JsonProperty("frequency_penalty")
  @DecimalMin("-2")
@DecimalMax("2")
@Valid

  private BigDecimal frequencyPenalty = new BigDecimal("0");

  @JsonProperty("logit_bias")
  
  private Map<String, Integer> logitBias = null;

  @JsonProperty("logprobs")
  
  private Boolean logprobs = false;

  @JsonProperty("top_logprobs")
  @Min(0)
@Max(20)

  private Integer topLogprobs;

  @JsonProperty("max_tokens")
  
  private Integer maxTokens;

  @JsonProperty("n")
  @Min(1)
@Max(128)

  private Integer n = 1;

  @JsonProperty("presence_penalty")
  @DecimalMin("-2")
@DecimalMax("2")
@Valid

  private BigDecimal presencePenalty = new BigDecimal("0");

  @JsonProperty("response_format")
  @Valid

  private CreateChatCompletionRequestResponseFormat responseFormat;

  @JsonProperty("seed")
  @Min(-9223372036854775808)
@Max(9223372036854775807)

  private Integer seed;

  @JsonProperty("stop")
  @Valid

  private CreateChatCompletionRequestStop stop = null;

  @JsonProperty("stream")
  
  private Boolean stream = false;

  @JsonProperty("temperature")
  @DecimalMin("0")
@DecimalMax("2")
@Valid

  private BigDecimal temperature = new BigDecimal("1");

  @JsonProperty("top_p")
  @DecimalMin("0")
@DecimalMax("1")
@Valid

  private BigDecimal topP = new BigDecimal("1");

  @JsonProperty("tools")
  @Valid

  private List<@Valid ChatCompletionTool> tools = null;

  @JsonProperty("tool_choice")
  @Valid

  private ChatCompletionToolChoiceOption toolChoice;

  @JsonProperty("user")
  
  private String user;

  @JsonProperty("function_call")
  @Valid

  private CreateChatCompletionRequestFunctionCall functionCall;

  @JsonProperty("functions")
  @Size(min=1,max=128)
@Valid

  private List<@Valid ChatCompletionFunctions> functions = null;

  public CreateChatCompletionRequest messages(List<ChatCompletionRequestMessage> messages) {
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
   * A list of messages comprising the conversation so far. [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models).
   * @return messages
  **/
  public List<ChatCompletionRequestMessage> getMessages() {
    return messages;
  }

  public void setMessages(List<ChatCompletionRequestMessage> messages) {
    this.messages = messages;
  }

  public CreateChatCompletionRequest model(CreateChatCompletionRequestModel model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public CreateChatCompletionRequestModel getModel() {
    return model;
  }

  public void setModel(CreateChatCompletionRequestModel model) {
    this.model = model;
  }

  public CreateChatCompletionRequest frequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
    return this;
  }

   /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
   * minimum: -2
   * maximum: 2
   * @return frequencyPenalty
  **/
  public BigDecimal getFrequencyPenalty() {
    return frequencyPenalty;
  }

  public void setFrequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
  }

  public CreateChatCompletionRequest logitBias(Map<String, Integer> logitBias) {
    this.logitBias = logitBias;
    return this;
  }

  public CreateChatCompletionRequest putLogitBiasItem(String key, Integer logitBiasItem) {
    if (this.logitBias == null) {
      this.logitBias = new HashMap<>();
    }
    this.logitBias.put(key, logitBiasItem);
    return this;
  }

   /**
   * Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
   * @return logitBias
  **/
  public Map<String, Integer> getLogitBias() {
    return logitBias;
  }

  public void setLogitBias(Map<String, Integer> logitBias) {
    this.logitBias = logitBias;
  }

  public CreateChatCompletionRequest logprobs(Boolean logprobs) {
    this.logprobs = logprobs;
    return this;
  }

   /**
   * Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`.
   * @return logprobs
  **/
  public Boolean getLogprobs() {
    return logprobs;
  }

  public void setLogprobs(Boolean logprobs) {
    this.logprobs = logprobs;
  }

  public CreateChatCompletionRequest topLogprobs(Integer topLogprobs) {
    this.topLogprobs = topLogprobs;
    return this;
  }

   /**
   * An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used.
   * minimum: 0
   * maximum: 20
   * @return topLogprobs
  **/
  public Integer getTopLogprobs() {
    return topLogprobs;
  }

  public void setTopLogprobs(Integer topLogprobs) {
    this.topLogprobs = topLogprobs;
  }

  public CreateChatCompletionRequest maxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
    return this;
  }

   /**
   * The maximum number of [tokens](/tokenizer) that can be generated in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
   * @return maxTokens
  **/
  public Integer getMaxTokens() {
    return maxTokens;
  }

  public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
  }

  public CreateChatCompletionRequest n(Integer n) {
    this.n = n;
    return this;
  }

   /**
   * How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs.
   * minimum: 1
   * maximum: 128
   * @return n
  **/
  public Integer getN() {
    return n;
  }

  public void setN(Integer n) {
    this.n = n;
  }

  public CreateChatCompletionRequest presencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
    return this;
  }

   /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
   * minimum: -2
   * maximum: 2
   * @return presencePenalty
  **/
  public BigDecimal getPresencePenalty() {
    return presencePenalty;
  }

  public void setPresencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
  }

  public CreateChatCompletionRequest responseFormat(CreateChatCompletionRequestResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

   /**
   * Get responseFormat
   * @return responseFormat
  **/
  public CreateChatCompletionRequestResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(CreateChatCompletionRequestResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
  }

  public CreateChatCompletionRequest seed(Integer seed) {
    this.seed = seed;
    return this;
  }

   /**
   * This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return seed
  **/
  public Integer getSeed() {
    return seed;
  }

  public void setSeed(Integer seed) {
    this.seed = seed;
  }

  public CreateChatCompletionRequest stop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
    return this;
  }

   /**
   * Get stop
   * @return stop
  **/
  public CreateChatCompletionRequestStop getStop() {
    return stop;
  }

  public void setStop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
  }

  public CreateChatCompletionRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

   /**
   * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
   * @return stream
  **/
  public Boolean getStream() {
    return stream;
  }

  public void setStream(Boolean stream) {
    this.stream = stream;
  }

  public CreateChatCompletionRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

   /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
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

  public CreateChatCompletionRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

   /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
   * minimum: 0
   * maximum: 1
   * @return topP
  **/
  public BigDecimal getTopP() {
    return topP;
  }

  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  public CreateChatCompletionRequest tools(List<@Valid ChatCompletionTool> tools) {
    this.tools = tools;
    return this;
  }

  public CreateChatCompletionRequest addToolsItem(ChatCompletionTool toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

   /**
   * A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. 
   * @return tools
  **/
  public List<@Valid ChatCompletionTool> getTools() {
    return tools;
  }

  public void setTools(List<@Valid ChatCompletionTool> tools) {
    this.tools = tools;
  }

  public CreateChatCompletionRequest toolChoice(ChatCompletionToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

   /**
   * Get toolChoice
   * @return toolChoice
  **/
  public ChatCompletionToolChoiceOption getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(ChatCompletionToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }

  public CreateChatCompletionRequest user(String user) {
    this.user = user;
    return this;
  }

   /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   * @return user
  **/
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public CreateChatCompletionRequest functionCall(CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

   /**
   * Get functionCall
   * @return functionCall
  **/
  public CreateChatCompletionRequestFunctionCall getFunctionCall() {
    return functionCall;
  }

  public void setFunctionCall(CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
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
   * Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for. 
   * @return functions
  **/
  public List<@Valid ChatCompletionFunctions> getFunctions() {
    return functions;
  }

  public void setFunctions(List<@Valid ChatCompletionFunctions> functions) {
    this.functions = functions;
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
    return Objects.equals(messages, createChatCompletionRequest.messages) &&
        Objects.equals(model, createChatCompletionRequest.model) &&
        Objects.equals(frequencyPenalty, createChatCompletionRequest.frequencyPenalty) &&
        Objects.equals(logitBias, createChatCompletionRequest.logitBias) &&
        Objects.equals(logprobs, createChatCompletionRequest.logprobs) &&
        Objects.equals(topLogprobs, createChatCompletionRequest.topLogprobs) &&
        Objects.equals(maxTokens, createChatCompletionRequest.maxTokens) &&
        Objects.equals(n, createChatCompletionRequest.n) &&
        Objects.equals(presencePenalty, createChatCompletionRequest.presencePenalty) &&
        Objects.equals(responseFormat, createChatCompletionRequest.responseFormat) &&
        Objects.equals(seed, createChatCompletionRequest.seed) &&
        Objects.equals(stop, createChatCompletionRequest.stop) &&
        Objects.equals(stream, createChatCompletionRequest.stream) &&
        Objects.equals(temperature, createChatCompletionRequest.temperature) &&
        Objects.equals(topP, createChatCompletionRequest.topP) &&
        Objects.equals(tools, createChatCompletionRequest.tools) &&
        Objects.equals(toolChoice, createChatCompletionRequest.toolChoice) &&
        Objects.equals(user, createChatCompletionRequest.user) &&
        Objects.equals(functionCall, createChatCompletionRequest.functionCall) &&
        Objects.equals(functions, createChatCompletionRequest.functions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, model, frequencyPenalty, logitBias, logprobs, topLogprobs, maxTokens, n, presencePenalty, responseFormat, seed, stop, stream, temperature, topP, tools, toolChoice, user, functionCall, functions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionRequest {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    frequencyPenalty: ").append(toIndentedString(frequencyPenalty)).append("\n");
    sb.append("    logitBias: ").append(toIndentedString(logitBias)).append("\n");
    sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
    sb.append("    topLogprobs: ").append(toIndentedString(topLogprobs)).append("\n");
    sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    presencePenalty: ").append(toIndentedString(presencePenalty)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
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

