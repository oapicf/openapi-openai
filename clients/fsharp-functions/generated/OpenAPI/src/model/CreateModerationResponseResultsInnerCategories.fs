namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateModerationResponseResultsInnerCategories =

  //#region CreateModerationResponseResultsInnerCategories

  [<CLIMutable>]
  type CreateModerationResponseResultsInnerCategories = {
    [<JsonProperty(PropertyName = "hate")>]
    Hate : bool;
    [<JsonProperty(PropertyName = "hate/threatening")>]
    HateThreatening : bool;
    [<JsonProperty(PropertyName = "harassment")>]
    Harassment : bool;
    [<JsonProperty(PropertyName = "harassment/threatening")>]
    HarassmentThreatening : bool;
    [<JsonProperty(PropertyName = "illicit")>]
    Illicit : bool;
    [<JsonProperty(PropertyName = "illicit/violent")>]
    IllicitViolent : bool;
    [<JsonProperty(PropertyName = "self-harm")>]
    SelfHarm : bool;
    [<JsonProperty(PropertyName = "self-harm/intent")>]
    SelfHarmIntent : bool;
    [<JsonProperty(PropertyName = "self-harm/instructions")>]
    SelfHarmInstructions : bool;
    [<JsonProperty(PropertyName = "sexual")>]
    Sexual : bool;
    [<JsonProperty(PropertyName = "sexual/minors")>]
    SexualMinors : bool;
    [<JsonProperty(PropertyName = "violence")>]
    Violence : bool;
    [<JsonProperty(PropertyName = "violence/graphic")>]
    ViolenceGraphic : bool;
  }

  //#endregion
