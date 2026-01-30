package api

import model.User
import model.UserDeleteResponse
import model.UserListResponse
import model.UserRoleUpdateRequest

/**
  * Provides a default implementation for [[UsersApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class UsersApiImpl extends UsersApi {
  /**
    * @inheritdoc
    */
  override def deleteUser(userId: String): UserDeleteResponse = {
    // TODO: Implement better logic

    UserDeleteResponse("", "", false)
  }

  /**
    * @inheritdoc
    */
  override def listUsers(limit: Option[Int], after: Option[String]): UserListResponse = {
    // TODO: Implement better logic

    UserListResponse("", List.empty[User], "", "", false)
  }

  /**
    * @inheritdoc
    */
  override def modifyUser(userId: String, userRoleUpdateRequest: UserRoleUpdateRequest): User = {
    // TODO: Implement better logic

    User("", "", "", "", "", 0)
  }

  /**
    * @inheritdoc
    */
  override def retrieveUser(userId: String): User = {
    // TODO: Implement better logic

    User("", "", "", "", "", 0)
  }
}
