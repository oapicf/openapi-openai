namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionTool
open OpenAPI.Model.FineTuneChatRequestInputMessagesInner

module FineTunePreferenceRequestInputInput =

  //#region FineTunePreferenceRequestInputInput

  [<CLIMutable>]
  type FineTunePreferenceRequestInputInput = {
    [<JsonProperty(PropertyName = "messages")>]
    Messages : FineTuneChatRequestInputMessagesInner[];
    [<JsonProperty(PropertyName = "tools")>]
    Tools : ChatCompletionTool[];
    [<JsonProperty(PropertyName = "parallel_tool_calls")>]
    ParallelToolCalls : bool;
  }

  //#endregion
