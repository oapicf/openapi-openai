package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateChatCompletionRequest  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CreateChatCompletionRequestModel model;

 /**
  * A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).
  */
  @ApiModelProperty(required = true, value = "A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).")
  @Valid
  private List<@Valid ChatCompletionRequestMessage> messages = new ArrayList<>();

 /**
  * A list of functions the model may generate JSON inputs for.
  */
  @ApiModelProperty(value = "A list of functions the model may generate JSON inputs for.")
  @Valid
  private List<@Valid ChatCompletionFunctions> functions;

  @ApiModelProperty(value = "")
  @Valid
  private CreateChatCompletionRequestFunctionCall functionCall;

 /**
  * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
  */
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. ")
  @Valid
  private BigDecimal temperature = new BigDecimal("1");

 /**
  * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
  */
  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ")
  @Valid
  private BigDecimal topP = new BigDecimal("1");

 /**
  * How many chat completion choices to generate for each input message.
  */
  @ApiModelProperty(example = "1", value = "How many chat completion choices to generate for each input message.")
  private Integer n = 1;

 /**
  * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
  */
  @ApiModelProperty(value = "If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). ")
  private Boolean stream = false;

  @ApiModelProperty(value = "")
  @Valid
  private CreateChatCompletionRequestStop stop = null;

 /**
  * The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
  */
  @ApiModelProperty(value = "The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. ")
  private Integer maxTokens;

 /**
  * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
  */
  @ApiModelProperty(value = "Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) ")
  @Valid
  private BigDecimal presencePenalty = new BigDecimal("0");

 /**
  * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
  */
  @ApiModelProperty(value = "Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) ")
  @Valid
  private BigDecimal frequencyPenalty = new BigDecimal("0");

 /**
  * Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
  */
  @ApiModelProperty(value = "Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. ")
  private Object logitBias;

 /**
  * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
  */
  @ApiModelProperty(example = "user-1234", value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
  private String user;
 /**
  * Get model
  * @return model
  */
  @JsonProperty("model")
  @NotNull
  public CreateChatCompletionRequestModel getModel() {
    return model;
  }

  /**
   * Sets the <code>model</code> property.
   */
 public void setModel(CreateChatCompletionRequestModel model) {
    this.model = model;
  }

  /**
   * Sets the <code>model</code> property.
   */
  public CreateChatCompletionRequest model(CreateChatCompletionRequestModel model) {
    this.model = model;
    return this;
  }

 /**
  * A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).
  * @return messages
  */
  @JsonProperty("messages")
  @NotNull
 @Size(min=1)  public List<@Valid ChatCompletionRequestMessage> getMessages() {
    return messages;
  }

  /**
   * Sets the <code>messages</code> property.
   */
 public void setMessages(List<@Valid ChatCompletionRequestMessage> messages) {
    this.messages = messages;
  }

  /**
   * Sets the <code>messages</code> property.
   */
  public CreateChatCompletionRequest messages(List<@Valid ChatCompletionRequestMessage> messages) {
    this.messages = messages;
    return this;
  }

  /**
   * Adds a new item to the <code>messages</code> list.
   */
  public CreateChatCompletionRequest addMessagesItem(ChatCompletionRequestMessage messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

 /**
  * A list of functions the model may generate JSON inputs for.
  * @return functions
  */
  @JsonProperty("functions")
 @Size(min=1)  public List<@Valid ChatCompletionFunctions> getFunctions() {
    return functions;
  }

  /**
   * Sets the <code>functions</code> property.
   */
 public void setFunctions(List<@Valid ChatCompletionFunctions> functions) {
    this.functions = functions;
  }

  /**
   * Sets the <code>functions</code> property.
   */
  public CreateChatCompletionRequest functions(List<@Valid ChatCompletionFunctions> functions) {
    this.functions = functions;
    return this;
  }

  /**
   * Adds a new item to the <code>functions</code> list.
   */
  public CreateChatCompletionRequest addFunctionsItem(ChatCompletionFunctions functionsItem) {
    this.functions.add(functionsItem);
    return this;
  }

 /**
  * Get functionCall
  * @return functionCall
  */
  @JsonProperty("function_call")
  public CreateChatCompletionRequestFunctionCall getFunctionCall() {
    return functionCall;
  }

  /**
   * Sets the <code>functionCall</code> property.
   */
 public void setFunctionCall(CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  /**
   * Sets the <code>functionCall</code> property.
   */
  public CreateChatCompletionRequest functionCall(CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

 /**
  * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. 
  * minimum: 0
  * maximum: 2
  * @return temperature
  */
  @JsonProperty("temperature")
 @DecimalMin("0") @DecimalMax("2")  public BigDecimal getTemperature() {
    return temperature;
  }

  /**
   * Sets the <code>temperature</code> property.
   */
 public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  /**
   * Sets the <code>temperature</code> property.
   */
  public CreateChatCompletionRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

 /**
  * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. 
  * minimum: 0
  * maximum: 1
  * @return topP
  */
  @JsonProperty("top_p")
 @DecimalMin("0") @DecimalMax("1")  public BigDecimal getTopP() {
    return topP;
  }

  /**
   * Sets the <code>topP</code> property.
   */
 public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  /**
   * Sets the <code>topP</code> property.
   */
  public CreateChatCompletionRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

 /**
  * How many chat completion choices to generate for each input message.
  * minimum: 1
  * maximum: 128
  * @return n
  */
  @JsonProperty("n")
 @Min(1) @Max(128)  public Integer getN() {
    return n;
  }

  /**
   * Sets the <code>n</code> property.
   */
 public void setN(Integer n) {
    this.n = n;
  }

  /**
   * Sets the <code>n</code> property.
   */
  public CreateChatCompletionRequest n(Integer n) {
    this.n = n;
    return this;
  }

 /**
  * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
  * @return stream
  */
  @JsonProperty("stream")
  public Boolean getStream() {
    return stream;
  }

  /**
   * Sets the <code>stream</code> property.
   */
 public void setStream(Boolean stream) {
    this.stream = stream;
  }

  /**
   * Sets the <code>stream</code> property.
   */
  public CreateChatCompletionRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

 /**
  * Get stop
  * @return stop
  */
  @JsonProperty("stop")
  public CreateChatCompletionRequestStop getStop() {
    return stop;
  }

  /**
   * Sets the <code>stop</code> property.
   */
 public void setStop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
  }

  /**
   * Sets the <code>stop</code> property.
   */
  public CreateChatCompletionRequest stop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
    return this;
  }

 /**
  * The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model&#39;s context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
  * @return maxTokens
  */
  @JsonProperty("max_tokens")
  public Integer getMaxTokens() {
    return maxTokens;
  }

  /**
   * Sets the <code>maxTokens</code> property.
   */
 public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
  }

  /**
   * Sets the <code>maxTokens</code> property.
   */
  public CreateChatCompletionRequest maxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
    return this;
  }

 /**
  * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
  * minimum: -2
  * maximum: 2
  * @return presencePenalty
  */
  @JsonProperty("presence_penalty")
 @DecimalMin("-2") @DecimalMax("2")  public BigDecimal getPresencePenalty() {
    return presencePenalty;
  }

  /**
   * Sets the <code>presencePenalty</code> property.
   */
 public void setPresencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
  }

  /**
   * Sets the <code>presencePenalty</code> property.
   */
  public CreateChatCompletionRequest presencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
    return this;
  }

 /**
  * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
  * minimum: -2
  * maximum: 2
  * @return frequencyPenalty
  */
  @JsonProperty("frequency_penalty")
 @DecimalMin("-2") @DecimalMax("2")  public BigDecimal getFrequencyPenalty() {
    return frequencyPenalty;
  }

  /**
   * Sets the <code>frequencyPenalty</code> property.
   */
 public void setFrequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
  }

  /**
   * Sets the <code>frequencyPenalty</code> property.
   */
  public CreateChatCompletionRequest frequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
    return this;
  }

 /**
  * Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
  * @return logitBias
  */
  @JsonProperty("logit_bias")
  public Object getLogitBias() {
    return logitBias;
  }

  /**
   * Sets the <code>logitBias</code> property.
   */
 public void setLogitBias(Object logitBias) {
    this.logitBias = logitBias;
  }

  /**
   * Sets the <code>logitBias</code> property.
   */
  public CreateChatCompletionRequest logitBias(Object logitBias) {
    this.logitBias = logitBias;
    return this;
  }

 /**
  * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
  * @return user
  */
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  /**
   * Sets the <code>user</code> property.
   */
 public void setUser(String user) {
    this.user = user;
  }

  /**
   * Sets the <code>user</code> property.
   */
  public CreateChatCompletionRequest user(String user) {
    this.user = user;
    return this;
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
        Objects.equals(this.temperature, createChatCompletionRequest.temperature) &&
        Objects.equals(this.topP, createChatCompletionRequest.topP) &&
        Objects.equals(this.n, createChatCompletionRequest.n) &&
        Objects.equals(this.stream, createChatCompletionRequest.stream) &&
        Objects.equals(this.stop, createChatCompletionRequest.stop) &&
        Objects.equals(this.maxTokens, createChatCompletionRequest.maxTokens) &&
        Objects.equals(this.presencePenalty, createChatCompletionRequest.presencePenalty) &&
        Objects.equals(this.frequencyPenalty, createChatCompletionRequest.frequencyPenalty) &&
        Objects.equals(this.logitBias, createChatCompletionRequest.logitBias) &&
        Objects.equals(this.user, createChatCompletionRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, messages, functions, functionCall, temperature, topP, n, stream, stop, maxTokens, presencePenalty, frequencyPenalty, logitBias, user);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

