#include "DefaultApi.h"

using namespace Tiny;



        Response<
            AdminApiKey
        >
        DefaultApi::
        adminApiKeysCreate(
            
            Admin_api_keys_create_request adminApiKeysCreateRequest
            
        )
        {
            std::string url = basepath + "/organization/admin_api_keys"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | adminApiKeysCreateRequest



            payload = adminApiKeysCreateRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdminApiKey obj(output_string);


            Response<AdminApiKey> response(obj, httpCode);
            return response;
        }

        Response<
            Admin_api_keys_delete_200_response
        >
        DefaultApi::
        adminApiKeysDelete(
            
            std::string keyId
            
        )
        {
            std::string url = basepath + "/organization/admin_api_keys/{key_id}"; //keyId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_keyId("{");
                s_keyId.append("key_id");
                s_keyId.append("}");

                int pos = url.find(s_keyId);

                url.erase(pos, s_keyId.length());
                url.insert(pos, stringify(keyId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Admin_api_keys_delete_200_response obj(output_string);


            Response<Admin_api_keys_delete_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            AdminApiKey
        >
        DefaultApi::
        adminApiKeysGet(
            
            std::string keyId
            
        )
        {
            std::string url = basepath + "/organization/admin_api_keys/{key_id}"; //keyId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_keyId("{");
                s_keyId.append("key_id");
                s_keyId.append("}");

                int pos = url.find(s_keyId);

                url.erase(pos, s_keyId.length());
                url.insert(pos, stringify(keyId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            AdminApiKey obj(output_string);


            Response<AdminApiKey> response(obj, httpCode);
            return response;
        }

        Response<
            ApiKeyList
        >
        DefaultApi::
        adminApiKeysList(
            
            std::string after
            , 
            
            std::string order
            , 
            
            int limit
            
        )
        {
            std::string url = basepath + "/organization/admin_api_keys"; //


            // Headers  | 

            // Query    | after order limit 
            addQueryParam("after",after);
            addQueryParam("order",order);
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




            ApiKeyList obj(output_string);


            Response<ApiKeyList> response(obj, httpCode);
            return response;
        }



