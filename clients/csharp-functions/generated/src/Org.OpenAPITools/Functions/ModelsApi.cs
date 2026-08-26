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
    public partial class ModelsApi
    { 
        [FunctionName("ModelsApi_DeleteModel")]
        public async Task<ActionResult<DeleteModelResponse>> _DeleteModel([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v1models/{model}")]HttpRequest req, ExecutionContext context, string model)
        {
            var method = this.GetType().GetMethod("DeleteModel");
            return method != null
                ? (await ((Task<DeleteModelResponse>)method.Invoke(this, new object[] { req, context, model })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ModelsApi_ListModels")]
        public async Task<ActionResult<ListModelsResponse>> _ListModels([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1models")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListModels");
            return method != null
                ? (await ((Task<ListModelsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ModelsApi_RetrieveModel")]
        public async Task<ActionResult<Model>> _RetrieveModel([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1models/{model}")]HttpRequest req, ExecutionContext context, string model)
        {
            var method = this.GetType().GetMethod("RetrieveModel");
            return method != null
                ? (await ((Task<Model>)method.Invoke(this, new object[] { req, context, model })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
