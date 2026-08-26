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
    public partial class UsageApi
    { 
        [FunctionName("UsageApi_UsageAudioSpeeches")]
        public async Task<ActionResult<UsageResponse>> _UsageAudioSpeeches([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/usage/audio_speeches")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UsageAudioSpeeches");
            return method != null
                ? (await ((Task<UsageResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UsageApi_UsageAudioTranscriptions")]
        public async Task<ActionResult<UsageResponse>> _UsageAudioTranscriptions([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/usage/audio_transcriptions")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UsageAudioTranscriptions");
            return method != null
                ? (await ((Task<UsageResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UsageApi_UsageCodeInterpreterSessions")]
        public async Task<ActionResult<UsageResponse>> _UsageCodeInterpreterSessions([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/usage/code_interpreter_sessions")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UsageCodeInterpreterSessions");
            return method != null
                ? (await ((Task<UsageResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UsageApi_UsageCompletions")]
        public async Task<ActionResult<UsageResponse>> _UsageCompletions([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/usage/completions")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UsageCompletions");
            return method != null
                ? (await ((Task<UsageResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UsageApi_UsageCosts")]
        public async Task<ActionResult<UsageResponse>> _UsageCosts([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/costs")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UsageCosts");
            return method != null
                ? (await ((Task<UsageResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UsageApi_UsageEmbeddings")]
        public async Task<ActionResult<UsageResponse>> _UsageEmbeddings([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/usage/embeddings")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UsageEmbeddings");
            return method != null
                ? (await ((Task<UsageResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UsageApi_UsageImages")]
        public async Task<ActionResult<UsageResponse>> _UsageImages([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/usage/images")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UsageImages");
            return method != null
                ? (await ((Task<UsageResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UsageApi_UsageModerations")]
        public async Task<ActionResult<UsageResponse>> _UsageModerations([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/usage/moderations")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UsageModerations");
            return method != null
                ? (await ((Task<UsageResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UsageApi_UsageVectorStores")]
        public async Task<ActionResult<UsageResponse>> _UsageVectorStores([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/usage/vector_stores")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UsageVectorStores");
            return method != null
                ? (await ((Task<UsageResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
