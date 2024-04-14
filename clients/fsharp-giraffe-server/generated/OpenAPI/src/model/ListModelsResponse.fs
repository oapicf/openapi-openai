namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Model

module ListModelsResponse =

  //#region ListModelsResponse

  //#region enums
  type ObjectEnum = ListEnum of string  
  //#endregion

  type ListModelsResponse = {
    Object : ObjectEnum;
    Data : Model[];
  }
  //#endregion
