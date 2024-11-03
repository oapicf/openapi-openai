#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "CompletionsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


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

    // create the path
    long sizeOfPath = strlen("/completions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/completions");




    // Body Param
    cJSON *localVarSingleItemJSON_create_completion_request = NULL;
    if (create_completion_request != NULL)
    {
        //string
        localVarSingleItemJSON_create_completion_request = create_completion_request_convertToJSON(create_completion_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_completion_request);
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
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cJSON *CompletionsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_completion_response_t *elementToReturn = create_completion_response_parseFromJSON(CompletionsAPIlocalVarJSON);
    cJSON_Delete(CompletionsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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

