namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module Error =

  //#region Error


  type Error = {
    Code : string option;
    Message : string;
    Param : string option;
    Type : string;
  }
  //#endregion
