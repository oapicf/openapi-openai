package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.User
import org.openapitools.server.api.model.UserDeleteResponse
import org.openapitools.server.api.model.UserListResponse
import org.openapitools.server.api.model.UserRoleUpdateRequest
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import io.vertx.core.json.JsonArray
import com.github.wooyme.openapi.Response
import io.vertx.ext.web.api.OperationRequest
import io.vertx.kotlin.ext.web.api.contract.openapi3.OpenAPI3RouterFactory
import io.vertx.serviceproxy.ServiceBinder
import io.vertx.ext.web.handler.CookieHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.sstore.LocalSessionStore
import java.util.List
import java.util.Map


interface UsersApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* deleteUser
     * Deletes a user from the organization. */
    suspend fun deleteUser(userId:kotlin.String?,context:OperationRequest):Response<UserDeleteResponse>
    /* listUsers
     * Lists all of the users in the organization. */
    suspend fun listUsers(limit:kotlin.Int?,after:kotlin.String?,context:OperationRequest):Response<UserListResponse>
    /* modifyUser
     * Modifies a user&#39;s role in the organization. */
    suspend fun modifyUser(userId:kotlin.String?,userRoleUpdateRequest:UserRoleUpdateRequest?,context:OperationRequest):Response<User>
    /* retrieveUser
     * Retrieves a user by their identifier. */
    suspend fun retrieveUser(userId:kotlin.String?,context:OperationRequest):Response<User>
    companion object {
        const val address = "UsersApi-service"
        suspend fun createRouterFactory(vertx: Vertx,path:String): io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory {
            val routerFactory = OpenAPI3RouterFactory.createAwait(vertx,path)
            routerFactory.addGlobalHandler(CookieHandler.create())
            routerFactory.addGlobalHandler(SessionHandler.create(LocalSessionStore.create(vertx)))
            routerFactory.setExtraOperationContextPayloadMapper{
                JsonObject().put("files",JsonArray(it.fileUploads().map { it.uploadedFileName() }))
            }
            val opf = routerFactory::class.java.getDeclaredField("operations")
            opf.isAccessible = true
            val operations = opf.get(routerFactory) as Map<String, Any>
            for (m in UsersApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(UsersApi::class.java, address)
            return routerFactory
        }
    }
}
