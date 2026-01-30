#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_client_event_session_update.h"


char* realtime_client_event_session_update_type_ToString(openai_api_realtime_client_event_session_update_TYPE_e type) {
    char* typeArray[] =  { "NULL", "session.update" };
    return typeArray[type];
}

openai_api_realtime_client_event_session_update_TYPE_e realtime_client_event_session_update_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "session.update" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_client_event_session_update_t *realtime_client_event_session_update_create_internal(
    char *event_id,
    openai_api_realtime_client_event_session_update_TYPE_e type,
    realtime_session_create_request_t *session
    ) {
    realtime_client_event_session_update_t *realtime_client_event_session_update_local_var = malloc(sizeof(realtime_client_event_session_update_t));
    if (!realtime_client_event_session_update_local_var) {
        return NULL;
    }
    realtime_client_event_session_update_local_var->event_id = event_id;
    realtime_client_event_session_update_local_var->type = type;
    realtime_client_event_session_update_local_var->session = session;

    realtime_client_event_session_update_local_var->_library_owned = 1;
    return realtime_client_event_session_update_local_var;
}

__attribute__((deprecated)) realtime_client_event_session_update_t *realtime_client_event_session_update_create(
    char *event_id,
    openai_api_realtime_client_event_session_update_TYPE_e type,
    realtime_session_create_request_t *session
    ) {
    return realtime_client_event_session_update_create_internal (
        event_id,
        type,
        session
        );
}

void realtime_client_event_session_update_free(realtime_client_event_session_update_t *realtime_client_event_session_update) {
    if(NULL == realtime_client_event_session_update){
        return ;
    }
    if(realtime_client_event_session_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_client_event_session_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_client_event_session_update->event_id) {
        free(realtime_client_event_session_update->event_id);
        realtime_client_event_session_update->event_id = NULL;
    }
    if (realtime_client_event_session_update->session) {
        realtime_session_create_request_free(realtime_client_event_session_update->session);
        realtime_client_event_session_update->session = NULL;
    }
    free(realtime_client_event_session_update);
}

cJSON *realtime_client_event_session_update_convertToJSON(realtime_client_event_session_update_t *realtime_client_event_session_update) {
    cJSON *item = cJSON_CreateObject();

    // realtime_client_event_session_update->event_id
    if(realtime_client_event_session_update->event_id) {
    if(cJSON_AddStringToObject(item, "event_id", realtime_client_event_session_update->event_id) == NULL) {
    goto fail; //String
    }
    }


    // realtime_client_event_session_update->type
    if (openai_api_realtime_client_event_session_update_TYPE_NULL == realtime_client_event_session_update->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_client_event_session_update_type_ToString(realtime_client_event_session_update->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_client_event_session_update->session
    if (!realtime_client_event_session_update->session) {
        goto fail;
    }
    cJSON *session_local_JSON = realtime_session_create_request_convertToJSON(realtime_client_event_session_update->session);
    if(session_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "session", session_local_JSON);
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

realtime_client_event_session_update_t *realtime_client_event_session_update_parseFromJSON(cJSON *realtime_client_event_session_updateJSON){

    realtime_client_event_session_update_t *realtime_client_event_session_update_local_var = NULL;

    // define the local variable for realtime_client_event_session_update->session
    realtime_session_create_request_t *session_local_nonprim = NULL;

    // realtime_client_event_session_update->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_client_event_session_updateJSON, "event_id");
    if (cJSON_IsNull(event_id)) {
        event_id = NULL;
    }
    if (event_id) { 
    if(!cJSON_IsString(event_id) && !cJSON_IsNull(event_id))
    {
    goto end; //String
    }
    }

    // realtime_client_event_session_update->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_client_event_session_updateJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_client_event_session_update_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_client_event_session_update_type_FromString(type->valuestring);

    // realtime_client_event_session_update->session
    cJSON *session = cJSON_GetObjectItemCaseSensitive(realtime_client_event_session_updateJSON, "session");
    if (cJSON_IsNull(session)) {
        session = NULL;
    }
    if (!session) {
        goto end;
    }

    
    session_local_nonprim = realtime_session_create_request_parseFromJSON(session); //nonprimitive


    realtime_client_event_session_update_local_var = realtime_client_event_session_update_create_internal (
        event_id && !cJSON_IsNull(event_id) ? strdup(event_id->valuestring) : NULL,
        typeVariable,
        session_local_nonprim
        );

    return realtime_client_event_session_update_local_var;
end:
    if (session_local_nonprim) {
        realtime_session_create_request_free(session_local_nonprim);
        session_local_nonprim = NULL;
    }
    return NULL;

}
