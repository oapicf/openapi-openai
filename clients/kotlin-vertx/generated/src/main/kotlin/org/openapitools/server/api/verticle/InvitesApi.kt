package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.Invite
import org.openapitools.server.api.model.InviteDeleteResponse
import org.openapitools.server.api.model.InviteListResponse
import org.openapitools.server.api.model.InviteRequest
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


interface InvitesApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* deleteInvite
     * Delete an invite. If the invite has already been accepted, it cannot be deleted. */
    suspend fun deleteInvite(inviteId:kotlin.String?,context:OperationRequest):Response<InviteDeleteResponse>
    /* inviteUser
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization. */
    suspend fun inviteUser(inviteRequest:InviteRequest?,context:OperationRequest):Response<Invite>
    /* listInvites
     * Returns a list of invites in the organization. */
    suspend fun listInvites(limit:kotlin.Int?,after:kotlin.String?,context:OperationRequest):Response<InviteListResponse>
    /* retrieveInvite
     * Retrieves an invite. */
    suspend fun retrieveInvite(inviteId:kotlin.String?,context:OperationRequest):Response<Invite>
    companion object {
        const val address = "InvitesApi-service"
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
            for (m in InvitesApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(InvitesApi::class.java, address)
            return routerFactory
        }
    }
}
