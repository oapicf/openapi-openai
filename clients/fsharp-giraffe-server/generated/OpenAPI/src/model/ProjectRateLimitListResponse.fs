namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ProjectRateLimit

module ProjectRateLimitListResponse =

  //#region ProjectRateLimitListResponse

  //#region enums
  type ObjectEnum = ListEnum of string  
  //#endregion

  type ProjectRateLimitListResponse = {
    Object : ObjectEnum;
    Data : ProjectRateLimit[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
