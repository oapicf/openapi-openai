namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.VectorStoreExpirationAfter
open OpenAPI.Model.string option

module UpdateVectorStoreRequest =

  //#region UpdateVectorStoreRequest

  [<CLIMutable>]
  type UpdateVectorStoreRequest = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string option;
    [<JsonProperty(PropertyName = "expires_after")>]
    ExpiresAfter : VectorStoreExpirationAfter;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : obj;
  }

  //#endregion
