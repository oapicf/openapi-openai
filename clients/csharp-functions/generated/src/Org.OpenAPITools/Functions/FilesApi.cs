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
    public partial class FilesApi
    { 
        [FunctionName("FilesApi_CreateFile")]
        public async Task<ActionResult<OpenAIFile>> _CreateFile([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1files")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateFile");
            return method != null
                ? (await ((Task<OpenAIFile>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FilesApi_DeleteFile")]
        public async Task<ActionResult<DeleteFileResponse>> _DeleteFile([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v1files/{file_id}")]HttpRequest req, ExecutionContext context, string fileId)
        {
            var method = this.GetType().GetMethod("DeleteFile");
            return method != null
                ? (await ((Task<DeleteFileResponse>)method.Invoke(this, new object[] { req, context, fileId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FilesApi_DownloadFile")]
        public async Task<ActionResult<string>> _DownloadFile([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1files/{file_id}/content")]HttpRequest req, ExecutionContext context, string fileId)
        {
            var method = this.GetType().GetMethod("DownloadFile");
            return method != null
                ? (await ((Task<string>)method.Invoke(this, new object[] { req, context, fileId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FilesApi_ListFiles")]
        public async Task<ActionResult<ListFilesResponse>> _ListFiles([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1files")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListFiles");
            return method != null
                ? (await ((Task<ListFilesResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FilesApi_RetrieveFile")]
        public async Task<ActionResult<OpenAIFile>> _RetrieveFile([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1files/{file_id}")]HttpRequest req, ExecutionContext context, string fileId)
        {
            var method = this.GetType().GetMethod("RetrieveFile");
            return method != null
                ? (await ((Task<OpenAIFile>)method.Invoke(this, new object[] { req, context, fileId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
