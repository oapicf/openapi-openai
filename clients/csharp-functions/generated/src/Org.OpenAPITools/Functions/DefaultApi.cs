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
    public partial class DefaultApi
    { 
        [FunctionName("DefaultApi_AdminApiKeysCreate")]
        public async Task<ActionResult<AdminApiKey>> _AdminApiKeysCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1organization/admin_api_keys")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AdminApiKeysCreate");
            return method != null
                ? (await ((Task<AdminApiKey>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("DefaultApi_AdminApiKeysDelete")]
        public async Task<ActionResult<AdminApiKeysDelete200Response>> _AdminApiKeysDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v1organization/admin_api_keys/{key_id}")]HttpRequest req, ExecutionContext context, string keyId)
        {
            var method = this.GetType().GetMethod("AdminApiKeysDelete");
            return method != null
                ? (await ((Task<AdminApiKeysDelete200Response>)method.Invoke(this, new object[] { req, context, keyId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("DefaultApi_AdminApiKeysGet")]
        public async Task<ActionResult<AdminApiKey>> _AdminApiKeysGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/admin_api_keys/{key_id}")]HttpRequest req, ExecutionContext context, string keyId)
        {
            var method = this.GetType().GetMethod("AdminApiKeysGet");
            return method != null
                ? (await ((Task<AdminApiKey>)method.Invoke(this, new object[] { req, context, keyId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("DefaultApi_AdminApiKeysList")]
        public async Task<ActionResult<ApiKeyList>> _AdminApiKeysList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/admin_api_keys")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AdminApiKeysList");
            return method != null
                ? (await ((Task<ApiKeyList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
