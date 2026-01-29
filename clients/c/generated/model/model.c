#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "model.h"


char* model_object_ToString(openai_api_model_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "model" };
    return objectArray[object];
}

openai_api_model_OBJECT_e model_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "model" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static model_t *model_create_internal(
    char *id,
    int created,
    openai_api_model_OBJECT_e object,
    char *owned_by
    ) {
    model_t *model_local_var = malloc(sizeof(model_t));
    if (!model_local_var) {
        return NULL;
    }
    model_local_var->id = id;
    model_local_var->created = created;
    model_local_var->object = object;
    model_local_var->owned_by = owned_by;

    model_local_var->_library_owned = 1;
    return model_local_var;
}

__attribute__((deprecated)) model_t *model_create(
    char *id,
    int created,
    openai_api_model_OBJECT_e object,
    char *owned_by
    ) {
    return model_create_internal (
        id,
        created,
        object,
        owned_by
        );
}

void model_free(model_t *model) {
    if(NULL == model){
        return ;
    }
    if(model->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "model_free");
        return ;
    }
    listEntry_t *listEntry;
    if (model->id) {
        free(model->id);
        model->id = NULL;
    }
    if (model->owned_by) {
        free(model->owned_by);
        model->owned_by = NULL;
    }
    free(model);
}

cJSON *model_convertToJSON(model_t *model) {
    cJSON *item = cJSON_CreateObject();

    // model->id
    if (!model->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", model->id) == NULL) {
    goto fail; //String
    }


    // model->created
    if (!model->created) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created", model->created) == NULL) {
    goto fail; //Numeric
    }


    // model->object
    if (openai_api_model_OBJECT_NULL == model->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", model_object_ToString(model->object)) == NULL)
    {
    goto fail; //Enum
    }


    // model->owned_by
    if (!model->owned_by) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "owned_by", model->owned_by) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

model_t *model_parseFromJSON(cJSON *modelJSON){

    model_t *model_local_var = NULL;

    // model->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(modelJSON, "id");
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

    // model->created
    cJSON *created = cJSON_GetObjectItemCaseSensitive(modelJSON, "created");
    if (cJSON_IsNull(created)) {
        created = NULL;
    }
    if (!created) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created))
    {
    goto end; //Numeric
    }

    // model->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(modelJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_model_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = model_object_FromString(object->valuestring);

    // model->owned_by
    cJSON *owned_by = cJSON_GetObjectItemCaseSensitive(modelJSON, "owned_by");
    if (cJSON_IsNull(owned_by)) {
        owned_by = NULL;
    }
    if (!owned_by) {
        goto end;
    }

    
    if(!cJSON_IsString(owned_by))
    {
    goto end; //String
    }


    model_local_var = model_create_internal (
        strdup(id->valuestring),
        created->valuedouble,
        objectVariable,
        strdup(owned_by->valuestring)
        );

    return model_local_var;
end:
    return NULL;

}
