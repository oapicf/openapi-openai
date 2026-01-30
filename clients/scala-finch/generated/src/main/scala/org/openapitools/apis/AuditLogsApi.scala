package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AuditLogEventType
import org.openapitools.models.ListAuditLogsEffectiveAtParameter
import org.openapitools.models.ListAuditLogsResponse
import scala.collection.immutable.Seq
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

object AuditLogsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        listAuditLogs(da)


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
        * @return An endpoint representing a ListAuditLogsResponse
        */
        private def listAuditLogs(da: DataAccessor): Endpoint[ListAuditLogsResponse] =
        get("organization" :: "audit_logs" :: paramOption("effective_at").map(_.map(_.toListAuditLogsEffectiveAtParameter)) :: params("project_ids[]") :: params("event_types[]") :: params("actor_ids[]") :: params("actor_emails[]") :: params("resource_ids[]") :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("after") :: paramOption("before")) { (effectiveAt: Option[ListAuditLogsEffectiveAtParameter], projectIdsLeft_Square_BracketRight_Square_Bracket: Seq[String], eventTypesLeft_Square_BracketRight_Square_Bracket: Seq[AuditLogEventType], actorIdsLeft_Square_BracketRight_Square_Bracket: Seq[String], actorEmailsLeft_Square_BracketRight_Square_Bracket: Seq[String], resourceIdsLeft_Square_BracketRight_Square_Bracket: Seq[String], limit: Option[Int], after: Option[String], before: Option[String]) =>
          da.AuditLogs_listAuditLogs(effectiveAt, projectIdsLeft_Square_BracketRight_Square_Bracket, eventTypesLeft_Square_BracketRight_Square_Bracket, actorIdsLeft_Square_BracketRight_Square_Bracket, actorEmailsLeft_Square_BracketRight_Square_Bracket, resourceIdsLeft_Square_BracketRight_Square_Bracket, limit, after, before) match {
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
      val file = Files.createTempFile("tmpAuditLogsApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
