using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Functions
{ 
    public partial class InvitesApi
    { 
        [FunctionName("InvitesApi_DeleteInvite")]
        public async Task<ActionResult<InviteDeleteResponse>> _DeleteInvite([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v1organization/invites/{invite_id}")]HttpRequest req, ExecutionContext context, string inviteId)
        {
            var method = this.GetType().GetMethod("DeleteInvite");
            return method != null
                ? (await ((Task<InviteDeleteResponse>)method.Invoke(this, new object[] { req, context, inviteId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("InvitesApi_InviteUser")]
        public async Task<ActionResult<Invite>> _InviteUser([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1organization/invites")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("InviteUser");
            return method != null
                ? (await ((Task<Invite>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("InvitesApi_ListInvites")]
        public async Task<ActionResult<InviteListResponse>> _ListInvites([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/invites")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListInvites");
            return method != null
                ? (await ((Task<InviteListResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("InvitesApi_RetrieveInvite")]
        public async Task<ActionResult<Invite>> _RetrieveInvite([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/invites/{invite_id}")]HttpRequest req, ExecutionContext context, string inviteId)
        {
            var method = this.GetType().GetMethod("RetrieveInvite");
            return method != null
                ? (await ((Task<Invite>)method.Invoke(this, new object[] { req, context, inviteId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
