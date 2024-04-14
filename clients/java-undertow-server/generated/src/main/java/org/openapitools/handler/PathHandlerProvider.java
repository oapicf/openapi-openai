/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.0.0
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
            .add(Methods.POST, basePath + "/assistants/{assistant_id}/files", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    createAssistantFile().handleRequest(exchange);
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
            .add(Methods.DELETE, basePath + "/assistants/{assistant_id}/files/{file_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    deleteAssistantFile().handleRequest(exchange);
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
            .add(Methods.GET, basePath + "/assistants/{assistant_id}/files/{file_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getAssistantFile().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/threads/{thread_id}/messages/{message_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getMessage().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/threads/{thread_id}/messages/{message_id}/files/{file_id}", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    getMessageFile().handleRequest(exchange);
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
            .add(Methods.GET, basePath + "/assistants/{assistant_id}/files", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listAssistantFiles().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/assistants", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listAssistants().handleRequest(exchange);
                }
            })
            .add(Methods.GET, basePath + "/threads/{thread_id}/messages/{message_id}/files", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    listMessageFiles().handleRequest(exchange);
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
            .add(Methods.POST, basePath + "/assistants/{assistant_id}/files", createAssistantFile())
            .add(Methods.POST, basePath + "/threads/{thread_id}/messages", createMessage())
            .add(Methods.POST, basePath + "/threads/{thread_id}/runs", createRun())
            .add(Methods.POST, basePath + "/threads", createThread())
            .add(Methods.POST, basePath + "/threads/runs", createThreadAndRun())
            .add(Methods.DELETE, basePath + "/assistants/{assistant_id}", deleteAssistant())
            .add(Methods.DELETE, basePath + "/assistants/{assistant_id}/files/{file_id}", deleteAssistantFile())
            .add(Methods.DELETE, basePath + "/threads/{thread_id}", deleteThread())
            .add(Methods.GET, basePath + "/assistants/{assistant_id}", getAssistant())
            .add(Methods.GET, basePath + "/assistants/{assistant_id}/files/{file_id}", getAssistantFile())
            .add(Methods.GET, basePath + "/threads/{thread_id}/messages/{message_id}", getMessage())
            .add(Methods.GET, basePath + "/threads/{thread_id}/messages/{message_id}/files/{file_id}", getMessageFile())
            .add(Methods.GET, basePath + "/threads/{thread_id}/runs/{run_id}", getRun())
            .add(Methods.GET, basePath + "/threads/{thread_id}/runs/{run_id}/steps/{step_id}", getRunStep())
            .add(Methods.GET, basePath + "/threads/{thread_id}", getThread())
            .add(Methods.GET, basePath + "/assistants/{assistant_id}/files", listAssistantFiles())
            .add(Methods.GET, basePath + "/assistants", listAssistants())
            .add(Methods.GET, basePath + "/threads/{thread_id}/messages/{message_id}/files", listMessageFiles())
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
            .add(Methods.POST, basePath + "/chat/completions", createChatCompletion())
            .add(Methods.POST, basePath + "/completions", createCompletion())
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
            .add(Methods.DELETE, basePath + "/models/{model}", deleteModel())
            .add(Methods.GET, basePath + "/models", listModels())
            .add(Methods.GET, basePath + "/models/{model}", retrieveModel())
            .add(Methods.POST, basePath + "/moderations", createModeration())
            ;
    }
}
