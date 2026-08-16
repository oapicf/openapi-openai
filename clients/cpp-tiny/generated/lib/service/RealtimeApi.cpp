#include "RealtimeApi.h"

using namespace Tiny;



        Response<
            RealtimeSessionCreateResponse
        >
        RealtimeApi::
        createRealtimeSession(
            
            RealtimeSessionCreateRequest realtimeSessionCreateRequest
            
        )
        {
            std::string url = basepath + "/realtime/sessions"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | realtimeSessionCreateRequest



            payload = realtimeSessionCreateRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            RealtimeSessionCreateResponse obj(output_string);


            Response<RealtimeSessionCreateResponse> response(obj, httpCode);
            return response;
        }



