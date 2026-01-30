#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "response_format_json_schema.h"


char* response_format_json_schema_type_ToString(openai_api_response_format_json_schema_TYPE_e type) {
    char* typeArray[] =  { "NULL", "json_schema" };
    return typeArray[type];
}

openai_api_response_format_json_schema_TYPE_e response_format_json_schema_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "json_schema" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static response_format_json_schema_t *response_format_json_schema_create_internal(
    openai_api_response_format_json_schema_TYPE_e type,
    response_format_json_schema_json_schema_t *json_schema
    ) {
    response_format_json_schema_t *response_format_json_schema_local_var = malloc(sizeof(response_format_json_schema_t));
    if (!response_format_json_schema_local_var) {
        return NULL;
    }
    response_format_json_schema_local_var->type = type;
    response_format_json_schema_local_var->json_schema = json_schema;

    response_format_json_schema_local_var->_library_owned = 1;
    return response_format_json_schema_local_var;
}

__attribute__((deprecated)) response_format_json_schema_t *response_format_json_schema_create(
    openai_api_response_format_json_schema_TYPE_e type,
    response_format_json_schema_json_schema_t *json_schema
    ) {
    return response_format_json_schema_create_internal (
        type,
        json_schema
        );
}

void response_format_json_schema_free(response_format_json_schema_t *response_format_json_schema) {
    if(NULL == response_format_json_schema){
        return ;
    }
    if(response_format_json_schema->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "response_format_json_schema_free");
        return ;
    }
    listEntry_t *listEntry;
    if (response_format_json_schema->json_schema) {
        response_format_json_schema_json_schema_free(response_format_json_schema->json_schema);
        response_format_json_schema->json_schema = NULL;
    }
    free(response_format_json_schema);
}

cJSON *response_format_json_schema_convertToJSON(response_format_json_schema_t *response_format_json_schema) {
    cJSON *item = cJSON_CreateObject();

    // response_format_json_schema->type
    if (openai_api_response_format_json_schema_TYPE_NULL == response_format_json_schema->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", response_format_json_schema_type_ToString(response_format_json_schema->type)) == NULL)
    {
    goto fail; //Enum
    }


    // response_format_json_schema->json_schema
    if (!response_format_json_schema->json_schema) {
        goto fail;
    }
    cJSON *json_schema_local_JSON = response_format_json_schema_json_schema_convertToJSON(response_format_json_schema->json_schema);
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

response_format_json_schema_t *response_format_json_schema_parseFromJSON(cJSON *response_format_json_schemaJSON){

    response_format_json_schema_t *response_format_json_schema_local_var = NULL;

    // define the local variable for response_format_json_schema->json_schema
    response_format_json_schema_json_schema_t *json_schema_local_nonprim = NULL;

    // response_format_json_schema->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(response_format_json_schemaJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_response_format_json_schema_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = response_format_json_schema_type_FromString(type->valuestring);

    // response_format_json_schema->json_schema
    cJSON *json_schema = cJSON_GetObjectItemCaseSensitive(response_format_json_schemaJSON, "json_schema");
    if (cJSON_IsNull(json_schema)) {
        json_schema = NULL;
    }
    if (!json_schema) {
        goto end;
    }

    
    json_schema_local_nonprim = response_format_json_schema_json_schema_parseFromJSON(json_schema); //nonprimitive


    response_format_json_schema_local_var = response_format_json_schema_create_internal (
        typeVariable,
        json_schema_local_nonprim
        );

    return response_format_json_schema_local_var;
end:
    if (json_schema_local_nonprim) {
        response_format_json_schema_json_schema_free(json_schema_local_nonprim);
        json_schema_local_nonprim = NULL;
    }
    return NULL;

}
