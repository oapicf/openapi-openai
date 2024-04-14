namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateCompletionRequestModel
open OpenAPI.Model.CreateCompletionRequestPrompt
open OpenAPI.Model.CreateCompletionRequestStop
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option
open System.Collections.Generic

module CreateCompletionRequest =

  //#region CreateCompletionRequest

  [<CLIMutable>]
  type CreateCompletionRequest = {
    [<JsonProperty(PropertyName = "model")>]
    Model : CreateCompletionRequestModel;
    [<JsonProperty(PropertyName = "prompt")>]
    Prompt : CreateCompletionRequestPrompt;
    [<JsonProperty(PropertyName = "best_of")>]
    BestOf : int option;
    [<JsonProperty(PropertyName = "echo")>]
    Echo : bool option;
    [<JsonProperty(PropertyName = "frequency_penalty")>]
    FrequencyPenalty : decimal option;
    [<JsonProperty(PropertyName = "logit_bias")>]
    LogitBias : IDictionary<string, int>;
    [<JsonProperty(PropertyName = "logprobs")>]
    Logprobs : int option;
    [<JsonProperty(PropertyName = "max_tokens")>]
    MaxTokens : int option;
    [<JsonProperty(PropertyName = "n")>]
    N : int option;
    [<JsonProperty(PropertyName = "presence_penalty")>]
    PresencePenalty : decimal option;
    [<JsonProperty(PropertyName = "seed")>]
    Seed : int option;
    [<JsonProperty(PropertyName = "stop")>]
    Stop : CreateCompletionRequestStop;
    [<JsonProperty(PropertyName = "stream")>]
    Stream : bool option;
    [<JsonProperty(PropertyName = "suffix")>]
    Suffix : string option;
    [<JsonProperty(PropertyName = "temperature")>]
    Temperature : decimal option;
    [<JsonProperty(PropertyName = "top_p")>]
    TopP : decimal option;
    [<JsonProperty(PropertyName = "user")>]
    User : string;
  }

  //#endregion
