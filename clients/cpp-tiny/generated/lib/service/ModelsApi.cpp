#include "ModelsApi.h"

using namespace Tiny;



        Response<
            DeleteModelResponse
        >
        ModelsApi::
        deleteModel(
            
            std::string model
            
        )
        {
            std::string url = basepath + "/models/{model}"; //model 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_model("{");
                s_model.append("model");
                s_model.append("}");

                int pos = url.find(s_model);

                url.erase(pos, s_model.length());
                url.insert(pos, stringify(model));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeleteModelResponse obj(output_string);


            Response<DeleteModelResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ListModelsResponse
        >
        ModelsApi::
        listModels(
        )
        {
            std::string url = basepath + "/models"; //


            // Headers  | 

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ListModelsResponse obj(output_string);


            Response<ListModelsResponse> response(obj, httpCode);
            return response;
        }

        Response<
            Model
        >
        ModelsApi::
        retrieveModel(
            
            std::string model
            
        )
        {
            std::string url = basepath + "/models/{model}"; //model 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_model("{");
                s_model.append("model");
                s_model.append("}");

                int pos = url.find(s_model);

                url.erase(pos, s_model.length());
                url.insert(pos, stringify(model));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Model obj(output_string);


            Response<Model> response(obj, httpCode);
            return response;
        }



