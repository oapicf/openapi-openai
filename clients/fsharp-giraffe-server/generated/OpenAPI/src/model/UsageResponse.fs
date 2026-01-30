namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UsageTimeBucket

module UsageResponse =

  //#region UsageResponse

  //#region enums
  type ObjectEnum = PageEnum of string  
  //#endregion

  type UsageResponse = {
    Object : ObjectEnum;
    Data : UsageTimeBucket[];
    HasMore : bool;
    NextPage : string;
  }
  //#endregion
