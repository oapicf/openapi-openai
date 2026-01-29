#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistant_file_object.h"


char* assistant_file_object_object_ToString(openai_api_assistant_file_object_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "assistant.file" };
    return objectArray[object];
}

openai_api_assistant_file_object_OBJECT_e assistant_file_object_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "assistant.file" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static assistant_file_object_t *assistant_file_object_create_internal(
    char *id,
    openai_api_assistant_file_object_OBJECT_e object,
    int created_at,
    char *assistant_id
    ) {
    assistant_file_object_t *assistant_file_object_local_var = malloc(sizeof(assistant_file_object_t));
    if (!assistant_file_object_local_var) {
        return NULL;
    }
    assistant_file_object_local_var->id = id;
    assistant_file_object_local_var->object = object;
    assistant_file_object_local_var->created_at = created_at;
    assistant_file_object_local_var->assistant_id = assistant_id;

    assistant_file_object_local_var->_library_owned = 1;
    return assistant_file_object_local_var;
}

__attribute__((deprecated)) assistant_file_object_t *assistant_file_object_create(
    char *id,
    openai_api_assistant_file_object_OBJECT_e object,
    int created_at,
    char *assistant_id
    ) {
    return assistant_file_object_create_internal (
        id,
        object,
        created_at,
        assistant_id
        );
}

void assistant_file_object_free(assistant_file_object_t *assistant_file_object) {
    if(NULL == assistant_file_object){
        return ;
    }
    if(assistant_file_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "assistant_file_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (assistant_file_object->id) {
        free(assistant_file_object->id);
        assistant_file_object->id = NULL;
    }
    if (assistant_file_object->assistant_id) {
        free(assistant_file_object->assistant_id);
        assistant_file_object->assistant_id = NULL;
    }
    free(assistant_file_object);
}

cJSON *assistant_file_object_convertToJSON(assistant_file_object_t *assistant_file_object) {
    cJSON *item = cJSON_CreateObject();

    // assistant_file_object->id
    if (!assistant_file_object->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", assistant_file_object->id) == NULL) {
    goto fail; //String
    }


    // assistant_file_object->object
    if (openai_api_assistant_file_object_OBJECT_NULL == assistant_file_object->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", assistant_file_object_object_ToString(assistant_file_object->object)) == NULL)
    {
    goto fail; //Enum
    }


    // assistant_file_object->created_at
    if (!assistant_file_object->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", assistant_file_object->created_at) == NULL) {
    goto fail; //Numeric
    }


    // assistant_file_object->assistant_id
    if (!assistant_file_object->assistant_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "assistant_id", assistant_file_object->assistant_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

assistant_file_object_t *assistant_file_object_parseFromJSON(cJSON *assistant_file_objectJSON){

    assistant_file_object_t *assistant_file_object_local_var = NULL;

    // assistant_file_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(assistant_file_objectJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // assistant_file_object->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(assistant_file_objectJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_assistant_file_object_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = assistant_file_object_object_FromString(object->valuestring);

    // assistant_file_object->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(assistant_file_objectJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }

    // assistant_file_object->assistant_id
    cJSON *assistant_id = cJSON_GetObjectItemCaseSensitive(assistant_file_objectJSON, "assistant_id");
    if (cJSON_IsNull(assistant_id)) {
        assistant_id = NULL;
    }
    if (!assistant_id) {
        goto end;
    }

    
    if(!cJSON_IsString(assistant_id))
    {
    goto end; //String
    }


    assistant_file_object_local_var = assistant_file_object_create_internal (
        strdup(id->valuestring),
        objectVariable,
        created_at->valuedouble,
        strdup(assistant_id->valuestring)
        );

    return assistant_file_object_local_var;
end:
    return NULL;

}
