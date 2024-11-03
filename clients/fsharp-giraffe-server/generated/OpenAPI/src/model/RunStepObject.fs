namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepCompletionUsage
open OpenAPI.Model.RunStepObjectLastError
open OpenAPI.Model.RunStepObjectStepDetails
open OpenAPI.Model.int option

module RunStepObject =

  //#region RunStepObject

  //#region enums
  type ObjectEnum = ThreadRunStepEnum of string  
  //#endregion
  //#region enums
  type TypeEnum = MessageCreationEnum of string  |  ToolCallsEnum of string  
  //#endregion
  //#region enums
  type StatusEnum = InProgressEnum of string  |  CancelledEnum of string  |  FailedEnum of string  |  CompletedEnum of string  |  ExpiredEnum of string  
  //#endregion

  type RunStepObject = {
    Id : string;
    Object : ObjectEnum;
    CreatedAt : int;
    AssistantId : string;
    ThreadId : string;
    RunId : string;
    Type : TypeEnum;
    Status : StatusEnum;
    StepDetails : RunStepObjectStepDetails;
    LastError : RunStepObjectLastError;
    ExpiredAt : int option;
    CancelledAt : int option;
    FailedAt : int option;
    CompletedAt : int option;
    Metadata : obj;
    Usage : RunStepCompletionUsage;
  }
  //#endregion
