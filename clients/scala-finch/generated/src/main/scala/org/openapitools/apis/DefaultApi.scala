package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.AdminApiKey
import org.openapitools.models.AdminApiKeysCreateRequest
import org.openapitools.models.AdminApiKeysDelete200Response
import org.openapitools.models.ApiKeyList
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

object DefaultApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        adminApiKeysCreate(da) :+:
        adminApiKeysDelete(da) :+:
        adminApiKeysGet(da) :+:
        adminApiKeysList(da)


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
        * @return An endpoint representing a AdminApiKey
        */
        private def adminApiKeysCreate(da: DataAccessor): Endpoint[AdminApiKey] =
        post("organization" :: "admin_api_keys" :: jsonBody[AdminApiKeysCreateRequest]) { (adminApiKeysCreateRequest: AdminApiKeysCreateRequest) =>
          da.Default_adminApiKeysCreate(adminApiKeysCreateRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdminApiKeysDelete200Response
        */
        private def adminApiKeysDelete(da: DataAccessor): Endpoint[AdminApiKeysDelete200Response] =
        delete("organization" :: "admin_api_keys" :: string) { (keyId: String) =>
          da.Default_adminApiKeysDelete(keyId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a AdminApiKey
        */
        private def adminApiKeysGet(da: DataAccessor): Endpoint[AdminApiKey] =
        get("organization" :: "admin_api_keys" :: string) { (keyId: String) =>
          da.Default_adminApiKeysGet(keyId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ApiKeyList
        */
        private def adminApiKeysList(da: DataAccessor): Endpoint[ApiKeyList] =
        get("organization" :: "admin_api_keys" :: paramOption("after") :: paramOption("order") :: paramOption("limit").map(_.map(_.toInt))) { (after: Option[String], order: Option[String], limit: Option[Int]) =>
          da.Default_adminApiKeysList(after, order, limit) match {
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
      val file = Files.createTempFile("tmpDefaultApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
