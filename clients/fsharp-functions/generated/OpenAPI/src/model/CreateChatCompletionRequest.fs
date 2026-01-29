namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionFunctions
open OpenAPI.Model.ChatCompletionRequestMessage
open OpenAPI.Model.ChatCompletionTool
open OpenAPI.Model.ChatCompletionToolChoiceOption
open OpenAPI.Model.CreateChatCompletionRequestFunctionCall
open OpenAPI.Model.CreateChatCompletionRequestModel
open OpenAPI.Model.CreateChatCompletionRequestResponseFormat
open OpenAPI.Model.CreateChatCompletionRequestStop
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open System.Collections.Generic

module CreateChatCompletionRequest =

  //#region CreateChatCompletionRequest

  [<CLIMutable>]
  type CreateChatCompletionRequest = {
    [<JsonProperty(PropertyName = "messages")>]
    Messages : ChatCompletionRequestMessage[];
    [<JsonProperty(PropertyName = "model")>]
    Model : CreateChatCompletionRequestModel;
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
    [<JsonProperty(PropertyName = "n")>]
    N : int option;
    [<JsonProperty(PropertyName = "presence_penalty")>]
    PresencePenalty : decimal option;
    [<JsonProperty(PropertyName = "response_format")>]
    ResponseFormat : CreateChatCompletionRequestResponseFormat;
    [<JsonProperty(PropertyName = "seed")>]
    Seed : int option;
    [<JsonProperty(PropertyName = "stop")>]
    Stop : CreateChatCompletionRequestStop;
    [<JsonProperty(PropertyName = "stream")>]
    Stream : bool option;
    [<JsonProperty(PropertyName = "temperature")>]
    Temperature : decimal option;
    [<JsonProperty(PropertyName = "top_p")>]
    TopP : decimal option;
    [<JsonProperty(PropertyName = "tools")>]
    Tools : ChatCompletionTool[];
    [<JsonProperty(PropertyName = "tool_choice")>]
    ToolChoice : ChatCompletionToolChoiceOption;
    [<JsonProperty(PropertyName = "user")>]
    User : string;
    [<JsonProperty(PropertyName = "function_call")>]
    FunctionCall : CreateChatCompletionRequestFunctionCall;
    [<JsonProperty(PropertyName = "functions")>]
    Functions : ChatCompletionFunctions[];
  }

  //#endregion
