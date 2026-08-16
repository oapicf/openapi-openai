#include "ProjectsApi.h"

using namespace Tiny;



        Response<
            Project
        >
        ProjectsApi::
        archiveProject(
            
            std::string projectId
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}/archive"; //projectId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Project obj(output_string);


            Response<Project> response(obj, httpCode);
            return response;
        }

        Response<
            Project
        >
        ProjectsApi::
        createProject(
            
            ProjectCreateRequest projectCreateRequest
            
        )
        {
            std::string url = basepath + "/organization/projects"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | projectCreateRequest



            payload = projectCreateRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Project obj(output_string);


            Response<Project> response(obj, httpCode);
            return response;
        }

        Response<
            ProjectServiceAccountCreateResponse
        >
        ProjectsApi::
        createProjectServiceAccount(
            
            std::string projectId
            , 
            
            ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}/service_accounts"; //projectId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | projectServiceAccountCreateRequest



            payload = projectServiceAccountCreateRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProjectServiceAccountCreateResponse obj(output_string);


            Response<ProjectServiceAccountCreateResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ProjectUser
        >
        ProjectsApi::
        createProjectUser(
            
            std::string projectId
            , 
            
            ProjectUserCreateRequest projectUserCreateRequest
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}/users"; //projectId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | projectUserCreateRequest



            payload = projectUserCreateRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProjectUser obj(output_string);


            Response<ProjectUser> response(obj, httpCode);
            return response;
        }

        Response<
            ProjectApiKeyDeleteResponse
        >
        ProjectsApi::
        deleteProjectApiKey(
            
            std::string projectId
            , 
            
            std::string keyId
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}/api_keys/{key_id}"; //projectId keyId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));
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




            ProjectApiKeyDeleteResponse obj(output_string);


            Response<ProjectApiKeyDeleteResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ProjectServiceAccountDeleteResponse
        >
        ProjectsApi::
        deleteProjectServiceAccount(
            
            std::string projectId
            , 
            
            std::string serviceAccountId
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}/service_accounts/{service_account_id}"; //projectId serviceAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));
                std::string s_serviceAccountId("{");
                s_serviceAccountId.append("service_account_id");
                s_serviceAccountId.append("}");

                int pos = url.find(s_serviceAccountId);

                url.erase(pos, s_serviceAccountId.length());
                url.insert(pos, stringify(serviceAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProjectServiceAccountDeleteResponse obj(output_string);


            Response<ProjectServiceAccountDeleteResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ProjectUserDeleteResponse
        >
        ProjectsApi::
        deleteProjectUser(
            
            std::string projectId
            , 
            
            std::string userId
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}/users/{user_id}"; //projectId userId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));
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




            ProjectUserDeleteResponse obj(output_string);


            Response<ProjectUserDeleteResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ProjectApiKeyListResponse
        >
        ProjectsApi::
        listProjectApiKeys(
            
            std::string projectId
            , 
            
            int limit
            , 
            
            std::string after
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}/api_keys"; //projectId 


            // Headers  | 

            // Query    | limit after 
            addQueryParam("limit",limit);
            addQueryParam("after",after);

            // Form     | 



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProjectApiKeyListResponse obj(output_string);


            Response<ProjectApiKeyListResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ProjectRateLimitListResponse
        >
        ProjectsApi::
        listProjectRateLimits(
            
            std::string projectId
            , 
            
            int limit
            , 
            
            std::string after
            , 
            
            std::string before
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}/rate_limits"; //projectId 


            // Headers  | 

            // Query    | limit after before 
            addQueryParam("limit",limit);
            addQueryParam("after",after);
            addQueryParam("before",before);

            // Form     | 



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProjectRateLimitListResponse obj(output_string);


            Response<ProjectRateLimitListResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ProjectServiceAccountListResponse
        >
        ProjectsApi::
        listProjectServiceAccounts(
            
            std::string projectId
            , 
            
            int limit
            , 
            
            std::string after
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}/service_accounts"; //projectId 


            // Headers  | 

            // Query    | limit after 
            addQueryParam("limit",limit);
            addQueryParam("after",after);

            // Form     | 



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProjectServiceAccountListResponse obj(output_string);


            Response<ProjectServiceAccountListResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ProjectUserListResponse
        >
        ProjectsApi::
        listProjectUsers(
            
            std::string projectId
            , 
            
            int limit
            , 
            
            std::string after
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}/users"; //projectId 


            // Headers  | 

            // Query    | limit after 
            addQueryParam("limit",limit);
            addQueryParam("after",after);

            // Form     | 



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProjectUserListResponse obj(output_string);


            Response<ProjectUserListResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ProjectListResponse
        >
        ProjectsApi::
        listProjects(
            
            int limit
            , 
            
            std::string after
            , 
            
            bool includeArchived
            
        )
        {
            std::string url = basepath + "/organization/projects"; //


            // Headers  | 

            // Query    | limit after includeArchived 
            addQueryParam("limit",limit);
            addQueryParam("after",after);
            addQueryParam("include_archived",includeArchived);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProjectListResponse obj(output_string);


            Response<ProjectListResponse> response(obj, httpCode);
            return response;
        }

        Response<
            Project
        >
        ProjectsApi::
        modifyProject(
            
            std::string projectId
            , 
            
            ProjectUpdateRequest projectUpdateRequest
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}"; //projectId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | projectUpdateRequest



            payload = projectUpdateRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Project obj(output_string);


            Response<Project> response(obj, httpCode);
            return response;
        }

        Response<
            ProjectUser
        >
        ProjectsApi::
        modifyProjectUser(
            
            std::string projectId
            , 
            
            std::string userId
            , 
            
            ProjectUserUpdateRequest projectUserUpdateRequest
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}/users/{user_id}"; //projectId userId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));
                std::string s_userId("{");
                s_userId.append("user_id");
                s_userId.append("}");

                int pos = url.find(s_userId);

                url.erase(pos, s_userId.length());
                url.insert(pos, stringify(userId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | projectUserUpdateRequest



            payload = projectUserUpdateRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProjectUser obj(output_string);


            Response<ProjectUser> response(obj, httpCode);
            return response;
        }

        Response<
            Project
        >
        ProjectsApi::
        retrieveProject(
            
            std::string projectId
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}"; //projectId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Project obj(output_string);


            Response<Project> response(obj, httpCode);
            return response;
        }

        Response<
            ProjectApiKey
        >
        ProjectsApi::
        retrieveProjectApiKey(
            
            std::string projectId
            , 
            
            std::string keyId
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}/api_keys/{key_id}"; //projectId keyId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));
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




            ProjectApiKey obj(output_string);


            Response<ProjectApiKey> response(obj, httpCode);
            return response;
        }

        Response<
            ProjectServiceAccount
        >
        ProjectsApi::
        retrieveProjectServiceAccount(
            
            std::string projectId
            , 
            
            std::string serviceAccountId
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}/service_accounts/{service_account_id}"; //projectId serviceAccountId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));
                std::string s_serviceAccountId("{");
                s_serviceAccountId.append("service_account_id");
                s_serviceAccountId.append("}");

                int pos = url.find(s_serviceAccountId);

                url.erase(pos, s_serviceAccountId.length());
                url.insert(pos, stringify(serviceAccountId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProjectServiceAccount obj(output_string);


            Response<ProjectServiceAccount> response(obj, httpCode);
            return response;
        }

        Response<
            ProjectUser
        >
        ProjectsApi::
        retrieveProjectUser(
            
            std::string projectId
            , 
            
            std::string userId
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}/users/{user_id}"; //projectId userId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));
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




            ProjectUser obj(output_string);


            Response<ProjectUser> response(obj, httpCode);
            return response;
        }

        Response<
            ProjectRateLimit
        >
        ProjectsApi::
        updateProjectRateLimits(
            
            std::string projectId
            , 
            
            std::string rateLimitId
            , 
            
            ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest
            
        )
        {
            std::string url = basepath + "/organization/projects/{project_id}/rate_limits/{rate_limit_id}"; //projectId rateLimitId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_projectId("{");
                s_projectId.append("project_id");
                s_projectId.append("}");

                int pos = url.find(s_projectId);

                url.erase(pos, s_projectId.length());
                url.insert(pos, stringify(projectId));
                std::string s_rateLimitId("{");
                s_rateLimitId.append("rate_limit_id");
                s_rateLimitId.append("}");

                int pos = url.find(s_rateLimitId);

                url.erase(pos, s_rateLimitId.length());
                url.insert(pos, stringify(rateLimitId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | projectRateLimitUpdateRequest



            payload = projectRateLimitUpdateRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ProjectRateLimit obj(output_string);


            Response<ProjectRateLimit> response(obj, httpCode);
            return response;
        }



