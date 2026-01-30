namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open OpenAPI.Model.bool option
open System.Collections.Generic

module FunctionObject =

  //#region FunctionObject

  [<CLIMutable>]
  type FunctionObject = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "parameters")>]
    Parameters : IDictionary<string, AnyType>;
    [<JsonProperty(PropertyName = "strict")>]
    Strict : bool option;
  }

  //#endregion
