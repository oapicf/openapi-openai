namespace OpenAPI.Model

open System
open System.Collections.Generic

module VectorStoreFileObjectLastError =

  //#region VectorStoreFileObjectLastError

  //#region enums
  type CodeEnum = ServerErrorEnum of string  |  UnsupportedFileEnum of string  |  InvalidFileEnum of string  
  //#endregion

  type VectorStoreFileObject_last_error = {
    Code : CodeEnum;
    Message : string;
  }
  //#endregion
