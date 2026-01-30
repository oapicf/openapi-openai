package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.User
import org.openapitools.server.model.UserDeleteResponse
import org.openapitools.server.model.UserListResponse
import org.openapitools.server.model.UserRoleUpdateRequest


class UsersApi(
    usersService: UsersApiService,
    usersMarshaller: UsersApiMarshaller
) {

  
  import usersMarshaller._

  lazy val route: Route =
    path("organization" / "users" / Segment) { (userId) => 
      delete {  
            usersService.deleteUser(userId = userId)
      }
    } ~
    path("organization" / "users") { 
      get { 
        parameters("limit".as[Int].?(20), "after".as[String].?) { (limit, after) => 
            usersService.listUsers(limit = limit, after = after)
        }
      }
    } ~
    path("organization" / "users" / Segment) { (userId) => 
      post {  
            entity(as[UserRoleUpdateRequest]){ userRoleUpdateRequest =>
              usersService.modifyUser(userId = userId, userRoleUpdateRequest = userRoleUpdateRequest)
            }
      }
    } ~
    path("organization" / "users" / Segment) { (userId) => 
      get {  
            usersService.retrieveUser(userId = userId)
      }
    }
}


trait UsersApiService {

  def deleteUser200(responseUserDeleteResponse: UserDeleteResponse)(implicit toEntityMarshallerUserDeleteResponse: ToEntityMarshaller[UserDeleteResponse]): Route =
    complete((200, responseUserDeleteResponse))
  /**
   * Code: 200, Message: User deleted successfully., DataType: UserDeleteResponse
   */
  def deleteUser(userId: String)
      (implicit toEntityMarshallerUserDeleteResponse: ToEntityMarshaller[UserDeleteResponse]): Route

  def listUsers200(responseUserListResponse: UserListResponse)(implicit toEntityMarshallerUserListResponse: ToEntityMarshaller[UserListResponse]): Route =
    complete((200, responseUserListResponse))
  /**
   * Code: 200, Message: Users listed successfully., DataType: UserListResponse
   */
  def listUsers(limit: Int, after: Option[String])
      (implicit toEntityMarshallerUserListResponse: ToEntityMarshaller[UserListResponse]): Route

  def modifyUser200(responseUser: User)(implicit toEntityMarshallerUser: ToEntityMarshaller[User]): Route =
    complete((200, responseUser))
  /**
   * Code: 200, Message: User role updated successfully., DataType: User
   */
  def modifyUser(userId: String, userRoleUpdateRequest: UserRoleUpdateRequest)
      (implicit toEntityMarshallerUser: ToEntityMarshaller[User]): Route

  def retrieveUser200(responseUser: User)(implicit toEntityMarshallerUser: ToEntityMarshaller[User]): Route =
    complete((200, responseUser))
  /**
   * Code: 200, Message: User retrieved successfully., DataType: User
   */
  def retrieveUser(userId: String)
      (implicit toEntityMarshallerUser: ToEntityMarshaller[User]): Route

}

trait UsersApiMarshaller {
  implicit def fromEntityUnmarshallerUserRoleUpdateRequest: FromEntityUnmarshaller[UserRoleUpdateRequest]



  implicit def toEntityMarshallerUserDeleteResponse: ToEntityMarshaller[UserDeleteResponse]

  implicit def toEntityMarshallerUserListResponse: ToEntityMarshaller[UserListResponse]

  implicit def toEntityMarshallerUser: ToEntityMarshaller[User]

}

