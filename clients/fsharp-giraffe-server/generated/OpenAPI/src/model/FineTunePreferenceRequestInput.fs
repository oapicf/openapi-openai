namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.FineTunePreferenceRequestInputInput
open OpenAPI.Model.FineTunePreferenceRequestInputPreferredCompletionInner

module FineTunePreferenceRequestInput =

  //#region FineTunePreferenceRequestInput


  type FineTunePreferenceRequestInput = {
    Input : FineTunePreferenceRequestInputInput;
    PreferredCompletion : FineTunePreferenceRequestInputPreferredCompletionInner[];
    NonPreferredCompletion : FineTunePreferenceRequestInputPreferredCompletionInner[];
  }
  //#endregion
