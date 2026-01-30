namespace OpenAPI.Model

open System
open System.Collections.Generic

module UserRoleUpdateRequest =

  //#region UserRoleUpdateRequest

  //#region enums
  type RoleEnum = OwnerEnum of string  |  ReaderEnum of string  
  //#endregion

  type UserRoleUpdateRequest = {
    Role : RoleEnum;
  }
  //#endregion
