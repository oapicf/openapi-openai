namespace OpenAPI.Model

open System
open System.Collections.Generic

module CreateModerationResponseResultsInnerCategories =

  //#region CreateModerationResponseResultsInnerCategories


  type CreateModerationResponse_results_inner_categories = {
    Hate : bool;
    HateThreatening : bool;
    Harassment : bool;
    HarassmentThreatening : bool;
    Illicit : bool;
    IllicitViolent : bool;
    SelfHarm : bool;
    SelfHarmIntent : bool;
    SelfHarmInstructions : bool;
    Sexual : bool;
    SexualMinors : bool;
    Violence : bool;
    ViolenceGraphic : bool;
  }
  //#endregion
