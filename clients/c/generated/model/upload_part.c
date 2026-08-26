#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "upload_part.h"


char* upload_part_object_ToString(openai_api_upload_part_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "upload.part" };
    return objectArray[object];
}

openai_api_upload_part_OBJECT_e upload_part_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "upload.part" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static upload_part_t *upload_part_create_internal(
    char *id,
    int *created_at,
    char *upload_id,
    openai_api_upload_part_OBJECT_e object
    ) {
    upload_part_t *upload_part_local_var = malloc(sizeof(upload_part_t));
    if (!upload_part_local_var) {
        return NULL;
    }
    memset(upload_part_local_var, 0, sizeof(upload_part_t));
    upload_part_local_var->_library_owned = 1;
    upload_part_local_var->id = id;
    upload_part_local_var->created_at = created_at;
    upload_part_local_var->upload_id = upload_id;
    upload_part_local_var->object = object;
    return upload_part_local_var;
}

__attribute__((deprecated)) upload_part_t *upload_part_create(
    char *id,
    int *created_at,
    char *upload_id,
    openai_api_upload_part_OBJECT_e object
    ) {
    int *created_at_copy = NULL;
    if (created_at) {
        created_at_copy = malloc(sizeof(int));
        if (created_at_copy) *created_at_copy = *created_at;
    }
    upload_part_t *result = upload_part_create_internal (
        id,
        created_at_copy,
        upload_id,
        object
        );
    if (!result) {
        free(created_at_copy);
    }
    return result;
}

void upload_part_free(upload_part_t *upload_part) {
    if(NULL == upload_part){
        return ;
    }
    if(upload_part->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "upload_part_free");
        return ;
    }
    listEntry_t *listEntry;
    if (upload_part->id) {
        free(upload_part->id);
        upload_part->id = NULL;
    }
    if (upload_part->created_at) {
        free(upload_part->created_at);
        upload_part->created_at = NULL;
    }
    if (upload_part->upload_id) {
        free(upload_part->upload_id);
        upload_part->upload_id = NULL;
    }
    free(upload_part);
}

cJSON *upload_part_convertToJSON(upload_part_t *upload_part) {
    cJSON *item = cJSON_CreateObject();

    // upload_part->id
    if (!upload_part->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", upload_part->id) == NULL) {
    goto fail; //String
    }


    // upload_part->created_at
    if (!upload_part->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", *upload_part->created_at) == NULL) {
    goto fail; //Numeric
    }


    // upload_part->upload_id
    if (!upload_part->upload_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "upload_id", upload_part->upload_id) == NULL) {
    goto fail; //String
    }


    // upload_part->object
    if (openai_api_upload_part_OBJECT_NULL == upload_part->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", upload_part_object_ToString(upload_part->object)) == NULL)
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

upload_part_t *upload_part_parseFromJSON(cJSON *upload_partJSON){

    upload_part_t *upload_part_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for upload_part->created_at
    int *created_at_local_var = NULL;

    char *upload_id_local_str = NULL;

    // upload_part->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(upload_partJSON, "id");
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

    // upload_part->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(upload_partJSON, "created_at");
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
    created_at_local_var = malloc(sizeof(int));
    if(!created_at_local_var)
    {
        goto end;
    }
    *created_at_local_var = created_at->valuedouble;

    // upload_part->upload_id
    cJSON *upload_id = cJSON_GetObjectItemCaseSensitive(upload_partJSON, "upload_id");
    if (cJSON_IsNull(upload_id)) {
        upload_id = NULL;
    }
    if (!upload_id) {
        goto end;
    }

    
    if(!cJSON_IsString(upload_id))
    {
    goto end; //String
    }

    // upload_part->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(upload_partJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_upload_part_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = upload_part_object_FromString(object->valuestring);


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (upload_id && !cJSON_IsNull(upload_id)) upload_id_local_str = strdup(upload_id->valuestring);

    upload_part_local_var = upload_part_create_internal (
        id_local_str,
        created_at_local_var,
        upload_id_local_str,
        objectVariable
        );

    if (!upload_part_local_var) {
        goto end;
    }

    return upload_part_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (created_at_local_var) {
        free(created_at_local_var);
        created_at_local_var = NULL;
    }
    if (upload_id_local_str) {
        free(upload_id_local_str);
        upload_id_local_str = NULL;
    }
    return NULL;

}
