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
    public partial class FineTuningApi
    { 
        [FunctionName("FineTuningApi_CancelFineTuningJob")]
        public async Task<ActionResult<FineTuningJob>> _CancelFineTuningJob([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1fine_tuning/jobs/{fine_tuning_job_id}/cancel")]HttpRequest req, ExecutionContext context, string fineTuningJobId)
        {
            var method = this.GetType().GetMethod("CancelFineTuningJob");
            return method != null
                ? (await ((Task<FineTuningJob>)method.Invoke(this, new object[] { req, context, fineTuningJobId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FineTuningApi_CreateFineTuningJob")]
        public async Task<ActionResult<FineTuningJob>> _CreateFineTuningJob([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1fine_tuning/jobs")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateFineTuningJob");
            return method != null
                ? (await ((Task<FineTuningJob>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FineTuningApi_ListFineTuningEvents")]
        public async Task<ActionResult<ListFineTuningJobEventsResponse>> _ListFineTuningEvents([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1fine_tuning/jobs/{fine_tuning_job_id}/events")]HttpRequest req, ExecutionContext context, string fineTuningJobId)
        {
            var method = this.GetType().GetMethod("ListFineTuningEvents");
            return method != null
                ? (await ((Task<ListFineTuningJobEventsResponse>)method.Invoke(this, new object[] { req, context, fineTuningJobId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FineTuningApi_ListFineTuningJobCheckpoints")]
        public async Task<ActionResult<ListFineTuningJobCheckpointsResponse>> _ListFineTuningJobCheckpoints([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1fine_tuning/jobs/{fine_tuning_job_id}/checkpoints")]HttpRequest req, ExecutionContext context, string fineTuningJobId)
        {
            var method = this.GetType().GetMethod("ListFineTuningJobCheckpoints");
            return method != null
                ? (await ((Task<ListFineTuningJobCheckpointsResponse>)method.Invoke(this, new object[] { req, context, fineTuningJobId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FineTuningApi_ListPaginatedFineTuningJobs")]
        public async Task<ActionResult<ListPaginatedFineTuningJobsResponse>> _ListPaginatedFineTuningJobs([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1fine_tuning/jobs")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListPaginatedFineTuningJobs");
            return method != null
                ? (await ((Task<ListPaginatedFineTuningJobsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FineTuningApi_RetrieveFineTuningJob")]
        public async Task<ActionResult<FineTuningJob>> _RetrieveFineTuningJob([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1fine_tuning/jobs/{fine_tuning_job_id}")]HttpRequest req, ExecutionContext context, string fineTuningJobId)
        {
            var method = this.GetType().GetMethod("RetrieveFineTuningJob");
            return method != null
                ? (await ((Task<FineTuningJob>)method.Invoke(this, new object[] { req, context, fineTuningJobId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
