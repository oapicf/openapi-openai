namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssistantToolsCode
open OpenAPI.Model.AssistantToolsFunction
open OpenAPI.Model.AssistantToolsRetrieval
open OpenAPI.Model.FunctionObject

module CreateThreadAndRunRequestToolsInner =

  //#region CreateThreadAndRunRequestToolsInner

  //#region enums
  type TypeEnum = CodeInterpreterEnum of string  |  RetrievalEnum of string  |  FunctionEnum of string  
  //#endregion

  type CreateThreadAndRunRequest_tools_inner = {
    Type : TypeEnum;
    Function : FunctionObject;
  }
  //#endregion
