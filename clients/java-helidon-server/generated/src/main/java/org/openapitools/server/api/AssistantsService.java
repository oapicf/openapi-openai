package org.openapitools.server.api;

import org.openapitools.server.model.AssistantObject;
import java.util.stream.Collectors;
import org.openapitools.server.model.CreateAssistantRequest;
import org.openapitools.server.model.CreateMessageRequest;
import org.openapitools.server.model.CreateRunRequest;
import org.openapitools.server.model.CreateThreadAndRunRequest;
import org.openapitools.server.model.CreateThreadRequest;
import org.openapitools.server.model.DeleteAssistantResponse;
import org.openapitools.server.model.DeleteMessageResponse;
import org.openapitools.server.model.DeleteThreadResponse;
import java.util.HexFormat;
import java.util.List;
import org.openapitools.server.model.ListAssistantsResponse;
import org.openapitools.server.model.ListMessagesResponse;
import org.openapitools.server.model.ListRunStepsResponse;
import org.openapitools.server.model.ListRunsResponse;
import org.openapitools.server.model.MessageObject;
import org.openapitools.server.model.ModifyAssistantRequest;
import org.openapitools.server.model.ModifyMessageRequest;
import org.openapitools.server.model.ModifyRunRequest;
import org.openapitools.server.model.ModifyThreadRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.RunObject;
import org.openapitools.server.model.RunStepObject;
import io.helidon.http.Status;
import org.openapitools.server.model.SubmitToolOutputsRunRequest;
import org.openapitools.server.model.ThreadObject;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Assistants'",
                             version = "7.24.0")
public interface AssistantsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/threads/{thread_id}/runs/{run_id}/cancel", this::cancelRun);
        rules.post("/assistants", this::createAssistant);
        rules.post("/threads/{thread_id}/messages", this::createMessage);
        rules.post("/threads/{thread_id}/runs", this::createRun);
        rules.post("/threads", this::createThread);
        rules.post("/threads/runs", this::createThreadAndRun);
        rules.delete("/assistants/{assistant_id}", this::deleteAssistant);
        rules.delete("/threads/{thread_id}/messages/{message_id}", this::deleteMessage);
        rules.delete("/threads/{thread_id}", this::deleteThread);
        rules.get("/assistants/{assistant_id}", this::getAssistant);
        rules.get("/threads/{thread_id}/messages/{message_id}", this::getMessage);
        rules.get("/threads/{thread_id}/runs/{run_id}", this::getRun);
        rules.get("/threads/{thread_id}/runs/{run_id}/steps/{step_id}", this::getRunStep);
        rules.get("/threads/{thread_id}", this::getThread);
        rules.get("/assistants", this::listAssistants);
        rules.get("/threads/{thread_id}/messages", this::listMessages);
        rules.get("/threads/{thread_id}/runs/{run_id}/steps", this::listRunSteps);
        rules.get("/threads/{thread_id}/runs", this::listRuns);
        rules.post("/assistants/{assistant_id}", this::modifyAssistant);
        rules.post("/threads/{thread_id}/messages/{message_id}", this::modifyMessage);
        rules.post("/threads/{thread_id}/runs/{run_id}", this::modifyRun);
        rules.post("/threads/{thread_id}", this::modifyThread);
        rules.post("/threads/{thread_id}/runs/{run_id}/submit_tool_outputs", this::submitToolOuputsToRun);
    }


    /**
     * POST /threads/{thread_id}/runs/{run_id}/cancel : Cancels a run that is &#x60;in_progress&#x60;..
     *
     * @param request the server request
     * @param response the server response
     */
    void cancelRun(ServerRequest request, ServerResponse response);
    /**
     * POST /assistants : Create an assistant with a model and instructions..
     *
     * @param request the server request
     * @param response the server response
     */
    void createAssistant(ServerRequest request, ServerResponse response);
    /**
     * POST /threads/{thread_id}/messages : Create a message..
     *
     * @param request the server request
     * @param response the server response
     */
    void createMessage(ServerRequest request, ServerResponse response);
    /**
     * POST /threads/{thread_id}/runs : Create a run..
     *
     * @param request the server request
     * @param response the server response
     */
    void createRun(ServerRequest request, ServerResponse response);
    /**
     * POST /threads : Create a thread..
     *
     * @param request the server request
     * @param response the server response
     */
    void createThread(ServerRequest request, ServerResponse response);
    /**
     * POST /threads/runs : Create a thread and run it in one request..
     *
     * @param request the server request
     * @param response the server response
     */
    void createThreadAndRun(ServerRequest request, ServerResponse response);
    /**
     * DELETE /assistants/{assistant_id} : Delete an assistant..
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteAssistant(ServerRequest request, ServerResponse response);
    /**
     * DELETE /threads/{thread_id}/messages/{message_id} : Deletes a message..
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteMessage(ServerRequest request, ServerResponse response);
    /**
     * DELETE /threads/{thread_id} : Delete a thread..
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteThread(ServerRequest request, ServerResponse response);
    /**
     * GET /assistants/{assistant_id} : Retrieves an assistant..
     *
     * @param request the server request
     * @param response the server response
     */
    void getAssistant(ServerRequest request, ServerResponse response);
    /**
     * GET /threads/{thread_id}/messages/{message_id} : Retrieve a message..
     *
     * @param request the server request
     * @param response the server response
     */
    void getMessage(ServerRequest request, ServerResponse response);
    /**
     * GET /threads/{thread_id}/runs/{run_id} : Retrieves a run..
     *
     * @param request the server request
     * @param response the server response
     */
    void getRun(ServerRequest request, ServerResponse response);
    /**
     * GET /threads/{thread_id}/runs/{run_id}/steps/{step_id} : Retrieves a run step..
     *
     * @param request the server request
     * @param response the server response
     */
    void getRunStep(ServerRequest request, ServerResponse response);
    /**
     * GET /threads/{thread_id} : Retrieves a thread..
     *
     * @param request the server request
     * @param response the server response
     */
    void getThread(ServerRequest request, ServerResponse response);
    /**
     * GET /assistants : Returns a list of assistants..
     *
     * @param request the server request
     * @param response the server response
     */
    void listAssistants(ServerRequest request, ServerResponse response);
    /**
     * GET /threads/{thread_id}/messages : Returns a list of messages for a given thread..
     *
     * @param request the server request
     * @param response the server response
     */
    void listMessages(ServerRequest request, ServerResponse response);
    /**
     * GET /threads/{thread_id}/runs/{run_id}/steps : Returns a list of run steps belonging to a run..
     *
     * @param request the server request
     * @param response the server response
     */
    void listRunSteps(ServerRequest request, ServerResponse response);
    /**
     * GET /threads/{thread_id}/runs : Returns a list of runs belonging to a thread..
     *
     * @param request the server request
     * @param response the server response
     */
    void listRuns(ServerRequest request, ServerResponse response);
    /**
     * POST /assistants/{assistant_id} : Modifies an assistant..
     *
     * @param request the server request
     * @param response the server response
     */
    void modifyAssistant(ServerRequest request, ServerResponse response);
    /**
     * POST /threads/{thread_id}/messages/{message_id} : Modifies a message..
     *
     * @param request the server request
     * @param response the server response
     */
    void modifyMessage(ServerRequest request, ServerResponse response);
    /**
     * POST /threads/{thread_id}/runs/{run_id} : Modifies a run..
     *
     * @param request the server request
     * @param response the server response
     */
    void modifyRun(ServerRequest request, ServerResponse response);
    /**
     * POST /threads/{thread_id} : Modifies a thread..
     *
     * @param request the server request
     * @param response the server response
     */
    void modifyThread(ServerRequest request, ServerResponse response);
    /**
     * POST /threads/{thread_id}/runs/{run_id}/submit_tool_outputs : When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. .
     *
     * @param request the server request
     * @param response the server response
     */
    void submitToolOuputsToRun(ServerRequest request, ServerResponse response);
}
