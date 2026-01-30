namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module UsageCodeInterpreterSessionsResult =

  //#region UsageCodeInterpreterSessionsResult

  //#region enums
  type ObjectEnum = OrganizationUsageCodeInterpreterSessionsResultEnum of string  
  //#endregion

  type UsageCodeInterpreterSessionsResult = {
    Object : ObjectEnum;
    Sessions : int;
    ProjectId : string option;
  }
  //#endregion
