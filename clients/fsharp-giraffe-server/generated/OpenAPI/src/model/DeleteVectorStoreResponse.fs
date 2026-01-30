namespace OpenAPI.Model

open System
open System.Collections.Generic

module DeleteVectorStoreResponse =

  //#region DeleteVectorStoreResponse

  //#region enums
  type ObjectEnum = VectorStoreDeletedEnum of string  
  //#endregion

  type DeleteVectorStoreResponse = {
    Id : string;
    Deleted : bool;
    Object : ObjectEnum;
  }
  //#endregion
