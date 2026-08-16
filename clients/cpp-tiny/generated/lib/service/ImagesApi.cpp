#include "ImagesApi.h"

using namespace Tiny;



        Response<
            ImagesResponse
        >
        ImagesApi::
        createImage(
            
            CreateImageRequest createImageRequest
            
        )
        {
            std::string url = basepath + "/images/generations"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createImageRequest



            payload = createImageRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ImagesResponse obj(output_string);


            Response<ImagesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ImagesResponse
        >
        ImagesApi::
        createImageEdit(
            
            std::string image
            , 
            
            std::string prompt
            , 
            
            std::string mask
            , 
            
            CreateImageEditRequest_model model
            , 
            
            int n
            , 
            
            std::string size
            , 
            
            std::string responseFormat
            , 
            
            std::string user
            
        )
        {
            std::string url = basepath + "/images/edits"; //


            // Headers  | 

            // Query    | 

            // Form     | image prompt mask model n size responseFormat user 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("image",image);
            addFormParam("prompt",prompt);
            addFormParam("mask",mask);
            addFormParam("model",model);
            addFormParam("n",n);
            addFormParam("size",size);
            addFormParam("response_format",responseFormat);
            addFormParam("user",user);




            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ImagesResponse obj(output_string);


            Response<ImagesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ImagesResponse
        >
        ImagesApi::
        createImageVariation(
            
            std::string image
            , 
            
            CreateImageEditRequest_model model
            , 
            
            int n
            , 
            
            std::string responseFormat
            , 
            
            std::string size
            , 
            
            std::string user
            
        )
        {
            std::string url = basepath + "/images/variations"; //


            // Headers  | 

            // Query    | 

            // Form     | image model n responseFormat size user 
            addHeader("Content-Type", "application/x-www-form-urlencoded");

            addFormParam("image",image);
            addFormParam("model",model);
            addFormParam("n",n);
            addFormParam("response_format",responseFormat);
            addFormParam("size",size);
            addFormParam("user",user);




            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ImagesResponse obj(output_string);


            Response<ImagesResponse> response(obj, httpCode);
            return response;
        }



