namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Project

module ProjectListResponse =

  //#region ProjectListResponse

  //#region enums
  type ObjectEnum = ListEnum of string  
  //#endregion

  type ProjectListResponse = {
    Object : ObjectEnum;
    Data : Project[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
