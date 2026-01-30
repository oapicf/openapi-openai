namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchErrors
open OpenAPI.Model.BatchRequestCounts

module Batch =

  //#region Batch

  //#region enums
  type ObjectEnum = BatchEnum of string  
  //#endregion
  //#region enums
  type StatusEnum = ValidatingEnum of string  |  FailedEnum of string  |  InProgressEnum of string  |  FinalizingEnum of string  |  CompletedEnum of string  |  ExpiredEnum of string  |  CancellingEnum of string  |  CancelledEnum of string  
  //#endregion

  type Batch = {
    Id : string;
    Object : ObjectEnum;
    Endpoint : string;
    Errors : BatchErrors;
    InputFileId : string;
    CompletionWindow : string;
    Status : StatusEnum;
    OutputFileId : string;
    ErrorFileId : string;
    CreatedAt : int;
    InProgressAt : int;
    ExpiresAt : int;
    FinalizingAt : int;
    CompletedAt : int;
    FailedAt : int;
    ExpiredAt : int;
    CancellingAt : int;
    CancelledAt : int;
    RequestCounts : BatchRequestCounts;
    Metadata : obj;
  }
  //#endregion
