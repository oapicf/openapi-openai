#include "UploadsApi.h"

using namespace Tiny;



        Response<
            UploadPart
        >
        UploadsApi::
        addUploadPart(
            
            std::string uploadId
            , 
            
            std::string data
            
        )
        {
            std::string url = basepath + "/uploads/{upload_id}/parts"; //uploadId 


            // Headers  | 

            // Query    | 

            // Form     | data 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("data",data);


                std::string s_uploadId("{");
                s_uploadId.append("upload_id");
                s_uploadId.append("}");

                int pos = url.find(s_uploadId);

                url.erase(pos, s_uploadId.length());
                url.insert(pos, stringify(uploadId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UploadPart obj(output_string);


            Response<UploadPart> response(obj, httpCode);
            return response;
        }

        Response<
            Upload
        >
        UploadsApi::
        cancelUpload(
            
            std::string uploadId
            
        )
        {
            std::string url = basepath + "/uploads/{upload_id}/cancel"; //uploadId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_uploadId("{");
                s_uploadId.append("upload_id");
                s_uploadId.append("}");

                int pos = url.find(s_uploadId);

                url.erase(pos, s_uploadId.length());
                url.insert(pos, stringify(uploadId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Upload obj(output_string);


            Response<Upload> response(obj, httpCode);
            return response;
        }

        Response<
            Upload
        >
        UploadsApi::
        completeUpload(
            
            std::string uploadId
            , 
            
            CompleteUploadRequest completeUploadRequest
            
        )
        {
            std::string url = basepath + "/uploads/{upload_id}/complete"; //uploadId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_uploadId("{");
                s_uploadId.append("upload_id");
                s_uploadId.append("}");

                int pos = url.find(s_uploadId);

                url.erase(pos, s_uploadId.length());
                url.insert(pos, stringify(uploadId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | completeUploadRequest



            payload = completeUploadRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Upload obj(output_string);


            Response<Upload> response(obj, httpCode);
            return response;
        }

        Response<
            Upload
        >
        UploadsApi::
        createUpload(
            
            CreateUploadRequest createUploadRequest
            
        )
        {
            std::string url = basepath + "/uploads"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createUploadRequest



            payload = createUploadRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Upload obj(output_string);


            Response<Upload> response(obj, httpCode);
            return response;
        }



