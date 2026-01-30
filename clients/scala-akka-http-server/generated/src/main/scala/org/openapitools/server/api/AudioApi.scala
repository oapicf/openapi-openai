package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.StringDirectives
import org.openapitools.server.MultipartDirectives
import org.openapitools.server.FileField
import org.openapitools.server.PartsAndFiles
import org.openapitools.server.model.AudioResponseFormat
import org.openapitools.server.model.CreateSpeechRequest
import org.openapitools.server.model.CreateTranscription200Response
import org.openapitools.server.model.CreateTranscriptionRequestModel
import org.openapitools.server.model.CreateTranslation200Response
import java.io.File
import scala.util.Try
import akka.http.scaladsl.server.MalformedRequestContentRejection
import akka.http.scaladsl.server.directives.FileInfo


class AudioApi(
    audioService: AudioApiService,
    audioMarshaller: AudioApiMarshaller
)  extends MultipartDirectives with StringDirectives {

  
  import audioMarshaller._

  lazy val route: Route =
    path("audio" / "speech") { 
      post {  
            entity(as[CreateSpeechRequest]){ createSpeechRequest =>
              audioService.createSpeech(createSpeechRequest = createSpeechRequest)
            }
      }
    } ~
    path("audio" / "transcriptions") { 
      post {  
        formAndFiles(FileField("file")),  { partsAndFiles => 
          val _____ : Try[Route] = for {
            file <- optToTry(partsAndFiles.files.get("file"), s"File file missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
            stringFields("model".as[CreateTranscriptionRequestModel], "language".as[String].?, "prompt".as[String].?, "response_format".as[AudioResponseFormat].?, "temperature".as[Double].?, "timestamp_granularities[]".as[Seq[String]].?) { (model, language, prompt, responseFormat, temperature, timestampGranularitiesLeft_Square_BracketRight_Square_Bracket) =>
              audioService.createTranscription(file = file, model = model, language = language, prompt = prompt, responseFormat = responseFormat, temperature = temperature, timestampGranularitiesLeft_Square_BracketRight_Square_Bracket = timestampGranularitiesLeft_Square_BracketRight_Square_Bracket)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
      }
    } ~
    path("audio" / "translations") { 
      post {  
        formAndFiles(FileField("file")) { partsAndFiles => 
          val _____ : Try[Route] = for {
            file <- optToTry(partsAndFiles.files.get("file"), s"File file missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
            stringFields("model".as[CreateTranscriptionRequestModel], "prompt".as[String].?, "response_format".as[AudioResponseFormat].?, "temperature".as[Double].?) { (model, prompt, responseFormat, temperature) =>
              audioService.createTranslation(file = file, model = model, prompt = prompt, responseFormat = responseFormat, temperature = temperature)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
      }
    }
}


trait AudioApiService {

  def createSpeech200(responseFile: File)(implicit toEntityMarshallerFile: ToEntityMarshaller[File]): Route =
    complete((200, responseFile))
  /**
   * Code: 200, Message: OK, DataType: File
   */
  def createSpeech(createSpeechRequest: CreateSpeechRequest)
      (implicit toEntityMarshallerFile: ToEntityMarshaller[File]): Route

  def createTranscription200(responseCreateTranscription200Response: CreateTranscription200Response)(implicit toEntityMarshallerCreateTranscription200Response: ToEntityMarshaller[CreateTranscription200Response]): Route =
    complete((200, responseCreateTranscription200Response))
  /**
   * Code: 200, Message: OK, DataType: CreateTranscription200Response
   */
  def createTranscription(file: (FileInfo, File), model: CreateTranscriptionRequestModel, language: Option[String], prompt: Option[String], responseFormat: Option[AudioResponseFormat], temperature: Option[Double], timestampGranularitiesLeft_Square_BracketRight_Square_Bracket: Option[Seq[String]])
      (implicit toEntityMarshallerCreateTranscription200Response: ToEntityMarshaller[CreateTranscription200Response]): Route

  def createTranslation200(responseCreateTranslation200Response: CreateTranslation200Response)(implicit toEntityMarshallerCreateTranslation200Response: ToEntityMarshaller[CreateTranslation200Response]): Route =
    complete((200, responseCreateTranslation200Response))
  /**
   * Code: 200, Message: OK, DataType: CreateTranslation200Response
   */
  def createTranslation(file: (FileInfo, File), model: CreateTranscriptionRequestModel, prompt: Option[String], responseFormat: Option[AudioResponseFormat], temperature: Option[Double])
      (implicit toEntityMarshallerCreateTranslation200Response: ToEntityMarshaller[CreateTranslation200Response]): Route

}

trait AudioApiMarshaller {
  implicit def fromEntityUnmarshallerCreateSpeechRequest: FromEntityUnmarshaller[CreateSpeechRequest]


  implicit def fromStringUnmarshallerStringList: FromStringUnmarshaller[Seq[String]]

  implicit def fromStringUnmarshallerAudioResponseFormat: FromStringUnmarshaller[AudioResponseFormat]

  implicit def fromStringUnmarshallerCreateTranscriptionRequestModel: FromStringUnmarshaller[CreateTranscriptionRequestModel]


  implicit def toEntityMarshallerCreateTranslation200Response: ToEntityMarshaller[CreateTranslation200Response]

  implicit def toEntityMarshallerCreateTranscription200Response: ToEntityMarshaller[CreateTranscription200Response]

  implicit def toEntityMarshallerFile: ToEntityMarshaller[File]

}

