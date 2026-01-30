package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CreateVectorStoreFileBatchRequest
import model.CreateVectorStoreFileRequest
import model.CreateVectorStoreRequest
import model.DeleteVectorStoreFileResponse
import model.DeleteVectorStoreResponse
import model.ListVectorStoreFilesResponse
import model.ListVectorStoresResponse
import model.UpdateVectorStoreRequest
import model.VectorStoreFileBatchObject
import model.VectorStoreFileObject
import model.VectorStoreObject

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class VectorStoresApiController @Inject()(cc: ControllerComponents, api: VectorStoresApi) extends AbstractController(cc) {
  /**
    * POST /v1/vector_stores/:vectorStoreId/file_batches/:batchId/cancel
    * @param vectorStoreId The ID of the vector store that the file batch belongs to.
    * @param batchId The ID of the file batch to cancel.
    */
  def cancelVectorStoreFileBatch(vectorStoreId: String, batchId: String): Action[AnyContent] = Action { request =>
    def executeApi(): VectorStoreFileBatchObject = {
      api.cancelVectorStoreFileBatch(vectorStoreId, batchId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/vector_stores
    */
  def createVectorStore(): Action[AnyContent] = Action { request =>
    def executeApi(): VectorStoreObject = {
      val createVectorStoreRequest = request.body.asJson.map(_.as[CreateVectorStoreRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createVectorStoreRequest")
      }
      api.createVectorStore(createVectorStoreRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/vector_stores/:vectorStoreId/files
    * @param vectorStoreId The ID of the vector store for which to create a File. 
    */
  def createVectorStoreFile(vectorStoreId: String): Action[AnyContent] = Action { request =>
    def executeApi(): VectorStoreFileObject = {
      val createVectorStoreFileRequest = request.body.asJson.map(_.as[CreateVectorStoreFileRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createVectorStoreFileRequest")
      }
      api.createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/vector_stores/:vectorStoreId/file_batches
    * @param vectorStoreId The ID of the vector store for which to create a File Batch. 
    */
  def createVectorStoreFileBatch(vectorStoreId: String): Action[AnyContent] = Action { request =>
    def executeApi(): VectorStoreFileBatchObject = {
      val createVectorStoreFileBatchRequest = request.body.asJson.map(_.as[CreateVectorStoreFileBatchRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createVectorStoreFileBatchRequest")
      }
      api.createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v1/vector_stores/:vectorStoreId
    * @param vectorStoreId The ID of the vector store to delete.
    */
  def deleteVectorStore(vectorStoreId: String): Action[AnyContent] = Action { request =>
    def executeApi(): DeleteVectorStoreResponse = {
      api.deleteVectorStore(vectorStoreId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v1/vector_stores/:vectorStoreId/files/:fileId
    * @param vectorStoreId The ID of the vector store that the file belongs to.
    * @param fileId The ID of the file to delete.
    */
  def deleteVectorStoreFile(vectorStoreId: String, fileId: String): Action[AnyContent] = Action { request =>
    def executeApi(): DeleteVectorStoreFileResponse = {
      api.deleteVectorStoreFile(vectorStoreId, fileId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/vector_stores/:vectorStoreId
    * @param vectorStoreId The ID of the vector store to retrieve.
    */
  def getVectorStore(vectorStoreId: String): Action[AnyContent] = Action { request =>
    def executeApi(): VectorStoreObject = {
      api.getVectorStore(vectorStoreId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/vector_stores/:vectorStoreId/files/:fileId
    * @param vectorStoreId The ID of the vector store that the file belongs to.
    * @param fileId The ID of the file being retrieved.
    */
  def getVectorStoreFile(vectorStoreId: String, fileId: String): Action[AnyContent] = Action { request =>
    def executeApi(): VectorStoreFileObject = {
      api.getVectorStoreFile(vectorStoreId, fileId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/vector_stores/:vectorStoreId/file_batches/:batchId
    * @param vectorStoreId The ID of the vector store that the file batch belongs to.
    * @param batchId The ID of the file batch being retrieved.
    */
  def getVectorStoreFileBatch(vectorStoreId: String, batchId: String): Action[AnyContent] = Action { request =>
    def executeApi(): VectorStoreFileBatchObject = {
      api.getVectorStoreFileBatch(vectorStoreId, batchId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/vector_stores/:vectorStoreId/file_batches/:batchId/files?limit=[value]&order=[value]&after=[value]&before=[value]&filter=[value]
    * @param vectorStoreId The ID of the vector store that the files belong to.
    * @param batchId The ID of the file batch that the files belong to.
    */
  def listFilesInVectorStoreBatch(vectorStoreId: String, batchId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ListVectorStoreFilesResponse = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val after = request.getQueryString("after")
        
      val before = request.getQueryString("before")
        
      val filter = request.getQueryString("filter")
        
      api.listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/vector_stores/:vectorStoreId/files?limit=[value]&order=[value]&after=[value]&before=[value]&filter=[value]
    * @param vectorStoreId The ID of the vector store that the files belong to.
    */
  def listVectorStoreFiles(vectorStoreId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ListVectorStoreFilesResponse = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val after = request.getQueryString("after")
        
      val before = request.getQueryString("before")
        
      val filter = request.getQueryString("filter")
        
      api.listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/vector_stores?limit=[value]&order=[value]&after=[value]&before=[value]
    */
  def listVectorStores(): Action[AnyContent] = Action { request =>
    def executeApi(): ListVectorStoresResponse = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        
      val after = request.getQueryString("after")
        
      val before = request.getQueryString("before")
        
      api.listVectorStores(limit, order, after, before)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/vector_stores/:vectorStoreId
    * @param vectorStoreId The ID of the vector store to modify.
    */
  def modifyVectorStore(vectorStoreId: String): Action[AnyContent] = Action { request =>
    def executeApi(): VectorStoreObject = {
      val updateVectorStoreRequest = request.body.asJson.map(_.as[UpdateVectorStoreRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "updateVectorStoreRequest")
      }
      api.modifyVectorStore(vectorStoreId, updateVectorStoreRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
