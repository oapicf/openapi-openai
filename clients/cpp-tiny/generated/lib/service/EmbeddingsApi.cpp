#include "EmbeddingsApi.h"

using namespace Tiny;



        Response<
            CreateEmbeddingResponse
        >
        EmbeddingsApi::
        createEmbedding(
            
            CreateEmbeddingRequest createEmbeddingRequest
            
        )
        {
            std::string url = basepath + "/embeddings"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createEmbeddingRequest



            payload = createEmbeddingRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            CreateEmbeddingResponse obj(output_string);


            Response<CreateEmbeddingResponse> response(obj, httpCode);
            return response;
        }



