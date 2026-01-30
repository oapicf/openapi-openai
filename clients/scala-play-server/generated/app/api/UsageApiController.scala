package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.UsageResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class UsageApiController @Inject()(cc: ControllerComponents, api: UsageApi) extends AbstractController(cc) {
  /**
    * GET /v1/organization/usage/audio_speeches?startTime=[value]&endTime=[value]&bucketWidth=[value]&projectIds=[value]&userIds=[value]&apiKeyIds=[value]&models=[value]&groupBy=[value]&limit=[value]&page=[value]
    */
  def usageAudioSpeeches(): Action[AnyContent] = Action { request =>
    def executeApi(): UsageResponse = {
      val startTime = request.getQueryString("start_time")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start_time", "query string")
        }
        
      val endTime = request.getQueryString("end_time")
        .map(value => value.toInt)
        
      val bucketWidth = request.getQueryString("bucket_width")
        
      val projectIds = request.queryString.get("project_ids")
        .map(_.toList)
        
      val userIds = request.queryString.get("user_ids")
        .map(_.toList)
        
      val apiKeyIds = request.queryString.get("api_key_ids")
        .map(_.toList)
        
      val models = request.queryString.get("models")
        .map(_.toList)
        
      val groupBy = request.queryString.get("group_by")
        .map(_.toList)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val page = request.getQueryString("page")
        
      api.usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/usage/audio_transcriptions?startTime=[value]&endTime=[value]&bucketWidth=[value]&projectIds=[value]&userIds=[value]&apiKeyIds=[value]&models=[value]&groupBy=[value]&limit=[value]&page=[value]
    */
  def usageAudioTranscriptions(): Action[AnyContent] = Action { request =>
    def executeApi(): UsageResponse = {
      val startTime = request.getQueryString("start_time")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start_time", "query string")
        }
        
      val endTime = request.getQueryString("end_time")
        .map(value => value.toInt)
        
      val bucketWidth = request.getQueryString("bucket_width")
        
      val projectIds = request.queryString.get("project_ids")
        .map(_.toList)
        
      val userIds = request.queryString.get("user_ids")
        .map(_.toList)
        
      val apiKeyIds = request.queryString.get("api_key_ids")
        .map(_.toList)
        
      val models = request.queryString.get("models")
        .map(_.toList)
        
      val groupBy = request.queryString.get("group_by")
        .map(_.toList)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val page = request.getQueryString("page")
        
      api.usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/usage/code_interpreter_sessions?startTime=[value]&endTime=[value]&bucketWidth=[value]&projectIds=[value]&groupBy=[value]&limit=[value]&page=[value]
    */
  def usageCodeInterpreterSessions(): Action[AnyContent] = Action { request =>
    def executeApi(): UsageResponse = {
      val startTime = request.getQueryString("start_time")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start_time", "query string")
        }
        
      val endTime = request.getQueryString("end_time")
        .map(value => value.toInt)
        
      val bucketWidth = request.getQueryString("bucket_width")
        
      val projectIds = request.queryString.get("project_ids")
        .map(_.toList)
        
      val groupBy = request.queryString.get("group_by")
        .map(_.toList)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val page = request.getQueryString("page")
        
      api.usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/usage/completions?startTime=[value]&endTime=[value]&bucketWidth=[value]&projectIds=[value]&userIds=[value]&apiKeyIds=[value]&models=[value]&batch=[value]&groupBy=[value]&limit=[value]&page=[value]
    */
  def usageCompletions(): Action[AnyContent] = Action { request =>
    def executeApi(): UsageResponse = {
      val startTime = request.getQueryString("start_time")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start_time", "query string")
        }
        
      val endTime = request.getQueryString("end_time")
        .map(value => value.toInt)
        
      val bucketWidth = request.getQueryString("bucket_width")
        
      val projectIds = request.queryString.get("project_ids")
        .map(_.toList)
        
      val userIds = request.queryString.get("user_ids")
        .map(_.toList)
        
      val apiKeyIds = request.queryString.get("api_key_ids")
        .map(_.toList)
        
      val models = request.queryString.get("models")
        .map(_.toList)
        
      val batch = request.getQueryString("batch")
        .map(value => value.toBoolean)
        
      val groupBy = request.queryString.get("group_by")
        .map(_.toList)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val page = request.getQueryString("page")
        
      api.usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/costs?startTime=[value]&endTime=[value]&bucketWidth=[value]&projectIds=[value]&groupBy=[value]&limit=[value]&page=[value]
    */
  def usageCosts(): Action[AnyContent] = Action { request =>
    def executeApi(): UsageResponse = {
      val startTime = request.getQueryString("start_time")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start_time", "query string")
        }
        
      val endTime = request.getQueryString("end_time")
        .map(value => value.toInt)
        
      val bucketWidth = request.getQueryString("bucket_width")
        
      val projectIds = request.queryString.get("project_ids")
        .map(_.toList)
        
      val groupBy = request.queryString.get("group_by")
        .map(_.toList)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val page = request.getQueryString("page")
        
      api.usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/usage/embeddings?startTime=[value]&endTime=[value]&bucketWidth=[value]&projectIds=[value]&userIds=[value]&apiKeyIds=[value]&models=[value]&groupBy=[value]&limit=[value]&page=[value]
    */
  def usageEmbeddings(): Action[AnyContent] = Action { request =>
    def executeApi(): UsageResponse = {
      val startTime = request.getQueryString("start_time")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start_time", "query string")
        }
        
      val endTime = request.getQueryString("end_time")
        .map(value => value.toInt)
        
      val bucketWidth = request.getQueryString("bucket_width")
        
      val projectIds = request.queryString.get("project_ids")
        .map(_.toList)
        
      val userIds = request.queryString.get("user_ids")
        .map(_.toList)
        
      val apiKeyIds = request.queryString.get("api_key_ids")
        .map(_.toList)
        
      val models = request.queryString.get("models")
        .map(_.toList)
        
      val groupBy = request.queryString.get("group_by")
        .map(_.toList)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val page = request.getQueryString("page")
        
      api.usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/usage/images?startTime=[value]&endTime=[value]&bucketWidth=[value]&sources=[value]&sizes=[value]&projectIds=[value]&userIds=[value]&apiKeyIds=[value]&models=[value]&groupBy=[value]&limit=[value]&page=[value]
    */
  def usageImages(): Action[AnyContent] = Action { request =>
    def executeApi(): UsageResponse = {
      val startTime = request.getQueryString("start_time")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start_time", "query string")
        }
        
      val endTime = request.getQueryString("end_time")
        .map(value => value.toInt)
        
      val bucketWidth = request.getQueryString("bucket_width")
        
      val sources = request.queryString.get("sources")
        .map(_.toList)
        
      val sizes = request.queryString.get("sizes")
        .map(_.toList)
        
      val projectIds = request.queryString.get("project_ids")
        .map(_.toList)
        
      val userIds = request.queryString.get("user_ids")
        .map(_.toList)
        
      val apiKeyIds = request.queryString.get("api_key_ids")
        .map(_.toList)
        
      val models = request.queryString.get("models")
        .map(_.toList)
        
      val groupBy = request.queryString.get("group_by")
        .map(_.toList)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val page = request.getQueryString("page")
        
      api.usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/usage/moderations?startTime=[value]&endTime=[value]&bucketWidth=[value]&projectIds=[value]&userIds=[value]&apiKeyIds=[value]&models=[value]&groupBy=[value]&limit=[value]&page=[value]
    */
  def usageModerations(): Action[AnyContent] = Action { request =>
    def executeApi(): UsageResponse = {
      val startTime = request.getQueryString("start_time")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start_time", "query string")
        }
        
      val endTime = request.getQueryString("end_time")
        .map(value => value.toInt)
        
      val bucketWidth = request.getQueryString("bucket_width")
        
      val projectIds = request.queryString.get("project_ids")
        .map(_.toList)
        
      val userIds = request.queryString.get("user_ids")
        .map(_.toList)
        
      val apiKeyIds = request.queryString.get("api_key_ids")
        .map(_.toList)
        
      val models = request.queryString.get("models")
        .map(_.toList)
        
      val groupBy = request.queryString.get("group_by")
        .map(_.toList)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val page = request.getQueryString("page")
        
      api.usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/organization/usage/vector_stores?startTime=[value]&endTime=[value]&bucketWidth=[value]&projectIds=[value]&groupBy=[value]&limit=[value]&page=[value]
    */
  def usageVectorStores(): Action[AnyContent] = Action { request =>
    def executeApi(): UsageResponse = {
      val startTime = request.getQueryString("start_time")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start_time", "query string")
        }
        
      val endTime = request.getQueryString("end_time")
        .map(value => value.toInt)
        
      val bucketWidth = request.getQueryString("bucket_width")
        
      val projectIds = request.queryString.get("project_ids")
        .map(_.toList)
        
      val groupBy = request.queryString.get("group_by")
        .map(_.toList)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val page = request.getQueryString("page")
        
      api.usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)
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
