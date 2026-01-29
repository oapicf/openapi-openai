package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AssistantFileObject
import org.openapitools.model.AssistantObject
import org.openapitools.model.CreateAssistantFileRequest
import org.openapitools.model.CreateAssistantRequest
import org.openapitools.model.CreateMessageRequest
import org.openapitools.model.CreateRunRequest
import org.openapitools.model.CreateThreadAndRunRequest
import org.openapitools.model.CreateThreadRequest
import org.openapitools.model.DeleteAssistantFileResponse
import org.openapitools.model.DeleteAssistantResponse
import org.openapitools.model.DeleteThreadResponse
import org.openapitools.model.ListAssistantFilesResponse
import org.openapitools.model.ListAssistantsResponse
import org.openapitools.model.ListMessageFilesResponse
import org.openapitools.model.ListMessagesResponse
import org.openapitools.model.ListRunStepsResponse
import org.openapitools.model.ListRunsResponse
import org.openapitools.model.MessageFileObject
import org.openapitools.model.MessageObject
import org.openapitools.model.ModifyAssistantRequest
import org.openapitools.model.ModifyMessageRequest
import org.openapitools.model.ModifyRunRequest
import org.openapitools.model.ModifyThreadRequest
import org.openapitools.model.RunObject
import org.openapitools.model.RunStepObject
import org.openapitools.model.SubmitToolOutputsRunRequest
import org.openapitools.model.ThreadObject

class AssistantsApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def cancelRun ( String threadId, String runId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}/runs/${run_id}/cancel"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }
        // verify required params are set
        if (runId == null) {
            throw new RuntimeException("missing required params runId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    RunObject.class )

    }

    def createAssistant ( CreateAssistantRequest createAssistantRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/assistants"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createAssistantRequest == null) {
            throw new RuntimeException("missing required params createAssistantRequest")
        }



        contentType = 'application/json';
        bodyParams = createAssistantRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    AssistantObject.class )

    }

    def createAssistantFile ( String assistantId, CreateAssistantFileRequest createAssistantFileRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/assistants/${assistant_id}/files"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (assistantId == null) {
            throw new RuntimeException("missing required params assistantId")
        }
        // verify required params are set
        if (createAssistantFileRequest == null) {
            throw new RuntimeException("missing required params createAssistantFileRequest")
        }



        contentType = 'application/json';
        bodyParams = createAssistantFileRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    AssistantFileObject.class )

    }

    def createMessage ( String threadId, CreateMessageRequest createMessageRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}/messages"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }
        // verify required params are set
        if (createMessageRequest == null) {
            throw new RuntimeException("missing required params createMessageRequest")
        }



        contentType = 'application/json';
        bodyParams = createMessageRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    MessageObject.class )

    }

    def createRun ( String threadId, CreateRunRequest createRunRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}/runs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }
        // verify required params are set
        if (createRunRequest == null) {
            throw new RuntimeException("missing required params createRunRequest")
        }



        contentType = 'application/json';
        bodyParams = createRunRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    RunObject.class )

    }

    def createThread ( CreateThreadRequest createThreadRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType




        contentType = 'application/json';
        bodyParams = createThreadRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    ThreadObject.class )

    }

    def createThreadAndRun ( CreateThreadAndRunRequest createThreadAndRunRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/runs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (createThreadAndRunRequest == null) {
            throw new RuntimeException("missing required params createThreadAndRunRequest")
        }



        contentType = 'application/json';
        bodyParams = createThreadAndRunRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    RunObject.class )

    }

    def deleteAssistant ( String assistantId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/assistants/${assistant_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (assistantId == null) {
            throw new RuntimeException("missing required params assistantId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    DeleteAssistantResponse.class )

    }

    def deleteAssistantFile ( String assistantId, String fileId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/assistants/${assistant_id}/files/${file_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (assistantId == null) {
            throw new RuntimeException("missing required params assistantId")
        }
        // verify required params are set
        if (fileId == null) {
            throw new RuntimeException("missing required params fileId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    DeleteAssistantFileResponse.class )

    }

    def deleteThread ( String threadId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    DeleteThreadResponse.class )

    }

    def getAssistant ( String assistantId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/assistants/${assistant_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (assistantId == null) {
            throw new RuntimeException("missing required params assistantId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AssistantObject.class )

    }

    def getAssistantFile ( String assistantId, String fileId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/assistants/${assistant_id}/files/${file_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (assistantId == null) {
            throw new RuntimeException("missing required params assistantId")
        }
        // verify required params are set
        if (fileId == null) {
            throw new RuntimeException("missing required params fileId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AssistantFileObject.class )

    }

    def getMessage ( String threadId, String messageId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}/messages/${message_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }
        // verify required params are set
        if (messageId == null) {
            throw new RuntimeException("missing required params messageId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    MessageObject.class )

    }

    def getMessageFile ( String threadId, String messageId, String fileId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}/messages/${message_id}/files/${file_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }
        // verify required params are set
        if (messageId == null) {
            throw new RuntimeException("missing required params messageId")
        }
        // verify required params are set
        if (fileId == null) {
            throw new RuntimeException("missing required params fileId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    MessageFileObject.class )

    }

    def getRun ( String threadId, String runId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}/runs/${run_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }
        // verify required params are set
        if (runId == null) {
            throw new RuntimeException("missing required params runId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    RunObject.class )

    }

    def getRunStep ( String threadId, String runId, String stepId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}/runs/${run_id}/steps/${step_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }
        // verify required params are set
        if (runId == null) {
            throw new RuntimeException("missing required params runId")
        }
        // verify required params are set
        if (stepId == null) {
            throw new RuntimeException("missing required params stepId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    RunStepObject.class )

    }

    def getThread ( String threadId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ThreadObject.class )

    }

    def listAssistantFiles ( String assistantId, Integer limit, String order, String after, String before, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/assistants/${assistant_id}/files"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (assistantId == null) {
            throw new RuntimeException("missing required params assistantId")
        }

        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (after != null) {
            queryParams.put("after", after)
        }
        if (before != null) {
            queryParams.put("before", before)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListAssistantFilesResponse.class )

    }

    def listAssistants ( Integer limit, String order, String after, String before, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/assistants"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (after != null) {
            queryParams.put("after", after)
        }
        if (before != null) {
            queryParams.put("before", before)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListAssistantsResponse.class )

    }

    def listMessageFiles ( String threadId, String messageId, Integer limit, String order, String after, String before, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}/messages/${message_id}/files"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }
        // verify required params are set
        if (messageId == null) {
            throw new RuntimeException("missing required params messageId")
        }

        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (after != null) {
            queryParams.put("after", after)
        }
        if (before != null) {
            queryParams.put("before", before)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListMessageFilesResponse.class )

    }

    def listMessages ( String threadId, Integer limit, String order, String after, String before, String runId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}/messages"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }

        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (after != null) {
            queryParams.put("after", after)
        }
        if (before != null) {
            queryParams.put("before", before)
        }
        if (runId != null) {
            queryParams.put("run_id", runId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListMessagesResponse.class )

    }

    def listRunSteps ( String threadId, String runId, Integer limit, String order, String after, String before, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}/runs/${run_id}/steps"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }
        // verify required params are set
        if (runId == null) {
            throw new RuntimeException("missing required params runId")
        }

        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (after != null) {
            queryParams.put("after", after)
        }
        if (before != null) {
            queryParams.put("before", before)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListRunStepsResponse.class )

    }

    def listRuns ( String threadId, Integer limit, String order, String after, String before, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}/runs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }

        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (after != null) {
            queryParams.put("after", after)
        }
        if (before != null) {
            queryParams.put("before", before)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListRunsResponse.class )

    }

    def modifyAssistant ( String assistantId, ModifyAssistantRequest modifyAssistantRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/assistants/${assistant_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (assistantId == null) {
            throw new RuntimeException("missing required params assistantId")
        }
        // verify required params are set
        if (modifyAssistantRequest == null) {
            throw new RuntimeException("missing required params modifyAssistantRequest")
        }



        contentType = 'application/json';
        bodyParams = modifyAssistantRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    AssistantObject.class )

    }

    def modifyMessage ( String threadId, String messageId, ModifyMessageRequest modifyMessageRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}/messages/${message_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }
        // verify required params are set
        if (messageId == null) {
            throw new RuntimeException("missing required params messageId")
        }
        // verify required params are set
        if (modifyMessageRequest == null) {
            throw new RuntimeException("missing required params modifyMessageRequest")
        }



        contentType = 'application/json';
        bodyParams = modifyMessageRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    MessageObject.class )

    }

    def modifyRun ( String threadId, String runId, ModifyRunRequest modifyRunRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}/runs/${run_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }
        // verify required params are set
        if (runId == null) {
            throw new RuntimeException("missing required params runId")
        }
        // verify required params are set
        if (modifyRunRequest == null) {
            throw new RuntimeException("missing required params modifyRunRequest")
        }



        contentType = 'application/json';
        bodyParams = modifyRunRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    RunObject.class )

    }

    def modifyThread ( String threadId, ModifyThreadRequest modifyThreadRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }
        // verify required params are set
        if (modifyThreadRequest == null) {
            throw new RuntimeException("missing required params modifyThreadRequest")
        }



        contentType = 'application/json';
        bodyParams = modifyThreadRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    ThreadObject.class )

    }

    def submitToolOuputsToRun ( String threadId, String runId, SubmitToolOutputsRunRequest submitToolOutputsRunRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/threads/${thread_id}/runs/${run_id}/submit_tool_outputs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (threadId == null) {
            throw new RuntimeException("missing required params threadId")
        }
        // verify required params are set
        if (runId == null) {
            throw new RuntimeException("missing required params runId")
        }
        // verify required params are set
        if (submitToolOutputsRunRequest == null) {
            throw new RuntimeException("missing required params submitToolOutputsRunRequest")
        }



        contentType = 'application/json';
        bodyParams = submitToolOutputsRunRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    RunObject.class )

    }

}
