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
    public partial class UsersApi
    { 
        [FunctionName("UsersApi_DeleteUser")]
        public async Task<ActionResult<UserDeleteResponse>> _DeleteUser([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v1organization/users/{user_id}")]HttpRequest req, ExecutionContext context, string userId)
        {
            var method = this.GetType().GetMethod("DeleteUser");
            return method != null
                ? (await ((Task<UserDeleteResponse>)method.Invoke(this, new object[] { req, context, userId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UsersApi_ListUsers")]
        public async Task<ActionResult<UserListResponse>> _ListUsers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/users")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListUsers");
            return method != null
                ? (await ((Task<UserListResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UsersApi_ModifyUser")]
        public async Task<ActionResult<User>> _ModifyUser([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1organization/users/{user_id}")]HttpRequest req, ExecutionContext context, string userId)
        {
            var method = this.GetType().GetMethod("ModifyUser");
            return method != null
                ? (await ((Task<User>)method.Invoke(this, new object[] { req, context, userId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UsersApi_RetrieveUser")]
        public async Task<ActionResult<User>> _RetrieveUser([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/users/{user_id}")]HttpRequest req, ExecutionContext context, string userId)
        {
            var method = this.GetType().GetMethod("RetrieveUser");
            return method != null
                ? (await ((Task<User>)method.Invoke(this, new object[] { req, context, userId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
