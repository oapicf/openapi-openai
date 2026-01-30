package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Batch
import model.CreateBatchRequest
import model.ListBatchesResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class BatchApiController @Inject()(cc: ControllerComponents, api: BatchApi) extends AbstractController(cc) {
  /**
    * POST /v1/batches/:batchId/cancel
    * @param batchId The ID of the batch to cancel.
    */
  def cancelBatch(batchId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Batch = {
      api.cancelBatch(batchId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/batches
    */
  def createBatch(): Action[AnyContent] = Action { request =>
    def executeApi(): Batch = {
      val createBatchRequest = request.body.asJson.map(_.as[CreateBatchRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createBatchRequest")
      }
      api.createBatch(createBatchRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/batches?after=[value]&limit=[value]
    */
  def listBatches(): Action[AnyContent] = Action { request =>
    def executeApi(): ListBatchesResponse = {
      val after = request.getQueryString("after")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.listBatches(after, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/batches/:batchId
    * @param batchId The ID of the batch to retrieve.
    */
  def retrieveBatch(batchId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Batch = {
      api.retrieveBatch(batchId)
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
