namespace OpenAPI.Model

open System
open System.Collections.Generic
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


  type CreateChatCompletionRequest = {
    Messages : ChatCompletionRequestMessage[];
    Model : CreateChatCompletionRequestModel;
    FrequencyPenalty : decimal option;
    LogitBias : IDictionary<string, int>;
    Logprobs : bool option;
    TopLogprobs : int option;
    MaxTokens : int option;
    N : int option;
    PresencePenalty : decimal option;
    ResponseFormat : CreateChatCompletionRequestResponseFormat;
    Seed : int option;
    Stop : CreateChatCompletionRequestStop;
    Stream : bool option;
    Temperature : decimal option;
    TopP : decimal option;
    Tools : ChatCompletionTool[];
    ToolChoice : ChatCompletionToolChoiceOption;
    User : string;
    FunctionCall : CreateChatCompletionRequestFunctionCall;
    Functions : ChatCompletionFunctions[];
  }
  //#endregion
