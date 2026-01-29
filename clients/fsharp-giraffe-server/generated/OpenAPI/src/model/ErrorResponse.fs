namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Error

module ErrorResponse =

  //#region ErrorResponse


  type ErrorResponse = {
    Error : Error;
  }
  //#endregion
