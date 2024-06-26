namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Image

module ImagesResponse =

  //#region ImagesResponse

  [<CLIMutable>]
  type ImagesResponse = {
    [<JsonProperty(PropertyName = "created")>]
    Created : int;
    [<JsonProperty(PropertyName = "data")>]
    Data : Image[];
  }

  //#endregion
