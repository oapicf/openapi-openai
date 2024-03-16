namespace OpenAPI.Model

open System
open System.Collections.Generic

module OpenAIFile =

  //#region OpenAIFile


  type OpenAIFile = {
    Id : string;
    Object : string;
    Bytes : int;
    CreatedAt : int;
    Filename : string;
    Purpose : string;
    Status : string;
    StatusDetails : obj;
  }
  //#endregion
