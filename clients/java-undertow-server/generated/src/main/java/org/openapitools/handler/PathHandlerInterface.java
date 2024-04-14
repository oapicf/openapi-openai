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

import io.undertow.server.*;
import io.undertow.util.*;

import org.openapitools.model.*;

@SuppressWarnings("TooManyFunctions")
public interface PathHandlerInterface {

    /**
     * <p>Cancels a run that is `in_progress`.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/threads/{thread_id}/runs/{run_id}/cancel" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the thread to which this run belongs.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>run_id</b>"
     * <p>The ID of the run to cancel.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link RunObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler cancelRun();

    /**
     * <p>Create an assistant with a model and instructions.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/assistants" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateAssistantRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AssistantObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createAssistant();

    /**
     * <p>Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/assistants/{assistant_id}/files" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>assistant_id</b>"
     * <p>The ID of the assistant for which to create a File. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateAssistantFileRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AssistantFileObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createAssistantFile();

    /**
     * <p>Create a message.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/threads/{thread_id}/messages" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the [thread](/docs/api-reference/threads) to create a message for.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateMessageRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MessageObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createMessage();

    /**
     * <p>Create a run.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/threads/{thread_id}/runs" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the thread to run.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateRunRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link RunObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createRun();

    /**
     * <p>Create a thread.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/threads" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateThreadRequest} (<i>required: false</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ThreadObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createThread();

    /**
     * <p>Create a thread and run it in one request.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/threads/runs" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateThreadAndRunRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link RunObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createThreadAndRun();

    /**
     * <p>Delete an assistant.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v1/assistants/{assistant_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>assistant_id</b>"
     * <p>The ID of the assistant to delete.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DeleteAssistantResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteAssistant();

    /**
     * <p>Delete an assistant file.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v1/assistants/{assistant_id}/files/{file_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>assistant_id</b>"
     * <p>The ID of the assistant that the file belongs to.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>file_id</b>"
     * <p>The ID of the file to delete.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DeleteAssistantFileResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteAssistantFile();

    /**
     * <p>Delete a thread.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v1/threads/{thread_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the thread to delete.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DeleteThreadResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteThread();

    /**
     * <p>Retrieves an assistant.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/assistants/{assistant_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>assistant_id</b>"
     * <p>The ID of the assistant to retrieve.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AssistantObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getAssistant();

    /**
     * <p>Retrieves an AssistantFile.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/assistants/{assistant_id}/files/{file_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>assistant_id</b>"
     * <p>The ID of the assistant who the file belongs to.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>file_id</b>"
     * <p>The ID of the file we're getting.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AssistantFileObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getAssistantFile();

    /**
     * <p>Retrieve a message.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/threads/{thread_id}/messages/{message_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the [thread](/docs/api-reference/threads) to which this message belongs.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>message_id</b>"
     * <p>The ID of the message to retrieve.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MessageObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getMessage();

    /**
     * <p>Retrieves a message file.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/threads/{thread_id}/messages/{message_id}/files/{file_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the thread to which the message and File belong.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>message_id</b>"
     * <p>The ID of the message the file belongs to.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>file_id</b>"
     * <p>The ID of the file being retrieved.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MessageFileObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getMessageFile();

    /**
     * <p>Retrieves a run.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/threads/{thread_id}/runs/{run_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the [thread](/docs/api-reference/threads) that was run.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>run_id</b>"
     * <p>The ID of the run to retrieve.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link RunObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getRun();

    /**
     * <p>Retrieves a run step.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the thread to which the run and run step belongs.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>run_id</b>"
     * <p>The ID of the run to which the run step belongs.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>step_id</b>"
     * <p>The ID of the run step to retrieve.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link RunStepObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getRunStep();

    /**
     * <p>Retrieves a thread.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/threads/{thread_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the thread to retrieve.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ThreadObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getThread();

    /**
     * <p>Returns a list of assistant files.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/assistants/{assistant_id}/files" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>assistant_id</b>"
     * <p>The ID of the assistant the file belongs to.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>20</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>desc</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>after</b>"
     * <p>A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>before</b>"
     * <p>A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListAssistantFilesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listAssistantFiles();

    /**
     * <p>Returns a list of assistants.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/assistants" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>limit</b>"
     * <p>A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>20</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>desc</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>after</b>"
     * <p>A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>before</b>"
     * <p>A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListAssistantsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listAssistants();

    /**
     * <p>Returns a list of message files.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/threads/{thread_id}/messages/{message_id}/files" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the thread that the message and files belong to.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>message_id</b>"
     * <p>The ID of the message that the files belongs to.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>20</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>desc</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>after</b>"
     * <p>A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>before</b>"
     * <p>A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListMessageFilesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listMessageFiles();

    /**
     * <p>Returns a list of messages for a given thread.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/threads/{thread_id}/messages" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the [thread](/docs/api-reference/threads) the messages belong to.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>20</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>desc</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>after</b>"
     * <p>A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>before</b>"
     * <p>A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>run_id</b>"
     * <p>Filter messages by the run ID that generated them. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListMessagesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listMessages();

    /**
     * <p>Returns a list of run steps belonging to a run.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/threads/{thread_id}/runs/{run_id}/steps" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the thread the run and run steps belong to.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>run_id</b>"
     * <p>The ID of the run the run steps belong to.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>20</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>desc</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>after</b>"
     * <p>A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>before</b>"
     * <p>A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListRunStepsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listRunSteps();

    /**
     * <p>Returns a list of runs belonging to a thread.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/threads/{thread_id}/runs" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the thread the run belongs to.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>20</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>desc</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>after</b>"
     * <p>A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>before</b>"
     * <p>A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListRunsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listRuns();

    /**
     * <p>Modifies an assistant.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/assistants/{assistant_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>assistant_id</b>"
     * <p>The ID of the assistant to modify.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ModifyAssistantRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AssistantObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler modifyAssistant();

    /**
     * <p>Modifies a message.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/threads/{thread_id}/messages/{message_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the thread to which this message belongs.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>message_id</b>"
     * <p>The ID of the message to modify.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ModifyMessageRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MessageObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler modifyMessage();

    /**
     * <p>Modifies a run.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/threads/{thread_id}/runs/{run_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the [thread](/docs/api-reference/threads) that was run.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>run_id</b>"
     * <p>The ID of the run to modify.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ModifyRunRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link RunObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler modifyRun();

    /**
     * <p>Modifies a thread.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/threads/{thread_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the thread to modify. Only the `metadata` can be modified.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ModifyThreadRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ThreadObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler modifyThread();

    /**
     * <p>When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>thread_id</b>"
     * <p>The ID of the [thread](/docs/api-reference/threads) to which this run belongs.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>run_id</b>"
     * <p>The ID of the run that requires the tool output submission.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link SubmitToolOutputsRunRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link RunObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler submitToolOuputsToRun();

    /**
     * <p>Generates audio from the input text.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/audio/speech" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     * <p><b>Response headers</b>: [CodegenProperty{openApiType='string', baseName='Transfer-Encoding', complexType='null', getter='getTransferEncoding', setter='setTransferEncoding', description='chunked', dataType='String', datatypeWithEnum='String', dataFormat='null', name='transferEncoding', min='null', max='null', defaultValue='null', defaultValueWithParam=' = data.Transfer-Encoding;', baseType='String', containerType='null', containerTypeMapped='null', title='null', unescapedDescription='chunked', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "type" : "string"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=true, isModel=false, isContainer=false, isString=true, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isPassword=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isInnerEnum=false, isEnumRef=false, isAnyType=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, isNew=false, isOverridden=null, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='TransferEncoding', nameInSnakeCase='TRANSFER_ENCODING', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, uniqueItemsBoolean=null, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, isVoid=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false, requiredVarsMap=null, ref=null, schemaIsFromAdditionalProperties=false, isBooleanSchemaTrue=false, isBooleanSchemaFalse=false, format=null, dependentRequired=null, contains=null}]</p>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateSpeechRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/octet-stream}]</p>
     * <p><b>Returns</b>: {@link File}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createSpeech();

    /**
     * <p>Transcribes audio into the input language.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/audio/transcriptions" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>file</b>"
     * <p>The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. </p>
     * <p>
     * - Parameter type: <b>BinaryFile</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>model</b>"
     * <p>
     * - Parameter type: <b>{@link CreateTranscriptionRequestModel}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>language</b>"
     * <p>The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>prompt</b>"
     * <p>An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>response_format</b>"
     * <p>The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>json</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>temperature</b>"
     * <p>The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. </p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>0</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>timestamp_granularities[]</b>"
     * <p>The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=multipart/form-data}]</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CreateTranscription200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createTranscription();

    /**
     * <p>Translates audio into English.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/audio/translations" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>file</b>"
     * <p>The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. </p>
     * <p>
     * - Parameter type: <b>BinaryFile</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>model</b>"
     * <p>
     * - Parameter type: <b>{@link CreateTranscriptionRequestModel}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>prompt</b>"
     * <p>An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>response_format</b>"
     * <p>The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>json</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>temperature</b>"
     * <p>The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. </p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>0</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=multipart/form-data}]</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CreateTranslation200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createTranslation();

    /**
     * <p>Creates a model response for the given chat conversation.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/chat/completions" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateChatCompletionRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CreateChatCompletionResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createChatCompletion();

    /**
     * <p>Creates a completion for the provided prompt and parameters.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/completions" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateCompletionRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CreateCompletionResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createCompletion();

    /**
     * <p>Creates an embedding vector representing the input text.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/embeddings" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateEmbeddingRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CreateEmbeddingResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createEmbedding();

    /**
     * <p>Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/files" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>file</b>"
     * <p>The File object (not file name) to be uploaded. </p>
     * <p>
     * - Parameter type: <b>BinaryFile</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>purpose</b>"
     * <p>The intended purpose of the uploaded file.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=multipart/form-data}]</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link OpenAIFile}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createFile();

    /**
     * <p>Delete a file.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v1/files/{file_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>file_id</b>"
     * <p>The ID of the file to use for this request.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DeleteFileResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteFile();

    /**
     * <p>Returns the contents of the specified file.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/files/{file_id}/content" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>file_id</b>"
     * <p>The ID of the file to use for this request.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link String}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler downloadFile();

    /**
     * <p>Returns a list of files that belong to the user's organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/files" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>purpose</b>"
     * <p>Only return files with the given purpose.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListFilesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listFiles();

    /**
     * <p>Returns information about a specific file.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/files/{file_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>file_id</b>"
     * <p>The ID of the file to use for this request.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link OpenAIFile}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler retrieveFile();

    /**
     * <p>Immediately cancel a fine-tune job. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>fine_tuning_job_id</b>"
     * <p>The ID of the fine-tuning job to cancel. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link FineTuningJob}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler cancelFineTuningJob();

    /**
     * <p>Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/fine_tuning/jobs" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateFineTuningJobRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link FineTuningJob}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createFineTuningJob();

    /**
     * <p>Get status updates for a fine-tuning job. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/fine_tuning/jobs/{fine_tuning_job_id}/events" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>fine_tuning_job_id</b>"
     * <p>The ID of the fine-tuning job to get events for. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>after</b>"
     * <p>Identifier for the last event from the previous pagination request.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of events to retrieve.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>20</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListFineTuningJobEventsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listFineTuningEvents();

    /**
     * <p>List checkpoints for a fine-tuning job. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>fine_tuning_job_id</b>"
     * <p>The ID of the fine-tuning job to get checkpoints for. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>after</b>"
     * <p>Identifier for the last checkpoint ID from the previous pagination request.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of checkpoints to retrieve.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>10</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListFineTuningJobCheckpointsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listFineTuningJobCheckpoints();

    /**
     * <p>List your organization's fine-tuning jobs </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/fine_tuning/jobs" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>after</b>"
     * <p>Identifier for the last job from the previous pagination request.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Number of fine-tuning jobs to retrieve.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>20</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListPaginatedFineTuningJobsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listPaginatedFineTuningJobs();

    /**
     * <p>Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/fine_tuning/jobs/{fine_tuning_job_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>fine_tuning_job_id</b>"
     * <p>The ID of the fine-tuning job. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link FineTuningJob}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler retrieveFineTuningJob();

    /**
     * <p>Creates an image given a prompt.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/images/generations" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateImageRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ImagesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createImage();

    /**
     * <p>Creates an edited or extended image given an original image and a prompt.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/images/edits" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>image</b>"
     * <p>The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.</p>
     * <p>
     * - Parameter type: <b>BinaryFile</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>prompt</b>"
     * <p>A text description of the desired image(s). The maximum length is 1000 characters.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>mask</b>"
     * <p>An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.</p>
     * <p>
     * - Parameter type: <b>BinaryFile</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>model</b>"
     * <p>
     * - Parameter type: <b>{@link CreateImageEditRequestModel}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>dall-e-2</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>n</b>"
     * <p>The number of images to generate. Must be between 1 and 10.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>1</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>size</b>"
     * <p>The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>1024x1024</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>response_format</b>"
     * <p>The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>url</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>user</b>"
     * <p>A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=multipart/form-data}]</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ImagesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createImageEdit();

    /**
     * <p>Creates a variation of a given image.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/images/variations" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>image</b>"
     * <p>The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.</p>
     * <p>
     * - Parameter type: <b>BinaryFile</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>model</b>"
     * <p>
     * - Parameter type: <b>{@link CreateImageEditRequestModel}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>dall-e-2</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>n</b>"
     * <p>The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>1</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>response_format</b>"
     * <p>The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>url</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>size</b>"
     * <p>The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>1024x1024</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>user</b>"
     * <p>A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=multipart/form-data}]</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ImagesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createImageVariation();

    /**
     * <p>Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v1/models/{model}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>model</b>"
     * <p>The model to delete</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DeleteModelResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteModel();

    /**
     * <p>Lists the currently available models, and provides basic information about each one such as the owner and availability.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/models" (<i>privileged: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListModelsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listModels();

    /**
     * <p>Retrieves a model instance, providing basic information about the model such as the owner and permissioning.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/models/{model}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>model</b>"
     * <p>The ID of the model to use for this request</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Model}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler retrieveModel();

    /**
     * <p>Classifies if text is potentially harmful.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/moderations" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateModerationRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CreateModerationResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createModeration();
}
