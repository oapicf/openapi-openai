#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "model.h"



model_t *model_create(
    char *id,
    char *object,
    int created,
    char *owned_by
    ) {
    model_t *model_local_var = malloc(sizeof(model_t));
    if (!model_local_var) {
        return NULL;
    }
    model_local_var->id = id;
    model_local_var->object = object;
    model_local_var->created = created;
    model_local_var->owned_by = owned_by;

    return model_local_var;
}


void model_free(model_t *model) {
    if(NULL == model){
        return ;
    }
    listEntry_t *listEntry;
    if (model->id) {
        free(model->id);
        model->id = NULL;
    }
    if (model->object) {
        free(model->object);
        model->object = NULL;
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


    // model->object
    if (!model->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", model->object) == NULL) {
    goto fail; //String
    }


    // model->created
    if (!model->created) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created", model->created) == NULL) {
    goto fail; //Numeric
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
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // model->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(modelJSON, "object");
    if (!object) {
        goto end;
    }

    
    if(!cJSON_IsString(object))
    {
    goto end; //String
    }

    // model->created
    cJSON *created = cJSON_GetObjectItemCaseSensitive(modelJSON, "created");
    if (!created) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created))
    {
    goto end; //Numeric
    }

    // model->owned_by
    cJSON *owned_by = cJSON_GetObjectItemCaseSensitive(modelJSON, "owned_by");
    if (!owned_by) {
        goto end;
    }

    
    if(!cJSON_IsString(owned_by))
    {
    goto end; //String
    }


    model_local_var = model_create (
        strdup(id->valuestring),
        strdup(object->valuestring),
        created->valuedouble,
        strdup(owned_by->valuestring)
        );

    return model_local_var;
end:
    return NULL;

}
