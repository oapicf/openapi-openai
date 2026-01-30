namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.bool option
open System.Collections.Generic

module FunctionObject =

  //#region FunctionObject


  type FunctionObject = {
    Description : string;
    Name : string;
    Parameters : IDictionary<string, AnyType>;
    Strict : bool option;
  }
  //#endregion
