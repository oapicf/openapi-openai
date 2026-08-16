#include "AssistantsApi.h"

using namespace Tiny;



        Response<
            RunObject
        >
        AssistantsApi::
        cancelRun(
            
            std::string threadId
            , 
            
            std::string runId
            
        )
        {
            std::string url = basepath + "/threads/{thread_id}/runs/{run_id}/cancel"; //threadId runId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_threadId("{");
                s_threadId.append("thread_id");
                s_threadId.append("}");

                int pos = url.find(s_threadId);

                url.erase(pos, s_threadId.length());
                url.insert(pos, stringify(threadId));
                std::string s_runId("{");
                s_runId.append("run_id");
                s_runId.append("}");

                int pos = url.find(s_runId);

                url.erase(pos, s_runId.length());
                url.insert(pos, stringify(runId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            RunObject obj(output_string);


            Response<RunObject> response(obj, httpCode);
            return response;
        }

        Response<
            AssistantObject
        >
        AssistantsApi::
        createAssistant(
            
            CreateAssistantRequest createAssistantRequest
            
        )
        {
            std::string url = basepath + "/assistants"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createAssistantRequest



            payload = createAssistantRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AssistantObject obj(output_string);


            Response<AssistantObject> response(obj, httpCode);
            return response;
        }

        Response<
            MessageObject
        >
        AssistantsApi::
        createMessage(
            
            std::string threadId
            , 
            
            CreateMessageRequest createMessageRequest
            
        )
        {
            std::string url = basepath + "/threads/{thread_id}/messages"; //threadId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_threadId("{");
                s_threadId.append("thread_id");
                s_threadId.append("}");

                int pos = url.find(s_threadId);

                url.erase(pos, s_threadId.length());
                url.insert(pos, stringify(threadId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createMessageRequest



            payload = createMessageRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            MessageObject obj(output_string);


            Response<MessageObject> response(obj, httpCode);
            return response;
        }

        Response<
            RunObject
        >
        AssistantsApi::
        createRun(
            
            std::string threadId
            , 
            
            CreateRunRequest createRunRequest
            , 
            std::list<std::string> includeLeft_Square_BracketRight_Square_Bracket
            
            
        )
        {
            std::string url = basepath + "/threads/{thread_id}/runs"; //threadId 


            // Headers  | 

            // Query    | includeLeft_Square_BracketRight_Square_Bracket 
            for (auto &x : includeLeft_Square_BracketRight_Square_Bracket){
                addQueryParam("include[]", std::string(x));
            }

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_threadId("{");
                s_threadId.append("thread_id");
                s_threadId.append("}");

                int pos = url.find(s_threadId);

                url.erase(pos, s_threadId.length());
                url.insert(pos, stringify(threadId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createRunRequest



            payload = createRunRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            RunObject obj(output_string);


            Response<RunObject> response(obj, httpCode);
            return response;
        }

        Response<
            ThreadObject
        >
        AssistantsApi::
        createThread(
            
            CreateThreadRequest createThreadRequest
            
        )
        {
            std::string url = basepath + "/threads"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createThreadRequest



            payload = createThreadRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ThreadObject obj(output_string);


            Response<ThreadObject> response(obj, httpCode);
            return response;
        }

        Response<
            RunObject
        >
        AssistantsApi::
        createThreadAndRun(
            
            CreateThreadAndRunRequest createThreadAndRunRequest
            
        )
        {
            std::string url = basepath + "/threads/runs"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createThreadAndRunRequest



            payload = createThreadAndRunRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            RunObject obj(output_string);


            Response<RunObject> response(obj, httpCode);
            return response;
        }

        Response<
            DeleteAssistantResponse
        >
        AssistantsApi::
        deleteAssistant(
            
            std::string assistantId
            
        )
        {
            std::string url = basepath + "/assistants/{assistant_id}"; //assistantId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_assistantId("{");
                s_assistantId.append("assistant_id");
                s_assistantId.append("}");

                int pos = url.find(s_assistantId);

                url.erase(pos, s_assistantId.length());
                url.insert(pos, stringify(assistantId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeleteAssistantResponse obj(output_string);


            Response<DeleteAssistantResponse> response(obj, httpCode);
            return response;
        }

        Response<
            DeleteMessageResponse
        >
        AssistantsApi::
        deleteMessage(
            
            std::string threadId
            , 
            
            std::string messageId
            
        )
        {
            std::string url = basepath + "/threads/{thread_id}/messages/{message_id}"; //threadId messageId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_threadId("{");
                s_threadId.append("thread_id");
                s_threadId.append("}");

                int pos = url.find(s_threadId);

                url.erase(pos, s_threadId.length());
                url.insert(pos, stringify(threadId));
                std::string s_messageId("{");
                s_messageId.append("message_id");
                s_messageId.append("}");

                int pos = url.find(s_messageId);

                url.erase(pos, s_messageId.length());
                url.insert(pos, stringify(messageId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeleteMessageResponse obj(output_string);


            Response<DeleteMessageResponse> response(obj, httpCode);
            return response;
        }

        Response<
            DeleteThreadResponse
        >
        AssistantsApi::
        deleteThread(
            
            std::string threadId
            
        )
        {
            std::string url = basepath + "/threads/{thread_id}"; //threadId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_threadId("{");
                s_threadId.append("thread_id");
                s_threadId.append("}");

                int pos = url.find(s_threadId);

                url.erase(pos, s_threadId.length());
                url.insert(pos, stringify(threadId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeleteThreadResponse obj(output_string);


            Response<DeleteThreadResponse> response(obj, httpCode);
            return response;
        }

        Response<
            AssistantObject
        >
        AssistantsApi::
        getAssistant(
            
            std::string assistantId
            
        )
        {
            std::string url = basepath + "/assistants/{assistant_id}"; //assistantId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_assistantId("{");
                s_assistantId.append("assistant_id");
                s_assistantId.append("}");

                int pos = url.find(s_assistantId);

                url.erase(pos, s_assistantId.length());
                url.insert(pos, stringify(assistantId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AssistantObject obj(output_string);


            Response<AssistantObject> response(obj, httpCode);
            return response;
        }

        Response<
            MessageObject
        >
        AssistantsApi::
        getMessage(
            
            std::string threadId
            , 
            
            std::string messageId
            
        )
        {
            std::string url = basepath + "/threads/{thread_id}/messages/{message_id}"; //threadId messageId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_threadId("{");
                s_threadId.append("thread_id");
                s_threadId.append("}");

                int pos = url.find(s_threadId);

                url.erase(pos, s_threadId.length());
                url.insert(pos, stringify(threadId));
                std::string s_messageId("{");
                s_messageId.append("message_id");
                s_messageId.append("}");

                int pos = url.find(s_messageId);

                url.erase(pos, s_messageId.length());
                url.insert(pos, stringify(messageId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            MessageObject obj(output_string);


            Response<MessageObject> response(obj, httpCode);
            return response;
        }

        Response<
            RunObject
        >
        AssistantsApi::
        getRun(
            
            std::string threadId
            , 
            
            std::string runId
            
        )
        {
            std::string url = basepath + "/threads/{thread_id}/runs/{run_id}"; //threadId runId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_threadId("{");
                s_threadId.append("thread_id");
                s_threadId.append("}");

                int pos = url.find(s_threadId);

                url.erase(pos, s_threadId.length());
                url.insert(pos, stringify(threadId));
                std::string s_runId("{");
                s_runId.append("run_id");
                s_runId.append("}");

                int pos = url.find(s_runId);

                url.erase(pos, s_runId.length());
                url.insert(pos, stringify(runId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            RunObject obj(output_string);


            Response<RunObject> response(obj, httpCode);
            return response;
        }

        Response<
            RunStepObject
        >
        AssistantsApi::
        getRunStep(
            
            std::string threadId
            , 
            
            std::string runId
            , 
            
            std::string stepId
            , 
            std::list<std::string> includeLeft_Square_BracketRight_Square_Bracket
            
            
        )
        {
            std::string url = basepath + "/threads/{thread_id}/runs/{run_id}/steps/{step_id}"; //threadId runId stepId 


            // Headers  | 

            // Query    | includeLeft_Square_BracketRight_Square_Bracket 
            for (auto &x : includeLeft_Square_BracketRight_Square_Bracket){
                addQueryParam("include[]", std::string(x));
            }

            // Form     | 



                std::string s_threadId("{");
                s_threadId.append("thread_id");
                s_threadId.append("}");

                int pos = url.find(s_threadId);

                url.erase(pos, s_threadId.length());
                url.insert(pos, stringify(threadId));
                std::string s_runId("{");
                s_runId.append("run_id");
                s_runId.append("}");

                int pos = url.find(s_runId);

                url.erase(pos, s_runId.length());
                url.insert(pos, stringify(runId));
                std::string s_stepId("{");
                s_stepId.append("step_id");
                s_stepId.append("}");

                int pos = url.find(s_stepId);

                url.erase(pos, s_stepId.length());
                url.insert(pos, stringify(stepId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            RunStepObject obj(output_string);


            Response<RunStepObject> response(obj, httpCode);
            return response;
        }

        Response<
            ThreadObject
        >
        AssistantsApi::
        getThread(
            
            std::string threadId
            
        )
        {
            std::string url = basepath + "/threads/{thread_id}"; //threadId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_threadId("{");
                s_threadId.append("thread_id");
                s_threadId.append("}");

                int pos = url.find(s_threadId);

                url.erase(pos, s_threadId.length());
                url.insert(pos, stringify(threadId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ThreadObject obj(output_string);


            Response<ThreadObject> response(obj, httpCode);
            return response;
        }

        Response<
            ListAssistantsResponse
        >
        AssistantsApi::
        listAssistants(
            
            int limit
            , 
            
            std::string order
            , 
            
            std::string after
            , 
            
            std::string before
            
        )
        {
            std::string url = basepath + "/assistants"; //


            // Headers  | 

            // Query    | limit order after before 
            addQueryParam("limit",limit);
            addQueryParam("order",order);
            addQueryParam("after",after);
            addQueryParam("before",before);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ListAssistantsResponse obj(output_string);


            Response<ListAssistantsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ListMessagesResponse
        >
        AssistantsApi::
        listMessages(
            
            std::string threadId
            , 
            
            int limit
            , 
            
            std::string order
            , 
            
            std::string after
            , 
            
            std::string before
            , 
            
            std::string runId
            
        )
        {
            std::string url = basepath + "/threads/{thread_id}/messages"; //threadId 


            // Headers  | 

            // Query    | limit order after before runId 
            addQueryParam("limit",limit);
            addQueryParam("order",order);
            addQueryParam("after",after);
            addQueryParam("before",before);
            addQueryParam("run_id",runId);

            // Form     | 



                std::string s_threadId("{");
                s_threadId.append("thread_id");
                s_threadId.append("}");

                int pos = url.find(s_threadId);

                url.erase(pos, s_threadId.length());
                url.insert(pos, stringify(threadId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ListMessagesResponse obj(output_string);


            Response<ListMessagesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ListRunStepsResponse
        >
        AssistantsApi::
        listRunSteps(
            
            std::string threadId
            , 
            
            std::string runId
            , 
            
            int limit
            , 
            
            std::string order
            , 
            
            std::string after
            , 
            
            std::string before
            , 
            std::list<std::string> includeLeft_Square_BracketRight_Square_Bracket
            
            
        )
        {
            std::string url = basepath + "/threads/{thread_id}/runs/{run_id}/steps"; //threadId runId 


            // Headers  | 

            // Query    | limit order after before includeLeft_Square_BracketRight_Square_Bracket 
            addQueryParam("limit",limit);
            addQueryParam("order",order);
            addQueryParam("after",after);
            addQueryParam("before",before);
            for (auto &x : includeLeft_Square_BracketRight_Square_Bracket){
                addQueryParam("include[]", std::string(x));
            }

            // Form     | 



                std::string s_threadId("{");
                s_threadId.append("thread_id");
                s_threadId.append("}");

                int pos = url.find(s_threadId);

                url.erase(pos, s_threadId.length());
                url.insert(pos, stringify(threadId));
                std::string s_runId("{");
                s_runId.append("run_id");
                s_runId.append("}");

                int pos = url.find(s_runId);

                url.erase(pos, s_runId.length());
                url.insert(pos, stringify(runId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ListRunStepsResponse obj(output_string);


            Response<ListRunStepsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ListRunsResponse
        >
        AssistantsApi::
        listRuns(
            
            std::string threadId
            , 
            
            int limit
            , 
            
            std::string order
            , 
            
            std::string after
            , 
            
            std::string before
            
        )
        {
            std::string url = basepath + "/threads/{thread_id}/runs"; //threadId 


            // Headers  | 

            // Query    | limit order after before 
            addQueryParam("limit",limit);
            addQueryParam("order",order);
            addQueryParam("after",after);
            addQueryParam("before",before);

            // Form     | 



                std::string s_threadId("{");
                s_threadId.append("thread_id");
                s_threadId.append("}");

                int pos = url.find(s_threadId);

                url.erase(pos, s_threadId.length());
                url.insert(pos, stringify(threadId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ListRunsResponse obj(output_string);


            Response<ListRunsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            AssistantObject
        >
        AssistantsApi::
        modifyAssistant(
            
            std::string assistantId
            , 
            
            ModifyAssistantRequest modifyAssistantRequest
            
        )
        {
            std::string url = basepath + "/assistants/{assistant_id}"; //assistantId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_assistantId("{");
                s_assistantId.append("assistant_id");
                s_assistantId.append("}");

                int pos = url.find(s_assistantId);

                url.erase(pos, s_assistantId.length());
                url.insert(pos, stringify(assistantId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | modifyAssistantRequest



            payload = modifyAssistantRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AssistantObject obj(output_string);


            Response<AssistantObject> response(obj, httpCode);
            return response;
        }

        Response<
            MessageObject
        >
        AssistantsApi::
        modifyMessage(
            
            std::string threadId
            , 
            
            std::string messageId
            , 
            
            ModifyMessageRequest modifyMessageRequest
            
        )
        {
            std::string url = basepath + "/threads/{thread_id}/messages/{message_id}"; //threadId messageId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_threadId("{");
                s_threadId.append("thread_id");
                s_threadId.append("}");

                int pos = url.find(s_threadId);

                url.erase(pos, s_threadId.length());
                url.insert(pos, stringify(threadId));
                std::string s_messageId("{");
                s_messageId.append("message_id");
                s_messageId.append("}");

                int pos = url.find(s_messageId);

                url.erase(pos, s_messageId.length());
                url.insert(pos, stringify(messageId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | modifyMessageRequest



            payload = modifyMessageRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            MessageObject obj(output_string);


            Response<MessageObject> response(obj, httpCode);
            return response;
        }

        Response<
            RunObject
        >
        AssistantsApi::
        modifyRun(
            
            std::string threadId
            , 
            
            std::string runId
            , 
            
            ModifyRunRequest modifyRunRequest
            
        )
        {
            std::string url = basepath + "/threads/{thread_id}/runs/{run_id}"; //threadId runId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_threadId("{");
                s_threadId.append("thread_id");
                s_threadId.append("}");

                int pos = url.find(s_threadId);

                url.erase(pos, s_threadId.length());
                url.insert(pos, stringify(threadId));
                std::string s_runId("{");
                s_runId.append("run_id");
                s_runId.append("}");

                int pos = url.find(s_runId);

                url.erase(pos, s_runId.length());
                url.insert(pos, stringify(runId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | modifyRunRequest



            payload = modifyRunRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            RunObject obj(output_string);


            Response<RunObject> response(obj, httpCode);
            return response;
        }

        Response<
            ThreadObject
        >
        AssistantsApi::
        modifyThread(
            
            std::string threadId
            , 
            
            ModifyThreadRequest modifyThreadRequest
            
        )
        {
            std::string url = basepath + "/threads/{thread_id}"; //threadId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_threadId("{");
                s_threadId.append("thread_id");
                s_threadId.append("}");

                int pos = url.find(s_threadId);

                url.erase(pos, s_threadId.length());
                url.insert(pos, stringify(threadId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | modifyThreadRequest



            payload = modifyThreadRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ThreadObject obj(output_string);


            Response<ThreadObject> response(obj, httpCode);
            return response;
        }

        Response<
            RunObject
        >
        AssistantsApi::
        submitToolOuputsToRun(
            
            std::string threadId
            , 
            
            std::string runId
            , 
            
            SubmitToolOutputsRunRequest submitToolOutputsRunRequest
            
        )
        {
            std::string url = basepath + "/threads/{thread_id}/runs/{run_id}/submit_tool_outputs"; //threadId runId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_threadId("{");
                s_threadId.append("thread_id");
                s_threadId.append("}");

                int pos = url.find(s_threadId);

                url.erase(pos, s_threadId.length());
                url.insert(pos, stringify(threadId));
                std::string s_runId("{");
                s_runId.append("run_id");
                s_runId.append("}");

                int pos = url.find(s_runId);

                url.erase(pos, s_runId.length());
                url.insert(pos, stringify(runId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | submitToolOutputsRunRequest



            payload = submitToolOutputsRunRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            RunObject obj(output_string);


            Response<RunObject> response(obj, httpCode);
            return response;
        }



