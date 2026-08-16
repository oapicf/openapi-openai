#include "ChatApi.h"

using namespace Tiny;



        Response<
            CreateChatCompletionResponse
        >
        ChatApi::
        createChatCompletion(
            
            CreateChatCompletionRequest createChatCompletionRequest
            
        )
        {
            std::string url = basepath + "/chat/completions"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createChatCompletionRequest



            payload = createChatCompletionRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CreateChatCompletionResponse obj(output_string);


            Response<CreateChatCompletionResponse> response(obj, httpCode);
            return response;
        }



