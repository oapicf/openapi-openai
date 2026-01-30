namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantObjectToolsInner
open OpenAPI.Model.AssistantsApiResponseFormatOption
open OpenAPI.Model.AssistantsApiToolChoiceOption
open OpenAPI.Model.RunCompletionUsage
open OpenAPI.Model.RunObjectIncompleteDetails
open OpenAPI.Model.RunObjectLastError
open OpenAPI.Model.RunObjectRequiredAction
open OpenAPI.Model.TruncationObject
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option

module RunObject =

  //#region RunObject

  //#region enums
  type ObjectEnum = ThreadRunEnum of string  
  //#endregion
  //#region enums
  type StatusEnum = QueuedEnum of string  |  InProgressEnum of string  |  RequiresActionEnum of string  |  CancellingEnum of string  |  CancelledEnum of string  |  FailedEnum of string  |  CompletedEnum of string  |  IncompleteEnum of string  |  ExpiredEnum of string  
  //#endregion

  type RunObject = {
    Id : string;
    Object : ObjectEnum;
    CreatedAt : int;
    ThreadId : string;
    AssistantId : string;
    Status : StatusEnum;
    RequiredAction : RunObjectRequiredAction;
    LastError : RunObjectLastError;
    ExpiresAt : int option;
    StartedAt : int option;
    CancelledAt : int option;
    FailedAt : int option;
    CompletedAt : int option;
    IncompleteDetails : RunObjectIncompleteDetails;
    Model : string;
    Instructions : string;
    Tools : AssistantObjectToolsInner[];
    Metadata : obj;
    Usage : RunCompletionUsage;
    Temperature : decimal option;
    TopP : decimal option;
    MaxPromptTokens : int option;
    MaxCompletionTokens : int option;
    TruncationStrategy : TruncationObject;
    ToolChoice : AssistantsApiToolChoiceOption;
    ParallelToolCalls : bool;
    ResponseFormat : AssistantsApiResponseFormatOption;
  }
  //#endregion
