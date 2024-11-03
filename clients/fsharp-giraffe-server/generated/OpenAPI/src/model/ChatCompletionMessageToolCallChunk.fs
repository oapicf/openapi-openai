namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ChatCompletionMessageToolCallChunkFunction

module ChatCompletionMessageToolCallChunk =

  //#region ChatCompletionMessageToolCallChunk

  //#region enums
  type TypeEnum = FunctionEnum of string  
  //#endregion

  type ChatCompletionMessageToolCallChunk = {
    Index : int;
    Id : string;
    Type : TypeEnum;
    Function : ChatCompletionMessageToolCallChunkFunction;
  }
  //#endregion
