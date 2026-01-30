namespace OpenAPI.Model

open System
open System.Collections.Generic

module ProjectUser =

  //#region ProjectUser

  //#region enums
  type ObjectEnum = OrganizationProjectUserEnum of string  
  //#endregion
  //#region enums
  type RoleEnum = OwnerEnum of string  |  MemberEnum of string  
  //#endregion

  type ProjectUser = {
    Object : ObjectEnum;
    Id : string;
    Name : string;
    Email : string;
    Role : RoleEnum;
    AddedAt : int;
  }
  //#endregion
