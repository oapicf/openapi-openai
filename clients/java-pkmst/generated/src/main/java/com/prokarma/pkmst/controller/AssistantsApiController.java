package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AssistantFileObject;
import com.prokarma.pkmst.model.AssistantObject;
import com.prokarma.pkmst.model.CreateAssistantFileRequest;
import com.prokarma.pkmst.model.CreateAssistantRequest;
import com.prokarma.pkmst.model.CreateMessageRequest;
import com.prokarma.pkmst.model.CreateRunRequest;
import com.prokarma.pkmst.model.CreateThreadAndRunRequest;
import com.prokarma.pkmst.model.CreateThreadRequest;
import com.prokarma.pkmst.model.DeleteAssistantFileResponse;
import com.prokarma.pkmst.model.DeleteAssistantResponse;
import com.prokarma.pkmst.model.DeleteThreadResponse;
import com.prokarma.pkmst.model.ListAssistantFilesResponse;
import com.prokarma.pkmst.model.ListAssistantsResponse;
import com.prokarma.pkmst.model.ListMessageFilesResponse;
import com.prokarma.pkmst.model.ListMessagesResponse;
import com.prokarma.pkmst.model.ListRunStepsResponse;
import com.prokarma.pkmst.model.ListRunsResponse;
import com.prokarma.pkmst.model.MessageFileObject;
import com.prokarma.pkmst.model.MessageObject;
import com.prokarma.pkmst.model.ModifyAssistantRequest;
import com.prokarma.pkmst.model.ModifyMessageRequest;
import com.prokarma.pkmst.model.ModifyRunRequest;
import com.prokarma.pkmst.model.ModifyThreadRequest;
import com.prokarma.pkmst.model.RunObject;
import com.prokarma.pkmst.model.RunStepObject;
import com.prokarma.pkmst.model.SubmitToolOutputsRunRequest;
import com.prokarma.pkmst.model.ThreadObject;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-04-14T13:39:11.640510243Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Controller
public class AssistantsApiController implements AssistantsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public AssistantsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<RunObject> cancelRun(@ApiParam(value = "The ID of the thread to which this run belongs.",required=true ) @PathVariable("thread_id") String threadId,
        @ApiParam(value = "The ID of the run to cancel.",required=true ) @PathVariable("run_id") String runId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<RunObject>(objectMapper.readValue("", RunObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<RunObject>(HttpStatus.OK);
    }

    public ResponseEntity<AssistantObject> createAssistant(@ApiParam(value = "" ,required=true )   @RequestBody CreateAssistantRequest createAssistantRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssistantObject>(objectMapper.readValue("", AssistantObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<AssistantObject>(HttpStatus.OK);
    }

    public ResponseEntity<AssistantFileObject> createAssistantFile(@ApiParam(value = "The ID of the assistant for which to create a File. ",required=true ) @PathVariable("assistant_id") String assistantId,
        @ApiParam(value = "" ,required=true )   @RequestBody CreateAssistantFileRequest createAssistantFileRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssistantFileObject>(objectMapper.readValue("", AssistantFileObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<AssistantFileObject>(HttpStatus.OK);
    }

    public ResponseEntity<MessageObject> createMessage(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) to create a message for.",required=true ) @PathVariable("thread_id") String threadId,
        @ApiParam(value = "" ,required=true )   @RequestBody CreateMessageRequest createMessageRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MessageObject>(objectMapper.readValue("", MessageObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<MessageObject>(HttpStatus.OK);
    }

    public ResponseEntity<RunObject> createRun(@ApiParam(value = "The ID of the thread to run.",required=true ) @PathVariable("thread_id") String threadId,
        @ApiParam(value = "" ,required=true )   @RequestBody CreateRunRequest createRunRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<RunObject>(objectMapper.readValue("", RunObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<RunObject>(HttpStatus.OK);
    }

    public ResponseEntity<ThreadObject> createThread(@ApiParam(value = ""  )   @RequestBody CreateThreadRequest createThreadRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ThreadObject>(objectMapper.readValue("", ThreadObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<ThreadObject>(HttpStatus.OK);
    }

    public ResponseEntity<RunObject> createThreadAndRun(@ApiParam(value = "" ,required=true )   @RequestBody CreateThreadAndRunRequest createThreadAndRunRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<RunObject>(objectMapper.readValue("", RunObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<RunObject>(HttpStatus.OK);
    }

    public ResponseEntity<DeleteAssistantResponse> deleteAssistant(@ApiParam(value = "The ID of the assistant to delete.",required=true ) @PathVariable("assistant_id") String assistantId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteAssistantResponse>(objectMapper.readValue("", DeleteAssistantResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteAssistantResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DeleteAssistantFileResponse> deleteAssistantFile(@ApiParam(value = "The ID of the assistant that the file belongs to.",required=true ) @PathVariable("assistant_id") String assistantId,
        @ApiParam(value = "The ID of the file to delete.",required=true ) @PathVariable("file_id") String fileId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteAssistantFileResponse>(objectMapper.readValue("", DeleteAssistantFileResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteAssistantFileResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DeleteThreadResponse> deleteThread(@ApiParam(value = "The ID of the thread to delete.",required=true ) @PathVariable("thread_id") String threadId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteThreadResponse>(objectMapper.readValue("", DeleteThreadResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteThreadResponse>(HttpStatus.OK);
    }

    public ResponseEntity<AssistantObject> getAssistant(@ApiParam(value = "The ID of the assistant to retrieve.",required=true ) @PathVariable("assistant_id") String assistantId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssistantObject>(objectMapper.readValue("", AssistantObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<AssistantObject>(HttpStatus.OK);
    }

    public ResponseEntity<AssistantFileObject> getAssistantFile(@ApiParam(value = "The ID of the assistant who the file belongs to.",required=true ) @PathVariable("assistant_id") String assistantId,
        @ApiParam(value = "The ID of the file we're getting.",required=true ) @PathVariable("file_id") String fileId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssistantFileObject>(objectMapper.readValue("", AssistantFileObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<AssistantFileObject>(HttpStatus.OK);
    }

    public ResponseEntity<MessageObject> getMessage(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) to which this message belongs.",required=true ) @PathVariable("thread_id") String threadId,
        @ApiParam(value = "The ID of the message to retrieve.",required=true ) @PathVariable("message_id") String messageId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MessageObject>(objectMapper.readValue("", MessageObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<MessageObject>(HttpStatus.OK);
    }

    public ResponseEntity<MessageFileObject> getMessageFile(@ApiParam(value = "The ID of the thread to which the message and File belong.",required=true ) @PathVariable("thread_id") String threadId,
        @ApiParam(value = "The ID of the message the file belongs to.",required=true ) @PathVariable("message_id") String messageId,
        @ApiParam(value = "The ID of the file being retrieved.",required=true ) @PathVariable("file_id") String fileId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MessageFileObject>(objectMapper.readValue("", MessageFileObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<MessageFileObject>(HttpStatus.OK);
    }

    public ResponseEntity<RunObject> getRun(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) that was run.",required=true ) @PathVariable("thread_id") String threadId,
        @ApiParam(value = "The ID of the run to retrieve.",required=true ) @PathVariable("run_id") String runId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<RunObject>(objectMapper.readValue("", RunObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<RunObject>(HttpStatus.OK);
    }

    public ResponseEntity<RunStepObject> getRunStep(@ApiParam(value = "The ID of the thread to which the run and run step belongs.",required=true ) @PathVariable("thread_id") String threadId,
        @ApiParam(value = "The ID of the run to which the run step belongs.",required=true ) @PathVariable("run_id") String runId,
        @ApiParam(value = "The ID of the run step to retrieve.",required=true ) @PathVariable("step_id") String stepId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<RunStepObject>(objectMapper.readValue("", RunStepObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<RunStepObject>(HttpStatus.OK);
    }

    public ResponseEntity<ThreadObject> getThread(@ApiParam(value = "The ID of the thread to retrieve.",required=true ) @PathVariable("thread_id") String threadId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ThreadObject>(objectMapper.readValue("", ThreadObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<ThreadObject>(HttpStatus.OK);
    }

    public ResponseEntity<ListAssistantFilesResponse> listAssistantFiles(@ApiParam(value = "The ID of the assistant the file belongs to.",required=true ) @PathVariable("assistant_id") String assistantId,
        @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues = "asc, desc", defaultValue = "desc")  @RequestParam(value = "order", required = false, defaultValue="desc") String order,
        @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @RequestParam(value = "before", required = false) String before,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListAssistantFilesResponse>(objectMapper.readValue("", ListAssistantFilesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListAssistantFilesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ListAssistantsResponse> listAssistants(@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues = "asc, desc", defaultValue = "desc")  @RequestParam(value = "order", required = false, defaultValue="desc") String order,
        @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @RequestParam(value = "before", required = false) String before,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListAssistantsResponse>(objectMapper.readValue("", ListAssistantsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListAssistantsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ListMessageFilesResponse> listMessageFiles(@ApiParam(value = "The ID of the thread that the message and files belong to.",required=true ) @PathVariable("thread_id") String threadId,
        @ApiParam(value = "The ID of the message that the files belongs to.",required=true ) @PathVariable("message_id") String messageId,
        @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues = "asc, desc", defaultValue = "desc")  @RequestParam(value = "order", required = false, defaultValue="desc") String order,
        @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @RequestParam(value = "before", required = false) String before,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListMessageFilesResponse>(objectMapper.readValue("", ListMessageFilesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListMessageFilesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ListMessagesResponse> listMessages(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) the messages belong to.",required=true ) @PathVariable("thread_id") String threadId,
        @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues = "asc, desc", defaultValue = "desc")  @RequestParam(value = "order", required = false, defaultValue="desc") String order,
        @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @RequestParam(value = "before", required = false) String before,
        @ApiParam(value = "Filter messages by the run ID that generated them. ")  @RequestParam(value = "run_id", required = false) String runId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListMessagesResponse>(objectMapper.readValue("", ListMessagesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListMessagesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ListRunStepsResponse> listRunSteps(@ApiParam(value = "The ID of the thread the run and run steps belong to.",required=true ) @PathVariable("thread_id") String threadId,
        @ApiParam(value = "The ID of the run the run steps belong to.",required=true ) @PathVariable("run_id") String runId,
        @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues = "asc, desc", defaultValue = "desc")  @RequestParam(value = "order", required = false, defaultValue="desc") String order,
        @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @RequestParam(value = "before", required = false) String before,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListRunStepsResponse>(objectMapper.readValue("", ListRunStepsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListRunStepsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ListRunsResponse> listRuns(@ApiParam(value = "The ID of the thread the run belongs to.",required=true ) @PathVariable("thread_id") String threadId,
        @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20")  @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit,
        @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues = "asc, desc", defaultValue = "desc")  @RequestParam(value = "order", required = false, defaultValue="desc") String order,
        @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @RequestParam(value = "after", required = false) String after,
        @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @RequestParam(value = "before", required = false) String before,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListRunsResponse>(objectMapper.readValue("", ListRunsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListRunsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<AssistantObject> modifyAssistant(@ApiParam(value = "The ID of the assistant to modify.",required=true ) @PathVariable("assistant_id") String assistantId,
        @ApiParam(value = "" ,required=true )   @RequestBody ModifyAssistantRequest modifyAssistantRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AssistantObject>(objectMapper.readValue("", AssistantObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<AssistantObject>(HttpStatus.OK);
    }

    public ResponseEntity<MessageObject> modifyMessage(@ApiParam(value = "The ID of the thread to which this message belongs.",required=true ) @PathVariable("thread_id") String threadId,
        @ApiParam(value = "The ID of the message to modify.",required=true ) @PathVariable("message_id") String messageId,
        @ApiParam(value = "" ,required=true )   @RequestBody ModifyMessageRequest modifyMessageRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<MessageObject>(objectMapper.readValue("", MessageObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<MessageObject>(HttpStatus.OK);
    }

    public ResponseEntity<RunObject> modifyRun(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) that was run.",required=true ) @PathVariable("thread_id") String threadId,
        @ApiParam(value = "The ID of the run to modify.",required=true ) @PathVariable("run_id") String runId,
        @ApiParam(value = "" ,required=true )   @RequestBody ModifyRunRequest modifyRunRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<RunObject>(objectMapper.readValue("", RunObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<RunObject>(HttpStatus.OK);
    }

    public ResponseEntity<ThreadObject> modifyThread(@ApiParam(value = "The ID of the thread to modify. Only the `metadata` can be modified.",required=true ) @PathVariable("thread_id") String threadId,
        @ApiParam(value = "" ,required=true )   @RequestBody ModifyThreadRequest modifyThreadRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ThreadObject>(objectMapper.readValue("", ThreadObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<ThreadObject>(HttpStatus.OK);
    }

    public ResponseEntity<RunObject> submitToolOuputsToRun(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) to which this run belongs.",required=true ) @PathVariable("thread_id") String threadId,
        @ApiParam(value = "The ID of the run that requires the tool output submission.",required=true ) @PathVariable("run_id") String runId,
        @ApiParam(value = "" ,required=true )   @RequestBody SubmitToolOutputsRunRequest submitToolOutputsRunRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<RunObject>(objectMapper.readValue("", RunObject.class), HttpStatus.OK);
        }

        return new ResponseEntity<RunObject>(HttpStatus.OK);
    }

}
