#include "ModerationsApi.h"

using namespace Tiny;



        Response<
            CreateModerationResponse
        >
        ModerationsApi::
        createModeration(
            
            CreateModerationRequest createModerationRequest
            
        )
        {
            std::string url = basepath + "/moderations"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createModerationRequest



            payload = createModerationRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CreateModerationResponse obj(output_string);


            Response<CreateModerationResponse> response(obj, httpCode);
            return response;
        }



