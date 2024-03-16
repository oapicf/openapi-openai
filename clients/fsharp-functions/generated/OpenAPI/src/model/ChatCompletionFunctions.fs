namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open System.Collections.Generic

module ChatCompletionFunctions =

  //#region ChatCompletionFunctions

  [<CLIMutable>]
  type ChatCompletionFunctions = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "parameters")>]
    Parameters : IDictionary<string, AnyType>;
  }

  //#endregion
