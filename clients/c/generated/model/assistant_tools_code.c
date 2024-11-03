#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistant_tools_code.h"


char* assistant_tools_code_type_ToString(openai_api_assistant_tools_code_TYPE_e type) {
    char* typeArray[] =  { "NULL", "code_interpreter" };
    return typeArray[type];
}

openai_api_assistant_tools_code_TYPE_e assistant_tools_code_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "code_interpreter" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

assistant_tools_code_t *assistant_tools_code_create(
    openai_api_assistant_tools_code_TYPE_e type
    ) {
    assistant_tools_code_t *assistant_tools_code_local_var = malloc(sizeof(assistant_tools_code_t));
    if (!assistant_tools_code_local_var) {
        return NULL;
    }
    assistant_tools_code_local_var->type = type;

    return assistant_tools_code_local_var;
}


void assistant_tools_code_free(assistant_tools_code_t *assistant_tools_code) {
    if(NULL == assistant_tools_code){
        return ;
    }
    listEntry_t *listEntry;
    free(assistant_tools_code);
}

cJSON *assistant_tools_code_convertToJSON(assistant_tools_code_t *assistant_tools_code) {
    cJSON *item = cJSON_CreateObject();

    // assistant_tools_code->type
    if (openai_api_assistant_tools_code_TYPE_NULL == assistant_tools_code->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typeassistant_tools_code_ToString(assistant_tools_code->type)) == NULL)
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

assistant_tools_code_t *assistant_tools_code_parseFromJSON(cJSON *assistant_tools_codeJSON){

    assistant_tools_code_t *assistant_tools_code_local_var = NULL;

    // assistant_tools_code->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(assistant_tools_codeJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_assistant_tools_code_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = assistant_tools_code_type_FromString(type->valuestring);


    assistant_tools_code_local_var = assistant_tools_code_create (
        typeVariable
        );

    return assistant_tools_code_local_var;
end:
    return NULL;

}
