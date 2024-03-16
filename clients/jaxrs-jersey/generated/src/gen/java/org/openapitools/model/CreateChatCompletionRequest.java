/*
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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
import org.openapitools.model.ChatCompletionFunctions;
import org.openapitools.model.ChatCompletionRequestMessage;
import org.openapitools.model.CreateChatCompletionRequestFunctionCall;
import org.openapitools.model.CreateChatCompletionRequestModel;
import org.openapitools.model.CreateChatCompletionRequestStop;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * CreateChatCompletionRequest
 */
@JsonPropertyOrder({
  CreateChatCompletionRequest.JSON_PROPERTY_MODEL,
  CreateChatCompletionRequest.JSON_PROPERTY_MESSAGES,
  CreateChatCompletionRequest.JSON_PROPERTY_FUNCTIONS,
  CreateChatCompletionRequest.JSON_PROPERTY_FUNCTION_CALL,
  CreateChatCompletionRequest.JSON_PROPERTY_TEMPERATURE,
  CreateChatCompletionRequest.JSON_PROPERTY_TOP_P,
  CreateChatCompletionRequest.JSON_PROPERTY_N,
  CreateChatCompletionRequest.JSON_PROPERTY_STREAM,
  CreateChatCompletionRequest.JSON_PROPERTY_STOP,
  CreateChatCompletionRequest.JSON_PROPERTY_MAX_TOKENS,
  CreateChatCompletionRequest.JSON_PROPERTY_PRESENCE_PENALTY,
  CreateChatCompletionRequest.JSON_PROPERTY_FREQUENCY_PENALTY,
  CreateChatCompletionRequest.JSON_PROPERTY_LOGIT_BIAS,
  CreateChatCompletionRequest.JSON_PROPERTY_USER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateChatCompletionRequest   {
  public static final String JSON_PROPERTY_MODEL = "model";
  @JsonProperty(JSON_PROPERTY_MODEL)
  private CreateChatCompletionRequestModel model;

  public static final String JSON_PROPERTY_MESSAGES = "messages";
  @JsonProperty(JSON_PROPERTY_MESSAGES)
  private List<@Valid ChatCompletionRequestMessage> messages = new ArrayList<>();

  public static final String JSON_PROPERTY_FUNCTIONS = "functions";
  @JsonProperty(JSON_PROPERTY_FUNCTIONS)
  private List<@Valid ChatCompletionFunctions> functions;

  public static final String JSON_PROPERTY_FUNCTION_CALL = "function_call";
  @JsonProperty(JSON_PROPERTY_FUNCTION_CALL)
  private CreateChatCompletionRequestFunctionCall functionCall;

  public static final String JSON_PROPERTY_TEMPERATURE = "temperature";
  @JsonProperty(JSON_PROPERTY_TEMPERATURE)
  private BigDecimal temperature = new BigDecimal("1");

  public static final String JSON_PROPERTY_TOP_P = "top_p";
  @JsonProperty(JSON_PROPERTY_TOP_P)
  private BigDecimal topP = new BigDecimal("1");

  public static final String JSON_PROPERTY_N = "n";
  @JsonProperty(JSON_PROPERTY_N)
  private Integer n = 1;

  public static final String JSON_PROPERTY_STREAM = "stream";
  @JsonProperty(JSON_PROPERTY_STREAM)
  private Boolean stream = false;

  public static final String JSON_PROPERTY_STOP = "stop";
  @JsonProperty(JSON_PROPERTY_STOP)
  private CreateChatCompletionRequestStop stop = null;

  public static final String JSON_PROPERTY_MAX_TOKENS = "max_tokens";
  @JsonProperty(JSON_PROPERTY_MAX_TOKENS)
  private Integer maxTokens;

  public static final String JSON_PROPERTY_PRESENCE_PENALTY = "presence_penalty";
  @JsonProperty(JSON_PROPERTY_PRESENCE_PENALTY)
  private BigDecimal presencePenalty = new BigDecimal("0");

  public static final String JSON_PROPERTY_FREQUENCY_PENALTY = "frequency_penalty";
  @JsonProperty(JSON_PROPERTY_FREQUENCY_PENALTY)
  private BigDecimal frequencyPenalty = new BigDecimal("0");

  public static final String JSON_PROPERTY_LOGIT_BIAS = "logit_bias";
  @JsonProperty(JSON_PROPERTY_LOGIT_BIAS)
  private Object logitBias;

  public static final String JSON_PROPERTY_USER = "user";
  @JsonProperty(JSON_PROPERTY_USER)
  private String user;

  public CreateChatCompletionRequest model(CreateChatCompletionRequestModel model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   **/
  @JsonProperty(value = "model")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
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
   **/
  @JsonProperty(value = "messages")
  @ApiModelProperty(required = true, value = "A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).")
  @NotNull @Valid  @Size(min=1)
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
   **/
  @JsonProperty(value = "functions")
  @ApiModelProperty(value = "A list of functions the model may generate JSON inputs for.")
  @Valid  @Size(min=1)
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
   **/
  @JsonProperty(value = "function_call")
  @ApiModelProperty(value = "")
  @Valid 
  public CreateChatCompletionRequestFunctionCall getFunctionCall() {
    return functionCall;
  }

  public void setFunctionCall(CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  public CreateChatCompletionRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. 
   * minimum: 0
   * maximum: 2
   * @return temperature
   **/
  @JsonProperty(value = "temperature")
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. ")
  @Valid  @DecimalMin("0") @DecimalMax("2")
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
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. 
   * minimum: 0
   * maximum: 1
   * @return topP
   **/
  @JsonProperty(value = "top_p")
  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ")
  @Valid  @DecimalMin("0") @DecimalMax("1")
  public BigDecimal getTopP() {
    return topP;
  }

  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  public CreateChatCompletionRequest n(Integer n) {
    this.n = n;
    return this;
  }

  /**
   * How many chat completion choices to generate for each input message.
   * minimum: 1
   * maximum: 128
   * @return n
   **/
  @JsonProperty(value = "n")
  @ApiModelProperty(example = "1", value = "How many chat completion choices to generate for each input message.")
   @Min(1) @Max(128)
  public Integer getN() {
    return n;
  }

  public void setN(Integer n) {
    this.n = n;
  }

  public CreateChatCompletionRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

  /**
   * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
   * @return stream
   **/
  @JsonProperty(value = "stream")
  @ApiModelProperty(value = "If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). ")
  
  public Boolean getStream() {
    return stream;
  }

  public void setStream(Boolean stream) {
    this.stream = stream;
  }

  public CreateChatCompletionRequest stop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
    return this;
  }

  /**
   * Get stop
   * @return stop
   **/
  @JsonProperty(value = "stop")
  @ApiModelProperty(value = "")
  @Valid 
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
   * The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model&#39;s context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
   * @return maxTokens
   **/
  @JsonProperty(value = "max_tokens")
  @ApiModelProperty(value = "The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. ")
  
  public Integer getMaxTokens() {
    return maxTokens;
  }

  public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
  }

  public CreateChatCompletionRequest presencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
    return this;
  }

  /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
   * minimum: -2
   * maximum: 2
   * @return presencePenalty
   **/
  @JsonProperty(value = "presence_penalty")
  @ApiModelProperty(value = "Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) ")
  @Valid  @DecimalMin("-2") @DecimalMax("2")
  public BigDecimal getPresencePenalty() {
    return presencePenalty;
  }

  public void setPresencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
  }

  public CreateChatCompletionRequest frequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
    return this;
  }

  /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
   * minimum: -2
   * maximum: 2
   * @return frequencyPenalty
   **/
  @JsonProperty(value = "frequency_penalty")
  @ApiModelProperty(value = "Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) ")
  @Valid  @DecimalMin("-2") @DecimalMax("2")
  public BigDecimal getFrequencyPenalty() {
    return frequencyPenalty;
  }

  public void setFrequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
  }

  public CreateChatCompletionRequest logitBias(Object logitBias) {
    this.logitBias = logitBias;
    return this;
  }

  /**
   * Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
   * @return logitBias
   **/
  @JsonProperty(value = "logit_bias")
  @ApiModelProperty(value = "Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. ")
  
  public Object getLogitBias() {
    return logitBias;
  }

  public void setLogitBias(Object logitBias) {
    this.logitBias = logitBias;
  }

  public CreateChatCompletionRequest user(String user) {
    this.user = user;
    return this;
  }

  /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   * @return user
   **/
  @JsonProperty(value = "user")
  @ApiModelProperty(example = "user-1234", value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
  
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

