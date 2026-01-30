namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module UsageAudioTranscriptionsResult =

  //#region UsageAudioTranscriptionsResult

  //#region enums
  type ObjectEnum = OrganizationUsageAudioTranscriptionsResultEnum of string  
  //#endregion

  type UsageAudioTranscriptionsResult = {
    Object : ObjectEnum;
    Seconds : int;
    NumModelRequests : int;
    ProjectId : string option;
    UserId : string option;
    ApiKeyId : string option;
    Model : string option;
  }
  //#endregion
