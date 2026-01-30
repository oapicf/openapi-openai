namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module UsageImagesResult =

  //#region UsageImagesResult

  //#region enums
  type ObjectEnum = OrganizationUsageImagesResultEnum of string  
  //#endregion

  type UsageImagesResult = {
    Object : ObjectEnum;
    Images : int;
    NumModelRequests : int;
    Source : string option;
    Size : string option;
    ProjectId : string option;
    UserId : string option;
    ApiKeyId : string option;
    Model : string option;
  }
  //#endregion
