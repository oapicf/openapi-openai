namespace OpenAPI.Model

open System
open System.Collections.Generic

module MessageFileObject =

  //#region MessageFileObject

  //#region enums
  type ObjectEnum = ThreadMessageFileEnum of string  
  //#endregion

  type MessageFileObject = {
    Id : string;
    Object : ObjectEnum;
    CreatedAt : int;
    MessageId : string;
  }
  //#endregion
