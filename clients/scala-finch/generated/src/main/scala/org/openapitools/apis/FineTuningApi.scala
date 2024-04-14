package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.CreateFineTuningJobRequest
import org.openapitools.models.FineTuningJob
import org.openapitools.models.ListFineTuningJobCheckpointsResponse
import org.openapitools.models.ListFineTuningJobEventsResponse
import org.openapitools.models.ListPaginatedFineTuningJobsResponse
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

object FineTuningApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        cancelFineTuningJob(da) :+:
        createFineTuningJob(da) :+:
        listFineTuningEvents(da) :+:
        listFineTuningJobCheckpoints(da) :+:
        listPaginatedFineTuningJobs(da) :+:
        retrieveFineTuningJob(da)


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
        * @return An endpoint representing a FineTuningJob
        */
        private def cancelFineTuningJob(da: DataAccessor): Endpoint[FineTuningJob] =
        post("fine_tuning" :: "jobs" :: string :: "cancel") { (fineTuningJobId: String) =>
          da.FineTuning_cancelFineTuningJob(fineTuningJobId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a FineTuningJob
        */
        private def createFineTuningJob(da: DataAccessor): Endpoint[FineTuningJob] =
        post("fine_tuning" :: "jobs" :: jsonBody[CreateFineTuningJobRequest]) { (createFineTuningJobRequest: CreateFineTuningJobRequest) =>
          da.FineTuning_createFineTuningJob(createFineTuningJobRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ListFineTuningJobEventsResponse
        */
        private def listFineTuningEvents(da: DataAccessor): Endpoint[ListFineTuningJobEventsResponse] =
        get("fine_tuning" :: "jobs" :: string :: "events" :: paramOption("after") :: paramOption("limit").map(_.map(_.toInt))) { (fineTuningJobId: String, after: Option[String], limit: Option[Int]) =>
          da.FineTuning_listFineTuningEvents(fineTuningJobId, after, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ListFineTuningJobCheckpointsResponse
        */
        private def listFineTuningJobCheckpoints(da: DataAccessor): Endpoint[ListFineTuningJobCheckpointsResponse] =
        get("fine_tuning" :: "jobs" :: string :: "checkpoints" :: paramOption("after") :: paramOption("limit").map(_.map(_.toInt))) { (fineTuningJobId: String, after: Option[String], limit: Option[Int]) =>
          da.FineTuning_listFineTuningJobCheckpoints(fineTuningJobId, after, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ListPaginatedFineTuningJobsResponse
        */
        private def listPaginatedFineTuningJobs(da: DataAccessor): Endpoint[ListPaginatedFineTuningJobsResponse] =
        get("fine_tuning" :: "jobs" :: paramOption("after") :: paramOption("limit").map(_.map(_.toInt))) { (after: Option[String], limit: Option[Int]) =>
          da.FineTuning_listPaginatedFineTuningJobs(after, limit) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a FineTuningJob
        */
        private def retrieveFineTuningJob(da: DataAccessor): Endpoint[FineTuningJob] =
        get("fine_tuning" :: "jobs" :: string) { (fineTuningJobId: String) =>
          da.FineTuning_retrieveFineTuningJob(fineTuningJobId) match {
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
      val file = Files.createTempFile("tmpFineTuningApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
