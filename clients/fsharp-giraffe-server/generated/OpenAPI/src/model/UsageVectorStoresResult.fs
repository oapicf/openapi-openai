namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module UsageVectorStoresResult =

  //#region UsageVectorStoresResult

  //#region enums
  type ObjectEnum = OrganizationUsageVectorStoresResultEnum of string  
  //#endregion

  type UsageVectorStoresResult = {
    Object : ObjectEnum;
    UsageBytes : int;
    ProjectId : string option;
  }
  //#endregion
