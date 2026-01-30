namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ResponseFormatJsonSchemaJsonSchema

module ResponseFormatJsonSchema =

  //#region ResponseFormatJsonSchema

  [<CLIMutable>]
  type ResponseFormatJsonSchema = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "json_schema")>]
    JsonSchema : ResponseFormatJsonSchemaJsonSchema;
  }

  //#endregion
