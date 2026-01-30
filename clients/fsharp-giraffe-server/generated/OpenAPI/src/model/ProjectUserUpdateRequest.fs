namespace OpenAPI.Model

open System
open System.Collections.Generic

module ProjectUserUpdateRequest =

  //#region ProjectUserUpdateRequest

  //#region enums
  type RoleEnum = OwnerEnum of string  |  MemberEnum of string  
  //#endregion

  type ProjectUserUpdateRequest = {
    Role : RoleEnum;
  }
  //#endregion
