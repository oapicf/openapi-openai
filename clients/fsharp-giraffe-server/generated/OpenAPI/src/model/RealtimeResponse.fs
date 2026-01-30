namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RealtimeConversationItem
open OpenAPI.Model.RealtimeResponseStatusDetails
open OpenAPI.Model.RealtimeResponseUsage

module RealtimeResponse =

  //#region RealtimeResponse

  //#region enums
  type ObjectEnum = RealtimeResponseEnum of string  
  //#endregion
  //#region enums
  type StatusEnum = CompletedEnum of string  |  CancelledEnum of string  |  FailedEnum of string  |  IncompleteEnum of string  
  //#endregion

  type RealtimeResponse = {
    Id : string;
    Object : ObjectEnum;
    Status : StatusEnum;
    StatusDetails : RealtimeResponseStatusDetails;
    Output : RealtimeConversationItem[];
    Metadata : obj;
    Usage : RealtimeResponseUsage;
  }
  //#endregion
