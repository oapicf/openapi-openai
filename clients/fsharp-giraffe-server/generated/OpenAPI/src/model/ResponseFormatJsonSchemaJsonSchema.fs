namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.bool option
open System.Collections.Generic

module ResponseFormatJsonSchemaJsonSchema =

  //#region ResponseFormatJsonSchemaJsonSchema


  type ResponseFormatJsonSchema_json_schema = {
    Description : string;
    Name : string;
    Schema : IDictionary<string, AnyType>;
    Strict : bool option;
  }
  //#endregion
