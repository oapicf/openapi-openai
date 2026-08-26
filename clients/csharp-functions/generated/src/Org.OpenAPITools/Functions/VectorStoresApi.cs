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
    public partial class VectorStoresApi
    { 
        [FunctionName("VectorStoresApi_CancelVectorStoreFileBatch")]
        public async Task<ActionResult<VectorStoreFileBatchObject>> _CancelVectorStoreFileBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel")]HttpRequest req, ExecutionContext context, string vectorStoreId, string batchId)
        {
            var method = this.GetType().GetMethod("CancelVectorStoreFileBatch");
            return method != null
                ? (await ((Task<VectorStoreFileBatchObject>)method.Invoke(this, new object[] { req, context, vectorStoreId, batchId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VectorStoresApi_CreateVectorStore")]
        public async Task<ActionResult<VectorStoreObject>> _CreateVectorStore([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1vector_stores")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateVectorStore");
            return method != null
                ? (await ((Task<VectorStoreObject>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VectorStoresApi_CreateVectorStoreFile")]
        public async Task<ActionResult<VectorStoreFileObject>> _CreateVectorStoreFile([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1vector_stores/{vector_store_id}/files")]HttpRequest req, ExecutionContext context, string vectorStoreId)
        {
            var method = this.GetType().GetMethod("CreateVectorStoreFile");
            return method != null
                ? (await ((Task<VectorStoreFileObject>)method.Invoke(this, new object[] { req, context, vectorStoreId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VectorStoresApi_CreateVectorStoreFileBatch")]
        public async Task<ActionResult<VectorStoreFileBatchObject>> _CreateVectorStoreFileBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1vector_stores/{vector_store_id}/file_batches")]HttpRequest req, ExecutionContext context, string vectorStoreId)
        {
            var method = this.GetType().GetMethod("CreateVectorStoreFileBatch");
            return method != null
                ? (await ((Task<VectorStoreFileBatchObject>)method.Invoke(this, new object[] { req, context, vectorStoreId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VectorStoresApi_DeleteVectorStore")]
        public async Task<ActionResult<DeleteVectorStoreResponse>> _DeleteVectorStore([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v1vector_stores/{vector_store_id}")]HttpRequest req, ExecutionContext context, string vectorStoreId)
        {
            var method = this.GetType().GetMethod("DeleteVectorStore");
            return method != null
                ? (await ((Task<DeleteVectorStoreResponse>)method.Invoke(this, new object[] { req, context, vectorStoreId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VectorStoresApi_DeleteVectorStoreFile")]
        public async Task<ActionResult<DeleteVectorStoreFileResponse>> _DeleteVectorStoreFile([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v1vector_stores/{vector_store_id}/files/{file_id}")]HttpRequest req, ExecutionContext context, string vectorStoreId, string fileId)
        {
            var method = this.GetType().GetMethod("DeleteVectorStoreFile");
            return method != null
                ? (await ((Task<DeleteVectorStoreFileResponse>)method.Invoke(this, new object[] { req, context, vectorStoreId, fileId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VectorStoresApi_GetVectorStore")]
        public async Task<ActionResult<VectorStoreObject>> _GetVectorStore([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1vector_stores/{vector_store_id}")]HttpRequest req, ExecutionContext context, string vectorStoreId)
        {
            var method = this.GetType().GetMethod("GetVectorStore");
            return method != null
                ? (await ((Task<VectorStoreObject>)method.Invoke(this, new object[] { req, context, vectorStoreId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VectorStoresApi_GetVectorStoreFile")]
        public async Task<ActionResult<VectorStoreFileObject>> _GetVectorStoreFile([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1vector_stores/{vector_store_id}/files/{file_id}")]HttpRequest req, ExecutionContext context, string vectorStoreId, string fileId)
        {
            var method = this.GetType().GetMethod("GetVectorStoreFile");
            return method != null
                ? (await ((Task<VectorStoreFileObject>)method.Invoke(this, new object[] { req, context, vectorStoreId, fileId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VectorStoresApi_GetVectorStoreFileBatch")]
        public async Task<ActionResult<VectorStoreFileBatchObject>> _GetVectorStoreFileBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1vector_stores/{vector_store_id}/file_batches/{batch_id}")]HttpRequest req, ExecutionContext context, string vectorStoreId, string batchId)
        {
            var method = this.GetType().GetMethod("GetVectorStoreFileBatch");
            return method != null
                ? (await ((Task<VectorStoreFileBatchObject>)method.Invoke(this, new object[] { req, context, vectorStoreId, batchId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VectorStoresApi_ListFilesInVectorStoreBatch")]
        public async Task<ActionResult<ListVectorStoreFilesResponse>> _ListFilesInVectorStoreBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1vector_stores/{vector_store_id}/file_batches/{batch_id}/files")]HttpRequest req, ExecutionContext context, string vectorStoreId, string batchId)
        {
            var method = this.GetType().GetMethod("ListFilesInVectorStoreBatch");
            return method != null
                ? (await ((Task<ListVectorStoreFilesResponse>)method.Invoke(this, new object[] { req, context, vectorStoreId, batchId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VectorStoresApi_ListVectorStoreFiles")]
        public async Task<ActionResult<ListVectorStoreFilesResponse>> _ListVectorStoreFiles([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1vector_stores/{vector_store_id}/files")]HttpRequest req, ExecutionContext context, string vectorStoreId)
        {
            var method = this.GetType().GetMethod("ListVectorStoreFiles");
            return method != null
                ? (await ((Task<ListVectorStoreFilesResponse>)method.Invoke(this, new object[] { req, context, vectorStoreId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VectorStoresApi_ListVectorStores")]
        public async Task<ActionResult<ListVectorStoresResponse>> _ListVectorStores([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1vector_stores")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListVectorStores");
            return method != null
                ? (await ((Task<ListVectorStoresResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("VectorStoresApi_ModifyVectorStore")]
        public async Task<ActionResult<VectorStoreObject>> _ModifyVectorStore([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1vector_stores/{vector_store_id}")]HttpRequest req, ExecutionContext context, string vectorStoreId)
        {
            var method = this.GetType().GetMethod("ModifyVectorStore");
            return method != null
                ? (await ((Task<VectorStoreObject>)method.Invoke(this, new object[] { req, context, vectorStoreId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
