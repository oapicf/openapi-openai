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

import org.openapitools.client.api.CreateFineTuningJobRequest
import org.openapitools.client.api.FineTuningJob
import org.openapitools.client.api.ListFineTuningJobCheckpointsResponse
import org.openapitools.client.api.ListFineTuningJobEventsResponse
import org.openapitools.client.api.ListPaginatedFineTuningJobsResponse

object FineTuningApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def cancelFineTuningJob(host: String, fineTuningJobId: String): Task[FineTuningJob] = {
    implicit val returnTypeDecoder: EntityDecoder[FineTuningJob] = jsonOf[FineTuningJob]

    val path = "/fine_tuning/jobs/{fine_tuning_job_id}/cancel".replaceAll("\\{" + "fine_tuning_job_id" + "\\}",escape(fineTuningJobId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[FineTuningJob](req)

    } yield resp
  }

  def createFineTuningJob(host: String, createFineTuningJobRequest: CreateFineTuningJobRequest): Task[FineTuningJob] = {
    implicit val returnTypeDecoder: EntityDecoder[FineTuningJob] = jsonOf[FineTuningJob]

    val path = "/fine_tuning/jobs"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createFineTuningJobRequest)
      resp          <- client.expect[FineTuningJob](req)

    } yield resp
  }

  def listFineTuningEvents(host: String, fineTuningJobId: String, after: String, limit: Integer = 20)(implicit afterQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[ListFineTuningJobEventsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListFineTuningJobEventsResponse] = jsonOf[ListFineTuningJobEventsResponse]

    val path = "/fine_tuning/jobs/{fine_tuning_job_id}/events".replaceAll("\\{" + "fine_tuning_job_id" + "\\}",escape(fineTuningJobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("after", Some(afterQuery.toParamString(after))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListFineTuningJobEventsResponse](req)

    } yield resp
  }

  def listFineTuningJobCheckpoints(host: String, fineTuningJobId: String, after: String, limit: Integer = 10)(implicit afterQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[ListFineTuningJobCheckpointsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListFineTuningJobCheckpointsResponse] = jsonOf[ListFineTuningJobCheckpointsResponse]

    val path = "/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints".replaceAll("\\{" + "fine_tuning_job_id" + "\\}",escape(fineTuningJobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("after", Some(afterQuery.toParamString(after))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListFineTuningJobCheckpointsResponse](req)

    } yield resp
  }

  def listPaginatedFineTuningJobs(host: String, after: String, limit: Integer = 20)(implicit afterQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[ListPaginatedFineTuningJobsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListPaginatedFineTuningJobsResponse] = jsonOf[ListPaginatedFineTuningJobsResponse]

    val path = "/fine_tuning/jobs"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("after", Some(afterQuery.toParamString(after))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListPaginatedFineTuningJobsResponse](req)

    } yield resp
  }

  def retrieveFineTuningJob(host: String, fineTuningJobId: String): Task[FineTuningJob] = {
    implicit val returnTypeDecoder: EntityDecoder[FineTuningJob] = jsonOf[FineTuningJob]

    val path = "/fine_tuning/jobs/{fine_tuning_job_id}".replaceAll("\\{" + "fine_tuning_job_id" + "\\}",escape(fineTuningJobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[FineTuningJob](req)

    } yield resp
  }

}

class HttpServiceFineTuningApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def cancelFineTuningJob(fineTuningJobId: String): Task[FineTuningJob] = {
    implicit val returnTypeDecoder: EntityDecoder[FineTuningJob] = jsonOf[FineTuningJob]

    val path = "/fine_tuning/jobs/{fine_tuning_job_id}/cancel".replaceAll("\\{" + "fine_tuning_job_id" + "\\}",escape(fineTuningJobId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[FineTuningJob](req)

    } yield resp
  }

  def createFineTuningJob(createFineTuningJobRequest: CreateFineTuningJobRequest): Task[FineTuningJob] = {
    implicit val returnTypeDecoder: EntityDecoder[FineTuningJob] = jsonOf[FineTuningJob]

    val path = "/fine_tuning/jobs"

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(createFineTuningJobRequest)
      resp          <- client.expect[FineTuningJob](req)

    } yield resp
  }

  def listFineTuningEvents(fineTuningJobId: String, after: String, limit: Integer = 20)(implicit afterQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[ListFineTuningJobEventsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListFineTuningJobEventsResponse] = jsonOf[ListFineTuningJobEventsResponse]

    val path = "/fine_tuning/jobs/{fine_tuning_job_id}/events".replaceAll("\\{" + "fine_tuning_job_id" + "\\}",escape(fineTuningJobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("after", Some(afterQuery.toParamString(after))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListFineTuningJobEventsResponse](req)

    } yield resp
  }

  def listFineTuningJobCheckpoints(fineTuningJobId: String, after: String, limit: Integer = 10)(implicit afterQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[ListFineTuningJobCheckpointsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListFineTuningJobCheckpointsResponse] = jsonOf[ListFineTuningJobCheckpointsResponse]

    val path = "/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints".replaceAll("\\{" + "fine_tuning_job_id" + "\\}",escape(fineTuningJobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("after", Some(afterQuery.toParamString(after))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListFineTuningJobCheckpointsResponse](req)

    } yield resp
  }

  def listPaginatedFineTuningJobs(after: String, limit: Integer = 20)(implicit afterQuery: QueryParam[String], limitQuery: QueryParam[Integer]): Task[ListPaginatedFineTuningJobsResponse] = {
    implicit val returnTypeDecoder: EntityDecoder[ListPaginatedFineTuningJobsResponse] = jsonOf[ListPaginatedFineTuningJobsResponse]

    val path = "/fine_tuning/jobs"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("after", Some(afterQuery.toParamString(after))), ("limit", Some(limitQuery.toParamString(limit))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListPaginatedFineTuningJobsResponse](req)

    } yield resp
  }

  def retrieveFineTuningJob(fineTuningJobId: String): Task[FineTuningJob] = {
    implicit val returnTypeDecoder: EntityDecoder[FineTuningJob] = jsonOf[FineTuningJob]

    val path = "/fine_tuning/jobs/{fine_tuning_job_id}".replaceAll("\\{" + "fine_tuning_job_id" + "\\}",escape(fineTuningJobId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[FineTuningJob](req)

    } yield resp
  }

}
