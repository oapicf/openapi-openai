namespace OpenAPI.Model

open System
open System.Collections.Generic
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

  //#region enums
  type ReasoningEffortEnum = LowEnum of string  |  MediumEnum of string  |  HighEnum of string  
  //#endregion
  //#region enums
  type ModalitiesEnum[] = TextEnum of string[]  |  AudioEnum of string[]  
  //#endregion
  //#region enums
  type ServiceTierEnum = AutoEnum of string option  |  DefaultEnum of string option  
  //#endregion

  type CreateChatCompletionRequest = {
    Messages : ChatCompletionRequestMessage[];
    Model : CreateChatCompletionRequestModel;
    Store : bool option;
    ReasoningEffort : ReasoningEffortEnum;
    Metadata : IDictionary<string, string>;
    FrequencyPenalty : decimal option;
    LogitBias : IDictionary<string, int>;
    Logprobs : bool option;
    TopLogprobs : int option;
    MaxTokens : int option;
    MaxCompletionTokens : int option;
    N : int option;
    Modalities : ModalitiesEnum[];
    Prediction : PredictionContent;
    Audio : CreateChatCompletionRequestAudio;
    PresencePenalty : decimal option;
    ResponseFormat : CreateChatCompletionRequestResponseFormat;
    Seed : int option;
    ServiceTier : ServiceTierEnum;
    Stop : CreateChatCompletionRequestStop;
    Stream : bool option;
    StreamOptions : ChatCompletionStreamOptions;
    Temperature : decimal option;
    TopP : decimal option;
    Tools : ChatCompletionTool[];
    ToolChoice : ChatCompletionToolChoiceOption;
    ParallelToolCalls : bool;
    User : string;
    FunctionCall : CreateChatCompletionRequestFunctionCall;
    Functions : ChatCompletionFunctions[];
  }
  //#endregion
