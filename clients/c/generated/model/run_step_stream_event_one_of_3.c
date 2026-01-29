#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_stream_event_one_of_3.h"


char* run_step_stream_event_one_of_3_event_ToString(openai_api_run_step_stream_event_one_of_3_EVENT_e event) {
    char* eventArray[] =  { "NULL", "thread.run.step.completed" };
    return eventArray[event];
}

openai_api_run_step_stream_event_one_of_3_EVENT_e run_step_stream_event_one_of_3_event_FromString(char* event){
    int stringToReturn = 0;
    char *eventArray[] =  { "NULL", "thread.run.step.completed" };
    size_t sizeofArray = sizeof(eventArray) / sizeof(eventArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(event, eventArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static run_step_stream_event_one_of_3_t *run_step_stream_event_one_of_3_create_internal(
    openai_api_run_step_stream_event_one_of_3_EVENT_e event,
    run_step_object_t *data
    ) {
    run_step_stream_event_one_of_3_t *run_step_stream_event_one_of_3_local_var = malloc(sizeof(run_step_stream_event_one_of_3_t));
    if (!run_step_stream_event_one_of_3_local_var) {
        return NULL;
    }
    run_step_stream_event_one_of_3_local_var->event = event;
    run_step_stream_event_one_of_3_local_var->data = data;

    run_step_stream_event_one_of_3_local_var->_library_owned = 1;
    return run_step_stream_event_one_of_3_local_var;
}

__attribute__((deprecated)) run_step_stream_event_one_of_3_t *run_step_stream_event_one_of_3_create(
    openai_api_run_step_stream_event_one_of_3_EVENT_e event,
    run_step_object_t *data
    ) {
    return run_step_stream_event_one_of_3_create_internal (
        event,
        data
        );
}

void run_step_stream_event_one_of_3_free(run_step_stream_event_one_of_3_t *run_step_stream_event_one_of_3) {
    if(NULL == run_step_stream_event_one_of_3){
        return ;
    }
    if(run_step_stream_event_one_of_3->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_step_stream_event_one_of_3_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_stream_event_one_of_3->data) {
        run_step_object_free(run_step_stream_event_one_of_3->data);
        run_step_stream_event_one_of_3->data = NULL;
    }
    free(run_step_stream_event_one_of_3);
}

cJSON *run_step_stream_event_one_of_3_convertToJSON(run_step_stream_event_one_of_3_t *run_step_stream_event_one_of_3) {
    cJSON *item = cJSON_CreateObject();

    // run_step_stream_event_one_of_3->event
    if (openai_api_run_step_stream_event_one_of_3_EVENT_NULL == run_step_stream_event_one_of_3->event) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event", run_step_stream_event_one_of_3_event_ToString(run_step_stream_event_one_of_3->event)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_stream_event_one_of_3->data
    if (!run_step_stream_event_one_of_3->data) {
        goto fail;
    }
    cJSON *data_local_JSON = run_step_object_convertToJSON(run_step_stream_event_one_of_3->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
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

run_step_stream_event_one_of_3_t *run_step_stream_event_one_of_3_parseFromJSON(cJSON *run_step_stream_event_one_of_3JSON){

    run_step_stream_event_one_of_3_t *run_step_stream_event_one_of_3_local_var = NULL;

    // define the local variable for run_step_stream_event_one_of_3->data
    run_step_object_t *data_local_nonprim = NULL;

    // run_step_stream_event_one_of_3->event
    cJSON *event = cJSON_GetObjectItemCaseSensitive(run_step_stream_event_one_of_3JSON, "event");
    if (cJSON_IsNull(event)) {
        event = NULL;
    }
    if (!event) {
        goto end;
    }

    openai_api_run_step_stream_event_one_of_3_EVENT_e eventVariable;
    
    if(!cJSON_IsString(event))
    {
    goto end; //Enum
    }
    eventVariable = run_step_stream_event_one_of_3_event_FromString(event->valuestring);

    // run_step_stream_event_one_of_3->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(run_step_stream_event_one_of_3JSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (!data) {
        goto end;
    }

    
    data_local_nonprim = run_step_object_parseFromJSON(data); //nonprimitive


    run_step_stream_event_one_of_3_local_var = run_step_stream_event_one_of_3_create_internal (
        eventVariable,
        data_local_nonprim
        );

    return run_step_stream_event_one_of_3_local_var;
end:
    if (data_local_nonprim) {
        run_step_object_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
