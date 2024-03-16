namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module Error =

  //#region Error


  type Error = {
    Type : string;
    Message : string;
    Param : string option;
    Code : string option;
  }
  //#endregion
