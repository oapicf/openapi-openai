#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistant_tools_retrieval.h"


char* assistant_tools_retrieval_type_ToString(openai_api_assistant_tools_retrieval_TYPE_e type) {
    char* typeArray[] =  { "NULL", "retrieval" };
    return typeArray[type];
}

openai_api_assistant_tools_retrieval_TYPE_e assistant_tools_retrieval_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "retrieval" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

assistant_tools_retrieval_t *assistant_tools_retrieval_create(
    openai_api_assistant_tools_retrieval_TYPE_e type
    ) {
    assistant_tools_retrieval_t *assistant_tools_retrieval_local_var = malloc(sizeof(assistant_tools_retrieval_t));
    if (!assistant_tools_retrieval_local_var) {
        return NULL;
    }
    assistant_tools_retrieval_local_var->type = type;

    return assistant_tools_retrieval_local_var;
}


void assistant_tools_retrieval_free(assistant_tools_retrieval_t *assistant_tools_retrieval) {
    if(NULL == assistant_tools_retrieval){
        return ;
    }
    listEntry_t *listEntry;
    free(assistant_tools_retrieval);
}

cJSON *assistant_tools_retrieval_convertToJSON(assistant_tools_retrieval_t *assistant_tools_retrieval) {
    cJSON *item = cJSON_CreateObject();

    // assistant_tools_retrieval->type
    if (openai_api_assistant_tools_retrieval_TYPE_NULL == assistant_tools_retrieval->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typeassistant_tools_retrieval_ToString(assistant_tools_retrieval->type)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

assistant_tools_retrieval_t *assistant_tools_retrieval_parseFromJSON(cJSON *assistant_tools_retrievalJSON){

    assistant_tools_retrieval_t *assistant_tools_retrieval_local_var = NULL;

    // assistant_tools_retrieval->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(assistant_tools_retrievalJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_assistant_tools_retrieval_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = assistant_tools_retrieval_type_FromString(type->valuestring);


    assistant_tools_retrieval_local_var = assistant_tools_retrieval_create (
        typeVariable
        );

    return assistant_tools_retrieval_local_var;
end:
    return NULL;

}
