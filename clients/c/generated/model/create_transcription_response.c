#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_transcription_response.h"



create_transcription_response_t *create_transcription_response_create(
    char *text
    ) {
    create_transcription_response_t *create_transcription_response_local_var = malloc(sizeof(create_transcription_response_t));
    if (!create_transcription_response_local_var) {
        return NULL;
    }
    create_transcription_response_local_var->text = text;

    return create_transcription_response_local_var;
}


void create_transcription_response_free(create_transcription_response_t *create_transcription_response) {
    if(NULL == create_transcription_response){
        return ;
    }
    listEntry_t *listEntry;
    if (create_transcription_response->text) {
        free(create_transcription_response->text);
        create_transcription_response->text = NULL;
    }
    free(create_transcription_response);
}

cJSON *create_transcription_response_convertToJSON(create_transcription_response_t *create_transcription_response) {
    cJSON *item = cJSON_CreateObject();

    // create_transcription_response->text
    if (!create_transcription_response->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", create_transcription_response->text) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_transcription_response_t *create_transcription_response_parseFromJSON(cJSON *create_transcription_responseJSON){

    create_transcription_response_t *create_transcription_response_local_var = NULL;

    // create_transcription_response->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(create_transcription_responseJSON, "text");
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }


    create_transcription_response_local_var = create_transcription_response_create (
        strdup(text->valuestring)
        );

    return create_transcription_response_local_var;
end:
    return NULL;

}
