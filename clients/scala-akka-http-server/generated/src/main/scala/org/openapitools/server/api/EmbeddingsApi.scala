package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CreateEmbeddingRequest
import org.openapitools.server.model.CreateEmbeddingResponse


class EmbeddingsApi(
    embeddingsService: EmbeddingsApiService,
    embeddingsMarshaller: EmbeddingsApiMarshaller
) {

  
  import embeddingsMarshaller._

  lazy val route: Route =
    path("embeddings") { 
      post {  
            entity(as[CreateEmbeddingRequest]){ createEmbeddingRequest =>
              embeddingsService.createEmbedding(createEmbeddingRequest = createEmbeddingRequest)
            }
      }
    }
}


trait EmbeddingsApiService {

  def createEmbedding200(responseCreateEmbeddingResponse: CreateEmbeddingResponse)(implicit toEntityMarshallerCreateEmbeddingResponse: ToEntityMarshaller[CreateEmbeddingResponse]): Route =
    complete((200, responseCreateEmbeddingResponse))
  /**
   * Code: 200, Message: OK, DataType: CreateEmbeddingResponse
   */
  def createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest)
      (implicit toEntityMarshallerCreateEmbeddingResponse: ToEntityMarshaller[CreateEmbeddingResponse]): Route

}

trait EmbeddingsApiMarshaller {
  implicit def fromEntityUnmarshallerCreateEmbeddingRequest: FromEntityUnmarshaller[CreateEmbeddingRequest]



  implicit def toEntityMarshallerCreateEmbeddingResponse: ToEntityMarshaller[CreateEmbeddingResponse]

}

