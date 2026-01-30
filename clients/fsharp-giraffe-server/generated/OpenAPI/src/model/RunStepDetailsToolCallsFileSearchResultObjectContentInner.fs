namespace OpenAPI.Model

open System
open System.Collections.Generic

module RunStepDetailsToolCallsFileSearchResultObjectContentInner =

  //#region RunStepDetailsToolCallsFileSearchResultObjectContentInner

  //#region enums
  type TypeEnum = TextEnum of string  
  //#endregion

  type RunStepDetailsToolCallsFileSearchResultObject_content_inner = {
    Type : TypeEnum;
    Text : string;
  }
  //#endregion
