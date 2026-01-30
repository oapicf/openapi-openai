namespace OpenAPI.Model

open System
open System.Collections.Generic

module CreateModerationResponseResultsInnerCategoryAppliedInputTypes =

  //#region CreateModerationResponseResultsInnerCategoryAppliedInputTypes

  //#region enums
  type HateEnum[] = TextEnum of string[]  
  //#endregion
  //#region enums
  type HateThreateningEnum[] = TextEnum of string[]  
  //#endregion
  //#region enums
  type HarassmentEnum[] = TextEnum of string[]  
  //#endregion
  //#region enums
  type HarassmentThreateningEnum[] = TextEnum of string[]  
  //#endregion
  //#region enums
  type IllicitEnum[] = TextEnum of string[]  
  //#endregion
  //#region enums
  type IllicitViolentEnum[] = TextEnum of string[]  
  //#endregion
  //#region enums
  type SelfHarmEnum[] = TextEnum of string[]  |  ImageEnum of string[]  
  //#endregion
  //#region enums
  type SelfHarmIntentEnum[] = TextEnum of string[]  |  ImageEnum of string[]  
  //#endregion
  //#region enums
  type SelfHarmInstructionsEnum[] = TextEnum of string[]  |  ImageEnum of string[]  
  //#endregion
  //#region enums
  type SexualEnum[] = TextEnum of string[]  |  ImageEnum of string[]  
  //#endregion
  //#region enums
  type SexualMinorsEnum[] = TextEnum of string[]  
  //#endregion
  //#region enums
  type ViolenceEnum[] = TextEnum of string[]  |  ImageEnum of string[]  
  //#endregion
  //#region enums
  type ViolenceGraphicEnum[] = TextEnum of string[]  |  ImageEnum of string[]  
  //#endregion

  type CreateModerationResponse_results_inner_category_applied_input_types = {
    Hate : HateEnum[];
    HateThreatening : HateThreateningEnum[];
    Harassment : HarassmentEnum[];
    HarassmentThreatening : HarassmentThreateningEnum[];
    Illicit : IllicitEnum[];
    IllicitViolent : IllicitViolentEnum[];
    SelfHarm : SelfHarmEnum[];
    SelfHarmIntent : SelfHarmIntentEnum[];
    SelfHarmInstructions : SelfHarmInstructionsEnum[];
    Sexual : SexualEnum[];
    SexualMinors : SexualMinorsEnum[];
    Violence : ViolenceEnum[];
    ViolenceGraphic : ViolenceGraphicEnum[];
  }
  //#endregion
