namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionStreamOptions
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


  type CreateCompletionRequest = {
    Model : CreateCompletionRequestModel;
    Prompt : CreateCompletionRequestPrompt;
    BestOf : int option;
    Echo : bool option;
    FrequencyPenalty : decimal option;
    LogitBias : IDictionary<string, int>;
    Logprobs : int option;
    MaxTokens : int option;
    N : int option;
    PresencePenalty : decimal option;
    Seed : int option;
    Stop : CreateCompletionRequestStop;
    Stream : bool option;
    StreamOptions : ChatCompletionStreamOptions;
    Suffix : string option;
    Temperature : decimal option;
    TopP : decimal option;
    User : string;
  }
  //#endregion
