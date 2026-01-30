namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ResponseFormatJsonSchemaJsonSchema

module ResponseFormatJsonSchema =

  //#region ResponseFormatJsonSchema

  //#region enums
  type TypeEnum = JsonSchemaEnum of string  
  //#endregion

  type ResponseFormatJsonSchema = {
    Type : TypeEnum;
    JsonSchema : ResponseFormatJsonSchemaJsonSchema;
  }
  //#endregion
