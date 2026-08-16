#include "CompletionsApi.h"

using namespace Tiny;



        Response<
            CreateCompletionResponse
        >
        CompletionsApi::
        createCompletion(
            
            CreateCompletionRequest createCompletionRequest
            
        )
        {
            std::string url = basepath + "/completions"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createCompletionRequest



            payload = createCompletionRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CreateCompletionResponse obj(output_string);


            Response<CreateCompletionResponse> response(obj, httpCode);
            return response;
        }



