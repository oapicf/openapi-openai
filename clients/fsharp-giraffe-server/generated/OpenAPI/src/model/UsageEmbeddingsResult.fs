namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module UsageEmbeddingsResult =

  //#region UsageEmbeddingsResult

  //#region enums
  type ObjectEnum = OrganizationUsageEmbeddingsResultEnum of string  
  //#endregion

  type UsageEmbeddingsResult = {
    Object : ObjectEnum;
    InputTokens : int;
    NumModelRequests : int;
    ProjectId : string option;
    UserId : string option;
    ApiKeyId : string option;
    Model : string option;
  }
  //#endregion
