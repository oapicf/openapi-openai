namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.int option

module Project =

  //#region Project

  //#region enums
  type ObjectEnum = OrganizationProjectEnum of string  
  //#endregion
  //#region enums
  type StatusEnum = ActiveEnum of string  |  ArchivedEnum of string  
  //#endregion

  type Project = {
    Id : string;
    Object : ObjectEnum;
    Name : string;
    CreatedAt : int;
    ArchivedAt : int option;
    Status : StatusEnum;
  }
  //#endregion
