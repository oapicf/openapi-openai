#include "InvitesApi.h"

using namespace Tiny;



        Response<
            InviteDeleteResponse
        >
        InvitesApi::
        deleteInvite(
            
            std::string inviteId
            
        )
        {
            std::string url = basepath + "/organization/invites/{invite_id}"; //inviteId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_inviteId("{");
                s_inviteId.append("invite_id");
                s_inviteId.append("}");

                int pos = url.find(s_inviteId);

                url.erase(pos, s_inviteId.length());
                url.insert(pos, stringify(inviteId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            InviteDeleteResponse obj(output_string);


            Response<InviteDeleteResponse> response(obj, httpCode);
            return response;
        }

        Response<
            Invite
        >
        InvitesApi::
        inviteUser(
            
            InviteRequest inviteRequest
            
        )
        {
            std::string url = basepath + "/organization/invites"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | inviteRequest



            payload = inviteRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Invite obj(output_string);


            Response<Invite> response(obj, httpCode);
            return response;
        }

        Response<
            InviteListResponse
        >
        InvitesApi::
        listInvites(
            
            int limit
            , 
            
            std::string after
            
        )
        {
            std::string url = basepath + "/organization/invites"; //


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




            InviteListResponse obj(output_string);


            Response<InviteListResponse> response(obj, httpCode);
            return response;
        }

        Response<
            Invite
        >
        InvitesApi::
        retrieveInvite(
            
            std::string inviteId
            
        )
        {
            std::string url = basepath + "/organization/invites/{invite_id}"; //inviteId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_inviteId("{");
                s_inviteId.append("invite_id");
                s_inviteId.append("}");

                int pos = url.find(s_inviteId);

                url.erase(pos, s_inviteId.length());
                url.insert(pos, stringify(inviteId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Invite obj(output_string);


            Response<Invite> response(obj, httpCode);
            return response;
        }



