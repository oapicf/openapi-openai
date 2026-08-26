package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
import org.openapitools.server.api.model.User
import org.openapitools.server.api.model.UserDeleteResponse
import org.openapitools.server.api.model.UserListResponse
import org.openapitools.server.api.model.UserRoleUpdateRequest

@MiskTest(startService = true)
internal class UsersApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var usersApi: UsersApiAction

    /**
     * To test UsersApiAction.deleteUser
     */
    @Test
    fun `should handle deleteUser`() {
        val userId = TODO()
        val response: UserDeleteResponse = usersApi.deleteUser(userId)
    }

    /**
     * To test UsersApiAction.listUsers
     */
    @Test
    fun `should handle listUsers`() {
        val limit = TODO()
        val after = TODO()
        val response: UserListResponse = usersApi.listUsers(limit, after)
    }

    /**
     * To test UsersApiAction.modifyUser
     */
    @Test
    fun `should handle modifyUser`() {
        val userId = TODO()
        val userRoleUpdateRequest = TODO()
        val response: User = usersApi.modifyUser(userId, userRoleUpdateRequest)
    }

    /**
     * To test UsersApiAction.retrieveUser
     */
    @Test
    fun `should handle retrieveUser`() {
        val userId = TODO()
        val response: User = usersApi.retrieveUser(userId)
    }
}
