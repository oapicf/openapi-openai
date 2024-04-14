#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_stream_event_one_of.h"


char* run_step_stream_event_one_of_event_ToString(openai_api_run_step_stream_event_one_of_EVENT_e event) {
    char* eventArray[] =  { "NULL", "thread.run.step.created" };
    return eventArray[event];
}

openai_api_run_step_stream_event_one_of_EVENT_e run_step_stream_event_one_of_event_FromString(char* event){
    int stringToReturn = 0;
    char *eventArray[] =  { "NULL", "thread.run.step.created" };
    size_t sizeofArray = sizeof(eventArray) / sizeof(eventArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(event, eventArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

run_step_stream_event_one_of_t *run_step_stream_event_one_of_create(
    openai_api_run_step_stream_event_one_of_EVENT_e event,
    run_step_object_t *data
    ) {
    run_step_stream_event_one_of_t *run_step_stream_event_one_of_local_var = malloc(sizeof(run_step_stream_event_one_of_t));
    if (!run_step_stream_event_one_of_local_var) {
        return NULL;
    }
    run_step_stream_event_one_of_local_var->event = event;
    run_step_stream_event_one_of_local_var->data = data;

    return run_step_stream_event_one_of_local_var;
}


void run_step_stream_event_one_of_free(run_step_stream_event_one_of_t *run_step_stream_event_one_of) {
    if(NULL == run_step_stream_event_one_of){
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_stream_event_one_of->data) {
        run_step_object_free(run_step_stream_event_one_of->data);
        run_step_stream_event_one_of->data = NULL;
    }
    free(run_step_stream_event_one_of);
}

cJSON *run_step_stream_event_one_of_convertToJSON(run_step_stream_event_one_of_t *run_step_stream_event_one_of) {
    cJSON *item = cJSON_CreateObject();

    // run_step_stream_event_one_of->event
    if (openai_api_run_step_stream_event_one_of_EVENT_NULL == run_step_stream_event_one_of->event) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event", eventrun_step_stream_event_one_of_ToString(run_step_stream_event_one_of->event)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_stream_event_one_of->data
    if (!run_step_stream_event_one_of->data) {
        goto fail;
    }
    cJSON *data_local_JSON = run_step_object_convertToJSON(run_step_stream_event_one_of->data);
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

run_step_stream_event_one_of_t *run_step_stream_event_one_of_parseFromJSON(cJSON *run_step_stream_event_one_ofJSON){

    run_step_stream_event_one_of_t *run_step_stream_event_one_of_local_var = NULL;

    // define the local variable for run_step_stream_event_one_of->data
    run_step_object_t *data_local_nonprim = NULL;

    // run_step_stream_event_one_of->event
    cJSON *event = cJSON_GetObjectItemCaseSensitive(run_step_stream_event_one_ofJSON, "event");
    if (!event) {
        goto end;
    }

    openai_api_run_step_stream_event_one_of_EVENT_e eventVariable;
    
    if(!cJSON_IsString(event))
    {
    goto end; //Enum
    }
    eventVariable = run_step_stream_event_one_of_event_FromString(event->valuestring);

    // run_step_stream_event_one_of->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(run_step_stream_event_one_ofJSON, "data");
    if (!data) {
        goto end;
    }

    
    data_local_nonprim = run_step_object_parseFromJSON(data); //nonprimitive


    run_step_stream_event_one_of_local_var = run_step_stream_event_one_of_create (
        eventVariable,
        data_local_nonprim
        );

    return run_step_stream_event_one_of_local_var;
end:
    if (data_local_nonprim) {
        run_step_object_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
