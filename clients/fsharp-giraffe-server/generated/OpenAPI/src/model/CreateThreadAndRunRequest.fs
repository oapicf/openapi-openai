namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantsApiResponseFormatOption
open OpenAPI.Model.AssistantsApiToolChoiceOption
open OpenAPI.Model.CreateRunRequestModel
open OpenAPI.Model.CreateThreadAndRunRequestToolResources
open OpenAPI.Model.CreateThreadAndRunRequestToolsInner
open OpenAPI.Model.CreateThreadRequest
open OpenAPI.Model.TruncationObject
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CreateThreadAndRunRequest =

  //#region CreateThreadAndRunRequest


  type CreateThreadAndRunRequest = {
    AssistantId : string;
    Thread : CreateThreadRequest;
    Model : CreateRunRequestModel;
    Instructions : string option;
    Tools : CreateThreadAndRunRequestToolsInner[];
    ToolResources : CreateThreadAndRunRequestToolResources;
    Metadata : obj;
    Temperature : decimal option;
    TopP : decimal option;
    Stream : bool option;
    MaxPromptTokens : int option;
    MaxCompletionTokens : int option;
    TruncationStrategy : TruncationObject;
    ToolChoice : AssistantsApiToolChoiceOption;
    ParallelToolCalls : bool;
    ResponseFormat : AssistantsApiResponseFormatOption;
  }
  //#endregion
