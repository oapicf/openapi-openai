namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.bool option
open OpenAPI.Model.string option

module UsageCompletionsResult =

  //#region UsageCompletionsResult

  //#region enums
  type ObjectEnum = OrganizationUsageCompletionsResultEnum of string  
  //#endregion

  type UsageCompletionsResult = {
    Object : ObjectEnum;
    InputTokens : int;
    InputCachedTokens : int;
    OutputTokens : int;
    InputAudioTokens : int;
    OutputAudioTokens : int;
    NumModelRequests : int;
    ProjectId : string option;
    UserId : string option;
    ApiKeyId : string option;
    Model : string option;
    Batch : bool option;
  }
  //#endregion
