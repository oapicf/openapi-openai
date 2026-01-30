namespace OpenAPI.Model

open System
open System.Collections.Generic
open System.Collections.Generic

module CreateBatchRequest =

  //#region CreateBatchRequest

  //#region enums
  type EndpointEnum = V1ChatCompletionsEnum of string  |  V1EmbeddingsEnum of string  |  V1CompletionsEnum of string  
  //#endregion
  //#region enums
  type CompletionWindowEnum = _24hEnum of string  
  //#endregion

  type createBatch_request = {
    InputFileId : string;
    Endpoint : EndpointEnum;
    CompletionWindow : CompletionWindowEnum;
    Metadata : IDictionary<string, string>;
  }
  //#endregion
