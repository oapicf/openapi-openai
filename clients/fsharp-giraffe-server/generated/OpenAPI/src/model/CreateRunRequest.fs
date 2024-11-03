namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantObjectToolsInner
open OpenAPI.Model.AssistantsApiResponseFormatOption
open OpenAPI.Model.AssistantsApiToolChoiceOption
open OpenAPI.Model.CreateMessageRequest
open OpenAPI.Model.CreateRunRequestModel
open OpenAPI.Model.TruncationObject
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module CreateRunRequest =

  //#region CreateRunRequest


  type CreateRunRequest = {
    AssistantId : string;
    Model : CreateRunRequestModel;
    Instructions : string option;
    AdditionalInstructions : string option;
    AdditionalMessages : CreateMessageRequest[];
    Tools : AssistantObjectToolsInner[];
    Metadata : obj;
    Temperature : decimal option;
    Stream : bool option;
    MaxPromptTokens : int option;
    MaxCompletionTokens : int option;
    TruncationStrategy : TruncationObject;
    ToolChoice : AssistantsApiToolChoiceOption;
    ResponseFormat : AssistantsApiResponseFormatOption;
  }
  //#endregion
