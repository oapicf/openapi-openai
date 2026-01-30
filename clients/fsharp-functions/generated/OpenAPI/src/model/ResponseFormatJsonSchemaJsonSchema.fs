namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.bool option
open System.Collections.Generic

module ResponseFormatJsonSchemaJsonSchema =

  //#region ResponseFormatJsonSchemaJsonSchema

  [<CLIMutable>]
  type ResponseFormatJsonSchemaJsonSchema = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "schema")>]
    Schema : IDictionary<string, AnyType>;
    [<JsonProperty(PropertyName = "strict")>]
    Strict : bool option;
  }

  //#endregion
