namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateModerationRequestInputOneOfInnerOneOf1 =

  //#region CreateModerationRequestInputOneOfInnerOneOf1

  [<CLIMutable>]
  type CreateModerationRequestInputOneOfInnerOneOf1 = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
  }

  //#endregion
