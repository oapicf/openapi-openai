#include "BatchApi.h"

using namespace Tiny;



        Response<
            Batch
        >
        BatchApi::
        cancelBatch(
            
            std::string batchId
            
        )
        {
            std::string url = basepath + "/batches/{batch_id}/cancel"; //batchId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_batchId("{");
                s_batchId.append("batch_id");
                s_batchId.append("}");

                int pos = url.find(s_batchId);

                url.erase(pos, s_batchId.length());
                url.insert(pos, stringify(batchId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Batch obj(output_string);


            Response<Batch> response(obj, httpCode);
            return response;
        }

        Response<
            Batch
        >
        BatchApi::
        createBatch(
            
            CreateBatch_request createBatchRequest
            
        )
        {
            std::string url = basepath + "/batches"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createBatchRequest



            payload = createBatchRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Batch obj(output_string);


            Response<Batch> response(obj, httpCode);
            return response;
        }

        Response<
            ListBatchesResponse
        >
        BatchApi::
        listBatches(
            
            std::string after
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/batches"; //


            // Headers  | 

            // Query    | after limit 
            addQueryParam("after",after);
            addQueryParam("limit",limit);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ListBatchesResponse obj(output_string);


            Response<ListBatchesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            Batch
        >
        BatchApi::
        retrieveBatch(
            
            std::string batchId
            
        )
        {
            std::string url = basepath + "/batches/{batch_id}"; //batchId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_batchId("{");
                s_batchId.append("batch_id");
                s_batchId.append("}");

                int pos = url.find(s_batchId);

                url.erase(pos, s_batchId.length());
                url.insert(pos, stringify(batchId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Batch obj(output_string);


            Response<Batch> response(obj, httpCode);
            return response;
        }



