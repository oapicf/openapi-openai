namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ResponseFormatJsonObject
open OpenAPI.Model.ResponseFormatJsonSchema
open OpenAPI.Model.ResponseFormatJsonSchemaJsonSchema
open OpenAPI.Model.ResponseFormatText

module CreateChatCompletionRequestResponseFormat =

  //#region CreateChatCompletionRequestResponseFormat

  [<CLIMutable>]
  type CreateChatCompletionRequestResponseFormat = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "json_schema")>]
    JsonSchema : ResponseFormatJsonSchemaJsonSchema;
  }

  //#endregion
