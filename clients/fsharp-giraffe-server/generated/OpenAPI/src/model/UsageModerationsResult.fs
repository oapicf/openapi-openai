namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module UsageModerationsResult =

  //#region UsageModerationsResult

  //#region enums
  type ObjectEnum = OrganizationUsageModerationsResultEnum of string  
  //#endregion

  type UsageModerationsResult = {
    Object : ObjectEnum;
    InputTokens : int;
    NumModelRequests : int;
    ProjectId : string option;
    UserId : string option;
    ApiKeyId : string option;
    Model : string option;
  }
  //#endregion
