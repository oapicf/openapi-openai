#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_stream_event_one_of_8.h"


char* run_stream_event_one_of_8_event_ToString(openai_api_run_stream_event_one_of_8_EVENT_e event) {
    char* eventArray[] =  { "NULL", "thread.run.expired" };
    return eventArray[event];
}

openai_api_run_stream_event_one_of_8_EVENT_e run_stream_event_one_of_8_event_FromString(char* event){
    int stringToReturn = 0;
    char *eventArray[] =  { "NULL", "thread.run.expired" };
    size_t sizeofArray = sizeof(eventArray) / sizeof(eventArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(event, eventArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

run_stream_event_one_of_8_t *run_stream_event_one_of_8_create(
    openai_api_run_stream_event_one_of_8_EVENT_e event,
    run_object_t *data
    ) {
    run_stream_event_one_of_8_t *run_stream_event_one_of_8_local_var = malloc(sizeof(run_stream_event_one_of_8_t));
    if (!run_stream_event_one_of_8_local_var) {
        return NULL;
    }
    run_stream_event_one_of_8_local_var->event = event;
    run_stream_event_one_of_8_local_var->data = data;

    return run_stream_event_one_of_8_local_var;
}


void run_stream_event_one_of_8_free(run_stream_event_one_of_8_t *run_stream_event_one_of_8) {
    if(NULL == run_stream_event_one_of_8){
        return ;
    }
    listEntry_t *listEntry;
    if (run_stream_event_one_of_8->data) {
        run_object_free(run_stream_event_one_of_8->data);
        run_stream_event_one_of_8->data = NULL;
    }
    free(run_stream_event_one_of_8);
}

cJSON *run_stream_event_one_of_8_convertToJSON(run_stream_event_one_of_8_t *run_stream_event_one_of_8) {
    cJSON *item = cJSON_CreateObject();

    // run_stream_event_one_of_8->event
    if (openai_api_run_stream_event_one_of_8_EVENT_NULL == run_stream_event_one_of_8->event) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event", eventrun_stream_event_one_of_8_ToString(run_stream_event_one_of_8->event)) == NULL)
    {
    goto fail; //Enum
    }


    // run_stream_event_one_of_8->data
    if (!run_stream_event_one_of_8->data) {
        goto fail;
    }
    cJSON *data_local_JSON = run_object_convertToJSON(run_stream_event_one_of_8->data);
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

run_stream_event_one_of_8_t *run_stream_event_one_of_8_parseFromJSON(cJSON *run_stream_event_one_of_8JSON){

    run_stream_event_one_of_8_t *run_stream_event_one_of_8_local_var = NULL;

    // define the local variable for run_stream_event_one_of_8->data
    run_object_t *data_local_nonprim = NULL;

    // run_stream_event_one_of_8->event
    cJSON *event = cJSON_GetObjectItemCaseSensitive(run_stream_event_one_of_8JSON, "event");
    if (!event) {
        goto end;
    }

    openai_api_run_stream_event_one_of_8_EVENT_e eventVariable;
    
    if(!cJSON_IsString(event))
    {
    goto end; //Enum
    }
    eventVariable = run_stream_event_one_of_8_event_FromString(event->valuestring);

    // run_stream_event_one_of_8->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(run_stream_event_one_of_8JSON, "data");
    if (!data) {
        goto end;
    }

    
    data_local_nonprim = run_object_parseFromJSON(data); //nonprimitive


    run_stream_event_one_of_8_local_var = run_stream_event_one_of_8_create (
        eventVariable,
        data_local_nonprim
        );

    return run_stream_event_one_of_8_local_var;
end:
    if (data_local_nonprim) {
        run_object_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
