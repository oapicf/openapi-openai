namespace OpenAPI.Model

open System
open System.Collections.Generic

module ProjectServiceAccount =

  //#region ProjectServiceAccount

  //#region enums
  type ObjectEnum = OrganizationProjectServiceAccountEnum of string  
  //#endregion
  //#region enums
  type RoleEnum = OwnerEnum of string  |  MemberEnum of string  
  //#endregion

  type ProjectServiceAccount = {
    Object : ObjectEnum;
    Id : string;
    Name : string;
    Role : RoleEnum;
    CreatedAt : int;
  }
  //#endregion
