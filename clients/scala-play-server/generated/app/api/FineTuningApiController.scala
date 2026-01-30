package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CreateFineTuningJobRequest
import model.FineTuningJob
import model.ListFineTuningJobCheckpointsResponse
import model.ListFineTuningJobEventsResponse
import model.ListPaginatedFineTuningJobsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class FineTuningApiController @Inject()(cc: ControllerComponents, api: FineTuningApi) extends AbstractController(cc) {
  /**
    * POST /v1/fine_tuning/jobs/:fineTuningJobId/cancel
    * @param fineTuningJobId The ID of the fine-tuning job to cancel. 
    */
  def cancelFineTuningJob(fineTuningJobId: String): Action[AnyContent] = Action { request =>
    def executeApi(): FineTuningJob = {
      api.cancelFineTuningJob(fineTuningJobId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v1/fine_tuning/jobs
    */
  def createFineTuningJob(): Action[AnyContent] = Action { request =>
    def executeApi(): FineTuningJob = {
      val createFineTuningJobRequest = request.body.asJson.map(_.as[CreateFineTuningJobRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createFineTuningJobRequest")
      }
      api.createFineTuningJob(createFineTuningJobRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/fine_tuning/jobs/:fineTuningJobId/events?after=[value]&limit=[value]
    * @param fineTuningJobId The ID of the fine-tuning job to get events for. 
    */
  def listFineTuningEvents(fineTuningJobId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ListFineTuningJobEventsResponse = {
      val after = request.getQueryString("after")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.listFineTuningEvents(fineTuningJobId, after, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/fine_tuning/jobs/:fineTuningJobId/checkpoints?after=[value]&limit=[value]
    * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for. 
    */
  def listFineTuningJobCheckpoints(fineTuningJobId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ListFineTuningJobCheckpointsResponse = {
      val after = request.getQueryString("after")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.listFineTuningJobCheckpoints(fineTuningJobId, after, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/fine_tuning/jobs?after=[value]&limit=[value]
    */
  def listPaginatedFineTuningJobs(): Action[AnyContent] = Action { request =>
    def executeApi(): ListPaginatedFineTuningJobsResponse = {
      val after = request.getQueryString("after")
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.listPaginatedFineTuningJobs(after, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/fine_tuning/jobs/:fineTuningJobId
    * @param fineTuningJobId The ID of the fine-tuning job. 
    */
  def retrieveFineTuningJob(fineTuningJobId: String): Action[AnyContent] = Action { request =>
    def executeApi(): FineTuningJob = {
      api.retrieveFineTuningJob(fineTuningJobId)
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
