#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_stream_event.h"


char* run_step_stream_event_event_ToString(openai_api_run_step_stream_event_EVENT_e event) {
    char* eventArray[] =  { "NULL", "thread.run.step.expired" };
    return eventArray[event];
}

openai_api_run_step_stream_event_EVENT_e run_step_stream_event_event_FromString(char* event){
    int stringToReturn = 0;
    char *eventArray[] =  { "NULL", "thread.run.step.expired" };
    size_t sizeofArray = sizeof(eventArray) / sizeof(eventArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(event, eventArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static run_step_stream_event_t *run_step_stream_event_create_internal(
    openai_api_run_step_stream_event_EVENT_e event,
    run_step_object_t *data
    ) {
    run_step_stream_event_t *run_step_stream_event_local_var = malloc(sizeof(run_step_stream_event_t));
    if (!run_step_stream_event_local_var) {
        return NULL;
    }
    run_step_stream_event_local_var->event = event;
    run_step_stream_event_local_var->data = data;

    run_step_stream_event_local_var->_library_owned = 1;
    return run_step_stream_event_local_var;
}

__attribute__((deprecated)) run_step_stream_event_t *run_step_stream_event_create(
    openai_api_run_step_stream_event_EVENT_e event,
    run_step_object_t *data
    ) {
    return run_step_stream_event_create_internal (
        event,
        data
        );
}

void run_step_stream_event_free(run_step_stream_event_t *run_step_stream_event) {
    if(NULL == run_step_stream_event){
        return ;
    }
    if(run_step_stream_event->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_step_stream_event_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_stream_event->data) {
        run_step_object_free(run_step_stream_event->data);
        run_step_stream_event->data = NULL;
    }
    free(run_step_stream_event);
}

cJSON *run_step_stream_event_convertToJSON(run_step_stream_event_t *run_step_stream_event) {
    cJSON *item = cJSON_CreateObject();

    // run_step_stream_event->event
    if (openai_api_run_step_stream_event_EVENT_NULL == run_step_stream_event->event) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event", run_step_stream_event_event_ToString(run_step_stream_event->event)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_stream_event->data
    if (!run_step_stream_event->data) {
        goto fail;
    }
    cJSON *data_local_JSON = run_step_object_convertToJSON(run_step_stream_event->data);
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

run_step_stream_event_t *run_step_stream_event_parseFromJSON(cJSON *run_step_stream_eventJSON){

    run_step_stream_event_t *run_step_stream_event_local_var = NULL;

    // define the local variable for run_step_stream_event->data
    run_step_object_t *data_local_nonprim = NULL;

    // run_step_stream_event->event
    cJSON *event = cJSON_GetObjectItemCaseSensitive(run_step_stream_eventJSON, "event");
    if (cJSON_IsNull(event)) {
        event = NULL;
    }
    if (!event) {
        goto end;
    }

    openai_api_run_step_stream_event_EVENT_e eventVariable;
    
    if(!cJSON_IsString(event))
    {
    goto end; //Enum
    }
    eventVariable = run_step_stream_event_event_FromString(event->valuestring);

    // run_step_stream_event->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(run_step_stream_eventJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (!data) {
        goto end;
    }

    
    data_local_nonprim = run_step_object_parseFromJSON(data); //nonprimitive


    run_step_stream_event_local_var = run_step_stream_event_create_internal (
        eventVariable,
        data_local_nonprim
        );

    return run_step_stream_event_local_var;
end:
    if (data_local_nonprim) {
        run_step_object_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
