namespace OpenAPI.Model

open System
open System.Collections.Generic

module CreateModerationResponseResultsInnerCategoryScores =

  //#region CreateModerationResponseResultsInnerCategoryScores


  type CreateModerationResponse_results_inner_category_scores = {
    Hate : decimal;
    HateThreatening : decimal;
    Harassment : decimal;
    HarassmentThreatening : decimal;
    Illicit : decimal;
    IllicitViolent : decimal;
    SelfHarm : decimal;
    SelfHarmIntent : decimal;
    SelfHarmInstructions : decimal;
    Sexual : decimal;
    SexualMinors : decimal;
    Violence : decimal;
    ViolenceGraphic : decimal;
  }
  //#endregion
