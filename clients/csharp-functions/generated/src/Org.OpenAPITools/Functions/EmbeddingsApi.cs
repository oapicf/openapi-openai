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
    public partial class EmbeddingsApi
    { 
        [FunctionName("EmbeddingsApi_CreateEmbedding")]
        public async Task<ActionResult<CreateEmbeddingResponse>> _CreateEmbedding([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1embeddings")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateEmbedding");
            return method != null
                ? (await ((Task<CreateEmbeddingResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
