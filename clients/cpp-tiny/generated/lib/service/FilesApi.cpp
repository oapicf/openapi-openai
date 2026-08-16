#include "FilesApi.h"

using namespace Tiny;



        Response<
            OpenAIFile
        >
        FilesApi::
        createFile(
            
            std::string file
            , 
            
            std::string purpose
            
        )
        {
            std::string url = basepath + "/files"; //


            // Headers  | 

            // Query    | 

            // Form     | file purpose 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("file",file);
            addFormParam("purpose",purpose);




            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            OpenAIFile obj(output_string);


            Response<OpenAIFile> response(obj, httpCode);
            return response;
        }

        Response<
            DeleteFileResponse
        >
        FilesApi::
        deleteFile(
            
            std::string fileId
            
        )
        {
            std::string url = basepath + "/files/{file_id}"; //fileId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_fileId("{");
                s_fileId.append("file_id");
                s_fileId.append("}");

                int pos = url.find(s_fileId);

                url.erase(pos, s_fileId.length());
                url.insert(pos, stringify(fileId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeleteFileResponse obj(output_string);


            Response<DeleteFileResponse> response(obj, httpCode);
            return response;
        }

        Response<
            std::string
        >
        FilesApi::
        downloadFile(
            
            std::string fileId
            
        )
        {
            std::string url = basepath + "/files/{file_id}/content"; //fileId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_fileId("{");
                s_fileId.append("file_id");
                s_fileId.append("}");

                int pos = url.find(s_fileId);

                url.erase(pos, s_fileId.length());
                url.insert(pos, stringify(fileId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }

        Response<
            ListFilesResponse
        >
        FilesApi::
        listFiles(
            
            std::string purpose
            , 
            
            int limit
            , 
            
            std::string order
            , 
            
            std::string after
            
        )
        {
            std::string url = basepath + "/files"; //


            // Headers  | 

            // Query    | purpose limit order after 
            addQueryParam("purpose",purpose);
            addQueryParam("limit",limit);
            addQueryParam("order",order);
            addQueryParam("after",after);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ListFilesResponse obj(output_string);


            Response<ListFilesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            OpenAIFile
        >
        FilesApi::
        retrieveFile(
            
            std::string fileId
            
        )
        {
            std::string url = basepath + "/files/{file_id}"; //fileId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_fileId("{");
                s_fileId.append("file_id");
                s_fileId.append("}");

                int pos = url.find(s_fileId);

                url.erase(pos, s_fileId.length());
                url.insert(pos, stringify(fileId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            OpenAIFile obj(output_string);


            Response<OpenAIFile> response(obj, httpCode);
            return response;
        }



