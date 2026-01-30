namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ResponseFormatJsonObject
open OpenAPI.Model.ResponseFormatJsonSchema
open OpenAPI.Model.ResponseFormatJsonSchemaJsonSchema
open OpenAPI.Model.ResponseFormatText

module CreateChatCompletionRequestResponseFormat =

  //#region CreateChatCompletionRequestResponseFormat

  //#region enums
  type TypeEnum = TextEnum of string  |  JsonObjectEnum of string  |  JsonSchemaEnum of string  
  //#endregion

  type CreateChatCompletionRequest_response_format = {
    Type : TypeEnum;
    JsonSchema : ResponseFormatJsonSchemaJsonSchema;
  }
  //#endregion
