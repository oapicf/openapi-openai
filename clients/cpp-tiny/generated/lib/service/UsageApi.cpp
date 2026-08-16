#include "UsageApi.h"

using namespace Tiny;



        Response<
            UsageResponse
        >
        UsageApi::
        usageAudioSpeeches(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> userIds
            
            , 
            std::list<std::string> apiKeyIds
            
            , 
            std::list<std::string> models
            
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
        )
        {
            std::string url = basepath + "/organization/usage/audio_speeches"; //


            // Headers  | 

            // Query    | startTime endTime bucketWidth projectIds userIds apiKeyIds models groupBy limit page 
            addQueryParam("start_time",startTime);
            addQueryParam("end_time",endTime);
            addQueryParam("bucket_width",bucketWidth);
            for (auto &x : projectIds){
                addQueryParam("project_ids", std::string(x));
            }
            for (auto &x : userIds){
                addQueryParam("user_ids", std::string(x));
            }
            for (auto &x : apiKeyIds){
                addQueryParam("api_key_ids", std::string(x));
            }
            for (auto &x : models){
                addQueryParam("models", std::string(x));
            }
            for (auto &x : groupBy){
                addQueryParam("group_by", std::string(x));
            }
            addQueryParam("limit",limit);
            addQueryParam("page",page);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UsageResponse obj(output_string);


            Response<UsageResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UsageResponse
        >
        UsageApi::
        usageAudioTranscriptions(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> userIds
            
            , 
            std::list<std::string> apiKeyIds
            
            , 
            std::list<std::string> models
            
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
        )
        {
            std::string url = basepath + "/organization/usage/audio_transcriptions"; //


            // Headers  | 

            // Query    | startTime endTime bucketWidth projectIds userIds apiKeyIds models groupBy limit page 
            addQueryParam("start_time",startTime);
            addQueryParam("end_time",endTime);
            addQueryParam("bucket_width",bucketWidth);
            for (auto &x : projectIds){
                addQueryParam("project_ids", std::string(x));
            }
            for (auto &x : userIds){
                addQueryParam("user_ids", std::string(x));
            }
            for (auto &x : apiKeyIds){
                addQueryParam("api_key_ids", std::string(x));
            }
            for (auto &x : models){
                addQueryParam("models", std::string(x));
            }
            for (auto &x : groupBy){
                addQueryParam("group_by", std::string(x));
            }
            addQueryParam("limit",limit);
            addQueryParam("page",page);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UsageResponse obj(output_string);


            Response<UsageResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UsageResponse
        >
        UsageApi::
        usageCodeInterpreterSessions(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
        )
        {
            std::string url = basepath + "/organization/usage/code_interpreter_sessions"; //


            // Headers  | 

            // Query    | startTime endTime bucketWidth projectIds groupBy limit page 
            addQueryParam("start_time",startTime);
            addQueryParam("end_time",endTime);
            addQueryParam("bucket_width",bucketWidth);
            for (auto &x : projectIds){
                addQueryParam("project_ids", std::string(x));
            }
            for (auto &x : groupBy){
                addQueryParam("group_by", std::string(x));
            }
            addQueryParam("limit",limit);
            addQueryParam("page",page);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UsageResponse obj(output_string);


            Response<UsageResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UsageResponse
        >
        UsageApi::
        usageCompletions(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> userIds
            
            , 
            std::list<std::string> apiKeyIds
            
            , 
            std::list<std::string> models
            
            , 
            
            bool batch
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
        )
        {
            std::string url = basepath + "/organization/usage/completions"; //


            // Headers  | 

            // Query    | startTime endTime bucketWidth projectIds userIds apiKeyIds models batch groupBy limit page 
            addQueryParam("start_time",startTime);
            addQueryParam("end_time",endTime);
            addQueryParam("bucket_width",bucketWidth);
            for (auto &x : projectIds){
                addQueryParam("project_ids", std::string(x));
            }
            for (auto &x : userIds){
                addQueryParam("user_ids", std::string(x));
            }
            for (auto &x : apiKeyIds){
                addQueryParam("api_key_ids", std::string(x));
            }
            for (auto &x : models){
                addQueryParam("models", std::string(x));
            }
            addQueryParam("batch",batch);
            for (auto &x : groupBy){
                addQueryParam("group_by", std::string(x));
            }
            addQueryParam("limit",limit);
            addQueryParam("page",page);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UsageResponse obj(output_string);


            Response<UsageResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UsageResponse
        >
        UsageApi::
        usageCosts(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
        )
        {
            std::string url = basepath + "/organization/costs"; //


            // Headers  | 

            // Query    | startTime endTime bucketWidth projectIds groupBy limit page 
            addQueryParam("start_time",startTime);
            addQueryParam("end_time",endTime);
            addQueryParam("bucket_width",bucketWidth);
            for (auto &x : projectIds){
                addQueryParam("project_ids", std::string(x));
            }
            for (auto &x : groupBy){
                addQueryParam("group_by", std::string(x));
            }
            addQueryParam("limit",limit);
            addQueryParam("page",page);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UsageResponse obj(output_string);


            Response<UsageResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UsageResponse
        >
        UsageApi::
        usageEmbeddings(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> userIds
            
            , 
            std::list<std::string> apiKeyIds
            
            , 
            std::list<std::string> models
            
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
        )
        {
            std::string url = basepath + "/organization/usage/embeddings"; //


            // Headers  | 

            // Query    | startTime endTime bucketWidth projectIds userIds apiKeyIds models groupBy limit page 
            addQueryParam("start_time",startTime);
            addQueryParam("end_time",endTime);
            addQueryParam("bucket_width",bucketWidth);
            for (auto &x : projectIds){
                addQueryParam("project_ids", std::string(x));
            }
            for (auto &x : userIds){
                addQueryParam("user_ids", std::string(x));
            }
            for (auto &x : apiKeyIds){
                addQueryParam("api_key_ids", std::string(x));
            }
            for (auto &x : models){
                addQueryParam("models", std::string(x));
            }
            for (auto &x : groupBy){
                addQueryParam("group_by", std::string(x));
            }
            addQueryParam("limit",limit);
            addQueryParam("page",page);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UsageResponse obj(output_string);


            Response<UsageResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UsageResponse
        >
        UsageApi::
        usageImages(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> sources
            
            , 
            std::list<std::string> sizes
            
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> userIds
            
            , 
            std::list<std::string> apiKeyIds
            
            , 
            std::list<std::string> models
            
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
        )
        {
            std::string url = basepath + "/organization/usage/images"; //


            // Headers  | 

            // Query    | startTime endTime bucketWidth sources sizes projectIds userIds apiKeyIds models groupBy limit page 
            addQueryParam("start_time",startTime);
            addQueryParam("end_time",endTime);
            addQueryParam("bucket_width",bucketWidth);
            for (auto &x : sources){
                addQueryParam("sources", std::string(x));
            }
            for (auto &x : sizes){
                addQueryParam("sizes", std::string(x));
            }
            for (auto &x : projectIds){
                addQueryParam("project_ids", std::string(x));
            }
            for (auto &x : userIds){
                addQueryParam("user_ids", std::string(x));
            }
            for (auto &x : apiKeyIds){
                addQueryParam("api_key_ids", std::string(x));
            }
            for (auto &x : models){
                addQueryParam("models", std::string(x));
            }
            for (auto &x : groupBy){
                addQueryParam("group_by", std::string(x));
            }
            addQueryParam("limit",limit);
            addQueryParam("page",page);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UsageResponse obj(output_string);


            Response<UsageResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UsageResponse
        >
        UsageApi::
        usageModerations(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> userIds
            
            , 
            std::list<std::string> apiKeyIds
            
            , 
            std::list<std::string> models
            
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
        )
        {
            std::string url = basepath + "/organization/usage/moderations"; //


            // Headers  | 

            // Query    | startTime endTime bucketWidth projectIds userIds apiKeyIds models groupBy limit page 
            addQueryParam("start_time",startTime);
            addQueryParam("end_time",endTime);
            addQueryParam("bucket_width",bucketWidth);
            for (auto &x : projectIds){
                addQueryParam("project_ids", std::string(x));
            }
            for (auto &x : userIds){
                addQueryParam("user_ids", std::string(x));
            }
            for (auto &x : apiKeyIds){
                addQueryParam("api_key_ids", std::string(x));
            }
            for (auto &x : models){
                addQueryParam("models", std::string(x));
            }
            for (auto &x : groupBy){
                addQueryParam("group_by", std::string(x));
            }
            addQueryParam("limit",limit);
            addQueryParam("page",page);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UsageResponse obj(output_string);


            Response<UsageResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UsageResponse
        >
        UsageApi::
        usageVectorStores(
            
            int startTime
            , 
            
            int endTime
            , 
            
            std::string bucketWidth
            , 
            std::list<std::string> projectIds
            
            , 
            std::list<std::string> groupBy
            
            , 
            
            int limit
            , 
            
            std::string page
            
        )
        {
            std::string url = basepath + "/organization/usage/vector_stores"; //


            // Headers  | 

            // Query    | startTime endTime bucketWidth projectIds groupBy limit page 
            addQueryParam("start_time",startTime);
            addQueryParam("end_time",endTime);
            addQueryParam("bucket_width",bucketWidth);
            for (auto &x : projectIds){
                addQueryParam("project_ids", std::string(x));
            }
            for (auto &x : groupBy){
                addQueryParam("group_by", std::string(x));
            }
            addQueryParam("limit",limit);
            addQueryParam("page",page);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UsageResponse obj(output_string);


            Response<UsageResponse> response(obj, httpCode);
            return response;
        }



