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
    public partial class ImagesApi
    { 
        [FunctionName("ImagesApi_CreateImage")]
        public async Task<ActionResult<ImagesResponse>> _CreateImage([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1images/generations")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateImage");
            return method != null
                ? (await ((Task<ImagesResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ImagesApi_CreateImageEdit")]
        public async Task<ActionResult<ImagesResponse>> _CreateImageEdit([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1images/edits")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateImageEdit");
            return method != null
                ? (await ((Task<ImagesResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ImagesApi_CreateImageVariation")]
        public async Task<ActionResult<ImagesResponse>> _CreateImageVariation([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1images/variations")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateImageVariation");
            return method != null
                ? (await ((Task<ImagesResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
