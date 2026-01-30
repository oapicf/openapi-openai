namespace OpenAPI.Model

open System
open System.Collections.Generic

module ProjectUserCreateRequest =

  //#region ProjectUserCreateRequest

  //#region enums
  type RoleEnum = OwnerEnum of string  |  MemberEnum of string  
  //#endregion

  type ProjectUserCreateRequest = {
    UserId : string;
    Role : RoleEnum;
  }
  //#endregion
