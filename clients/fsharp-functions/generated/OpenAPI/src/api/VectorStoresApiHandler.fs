namespace OpenAPI

open VectorStoresApiHandlerParams
open VectorStoresApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module VectorStoresApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region CancelVectorStoreFileBatch
    /// <summary>
    /// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
    /// </summary>
   [<FunctionName("CancelVectorStoreFileBatch")>]
    let CancelVectorStoreFileBatch
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel")>]
        req:HttpRequest ) =

      let result = VectorStoresApiService.CancelVectorStoreFileBatch ()
      match result with
      | CancelVectorStoreFileBatchStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateVectorStore
    /// <summary>
    /// Create a vector store.
    /// </summary>
   [<FunctionName("CreateVectorStore")>]
    let CreateVectorStore
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/vector_stores")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateVectorStoreBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = VectorStoresApiService.CreateVectorStore bodyParams
      match result with
      | CreateVectorStoreStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateVectorStoreFile
    /// <summary>
    /// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
    /// </summary>
   [<FunctionName("CreateVectorStoreFile")>]
    let CreateVectorStoreFile
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/vector_stores/{vector_store_id}/files")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateVectorStoreFileBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = VectorStoresApiService.CreateVectorStoreFile bodyParams
      match result with
      | CreateVectorStoreFileStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region CreateVectorStoreFileBatch
    /// <summary>
    /// Create a vector store file batch.
    /// </summary>
   [<FunctionName("CreateVectorStoreFileBatch")>]
    let CreateVectorStoreFileBatch
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/vector_stores/{vector_store_id}/file_batches")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CreateVectorStoreFileBatchBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = VectorStoresApiService.CreateVectorStoreFileBatch bodyParams
      match result with
      | CreateVectorStoreFileBatchStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region DeleteVectorStore
    /// <summary>
    /// Delete a vector store.
    /// </summary>
   [<FunctionName("DeleteVectorStore")>]
    let DeleteVectorStore
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v1/vector_stores/{vector_store_id}")>]
        req:HttpRequest ) =

      let result = VectorStoresApiService.DeleteVectorStore ()
      match result with
      | DeleteVectorStoreStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region DeleteVectorStoreFile
    /// <summary>
    /// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
    /// </summary>
   [<FunctionName("DeleteVectorStoreFile")>]
    let DeleteVectorStoreFile
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v1/vector_stores/{vector_store_id}/files/{file_id}")>]
        req:HttpRequest ) =

      let result = VectorStoresApiService.DeleteVectorStoreFile ()
      match result with
      | DeleteVectorStoreFileStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GetVectorStore
    /// <summary>
    /// Retrieves a vector store.
    /// </summary>
   [<FunctionName("GetVectorStore")>]
    let GetVectorStore
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/vector_stores/{vector_store_id}")>]
        req:HttpRequest ) =

      let result = VectorStoresApiService.GetVectorStore ()
      match result with
      | GetVectorStoreStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GetVectorStoreFile
    /// <summary>
    /// Retrieves a vector store file.
    /// </summary>
   [<FunctionName("GetVectorStoreFile")>]
    let GetVectorStoreFile
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/vector_stores/{vector_store_id}/files/{file_id}")>]
        req:HttpRequest ) =

      let result = VectorStoresApiService.GetVectorStoreFile ()
      match result with
      | GetVectorStoreFileStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GetVectorStoreFileBatch
    /// <summary>
    /// Retrieves a vector store file batch.
    /// </summary>
   [<FunctionName("GetVectorStoreFileBatch")>]
    let GetVectorStoreFileBatch
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}")>]
        req:HttpRequest ) =

      let result = VectorStoresApiService.GetVectorStoreFileBatch ()
      match result with
      | GetVectorStoreFileBatchStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListFilesInVectorStoreBatch
    /// <summary>
    /// Returns a list of vector store files in a batch.
    /// </summary>
   [<FunctionName("ListFilesInVectorStoreBatch")>]
    let ListFilesInVectorStoreBatch
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/files")>]
        req:HttpRequest ) =

      let result = VectorStoresApiService.ListFilesInVectorStoreBatch ()
      match result with
      | ListFilesInVectorStoreBatchStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListVectorStoreFiles
    /// <summary>
    /// Returns a list of vector store files.
    /// </summary>
   [<FunctionName("ListVectorStoreFiles")>]
    let ListVectorStoreFiles
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/vector_stores/{vector_store_id}/files")>]
        req:HttpRequest ) =

      let result = VectorStoresApiService.ListVectorStoreFiles ()
      match result with
      | ListVectorStoreFilesStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ListVectorStores
    /// <summary>
    /// Returns a list of vector stores.
    /// </summary>
   [<FunctionName("ListVectorStores")>]
    let ListVectorStores
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v1/vector_stores")>]
        req:HttpRequest ) =

      let result = VectorStoresApiService.ListVectorStores ()
      match result with
      | ListVectorStoresStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region ModifyVectorStore
    /// <summary>
    /// Modifies a vector store.
    /// </summary>
   [<FunctionName("ModifyVectorStore")>]
    let ModifyVectorStore
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v1/vector_stores/{vector_store_id}")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<ModifyVectorStoreBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = VectorStoresApiService.ModifyVectorStore bodyParams
      match result with
      | ModifyVectorStoreStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

