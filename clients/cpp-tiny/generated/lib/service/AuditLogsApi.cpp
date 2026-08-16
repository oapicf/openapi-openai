#include "AuditLogsApi.h"

using namespace Tiny;



        Response<
            ListAuditLogsResponse
        >
        AuditLogsApi::
        listAuditLogs(
            
            List_audit_logs_effective_at_parameter effectiveAt
            , 
            std::list<std::string> projectIdsLeft_Square_BracketRight_Square_Bracket
            
            , 
            std::list<AuditLogEventType> eventTypesLeft_Square_BracketRight_Square_Bracket
            
            , 
            std::list<std::string> actorIdsLeft_Square_BracketRight_Square_Bracket
            
            , 
            std::list<std::string> actorEmailsLeft_Square_BracketRight_Square_Bracket
            
            , 
            std::list<std::string> resourceIdsLeft_Square_BracketRight_Square_Bracket
            
            , 
            
            int limit
            , 
            
            std::string after
            , 
            
            std::string before
            
        )
        {
            std::string url = basepath + "/organization/audit_logs"; //


            // Headers  | 

            // Query    | effectiveAt projectIdsLeft_Square_BracketRight_Square_Bracket eventTypesLeft_Square_BracketRight_Square_Bracket actorIdsLeft_Square_BracketRight_Square_Bracket actorEmailsLeft_Square_BracketRight_Square_Bracket resourceIdsLeft_Square_BracketRight_Square_Bracket limit after before 
            addQueryParam("effective_at",effectiveAt);
            for (auto &x : projectIdsLeft_Square_BracketRight_Square_Bracket){
                addQueryParam("project_ids[]", std::string(x));
            }
            for (auto &x : eventTypesLeft_Square_BracketRight_Square_Bracket){
                addQueryParam("event_types[]", std::string(x));
            }
            for (auto &x : actorIdsLeft_Square_BracketRight_Square_Bracket){
                addQueryParam("actor_ids[]", std::string(x));
            }
            for (auto &x : actorEmailsLeft_Square_BracketRight_Square_Bracket){
                addQueryParam("actor_emails[]", std::string(x));
            }
            for (auto &x : resourceIdsLeft_Square_BracketRight_Square_Bracket){
                addQueryParam("resource_ids[]", std::string(x));
            }
            addQueryParam("limit",limit);
            addQueryParam("after",after);
            addQueryParam("before",before);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ListAuditLogsResponse obj(output_string);


            Response<ListAuditLogsResponse> response(obj, httpCode);
            return response;
        }



