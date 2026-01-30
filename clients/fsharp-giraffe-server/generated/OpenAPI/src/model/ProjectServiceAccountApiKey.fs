namespace OpenAPI.Model

open System
open System.Collections.Generic

module ProjectServiceAccountApiKey =

  //#region ProjectServiceAccountApiKey

  //#region enums
  type ObjectEnum = OrganizationProjectServiceAccountApiKeyEnum of string  
  //#endregion

  type ProjectServiceAccountApiKey = {
    Object : ObjectEnum;
    Value : string;
    Name : string;
    CreatedAt : int;
    Id : string;
  }
  //#endregion
