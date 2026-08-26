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
    public partial class ProjectsApi
    { 
        [FunctionName("ProjectsApi_ArchiveProject")]
        public async Task<ActionResult<Project>> _ArchiveProject([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1organization/projects/{project_id}/archive")]HttpRequest req, ExecutionContext context, string projectId)
        {
            var method = this.GetType().GetMethod("ArchiveProject");
            return method != null
                ? (await ((Task<Project>)method.Invoke(this, new object[] { req, context, projectId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_CreateProject")]
        public async Task<ActionResult<Project>> _CreateProject([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1organization/projects")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateProject");
            return method != null
                ? (await ((Task<Project>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_CreateProjectServiceAccount")]
        public async Task<ActionResult<ProjectServiceAccountCreateResponse>> _CreateProjectServiceAccount([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1organization/projects/{project_id}/service_accounts")]HttpRequest req, ExecutionContext context, string projectId)
        {
            var method = this.GetType().GetMethod("CreateProjectServiceAccount");
            return method != null
                ? (await ((Task<ProjectServiceAccountCreateResponse>)method.Invoke(this, new object[] { req, context, projectId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_CreateProjectUser")]
        public async Task<ActionResult<ProjectUser>> _CreateProjectUser([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1organization/projects/{project_id}/users")]HttpRequest req, ExecutionContext context, string projectId)
        {
            var method = this.GetType().GetMethod("CreateProjectUser");
            return method != null
                ? (await ((Task<ProjectUser>)method.Invoke(this, new object[] { req, context, projectId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_DeleteProjectApiKey")]
        public async Task<ActionResult<ProjectApiKeyDeleteResponse>> _DeleteProjectApiKey([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v1organization/projects/{project_id}/api_keys/{key_id}")]HttpRequest req, ExecutionContext context, string projectId, string keyId)
        {
            var method = this.GetType().GetMethod("DeleteProjectApiKey");
            return method != null
                ? (await ((Task<ProjectApiKeyDeleteResponse>)method.Invoke(this, new object[] { req, context, projectId, keyId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_DeleteProjectServiceAccount")]
        public async Task<ActionResult<ProjectServiceAccountDeleteResponse>> _DeleteProjectServiceAccount([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v1organization/projects/{project_id}/service_accounts/{service_account_id}")]HttpRequest req, ExecutionContext context, string projectId, string serviceAccountId)
        {
            var method = this.GetType().GetMethod("DeleteProjectServiceAccount");
            return method != null
                ? (await ((Task<ProjectServiceAccountDeleteResponse>)method.Invoke(this, new object[] { req, context, projectId, serviceAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_DeleteProjectUser")]
        public async Task<ActionResult<ProjectUserDeleteResponse>> _DeleteProjectUser([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v1organization/projects/{project_id}/users/{user_id}")]HttpRequest req, ExecutionContext context, string projectId, string userId)
        {
            var method = this.GetType().GetMethod("DeleteProjectUser");
            return method != null
                ? (await ((Task<ProjectUserDeleteResponse>)method.Invoke(this, new object[] { req, context, projectId, userId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_ListProjectApiKeys")]
        public async Task<ActionResult<ProjectApiKeyListResponse>> _ListProjectApiKeys([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/projects/{project_id}/api_keys")]HttpRequest req, ExecutionContext context, string projectId)
        {
            var method = this.GetType().GetMethod("ListProjectApiKeys");
            return method != null
                ? (await ((Task<ProjectApiKeyListResponse>)method.Invoke(this, new object[] { req, context, projectId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_ListProjectRateLimits")]
        public async Task<ActionResult<ProjectRateLimitListResponse>> _ListProjectRateLimits([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/projects/{project_id}/rate_limits")]HttpRequest req, ExecutionContext context, string projectId)
        {
            var method = this.GetType().GetMethod("ListProjectRateLimits");
            return method != null
                ? (await ((Task<ProjectRateLimitListResponse>)method.Invoke(this, new object[] { req, context, projectId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_ListProjectServiceAccounts")]
        public async Task<ActionResult<ProjectServiceAccountListResponse>> _ListProjectServiceAccounts([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/projects/{project_id}/service_accounts")]HttpRequest req, ExecutionContext context, string projectId)
        {
            var method = this.GetType().GetMethod("ListProjectServiceAccounts");
            return method != null
                ? (await ((Task<ProjectServiceAccountListResponse>)method.Invoke(this, new object[] { req, context, projectId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_ListProjectUsers")]
        public async Task<ActionResult<ProjectUserListResponse>> _ListProjectUsers([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/projects/{project_id}/users")]HttpRequest req, ExecutionContext context, string projectId)
        {
            var method = this.GetType().GetMethod("ListProjectUsers");
            return method != null
                ? (await ((Task<ProjectUserListResponse>)method.Invoke(this, new object[] { req, context, projectId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_ListProjects")]
        public async Task<ActionResult<ProjectListResponse>> _ListProjects([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/projects")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListProjects");
            return method != null
                ? (await ((Task<ProjectListResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_ModifyProject")]
        public async Task<ActionResult<Project>> _ModifyProject([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1organization/projects/{project_id}")]HttpRequest req, ExecutionContext context, string projectId)
        {
            var method = this.GetType().GetMethod("ModifyProject");
            return method != null
                ? (await ((Task<Project>)method.Invoke(this, new object[] { req, context, projectId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_ModifyProjectUser")]
        public async Task<ActionResult<ProjectUser>> _ModifyProjectUser([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1organization/projects/{project_id}/users/{user_id}")]HttpRequest req, ExecutionContext context, string projectId, string userId)
        {
            var method = this.GetType().GetMethod("ModifyProjectUser");
            return method != null
                ? (await ((Task<ProjectUser>)method.Invoke(this, new object[] { req, context, projectId, userId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_RetrieveProject")]
        public async Task<ActionResult<Project>> _RetrieveProject([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/projects/{project_id}")]HttpRequest req, ExecutionContext context, string projectId)
        {
            var method = this.GetType().GetMethod("RetrieveProject");
            return method != null
                ? (await ((Task<Project>)method.Invoke(this, new object[] { req, context, projectId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_RetrieveProjectApiKey")]
        public async Task<ActionResult<ProjectApiKey>> _RetrieveProjectApiKey([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/projects/{project_id}/api_keys/{key_id}")]HttpRequest req, ExecutionContext context, string projectId, string keyId)
        {
            var method = this.GetType().GetMethod("RetrieveProjectApiKey");
            return method != null
                ? (await ((Task<ProjectApiKey>)method.Invoke(this, new object[] { req, context, projectId, keyId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_RetrieveProjectServiceAccount")]
        public async Task<ActionResult<ProjectServiceAccount>> _RetrieveProjectServiceAccount([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/projects/{project_id}/service_accounts/{service_account_id}")]HttpRequest req, ExecutionContext context, string projectId, string serviceAccountId)
        {
            var method = this.GetType().GetMethod("RetrieveProjectServiceAccount");
            return method != null
                ? (await ((Task<ProjectServiceAccount>)method.Invoke(this, new object[] { req, context, projectId, serviceAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_RetrieveProjectUser")]
        public async Task<ActionResult<ProjectUser>> _RetrieveProjectUser([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1organization/projects/{project_id}/users/{user_id}")]HttpRequest req, ExecutionContext context, string projectId, string userId)
        {
            var method = this.GetType().GetMethod("RetrieveProjectUser");
            return method != null
                ? (await ((Task<ProjectUser>)method.Invoke(this, new object[] { req, context, projectId, userId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProjectsApi_UpdateProjectRateLimits")]
        public async Task<ActionResult<ProjectRateLimit>> _UpdateProjectRateLimits([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v1organization/projects/{project_id}/rate_limits/{rate_limit_id}")]HttpRequest req, ExecutionContext context, string projectId, string rateLimitId)
        {
            var method = this.GetType().GetMethod("UpdateProjectRateLimits");
            return method != null
                ? (await ((Task<ProjectRateLimit>)method.Invoke(this, new object[] { req, context, projectId, rateLimitId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
