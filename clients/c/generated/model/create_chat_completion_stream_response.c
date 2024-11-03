#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_completion_stream_response.h"


char* create_chat_completion_stream_response_object_ToString(openai_api_create_chat_completion_stream_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "chat.completion.chunk" };
    return objectArray[object];
}

openai_api_create_chat_completion_stream_response_OBJECT_e create_chat_completion_stream_response_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "chat.completion.chunk" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

create_chat_completion_stream_response_t *create_chat_completion_stream_response_create(
    char *id,
    list_t *choices,
    int created,
    char *model,
    char *system_fingerprint,
    openai_api_create_chat_completion_stream_response_OBJECT_e object
    ) {
    create_chat_completion_stream_response_t *create_chat_completion_stream_response_local_var = malloc(sizeof(create_chat_completion_stream_response_t));
    if (!create_chat_completion_stream_response_local_var) {
        return NULL;
    }
    create_chat_completion_stream_response_local_var->id = id;
    create_chat_completion_stream_response_local_var->choices = choices;
    create_chat_completion_stream_response_local_var->created = created;
    create_chat_completion_stream_response_local_var->model = model;
    create_chat_completion_stream_response_local_var->system_fingerprint = system_fingerprint;
    create_chat_completion_stream_response_local_var->object = object;

    return create_chat_completion_stream_response_local_var;
}


void create_chat_completion_stream_response_free(create_chat_completion_stream_response_t *create_chat_completion_stream_response) {
    if(NULL == create_chat_completion_stream_response){
        return ;
    }
    listEntry_t *listEntry;
    if (create_chat_completion_stream_response->id) {
        free(create_chat_completion_stream_response->id);
        create_chat_completion_stream_response->id = NULL;
    }
    if (create_chat_completion_stream_response->choices) {
        list_ForEach(listEntry, create_chat_completion_stream_response->choices) {
            create_chat_completion_stream_response_choices_inner_free(listEntry->data);
        }
        list_freeList(create_chat_completion_stream_response->choices);
        create_chat_completion_stream_response->choices = NULL;
    }
    if (create_chat_completion_stream_response->model) {
        free(create_chat_completion_stream_response->model);
        create_chat_completion_stream_response->model = NULL;
    }
    if (create_chat_completion_stream_response->system_fingerprint) {
        free(create_chat_completion_stream_response->system_fingerprint);
        create_chat_completion_stream_response->system_fingerprint = NULL;
    }
    free(create_chat_completion_stream_response);
}

cJSON *create_chat_completion_stream_response_convertToJSON(create_chat_completion_stream_response_t *create_chat_completion_stream_response) {
    cJSON *item = cJSON_CreateObject();

    // create_chat_completion_stream_response->id
    if (!create_chat_completion_stream_response->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", create_chat_completion_stream_response->id) == NULL) {
    goto fail; //String
    }


    // create_chat_completion_stream_response->choices
    if (!create_chat_completion_stream_response->choices) {
        goto fail;
    }
    cJSON *choices = cJSON_AddArrayToObject(item, "choices");
    if(choices == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *choicesListEntry;
    if (create_chat_completion_stream_response->choices) {
    list_ForEach(choicesListEntry, create_chat_completion_stream_response->choices) {
    cJSON *itemLocal = create_chat_completion_stream_response_choices_inner_convertToJSON(choicesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(choices, itemLocal);
    }
    }


    // create_chat_completion_stream_response->created
    if (!create_chat_completion_stream_response->created) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created", create_chat_completion_stream_response->created) == NULL) {
    goto fail; //Numeric
    }


    // create_chat_completion_stream_response->model
    if (!create_chat_completion_stream_response->model) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "model", create_chat_completion_stream_response->model) == NULL) {
    goto fail; //String
    }


    // create_chat_completion_stream_response->system_fingerprint
    if(create_chat_completion_stream_response->system_fingerprint) {
    if(cJSON_AddStringToObject(item, "system_fingerprint", create_chat_completion_stream_response->system_fingerprint) == NULL) {
    goto fail; //String
    }
    }


    // create_chat_completion_stream_response->object
    if (openai_api_create_chat_completion_stream_response_OBJECT_NULL == create_chat_completion_stream_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", objectcreate_chat_completion_stream_response_ToString(create_chat_completion_stream_response->object)) == NULL)
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

create_chat_completion_stream_response_t *create_chat_completion_stream_response_parseFromJSON(cJSON *create_chat_completion_stream_responseJSON){

    create_chat_completion_stream_response_t *create_chat_completion_stream_response_local_var = NULL;

    // define the local list for create_chat_completion_stream_response->choices
    list_t *choicesList = NULL;

    // create_chat_completion_stream_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_responseJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // create_chat_completion_stream_response->choices
    cJSON *choices = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_responseJSON, "choices");
    if (!choices) {
        goto end;
    }

    
    cJSON *choices_local_nonprimitive = NULL;
    if(!cJSON_IsArray(choices)){
        goto end; //nonprimitive container
    }

    choicesList = list_createList();

    cJSON_ArrayForEach(choices_local_nonprimitive,choices )
    {
        if(!cJSON_IsObject(choices_local_nonprimitive)){
            goto end;
        }
        create_chat_completion_stream_response_choices_inner_t *choicesItem = create_chat_completion_stream_response_choices_inner_parseFromJSON(choices_local_nonprimitive);

        list_addElement(choicesList, choicesItem);
    }

    // create_chat_completion_stream_response->created
    cJSON *created = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_responseJSON, "created");
    if (!created) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created))
    {
    goto end; //Numeric
    }

    // create_chat_completion_stream_response->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_responseJSON, "model");
    if (!model) {
        goto end;
    }

    
    if(!cJSON_IsString(model))
    {
    goto end; //String
    }

    // create_chat_completion_stream_response->system_fingerprint
    cJSON *system_fingerprint = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_responseJSON, "system_fingerprint");
    if (system_fingerprint) { 
    if(!cJSON_IsString(system_fingerprint) && !cJSON_IsNull(system_fingerprint))
    {
    goto end; //String
    }
    }

    // create_chat_completion_stream_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_responseJSON, "object");
    if (!object) {
        goto end;
    }

    openai_api_create_chat_completion_stream_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = create_chat_completion_stream_response_object_FromString(object->valuestring);


    create_chat_completion_stream_response_local_var = create_chat_completion_stream_response_create (
        strdup(id->valuestring),
        choicesList,
        created->valuedouble,
        strdup(model->valuestring),
        system_fingerprint && !cJSON_IsNull(system_fingerprint) ? strdup(system_fingerprint->valuestring) : NULL,
        objectVariable
        );

    return create_chat_completion_stream_response_local_var;
end:
    if (choicesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, choicesList) {
            create_chat_completion_stream_response_choices_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(choicesList);
        choicesList = NULL;
    }
    return NULL;

}
