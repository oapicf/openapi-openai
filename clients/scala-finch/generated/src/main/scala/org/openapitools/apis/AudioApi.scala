package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.BigDecimal
import org.openapitools.models.CreateSpeechRequest
import org.openapitools.models.CreateTranscription200Response
import org.openapitools.models.CreateTranscriptionRequestModel
import org.openapitools.models.CreateTranslation200Response
import java.io.File
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

object AudioApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        createSpeech(da) :+:
        createTranscription(da) :+:
        createTranslation(da)


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
        * @return An endpoint representing a File
        */
        private def createSpeech(da: DataAccessor): Endpoint[File] =
        post("audio" :: "speech" :: jsonBody[CreateSpeechRequest]) { (createSpeechRequest: CreateSpeechRequest) =>
          da.Audio_createSpeech(createSpeechRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CreateTranscription200Response
        */
        private def createTranscription(da: DataAccessor): Endpoint[CreateTranscription200Response] =
        post("audio" :: "transcriptions" :: fileUpload("file") :: paramOption("language") :: paramOption("prompt") :: paramOption("response_format") :: paramOption("temperature").map(_.map(_.toBigDecimal)) :: params("timestamp_granularities[]")) { (file: FileUpload, model: CreateTranscriptionRequestModel, language: Option[String], prompt: Option[String], responseFormat: Option[String], temperature: Option[BigDecimal], timestampGranularitiesLeft_Square_BracketRight_Square_Bracket: Seq[String]) =>
          da.Audio_createTranscription(file, model, language, prompt, responseFormat, temperature, timestampGranularitiesLeft_Square_BracketRight_Square_Bracket) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CreateTranslation200Response
        */
        private def createTranslation(da: DataAccessor): Endpoint[CreateTranslation200Response] =
        post("audio" :: "translations" :: fileUpload("file") :: paramOption("prompt") :: paramOption("response_format") :: paramOption("temperature").map(_.map(_.toBigDecimal))) { (file: FileUpload, model: CreateTranscriptionRequestModel, prompt: Option[String], responseFormat: Option[String], temperature: Option[BigDecimal]) =>
          da.Audio_createTranslation(file, model, prompt, responseFormat, temperature) match {
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
      val file = Files.createTempFile("tmpAudioApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
