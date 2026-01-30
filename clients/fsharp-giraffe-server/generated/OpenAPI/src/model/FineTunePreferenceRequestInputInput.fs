namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionTool
open OpenAPI.Model.FineTuneChatRequestInputMessagesInner

module FineTunePreferenceRequestInputInput =

  //#region FineTunePreferenceRequestInputInput


  type FineTunePreferenceRequestInput_input = {
    Messages : FineTuneChatRequestInputMessagesInner[];
    Tools : ChatCompletionTool[];
    ParallelToolCalls : bool;
  }
  //#endregion
