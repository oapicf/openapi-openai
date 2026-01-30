#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "RealtimeAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


// Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
//
realtime_session_create_response_t*
RealtimeAPI_createRealtimeSession(apiClient_t *apiClient, realtime_session_create_request_t *realtime_session_create_request)
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
    char *localVarPath = strdup("/realtime/sessions");





    // Body Param
    cJSON *localVarSingleItemJSON_realtime_session_create_request = NULL;
    if (realtime_session_create_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_realtime_session_create_request = realtime_session_create_request_convertToJSON(realtime_session_create_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_realtime_session_create_request);
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
    //    printf("%s\n","Session created successfully.");
    //}
    //nonprimitive not container
    realtime_session_create_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *RealtimeAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = realtime_session_create_response_parseFromJSON(RealtimeAPIlocalVarJSON);
        cJSON_Delete(RealtimeAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_realtime_session_create_request) {
        cJSON_Delete(localVarSingleItemJSON_realtime_session_create_request);
        localVarSingleItemJSON_realtime_session_create_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

