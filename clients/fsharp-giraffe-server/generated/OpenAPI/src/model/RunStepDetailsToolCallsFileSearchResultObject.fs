namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.RunStepDetailsToolCallsFileSearchResultObjectContentInner

module RunStepDetailsToolCallsFileSearchResultObject =

  //#region RunStepDetailsToolCallsFileSearchResultObject


  type RunStepDetailsToolCallsFileSearchResultObject = {
    FileId : string;
    FileName : string;
    Score : decimal;
    Content : RunStepDetailsToolCallsFileSearchResultObjectContentInner[];
  }
  //#endregion
