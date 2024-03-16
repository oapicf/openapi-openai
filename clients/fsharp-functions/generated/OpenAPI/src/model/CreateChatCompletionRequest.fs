namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionFunctions
open OpenAPI.Model.ChatCompletionRequestMessage
open OpenAPI.Model.CreateChatCompletionRequestFunctionCall
open OpenAPI.Model.CreateChatCompletionRequestModel
open OpenAPI.Model.CreateChatCompletionRequestStop
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option

module CreateChatCompletionRequest =

  //#region CreateChatCompletionRequest

  [<CLIMutable>]
  type CreateChatCompletionRequest = {
    [<JsonProperty(PropertyName = "model")>]
    Model : CreateChatCompletionRequestModel;
    [<JsonProperty(PropertyName = "messages")>]
    Messages : ChatCompletionRequestMessage[];
    [<JsonProperty(PropertyName = "functions")>]
    Functions : ChatCompletionFunctions[];
    [<JsonProperty(PropertyName = "function_call")>]
    FunctionCall : CreateChatCompletionRequestFunctionCall;
    [<JsonProperty(PropertyName = "temperature")>]
    Temperature : decimal option;
    [<JsonProperty(PropertyName = "top_p")>]
    TopP : decimal option;
    [<JsonProperty(PropertyName = "n")>]
    N : int option;
    [<JsonProperty(PropertyName = "stream")>]
    Stream : bool option;
    [<JsonProperty(PropertyName = "stop")>]
    Stop : CreateChatCompletionRequestStop;
    [<JsonProperty(PropertyName = "max_tokens")>]
    MaxTokens : int;
    [<JsonProperty(PropertyName = "presence_penalty")>]
    PresencePenalty : decimal option;
    [<JsonProperty(PropertyName = "frequency_penalty")>]
    FrequencyPenalty : decimal option;
    [<JsonProperty(PropertyName = "logit_bias")>]
    LogitBias : obj;
    [<JsonProperty(PropertyName = "user")>]
    User : string;
  }

  //#endregion
