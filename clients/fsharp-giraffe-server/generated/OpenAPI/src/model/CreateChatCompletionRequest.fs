namespace OpenAPI.Model

open System
open System.Collections.Generic
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


  type CreateChatCompletionRequest = {
    Model : CreateChatCompletionRequestModel;
    Messages : ChatCompletionRequestMessage[];
    Functions : ChatCompletionFunctions[];
    FunctionCall : CreateChatCompletionRequestFunctionCall;
    Temperature : decimal option;
    TopP : decimal option;
    N : int option;
    Stream : bool option;
    Stop : CreateChatCompletionRequestStop;
    MaxTokens : int;
    PresencePenalty : decimal option;
    FrequencyPenalty : decimal option;
    LogitBias : obj;
    User : string;
  }
  //#endregion
