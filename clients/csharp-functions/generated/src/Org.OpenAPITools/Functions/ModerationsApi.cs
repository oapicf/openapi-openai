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
    public partial class ModerationsApi
    { 
        [FunctionName("ModerationsApi_CreateModeration")]
        public async Task<ActionResult<CreateModerationResponse>> _CreateModeration([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1moderations")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateModeration");
            return method != null
                ? (await ((Task<CreateModerationResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
