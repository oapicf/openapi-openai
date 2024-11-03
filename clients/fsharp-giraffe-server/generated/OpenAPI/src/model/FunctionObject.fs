namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open System.Collections.Generic

module FunctionObject =

  //#region FunctionObject


  type FunctionObject = {
    Description : string;
    Name : string;
    Parameters : IDictionary<string, AnyType>;
  }
  //#endregion
