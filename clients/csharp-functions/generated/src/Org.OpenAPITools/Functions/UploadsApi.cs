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
    public partial class UploadsApi
    { 
        [FunctionName("UploadsApi_AddUploadPart")]
        public async Task<ActionResult<UploadPart>> _AddUploadPart([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1uploads/{upload_id}/parts")]HttpRequest req, ExecutionContext context, string uploadId)
        {
            var method = this.GetType().GetMethod("AddUploadPart");
            return method != null
                ? (await ((Task<UploadPart>)method.Invoke(this, new object[] { req, context, uploadId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UploadsApi_CancelUpload")]
        public async Task<ActionResult<Upload>> _CancelUpload([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1uploads/{upload_id}/cancel")]HttpRequest req, ExecutionContext context, string uploadId)
        {
            var method = this.GetType().GetMethod("CancelUpload");
            return method != null
                ? (await ((Task<Upload>)method.Invoke(this, new object[] { req, context, uploadId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UploadsApi_CompleteUpload")]
        public async Task<ActionResult<Upload>> _CompleteUpload([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1uploads/{upload_id}/complete")]HttpRequest req, ExecutionContext context, string uploadId)
        {
            var method = this.GetType().GetMethod("CompleteUpload");
            return method != null
                ? (await ((Task<Upload>)method.Invoke(this, new object[] { req, context, uploadId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UploadsApi_CreateUpload")]
        public async Task<ActionResult<Upload>> _CreateUpload([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1uploads")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateUpload");
            return method != null
                ? (await ((Task<Upload>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
