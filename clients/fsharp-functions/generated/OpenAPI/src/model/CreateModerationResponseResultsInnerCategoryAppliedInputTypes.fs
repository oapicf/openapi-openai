namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateModerationResponseResultsInnerCategoryAppliedInputTypes =

  //#region CreateModerationResponseResultsInnerCategoryAppliedInputTypes

  [<CLIMutable>]
  type CreateModerationResponseResultsInnerCategoryAppliedInputTypes = {
    [<JsonProperty(PropertyName = "hate")>]
    Hate : string[];
    [<JsonProperty(PropertyName = "hate/threatening")>]
    HateThreatening : string[];
    [<JsonProperty(PropertyName = "harassment")>]
    Harassment : string[];
    [<JsonProperty(PropertyName = "harassment/threatening")>]
    HarassmentThreatening : string[];
    [<JsonProperty(PropertyName = "illicit")>]
    Illicit : string[];
    [<JsonProperty(PropertyName = "illicit/violent")>]
    IllicitViolent : string[];
    [<JsonProperty(PropertyName = "self-harm")>]
    SelfHarm : string[];
    [<JsonProperty(PropertyName = "self-harm/intent")>]
    SelfHarmIntent : string[];
    [<JsonProperty(PropertyName = "self-harm/instructions")>]
    SelfHarmInstructions : string[];
    [<JsonProperty(PropertyName = "sexual")>]
    Sexual : string[];
    [<JsonProperty(PropertyName = "sexual/minors")>]
    SexualMinors : string[];
    [<JsonProperty(PropertyName = "violence")>]
    Violence : string[];
    [<JsonProperty(PropertyName = "violence/graphic")>]
    ViolenceGraphic : string[];
  }

  //#endregion
