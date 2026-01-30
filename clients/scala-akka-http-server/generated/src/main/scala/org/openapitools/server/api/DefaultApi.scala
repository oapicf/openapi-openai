package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdminApiKey
import org.openapitools.server.model.AdminApiKeysCreateRequest
import org.openapitools.server.model.AdminApiKeysDelete200Response
import org.openapitools.server.model.ApiKeyList


class DefaultApi(
    defaultService: DefaultApiService,
    defaultMarshaller: DefaultApiMarshaller
) {

  
  import defaultMarshaller._

  lazy val route: Route =
    path("organization" / "admin_api_keys") { 
      post {  
            entity(as[AdminApiKeysCreateRequest]){ adminApiKeysCreateRequest =>
              defaultService.adminApiKeysCreate(adminApiKeysCreateRequest = adminApiKeysCreateRequest)
            }
      }
    } ~
    path("organization" / "admin_api_keys" / Segment) { (keyId) => 
      delete {  
            defaultService.adminApiKeysDelete(keyId = keyId)
      }
    } ~
    path("organization" / "admin_api_keys" / Segment) { (keyId) => 
      get {  
            defaultService.adminApiKeysGet(keyId = keyId)
      }
    } ~
    path("organization" / "admin_api_keys") { 
      get { 
        parameters("after".as[String].?, "order".as[String].?("asc"), "limit".as[Int].?(20)) { (after, order, limit) => 
            defaultService.adminApiKeysList(after = after, order = order, limit = limit)
        }
      }
    }
}


trait DefaultApiService {

  def adminApiKeysCreate200(responseAdminApiKey: AdminApiKey)(implicit toEntityMarshallerAdminApiKey: ToEntityMarshaller[AdminApiKey]): Route =
    complete((200, responseAdminApiKey))
  /**
   * Code: 200, Message: The newly created admin API key., DataType: AdminApiKey
   */
  def adminApiKeysCreate(adminApiKeysCreateRequest: AdminApiKeysCreateRequest)
      (implicit toEntityMarshallerAdminApiKey: ToEntityMarshaller[AdminApiKey]): Route

  def adminApiKeysDelete200(responseAdminApiKeysDelete200Response: AdminApiKeysDelete200Response)(implicit toEntityMarshallerAdminApiKeysDelete200Response: ToEntityMarshaller[AdminApiKeysDelete200Response]): Route =
    complete((200, responseAdminApiKeysDelete200Response))
  /**
   * Code: 200, Message: Confirmation that the API key was deleted., DataType: AdminApiKeysDelete200Response
   */
  def adminApiKeysDelete(keyId: String)
      (implicit toEntityMarshallerAdminApiKeysDelete200Response: ToEntityMarshaller[AdminApiKeysDelete200Response]): Route

  def adminApiKeysGet200(responseAdminApiKey: AdminApiKey)(implicit toEntityMarshallerAdminApiKey: ToEntityMarshaller[AdminApiKey]): Route =
    complete((200, responseAdminApiKey))
  /**
   * Code: 200, Message: Details of the requested API key., DataType: AdminApiKey
   */
  def adminApiKeysGet(keyId: String)
      (implicit toEntityMarshallerAdminApiKey: ToEntityMarshaller[AdminApiKey]): Route

  def adminApiKeysList200(responseApiKeyList: ApiKeyList)(implicit toEntityMarshallerApiKeyList: ToEntityMarshaller[ApiKeyList]): Route =
    complete((200, responseApiKeyList))
  /**
   * Code: 200, Message: A list of organization API keys., DataType: ApiKeyList
   */
  def adminApiKeysList(after: Option[String], order: String, limit: Int)
      (implicit toEntityMarshallerApiKeyList: ToEntityMarshaller[ApiKeyList]): Route

}

trait DefaultApiMarshaller {
  implicit def fromEntityUnmarshallerAdminApiKeysCreateRequest: FromEntityUnmarshaller[AdminApiKeysCreateRequest]



  implicit def toEntityMarshallerApiKeyList: ToEntityMarshaller[ApiKeyList]

  implicit def toEntityMarshallerAdminApiKey: ToEntityMarshaller[AdminApiKey]

  implicit def toEntityMarshallerAdminApiKeysDelete200Response: ToEntityMarshaller[AdminApiKeysDelete200Response]

}

