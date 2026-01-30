package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.DeleteFileResponse
import java.io.File
import org.openapitools.models.ListFilesResponse
import org.openapitools.models.OpenAIFile
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

object FilesApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        createFile(da) :+:
        deleteFile(da) :+:
        downloadFile(da) :+:
        listFiles(da) :+:
        retrieveFile(da)


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
        * @return An endpoint representing a OpenAIFile
        */
        private def createFile(da: DataAccessor): Endpoint[OpenAIFile] =
        post("files" :: fileUpload("file") :: string) { (file: FileUpload, purpose: String) =>
          da.Files_createFile(file, purpose) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeleteFileResponse
        */
        private def deleteFile(da: DataAccessor): Endpoint[DeleteFileResponse] =
        delete("files" :: string) { (fileId: String) =>
          da.Files_deleteFile(fileId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a String
        */
        private def downloadFile(da: DataAccessor): Endpoint[String] =
        get("files" :: string :: "content") { (fileId: String) =>
          da.Files_downloadFile(fileId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ListFilesResponse
        */
        private def listFiles(da: DataAccessor): Endpoint[ListFilesResponse] =
        get("files" :: paramOption("purpose") :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("after")) { (purpose: Option[String], limit: Option[Int], order: Option[String], after: Option[String]) =>
          da.Files_listFiles(purpose, limit, order, after) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a OpenAIFile
        */
        private def retrieveFile(da: DataAccessor): Endpoint[OpenAIFile] =
        get("files" :: string) { (fileId: String) =>
          da.Files_retrieveFile(fileId) match {
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
      val file = Files.createTempFile("tmpFilesApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
