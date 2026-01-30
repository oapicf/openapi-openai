package api

import play.api.libs.json._
import model.User
import model.UserDeleteResponse
import model.UserListResponse
import model.UserRoleUpdateRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait UsersApi {
  /**
    * Deletes a user from the organization.
    * @param userId The ID of the user.
    */
  def deleteUser(userId: String): UserDeleteResponse

  /**
    * Lists all of the users in the organization.
    * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    */
  def listUsers(limit: Option[Int], after: Option[String]): UserListResponse

  /**
    * Modifies a user&#39;s role in the organization.
    * @param userId The ID of the user.
    * @param userRoleUpdateRequest The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;.
    */
  def modifyUser(userId: String, userRoleUpdateRequest: UserRoleUpdateRequest): User

  /**
    * Retrieves a user by their identifier.
    * @param userId The ID of the user.
    */
  def retrieveUser(userId: String): User
}
