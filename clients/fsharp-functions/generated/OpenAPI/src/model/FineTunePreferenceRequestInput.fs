namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.FineTunePreferenceRequestInputInput
open OpenAPI.Model.FineTunePreferenceRequestInputPreferredCompletionInner

module FineTunePreferenceRequestInput =

  //#region FineTunePreferenceRequestInput

  [<CLIMutable>]
  type FineTunePreferenceRequestInput = {
    [<JsonProperty(PropertyName = "input")>]
    Input : FineTunePreferenceRequestInputInput;
    [<JsonProperty(PropertyName = "preferred_completion")>]
    PreferredCompletion : FineTunePreferenceRequestInputPreferredCompletionInner[];
    [<JsonProperty(PropertyName = "non_preferred_completion")>]
    NonPreferredCompletion : FineTunePreferenceRequestInputPreferredCompletionInner[];
  }

  //#endregion
