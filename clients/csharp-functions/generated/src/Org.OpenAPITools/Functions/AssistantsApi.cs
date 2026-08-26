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
    public partial class AssistantsApi
    { 
        [FunctionName("AssistantsApi_CancelRun")]
        public async Task<ActionResult<RunObject>> _CancelRun([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1threads/{thread_id}/runs/{run_id}/cancel")]HttpRequest req, ExecutionContext context, string threadId, string runId)
        {
            var method = this.GetType().GetMethod("CancelRun");
            return method != null
                ? (await ((Task<RunObject>)method.Invoke(this, new object[] { req, context, threadId, runId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_CreateAssistant")]
        public async Task<ActionResult<AssistantObject>> _CreateAssistant([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1assistants")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateAssistant");
            return method != null
                ? (await ((Task<AssistantObject>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_CreateMessage")]
        public async Task<ActionResult<MessageObject>> _CreateMessage([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1threads/{thread_id}/messages")]HttpRequest req, ExecutionContext context, string threadId)
        {
            var method = this.GetType().GetMethod("CreateMessage");
            return method != null
                ? (await ((Task<MessageObject>)method.Invoke(this, new object[] { req, context, threadId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_CreateRun")]
        public async Task<ActionResult<RunObject>> _CreateRun([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1threads/{thread_id}/runs")]HttpRequest req, ExecutionContext context, string threadId)
        {
            var method = this.GetType().GetMethod("CreateRun");
            return method != null
                ? (await ((Task<RunObject>)method.Invoke(this, new object[] { req, context, threadId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_CreateThread")]
        public async Task<ActionResult<ThreadObject>> _CreateThread([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1threads")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateThread");
            return method != null
                ? (await ((Task<ThreadObject>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_CreateThreadAndRun")]
        public async Task<ActionResult<RunObject>> _CreateThreadAndRun([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1threads/runs")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateThreadAndRun");
            return method != null
                ? (await ((Task<RunObject>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_DeleteAssistant")]
        public async Task<ActionResult<DeleteAssistantResponse>> _DeleteAssistant([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v1assistants/{assistant_id}")]HttpRequest req, ExecutionContext context, string assistantId)
        {
            var method = this.GetType().GetMethod("DeleteAssistant");
            return method != null
                ? (await ((Task<DeleteAssistantResponse>)method.Invoke(this, new object[] { req, context, assistantId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_DeleteMessage")]
        public async Task<ActionResult<DeleteMessageResponse>> _DeleteMessage([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v1threads/{thread_id}/messages/{message_id}")]HttpRequest req, ExecutionContext context, string threadId, string messageId)
        {
            var method = this.GetType().GetMethod("DeleteMessage");
            return method != null
                ? (await ((Task<DeleteMessageResponse>)method.Invoke(this, new object[] { req, context, threadId, messageId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_DeleteThread")]
        public async Task<ActionResult<DeleteThreadResponse>> _DeleteThread([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v1threads/{thread_id}")]HttpRequest req, ExecutionContext context, string threadId)
        {
            var method = this.GetType().GetMethod("DeleteThread");
            return method != null
                ? (await ((Task<DeleteThreadResponse>)method.Invoke(this, new object[] { req, context, threadId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_GetAssistant")]
        public async Task<ActionResult<AssistantObject>> _GetAssistant([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1assistants/{assistant_id}")]HttpRequest req, ExecutionContext context, string assistantId)
        {
            var method = this.GetType().GetMethod("GetAssistant");
            return method != null
                ? (await ((Task<AssistantObject>)method.Invoke(this, new object[] { req, context, assistantId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_GetMessage")]
        public async Task<ActionResult<MessageObject>> _GetMessage([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1threads/{thread_id}/messages/{message_id}")]HttpRequest req, ExecutionContext context, string threadId, string messageId)
        {
            var method = this.GetType().GetMethod("GetMessage");
            return method != null
                ? (await ((Task<MessageObject>)method.Invoke(this, new object[] { req, context, threadId, messageId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_GetRun")]
        public async Task<ActionResult<RunObject>> _GetRun([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1threads/{thread_id}/runs/{run_id}")]HttpRequest req, ExecutionContext context, string threadId, string runId)
        {
            var method = this.GetType().GetMethod("GetRun");
            return method != null
                ? (await ((Task<RunObject>)method.Invoke(this, new object[] { req, context, threadId, runId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_GetRunStep")]
        public async Task<ActionResult<RunStepObject>> _GetRunStep([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1threads/{thread_id}/runs/{run_id}/steps/{step_id}")]HttpRequest req, ExecutionContext context, string threadId, string runId, string stepId)
        {
            var method = this.GetType().GetMethod("GetRunStep");
            return method != null
                ? (await ((Task<RunStepObject>)method.Invoke(this, new object[] { req, context, threadId, runId, stepId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_GetThread")]
        public async Task<ActionResult<ThreadObject>> _GetThread([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1threads/{thread_id}")]HttpRequest req, ExecutionContext context, string threadId)
        {
            var method = this.GetType().GetMethod("GetThread");
            return method != null
                ? (await ((Task<ThreadObject>)method.Invoke(this, new object[] { req, context, threadId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_ListAssistants")]
        public async Task<ActionResult<ListAssistantsResponse>> _ListAssistants([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1assistants")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListAssistants");
            return method != null
                ? (await ((Task<ListAssistantsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_ListMessages")]
        public async Task<ActionResult<ListMessagesResponse>> _ListMessages([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1threads/{thread_id}/messages")]HttpRequest req, ExecutionContext context, string threadId)
        {
            var method = this.GetType().GetMethod("ListMessages");
            return method != null
                ? (await ((Task<ListMessagesResponse>)method.Invoke(this, new object[] { req, context, threadId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_ListRunSteps")]
        public async Task<ActionResult<ListRunStepsResponse>> _ListRunSteps([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1threads/{thread_id}/runs/{run_id}/steps")]HttpRequest req, ExecutionContext context, string threadId, string runId)
        {
            var method = this.GetType().GetMethod("ListRunSteps");
            return method != null
                ? (await ((Task<ListRunStepsResponse>)method.Invoke(this, new object[] { req, context, threadId, runId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_ListRuns")]
        public async Task<ActionResult<ListRunsResponse>> _ListRuns([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1threads/{thread_id}/runs")]HttpRequest req, ExecutionContext context, string threadId)
        {
            var method = this.GetType().GetMethod("ListRuns");
            return method != null
                ? (await ((Task<ListRunsResponse>)method.Invoke(this, new object[] { req, context, threadId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_ModifyAssistant")]
        public async Task<ActionResult<AssistantObject>> _ModifyAssistant([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1assistants/{assistant_id}")]HttpRequest req, ExecutionContext context, string assistantId)
        {
            var method = this.GetType().GetMethod("ModifyAssistant");
            return method != null
                ? (await ((Task<AssistantObject>)method.Invoke(this, new object[] { req, context, assistantId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_ModifyMessage")]
        public async Task<ActionResult<MessageObject>> _ModifyMessage([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1threads/{thread_id}/messages/{message_id}")]HttpRequest req, ExecutionContext context, string threadId, string messageId)
        {
            var method = this.GetType().GetMethod("ModifyMessage");
            return method != null
                ? (await ((Task<MessageObject>)method.Invoke(this, new object[] { req, context, threadId, messageId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_ModifyRun")]
        public async Task<ActionResult<RunObject>> _ModifyRun([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1threads/{thread_id}/runs/{run_id}")]HttpRequest req, ExecutionContext context, string threadId, string runId)
        {
            var method = this.GetType().GetMethod("ModifyRun");
            return method != null
                ? (await ((Task<RunObject>)method.Invoke(this, new object[] { req, context, threadId, runId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_ModifyThread")]
        public async Task<ActionResult<ThreadObject>> _ModifyThread([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1threads/{thread_id}")]HttpRequest req, ExecutionContext context, string threadId)
        {
            var method = this.GetType().GetMethod("ModifyThread");
            return method != null
                ? (await ((Task<ThreadObject>)method.Invoke(this, new object[] { req, context, threadId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssistantsApi_SubmitToolOuputsToRun")]
        public async Task<ActionResult<RunObject>> _SubmitToolOuputsToRun([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1threads/{thread_id}/runs/{run_id}/submit_tool_outputs")]HttpRequest req, ExecutionContext context, string threadId, string runId)
        {
            var method = this.GetType().GetMethod("SubmitToolOuputsToRun");
            return method != null
                ? (await ((Task<RunObject>)method.Invoke(this, new object[] { req, context, threadId, runId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
