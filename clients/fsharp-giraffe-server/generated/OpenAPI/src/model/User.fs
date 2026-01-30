namespace OpenAPI.Model

open System
open System.Collections.Generic

module User =

  //#region User

  //#region enums
  type ObjectEnum = OrganizationUserEnum of string  
  //#endregion
  //#region enums
  type RoleEnum = OwnerEnum of string  |  ReaderEnum of string  
  //#endregion

  type User = {
    Object : ObjectEnum;
    Id : string;
    Name : string;
    Email : string;
    Role : RoleEnum;
    AddedAt : int;
  }
  //#endregion
