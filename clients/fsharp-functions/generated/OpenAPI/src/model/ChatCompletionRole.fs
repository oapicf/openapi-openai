namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ChatCompletionRole =

  //#region ChatCompletionRole

  let SystemEnum = "system"
  let UserEnum = "user"
  let AssistantEnum = "assistant"
  let ToolEnum = "tool"
  let FunctionEnum = "function"
  type ChatCompletionRole = string

  //#endregion
