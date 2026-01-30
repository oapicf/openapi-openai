/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.handler;

import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.RoutingHandler;
import io.undertow.server.handlers.PathHandler;
import io.undertow.util.Methods;

/**
 * The default implementation for {@link HandlerProvider} and {@link PathHandlerInterface}.
 *
 * <p>There are two flavors of {@link HttpHandler}s to choose from, depending on your needs:</p>
 *
 * <ul>
 * <li>
 * <b>Stateless</b>: if a specific endpoint is called more than once from multiple sessions,
 * its state is not retained – a different {@link HttpHandler} is instantiated for every new
 * session. This is the default behavior.
 * </li>
 * <li>
 * <b>Stateful</b>: if a specific endpoint is called more than once from multiple sessions,
 * its state is retained properly. For example, if you want to keep a class property that counts
 * the number of requests or the last time a request was received.
 * </li>
 * </ul>
 * <p>Note: <b>Stateful</b> flavor is more performant than <b>Stateless</b>.</p>
 */
@SuppressWarnings("TooManyFunctions")
abstract public class PathHandlerProvider implements HandlerProvider, PathHandlerInterface {
    /**
     * Returns the default base path to access this server.
     */
    @javax.annotation.Nonnull
    public String getBasePath() {
        return "/v1";
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Endpoints bound in this method do NOT start with "/v1", and
     * it's your responsibility to configure a {@link PathHandler} with a prefix path
     * by calling {@link PathHandler#addPrefixPath} like so:</p>
     *
     * <code>pathHandler.addPrefixPath("/v1", handler)</code>
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
    * retain any state between multiple sessions.</p>
     *
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    @Override
    public HttpHandler getHandler() {
        return getHandler(false);
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
     * retain any state between multiple sessions.</p>
     *
     * @param withBasePath if true, all endpoints would start with "/v1"
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getHandler(final boolean withBasePath) {
        return getHandler(withBasePath ? getBasePath() : "");
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
     * retain any state between multiple sessions.</p>
     *
     * @param basePath base path to set for all endpoints
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @SuppressWarnings("Convert2Lambda")
    @javax.annotation.Nonnull
    public HttpHandler getHandler(final String basePath) {
        return Handlers.routing()
            .add(Methods.POST, basePath + "/threads/{thread_id}/runs/{run_id}/cancel", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    cancelRun().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/assistants", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createAssistant().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/threads/{thread_id}/messages", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createMessage().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/threads/{thread_id}/runs", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createRun().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/threads", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createThread().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/threads/runs", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createThreadAndRun().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/assistants/{assistant_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteAssistant().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/threads/{thread_id}/messages/{message_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteMessage().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/threads/{thread_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteThread().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/assistants/{assistant_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getAssistant().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/threads/{thread_id}/messages/{message_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getMessage().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/threads/{thread_id}/runs/{run_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getRun().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/threads/{thread_id}/runs/{run_id}/steps/{step_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getRunStep().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/threads/{thread_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getThread().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/assistants", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listAssistants().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/threads/{thread_id}/messages", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listMessages().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/threads/{thread_id}/runs/{run_id}/steps", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listRunSteps().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/threads/{thread_id}/runs", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listRuns().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/assistants/{assistant_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    modifyAssistant().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/threads/{thread_id}/messages/{message_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    modifyMessage().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/threads/{thread_id}/runs/{run_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    modifyRun().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/threads/{thread_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    modifyThread().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/threads/{thread_id}/runs/{run_id}/submit_tool_outputs", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    submitToolOuputsToRun().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/audio/speech", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createSpeech().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/audio/transcriptions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createTranscription().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/audio/translations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createTranslation().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/audit_logs", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listAuditLogs().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/batches/{batch_id}/cancel", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    cancelBatch().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/batches", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createBatch().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/batches", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listBatches().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/batches/{batch_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    retrieveBatch().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/chat/completions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createChatCompletion().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/completions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createCompletion().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/organization/admin_api_keys", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adminApiKeysCreate().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/organization/admin_api_keys/{key_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adminApiKeysDelete().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/admin_api_keys/{key_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adminApiKeysGet().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/admin_api_keys", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adminApiKeysList().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/embeddings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createEmbedding().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/files", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createFile().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/files/{file_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteFile().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/files/{file_id}/content", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    downloadFile().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/files", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listFiles().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/files/{file_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    retrieveFile().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/fine_tuning/jobs/{fine_tuning_job_id}/cancel", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    cancelFineTuningJob().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/fine_tuning/jobs", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createFineTuningJob().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/fine_tuning/jobs/{fine_tuning_job_id}/events", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listFineTuningEvents().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listFineTuningJobCheckpoints().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/fine_tuning/jobs", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listPaginatedFineTuningJobs().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/fine_tuning/jobs/{fine_tuning_job_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    retrieveFineTuningJob().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/images/generations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createImage().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/images/edits", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createImageEdit().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/images/variations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createImageVariation().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/organization/invites/{invite_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteInvite().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/organization/invites", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    inviteUser().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/invites", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listInvites().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/invites/{invite_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    retrieveInvite().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/models/{model}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteModel().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/models", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listModels().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/models/{model}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    retrieveModel().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/moderations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createModeration().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/organization/projects/{project_id}/archive", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    archiveProject().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/organization/projects", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createProject().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/organization/projects/{project_id}/service_accounts", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createProjectServiceAccount().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/organization/projects/{project_id}/users", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createProjectUser().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/organization/projects/{project_id}/api_keys/{key_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteProjectApiKey().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/organization/projects/{project_id}/service_accounts/{service_account_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteProjectServiceAccount().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/organization/projects/{project_id}/users/{user_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteProjectUser().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/projects/{project_id}/api_keys", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listProjectApiKeys().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/projects/{project_id}/rate_limits", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listProjectRateLimits().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/projects/{project_id}/service_accounts", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listProjectServiceAccounts().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/projects/{project_id}/users", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listProjectUsers().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/projects", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listProjects().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/organization/projects/{project_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    modifyProject().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/organization/projects/{project_id}/users/{user_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    modifyProjectUser().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/projects/{project_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    retrieveProject().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/projects/{project_id}/api_keys/{key_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    retrieveProjectApiKey().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/projects/{project_id}/service_accounts/{service_account_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    retrieveProjectServiceAccount().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/projects/{project_id}/users/{user_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    retrieveProjectUser().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/organization/projects/{project_id}/rate_limits/{rate_limit_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    updateProjectRateLimits().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/realtime/sessions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createRealtimeSession().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/uploads/{upload_id}/parts", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    addUploadPart().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/uploads/{upload_id}/cancel", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    cancelUpload().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/uploads/{upload_id}/complete", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    completeUpload().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/uploads", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createUpload().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/usage/audio_speeches", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    usageAudioSpeeches().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/usage/audio_transcriptions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    usageAudioTranscriptions().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/usage/code_interpreter_sessions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    usageCodeInterpreterSessions().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/usage/completions", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    usageCompletions().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/costs", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    usageCosts().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/usage/embeddings", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    usageEmbeddings().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/usage/images", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    usageImages().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/usage/moderations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    usageModerations().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/usage/vector_stores", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    usageVectorStores().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/organization/users/{user_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteUser().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/users", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listUsers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/organization/users/{user_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    modifyUser().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/organization/users/{user_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    retrieveUser().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    cancelVectorStoreFileBatch().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/vector_stores", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createVectorStore().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/vector_stores/{vector_store_id}/files", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createVectorStoreFile().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/vector_stores/{vector_store_id}/file_batches", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createVectorStoreFileBatch().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/vector_stores/{vector_store_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteVectorStore().handleRequest(exchange);
                }
            })
            .add(Methods.DELETE, basePath + "/vector_stores/{vector_store_id}/files/{file_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteVectorStoreFile().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/vector_stores/{vector_store_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getVectorStore().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/vector_stores/{vector_store_id}/files/{file_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getVectorStoreFile().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/vector_stores/{vector_store_id}/file_batches/{batch_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getVectorStoreFileBatch().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/vector_stores/{vector_store_id}/file_batches/{batch_id}/files", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listFilesInVectorStoreBatch().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/vector_stores/{vector_store_id}/files", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listVectorStoreFiles().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/vector_stores", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listVectorStores().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/vector_stores/{vector_store_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    modifyVectorStore().handleRequest(exchange);
                }
            })
            ;
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Endpoints bound in this method do NOT start with "/v1", and
     * it's your responsibility to configure a {@link PathHandler} with a prefix path
     * by calling {@link PathHandler#addPrefixPath} like so:</p>
     *
     * <code>pathHandler.addPrefixPath("/v1", handler)</code>
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler() {
        return getStatefulHandler(false);
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @param withBasePath if true, all endpoints would start with "/v1"
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler(final boolean withBasePath) {
        return getStatefulHandler(withBasePath ? getBasePath() : "");
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @param basePath base path to set for all endpoints
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler(final String basePath) {
        return Handlers.routing()
            .add(Methods.POST, basePath + "/threads/{thread_id}/runs/{run_id}/cancel", cancelRun())
            .add(Methods.POST, basePath + "/assistants", createAssistant())
            .add(Methods.POST, basePath + "/threads/{thread_id}/messages", createMessage())
            .add(Methods.POST, basePath + "/threads/{thread_id}/runs", createRun())
            .add(Methods.POST, basePath + "/threads", createThread())
            .add(Methods.POST, basePath + "/threads/runs", createThreadAndRun())
            .add(Methods.DELETE, basePath + "/assistants/{assistant_id}", deleteAssistant())
            .add(Methods.DELETE, basePath + "/threads/{thread_id}/messages/{message_id}", deleteMessage())
            .add(Methods.DELETE, basePath + "/threads/{thread_id}", deleteThread())
            .add(Methods.GET, basePath + "/assistants/{assistant_id}", getAssistant())
            .add(Methods.GET, basePath + "/threads/{thread_id}/messages/{message_id}", getMessage())
            .add(Methods.GET, basePath + "/threads/{thread_id}/runs/{run_id}", getRun())
            .add(Methods.GET, basePath + "/threads/{thread_id}/runs/{run_id}/steps/{step_id}", getRunStep())
            .add(Methods.GET, basePath + "/threads/{thread_id}", getThread())
            .add(Methods.GET, basePath + "/assistants", listAssistants())
            .add(Methods.GET, basePath + "/threads/{thread_id}/messages", listMessages())
            .add(Methods.GET, basePath + "/threads/{thread_id}/runs/{run_id}/steps", listRunSteps())
            .add(Methods.GET, basePath + "/threads/{thread_id}/runs", listRuns())
            .add(Methods.POST, basePath + "/assistants/{assistant_id}", modifyAssistant())
            .add(Methods.POST, basePath + "/threads/{thread_id}/messages/{message_id}", modifyMessage())
            .add(Methods.POST, basePath + "/threads/{thread_id}/runs/{run_id}", modifyRun())
            .add(Methods.POST, basePath + "/threads/{thread_id}", modifyThread())
            .add(Methods.POST, basePath + "/threads/{thread_id}/runs/{run_id}/submit_tool_outputs", submitToolOuputsToRun())
            .add(Methods.POST, basePath + "/audio/speech", createSpeech())
            .add(Methods.POST, basePath + "/audio/transcriptions", createTranscription())
            .add(Methods.POST, basePath + "/audio/translations", createTranslation())
            .add(Methods.GET, basePath + "/organization/audit_logs", listAuditLogs())
            .add(Methods.POST, basePath + "/batches/{batch_id}/cancel", cancelBatch())
            .add(Methods.POST, basePath + "/batches", createBatch())
            .add(Methods.GET, basePath + "/batches", listBatches())
            .add(Methods.GET, basePath + "/batches/{batch_id}", retrieveBatch())
            .add(Methods.POST, basePath + "/chat/completions", createChatCompletion())
            .add(Methods.POST, basePath + "/completions", createCompletion())
            .add(Methods.POST, basePath + "/organization/admin_api_keys", adminApiKeysCreate())
            .add(Methods.DELETE, basePath + "/organization/admin_api_keys/{key_id}", adminApiKeysDelete())
            .add(Methods.GET, basePath + "/organization/admin_api_keys/{key_id}", adminApiKeysGet())
            .add(Methods.GET, basePath + "/organization/admin_api_keys", adminApiKeysList())
            .add(Methods.POST, basePath + "/embeddings", createEmbedding())
            .add(Methods.POST, basePath + "/files", createFile())
            .add(Methods.DELETE, basePath + "/files/{file_id}", deleteFile())
            .add(Methods.GET, basePath + "/files/{file_id}/content", downloadFile())
            .add(Methods.GET, basePath + "/files", listFiles())
            .add(Methods.GET, basePath + "/files/{file_id}", retrieveFile())
            .add(Methods.POST, basePath + "/fine_tuning/jobs/{fine_tuning_job_id}/cancel", cancelFineTuningJob())
            .add(Methods.POST, basePath + "/fine_tuning/jobs", createFineTuningJob())
            .add(Methods.GET, basePath + "/fine_tuning/jobs/{fine_tuning_job_id}/events", listFineTuningEvents())
            .add(Methods.GET, basePath + "/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints", listFineTuningJobCheckpoints())
            .add(Methods.GET, basePath + "/fine_tuning/jobs", listPaginatedFineTuningJobs())
            .add(Methods.GET, basePath + "/fine_tuning/jobs/{fine_tuning_job_id}", retrieveFineTuningJob())
            .add(Methods.POST, basePath + "/images/generations", createImage())
            .add(Methods.POST, basePath + "/images/edits", createImageEdit())
            .add(Methods.POST, basePath + "/images/variations", createImageVariation())
            .add(Methods.DELETE, basePath + "/organization/invites/{invite_id}", deleteInvite())
            .add(Methods.POST, basePath + "/organization/invites", inviteUser())
            .add(Methods.GET, basePath + "/organization/invites", listInvites())
            .add(Methods.GET, basePath + "/organization/invites/{invite_id}", retrieveInvite())
            .add(Methods.DELETE, basePath + "/models/{model}", deleteModel())
            .add(Methods.GET, basePath + "/models", listModels())
            .add(Methods.GET, basePath + "/models/{model}", retrieveModel())
            .add(Methods.POST, basePath + "/moderations", createModeration())
            .add(Methods.POST, basePath + "/organization/projects/{project_id}/archive", archiveProject())
            .add(Methods.POST, basePath + "/organization/projects", createProject())
            .add(Methods.POST, basePath + "/organization/projects/{project_id}/service_accounts", createProjectServiceAccount())
            .add(Methods.POST, basePath + "/organization/projects/{project_id}/users", createProjectUser())
            .add(Methods.DELETE, basePath + "/organization/projects/{project_id}/api_keys/{key_id}", deleteProjectApiKey())
            .add(Methods.DELETE, basePath + "/organization/projects/{project_id}/service_accounts/{service_account_id}", deleteProjectServiceAccount())
            .add(Methods.DELETE, basePath + "/organization/projects/{project_id}/users/{user_id}", deleteProjectUser())
            .add(Methods.GET, basePath + "/organization/projects/{project_id}/api_keys", listProjectApiKeys())
            .add(Methods.GET, basePath + "/organization/projects/{project_id}/rate_limits", listProjectRateLimits())
            .add(Methods.GET, basePath + "/organization/projects/{project_id}/service_accounts", listProjectServiceAccounts())
            .add(Methods.GET, basePath + "/organization/projects/{project_id}/users", listProjectUsers())
            .add(Methods.GET, basePath + "/organization/projects", listProjects())
            .add(Methods.POST, basePath + "/organization/projects/{project_id}", modifyProject())
            .add(Methods.POST, basePath + "/organization/projects/{project_id}/users/{user_id}", modifyProjectUser())
            .add(Methods.GET, basePath + "/organization/projects/{project_id}", retrieveProject())
            .add(Methods.GET, basePath + "/organization/projects/{project_id}/api_keys/{key_id}", retrieveProjectApiKey())
            .add(Methods.GET, basePath + "/organization/projects/{project_id}/service_accounts/{service_account_id}", retrieveProjectServiceAccount())
            .add(Methods.GET, basePath + "/organization/projects/{project_id}/users/{user_id}", retrieveProjectUser())
            .add(Methods.POST, basePath + "/organization/projects/{project_id}/rate_limits/{rate_limit_id}", updateProjectRateLimits())
            .add(Methods.POST, basePath + "/realtime/sessions", createRealtimeSession())
            .add(Methods.POST, basePath + "/uploads/{upload_id}/parts", addUploadPart())
            .add(Methods.POST, basePath + "/uploads/{upload_id}/cancel", cancelUpload())
            .add(Methods.POST, basePath + "/uploads/{upload_id}/complete", completeUpload())
            .add(Methods.POST, basePath + "/uploads", createUpload())
            .add(Methods.GET, basePath + "/organization/usage/audio_speeches", usageAudioSpeeches())
            .add(Methods.GET, basePath + "/organization/usage/audio_transcriptions", usageAudioTranscriptions())
            .add(Methods.GET, basePath + "/organization/usage/code_interpreter_sessions", usageCodeInterpreterSessions())
            .add(Methods.GET, basePath + "/organization/usage/completions", usageCompletions())
            .add(Methods.GET, basePath + "/organization/costs", usageCosts())
            .add(Methods.GET, basePath + "/organization/usage/embeddings", usageEmbeddings())
            .add(Methods.GET, basePath + "/organization/usage/images", usageImages())
            .add(Methods.GET, basePath + "/organization/usage/moderations", usageModerations())
            .add(Methods.GET, basePath + "/organization/usage/vector_stores", usageVectorStores())
            .add(Methods.DELETE, basePath + "/organization/users/{user_id}", deleteUser())
            .add(Methods.GET, basePath + "/organization/users", listUsers())
            .add(Methods.POST, basePath + "/organization/users/{user_id}", modifyUser())
            .add(Methods.GET, basePath + "/organization/users/{user_id}", retrieveUser())
            .add(Methods.POST, basePath + "/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel", cancelVectorStoreFileBatch())
            .add(Methods.POST, basePath + "/vector_stores", createVectorStore())
            .add(Methods.POST, basePath + "/vector_stores/{vector_store_id}/files", createVectorStoreFile())
            .add(Methods.POST, basePath + "/vector_stores/{vector_store_id}/file_batches", createVectorStoreFileBatch())
            .add(Methods.DELETE, basePath + "/vector_stores/{vector_store_id}", deleteVectorStore())
            .add(Methods.DELETE, basePath + "/vector_stores/{vector_store_id}/files/{file_id}", deleteVectorStoreFile())
            .add(Methods.GET, basePath + "/vector_stores/{vector_store_id}", getVectorStore())
            .add(Methods.GET, basePath + "/vector_stores/{vector_store_id}/files/{file_id}", getVectorStoreFile())
            .add(Methods.GET, basePath + "/vector_stores/{vector_store_id}/file_batches/{batch_id}", getVectorStoreFileBatch())
            .add(Methods.GET, basePath + "/vector_stores/{vector_store_id}/file_batches/{batch_id}/files", listFilesInVectorStoreBatch())
            .add(Methods.GET, basePath + "/vector_stores/{vector_store_id}/files", listVectorStoreFiles())
            .add(Methods.GET, basePath + "/vector_stores", listVectorStores())
            .add(Methods.POST, basePath + "/vector_stores/{vector_store_id}", modifyVectorStore())
            ;
    }
}
