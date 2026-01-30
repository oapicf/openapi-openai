namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.User

module UserListResponse =

  //#region UserListResponse

  //#region enums
  type ObjectEnum = ListEnum of string  
  //#endregion

  type UserListResponse = {
    Object : ObjectEnum;
    Data : User[];
    FirstId : string;
    LastId : string;
    HasMore : bool;
  }
  //#endregion
