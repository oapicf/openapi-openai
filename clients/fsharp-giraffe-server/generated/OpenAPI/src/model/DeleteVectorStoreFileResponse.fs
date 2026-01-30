namespace OpenAPI.Model

open System
open System.Collections.Generic

module DeleteVectorStoreFileResponse =

  //#region DeleteVectorStoreFileResponse

  //#region enums
  type ObjectEnum = VectorStoreFileDeletedEnum of string  
  //#endregion

  type DeleteVectorStoreFileResponse = {
    Id : string;
    Deleted : bool;
    Object : ObjectEnum;
  }
  //#endregion
