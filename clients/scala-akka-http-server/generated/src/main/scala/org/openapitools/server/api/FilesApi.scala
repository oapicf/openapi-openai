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
import org.openapitools.server.model.DeleteFileResponse
import java.io.File
import org.openapitools.server.model.ListFilesResponse
import org.openapitools.server.model.OpenAIFile
import scala.util.Try
import akka.http.scaladsl.server.MalformedRequestContentRejection
import akka.http.scaladsl.server.directives.FileInfo


class FilesApi(
    filesService: FilesApiService,
    filesMarshaller: FilesApiMarshaller
)  extends MultipartDirectives with StringDirectives {

  
  import filesMarshaller._

  lazy val route: Route =
    path("files") { 
      post {  
        formAndFiles(FileField("file")),  { partsAndFiles => 
          val _____ : Try[Route] = for {
            file <- optToTry(partsAndFiles.files.get("file"), s"File file missing")
          } yield { 
            implicit val vp: StringValueProvider = partsAndFiles.form
            stringFields("purpose".as[String]) { (purpose) =>
              filesService.createFile(file = file, purpose = purpose)
            }
          }
          _____.fold[Route](t => reject(MalformedRequestContentRejection("Missing file.", t)), identity)
        }
      }
    } ~
    path("files" / Segment) { (fileId) => 
      delete {  
            filesService.deleteFile(fileId = fileId)
      }
    } ~
    path("files" / Segment / "content") { (fileId) => 
      get {  
            filesService.downloadFile(fileId = fileId)
      }
    } ~
    path("files") { 
      get { 
        parameters("purpose".as[String].?) { (purpose) => 
            filesService.listFiles(purpose = purpose)
        }
      }
    } ~
    path("files" / Segment) { (fileId) => 
      get {  
            filesService.retrieveFile(fileId = fileId)
      }
    }
}


trait FilesApiService {

  def createFile200(responseOpenAIFile: OpenAIFile)(implicit toEntityMarshallerOpenAIFile: ToEntityMarshaller[OpenAIFile]): Route =
    complete((200, responseOpenAIFile))
  /**
   * Code: 200, Message: OK, DataType: OpenAIFile
   */
  def createFile(file: (FileInfo, File), purpose: String)
      (implicit toEntityMarshallerOpenAIFile: ToEntityMarshaller[OpenAIFile]): Route

  def deleteFile200(responseDeleteFileResponse: DeleteFileResponse)(implicit toEntityMarshallerDeleteFileResponse: ToEntityMarshaller[DeleteFileResponse]): Route =
    complete((200, responseDeleteFileResponse))
  /**
   * Code: 200, Message: OK, DataType: DeleteFileResponse
   */
  def deleteFile(fileId: String)
      (implicit toEntityMarshallerDeleteFileResponse: ToEntityMarshaller[DeleteFileResponse]): Route

  def downloadFile200(responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((200, responseString))
  /**
   * Code: 200, Message: OK, DataType: String
   */
  def downloadFile(fileId: String): Route

  def listFiles200(responseListFilesResponse: ListFilesResponse)(implicit toEntityMarshallerListFilesResponse: ToEntityMarshaller[ListFilesResponse]): Route =
    complete((200, responseListFilesResponse))
  /**
   * Code: 200, Message: OK, DataType: ListFilesResponse
   */
  def listFiles(purpose: Option[String])
      (implicit toEntityMarshallerListFilesResponse: ToEntityMarshaller[ListFilesResponse]): Route

  def retrieveFile200(responseOpenAIFile: OpenAIFile)(implicit toEntityMarshallerOpenAIFile: ToEntityMarshaller[OpenAIFile]): Route =
    complete((200, responseOpenAIFile))
  /**
   * Code: 200, Message: OK, DataType: OpenAIFile
   */
  def retrieveFile(fileId: String)
      (implicit toEntityMarshallerOpenAIFile: ToEntityMarshaller[OpenAIFile]): Route

}

trait FilesApiMarshaller {


  implicit def toEntityMarshallerDeleteFileResponse: ToEntityMarshaller[DeleteFileResponse]

  implicit def toEntityMarshallerOpenAIFile: ToEntityMarshaller[OpenAIFile]

  implicit def toEntityMarshallerListFilesResponse: ToEntityMarshaller[ListFilesResponse]

}

