#include "UsersApi.h"

using namespace Tiny;



        Response<
            UserDeleteResponse
        >
        UsersApi::
        deleteUser(
            
            std::string userId
            
        )
        {
            std::string url = basepath + "/organization/users/{user_id}"; //userId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_userId("{");
                s_userId.append("user_id");
                s_userId.append("}");

                int pos = url.find(s_userId);

                url.erase(pos, s_userId.length());
                url.insert(pos, stringify(userId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            UserDeleteResponse obj(output_string);


            Response<UserDeleteResponse> response(obj, httpCode);
            return response;
        }

        Response<
            UserListResponse
        >
        UsersApi::
        listUsers(
            
            int limit
            , 
            
            std::string after
            
        )
        {
            std::string url = basepath + "/organization/users"; //


            // Headers  | 

            // Query    | limit after 
            addQueryParam("limit",limit);
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




            UserListResponse obj(output_string);


            Response<UserListResponse> response(obj, httpCode);
            return response;
        }

        Response<
            User
        >
        UsersApi::
        modifyUser(
            
            std::string userId
            , 
            
            UserRoleUpdateRequest userRoleUpdateRequest
            
        )
        {
            std::string url = basepath + "/organization/users/{user_id}"; //userId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_userId("{");
                s_userId.append("user_id");
                s_userId.append("}");

                int pos = url.find(s_userId);

                url.erase(pos, s_userId.length());
                url.insert(pos, stringify(userId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | userRoleUpdateRequest



            payload = userRoleUpdateRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            User obj(output_string);


            Response<User> response(obj, httpCode);
            return response;
        }

        Response<
            User
        >
        UsersApi::
        retrieveUser(
            
            std::string userId
            
        )
        {
            std::string url = basepath + "/organization/users/{user_id}"; //userId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_userId("{");
                s_userId.append("user_id");
                s_userId.append("}");

                int pos = url.find(s_userId);

                url.erase(pos, s_userId.length());
                url.insert(pos, stringify(userId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            User obj(output_string);


            Response<User> response(obj, httpCode);
            return response;
        }



