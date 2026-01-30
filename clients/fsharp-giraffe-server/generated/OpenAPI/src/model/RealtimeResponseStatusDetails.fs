namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeResponseStatusDetailsError

module RealtimeResponseStatusDetails =

  //#region RealtimeResponseStatusDetails

  //#region enums
  type TypeEnum = CompletedEnum of string  |  CancelledEnum of string  |  FailedEnum of string  |  IncompleteEnum of string  
  //#endregion
  //#region enums
  type ReasonEnum = TurnDetectedEnum of string  |  ClientCancelledEnum of string  |  MaxOutputTokensEnum of string  |  ContentFilterEnum of string  
  //#endregion

  type RealtimeResponse_status_details = {
    Type : TypeEnum;
    Reason : ReasonEnum;
    Error : RealtimeResponseStatusDetailsError;
  }
  //#endregion
