package org.openapitools.apis

import java.io._
import org.openapitools._
import org.openapitools.models._
import org.openapitools.models.CreateVectorStoreFileBatchRequest
import org.openapitools.models.CreateVectorStoreFileRequest
import org.openapitools.models.CreateVectorStoreRequest
import org.openapitools.models.DeleteVectorStoreFileResponse
import org.openapitools.models.DeleteVectorStoreResponse
import org.openapitools.models.ListVectorStoreFilesResponse
import org.openapitools.models.ListVectorStoresResponse
import org.openapitools.models.UpdateVectorStoreRequest
import org.openapitools.models.VectorStoreFileBatchObject
import org.openapitools.models.VectorStoreFileObject
import org.openapitools.models.VectorStoreObject
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

object VectorStoresApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        cancelVectorStoreFileBatch(da) :+:
        createVectorStore(da) :+:
        createVectorStoreFile(da) :+:
        createVectorStoreFileBatch(da) :+:
        deleteVectorStore(da) :+:
        deleteVectorStoreFile(da) :+:
        getVectorStore(da) :+:
        getVectorStoreFile(da) :+:
        getVectorStoreFileBatch(da) :+:
        listFilesInVectorStoreBatch(da) :+:
        listVectorStoreFiles(da) :+:
        listVectorStores(da) :+:
        modifyVectorStore(da)


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
        * @return An endpoint representing a VectorStoreFileBatchObject
        */
        private def cancelVectorStoreFileBatch(da: DataAccessor): Endpoint[VectorStoreFileBatchObject] =
        post("vector_stores" :: string :: "file_batches" :: string :: "cancel") { (vectorStoreId: String, batchId: String) =>
          da.VectorStores_cancelVectorStoreFileBatch(vectorStoreId, batchId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a VectorStoreObject
        */
        private def createVectorStore(da: DataAccessor): Endpoint[VectorStoreObject] =
        post("vector_stores" :: jsonBody[CreateVectorStoreRequest]) { (createVectorStoreRequest: CreateVectorStoreRequest) =>
          da.VectorStores_createVectorStore(createVectorStoreRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a VectorStoreFileObject
        */
        private def createVectorStoreFile(da: DataAccessor): Endpoint[VectorStoreFileObject] =
        post("vector_stores" :: string :: "files" :: jsonBody[CreateVectorStoreFileRequest]) { (vectorStoreId: String, createVectorStoreFileRequest: CreateVectorStoreFileRequest) =>
          da.VectorStores_createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a VectorStoreFileBatchObject
        */
        private def createVectorStoreFileBatch(da: DataAccessor): Endpoint[VectorStoreFileBatchObject] =
        post("vector_stores" :: string :: "file_batches" :: jsonBody[CreateVectorStoreFileBatchRequest]) { (vectorStoreId: String, createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest) =>
          da.VectorStores_createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeleteVectorStoreResponse
        */
        private def deleteVectorStore(da: DataAccessor): Endpoint[DeleteVectorStoreResponse] =
        delete("vector_stores" :: string) { (vectorStoreId: String) =>
          da.VectorStores_deleteVectorStore(vectorStoreId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a DeleteVectorStoreFileResponse
        */
        private def deleteVectorStoreFile(da: DataAccessor): Endpoint[DeleteVectorStoreFileResponse] =
        delete("vector_stores" :: string :: "files" :: string) { (vectorStoreId: String, fileId: String) =>
          da.VectorStores_deleteVectorStoreFile(vectorStoreId, fileId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a VectorStoreObject
        */
        private def getVectorStore(da: DataAccessor): Endpoint[VectorStoreObject] =
        get("vector_stores" :: string) { (vectorStoreId: String) =>
          da.VectorStores_getVectorStore(vectorStoreId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a VectorStoreFileObject
        */
        private def getVectorStoreFile(da: DataAccessor): Endpoint[VectorStoreFileObject] =
        get("vector_stores" :: string :: "files" :: string) { (vectorStoreId: String, fileId: String) =>
          da.VectorStores_getVectorStoreFile(vectorStoreId, fileId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a VectorStoreFileBatchObject
        */
        private def getVectorStoreFileBatch(da: DataAccessor): Endpoint[VectorStoreFileBatchObject] =
        get("vector_stores" :: string :: "file_batches" :: string) { (vectorStoreId: String, batchId: String) =>
          da.VectorStores_getVectorStoreFileBatch(vectorStoreId, batchId) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ListVectorStoreFilesResponse
        */
        private def listFilesInVectorStoreBatch(da: DataAccessor): Endpoint[ListVectorStoreFilesResponse] =
        get("vector_stores" :: string :: "file_batches" :: string :: "files" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("after") :: paramOption("before") :: paramOption("filter")) { (vectorStoreId: String, batchId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String], filter: Option[String]) =>
          da.VectorStores_listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ListVectorStoreFilesResponse
        */
        private def listVectorStoreFiles(da: DataAccessor): Endpoint[ListVectorStoreFilesResponse] =
        get("vector_stores" :: string :: "files" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("after") :: paramOption("before") :: paramOption("filter")) { (vectorStoreId: String, limit: Option[Int], order: Option[String], after: Option[String], before: Option[String], filter: Option[String]) =>
          da.VectorStores_listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a ListVectorStoresResponse
        */
        private def listVectorStores(da: DataAccessor): Endpoint[ListVectorStoresResponse] =
        get("vector_stores" :: paramOption("limit").map(_.map(_.toInt)) :: paramOption("order") :: paramOption("after") :: paramOption("before")) { (limit: Option[Int], order: Option[String], after: Option[String], before: Option[String]) =>
          da.VectorStores_listVectorStores(limit, order, after, before) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a VectorStoreObject
        */
        private def modifyVectorStore(da: DataAccessor): Endpoint[VectorStoreObject] =
        post("vector_stores" :: string :: jsonBody[UpdateVectorStoreRequest]) { (vectorStoreId: String, updateVectorStoreRequest: UpdateVectorStoreRequest) =>
          da.VectorStores_modifyVectorStore(vectorStoreId, updateVectorStoreRequest) match {
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
      val file = Files.createTempFile("tmpVectorStoresApi", null).toFile
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
