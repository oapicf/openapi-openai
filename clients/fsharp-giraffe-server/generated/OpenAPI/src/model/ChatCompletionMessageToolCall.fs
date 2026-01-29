namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionMessageToolCallFunction

module ChatCompletionMessageToolCall =

  //#region ChatCompletionMessageToolCall

  //#region enums
  type TypeEnum = FunctionEnum of string  
  //#endregion

  type ChatCompletionMessageToolCall = {
    Id : string;
    Type : TypeEnum;
    Function : ChatCompletionMessageToolCallFunction;
  }
  //#endregion
