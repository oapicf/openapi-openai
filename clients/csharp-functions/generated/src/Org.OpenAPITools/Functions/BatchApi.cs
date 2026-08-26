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
    public partial class BatchApi
    { 
        [FunctionName("BatchApi_CancelBatch")]
        public async Task<ActionResult<Batch>> _CancelBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1batches/{batch_id}/cancel")]HttpRequest req, ExecutionContext context, string batchId)
        {
            var method = this.GetType().GetMethod("CancelBatch");
            return method != null
                ? (await ((Task<Batch>)method.Invoke(this, new object[] { req, context, batchId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BatchApi_CreateBatch")]
        public async Task<ActionResult<Batch>> _CreateBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1batches")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateBatch");
            return method != null
                ? (await ((Task<Batch>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BatchApi_ListBatches")]
        public async Task<ActionResult<ListBatchesResponse>> _ListBatches([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1batches")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListBatches");
            return method != null
                ? (await ((Task<ListBatchesResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BatchApi_RetrieveBatch")]
        public async Task<ActionResult<Batch>> _RetrieveBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1batches/{batch_id}")]HttpRequest req, ExecutionContext context, string batchId)
        {
            var method = this.GetType().GetMethod("RetrieveBatch");
            return method != null
                ? (await ((Task<Batch>)method.Invoke(this, new object[] { req, context, batchId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
