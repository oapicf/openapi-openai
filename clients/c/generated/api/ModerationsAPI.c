#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "ModerationsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Classifies if text is potentially harmful.
//
create_moderation_response_t*
ModerationsAPI_createModeration(apiClient_t *apiClient, create_moderation_request_t *create_moderation_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/moderations")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/moderations");




    // Body Param
    cJSON *localVarSingleItemJSON_create_moderation_request = NULL;
    if (create_moderation_request != NULL)
    {
        //string
        localVarSingleItemJSON_create_moderation_request = create_moderation_request_convertToJSON(create_moderation_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_moderation_request);
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
    cJSON *ModerationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    create_moderation_response_t *elementToReturn = create_moderation_response_parseFromJSON(ModerationsAPIlocalVarJSON);
    cJSON_Delete(ModerationsAPIlocalVarJSON);
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
    if (localVarSingleItemJSON_create_moderation_request) {
        cJSON_Delete(localVarSingleItemJSON_create_moderation_request);
        localVarSingleItemJSON_create_moderation_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

