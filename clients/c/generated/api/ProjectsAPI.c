#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "ProjectsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


// Archives a project in the organization. Archived projects cannot be used or updated.
//
project_t*
ProjectsAPI_archiveProject(apiClient_t *apiClient, char *project_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}/archive");

    if(!project_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project archived successfully.");
    //}
    //nonprimitive not container
    project_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_project_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
//
project_t*
ProjectsAPI_createProject(apiClient_t *apiClient, project_create_request_t *project_create_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects");





    // Body Param
    cJSON *localVarSingleItemJSON_project_create_request = NULL;
    if (project_create_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_project_create_request = project_create_request_convertToJSON(project_create_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_project_create_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project created successfully.");
    //}
    //nonprimitive not container
    project_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_project_create_request) {
        cJSON_Delete(localVarSingleItemJSON_project_create_request);
        localVarSingleItemJSON_project_create_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Creates a new service account in the project. This also returns an unredacted API key for the service account.
//
project_service_account_create_response_t*
ProjectsAPI_createProjectServiceAccount(apiClient_t *apiClient, char *project_id, project_service_account_create_request_t *project_service_account_create_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}/service_accounts");

    if(!project_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);



    // Body Param
    cJSON *localVarSingleItemJSON_project_service_account_create_request = NULL;
    if (project_service_account_create_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_project_service_account_create_request = project_service_account_create_request_convertToJSON(project_service_account_create_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_project_service_account_create_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project service account created successfully.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Error response when project is archived.");
    //}
    //nonprimitive not container
    project_service_account_create_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_service_account_create_response_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_project_id);
    if (localVarSingleItemJSON_project_service_account_create_request) {
        cJSON_Delete(localVarSingleItemJSON_project_service_account_create_request);
        localVarSingleItemJSON_project_service_account_create_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Adds a user to the project. Users must already be members of the organization to be added to a project.
//
project_user_t*
ProjectsAPI_createProjectUser(apiClient_t *apiClient, char *project_id, project_user_create_request_t *project_user_create_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}/users");

    if(!project_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);



    // Body Param
    cJSON *localVarSingleItemJSON_project_user_create_request = NULL;
    if (project_user_create_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_project_user_create_request = project_user_create_request_convertToJSON(project_user_create_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_project_user_create_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","User added to project successfully.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Error response for various conditions.");
    //}
    //nonprimitive not container
    project_user_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_user_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_project_id);
    if (localVarSingleItemJSON_project_user_create_request) {
        cJSON_Delete(localVarSingleItemJSON_project_user_create_request);
        localVarSingleItemJSON_project_user_create_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Deletes an API key from the project.
//
project_api_key_delete_response_t*
ProjectsAPI_deleteProjectApiKey(apiClient_t *apiClient, char *project_id, char *key_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}/api_keys/{key_id}");

    if(!project_id)
        goto end;
    if(!key_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + strlen(key_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);

    // Path Params
    long sizeOfPathParams_key_id = strlen(project_id)+3 + strlen(key_id)+3 + sizeof("{ key_id }") - 1;
    if(key_id == NULL) {
        goto end;
    }
    char* localVarToReplace_key_id = malloc(sizeOfPathParams_key_id);
    sprintf(localVarToReplace_key_id, "{%s}", "key_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_key_id, key_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project API key deleted successfully.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Error response for various conditions.");
    //}
    //nonprimitive not container
    project_api_key_delete_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_api_key_delete_response_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_project_id);
    free(localVarToReplace_key_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Deletes a service account from the project.
//
project_service_account_delete_response_t*
ProjectsAPI_deleteProjectServiceAccount(apiClient_t *apiClient, char *project_id, char *service_account_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}/service_accounts/{service_account_id}");

    if(!project_id)
        goto end;
    if(!service_account_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + strlen(service_account_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);

    // Path Params
    long sizeOfPathParams_service_account_id = strlen(project_id)+3 + strlen(service_account_id)+3 + sizeof("{ service_account_id }") - 1;
    if(service_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_service_account_id = malloc(sizeOfPathParams_service_account_id);
    sprintf(localVarToReplace_service_account_id, "{%s}", "service_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_service_account_id, service_account_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project service account deleted successfully.");
    //}
    //nonprimitive not container
    project_service_account_delete_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_service_account_delete_response_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_project_id);
    free(localVarToReplace_service_account_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Deletes a user from the project.
//
project_user_delete_response_t*
ProjectsAPI_deleteProjectUser(apiClient_t *apiClient, char *project_id, char *user_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}/users/{user_id}");

    if(!project_id)
        goto end;
    if(!user_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + strlen(user_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);

    // Path Params
    long sizeOfPathParams_user_id = strlen(project_id)+3 + strlen(user_id)+3 + sizeof("{ user_id }") - 1;
    if(user_id == NULL) {
        goto end;
    }
    char* localVarToReplace_user_id = malloc(sizeOfPathParams_user_id);
    sprintf(localVarToReplace_user_id, "{%s}", "user_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_user_id, user_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project user deleted successfully.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Error response for various conditions.");
    //}
    //nonprimitive not container
    project_user_delete_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_user_delete_response_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_project_id);
    free(localVarToReplace_user_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns a list of API keys in the project.
//
project_api_key_list_response_t*
ProjectsAPI_listProjectApiKeys(apiClient_t *apiClient, char *project_id, int *limit, char *after)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}/api_keys");

    if(!project_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);



    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_after = NULL;
    char * valueQuery_after = NULL;
    keyValuePair_t *keyPairQuery_after = 0;
    if (after)
    {
        keyQuery_after = strdup("after");
        valueQuery_after = strdup((after));
        keyPairQuery_after = keyValuePair_create(keyQuery_after, valueQuery_after);
        list_addElement(localVarQueryParameters,keyPairQuery_after);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project API keys listed successfully.");
    //}
    //nonprimitive not container
    project_api_key_list_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_api_key_list_response_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_project_id);
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_after){
        free(keyQuery_after);
        keyQuery_after = NULL;
    }
    if(valueQuery_after){
        free(valueQuery_after);
        valueQuery_after = NULL;
    }
    if(keyPairQuery_after){
        keyValuePair_free(keyPairQuery_after);
        keyPairQuery_after = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns the rate limits per model for a project.
//
project_rate_limit_list_response_t*
ProjectsAPI_listProjectRateLimits(apiClient_t *apiClient, char *project_id, int *limit, char *after, char *before)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}/rate_limits");

    if(!project_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);



    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_after = NULL;
    char * valueQuery_after = NULL;
    keyValuePair_t *keyPairQuery_after = 0;
    if (after)
    {
        keyQuery_after = strdup("after");
        valueQuery_after = strdup((after));
        keyPairQuery_after = keyValuePair_create(keyQuery_after, valueQuery_after);
        list_addElement(localVarQueryParameters,keyPairQuery_after);
    }

    // query parameters
    char *keyQuery_before = NULL;
    char * valueQuery_before = NULL;
    keyValuePair_t *keyPairQuery_before = 0;
    if (before)
    {
        keyQuery_before = strdup("before");
        valueQuery_before = strdup((before));
        keyPairQuery_before = keyValuePair_create(keyQuery_before, valueQuery_before);
        list_addElement(localVarQueryParameters,keyPairQuery_before);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project rate limits listed successfully.");
    //}
    //nonprimitive not container
    project_rate_limit_list_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_rate_limit_list_response_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_project_id);
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_after){
        free(keyQuery_after);
        keyQuery_after = NULL;
    }
    if(valueQuery_after){
        free(valueQuery_after);
        valueQuery_after = NULL;
    }
    if(keyPairQuery_after){
        keyValuePair_free(keyPairQuery_after);
        keyPairQuery_after = NULL;
    }
    if(keyQuery_before){
        free(keyQuery_before);
        keyQuery_before = NULL;
    }
    if(valueQuery_before){
        free(valueQuery_before);
        valueQuery_before = NULL;
    }
    if(keyPairQuery_before){
        keyValuePair_free(keyPairQuery_before);
        keyPairQuery_before = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns a list of service accounts in the project.
//
project_service_account_list_response_t*
ProjectsAPI_listProjectServiceAccounts(apiClient_t *apiClient, char *project_id, int *limit, char *after)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}/service_accounts");

    if(!project_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);



    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_after = NULL;
    char * valueQuery_after = NULL;
    keyValuePair_t *keyPairQuery_after = 0;
    if (after)
    {
        keyQuery_after = strdup("after");
        valueQuery_after = strdup((after));
        keyPairQuery_after = keyValuePair_create(keyQuery_after, valueQuery_after);
        list_addElement(localVarQueryParameters,keyPairQuery_after);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project service accounts listed successfully.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Error response when project is archived.");
    //}
    //nonprimitive not container
    project_service_account_list_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_service_account_list_response_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_project_id);
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_after){
        free(keyQuery_after);
        keyQuery_after = NULL;
    }
    if(valueQuery_after){
        free(valueQuery_after);
        valueQuery_after = NULL;
    }
    if(keyPairQuery_after){
        keyValuePair_free(keyPairQuery_after);
        keyPairQuery_after = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns a list of users in the project.
//
project_user_list_response_t*
ProjectsAPI_listProjectUsers(apiClient_t *apiClient, char *project_id, int *limit, char *after)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}/users");

    if(!project_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);



    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_after = NULL;
    char * valueQuery_after = NULL;
    keyValuePair_t *keyPairQuery_after = 0;
    if (after)
    {
        keyQuery_after = strdup("after");
        valueQuery_after = strdup((after));
        keyPairQuery_after = keyValuePair_create(keyQuery_after, valueQuery_after);
        list_addElement(localVarQueryParameters,keyPairQuery_after);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project users listed successfully.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Error response when project is archived.");
    //}
    //nonprimitive not container
    project_user_list_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_user_list_response_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_project_id);
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_after){
        free(keyQuery_after);
        keyQuery_after = NULL;
    }
    if(valueQuery_after){
        free(valueQuery_after);
        valueQuery_after = NULL;
    }
    if(keyPairQuery_after){
        keyValuePair_free(keyPairQuery_after);
        keyPairQuery_after = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns a list of projects.
//
project_list_response_t*
ProjectsAPI_listProjects(apiClient_t *apiClient, int *limit, char *after, int *include_archived)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects");





    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_after = NULL;
    char * valueQuery_after = NULL;
    keyValuePair_t *keyPairQuery_after = 0;
    if (after)
    {
        keyQuery_after = strdup("after");
        valueQuery_after = strdup((after));
        keyPairQuery_after = keyValuePair_create(keyQuery_after, valueQuery_after);
        list_addElement(localVarQueryParameters,keyPairQuery_after);
    }

    // query parameters
    char *keyQuery_include_archived = NULL;
    char * valueQuery_include_archived = NULL;
    keyValuePair_t *keyPairQuery_include_archived = 0;
    if (include_archived)
    {
        keyQuery_include_archived = strdup("include_archived");
        valueQuery_include_archived = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_include_archived, MAX_NUMBER_LENGTH, "%d", *include_archived);
        keyPairQuery_include_archived = keyValuePair_create(keyQuery_include_archived, valueQuery_include_archived);
        list_addElement(localVarQueryParameters,keyPairQuery_include_archived);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Projects listed successfully.");
    //}
    //nonprimitive not container
    project_list_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_list_response_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_after){
        free(keyQuery_after);
        keyQuery_after = NULL;
    }
    if(valueQuery_after){
        free(valueQuery_after);
        valueQuery_after = NULL;
    }
    if(keyPairQuery_after){
        keyValuePair_free(keyPairQuery_after);
        keyPairQuery_after = NULL;
    }
    if(keyQuery_include_archived){
        free(keyQuery_include_archived);
        keyQuery_include_archived = NULL;
    }
    if(valueQuery_include_archived){
        free(valueQuery_include_archived);
        valueQuery_include_archived = NULL;
    }
    if(keyPairQuery_include_archived){
        keyValuePair_free(keyPairQuery_include_archived);
        keyPairQuery_include_archived = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Modifies a project in the organization.
//
project_t*
ProjectsAPI_modifyProject(apiClient_t *apiClient, char *project_id, project_update_request_t *project_update_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}");

    if(!project_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);



    // Body Param
    cJSON *localVarSingleItemJSON_project_update_request = NULL;
    if (project_update_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_project_update_request = project_update_request_convertToJSON(project_update_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_project_update_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project updated successfully.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Error response when updating the default project.");
    //}
    //nonprimitive not container
    project_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_project_id);
    if (localVarSingleItemJSON_project_update_request) {
        cJSON_Delete(localVarSingleItemJSON_project_update_request);
        localVarSingleItemJSON_project_update_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Modifies a user's role in the project.
//
project_user_t*
ProjectsAPI_modifyProjectUser(apiClient_t *apiClient, char *project_id, char *user_id, project_user_update_request_t *project_user_update_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}/users/{user_id}");

    if(!project_id)
        goto end;
    if(!user_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + strlen(user_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);

    // Path Params
    long sizeOfPathParams_user_id = strlen(project_id)+3 + strlen(user_id)+3 + sizeof("{ user_id }") - 1;
    if(user_id == NULL) {
        goto end;
    }
    char* localVarToReplace_user_id = malloc(sizeOfPathParams_user_id);
    sprintf(localVarToReplace_user_id, "{%s}", "user_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_user_id, user_id);



    // Body Param
    cJSON *localVarSingleItemJSON_project_user_update_request = NULL;
    if (project_user_update_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_project_user_update_request = project_user_update_request_convertToJSON(project_user_update_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_project_user_update_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project user&#39;s role updated successfully.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Error response for various conditions.");
    //}
    //nonprimitive not container
    project_user_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_user_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_project_id);
    free(localVarToReplace_user_id);
    if (localVarSingleItemJSON_project_user_update_request) {
        cJSON_Delete(localVarSingleItemJSON_project_user_update_request);
        localVarSingleItemJSON_project_user_update_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieves a project.
//
project_t*
ProjectsAPI_retrieveProject(apiClient_t *apiClient, char *project_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}");

    if(!project_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project retrieved successfully.");
    //}
    //nonprimitive not container
    project_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_project_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieves an API key in the project.
//
project_api_key_t*
ProjectsAPI_retrieveProjectApiKey(apiClient_t *apiClient, char *project_id, char *key_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}/api_keys/{key_id}");

    if(!project_id)
        goto end;
    if(!key_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + strlen(key_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);

    // Path Params
    long sizeOfPathParams_key_id = strlen(project_id)+3 + strlen(key_id)+3 + sizeof("{ key_id }") - 1;
    if(key_id == NULL) {
        goto end;
    }
    char* localVarToReplace_key_id = malloc(sizeOfPathParams_key_id);
    sprintf(localVarToReplace_key_id, "{%s}", "key_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_key_id, key_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project API key retrieved successfully.");
    //}
    //nonprimitive not container
    project_api_key_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_api_key_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_project_id);
    free(localVarToReplace_key_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieves a service account in the project.
//
project_service_account_t*
ProjectsAPI_retrieveProjectServiceAccount(apiClient_t *apiClient, char *project_id, char *service_account_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}/service_accounts/{service_account_id}");

    if(!project_id)
        goto end;
    if(!service_account_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + strlen(service_account_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);

    // Path Params
    long sizeOfPathParams_service_account_id = strlen(project_id)+3 + strlen(service_account_id)+3 + sizeof("{ service_account_id }") - 1;
    if(service_account_id == NULL) {
        goto end;
    }
    char* localVarToReplace_service_account_id = malloc(sizeOfPathParams_service_account_id);
    sprintf(localVarToReplace_service_account_id, "{%s}", "service_account_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_service_account_id, service_account_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project service account retrieved successfully.");
    //}
    //nonprimitive not container
    project_service_account_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_service_account_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_project_id);
    free(localVarToReplace_service_account_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieves a user in the project.
//
project_user_t*
ProjectsAPI_retrieveProjectUser(apiClient_t *apiClient, char *project_id, char *user_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}/users/{user_id}");

    if(!project_id)
        goto end;
    if(!user_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + strlen(user_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);

    // Path Params
    long sizeOfPathParams_user_id = strlen(project_id)+3 + strlen(user_id)+3 + sizeof("{ user_id }") - 1;
    if(user_id == NULL) {
        goto end;
    }
    char* localVarToReplace_user_id = malloc(sizeOfPathParams_user_id);
    sprintf(localVarToReplace_user_id, "{%s}", "user_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_user_id, user_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project user retrieved successfully.");
    //}
    //nonprimitive not container
    project_user_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_user_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_project_id);
    free(localVarToReplace_user_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Updates a project rate limit.
//
project_rate_limit_t*
ProjectsAPI_updateProjectRateLimits(apiClient_t *apiClient, char *project_id, char *rate_limit_id, project_rate_limit_update_request_t *project_rate_limit_update_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/projects/{project_id}/rate_limits/{rate_limit_id}");

    if(!project_id)
        goto end;
    if(!rate_limit_id)
        goto end;


    // Path Params
    long sizeOfPathParams_project_id = strlen(project_id)+3 + strlen(rate_limit_id)+3 + sizeof("{ project_id }") - 1;
    if(project_id == NULL) {
        goto end;
    }
    char* localVarToReplace_project_id = malloc(sizeOfPathParams_project_id);
    sprintf(localVarToReplace_project_id, "{%s}", "project_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_project_id, project_id);

    // Path Params
    long sizeOfPathParams_rate_limit_id = strlen(project_id)+3 + strlen(rate_limit_id)+3 + sizeof("{ rate_limit_id }") - 1;
    if(rate_limit_id == NULL) {
        goto end;
    }
    char* localVarToReplace_rate_limit_id = malloc(sizeOfPathParams_rate_limit_id);
    sprintf(localVarToReplace_rate_limit_id, "{%s}", "rate_limit_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_rate_limit_id, rate_limit_id);



    // Body Param
    cJSON *localVarSingleItemJSON_project_rate_limit_update_request = NULL;
    if (project_rate_limit_update_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_project_rate_limit_update_request = project_rate_limit_update_request_convertToJSON(project_rate_limit_update_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_project_rate_limit_update_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Project rate limit updated successfully.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Error response for various conditions.");
    //}
    //nonprimitive not container
    project_rate_limit_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProjectsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = project_rate_limit_parseFromJSON(ProjectsAPIlocalVarJSON);
        cJSON_Delete(ProjectsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_project_id);
    free(localVarToReplace_rate_limit_id);
    if (localVarSingleItemJSON_project_rate_limit_update_request) {
        cJSON_Delete(localVarSingleItemJSON_project_rate_limit_update_request);
        localVarSingleItemJSON_project_rate_limit_update_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

