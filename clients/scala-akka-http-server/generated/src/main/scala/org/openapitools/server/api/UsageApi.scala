package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.UsageResponse


class UsageApi(
    usageService: UsageApiService,
    usageMarshaller: UsageApiMarshaller
) {

  
  import usageMarshaller._

  lazy val route: Route =
    path("organization" / "usage" / "audio_speeches") { 
      get { 
        parameters("start_time".as[Int], "end_time".as[Int].?, "bucket_width".as[String].?("1d"), "project_ids".as[String].?, "user_ids".as[String].?, "api_key_ids".as[String].?, "models".as[String].?, "group_by".as[String].?, "limit".as[Int].?, "page".as[String].?) { (startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page) => 
            usageService.usageAudioSpeeches(startTime = startTime, endTime = endTime, bucketWidth = bucketWidth, projectIds = projectIds, userIds = userIds, apiKeyIds = apiKeyIds, models = models, groupBy = groupBy, limit = limit, page = page)
        }
      }
    } ~
    path("organization" / "usage" / "audio_transcriptions") { 
      get { 
        parameters("start_time".as[Int], "end_time".as[Int].?, "bucket_width".as[String].?("1d"), "project_ids".as[String].?, "user_ids".as[String].?, "api_key_ids".as[String].?, "models".as[String].?, "group_by".as[String].?, "limit".as[Int].?, "page".as[String].?) { (startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page) => 
            usageService.usageAudioTranscriptions(startTime = startTime, endTime = endTime, bucketWidth = bucketWidth, projectIds = projectIds, userIds = userIds, apiKeyIds = apiKeyIds, models = models, groupBy = groupBy, limit = limit, page = page)
        }
      }
    } ~
    path("organization" / "usage" / "code_interpreter_sessions") { 
      get { 
        parameters("start_time".as[Int], "end_time".as[Int].?, "bucket_width".as[String].?("1d"), "project_ids".as[String].?, "group_by".as[String].?, "limit".as[Int].?, "page".as[String].?) { (startTime, endTime, bucketWidth, projectIds, groupBy, limit, page) => 
            usageService.usageCodeInterpreterSessions(startTime = startTime, endTime = endTime, bucketWidth = bucketWidth, projectIds = projectIds, groupBy = groupBy, limit = limit, page = page)
        }
      }
    } ~
    path("organization" / "usage" / "completions") { 
      get { 
        parameters("start_time".as[Int], "end_time".as[Int].?, "bucket_width".as[String].?("1d"), "project_ids".as[String].?, "user_ids".as[String].?, "api_key_ids".as[String].?, "models".as[String].?, "batch".as[Boolean].?, "group_by".as[String].?, "limit".as[Int].?, "page".as[String].?) { (startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page) => 
            usageService.usageCompletions(startTime = startTime, endTime = endTime, bucketWidth = bucketWidth, projectIds = projectIds, userIds = userIds, apiKeyIds = apiKeyIds, models = models, batch = batch, groupBy = groupBy, limit = limit, page = page)
        }
      }
    } ~
    path("organization" / "costs") { 
      get { 
        parameters("start_time".as[Int], "end_time".as[Int].?, "bucket_width".as[String].?("1d"), "project_ids".as[String].?, "group_by".as[String].?, "limit".as[Int].?(7), "page".as[String].?) { (startTime, endTime, bucketWidth, projectIds, groupBy, limit, page) => 
            usageService.usageCosts(startTime = startTime, endTime = endTime, bucketWidth = bucketWidth, projectIds = projectIds, groupBy = groupBy, limit = limit, page = page)
        }
      }
    } ~
    path("organization" / "usage" / "embeddings") { 
      get { 
        parameters("start_time".as[Int], "end_time".as[Int].?, "bucket_width".as[String].?("1d"), "project_ids".as[String].?, "user_ids".as[String].?, "api_key_ids".as[String].?, "models".as[String].?, "group_by".as[String].?, "limit".as[Int].?, "page".as[String].?) { (startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page) => 
            usageService.usageEmbeddings(startTime = startTime, endTime = endTime, bucketWidth = bucketWidth, projectIds = projectIds, userIds = userIds, apiKeyIds = apiKeyIds, models = models, groupBy = groupBy, limit = limit, page = page)
        }
      }
    } ~
    path("organization" / "usage" / "images") { 
      get { 
        parameters("start_time".as[Int], "end_time".as[Int].?, "bucket_width".as[String].?("1d"), "sources".as[String].?, "sizes".as[String].?, "project_ids".as[String].?, "user_ids".as[String].?, "api_key_ids".as[String].?, "models".as[String].?, "group_by".as[String].?, "limit".as[Int].?, "page".as[String].?) { (startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page) => 
            usageService.usageImages(startTime = startTime, endTime = endTime, bucketWidth = bucketWidth, sources = sources, sizes = sizes, projectIds = projectIds, userIds = userIds, apiKeyIds = apiKeyIds, models = models, groupBy = groupBy, limit = limit, page = page)
        }
      }
    } ~
    path("organization" / "usage" / "moderations") { 
      get { 
        parameters("start_time".as[Int], "end_time".as[Int].?, "bucket_width".as[String].?("1d"), "project_ids".as[String].?, "user_ids".as[String].?, "api_key_ids".as[String].?, "models".as[String].?, "group_by".as[String].?, "limit".as[Int].?, "page".as[String].?) { (startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page) => 
            usageService.usageModerations(startTime = startTime, endTime = endTime, bucketWidth = bucketWidth, projectIds = projectIds, userIds = userIds, apiKeyIds = apiKeyIds, models = models, groupBy = groupBy, limit = limit, page = page)
        }
      }
    } ~
    path("organization" / "usage" / "vector_stores") { 
      get { 
        parameters("start_time".as[Int], "end_time".as[Int].?, "bucket_width".as[String].?("1d"), "project_ids".as[String].?, "group_by".as[String].?, "limit".as[Int].?, "page".as[String].?) { (startTime, endTime, bucketWidth, projectIds, groupBy, limit, page) => 
            usageService.usageVectorStores(startTime = startTime, endTime = endTime, bucketWidth = bucketWidth, projectIds = projectIds, groupBy = groupBy, limit = limit, page = page)
        }
      }
    }
}


trait UsageApiService {

  def usageAudioSpeeches200(responseUsageResponse: UsageResponse)(implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route =
    complete((200, responseUsageResponse))
  /**
   * Code: 200, Message: Usage data retrieved successfully., DataType: UsageResponse
   */
  def usageAudioSpeeches(startTime: Int, endTime: Option[Int], bucketWidth: String, projectIds: Option[String], userIds: Option[String], apiKeyIds: Option[String], models: Option[String], groupBy: Option[String], limit: Option[Int], page: Option[String])
      (implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route

  def usageAudioTranscriptions200(responseUsageResponse: UsageResponse)(implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route =
    complete((200, responseUsageResponse))
  /**
   * Code: 200, Message: Usage data retrieved successfully., DataType: UsageResponse
   */
  def usageAudioTranscriptions(startTime: Int, endTime: Option[Int], bucketWidth: String, projectIds: Option[String], userIds: Option[String], apiKeyIds: Option[String], models: Option[String], groupBy: Option[String], limit: Option[Int], page: Option[String])
      (implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route

  def usageCodeInterpreterSessions200(responseUsageResponse: UsageResponse)(implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route =
    complete((200, responseUsageResponse))
  /**
   * Code: 200, Message: Usage data retrieved successfully., DataType: UsageResponse
   */
  def usageCodeInterpreterSessions(startTime: Int, endTime: Option[Int], bucketWidth: String, projectIds: Option[String], groupBy: Option[String], limit: Option[Int], page: Option[String])
      (implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route

  def usageCompletions200(responseUsageResponse: UsageResponse)(implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route =
    complete((200, responseUsageResponse))
  /**
   * Code: 200, Message: Usage data retrieved successfully., DataType: UsageResponse
   */
  def usageCompletions(startTime: Int, endTime: Option[Int], bucketWidth: String, projectIds: Option[String], userIds: Option[String], apiKeyIds: Option[String], models: Option[String], batch: Option[Boolean], groupBy: Option[String], limit: Option[Int], page: Option[String])
      (implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route

  def usageCosts200(responseUsageResponse: UsageResponse)(implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route =
    complete((200, responseUsageResponse))
  /**
   * Code: 200, Message: Costs data retrieved successfully., DataType: UsageResponse
   */
  def usageCosts(startTime: Int, endTime: Option[Int], bucketWidth: String, projectIds: Option[String], groupBy: Option[String], limit: Int, page: Option[String])
      (implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route

  def usageEmbeddings200(responseUsageResponse: UsageResponse)(implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route =
    complete((200, responseUsageResponse))
  /**
   * Code: 200, Message: Usage data retrieved successfully., DataType: UsageResponse
   */
  def usageEmbeddings(startTime: Int, endTime: Option[Int], bucketWidth: String, projectIds: Option[String], userIds: Option[String], apiKeyIds: Option[String], models: Option[String], groupBy: Option[String], limit: Option[Int], page: Option[String])
      (implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route

  def usageImages200(responseUsageResponse: UsageResponse)(implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route =
    complete((200, responseUsageResponse))
  /**
   * Code: 200, Message: Usage data retrieved successfully., DataType: UsageResponse
   */
  def usageImages(startTime: Int, endTime: Option[Int], bucketWidth: String, sources: Option[String], sizes: Option[String], projectIds: Option[String], userIds: Option[String], apiKeyIds: Option[String], models: Option[String], groupBy: Option[String], limit: Option[Int], page: Option[String])
      (implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route

  def usageModerations200(responseUsageResponse: UsageResponse)(implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route =
    complete((200, responseUsageResponse))
  /**
   * Code: 200, Message: Usage data retrieved successfully., DataType: UsageResponse
   */
  def usageModerations(startTime: Int, endTime: Option[Int], bucketWidth: String, projectIds: Option[String], userIds: Option[String], apiKeyIds: Option[String], models: Option[String], groupBy: Option[String], limit: Option[Int], page: Option[String])
      (implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route

  def usageVectorStores200(responseUsageResponse: UsageResponse)(implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route =
    complete((200, responseUsageResponse))
  /**
   * Code: 200, Message: Usage data retrieved successfully., DataType: UsageResponse
   */
  def usageVectorStores(startTime: Int, endTime: Option[Int], bucketWidth: String, projectIds: Option[String], groupBy: Option[String], limit: Option[Int], page: Option[String])
      (implicit toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]): Route

}

trait UsageApiMarshaller {


  implicit def toEntityMarshallerUsageResponse: ToEntityMarshaller[UsageResponse]

}

