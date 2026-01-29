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
import org.openapitools.server.model.CreateImageEditRequestModel
import org.openapitools.server.model.CreateImageRequest
import java.io.File
import org.openapitools.server.model.ImagesResponse
import scala.util.Try
import akka.http.scaladsl.server.MalformedRequestContentRejection
import akka.http.scaladsl.server.directives.FileInfo


class ImagesApi(
    imagesService: ImagesApiService,
    imagesMarshaller: ImagesApiMarshaller
)  extends MultipartDirectives with StringDirectives {

  
  import imagesMarshaller._

  lazy val route: Route =
    path("images" / "generations") { 
      post {  
            entity(as[CreateImageRequest]){ createImageRequest =>
              imagesService.createImage(createImageRequest = createImageRequest)
            }
      }
    } ~
    path("images" / "edits") { 
      post {  
        formAndFiles(FileField("image"))FileField("mask")),  { partsAndFiles => 
          val _____ : Try[Route] = for {
            image <- optToTry(partsAndFiles.files.get("image"), s"File image missing")
mask <- optToTry(partsAndFiles.files.get("mask"), s"File mask missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
            stringFields("prompt".as[String], "model".as[CreateImageEditRequestModel].?, "n".as[Int].?, "size".as[String].?, "response_format".as[String].?, "user".as[String].?) { (prompt, model, n, size, responseFormat, user) =>
              imagesService.createImageEdit(image = image, prompt = prompt, mask = mask, model = model, n = n, size = size, responseFormat = responseFormat, user = user)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
      }
    } ~
    path("images" / "variations") { 
      post {  
        formAndFiles(FileField("image")) { partsAndFiles => 
          val _____ : Try[Route] = for {
            image <- optToTry(partsAndFiles.files.get("image"), s"File image missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
            stringFields("model".as[CreateImageEditRequestModel].?, "n".as[Int].?, "response_format".as[String].?, "size".as[String].?, "user".as[String].?) { (model, n, responseFormat, size, user) =>
              imagesService.createImageVariation(image = image, model = model, n = n, responseFormat = responseFormat, size = size, user = user)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
      }
    }
}


trait ImagesApiService {

  def createImage200(responseImagesResponse: ImagesResponse)(implicit toEntityMarshallerImagesResponse: ToEntityMarshaller[ImagesResponse]): Route =
    complete((200, responseImagesResponse))
  /**
   * Code: 200, Message: OK, DataType: ImagesResponse
   */
  def createImage(createImageRequest: CreateImageRequest)
      (implicit toEntityMarshallerImagesResponse: ToEntityMarshaller[ImagesResponse]): Route

  def createImageEdit200(responseImagesResponse: ImagesResponse)(implicit toEntityMarshallerImagesResponse: ToEntityMarshaller[ImagesResponse]): Route =
    complete((200, responseImagesResponse))
  /**
   * Code: 200, Message: OK, DataType: ImagesResponse
   */
  def createImageEdit(image: (FileInfo, File), prompt: String, mask: (FileInfo, File), model: Option[CreateImageEditRequestModel], n: Option[Int], size: Option[String], responseFormat: Option[String], user: Option[String])
      (implicit toEntityMarshallerImagesResponse: ToEntityMarshaller[ImagesResponse]): Route

  def createImageVariation200(responseImagesResponse: ImagesResponse)(implicit toEntityMarshallerImagesResponse: ToEntityMarshaller[ImagesResponse]): Route =
    complete((200, responseImagesResponse))
  /**
   * Code: 200, Message: OK, DataType: ImagesResponse
   */
  def createImageVariation(image: (FileInfo, File), model: Option[CreateImageEditRequestModel], n: Option[Int], responseFormat: Option[String], size: Option[String], user: Option[String])
      (implicit toEntityMarshallerImagesResponse: ToEntityMarshaller[ImagesResponse]): Route

}

trait ImagesApiMarshaller {
  implicit def fromEntityUnmarshallerCreateImageRequest: FromEntityUnmarshaller[CreateImageRequest]


  implicit def fromStringUnmarshallerCreateImageEditRequestModel: FromStringUnmarshaller[CreateImageEditRequestModel]


  implicit def toEntityMarshallerImagesResponse: ToEntityMarshaller[ImagesResponse]

}

