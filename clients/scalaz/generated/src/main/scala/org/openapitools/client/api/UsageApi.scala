package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.UsageResponse

object UsageApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def usageAudioSpeeches(host: String, startTime: Integer, endTime: Integer, bucketWidth: String = 1d, projectIds: List[String] = List.empty[String] , userIds: List[String] = List.empty[String] , apiKeyIds: List[String] = List.empty[String] , models: List[String] = List.empty[String] , groupBy: List[String] = List.empty[String] , limit: Integer, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], projectIdsQuery: QueryParam[List[String]], userIdsQuery: QueryParam[List[String]], apiKeyIdsQuery: QueryParam[List[String]], modelsQuery: QueryParam[List[String]], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/usage/audio_speeches"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("userIds", Some(user_idsQuery.toParamString(user_ids))), ("apiKeyIds", Some(api_key_idsQuery.toParamString(api_key_ids))), ("models", Some(modelsQuery.toParamString(models))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

  def usageAudioTranscriptions(host: String, startTime: Integer, endTime: Integer, bucketWidth: String = 1d, projectIds: List[String] = List.empty[String] , userIds: List[String] = List.empty[String] , apiKeyIds: List[String] = List.empty[String] , models: List[String] = List.empty[String] , groupBy: List[String] = List.empty[String] , limit: Integer, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], projectIdsQuery: QueryParam[List[String]], userIdsQuery: QueryParam[List[String]], apiKeyIdsQuery: QueryParam[List[String]], modelsQuery: QueryParam[List[String]], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/usage/audio_transcriptions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("userIds", Some(user_idsQuery.toParamString(user_ids))), ("apiKeyIds", Some(api_key_idsQuery.toParamString(api_key_ids))), ("models", Some(modelsQuery.toParamString(models))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

  def usageCodeInterpreterSessions(host: String, startTime: Integer, endTime: Integer, bucketWidth: String = 1d, projectIds: List[String] = List.empty[String] , groupBy: List[String] = List.empty[String] , limit: Integer, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], projectIdsQuery: QueryParam[List[String]], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/usage/code_interpreter_sessions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

  def usageCompletions(host: String, startTime: Integer, endTime: Integer, bucketWidth: String = 1d, projectIds: List[String] = List.empty[String] , userIds: List[String] = List.empty[String] , apiKeyIds: List[String] = List.empty[String] , models: List[String] = List.empty[String] , batch: Boolean, groupBy: List[String] = List.empty[String] , limit: Integer, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], projectIdsQuery: QueryParam[List[String]], userIdsQuery: QueryParam[List[String]], apiKeyIdsQuery: QueryParam[List[String]], modelsQuery: QueryParam[List[String]], batchQuery: QueryParam[Boolean], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/usage/completions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("userIds", Some(user_idsQuery.toParamString(user_ids))), ("apiKeyIds", Some(api_key_idsQuery.toParamString(api_key_ids))), ("models", Some(modelsQuery.toParamString(models))), ("batch", Some(batchQuery.toParamString(batch))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

  def usageCosts(host: String, startTime: Integer, endTime: Integer, bucketWidth: String = 1d, projectIds: List[String] = List.empty[String] , groupBy: List[String] = List.empty[String] , limit: Integer = 7, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], projectIdsQuery: QueryParam[List[String]], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/costs"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

  def usageEmbeddings(host: String, startTime: Integer, endTime: Integer, bucketWidth: String = 1d, projectIds: List[String] = List.empty[String] , userIds: List[String] = List.empty[String] , apiKeyIds: List[String] = List.empty[String] , models: List[String] = List.empty[String] , groupBy: List[String] = List.empty[String] , limit: Integer, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], projectIdsQuery: QueryParam[List[String]], userIdsQuery: QueryParam[List[String]], apiKeyIdsQuery: QueryParam[List[String]], modelsQuery: QueryParam[List[String]], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/usage/embeddings"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("userIds", Some(user_idsQuery.toParamString(user_ids))), ("apiKeyIds", Some(api_key_idsQuery.toParamString(api_key_ids))), ("models", Some(modelsQuery.toParamString(models))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

  def usageImages(host: String, startTime: Integer, endTime: Integer, bucketWidth: String = 1d, sources: List[String] = List.empty[String] , sizes: List[String] = List.empty[String] , projectIds: List[String] = List.empty[String] , userIds: List[String] = List.empty[String] , apiKeyIds: List[String] = List.empty[String] , models: List[String] = List.empty[String] , groupBy: List[String] = List.empty[String] , limit: Integer, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], sourcesQuery: QueryParam[List[String]], sizesQuery: QueryParam[List[String]], projectIdsQuery: QueryParam[List[String]], userIdsQuery: QueryParam[List[String]], apiKeyIdsQuery: QueryParam[List[String]], modelsQuery: QueryParam[List[String]], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/usage/images"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("sources", Some(sourcesQuery.toParamString(sources))), ("sizes", Some(sizesQuery.toParamString(sizes))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("userIds", Some(user_idsQuery.toParamString(user_ids))), ("apiKeyIds", Some(api_key_idsQuery.toParamString(api_key_ids))), ("models", Some(modelsQuery.toParamString(models))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

  def usageModerations(host: String, startTime: Integer, endTime: Integer, bucketWidth: String = 1d, projectIds: List[String] = List.empty[String] , userIds: List[String] = List.empty[String] , apiKeyIds: List[String] = List.empty[String] , models: List[String] = List.empty[String] , groupBy: List[String] = List.empty[String] , limit: Integer, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], projectIdsQuery: QueryParam[List[String]], userIdsQuery: QueryParam[List[String]], apiKeyIdsQuery: QueryParam[List[String]], modelsQuery: QueryParam[List[String]], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/usage/moderations"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("userIds", Some(user_idsQuery.toParamString(user_ids))), ("apiKeyIds", Some(api_key_idsQuery.toParamString(api_key_ids))), ("models", Some(modelsQuery.toParamString(models))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

  def usageVectorStores(host: String, startTime: Integer, endTime: Integer, bucketWidth: String = 1d, projectIds: List[String] = List.empty[String] , groupBy: List[String] = List.empty[String] , limit: Integer, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], projectIdsQuery: QueryParam[List[String]], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/usage/vector_stores"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

}

class HttpServiceUsageApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def usageAudioSpeeches(startTime: Integer, endTime: Integer, bucketWidth: String = 1d, projectIds: List[String] = List.empty[String] , userIds: List[String] = List.empty[String] , apiKeyIds: List[String] = List.empty[String] , models: List[String] = List.empty[String] , groupBy: List[String] = List.empty[String] , limit: Integer, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], projectIdsQuery: QueryParam[List[String]], userIdsQuery: QueryParam[List[String]], apiKeyIdsQuery: QueryParam[List[String]], modelsQuery: QueryParam[List[String]], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/usage/audio_speeches"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("userIds", Some(user_idsQuery.toParamString(user_ids))), ("apiKeyIds", Some(api_key_idsQuery.toParamString(api_key_ids))), ("models", Some(modelsQuery.toParamString(models))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

  def usageAudioTranscriptions(startTime: Integer, endTime: Integer, bucketWidth: String = 1d, projectIds: List[String] = List.empty[String] , userIds: List[String] = List.empty[String] , apiKeyIds: List[String] = List.empty[String] , models: List[String] = List.empty[String] , groupBy: List[String] = List.empty[String] , limit: Integer, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], projectIdsQuery: QueryParam[List[String]], userIdsQuery: QueryParam[List[String]], apiKeyIdsQuery: QueryParam[List[String]], modelsQuery: QueryParam[List[String]], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/usage/audio_transcriptions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("userIds", Some(user_idsQuery.toParamString(user_ids))), ("apiKeyIds", Some(api_key_idsQuery.toParamString(api_key_ids))), ("models", Some(modelsQuery.toParamString(models))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

  def usageCodeInterpreterSessions(startTime: Integer, endTime: Integer, bucketWidth: String = 1d, projectIds: List[String] = List.empty[String] , groupBy: List[String] = List.empty[String] , limit: Integer, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], projectIdsQuery: QueryParam[List[String]], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/usage/code_interpreter_sessions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

  def usageCompletions(startTime: Integer, endTime: Integer, bucketWidth: String = 1d, projectIds: List[String] = List.empty[String] , userIds: List[String] = List.empty[String] , apiKeyIds: List[String] = List.empty[String] , models: List[String] = List.empty[String] , batch: Boolean, groupBy: List[String] = List.empty[String] , limit: Integer, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], projectIdsQuery: QueryParam[List[String]], userIdsQuery: QueryParam[List[String]], apiKeyIdsQuery: QueryParam[List[String]], modelsQuery: QueryParam[List[String]], batchQuery: QueryParam[Boolean], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/usage/completions"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("userIds", Some(user_idsQuery.toParamString(user_ids))), ("apiKeyIds", Some(api_key_idsQuery.toParamString(api_key_ids))), ("models", Some(modelsQuery.toParamString(models))), ("batch", Some(batchQuery.toParamString(batch))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

  def usageCosts(startTime: Integer, endTime: Integer, bucketWidth: String = 1d, projectIds: List[String] = List.empty[String] , groupBy: List[String] = List.empty[String] , limit: Integer = 7, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], projectIdsQuery: QueryParam[List[String]], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/costs"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

  def usageEmbeddings(startTime: Integer, endTime: Integer, bucketWidth: String = 1d, projectIds: List[String] = List.empty[String] , userIds: List[String] = List.empty[String] , apiKeyIds: List[String] = List.empty[String] , models: List[String] = List.empty[String] , groupBy: List[String] = List.empty[String] , limit: Integer, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], projectIdsQuery: QueryParam[List[String]], userIdsQuery: QueryParam[List[String]], apiKeyIdsQuery: QueryParam[List[String]], modelsQuery: QueryParam[List[String]], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/usage/embeddings"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("userIds", Some(user_idsQuery.toParamString(user_ids))), ("apiKeyIds", Some(api_key_idsQuery.toParamString(api_key_ids))), ("models", Some(modelsQuery.toParamString(models))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

  def usageImages(startTime: Integer, endTime: Integer, bucketWidth: String = 1d, sources: List[String] = List.empty[String] , sizes: List[String] = List.empty[String] , projectIds: List[String] = List.empty[String] , userIds: List[String] = List.empty[String] , apiKeyIds: List[String] = List.empty[String] , models: List[String] = List.empty[String] , groupBy: List[String] = List.empty[String] , limit: Integer, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], sourcesQuery: QueryParam[List[String]], sizesQuery: QueryParam[List[String]], projectIdsQuery: QueryParam[List[String]], userIdsQuery: QueryParam[List[String]], apiKeyIdsQuery: QueryParam[List[String]], modelsQuery: QueryParam[List[String]], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/usage/images"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("sources", Some(sourcesQuery.toParamString(sources))), ("sizes", Some(sizesQuery.toParamString(sizes))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("userIds", Some(user_idsQuery.toParamString(user_ids))), ("apiKeyIds", Some(api_key_idsQuery.toParamString(api_key_ids))), ("models", Some(modelsQuery.toParamString(models))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

  def usageModerations(startTime: Integer, endTime: Integer, bucketWidth: String = 1d, projectIds: List[String] = List.empty[String] , userIds: List[String] = List.empty[String] , apiKeyIds: List[String] = List.empty[String] , models: List[String] = List.empty[String] , groupBy: List[String] = List.empty[String] , limit: Integer, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], projectIdsQuery: QueryParam[List[String]], userIdsQuery: QueryParam[List[String]], apiKeyIdsQuery: QueryParam[List[String]], modelsQuery: QueryParam[List[String]], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/usage/moderations"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("userIds", Some(user_idsQuery.toParamString(user_ids))), ("apiKeyIds", Some(api_key_idsQuery.toParamString(api_key_ids))), ("models", Some(modelsQuery.toParamString(models))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

  def usageVectorStores(startTime: Integer, endTime: Integer, bucketWidth: String = 1d, projectIds: List[String] = List.empty[String] , groupBy: List[String] = List.empty[String] , limit: Integer, page: String)(implicit startTimeQuery: QueryParam[Integer], endTimeQuery: QueryParam[Integer], bucketWidthQuery: QueryParam[String], projectIdsQuery: QueryParam[List[String]], groupByQuery: QueryParam[List[String]], limitQuery: QueryParam[Integer], pageQuery: QueryParam[String]): Task[UsageResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]

    val path = "/organization/usage/vector_stores"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("startTime", Some(start_timeQuery.toParamString(start_time))), ("endTime", Some(end_timeQuery.toParamString(end_time))), ("bucketWidth", Some(bucket_widthQuery.toParamString(bucket_width))), ("projectIds", Some(project_idsQuery.toParamString(project_ids))), ("groupBy", Some(group_byQuery.toParamString(group_by))), ("limit", Some(limitQuery.toParamString(limit))), ("page", Some(pageQuery.toParamString(page))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[UsageResponse](req)

    } yield resp
  }

}
