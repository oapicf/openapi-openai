namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreateCompletionRequestModel
open OpenAPI.Model.CreateCompletionRequestPrompt
open OpenAPI.Model.CreateCompletionRequestStop
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CreateCompletionRequest =

  //#region CreateCompletionRequest


  type CreateCompletionRequest = {
    Model : CreateCompletionRequestModel;
    Prompt : CreateCompletionRequestPrompt;
    Suffix : string option;
    MaxTokens : int option;
    Temperature : decimal option;
    TopP : decimal option;
    N : int option;
    Stream : bool option;
    Logprobs : int option;
    Echo : bool option;
    Stop : CreateCompletionRequestStop;
    PresencePenalty : decimal option;
    FrequencyPenalty : decimal option;
    BestOf : int option;
    LogitBias : obj;
    User : string;
  }
  //#endregion
