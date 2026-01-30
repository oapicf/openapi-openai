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
     * <li>
     * <p>"<b>include[]</b>"
     * <p>A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
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
     * <p>Deletes a message.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v1/threads/{thread_id}/messages/{message_id}" (<i>privileged: true</i>)</p>
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
     * <p>The ID of the message to delete.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DeleteMessageResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteMessage();

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
     * <li>
     * <p>"<b>include[]</b>"
     * <p>A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
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
     * <p>A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. </p>
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
     * <p>A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. </p>
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
     * <p>A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include[]</b>"
     * <p>A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
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
     * <p>A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. </p>
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
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, isPrimitiveType=true, isModel=false, isContainer=false, isString=true, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isPassword=false, isFreeFormObject=false, isArray=false, isMap=false, isOptional=false, isEnum=false, isInnerEnum=false, isEnumRef=false, isAnyType=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, isNew=false, isOverridden=null, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='transferEncoding', nameInPascalCase='TransferEncoding', nameInSnakeCase='TRANSFER_ENCODING', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, uniqueItemsBoolean=null, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, isVoid=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false, hasSanitizedName=true, requiredVarsMap=null, ref=null, schemaIsFromAdditionalProperties=false, isBooleanSchemaTrue=false, isBooleanSchemaFalse=false, format=null, dependentRequired=null, contains=null}]</p>
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
     * <p>An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>response_format</b>"
     * <p>
     * - Parameter type: <b>{@link AudioResponseFormat}</b><br/>
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
     * <p>An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>response_format</b>"
     * <p>
     * - Parameter type: <b>{@link AudioResponseFormat}</b><br/>
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
     * <p>List user actions and configuration changes within this organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/audit_logs" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>effective_at</b>"
     * <p>Return only events whose `effective_at` (Unix seconds) is in this range.</p>
     * <p>
     * - Parameter type: <b>{@link ListAuditLogsEffectiveAtParameter}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>project_ids[]</b>"
     * <p>Return only events for these projects.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>event_types[]</b>"
     * <p>Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;AuditLogEventType&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>actor_ids[]</b>"
     * <p>Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>actor_emails[]</b>"
     * <p>Return only events performed by users with these emails.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>resource_ids[]</b>"
     * <p>Return only events performed on these targets. For example, a project ID updated.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
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
     * <p>A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListAuditLogsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Audit logs listed successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listAuditLogs();

    /**
     * <p>Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/batches/{batch_id}/cancel" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>batch_id</b>"
     * <p>The ID of the batch to cancel.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Batch}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Batch is cancelling. Returns the cancelling batch's details.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler cancelBatch();

    /**
     * <p>Creates and executes a batch from an uploaded file of requests</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/batches" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateBatchRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Batch}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Batch created successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createBatch();

    /**
     * <p>List your organization's batches.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/batches" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
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
     * <p>"<b>limit</b>"
     * <p>A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. </p>
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
     * <p><b>Returns</b>: {@link ListBatchesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Batch listed successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listBatches();

    /**
     * <p>Retrieves a batch.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/batches/{batch_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>batch_id</b>"
     * <p>The ID of the batch to retrieve.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Batch}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Batch retrieved successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler retrieveBatch();

    /**
     * <p>Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). </p>
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
     * <p>Create an organization admin API key</p>
     *
     * <p>Create a new admin-level API key for the organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/organization/admin_api_keys" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AdminApiKeysCreateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdminApiKey}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The newly created admin API key.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adminApiKeysCreate();

    /**
     * <p>Delete an organization admin API key</p>
     *
     * <p>Delete the specified admin API key.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v1/organization/admin_api_keys/{key_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>key_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdminApiKeysDelete200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Confirmation that the API key was deleted.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adminApiKeysDelete();

    /**
     * <p>Retrieve a single organization API key</p>
     *
     * <p>Get details for a specific organization API key by its ID.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/admin_api_keys/{key_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>key_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdminApiKey}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Details of the requested API key.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adminApiKeysGet();

    /**
     * <p>List organization API keys</p>
     *
     * <p>Retrieve a paginated list of organization admin API keys.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/admin_api_keys" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>after</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>asc</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
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
     * <p><b>Returns</b>: {@link ApiKeyList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: A list of organization API keys.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adminApiKeysList();

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
     * <p>Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. </p>
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
     * <p>The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning). </p>
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
     * <p>Returns a list of files.</p>
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
     * <li>
     * <p>"<b>limit</b>"
     * <p>A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>10000</b><br/>
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
     * <p>A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). </p>
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
     * <p>A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). </p>
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
     * <p>Delete an invite. If the invite has already been accepted, it cannot be deleted.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v1/organization/invites/{invite_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>invite_id</b>"
     * <p>The ID of the invite to delete.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link InviteDeleteResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Invite deleted successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteInvite();

    /**
     * <p>Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/organization/invites" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link InviteRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Invite}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: User invited successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler inviteUser();

    /**
     * <p>Returns a list of invites in the organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/invites" (<i>privileged: true</i>)</p>
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
     * <p>"<b>after</b>"
     * <p>A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link InviteListResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Invites listed successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listInvites();

    /**
     * <p>Retrieves an invite.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/invites/{invite_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>invite_id</b>"
     * <p>The ID of the invite to retrieve.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Invite}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Invite retrieved successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler retrieveInvite();

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
     * <p>Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). </p>
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

    /**
     * <p>Archives a project in the organization. Archived projects cannot be used or updated.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/organization/projects/{project_id}/archive" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Project}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project archived successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler archiveProject();

    /**
     * <p>Create a new project in the organization. Projects can be created and archived, but cannot be deleted.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/organization/projects" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ProjectCreateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Project}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project created successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createProject();

    /**
     * <p>Creates a new service account in the project. This also returns an unredacted API key for the service account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/organization/projects/{project_id}/service_accounts" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ProjectServiceAccountCreateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProjectServiceAccountCreateResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project service account created successfully.</li>
     * <li><b>400 (client error)</b>: Error response when project is archived.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createProjectServiceAccount();

    /**
     * <p>Adds a user to the project. Users must already be members of the organization to be added to a project.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/organization/projects/{project_id}/users" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ProjectUserCreateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProjectUser}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: User added to project successfully.</li>
     * <li><b>400 (client error)</b>: Error response for various conditions.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createProjectUser();

    /**
     * <p>Deletes an API key from the project.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v1/organization/projects/{project_id}/api_keys/{key_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>key_id</b>"
     * <p>The ID of the API key.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProjectApiKeyDeleteResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project API key deleted successfully.</li>
     * <li><b>400 (client error)</b>: Error response for various conditions.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteProjectApiKey();

    /**
     * <p>Deletes a service account from the project.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v1/organization/projects/{project_id}/service_accounts/{service_account_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>service_account_id</b>"
     * <p>The ID of the service account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProjectServiceAccountDeleteResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project service account deleted successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteProjectServiceAccount();

    /**
     * <p>Deletes a user from the project.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v1/organization/projects/{project_id}/users/{user_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>user_id</b>"
     * <p>The ID of the user.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProjectUserDeleteResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project user deleted successfully.</li>
     * <li><b>400 (client error)</b>: Error response for various conditions.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteProjectUser();

    /**
     * <p>Returns a list of API keys in the project.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/projects/{project_id}/api_keys" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
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
     * <p>"<b>after</b>"
     * <p>A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProjectApiKeyListResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project API keys listed successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listProjectApiKeys();

    /**
     * <p>Returns the rate limits per model for a project.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/projects/{project_id}/rate_limits" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>A limit on the number of objects to be returned. The default is 100. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>100</b><br/>
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
     * <p>A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProjectRateLimitListResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project rate limits listed successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listProjectRateLimits();

    /**
     * <p>Returns a list of service accounts in the project.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/projects/{project_id}/service_accounts" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
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
     * <p>"<b>after</b>"
     * <p>A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProjectServiceAccountListResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project service accounts listed successfully.</li>
     * <li><b>400 (client error)</b>: Error response when project is archived.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listProjectServiceAccounts();

    /**
     * <p>Returns a list of users in the project.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/projects/{project_id}/users" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
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
     * <p>"<b>after</b>"
     * <p>A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProjectUserListResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project users listed successfully.</li>
     * <li><b>400 (client error)</b>: Error response when project is archived.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listProjectUsers();

    /**
     * <p>Returns a list of projects.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/projects" (<i>privileged: true</i>)</p>
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
     * <p>"<b>after</b>"
     * <p>A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_archived</b>"
     * <p>If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProjectListResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Projects listed successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listProjects();

    /**
     * <p>Modifies a project in the organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/organization/projects/{project_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ProjectUpdateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Project}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project updated successfully.</li>
     * <li><b>400 (client error)</b>: Error response when updating the default project.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler modifyProject();

    /**
     * <p>Modifies a user's role in the project.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/organization/projects/{project_id}/users/{user_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>user_id</b>"
     * <p>The ID of the user.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ProjectUserUpdateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProjectUser}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project user's role updated successfully.</li>
     * <li><b>400 (client error)</b>: Error response for various conditions.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler modifyProjectUser();

    /**
     * <p>Retrieves a project.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/projects/{project_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Project}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project retrieved successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler retrieveProject();

    /**
     * <p>Retrieves an API key in the project.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/projects/{project_id}/api_keys/{key_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>key_id</b>"
     * <p>The ID of the API key.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProjectApiKey}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project API key retrieved successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler retrieveProjectApiKey();

    /**
     * <p>Retrieves a service account in the project.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/projects/{project_id}/service_accounts/{service_account_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>service_account_id</b>"
     * <p>The ID of the service account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProjectServiceAccount}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project service account retrieved successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler retrieveProjectServiceAccount();

    /**
     * <p>Retrieves a user in the project.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/projects/{project_id}/users/{user_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>user_id</b>"
     * <p>The ID of the user.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProjectUser}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project user retrieved successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler retrieveProjectUser();

    /**
     * <p>Updates a project rate limit.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/organization/projects/{project_id}/rate_limits/{rate_limit_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>project_id</b>"
     * <p>The ID of the project.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>rate_limit_id</b>"
     * <p>The ID of the rate limit.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ProjectRateLimitUpdateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProjectRateLimit}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Project rate limit updated successfully.</li>
     * <li><b>400 (client error)</b>: Error response for various conditions.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateProjectRateLimits();

    /**
     * <p>Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/realtime/sessions" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link RealtimeSessionCreateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link RealtimeSessionCreateResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Session created successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createRealtimeSession();

    /**
     * <p>Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/uploads/{upload_id}/parts" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>upload_id</b>"
     * <p>The ID of the Upload. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>data</b>"
     * <p>The chunk of bytes for this Part. </p>
     * <p>
     * - Parameter type: <b>BinaryFile</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=multipart/form-data}]</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UploadPart}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler addUploadPart();

    /**
     * <p>Cancels the Upload. No Parts may be added after an Upload is cancelled. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/uploads/{upload_id}/cancel" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>upload_id</b>"
     * <p>The ID of the Upload. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Upload}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler cancelUpload();

    /**
     * <p>Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/uploads/{upload_id}/complete" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>upload_id</b>"
     * <p>The ID of the Upload. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CompleteUploadRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Upload}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler completeUpload();

    /**
     * <p>Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/uploads" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateUploadRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Upload}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createUpload();

    /**
     * <p>Get audio speeches usage details for the organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/usage/audio_speeches" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_time</b>"
     * <p>Start time (Unix seconds) of the query time range, inclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_time</b>"
     * <p>End time (Unix seconds) of the query time range, exclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bucket_width</b>"
     * <p>Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>1d</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>project_ids</b>"
     * <p>Return only usage for these projects.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>user_ids</b>"
     * <p>Return only usage for these users.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>api_key_ids</b>"
     * <p>Return only usage for these API keys.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>models</b>"
     * <p>Return only usage for these models.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>group_by</b>"
     * <p>Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page</b>"
     * <p>A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UsageResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Usage data retrieved successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler usageAudioSpeeches();

    /**
     * <p>Get audio transcriptions usage details for the organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/usage/audio_transcriptions" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_time</b>"
     * <p>Start time (Unix seconds) of the query time range, inclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_time</b>"
     * <p>End time (Unix seconds) of the query time range, exclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bucket_width</b>"
     * <p>Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>1d</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>project_ids</b>"
     * <p>Return only usage for these projects.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>user_ids</b>"
     * <p>Return only usage for these users.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>api_key_ids</b>"
     * <p>Return only usage for these API keys.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>models</b>"
     * <p>Return only usage for these models.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>group_by</b>"
     * <p>Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page</b>"
     * <p>A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UsageResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Usage data retrieved successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler usageAudioTranscriptions();

    /**
     * <p>Get code interpreter sessions usage details for the organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/usage/code_interpreter_sessions" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_time</b>"
     * <p>Start time (Unix seconds) of the query time range, inclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_time</b>"
     * <p>End time (Unix seconds) of the query time range, exclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bucket_width</b>"
     * <p>Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>1d</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>project_ids</b>"
     * <p>Return only usage for these projects.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>group_by</b>"
     * <p>Group the usage data by the specified fields. Support fields include `project_id`.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page</b>"
     * <p>A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UsageResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Usage data retrieved successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler usageCodeInterpreterSessions();

    /**
     * <p>Get completions usage details for the organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/usage/completions" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_time</b>"
     * <p>Start time (Unix seconds) of the query time range, inclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_time</b>"
     * <p>End time (Unix seconds) of the query time range, exclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bucket_width</b>"
     * <p>Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>1d</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>project_ids</b>"
     * <p>Return only usage for these projects.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>user_ids</b>"
     * <p>Return only usage for these users.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>api_key_ids</b>"
     * <p>Return only usage for these API keys.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>models</b>"
     * <p>Return only usage for these models.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>batch</b>"
     * <p>If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>group_by</b>"
     * <p>Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page</b>"
     * <p>A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UsageResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Usage data retrieved successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler usageCompletions();

    /**
     * <p>Get costs details for the organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/costs" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_time</b>"
     * <p>Start time (Unix seconds) of the query time range, inclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_time</b>"
     * <p>End time (Unix seconds) of the query time range, exclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bucket_width</b>"
     * <p>Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>1d</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>project_ids</b>"
     * <p>Return only costs for these projects.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>group_by</b>"
     * <p>Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>7</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page</b>"
     * <p>A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UsageResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Costs data retrieved successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler usageCosts();

    /**
     * <p>Get embeddings usage details for the organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/usage/embeddings" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_time</b>"
     * <p>Start time (Unix seconds) of the query time range, inclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_time</b>"
     * <p>End time (Unix seconds) of the query time range, exclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bucket_width</b>"
     * <p>Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>1d</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>project_ids</b>"
     * <p>Return only usage for these projects.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>user_ids</b>"
     * <p>Return only usage for these users.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>api_key_ids</b>"
     * <p>Return only usage for these API keys.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>models</b>"
     * <p>Return only usage for these models.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>group_by</b>"
     * <p>Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page</b>"
     * <p>A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UsageResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Usage data retrieved successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler usageEmbeddings();

    /**
     * <p>Get images usage details for the organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/usage/images" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_time</b>"
     * <p>Start time (Unix seconds) of the query time range, inclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_time</b>"
     * <p>End time (Unix seconds) of the query time range, exclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bucket_width</b>"
     * <p>Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>1d</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>sources</b>"
     * <p>Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>sizes</b>"
     * <p>Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>project_ids</b>"
     * <p>Return only usage for these projects.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>user_ids</b>"
     * <p>Return only usage for these users.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>api_key_ids</b>"
     * <p>Return only usage for these API keys.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>models</b>"
     * <p>Return only usage for these models.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>group_by</b>"
     * <p>Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page</b>"
     * <p>A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UsageResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Usage data retrieved successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler usageImages();

    /**
     * <p>Get moderations usage details for the organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/usage/moderations" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_time</b>"
     * <p>Start time (Unix seconds) of the query time range, inclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_time</b>"
     * <p>End time (Unix seconds) of the query time range, exclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bucket_width</b>"
     * <p>Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>1d</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>project_ids</b>"
     * <p>Return only usage for these projects.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>user_ids</b>"
     * <p>Return only usage for these users.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>api_key_ids</b>"
     * <p>Return only usage for these API keys.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>models</b>"
     * <p>Return only usage for these models.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>group_by</b>"
     * <p>Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page</b>"
     * <p>A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UsageResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Usage data retrieved successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler usageModerations();

    /**
     * <p>Get vector stores usage details for the organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/usage/vector_stores" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_time</b>"
     * <p>Start time (Unix seconds) of the query time range, inclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_time</b>"
     * <p>End time (Unix seconds) of the query time range, exclusive.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bucket_width</b>"
     * <p>Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>1d</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>project_ids</b>"
     * <p>Return only usage for these projects.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>group_by</b>"
     * <p>Group the usage data by the specified fields. Support fields include `project_id`.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 </p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page</b>"
     * <p>A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UsageResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Usage data retrieved successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler usageVectorStores();

    /**
     * <p>Deletes a user from the organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v1/organization/users/{user_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>user_id</b>"
     * <p>The ID of the user.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UserDeleteResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: User deleted successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteUser();

    /**
     * <p>Lists all of the users in the organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/users" (<i>privileged: true</i>)</p>
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
     * <p>"<b>after</b>"
     * <p>A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UserListResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Users listed successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listUsers();

    /**
     * <p>Modifies a user's role in the organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/organization/users/{user_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>user_id</b>"
     * <p>The ID of the user.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link UserRoleUpdateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link User}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: User role updated successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler modifyUser();

    /**
     * <p>Retrieves a user by their identifier.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/organization/users/{user_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>user_id</b>"
     * <p>The ID of the user.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link User}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: User retrieved successfully.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler retrieveUser();

    /**
     * <p>Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>vector_store_id</b>"
     * <p>The ID of the vector store that the file batch belongs to.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>batch_id</b>"
     * <p>The ID of the file batch to cancel.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link VectorStoreFileBatchObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler cancelVectorStoreFileBatch();

    /**
     * <p>Create a vector store.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/vector_stores" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateVectorStoreRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link VectorStoreObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createVectorStore();

    /**
     * <p>Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/vector_stores/{vector_store_id}/files" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>vector_store_id</b>"
     * <p>The ID of the vector store for which to create a File. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateVectorStoreFileRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link VectorStoreFileObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createVectorStoreFile();

    /**
     * <p>Create a vector store file batch.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/vector_stores/{vector_store_id}/file_batches" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>vector_store_id</b>"
     * <p>The ID of the vector store for which to create a File Batch. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateVectorStoreFileBatchRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link VectorStoreFileBatchObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createVectorStoreFileBatch();

    /**
     * <p>Delete a vector store.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v1/vector_stores/{vector_store_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>vector_store_id</b>"
     * <p>The ID of the vector store to delete.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DeleteVectorStoreResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteVectorStore();

    /**
     * <p>Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v1/vector_stores/{vector_store_id}/files/{file_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>vector_store_id</b>"
     * <p>The ID of the vector store that the file belongs to.</p>
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
     * <p><b>Returns</b>: {@link DeleteVectorStoreFileResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteVectorStoreFile();

    /**
     * <p>Retrieves a vector store.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/vector_stores/{vector_store_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>vector_store_id</b>"
     * <p>The ID of the vector store to retrieve.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link VectorStoreObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getVectorStore();

    /**
     * <p>Retrieves a vector store file.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/vector_stores/{vector_store_id}/files/{file_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>vector_store_id</b>"
     * <p>The ID of the vector store that the file belongs to.</p>
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
     * <p><b>Returns</b>: {@link VectorStoreFileObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getVectorStoreFile();

    /**
     * <p>Retrieves a vector store file batch.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>vector_store_id</b>"
     * <p>The ID of the vector store that the file batch belongs to.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>batch_id</b>"
     * <p>The ID of the file batch being retrieved.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link VectorStoreFileBatchObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getVectorStoreFileBatch();

    /**
     * <p>Returns a list of vector store files in a batch.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/files" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>vector_store_id</b>"
     * <p>The ID of the vector store that the files belong to.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>batch_id</b>"
     * <p>The ID of the file batch that the files belong to.</p>
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
     * <p>A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>filter</b>"
     * <p>Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListVectorStoreFilesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listFilesInVectorStoreBatch();

    /**
     * <p>Returns a list of vector store files.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/vector_stores/{vector_store_id}/files" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>vector_store_id</b>"
     * <p>The ID of the vector store that the files belong to.</p>
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
     * <p>A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>filter</b>"
     * <p>Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListVectorStoreFilesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listVectorStoreFiles();

    /**
     * <p>Returns a list of vector stores.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/vector_stores" (<i>privileged: true</i>)</p>
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
     * <p>A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListVectorStoresResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listVectorStores();

    /**
     * <p>Modifies a vector store.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/vector_stores/{vector_store_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>vector_store_id</b>"
     * <p>The ID of the vector store to modify.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link UpdateVectorStoreRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link VectorStoreObject}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler modifyVectorStore();
}
