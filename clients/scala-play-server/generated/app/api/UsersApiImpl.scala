package api

import model.User
import model.UserDeleteResponse
import model.UserListResponse
import model.UserRoleUpdateRequest

/**
  * Provides a default implementation for [[UsersApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
