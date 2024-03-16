namespace OpenAPI.Model

open System
open System.Collections.Generic

module Model =

  //#region Model


  type Model = {
    Id : string;
    Object : string;
    Created : int;
    OwnedBy : string;
  }
  //#endregion
