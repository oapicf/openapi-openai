namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ResponseFormatJsonObject
open OpenAPI.Model.ResponseFormatJsonSchema
open OpenAPI.Model.ResponseFormatJsonSchemaJsonSchema
open OpenAPI.Model.ResponseFormatText

module AssistantsApiResponseFormatOption =

  //#region AssistantsApiResponseFormatOption

  [<CLIMutable>]
  type AssistantsApiResponseFormatOption = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "json_schema")>]
    JsonSchema : ResponseFormatJsonSchemaJsonSchema;
  }

  //#endregion
