#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tune.h"



fine_tune_t *fine_tune_create(
    char *id,
    char *object,
    int created_at,
    int updated_at,
    char *model,
    char *fine_tuned_model,
    char *organization_id,
    char *status,
    object_t *hyperparams,
    list_t *training_files,
    list_t *validation_files,
    list_t *result_files,
    list_t *events
    ) {
    fine_tune_t *fine_tune_local_var = malloc(sizeof(fine_tune_t));
    if (!fine_tune_local_var) {
        return NULL;
    }
    fine_tune_local_var->id = id;
    fine_tune_local_var->object = object;
    fine_tune_local_var->created_at = created_at;
    fine_tune_local_var->updated_at = updated_at;
    fine_tune_local_var->model = model;
    fine_tune_local_var->fine_tuned_model = fine_tuned_model;
    fine_tune_local_var->organization_id = organization_id;
    fine_tune_local_var->status = status;
    fine_tune_local_var->hyperparams = hyperparams;
    fine_tune_local_var->training_files = training_files;
    fine_tune_local_var->validation_files = validation_files;
    fine_tune_local_var->result_files = result_files;
    fine_tune_local_var->events = events;

    return fine_tune_local_var;
}


void fine_tune_free(fine_tune_t *fine_tune) {
    if(NULL == fine_tune){
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tune->id) {
        free(fine_tune->id);
        fine_tune->id = NULL;
    }
    if (fine_tune->object) {
        free(fine_tune->object);
        fine_tune->object = NULL;
    }
    if (fine_tune->model) {
        free(fine_tune->model);
        fine_tune->model = NULL;
    }
    if (fine_tune->fine_tuned_model) {
        free(fine_tune->fine_tuned_model);
        fine_tune->fine_tuned_model = NULL;
    }
    if (fine_tune->organization_id) {
        free(fine_tune->organization_id);
        fine_tune->organization_id = NULL;
    }
    if (fine_tune->status) {
        free(fine_tune->status);
        fine_tune->status = NULL;
    }
    if (fine_tune->hyperparams) {
        object_free(fine_tune->hyperparams);
        fine_tune->hyperparams = NULL;
    }
    if (fine_tune->training_files) {
        list_ForEach(listEntry, fine_tune->training_files) {
            open_ai_file_free(listEntry->data);
        }
        list_freeList(fine_tune->training_files);
        fine_tune->training_files = NULL;
    }
    if (fine_tune->validation_files) {
        list_ForEach(listEntry, fine_tune->validation_files) {
            open_ai_file_free(listEntry->data);
        }
        list_freeList(fine_tune->validation_files);
        fine_tune->validation_files = NULL;
    }
    if (fine_tune->result_files) {
        list_ForEach(listEntry, fine_tune->result_files) {
            open_ai_file_free(listEntry->data);
        }
        list_freeList(fine_tune->result_files);
        fine_tune->result_files = NULL;
    }
    if (fine_tune->events) {
        list_ForEach(listEntry, fine_tune->events) {
            fine_tune_event_free(listEntry->data);
        }
        list_freeList(fine_tune->events);
        fine_tune->events = NULL;
    }
    free(fine_tune);
}

cJSON *fine_tune_convertToJSON(fine_tune_t *fine_tune) {
    cJSON *item = cJSON_CreateObject();

    // fine_tune->id
    if (!fine_tune->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", fine_tune->id) == NULL) {
    goto fail; //String
    }


    // fine_tune->object
    if (!fine_tune->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", fine_tune->object) == NULL) {
    goto fail; //String
    }


    // fine_tune->created_at
    if (!fine_tune->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", fine_tune->created_at) == NULL) {
    goto fail; //Numeric
    }


    // fine_tune->updated_at
    if (!fine_tune->updated_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "updated_at", fine_tune->updated_at) == NULL) {
    goto fail; //Numeric
    }


    // fine_tune->model
    if (!fine_tune->model) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "model", fine_tune->model) == NULL) {
    goto fail; //String
    }


    // fine_tune->fine_tuned_model
    if (!fine_tune->fine_tuned_model) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "fine_tuned_model", fine_tune->fine_tuned_model) == NULL) {
    goto fail; //String
    }


    // fine_tune->organization_id
    if (!fine_tune->organization_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "organization_id", fine_tune->organization_id) == NULL) {
    goto fail; //String
    }


    // fine_tune->status
    if (!fine_tune->status) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "status", fine_tune->status) == NULL) {
    goto fail; //String
    }


    // fine_tune->hyperparams
    if (!fine_tune->hyperparams) {
        goto fail;
    }
    cJSON *hyperparams_object = object_convertToJSON(fine_tune->hyperparams);
    if(hyperparams_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hyperparams", hyperparams_object);
    if(item->child == NULL) {
    goto fail;
    }


    // fine_tune->training_files
    if (!fine_tune->training_files) {
        goto fail;
    }
    cJSON *training_files = cJSON_AddArrayToObject(item, "training_files");
    if(training_files == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *training_filesListEntry;
    if (fine_tune->training_files) {
    list_ForEach(training_filesListEntry, fine_tune->training_files) {
    cJSON *itemLocal = open_ai_file_convertToJSON(training_filesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(training_files, itemLocal);
    }
    }


    // fine_tune->validation_files
    if (!fine_tune->validation_files) {
        goto fail;
    }
    cJSON *validation_files = cJSON_AddArrayToObject(item, "validation_files");
    if(validation_files == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *validation_filesListEntry;
    if (fine_tune->validation_files) {
    list_ForEach(validation_filesListEntry, fine_tune->validation_files) {
    cJSON *itemLocal = open_ai_file_convertToJSON(validation_filesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(validation_files, itemLocal);
    }
    }


    // fine_tune->result_files
    if (!fine_tune->result_files) {
        goto fail;
    }
    cJSON *result_files = cJSON_AddArrayToObject(item, "result_files");
    if(result_files == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *result_filesListEntry;
    if (fine_tune->result_files) {
    list_ForEach(result_filesListEntry, fine_tune->result_files) {
    cJSON *itemLocal = open_ai_file_convertToJSON(result_filesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(result_files, itemLocal);
    }
    }


    // fine_tune->events
    if(fine_tune->events) {
    cJSON *events = cJSON_AddArrayToObject(item, "events");
    if(events == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *eventsListEntry;
    if (fine_tune->events) {
    list_ForEach(eventsListEntry, fine_tune->events) {
    cJSON *itemLocal = fine_tune_event_convertToJSON(eventsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(events, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

fine_tune_t *fine_tune_parseFromJSON(cJSON *fine_tuneJSON){

    fine_tune_t *fine_tune_local_var = NULL;

    // define the local list for fine_tune->training_files
    list_t *training_filesList = NULL;

    // define the local list for fine_tune->validation_files
    list_t *validation_filesList = NULL;

    // define the local list for fine_tune->result_files
    list_t *result_filesList = NULL;

    // define the local list for fine_tune->events
    list_t *eventsList = NULL;

    // fine_tune->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(fine_tuneJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // fine_tune->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(fine_tuneJSON, "object");
    if (!object) {
        goto end;
    }

    
    if(!cJSON_IsString(object))
    {
    goto end; //String
    }

    // fine_tune->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(fine_tuneJSON, "created_at");
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }

    // fine_tune->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(fine_tuneJSON, "updated_at");
    if (!updated_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(updated_at))
    {
    goto end; //Numeric
    }

    // fine_tune->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(fine_tuneJSON, "model");
    if (!model) {
        goto end;
    }

    
    if(!cJSON_IsString(model))
    {
    goto end; //String
    }

    // fine_tune->fine_tuned_model
    cJSON *fine_tuned_model = cJSON_GetObjectItemCaseSensitive(fine_tuneJSON, "fine_tuned_model");
    if (!fine_tuned_model) {
        goto end;
    }

    
    if(!cJSON_IsString(fine_tuned_model))
    {
    goto end; //String
    }

    // fine_tune->organization_id
    cJSON *organization_id = cJSON_GetObjectItemCaseSensitive(fine_tuneJSON, "organization_id");
    if (!organization_id) {
        goto end;
    }

    
    if(!cJSON_IsString(organization_id))
    {
    goto end; //String
    }

    // fine_tune->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(fine_tuneJSON, "status");
    if (!status) {
        goto end;
    }

    
    if(!cJSON_IsString(status))
    {
    goto end; //String
    }

    // fine_tune->hyperparams
    cJSON *hyperparams = cJSON_GetObjectItemCaseSensitive(fine_tuneJSON, "hyperparams");
    if (!hyperparams) {
        goto end;
    }

    object_t *hyperparams_local_object = NULL;
    
    hyperparams_local_object = object_parseFromJSON(hyperparams); //object

    // fine_tune->training_files
    cJSON *training_files = cJSON_GetObjectItemCaseSensitive(fine_tuneJSON, "training_files");
    if (!training_files) {
        goto end;
    }

    
    cJSON *training_files_local_nonprimitive = NULL;
    if(!cJSON_IsArray(training_files)){
        goto end; //nonprimitive container
    }

    training_filesList = list_createList();

    cJSON_ArrayForEach(training_files_local_nonprimitive,training_files )
    {
        if(!cJSON_IsObject(training_files_local_nonprimitive)){
            goto end;
        }
        open_ai_file_t *training_filesItem = open_ai_file_parseFromJSON(training_files_local_nonprimitive);

        list_addElement(training_filesList, training_filesItem);
    }

    // fine_tune->validation_files
    cJSON *validation_files = cJSON_GetObjectItemCaseSensitive(fine_tuneJSON, "validation_files");
    if (!validation_files) {
        goto end;
    }

    
    cJSON *validation_files_local_nonprimitive = NULL;
    if(!cJSON_IsArray(validation_files)){
        goto end; //nonprimitive container
    }

    validation_filesList = list_createList();

    cJSON_ArrayForEach(validation_files_local_nonprimitive,validation_files )
    {
        if(!cJSON_IsObject(validation_files_local_nonprimitive)){
            goto end;
        }
        open_ai_file_t *validation_filesItem = open_ai_file_parseFromJSON(validation_files_local_nonprimitive);

        list_addElement(validation_filesList, validation_filesItem);
    }

    // fine_tune->result_files
    cJSON *result_files = cJSON_GetObjectItemCaseSensitive(fine_tuneJSON, "result_files");
    if (!result_files) {
        goto end;
    }

    
    cJSON *result_files_local_nonprimitive = NULL;
    if(!cJSON_IsArray(result_files)){
        goto end; //nonprimitive container
    }

    result_filesList = list_createList();

    cJSON_ArrayForEach(result_files_local_nonprimitive,result_files )
    {
        if(!cJSON_IsObject(result_files_local_nonprimitive)){
            goto end;
        }
        open_ai_file_t *result_filesItem = open_ai_file_parseFromJSON(result_files_local_nonprimitive);

        list_addElement(result_filesList, result_filesItem);
    }

    // fine_tune->events
    cJSON *events = cJSON_GetObjectItemCaseSensitive(fine_tuneJSON, "events");
    if (events) { 
    cJSON *events_local_nonprimitive = NULL;
    if(!cJSON_IsArray(events)){
        goto end; //nonprimitive container
    }

    eventsList = list_createList();

    cJSON_ArrayForEach(events_local_nonprimitive,events )
    {
        if(!cJSON_IsObject(events_local_nonprimitive)){
            goto end;
        }
        fine_tune_event_t *eventsItem = fine_tune_event_parseFromJSON(events_local_nonprimitive);

        list_addElement(eventsList, eventsItem);
    }
    }


    fine_tune_local_var = fine_tune_create (
        strdup(id->valuestring),
        strdup(object->valuestring),
        created_at->valuedouble,
        updated_at->valuedouble,
        strdup(model->valuestring),
        strdup(fine_tuned_model->valuestring),
        strdup(organization_id->valuestring),
        strdup(status->valuestring),
        hyperparams_local_object,
        training_filesList,
        validation_filesList,
        result_filesList,
        events ? eventsList : NULL
        );

    return fine_tune_local_var;
end:
    if (training_filesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, training_filesList) {
            open_ai_file_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(training_filesList);
        training_filesList = NULL;
    }
    if (validation_filesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, validation_filesList) {
            open_ai_file_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(validation_filesList);
        validation_filesList = NULL;
    }
    if (result_filesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, result_filesList) {
            open_ai_file_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(result_filesList);
        result_filesList = NULL;
    }
    if (eventsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, eventsList) {
            fine_tune_event_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(eventsList);
        eventsList = NULL;
    }
    return NULL;

}
