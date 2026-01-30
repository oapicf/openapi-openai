namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ProjectServiceAccountApiKey

module ProjectServiceAccountCreateResponse =

  //#region ProjectServiceAccountCreateResponse

  //#region enums
  type ObjectEnum = OrganizationProjectServiceAccountEnum of string  
  //#endregion
  //#region enums
  type RoleEnum = MemberEnum of string  
  //#endregion

  type ProjectServiceAccountCreateResponse = {
    Object : ObjectEnum;
    Id : string;
    Name : string;
    Role : RoleEnum;
    CreatedAt : int;
    ApiKey : ProjectServiceAccountApiKey;
  }
  //#endregion
