namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionFunctions
open OpenAPI.Model.ChatCompletionTool
open OpenAPI.Model.FineTuneChatRequestInputMessagesInner

module FineTuneChatRequestInput =

  //#region FineTuneChatRequestInput


  type FineTuneChatRequestInput = {
    Messages : FineTuneChatRequestInputMessagesInner[];
    Tools : ChatCompletionTool[];
    ParallelToolCalls : bool;
    Functions : ChatCompletionFunctions[];
  }
  //#endregion
