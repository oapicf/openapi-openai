namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Image =

  //#region Image

  [<CLIMutable>]
  type Image = {
    [<JsonProperty(PropertyName = "b64_json")>]
    B64Json : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "revised_prompt")>]
    RevisedPrompt : string;
  }

  //#endregion
