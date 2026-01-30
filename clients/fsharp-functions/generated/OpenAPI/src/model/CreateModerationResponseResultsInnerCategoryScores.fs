namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CreateModerationResponseResultsInnerCategoryScores =

  //#region CreateModerationResponseResultsInnerCategoryScores

  [<CLIMutable>]
  type CreateModerationResponseResultsInnerCategoryScores = {
    [<JsonProperty(PropertyName = "hate")>]
    Hate : decimal;
    [<JsonProperty(PropertyName = "hate/threatening")>]
    HateThreatening : decimal;
    [<JsonProperty(PropertyName = "harassment")>]
    Harassment : decimal;
    [<JsonProperty(PropertyName = "harassment/threatening")>]
    HarassmentThreatening : decimal;
    [<JsonProperty(PropertyName = "illicit")>]
    Illicit : decimal;
    [<JsonProperty(PropertyName = "illicit/violent")>]
    IllicitViolent : decimal;
    [<JsonProperty(PropertyName = "self-harm")>]
    SelfHarm : decimal;
    [<JsonProperty(PropertyName = "self-harm/intent")>]
    SelfHarmIntent : decimal;
    [<JsonProperty(PropertyName = "self-harm/instructions")>]
    SelfHarmInstructions : decimal;
    [<JsonProperty(PropertyName = "sexual")>]
    Sexual : decimal;
    [<JsonProperty(PropertyName = "sexual/minors")>]
    SexualMinors : decimal;
    [<JsonProperty(PropertyName = "violence")>]
    Violence : decimal;
    [<JsonProperty(PropertyName = "violence/graphic")>]
    ViolenceGraphic : decimal;
  }

  //#endregion
