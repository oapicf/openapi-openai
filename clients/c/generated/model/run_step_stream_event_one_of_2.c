#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_stream_event_one_of_2.h"


char* run_step_stream_event_one_of_2_event_ToString(openai_api_run_step_stream_event_one_of_2_EVENT_e event) {
    char* eventArray[] =  { "NULL", "thread.run.step.delta" };
    return eventArray[event];
}

openai_api_run_step_stream_event_one_of_2_EVENT_e run_step_stream_event_one_of_2_event_FromString(char* event){
    int stringToReturn = 0;
    char *eventArray[] =  { "NULL", "thread.run.step.delta" };
    size_t sizeofArray = sizeof(eventArray) / sizeof(eventArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(event, eventArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

run_step_stream_event_one_of_2_t *run_step_stream_event_one_of_2_create(
    openai_api_run_step_stream_event_one_of_2_EVENT_e event,
    run_step_delta_object_t *data
    ) {
    run_step_stream_event_one_of_2_t *run_step_stream_event_one_of_2_local_var = malloc(sizeof(run_step_stream_event_one_of_2_t));
    if (!run_step_stream_event_one_of_2_local_var) {
        return NULL;
    }
    run_step_stream_event_one_of_2_local_var->event = event;
    run_step_stream_event_one_of_2_local_var->data = data;

    return run_step_stream_event_one_of_2_local_var;
}


void run_step_stream_event_one_of_2_free(run_step_stream_event_one_of_2_t *run_step_stream_event_one_of_2) {
    if(NULL == run_step_stream_event_one_of_2){
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_stream_event_one_of_2->data) {
        run_step_delta_object_free(run_step_stream_event_one_of_2->data);
        run_step_stream_event_one_of_2->data = NULL;
    }
    free(run_step_stream_event_one_of_2);
}

cJSON *run_step_stream_event_one_of_2_convertToJSON(run_step_stream_event_one_of_2_t *run_step_stream_event_one_of_2) {
    cJSON *item = cJSON_CreateObject();

    // run_step_stream_event_one_of_2->event
    if (openai_api_run_step_stream_event_one_of_2_EVENT_NULL == run_step_stream_event_one_of_2->event) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event", eventrun_step_stream_event_one_of_2_ToString(run_step_stream_event_one_of_2->event)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_stream_event_one_of_2->data
    if (!run_step_stream_event_one_of_2->data) {
        goto fail;
    }
    cJSON *data_local_JSON = run_step_delta_object_convertToJSON(run_step_stream_event_one_of_2->data);
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

run_step_stream_event_one_of_2_t *run_step_stream_event_one_of_2_parseFromJSON(cJSON *run_step_stream_event_one_of_2JSON){

    run_step_stream_event_one_of_2_t *run_step_stream_event_one_of_2_local_var = NULL;

    // define the local variable for run_step_stream_event_one_of_2->data
    run_step_delta_object_t *data_local_nonprim = NULL;

    // run_step_stream_event_one_of_2->event
    cJSON *event = cJSON_GetObjectItemCaseSensitive(run_step_stream_event_one_of_2JSON, "event");
    if (!event) {
        goto end;
    }

    openai_api_run_step_stream_event_one_of_2_EVENT_e eventVariable;
    
    if(!cJSON_IsString(event))
    {
    goto end; //Enum
    }
    eventVariable = run_step_stream_event_one_of_2_event_FromString(event->valuestring);

    // run_step_stream_event_one_of_2->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(run_step_stream_event_one_of_2JSON, "data");
    if (!data) {
        goto end;
    }

    
    data_local_nonprim = run_step_delta_object_parseFromJSON(data); //nonprimitive


    run_step_stream_event_one_of_2_local_var = run_step_stream_event_one_of_2_create (
        eventVariable,
        data_local_nonprim
        );

    return run_step_stream_event_one_of_2_local_var;
end:
    if (data_local_nonprim) {
        run_step_delta_object_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
