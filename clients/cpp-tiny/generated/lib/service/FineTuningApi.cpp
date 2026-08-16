#include "FineTuningApi.h"

using namespace Tiny;



        Response<
            FineTuningJob
        >
        FineTuningApi::
        cancelFineTuningJob(
            
            std::string fineTuningJobId
            
        )
        {
            std::string url = basepath + "/fine_tuning/jobs/{fine_tuning_job_id}/cancel"; //fineTuningJobId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_fineTuningJobId("{");
                s_fineTuningJobId.append("fine_tuning_job_id");
                s_fineTuningJobId.append("}");

                int pos = url.find(s_fineTuningJobId);

                url.erase(pos, s_fineTuningJobId.length());
                url.insert(pos, stringify(fineTuningJobId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            FineTuningJob obj(output_string);


            Response<FineTuningJob> response(obj, httpCode);
            return response;
        }

        Response<
            FineTuningJob
        >
        FineTuningApi::
        createFineTuningJob(
            
            CreateFineTuningJobRequest createFineTuningJobRequest
            
        )
        {
            std::string url = basepath + "/fine_tuning/jobs"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createFineTuningJobRequest



            payload = createFineTuningJobRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            FineTuningJob obj(output_string);


            Response<FineTuningJob> response(obj, httpCode);
            return response;
        }

        Response<
            ListFineTuningJobEventsResponse
        >
        FineTuningApi::
        listFineTuningEvents(
            
            std::string fineTuningJobId
            , 
            
            std::string after
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/fine_tuning/jobs/{fine_tuning_job_id}/events"; //fineTuningJobId 


            // Headers  | 

            // Query    | after limit 
            addQueryParam("after",after);
            addQueryParam("limit",limit);

            // Form     | 



                std::string s_fineTuningJobId("{");
                s_fineTuningJobId.append("fine_tuning_job_id");
                s_fineTuningJobId.append("}");

                int pos = url.find(s_fineTuningJobId);

                url.erase(pos, s_fineTuningJobId.length());
                url.insert(pos, stringify(fineTuningJobId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ListFineTuningJobEventsResponse obj(output_string);


            Response<ListFineTuningJobEventsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ListFineTuningJobCheckpointsResponse
        >
        FineTuningApi::
        listFineTuningJobCheckpoints(
            
            std::string fineTuningJobId
            , 
            
            std::string after
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints"; //fineTuningJobId 


            // Headers  | 

            // Query    | after limit 
            addQueryParam("after",after);
            addQueryParam("limit",limit);

            // Form     | 



                std::string s_fineTuningJobId("{");
                s_fineTuningJobId.append("fine_tuning_job_id");
                s_fineTuningJobId.append("}");

                int pos = url.find(s_fineTuningJobId);

                url.erase(pos, s_fineTuningJobId.length());
                url.insert(pos, stringify(fineTuningJobId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ListFineTuningJobCheckpointsResponse obj(output_string);


            Response<ListFineTuningJobCheckpointsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ListPaginatedFineTuningJobsResponse
        >
        FineTuningApi::
        listPaginatedFineTuningJobs(
            
            std::string after
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/fine_tuning/jobs"; //


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




            ListPaginatedFineTuningJobsResponse obj(output_string);


            Response<ListPaginatedFineTuningJobsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            FineTuningJob
        >
        FineTuningApi::
        retrieveFineTuningJob(
            
            std::string fineTuningJobId
            
        )
        {
            std::string url = basepath + "/fine_tuning/jobs/{fine_tuning_job_id}"; //fineTuningJobId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_fineTuningJobId("{");
                s_fineTuningJobId.append("fine_tuning_job_id");
                s_fineTuningJobId.append("}");

                int pos = url.find(s_fineTuningJobId);

                url.erase(pos, s_fineTuningJobId.length());
                url.insert(pos, stringify(fineTuningJobId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            FineTuningJob obj(output_string);


            Response<FineTuningJob> response(obj, httpCode);
            return response;
        }



