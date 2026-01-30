namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module UsageAudioSpeechesResult =

  //#region UsageAudioSpeechesResult

  //#region enums
  type ObjectEnum = OrganizationUsageAudioSpeechesResultEnum of string  
  //#endregion

  type UsageAudioSpeechesResult = {
    Object : ObjectEnum;
    Characters : int;
    NumModelRequests : int;
    ProjectId : string option;
    UserId : string option;
    ApiKeyId : string option;
    Model : string option;
  }
  //#endregion
