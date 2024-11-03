package org.openapitools.controller;

import org.openapitools.model.AssistantFileObject;
import org.openapitools.model.AssistantObject;
import org.openapitools.model.CreateAssistantFileRequest;
import org.openapitools.model.CreateAssistantRequest;
import org.openapitools.model.CreateMessageRequest;
import org.openapitools.model.CreateRunRequest;
import org.openapitools.model.CreateThreadAndRunRequest;
import org.openapitools.model.CreateThreadRequest;
import org.openapitools.model.DeleteAssistantFileResponse;
import org.openapitools.model.DeleteAssistantResponse;
import org.openapitools.model.DeleteThreadResponse;
import org.openapitools.model.ListAssistantFilesResponse;
import org.openapitools.model.ListAssistantsResponse;
import org.openapitools.model.ListMessageFilesResponse;
import org.openapitools.model.ListMessagesResponse;
import org.openapitools.model.ListRunStepsResponse;
import org.openapitools.model.ListRunsResponse;
import org.openapitools.model.MessageFileObject;
import org.openapitools.model.MessageObject;
import org.openapitools.model.ModifyAssistantRequest;
import org.openapitools.model.ModifyMessageRequest;
import org.openapitools.model.ModifyRunRequest;
import org.openapitools.model.ModifyThreadRequest;
import org.openapitools.model.RunObject;
import org.openapitools.model.RunStepObject;
import org.openapitools.model.SubmitToolOutputsRunRequest;
import org.openapitools.model.ThreadObject;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for AssistantsController
 */
@MicronautTest
public class AssistantsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    AssistantsController controller;

    /**
     * This test is used to validate the implementation of cancelRun() method
     *
     * The method should: Cancels a run that is &#x60;in_progress&#x60;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void cancelRunMethodTest() {
        // given
        String threadId = "example";
        String runId = "example";

        // when
        RunObject result = controller.cancelRun(threadId, runId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}/runs/{run_id}/cancel' to the features of cancelRun() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void cancelRunClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/threads/{thread_id}/runs/{run_id}/cancel").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "example");
            put("run_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@561c031");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, RunObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createAssistant() method
     *
     * The method should: Create an assistant with a model and instructions.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createAssistantMethodTest() {
        // given
        CreateAssistantRequest createAssistantRequest = new CreateAssistantRequest(null);

        // when
        AssistantObject result = controller.createAssistant(createAssistantRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/assistants' to the features of createAssistant() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createAssistantClientApiTest() throws IOException {
        // given
        CreateAssistantRequest body = new CreateAssistantRequest(null);
        String uri = UriTemplate.of("/assistants").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@7343d843");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AssistantObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createAssistantFile() method
     *
     * The method should: Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createAssistantFileMethodTest() {
        // given
        String assistantId = "file-abc123";
        CreateAssistantFileRequest createAssistantFileRequest = new CreateAssistantFileRequest("example");

        // when
        AssistantFileObject result = controller.createAssistantFile(assistantId, createAssistantFileRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/assistants/{assistant_id}/files' to the features of createAssistantFile() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createAssistantFileClientApiTest() throws IOException {
        // given
        CreateAssistantFileRequest body = new CreateAssistantFileRequest("example");
        String uri = UriTemplate.of("/assistants/{assistant_id}/files").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("assistant_id", "file-abc123");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@29a1dab3");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AssistantFileObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createMessage() method
     *
     * The method should: Create a message.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createMessageMethodTest() {
        // given
        String threadId = "example";
        CreateMessageRequest createMessageRequest = new CreateMessageRequest("example", "example");

        // when
        MessageObject result = controller.createMessage(threadId, createMessageRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}/messages' to the features of createMessage() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createMessageClientApiTest() throws IOException {
        // given
        CreateMessageRequest body = new CreateMessageRequest("example", "example");
        String uri = UriTemplate.of("/threads/{thread_id}/messages").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@619b7436");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, MessageObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createRun() method
     *
     * The method should: Create a run.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createRunMethodTest() {
        // given
        String threadId = "example";
        CreateRunRequest createRunRequest = new CreateRunRequest("example");

        // when
        RunObject result = controller.createRun(threadId, createRunRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}/runs' to the features of createRun() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createRunClientApiTest() throws IOException {
        // given
        CreateRunRequest body = new CreateRunRequest("example");
        String uri = UriTemplate.of("/threads/{thread_id}/runs").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@6af0407c");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, RunObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createThread() method
     *
     * The method should: Create a thread.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createThreadMethodTest() {
        // given
        CreateThreadRequest createThreadRequest = new CreateThreadRequest();

        // when
        ThreadObject result = controller.createThread(createThreadRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads' to the features of createThread() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createThreadClientApiTest() throws IOException {
        // given
        CreateThreadRequest body = new CreateThreadRequest();
        String uri = UriTemplate.of("/threads").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@71c1ca1");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ThreadObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createThreadAndRun() method
     *
     * The method should: Create a thread and run it in one request.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createThreadAndRunMethodTest() {
        // given
        CreateThreadAndRunRequest createThreadAndRunRequest = new CreateThreadAndRunRequest("example");

        // when
        RunObject result = controller.createThreadAndRun(createThreadAndRunRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/runs' to the features of createThreadAndRun() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createThreadAndRunClientApiTest() throws IOException {
        // given
        CreateThreadAndRunRequest body = new CreateThreadAndRunRequest("example");
        String uri = UriTemplate.of("/threads/runs").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@20cf3ab3");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, RunObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteAssistant() method
     *
     * The method should: Delete an assistant.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteAssistantMethodTest() {
        // given
        String assistantId = "example";

        // when
        DeleteAssistantResponse result = controller.deleteAssistant(assistantId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/assistants/{assistant_id}' to the features of deleteAssistant() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteAssistantClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/assistants/{assistant_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("assistant_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@1acfc058");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeleteAssistantResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteAssistantFile() method
     *
     * The method should: Delete an assistant file.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteAssistantFileMethodTest() {
        // given
        String assistantId = "example";
        String fileId = "example";

        // when
        DeleteAssistantFileResponse result = controller.deleteAssistantFile(assistantId, fileId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/assistants/{assistant_id}/files/{file_id}' to the features of deleteAssistantFile() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteAssistantFileClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/assistants/{assistant_id}/files/{file_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("assistant_id", "example");
            put("file_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@725490dd");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeleteAssistantFileResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteThread() method
     *
     * The method should: Delete a thread.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteThreadMethodTest() {
        // given
        String threadId = "example";

        // when
        DeleteThreadResponse result = controller.deleteThread(threadId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}' to the features of deleteThread() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteThreadClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/threads/{thread_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@15ca7322");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeleteThreadResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getAssistant() method
     *
     * The method should: Retrieves an assistant.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getAssistantMethodTest() {
        // given
        String assistantId = "example";

        // when
        AssistantObject result = controller.getAssistant(assistantId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/assistants/{assistant_id}' to the features of getAssistant() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getAssistantClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/assistants/{assistant_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("assistant_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4c89c98a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AssistantObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getAssistantFile() method
     *
     * The method should: Retrieves an AssistantFile.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getAssistantFileMethodTest() {
        // given
        String assistantId = "example";
        String fileId = "example";

        // when
        AssistantFileObject result = controller.getAssistantFile(assistantId, fileId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/assistants/{assistant_id}/files/{file_id}' to the features of getAssistantFile() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getAssistantFileClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/assistants/{assistant_id}/files/{file_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("assistant_id", "example");
            put("file_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@28200d43");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AssistantFileObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getMessage() method
     *
     * The method should: Retrieve a message.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getMessageMethodTest() {
        // given
        String threadId = "example";
        String messageId = "example";

        // when
        MessageObject result = controller.getMessage(threadId, messageId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}/messages/{message_id}' to the features of getMessage() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getMessageClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/threads/{thread_id}/messages/{message_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "example");
            put("message_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7e24a2e2");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, MessageObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getMessageFile() method
     *
     * The method should: Retrieves a message file.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getMessageFileMethodTest() {
        // given
        String threadId = "thread_abc123";
        String messageId = "msg_abc123";
        String fileId = "file-abc123";

        // when
        MessageFileObject result = controller.getMessageFile(threadId, messageId, fileId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}/messages/{message_id}/files/{file_id}' to the features of getMessageFile() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getMessageFileClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/threads/{thread_id}/messages/{message_id}/files/{file_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "thread_abc123");
            put("message_id", "msg_abc123");
            put("file_id", "file-abc123");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@38318d67");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, MessageFileObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getRun() method
     *
     * The method should: Retrieves a run.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getRunMethodTest() {
        // given
        String threadId = "example";
        String runId = "example";

        // when
        RunObject result = controller.getRun(threadId, runId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}/runs/{run_id}' to the features of getRun() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getRunClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/threads/{thread_id}/runs/{run_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "example");
            put("run_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3af6c672");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, RunObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getRunStep() method
     *
     * The method should: Retrieves a run step.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getRunStepMethodTest() {
        // given
        String threadId = "example";
        String runId = "example";
        String stepId = "example";

        // when
        RunStepObject result = controller.getRunStep(threadId, runId, stepId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}/runs/{run_id}/steps/{step_id}' to the features of getRunStep() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getRunStepClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/threads/{thread_id}/runs/{run_id}/steps/{step_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "example");
            put("run_id", "example");
            put("step_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@12948e7a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, RunStepObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getThread() method
     *
     * The method should: Retrieves a thread.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getThreadMethodTest() {
        // given
        String threadId = "example";

        // when
        ThreadObject result = controller.getThread(threadId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}' to the features of getThread() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getThreadClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/threads/{thread_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@497c1d78");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ThreadObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listAssistantFiles() method
     *
     * The method should: Returns a list of assistant files.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listAssistantFilesMethodTest() {
        // given
        String assistantId = "example";
        Integer limit = 20;
        String order = "desc";
        String after = "example";
        String before = "example";

        // when
        ListAssistantFilesResponse result = controller.listAssistantFiles(assistantId, limit, order, after, before).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/assistants/{assistant_id}/files' to the features of listAssistantFiles() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listAssistantFilesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/assistants/{assistant_id}/files").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("assistant_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7d12fb85");
        request.getParameters()
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("order", "desc") // The query parameter format should be 
            .add("after", "example") // The query parameter format should be 
            .add("before", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListAssistantFilesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listAssistants() method
     *
     * The method should: Returns a list of assistants.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listAssistantsMethodTest() {
        // given
        Integer limit = 20;
        String order = "desc";
        String after = "example";
        String before = "example";

        // when
        ListAssistantsResponse result = controller.listAssistants(limit, order, after, before).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/assistants' to the features of listAssistants() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listAssistantsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/assistants").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@71db6703");
        request.getParameters()
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("order", "desc") // The query parameter format should be 
            .add("after", "example") // The query parameter format should be 
            .add("before", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListAssistantsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listMessageFiles() method
     *
     * The method should: Returns a list of message files.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listMessageFilesMethodTest() {
        // given
        String threadId = "example";
        String messageId = "example";
        Integer limit = 20;
        String order = "desc";
        String after = "example";
        String before = "example";

        // when
        ListMessageFilesResponse result = controller.listMessageFiles(threadId, messageId, limit, order, after, before).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}/messages/{message_id}/files' to the features of listMessageFiles() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listMessageFilesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/threads/{thread_id}/messages/{message_id}/files").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "example");
            put("message_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@41092c8");
        request.getParameters()
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("order", "desc") // The query parameter format should be 
            .add("after", "example") // The query parameter format should be 
            .add("before", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListMessageFilesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listMessages() method
     *
     * The method should: Returns a list of messages for a given thread.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listMessagesMethodTest() {
        // given
        String threadId = "example";
        Integer limit = 20;
        String order = "desc";
        String after = "example";
        String before = "example";
        String runId = "example";

        // when
        ListMessagesResponse result = controller.listMessages(threadId, limit, order, after, before, runId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}/messages' to the features of listMessages() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listMessagesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/threads/{thread_id}/messages").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2e590e36");
        request.getParameters()
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("order", "desc") // The query parameter format should be 
            .add("after", "example") // The query parameter format should be 
            .add("before", "example") // The query parameter format should be 
            .add("run_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListMessagesResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listRunSteps() method
     *
     * The method should: Returns a list of run steps belonging to a run.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listRunStepsMethodTest() {
        // given
        String threadId = "example";
        String runId = "example";
        Integer limit = 20;
        String order = "desc";
        String after = "example";
        String before = "example";

        // when
        ListRunStepsResponse result = controller.listRunSteps(threadId, runId, limit, order, after, before).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}/runs/{run_id}/steps' to the features of listRunSteps() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listRunStepsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/threads/{thread_id}/runs/{run_id}/steps").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "example");
            put("run_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3fc2a1d1");
        request.getParameters()
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("order", "desc") // The query parameter format should be 
            .add("after", "example") // The query parameter format should be 
            .add("before", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListRunStepsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listRuns() method
     *
     * The method should: Returns a list of runs belonging to a thread.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listRunsMethodTest() {
        // given
        String threadId = "example";
        Integer limit = 20;
        String order = "desc";
        String after = "example";
        String before = "example";

        // when
        ListRunsResponse result = controller.listRuns(threadId, limit, order, after, before).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}/runs' to the features of listRuns() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listRunsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/threads/{thread_id}/runs").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@752e4223");
        request.getParameters()
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("order", "desc") // The query parameter format should be 
            .add("after", "example") // The query parameter format should be 
            .add("before", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ListRunsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of modifyAssistant() method
     *
     * The method should: Modifies an assistant.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void modifyAssistantMethodTest() {
        // given
        String assistantId = "example";
        ModifyAssistantRequest modifyAssistantRequest = new ModifyAssistantRequest();

        // when
        AssistantObject result = controller.modifyAssistant(assistantId, modifyAssistantRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/assistants/{assistant_id}' to the features of modifyAssistant() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void modifyAssistantClientApiTest() throws IOException {
        // given
        ModifyAssistantRequest body = new ModifyAssistantRequest();
        String uri = UriTemplate.of("/assistants/{assistant_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("assistant_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@7528089c");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AssistantObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of modifyMessage() method
     *
     * The method should: Modifies a message.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void modifyMessageMethodTest() {
        // given
        String threadId = "example";
        String messageId = "example";
        ModifyMessageRequest modifyMessageRequest = new ModifyMessageRequest();

        // when
        MessageObject result = controller.modifyMessage(threadId, messageId, modifyMessageRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}/messages/{message_id}' to the features of modifyMessage() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void modifyMessageClientApiTest() throws IOException {
        // given
        ModifyMessageRequest body = new ModifyMessageRequest();
        String uri = UriTemplate.of("/threads/{thread_id}/messages/{message_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "example");
            put("message_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@136690b1");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, MessageObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of modifyRun() method
     *
     * The method should: Modifies a run.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void modifyRunMethodTest() {
        // given
        String threadId = "example";
        String runId = "example";
        ModifyRunRequest modifyRunRequest = new ModifyRunRequest();

        // when
        RunObject result = controller.modifyRun(threadId, runId, modifyRunRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}/runs/{run_id}' to the features of modifyRun() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void modifyRunClientApiTest() throws IOException {
        // given
        ModifyRunRequest body = new ModifyRunRequest();
        String uri = UriTemplate.of("/threads/{thread_id}/runs/{run_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "example");
            put("run_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@39007725");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, RunObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of modifyThread() method
     *
     * The method should: Modifies a thread.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void modifyThreadMethodTest() {
        // given
        String threadId = "example";
        ModifyThreadRequest modifyThreadRequest = new ModifyThreadRequest();

        // when
        ThreadObject result = controller.modifyThread(threadId, modifyThreadRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}' to the features of modifyThread() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void modifyThreadClientApiTest() throws IOException {
        // given
        ModifyThreadRequest body = new ModifyThreadRequest();
        String uri = UriTemplate.of("/threads/{thread_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@3eb8057c");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ThreadObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of submitToolOuputsToRun() method
     *
     * The method should: When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void submitToolOuputsToRunMethodTest() {
        // given
        String threadId = "example";
        String runId = "example";
        SubmitToolOutputsRunRequest submitToolOutputsRunRequest = new SubmitToolOutputsRunRequest(Arrays.asList());

        // when
        RunObject result = controller.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/threads/{thread_id}/runs/{run_id}/submit_tool_outputs' to the features of submitToolOuputsToRun() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void submitToolOuputsToRunClientApiTest() throws IOException {
        // given
        SubmitToolOutputsRunRequest body = new SubmitToolOutputsRunRequest(Arrays.asList());
        String uri = UriTemplate.of("/threads/{thread_id}/runs/{run_id}/submit_tool_outputs").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("thread_id", "example");
            put("run_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@be186df");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, RunObject.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
