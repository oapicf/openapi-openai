namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateModerationRequestInputOneOfInnerOneOf
open OpenAPI.Model.CreateModerationRequestInputOneOfInnerOneOf1
open OpenAPI.Model.CreateModerationRequestInputOneOfInnerOneOfImageUrl

module CreateModerationRequestInputOneOfInner =

  //#region CreateModerationRequestInputOneOfInner

  [<CLIMutable>]
  type CreateModerationRequestInputOneOfInner = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "image_url")>]
    ImageUrl : CreateModerationRequestInputOneOfInnerOneOfImageUrl;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
  }

  //#endregion
