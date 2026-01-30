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
import org.openapitools.server.model.CompleteUploadRequest
import org.openapitools.server.model.CreateUploadRequest
import java.io.File
import org.openapitools.server.model.Upload
import org.openapitools.server.model.UploadPart
import scala.util.Try
import akka.http.scaladsl.server.MalformedRequestContentRejection
import akka.http.scaladsl.server.directives.FileInfo


class UploadsApi(
    uploadsService: UploadsApiService,
    uploadsMarshaller: UploadsApiMarshaller
)  extends MultipartDirectives with StringDirectives {

  
  import uploadsMarshaller._

  lazy val route: Route =
    path("uploads" / Segment / "parts") { (uploadId) => 
      post {  
        formAndFiles(FileField("data")),  { partsAndFiles => 
          val _____ : Try[Route] = for {
            data <- optToTry(partsAndFiles.files.get("data"), s"File data missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
              uploadsService.addUploadPart(uploadId = uploadId, data = data)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
      }
    } ~
    path("uploads" / Segment / "cancel") { (uploadId) => 
      post {  
            uploadsService.cancelUpload(uploadId = uploadId)
      }
    } ~
    path("uploads" / Segment / "complete") { (uploadId) => 
      post {  
            entity(as[CompleteUploadRequest]){ completeUploadRequest =>
              uploadsService.completeUpload(uploadId = uploadId, completeUploadRequest = completeUploadRequest)
            }
      }
    } ~
    path("uploads") { 
      post {  
            entity(as[CreateUploadRequest]){ createUploadRequest =>
              uploadsService.createUpload(createUploadRequest = createUploadRequest)
            }
      }
    }
}


trait UploadsApiService {

  def addUploadPart200(responseUploadPart: UploadPart)(implicit toEntityMarshallerUploadPart: ToEntityMarshaller[UploadPart]): Route =
    complete((200, responseUploadPart))
  /**
   * Code: 200, Message: OK, DataType: UploadPart
   */
  def addUploadPart(uploadId: String, data: (FileInfo, File))
      (implicit toEntityMarshallerUploadPart: ToEntityMarshaller[UploadPart]): Route

  def cancelUpload200(responseUpload: Upload)(implicit toEntityMarshallerUpload: ToEntityMarshaller[Upload]): Route =
    complete((200, responseUpload))
  /**
   * Code: 200, Message: OK, DataType: Upload
   */
  def cancelUpload(uploadId: String)
      (implicit toEntityMarshallerUpload: ToEntityMarshaller[Upload]): Route

  def completeUpload200(responseUpload: Upload)(implicit toEntityMarshallerUpload: ToEntityMarshaller[Upload]): Route =
    complete((200, responseUpload))
  /**
   * Code: 200, Message: OK, DataType: Upload
   */
  def completeUpload(uploadId: String, completeUploadRequest: CompleteUploadRequest)
      (implicit toEntityMarshallerUpload: ToEntityMarshaller[Upload]): Route

  def createUpload200(responseUpload: Upload)(implicit toEntityMarshallerUpload: ToEntityMarshaller[Upload]): Route =
    complete((200, responseUpload))
  /**
   * Code: 200, Message: OK, DataType: Upload
   */
  def createUpload(createUploadRequest: CreateUploadRequest)
      (implicit toEntityMarshallerUpload: ToEntityMarshaller[Upload]): Route

}

trait UploadsApiMarshaller {
  implicit def fromEntityUnmarshallerCompleteUploadRequest: FromEntityUnmarshaller[CompleteUploadRequest]

  implicit def fromEntityUnmarshallerCreateUploadRequest: FromEntityUnmarshaller[CreateUploadRequest]



  implicit def toEntityMarshallerUploadPart: ToEntityMarshaller[UploadPart]

  implicit def toEntityMarshallerUpload: ToEntityMarshaller[Upload]

}

