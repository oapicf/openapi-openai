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
    public partial class AudioApi
    { 
        [FunctionName("AudioApi_CreateSpeech")]
        public async Task<ActionResult<System.IO.Stream>> _CreateSpeech([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1audio/speech")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateSpeech");
            return method != null
                ? (await ((Task<System.IO.Stream>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudioApi_CreateTranscription")]
        public async Task<ActionResult<CreateTranscription200Response>> _CreateTranscription([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1audio/transcriptions")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateTranscription");
            return method != null
                ? (await ((Task<CreateTranscription200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudioApi_CreateTranslation")]
        public async Task<ActionResult<CreateTranslation200Response>> _CreateTranslation([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1audio/translations")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateTranslation");
            return method != null
                ? (await ((Task<CreateTranslation200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
