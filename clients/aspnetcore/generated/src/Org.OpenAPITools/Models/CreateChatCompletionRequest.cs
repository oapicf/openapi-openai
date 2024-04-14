/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class CreateChatCompletionRequest : IEquatable<CreateChatCompletionRequest>
    {
        /// <summary>
        /// A list of messages comprising the conversation so far. [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models).
        /// </summary>
        /// <value>A list of messages comprising the conversation so far. [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models).</value>
        [Required]
        [DataMember(Name="messages", EmitDefaultValue=false)]
        public List<ChatCompletionRequestMessage> Messages { get; set; }

        /// <summary>
        /// Gets or Sets Model
        /// </summary>
        [Required]
        [DataMember(Name="model", EmitDefaultValue=false)]
        public CreateChatCompletionRequestModel Model { get; set; }

        /// <summary>
        /// Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
        /// </summary>
        /// <value>Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) </value>
        [Range(-2, 2)]
        [DataMember(Name="frequency_penalty", EmitDefaultValue=true)]
        public decimal? FrequencyPenalty { get; set; } = 0M;

        /// <summary>
        /// Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
        /// </summary>
        /// <value>Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. </value>
        [DataMember(Name="logit_bias", EmitDefaultValue=true)]
        public Dictionary<string, int> LogitBias { get; set; }

        /// <summary>
        /// Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the &#x60;content&#x60; of &#x60;message&#x60;.
        /// </summary>
        /// <value>Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the &#x60;content&#x60; of &#x60;message&#x60;.</value>
        [DataMember(Name="logprobs", EmitDefaultValue=true)]
        public bool? Logprobs { get; set; } = false;

        /// <summary>
        /// An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. &#x60;logprobs&#x60; must be set to &#x60;true&#x60; if this parameter is used.
        /// </summary>
        /// <value>An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. &#x60;logprobs&#x60; must be set to &#x60;true&#x60; if this parameter is used.</value>
        [Range(0, 20)]
        [DataMember(Name="top_logprobs", EmitDefaultValue=true)]
        public int? TopLogprobs { get; set; }

        /// <summary>
        /// The maximum number of [tokens](/tokenizer) that can be generated in the chat completion.  The total length of input tokens and generated tokens is limited by the model&#39;s context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
        /// </summary>
        /// <value>The maximum number of [tokens](/tokenizer) that can be generated in the chat completion.  The total length of input tokens and generated tokens is limited by the model&#39;s context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. </value>
        [DataMember(Name="max_tokens", EmitDefaultValue=true)]
        public int? MaxTokens { get; set; }

        /// <summary>
        /// How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep &#x60;n&#x60; as &#x60;1&#x60; to minimize costs.
        /// </summary>
        /// <value>How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep &#x60;n&#x60; as &#x60;1&#x60; to minimize costs.</value>
        /// <example>1</example>
        [Range(1, 128)]
        [DataMember(Name="n", EmitDefaultValue=true)]
        public int? N { get; set; } = 1;

        /// <summary>
        /// Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
        /// </summary>
        /// <value>Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) </value>
        [Range(-2, 2)]
        [DataMember(Name="presence_penalty", EmitDefaultValue=true)]
        public decimal? PresencePenalty { get; set; } = 0M;

        /// <summary>
        /// Gets or Sets ResponseFormat
        /// </summary>
        [DataMember(Name="response_format", EmitDefaultValue=false)]
        public CreateChatCompletionRequestResponseFormat ResponseFormat { get; set; }

        /// <summary>
        /// This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same &#x60;seed&#x60; and parameters should return the same result. Determinism is not guaranteed, and you should refer to the &#x60;system_fingerprint&#x60; response parameter to monitor changes in the backend. 
        /// </summary>
        /// <value>This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same &#x60;seed&#x60; and parameters should return the same result. Determinism is not guaranteed, and you should refer to the &#x60;system_fingerprint&#x60; response parameter to monitor changes in the backend. </value>
        [Range(-9223372036854775808, 9223372036854775807)]
        [DataMember(Name="seed", EmitDefaultValue=true)]
        public int? Seed { get; set; }

        /// <summary>
        /// Gets or Sets Stop
        /// </summary>
        [DataMember(Name="stop", EmitDefaultValue=false)]
        public CreateChatCompletionRequestStop Stop { get; set; }

        /// <summary>
        /// If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
        /// </summary>
        /// <value>If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). </value>
        [DataMember(Name="stream", EmitDefaultValue=true)]
        public bool? Stream { get; set; } = false;

        /// <summary>
        /// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. 
        /// </summary>
        /// <value>What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. </value>
        /// <example>1</example>
        [Range(0, 2)]
        [DataMember(Name="temperature", EmitDefaultValue=true)]
        public decimal? Temperature { get; set; } = 1M;

        /// <summary>
        /// An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. 
        /// </summary>
        /// <value>An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. </value>
        /// <example>1</example>
        [Range(0, 1)]
        [DataMember(Name="top_p", EmitDefaultValue=true)]
        public decimal? TopP { get; set; } = 1M;

        /// <summary>
        /// A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. 
        /// </summary>
        /// <value>A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. </value>
        [DataMember(Name="tools", EmitDefaultValue=false)]
        public List<ChatCompletionTool> Tools { get; set; }

        /// <summary>
        /// Gets or Sets ToolChoice
        /// </summary>
        [DataMember(Name="tool_choice", EmitDefaultValue=false)]
        public ChatCompletionToolChoiceOption ToolChoice { get; set; }

        /// <summary>
        /// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
        /// </summary>
        /// <value>A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). </value>
        /// <example>user-1234</example>
        [DataMember(Name="user", EmitDefaultValue=false)]
        public string User { get; set; }

        /// <summary>
        /// Gets or Sets FunctionCall
        /// </summary>
        [DataMember(Name="function_call", EmitDefaultValue=false)]
        public CreateChatCompletionRequestFunctionCall FunctionCall { get; set; }

        /// <summary>
        /// Deprecated in favor of &#x60;tools&#x60;.  A list of functions the model may generate JSON inputs for. 
        /// </summary>
        /// <value>Deprecated in favor of &#x60;tools&#x60;.  A list of functions the model may generate JSON inputs for. </value>
        [DataMember(Name="functions", EmitDefaultValue=false)]
        public List<ChatCompletionFunctions> Functions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateChatCompletionRequest {\n");
            sb.Append("  Messages: ").Append(Messages).Append("\n");
            sb.Append("  Model: ").Append(Model).Append("\n");
            sb.Append("  FrequencyPenalty: ").Append(FrequencyPenalty).Append("\n");
            sb.Append("  LogitBias: ").Append(LogitBias).Append("\n");
            sb.Append("  Logprobs: ").Append(Logprobs).Append("\n");
            sb.Append("  TopLogprobs: ").Append(TopLogprobs).Append("\n");
            sb.Append("  MaxTokens: ").Append(MaxTokens).Append("\n");
            sb.Append("  N: ").Append(N).Append("\n");
            sb.Append("  PresencePenalty: ").Append(PresencePenalty).Append("\n");
            sb.Append("  ResponseFormat: ").Append(ResponseFormat).Append("\n");
            sb.Append("  Seed: ").Append(Seed).Append("\n");
            sb.Append("  Stop: ").Append(Stop).Append("\n");
            sb.Append("  Stream: ").Append(Stream).Append("\n");
            sb.Append("  Temperature: ").Append(Temperature).Append("\n");
            sb.Append("  TopP: ").Append(TopP).Append("\n");
            sb.Append("  Tools: ").Append(Tools).Append("\n");
            sb.Append("  ToolChoice: ").Append(ToolChoice).Append("\n");
            sb.Append("  User: ").Append(User).Append("\n");
            sb.Append("  FunctionCall: ").Append(FunctionCall).Append("\n");
            sb.Append("  Functions: ").Append(Functions).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((CreateChatCompletionRequest)obj);
        }

        /// <summary>
        /// Returns true if CreateChatCompletionRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of CreateChatCompletionRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateChatCompletionRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Messages == other.Messages ||
                    Messages != null &&
                    other.Messages != null &&
                    Messages.SequenceEqual(other.Messages)
                ) && 
                (
                    Model == other.Model ||
                    Model != null &&
                    Model.Equals(other.Model)
                ) && 
                (
                    FrequencyPenalty == other.FrequencyPenalty ||
                    FrequencyPenalty != null &&
                    FrequencyPenalty.Equals(other.FrequencyPenalty)
                ) && 
                (
                    LogitBias == other.LogitBias ||
                    LogitBias != null &&
                    other.LogitBias != null &&
                    LogitBias.SequenceEqual(other.LogitBias)
                ) && 
                (
                    Logprobs == other.Logprobs ||
                    Logprobs != null &&
                    Logprobs.Equals(other.Logprobs)
                ) && 
                (
                    TopLogprobs == other.TopLogprobs ||
                    TopLogprobs != null &&
                    TopLogprobs.Equals(other.TopLogprobs)
                ) && 
                (
                    MaxTokens == other.MaxTokens ||
                    MaxTokens != null &&
                    MaxTokens.Equals(other.MaxTokens)
                ) && 
                (
                    N == other.N ||
                    N != null &&
                    N.Equals(other.N)
                ) && 
                (
                    PresencePenalty == other.PresencePenalty ||
                    PresencePenalty != null &&
                    PresencePenalty.Equals(other.PresencePenalty)
                ) && 
                (
                    ResponseFormat == other.ResponseFormat ||
                    ResponseFormat != null &&
                    ResponseFormat.Equals(other.ResponseFormat)
                ) && 
                (
                    Seed == other.Seed ||
                    Seed != null &&
                    Seed.Equals(other.Seed)
                ) && 
                (
                    Stop == other.Stop ||
                    Stop != null &&
                    Stop.Equals(other.Stop)
                ) && 
                (
                    Stream == other.Stream ||
                    Stream != null &&
                    Stream.Equals(other.Stream)
                ) && 
                (
                    Temperature == other.Temperature ||
                    Temperature != null &&
                    Temperature.Equals(other.Temperature)
                ) && 
                (
                    TopP == other.TopP ||
                    TopP != null &&
                    TopP.Equals(other.TopP)
                ) && 
                (
                    Tools == other.Tools ||
                    Tools != null &&
                    other.Tools != null &&
                    Tools.SequenceEqual(other.Tools)
                ) && 
                (
                    ToolChoice == other.ToolChoice ||
                    ToolChoice != null &&
                    ToolChoice.Equals(other.ToolChoice)
                ) && 
                (
                    User == other.User ||
                    User != null &&
                    User.Equals(other.User)
                ) && 
                (
                    FunctionCall == other.FunctionCall ||
                    FunctionCall != null &&
                    FunctionCall.Equals(other.FunctionCall)
                ) && 
                (
                    Functions == other.Functions ||
                    Functions != null &&
                    other.Functions != null &&
                    Functions.SequenceEqual(other.Functions)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (Messages != null)
                    hashCode = hashCode * 59 + Messages.GetHashCode();
                    if (Model != null)
                    hashCode = hashCode * 59 + Model.GetHashCode();
                    if (FrequencyPenalty != null)
                    hashCode = hashCode * 59 + FrequencyPenalty.GetHashCode();
                    if (LogitBias != null)
                    hashCode = hashCode * 59 + LogitBias.GetHashCode();
                    if (Logprobs != null)
                    hashCode = hashCode * 59 + Logprobs.GetHashCode();
                    if (TopLogprobs != null)
                    hashCode = hashCode * 59 + TopLogprobs.GetHashCode();
                    if (MaxTokens != null)
                    hashCode = hashCode * 59 + MaxTokens.GetHashCode();
                    if (N != null)
                    hashCode = hashCode * 59 + N.GetHashCode();
                    if (PresencePenalty != null)
                    hashCode = hashCode * 59 + PresencePenalty.GetHashCode();
                    if (ResponseFormat != null)
                    hashCode = hashCode * 59 + ResponseFormat.GetHashCode();
                    if (Seed != null)
                    hashCode = hashCode * 59 + Seed.GetHashCode();
                    if (Stop != null)
                    hashCode = hashCode * 59 + Stop.GetHashCode();
                    if (Stream != null)
                    hashCode = hashCode * 59 + Stream.GetHashCode();
                    if (Temperature != null)
                    hashCode = hashCode * 59 + Temperature.GetHashCode();
                    if (TopP != null)
                    hashCode = hashCode * 59 + TopP.GetHashCode();
                    if (Tools != null)
                    hashCode = hashCode * 59 + Tools.GetHashCode();
                    if (ToolChoice != null)
                    hashCode = hashCode * 59 + ToolChoice.GetHashCode();
                    if (User != null)
                    hashCode = hashCode * 59 + User.GetHashCode();
                    if (FunctionCall != null)
                    hashCode = hashCode * 59 + FunctionCall.GetHashCode();
                    if (Functions != null)
                    hashCode = hashCode * 59 + Functions.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CreateChatCompletionRequest left, CreateChatCompletionRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CreateChatCompletionRequest left, CreateChatCompletionRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
