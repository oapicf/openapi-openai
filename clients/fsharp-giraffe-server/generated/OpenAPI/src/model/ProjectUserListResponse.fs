namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ProjectUser

module ProjectUserListResponse =

  //#region ProjectUserListResponse


  type ProjectUserListResponse = {
    Object : string;
    Data : ProjectUser[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
