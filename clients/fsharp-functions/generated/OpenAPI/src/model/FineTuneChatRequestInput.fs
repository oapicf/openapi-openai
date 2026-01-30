namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ChatCompletionFunctions
open OpenAPI.Model.ChatCompletionTool
open OpenAPI.Model.FineTuneChatRequestInputMessagesInner

module FineTuneChatRequestInput =

  //#region FineTuneChatRequestInput

  [<CLIMutable>]
  type FineTuneChatRequestInput = {
    [<JsonProperty(PropertyName = "messages")>]
    Messages : FineTuneChatRequestInputMessagesInner[];
    [<JsonProperty(PropertyName = "tools")>]
    Tools : ChatCompletionTool[];
    [<JsonProperty(PropertyName = "parallel_tool_calls")>]
    ParallelToolCalls : bool;
    [<JsonProperty(PropertyName = "functions")>]
    Functions : ChatCompletionFunctions[];
  }

  //#endregion
