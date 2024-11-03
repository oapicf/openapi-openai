package org.openapitools.api;

import org.openapitools.api.ThreadsApiService;
import org.openapitools.api.factories.ThreadsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateMessageRequest;
import org.openapitools.model.CreateRunRequest;
import org.openapitools.model.CreateThreadAndRunRequest;
import org.openapitools.model.CreateThreadRequest;
import org.openapitools.model.DeleteThreadResponse;
import org.openapitools.model.ListMessageFilesResponse;
import org.openapitools.model.ListMessagesResponse;
import org.openapitools.model.ListRunStepsResponse;
import org.openapitools.model.ListRunsResponse;
import org.openapitools.model.MessageFileObject;
import org.openapitools.model.MessageObject;
import org.openapitools.model.ModifyMessageRequest;
import org.openapitools.model.ModifyRunRequest;
import org.openapitools.model.ModifyThreadRequest;
import org.openapitools.model.RunObject;
import org.openapitools.model.RunStepObject;
import org.openapitools.model.SubmitToolOutputsRunRequest;
import org.openapitools.model.ThreadObject;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/threads")


@io.swagger.annotations.Api(description = "the threads API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ThreadsApi  {
   private final ThreadsApiService delegate;

   public ThreadsApi(@Context ServletConfig servletContext) {
      ThreadsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ThreadsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ThreadsApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ThreadsApiServiceFactory.getThreadsApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/{thread_id}/runs/{run_id}/cancel")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cancels a run that is `in_progress`.", notes = "", response = RunObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunObject.class)
    })
    public Response cancelRun(@ApiParam(value = "The ID of the thread to which this run belongs.", required = true) @PathParam("thread_id") @NotNull  String threadId,@ApiParam(value = "The ID of the run to cancel.", required = true) @PathParam("run_id") @NotNull  String runId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cancelRun(threadId, runId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{thread_id}/messages")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a message.", notes = "", response = MessageObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = MessageObject.class)
    })
    public Response createMessage(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) to create a message for.", required = true) @PathParam("thread_id") @NotNull  String threadId,@ApiParam(value = "", required = true) @NotNull @Valid  CreateMessageRequest createMessageRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createMessage(threadId, createMessageRequest, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{thread_id}/runs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a run.", notes = "", response = RunObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunObject.class)
    })
    public Response createRun(@ApiParam(value = "The ID of the thread to run.", required = true) @PathParam("thread_id") @NotNull  String threadId,@ApiParam(value = "", required = true) @NotNull @Valid  CreateRunRequest createRunRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createRun(threadId, createRunRequest, securityContext);
    }
    @javax.ws.rs.POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a thread.", notes = "", response = ThreadObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ThreadObject.class)
    })
    public Response createThread(@ApiParam(value = "") @Valid  CreateThreadRequest createThreadRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createThread(createThreadRequest, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/runs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a thread and run it in one request.", notes = "", response = RunObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunObject.class)
    })
    public Response createThreadAndRun(@ApiParam(value = "", required = true) @NotNull @Valid  CreateThreadAndRunRequest createThreadAndRunRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createThreadAndRun(createThreadAndRunRequest, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{thread_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a thread.", notes = "", response = DeleteThreadResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteThreadResponse.class)
    })
    public Response deleteThread(@ApiParam(value = "The ID of the thread to delete.", required = true) @PathParam("thread_id") @NotNull  String threadId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteThread(threadId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{thread_id}/messages/{message_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve a message.", notes = "", response = MessageObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = MessageObject.class)
    })
    public Response getMessage(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) to which this message belongs.", required = true) @PathParam("thread_id") @NotNull  String threadId,@ApiParam(value = "The ID of the message to retrieve.", required = true) @PathParam("message_id") @NotNull  String messageId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMessage(threadId, messageId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{thread_id}/messages/{message_id}/files/{file_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a message file.", notes = "", response = MessageFileObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = MessageFileObject.class)
    })
    public Response getMessageFile(@ApiParam(value = "The ID of the thread to which the message and File belong.", required = true) @PathParam("thread_id") @NotNull  String threadId,@ApiParam(value = "The ID of the message the file belongs to.", required = true) @PathParam("message_id") @NotNull  String messageId,@ApiParam(value = "The ID of the file being retrieved.", required = true) @PathParam("file_id") @NotNull  String fileId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getMessageFile(threadId, messageId, fileId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{thread_id}/runs/{run_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a run.", notes = "", response = RunObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunObject.class)
    })
    public Response getRun(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) that was run.", required = true) @PathParam("thread_id") @NotNull  String threadId,@ApiParam(value = "The ID of the run to retrieve.", required = true) @PathParam("run_id") @NotNull  String runId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRun(threadId, runId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{thread_id}/runs/{run_id}/steps/{step_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a run step.", notes = "", response = RunStepObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunStepObject.class)
    })
    public Response getRunStep(@ApiParam(value = "The ID of the thread to which the run and run step belongs.", required = true) @PathParam("thread_id") @NotNull  String threadId,@ApiParam(value = "The ID of the run to which the run step belongs.", required = true) @PathParam("run_id") @NotNull  String runId,@ApiParam(value = "The ID of the run step to retrieve.", required = true) @PathParam("step_id") @NotNull  String stepId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRunStep(threadId, runId, stepId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{thread_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a thread.", notes = "", response = ThreadObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ThreadObject.class)
    })
    public Response getThread(@ApiParam(value = "The ID of the thread to retrieve.", required = true) @PathParam("thread_id") @NotNull  String threadId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getThread(threadId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{thread_id}/messages/{message_id}/files")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of message files.", notes = "", response = ListMessageFilesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListMessageFilesResponse.class)
    })
    public Response listMessageFiles(@ApiParam(value = "The ID of the thread that the message and files belong to.", required = true) @PathParam("thread_id") @NotNull  String threadId,@ApiParam(value = "The ID of the message that the files belongs to.", required = true) @PathParam("message_id") @NotNull  String messageId,@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue = "desc") @DefaultValue("desc") @QueryParam("order")  String order,@ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @QueryParam("after")  String after,@ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @QueryParam("before")  String before,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listMessageFiles(threadId, messageId, limit, order, after, before, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{thread_id}/messages")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of messages for a given thread.", notes = "", response = ListMessagesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListMessagesResponse.class)
    })
    public Response listMessages(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) the messages belong to.", required = true) @PathParam("thread_id") @NotNull  String threadId,@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue = "desc") @DefaultValue("desc") @QueryParam("order")  String order,@ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @QueryParam("after")  String after,@ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @QueryParam("before")  String before,@ApiParam(value = "Filter messages by the run ID that generated them. ") @QueryParam("run_id")  String runId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listMessages(threadId, limit, order, after, before, runId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{thread_id}/runs/{run_id}/steps")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of run steps belonging to a run.", notes = "", response = ListRunStepsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListRunStepsResponse.class)
    })
    public Response listRunSteps(@ApiParam(value = "The ID of the thread the run and run steps belong to.", required = true) @PathParam("thread_id") @NotNull  String threadId,@ApiParam(value = "The ID of the run the run steps belong to.", required = true) @PathParam("run_id") @NotNull  String runId,@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue = "desc") @DefaultValue("desc") @QueryParam("order")  String order,@ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @QueryParam("after")  String after,@ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @QueryParam("before")  String before,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listRunSteps(threadId, runId, limit, order, after, before, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{thread_id}/runs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of runs belonging to a thread.", notes = "", response = ListRunsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListRunsResponse.class)
    })
    public Response listRuns(@ApiParam(value = "The ID of the thread the run belongs to.", required = true) @PathParam("thread_id") @NotNull  String threadId,@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue = "desc") @DefaultValue("desc") @QueryParam("order")  String order,@ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @QueryParam("after")  String after,@ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @QueryParam("before")  String before,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listRuns(threadId, limit, order, after, before, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{thread_id}/messages/{message_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modifies a message.", notes = "", response = MessageObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = MessageObject.class)
    })
    public Response modifyMessage(@ApiParam(value = "The ID of the thread to which this message belongs.", required = true) @PathParam("thread_id") @NotNull  String threadId,@ApiParam(value = "The ID of the message to modify.", required = true) @PathParam("message_id") @NotNull  String messageId,@ApiParam(value = "", required = true) @NotNull @Valid  ModifyMessageRequest modifyMessageRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.modifyMessage(threadId, messageId, modifyMessageRequest, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{thread_id}/runs/{run_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modifies a run.", notes = "", response = RunObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunObject.class)
    })
    public Response modifyRun(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) that was run.", required = true) @PathParam("thread_id") @NotNull  String threadId,@ApiParam(value = "The ID of the run to modify.", required = true) @PathParam("run_id") @NotNull  String runId,@ApiParam(value = "", required = true) @NotNull @Valid  ModifyRunRequest modifyRunRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.modifyRun(threadId, runId, modifyRunRequest, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{thread_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modifies a thread.", notes = "", response = ThreadObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ThreadObject.class)
    })
    public Response modifyThread(@ApiParam(value = "The ID of the thread to modify. Only the `metadata` can be modified.", required = true) @PathParam("thread_id") @NotNull  String threadId,@ApiParam(value = "", required = true) @NotNull @Valid  ModifyThreadRequest modifyThreadRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.modifyThread(threadId, modifyThreadRequest, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{thread_id}/runs/{run_id}/submit_tool_outputs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. ", notes = "", response = RunObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunObject.class)
    })
    public Response submitToolOuputsToRun(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) to which this run belongs.", required = true) @PathParam("thread_id") @NotNull  String threadId,@ApiParam(value = "The ID of the run that requires the tool output submission.", required = true) @PathParam("run_id") @NotNull  String runId,@ApiParam(value = "", required = true) @NotNull @Valid  SubmitToolOutputsRunRequest submitToolOutputsRunRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest, securityContext);
    }
}
