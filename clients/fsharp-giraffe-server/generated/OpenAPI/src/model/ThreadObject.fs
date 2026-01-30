namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ModifyThreadRequestToolResources

module ThreadObject =

  //#region ThreadObject

  //#region enums
  type ObjectEnum = ThreadEnum of string  
  //#endregion

  type ThreadObject = {
    Id : string;
    Object : ObjectEnum;
    CreatedAt : int;
    ToolResources : ModifyThreadRequestToolResources;
    Metadata : obj;
  }
  //#endregion
