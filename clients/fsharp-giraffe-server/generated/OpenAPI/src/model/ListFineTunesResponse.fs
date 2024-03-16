namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FineTune

module ListFineTunesResponse =

  //#region ListFineTunesResponse


  type ListFineTunesResponse = {
    Object : string;
    Data : FineTune[];
  }
  //#endregion
