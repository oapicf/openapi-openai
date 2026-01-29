#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "CompletionsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


// Creates a completion for the provided prompt and parameters.
//
create_completion_response_t*
CompletionsAPI_createCompletion(apiClient_t *apiClient, create_completion_request_t *create_completion_request)
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
    char *localVarPath = strdup("/completions");





    // Body Param
    cJSON *localVarSingleItemJSON_create_completion_request = NULL;
    if (create_completion_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_create_completion_request = create_completion_request_convertToJSON(create_completion_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_completion_request);
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
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    create_completion_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *CompletionsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = create_completion_response_parseFromJSON(CompletionsAPIlocalVarJSON);
        cJSON_Delete(CompletionsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_create_completion_request) {
        cJSON_Delete(localVarSingleItemJSON_create_completion_request);
        localVarSingleItemJSON_create_completion_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

