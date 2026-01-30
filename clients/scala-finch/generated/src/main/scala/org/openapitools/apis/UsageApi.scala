package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import scala.collection.immutable.Seq
import org.openapitools.models.UsageResponse
import io.finch.circe._
import io.circe.generic.semiauto._
import com.twitter.concurrent.AsyncStream
import com.twitter.finagle.Service
import com.twitter.finagle.Http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}
import com.twitter.util.Future
import com.twitter.io.Buf
import io.finch._, items._
import java.io.File
import java.nio.file.Files
import java.time._

object UsageApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        usageAudioSpeeches(da) :+:
        usageAudioTranscriptions(da) :+:
        usageCodeInterpreterSessions(da) :+:
        usageCompletions(da) :+:
        usageCosts(da) :+:
        usageEmbeddings(da) :+:
        usageImages(da) :+:
        usageModerations(da) :+:
        usageVectorStores(da)


    private def checkError(e: CommonError) = e match {
      case InvalidInput(_) => BadRequest(e)
      case MissingIdentifier(_) => BadRequest(e)
      case RecordNotFound(_) => NotFound(e)
      case _ => InternalServerError(e)
    }

    implicit class StringOps(s: String) {

      import java.time.format.DateTimeFormatter

      lazy val localformatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      lazy val datetimeformatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

      def toLocalDateTime: LocalDateTime = LocalDateTime.parse(s,localformatter)
      def toZonedDateTime: ZonedDateTime = ZonedDateTime.parse(s, datetimeformatter)

    }

        /**
        * 
        * @return An endpoint representing a UsageResponse
        */
        private def usageAudioSpeeches(da: DataAccessor): Endpoint[UsageResponse] =
        get("organization" :: "usage" :: "audio_speeches" :: param("start_time").map(_.toInt) :: paramOption("end_time").map(_.map(_.toInt)) :: paramOption("bucket_width") :: params("project_ids") :: params("user_ids") :: params("api_key_ids") :: params("models") :: params("group_by") :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("page")) { (startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Seq[String], userIds: Seq[String], apiKeyIds: Seq[String], models: Seq[String], groupBy: Seq[String], limit: Option[Int], page: Option[String]) =>
          da.Usage_usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UsageResponse
        */
        private def usageAudioTranscriptions(da: DataAccessor): Endpoint[UsageResponse] =
        get("organization" :: "usage" :: "audio_transcriptions" :: param("start_time").map(_.toInt) :: paramOption("end_time").map(_.map(_.toInt)) :: paramOption("bucket_width") :: params("project_ids") :: params("user_ids") :: params("api_key_ids") :: params("models") :: params("group_by") :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("page")) { (startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Seq[String], userIds: Seq[String], apiKeyIds: Seq[String], models: Seq[String], groupBy: Seq[String], limit: Option[Int], page: Option[String]) =>
          da.Usage_usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UsageResponse
        */
        private def usageCodeInterpreterSessions(da: DataAccessor): Endpoint[UsageResponse] =
        get("organization" :: "usage" :: "code_interpreter_sessions" :: param("start_time").map(_.toInt) :: paramOption("end_time").map(_.map(_.toInt)) :: paramOption("bucket_width") :: params("project_ids") :: params("group_by") :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("page")) { (startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Seq[String], groupBy: Seq[String], limit: Option[Int], page: Option[String]) =>
          da.Usage_usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UsageResponse
        */
        private def usageCompletions(da: DataAccessor): Endpoint[UsageResponse] =
        get("organization" :: "usage" :: "completions" :: param("start_time").map(_.toInt) :: paramOption("end_time").map(_.map(_.toInt)) :: paramOption("bucket_width") :: params("project_ids") :: params("user_ids") :: params("api_key_ids") :: params("models") :: paramOption("batch").map(_.map(_.toBoolean)) :: params("group_by") :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("page")) { (startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Seq[String], userIds: Seq[String], apiKeyIds: Seq[String], models: Seq[String], batch: Option[Boolean], groupBy: Seq[String], limit: Option[Int], page: Option[String]) =>
          da.Usage_usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UsageResponse
        */
        private def usageCosts(da: DataAccessor): Endpoint[UsageResponse] =
        get("organization" :: "costs" :: param("start_time").map(_.toInt) :: paramOption("end_time").map(_.map(_.toInt)) :: paramOption("bucket_width") :: params("project_ids") :: params("group_by") :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("page")) { (startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Seq[String], groupBy: Seq[String], limit: Option[Int], page: Option[String]) =>
          da.Usage_usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UsageResponse
        */
        private def usageEmbeddings(da: DataAccessor): Endpoint[UsageResponse] =
        get("organization" :: "usage" :: "embeddings" :: param("start_time").map(_.toInt) :: paramOption("end_time").map(_.map(_.toInt)) :: paramOption("bucket_width") :: params("project_ids") :: params("user_ids") :: params("api_key_ids") :: params("models") :: params("group_by") :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("page")) { (startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Seq[String], userIds: Seq[String], apiKeyIds: Seq[String], models: Seq[String], groupBy: Seq[String], limit: Option[Int], page: Option[String]) =>
          da.Usage_usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UsageResponse
        */
        private def usageImages(da: DataAccessor): Endpoint[UsageResponse] =
        get("organization" :: "usage" :: "images" :: param("start_time").map(_.toInt) :: paramOption("end_time").map(_.map(_.toInt)) :: paramOption("bucket_width") :: params("sources") :: params("sizes") :: params("project_ids") :: params("user_ids") :: params("api_key_ids") :: params("models") :: params("group_by") :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("page")) { (startTime: Int, endTime: Option[Int], bucketWidth: Option[String], sources: Seq[String], sizes: Seq[String], projectIds: Seq[String], userIds: Seq[String], apiKeyIds: Seq[String], models: Seq[String], groupBy: Seq[String], limit: Option[Int], page: Option[String]) =>
          da.Usage_usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UsageResponse
        */
        private def usageModerations(da: DataAccessor): Endpoint[UsageResponse] =
        get("organization" :: "usage" :: "moderations" :: param("start_time").map(_.toInt) :: paramOption("end_time").map(_.map(_.toInt)) :: paramOption("bucket_width") :: params("project_ids") :: params("user_ids") :: params("api_key_ids") :: params("models") :: params("group_by") :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("page")) { (startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Seq[String], userIds: Seq[String], apiKeyIds: Seq[String], models: Seq[String], groupBy: Seq[String], limit: Option[Int], page: Option[String]) =>
          da.Usage_usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a UsageResponse
        */
        private def usageVectorStores(da: DataAccessor): Endpoint[UsageResponse] =
        get("organization" :: "usage" :: "vector_stores" :: param("start_time").map(_.toInt) :: paramOption("end_time").map(_.map(_.toInt)) :: paramOption("bucket_width") :: params("project_ids") :: params("group_by") :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("page")) { (startTime: Int, endTime: Option[Int], bucketWidth: Option[String], projectIds: Seq[String], groupBy: Seq[String], limit: Option[Int], page: Option[String]) =>
          da.Usage_usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }


    implicit private def fileUploadToFile(fileUpload: FileUpload) : File = {
      fileUpload match {
        case upload: InMemoryFileUpload =>
          bytesToFile(Buf.ByteArray.Owned.extract(upload.content))
        case upload: OnDiskFileUpload =>
          upload.content
        case _ => null
      }
    }

    private def bytesToFile(input: Array[Byte]): java.io.File = {
      val file = Files.createTempFile("tmpUsageApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
