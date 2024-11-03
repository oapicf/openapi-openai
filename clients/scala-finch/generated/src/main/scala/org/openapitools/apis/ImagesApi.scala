package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.CreateImageEditRequestModel
import org.openapitools.models.CreateImageRequest
import java.io.File
import org.openapitools.models.ImagesResponse
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

object ImagesApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        createImage(da) :+:
        createImageEdit(da) :+:
        createImageVariation(da)


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
        * @return An endpoint representing a ImagesResponse
        */
        private def createImage(da: DataAccessor): Endpoint[ImagesResponse] =
        post("images" :: "generations" :: jsonBody[CreateImageRequest]) { (createImageRequest: CreateImageRequest) =>
          da.Images_createImage(createImageRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ImagesResponse
        */
        private def createImageEdit(da: DataAccessor): Endpoint[ImagesResponse] =
        post("images" :: "edits" :: fileUpload("image") :: string :: fileUpload("mask") :: paramOption("n").map(_.map(_.toInt)) :: paramOption("size") :: paramOption("response_format") :: paramOption("user")) { (image: FileUpload, prompt: String, mask: FileUpload, model: CreateImageEditRequestModel, n: Option[Int], size: Option[String], responseFormat: Option[String], user: Option[String]) =>
          da.Images_createImageEdit(image, prompt, mask, model, n, size, responseFormat, user) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ImagesResponse
        */
        private def createImageVariation(da: DataAccessor): Endpoint[ImagesResponse] =
        post("images" :: "variations" :: fileUpload("image") :: paramOption("n").map(_.map(_.toInt)) :: paramOption("response_format") :: paramOption("size") :: paramOption("user")) { (image: FileUpload, model: CreateImageEditRequestModel, n: Option[Int], responseFormat: Option[String], size: Option[String], user: Option[String]) =>
          da.Images_createImageVariation(image, model, n, responseFormat, size, user) match {
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
      val file = Files.createTempFile("tmpImagesApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
