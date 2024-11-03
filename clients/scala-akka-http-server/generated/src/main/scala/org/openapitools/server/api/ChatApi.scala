package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CreateChatCompletionRequest
import org.openapitools.server.model.CreateChatCompletionResponse


class ChatApi(
    chatService: ChatApiService,
    chatMarshaller: ChatApiMarshaller
) {

  
  import chatMarshaller._

  lazy val route: Route =
    path("chat" / "completions") { 
      post {  
            entity(as[CreateChatCompletionRequest]){ createChatCompletionRequest =>
              chatService.createChatCompletion(createChatCompletionRequest = createChatCompletionRequest)
            }
      }
    }
}


trait ChatApiService {

  def createChatCompletion200(responseCreateChatCompletionResponse: CreateChatCompletionResponse)(implicit toEntityMarshallerCreateChatCompletionResponse: ToEntityMarshaller[CreateChatCompletionResponse]): Route =
    complete((200, responseCreateChatCompletionResponse))
  /**
   * Code: 200, Message: OK, DataType: CreateChatCompletionResponse
   */
  def createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest)
      (implicit toEntityMarshallerCreateChatCompletionResponse: ToEntityMarshaller[CreateChatCompletionResponse]): Route

}

trait ChatApiMarshaller {
  implicit def fromEntityUnmarshallerCreateChatCompletionRequest: FromEntityUnmarshaller[CreateChatCompletionRequest]



  implicit def toEntityMarshallerCreateChatCompletionResponse: ToEntityMarshaller[CreateChatCompletionResponse]

}

