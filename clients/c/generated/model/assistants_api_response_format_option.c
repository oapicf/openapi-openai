#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistants_api_response_format_option.h"


char* assistants_api_response_format_option_type_ToString(openai_api_assistants_api_response_format_option_TYPE_e type) {
    char* typeArray[] =  { "NULL", "text", "json_object", "json_schema" };
    return typeArray[type];
}

openai_api_assistants_api_response_format_option_TYPE_e assistants_api_response_format_option_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "text", "json_object", "json_schema" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static assistants_api_response_format_option_t *assistants_api_response_format_option_create_internal(
    openai_api_assistants_api_response_format_option_TYPE_e type,
    response_format_json_schema_json_schema_t *json_schema
    ) {
    assistants_api_response_format_option_t *assistants_api_response_format_option_local_var = malloc(sizeof(assistants_api_response_format_option_t));
    if (!assistants_api_response_format_option_local_var) {
        return NULL;
    }
    assistants_api_response_format_option_local_var->type = type;
    assistants_api_response_format_option_local_var->json_schema = json_schema;

    assistants_api_response_format_option_local_var->_library_owned = 1;
    return assistants_api_response_format_option_local_var;
}

__attribute__((deprecated)) assistants_api_response_format_option_t *assistants_api_response_format_option_create(
    openai_api_assistants_api_response_format_option_TYPE_e type,
    response_format_json_schema_json_schema_t *json_schema
    ) {
    return assistants_api_response_format_option_create_internal (
        type,
        json_schema
        );
}

void assistants_api_response_format_option_free(assistants_api_response_format_option_t *assistants_api_response_format_option) {
    if(NULL == assistants_api_response_format_option){
        return ;
    }
    if(assistants_api_response_format_option->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "assistants_api_response_format_option_free");
        return ;
    }
    listEntry_t *listEntry;
    if (assistants_api_response_format_option->json_schema) {
        response_format_json_schema_json_schema_free(assistants_api_response_format_option->json_schema);
        assistants_api_response_format_option->json_schema = NULL;
    }
    free(assistants_api_response_format_option);
}

cJSON *assistants_api_response_format_option_convertToJSON(assistants_api_response_format_option_t *assistants_api_response_format_option) {
    cJSON *item = cJSON_CreateObject();

    // assistants_api_response_format_option->type
    if (openai_api_assistants_api_response_format_option_TYPE_NULL == assistants_api_response_format_option->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", assistants_api_response_format_option_type_ToString(assistants_api_response_format_option->type)) == NULL)
    {
    goto fail; //Enum
    }


    // assistants_api_response_format_option->json_schema
    if (!assistants_api_response_format_option->json_schema) {
        goto fail;
    }
    cJSON *json_schema_local_JSON = response_format_json_schema_json_schema_convertToJSON(assistants_api_response_format_option->json_schema);
    if(json_schema_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "json_schema", json_schema_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

assistants_api_response_format_option_t *assistants_api_response_format_option_parseFromJSON(cJSON *assistants_api_response_format_optionJSON){

    assistants_api_response_format_option_t *assistants_api_response_format_option_local_var = NULL;

    // define the local variable for assistants_api_response_format_option->json_schema
    response_format_json_schema_json_schema_t *json_schema_local_nonprim = NULL;

    // assistants_api_response_format_option->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(assistants_api_response_format_optionJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_assistants_api_response_format_option_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = assistants_api_response_format_option_type_FromString(type->valuestring);

    // assistants_api_response_format_option->json_schema
    cJSON *json_schema = cJSON_GetObjectItemCaseSensitive(assistants_api_response_format_optionJSON, "json_schema");
    if (cJSON_IsNull(json_schema)) {
        json_schema = NULL;
    }
    if (!json_schema) {
        goto end;
    }

    
    json_schema_local_nonprim = response_format_json_schema_json_schema_parseFromJSON(json_schema); //nonprimitive


    assistants_api_response_format_option_local_var = assistants_api_response_format_option_create_internal (
        typeVariable,
        json_schema_local_nonprim
        );

    return assistants_api_response_format_option_local_var;
end:
    if (json_schema_local_nonprim) {
        response_format_json_schema_json_schema_free(json_schema_local_nonprim);
        json_schema_local_nonprim = NULL;
    }
    return NULL;

}
