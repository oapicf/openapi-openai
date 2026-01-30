namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateModerationRequestInputOneOfInnerOneOfImageUrl

module CreateModerationRequestInputOneOfInnerOneOf =

  //#region CreateModerationRequestInputOneOfInnerOneOf

  [<CLIMutable>]
  type CreateModerationRequestInputOneOfInnerOneOf = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "image_url")>]
    ImageUrl : CreateModerationRequestInputOneOfInnerOneOfImageUrl;
  }

  //#endregion
