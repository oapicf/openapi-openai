namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionFunctions
open OpenAPI.Model.ChatCompletionRequestMessage
open OpenAPI.Model.ChatCompletionStreamOptions
open OpenAPI.Model.ChatCompletionTool
open OpenAPI.Model.ChatCompletionToolChoiceOption
open OpenAPI.Model.CreateChatCompletionRequestAudio
open OpenAPI.Model.CreateChatCompletionRequestFunctionCall
open OpenAPI.Model.CreateChatCompletionRequestModel
open OpenAPI.Model.CreateChatCompletionRequestResponseFormat
open OpenAPI.Model.CreateChatCompletionRequestStop
open OpenAPI.Model.PredictionContent
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option
open System.Collections.Generic

module CreateChatCompletionRequest =

  //#region CreateChatCompletionRequest

  [<CLIMutable>]
  type CreateChatCompletionRequest = {
    [<JsonProperty(PropertyName = "messages")>]
    Messages : ChatCompletionRequestMessage[];
    [<JsonProperty(PropertyName = "model")>]
    Model : CreateChatCompletionRequestModel;
    [<JsonProperty(PropertyName = "store")>]
    Store : bool option;
    [<JsonProperty(PropertyName = "reasoning_effort")>]
    ReasoningEffort : string;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : IDictionary<string, string>;
    [<JsonProperty(PropertyName = "frequency_penalty")>]
    FrequencyPenalty : decimal option;
    [<JsonProperty(PropertyName = "logit_bias")>]
    LogitBias : IDictionary<string, int>;
    [<JsonProperty(PropertyName = "logprobs")>]
    Logprobs : bool option;
    [<JsonProperty(PropertyName = "top_logprobs")>]
    TopLogprobs : int option;
    [<JsonProperty(PropertyName = "max_tokens")>]
    MaxTokens : int option;
    [<JsonProperty(PropertyName = "max_completion_tokens")>]
    MaxCompletionTokens : int option;
    [<JsonProperty(PropertyName = "n")>]
    N : int option;
    [<JsonProperty(PropertyName = "modalities")>]
    Modalities : string[];
    [<JsonProperty(PropertyName = "prediction")>]
    Prediction : PredictionContent;
    [<JsonProperty(PropertyName = "audio")>]
    Audio : CreateChatCompletionRequestAudio;
    [<JsonProperty(PropertyName = "presence_penalty")>]
    PresencePenalty : decimal option;
    [<JsonProperty(PropertyName = "response_format")>]
    ResponseFormat : CreateChatCompletionRequestResponseFormat;
    [<JsonProperty(PropertyName = "seed")>]
    Seed : int option;
    [<JsonProperty(PropertyName = "service_tier")>]
    ServiceTier : string option;
    [<JsonProperty(PropertyName = "stop")>]
    Stop : CreateChatCompletionRequestStop;
    [<JsonProperty(PropertyName = "stream")>]
    Stream : bool option;
    [<JsonProperty(PropertyName = "stream_options")>]
    StreamOptions : ChatCompletionStreamOptions;
    [<JsonProperty(PropertyName = "temperature")>]
    Temperature : decimal option;
    [<JsonProperty(PropertyName = "top_p")>]
    TopP : decimal option;
    [<JsonProperty(PropertyName = "tools")>]
    Tools : ChatCompletionTool[];
    [<JsonProperty(PropertyName = "tool_choice")>]
    ToolChoice : ChatCompletionToolChoiceOption;
    [<JsonProperty(PropertyName = "parallel_tool_calls")>]
    ParallelToolCalls : bool;
    [<JsonProperty(PropertyName = "user")>]
    User : string;
    [<JsonProperty(PropertyName = "function_call")>]
    FunctionCall : CreateChatCompletionRequestFunctionCall;
    [<JsonProperty(PropertyName = "functions")>]
    Functions : ChatCompletionFunctions[];
  }

  //#endregion
