namespace OpenAPI.Model

open System
open System.Collections.Generic

module ProjectServiceAccountDeleteResponse =

  //#region ProjectServiceAccountDeleteResponse

  //#region enums
  type ObjectEnum = OrganizationProjectServiceAccountDeletedEnum of string  
  //#endregion

  type ProjectServiceAccountDeleteResponse = {
    Object : ObjectEnum;
    Id : string;
    Deleted : bool;
  }
  //#endregion
