#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_content_text_annotations_file_citation_object.h"


char* message_content_text_annotations_file_citation_object_type_ToString(openai_api_message_content_text_annotations_file_citation_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "file_citation" };
    return typeArray[type];
}

openai_api_message_content_text_annotations_file_citation_object_TYPE_e message_content_text_annotations_file_citation_object_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "file_citation" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

message_content_text_annotations_file_citation_object_t *message_content_text_annotations_file_citation_object_create(
    openai_api_message_content_text_annotations_file_citation_object_TYPE_e type,
    char *text,
    message_content_text_annotations_file_citation_object_file_citation_t *file_citation,
    int start_index,
    int end_index
    ) {
    message_content_text_annotations_file_citation_object_t *message_content_text_annotations_file_citation_object_local_var = malloc(sizeof(message_content_text_annotations_file_citation_object_t));
    if (!message_content_text_annotations_file_citation_object_local_var) {
        return NULL;
    }
    message_content_text_annotations_file_citation_object_local_var->type = type;
    message_content_text_annotations_file_citation_object_local_var->text = text;
    message_content_text_annotations_file_citation_object_local_var->file_citation = file_citation;
    message_content_text_annotations_file_citation_object_local_var->start_index = start_index;
    message_content_text_annotations_file_citation_object_local_var->end_index = end_index;

    return message_content_text_annotations_file_citation_object_local_var;
}


void message_content_text_annotations_file_citation_object_free(message_content_text_annotations_file_citation_object_t *message_content_text_annotations_file_citation_object) {
    if(NULL == message_content_text_annotations_file_citation_object){
        return ;
    }
    listEntry_t *listEntry;
    if (message_content_text_annotations_file_citation_object->text) {
        free(message_content_text_annotations_file_citation_object->text);
        message_content_text_annotations_file_citation_object->text = NULL;
    }
    if (message_content_text_annotations_file_citation_object->file_citation) {
        message_content_text_annotations_file_citation_object_file_citation_free(message_content_text_annotations_file_citation_object->file_citation);
        message_content_text_annotations_file_citation_object->file_citation = NULL;
    }
    free(message_content_text_annotations_file_citation_object);
}

cJSON *message_content_text_annotations_file_citation_object_convertToJSON(message_content_text_annotations_file_citation_object_t *message_content_text_annotations_file_citation_object) {
    cJSON *item = cJSON_CreateObject();

    // message_content_text_annotations_file_citation_object->type
    if (openai_api_message_content_text_annotations_file_citation_object_TYPE_NULL == message_content_text_annotations_file_citation_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typemessage_content_text_annotations_file_citation_object_ToString(message_content_text_annotations_file_citation_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // message_content_text_annotations_file_citation_object->text
    if (!message_content_text_annotations_file_citation_object->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", message_content_text_annotations_file_citation_object->text) == NULL) {
    goto fail; //String
    }


    // message_content_text_annotations_file_citation_object->file_citation
    if (!message_content_text_annotations_file_citation_object->file_citation) {
        goto fail;
    }
    cJSON *file_citation_local_JSON = message_content_text_annotations_file_citation_object_file_citation_convertToJSON(message_content_text_annotations_file_citation_object->file_citation);
    if(file_citation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_citation", file_citation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // message_content_text_annotations_file_citation_object->start_index
    if (!message_content_text_annotations_file_citation_object->start_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "start_index", message_content_text_annotations_file_citation_object->start_index) == NULL) {
    goto fail; //Numeric
    }


    // message_content_text_annotations_file_citation_object->end_index
    if (!message_content_text_annotations_file_citation_object->end_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "end_index", message_content_text_annotations_file_citation_object->end_index) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

message_content_text_annotations_file_citation_object_t *message_content_text_annotations_file_citation_object_parseFromJSON(cJSON *message_content_text_annotations_file_citation_objectJSON){

    message_content_text_annotations_file_citation_object_t *message_content_text_annotations_file_citation_object_local_var = NULL;

    // define the local variable for message_content_text_annotations_file_citation_object->file_citation
    message_content_text_annotations_file_citation_object_file_citation_t *file_citation_local_nonprim = NULL;

    // message_content_text_annotations_file_citation_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(message_content_text_annotations_file_citation_objectJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_message_content_text_annotations_file_citation_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = message_content_text_annotations_file_citation_object_type_FromString(type->valuestring);

    // message_content_text_annotations_file_citation_object->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(message_content_text_annotations_file_citation_objectJSON, "text");
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }

    // message_content_text_annotations_file_citation_object->file_citation
    cJSON *file_citation = cJSON_GetObjectItemCaseSensitive(message_content_text_annotations_file_citation_objectJSON, "file_citation");
    if (!file_citation) {
        goto end;
    }

    
    file_citation_local_nonprim = message_content_text_annotations_file_citation_object_file_citation_parseFromJSON(file_citation); //nonprimitive

    // message_content_text_annotations_file_citation_object->start_index
    cJSON *start_index = cJSON_GetObjectItemCaseSensitive(message_content_text_annotations_file_citation_objectJSON, "start_index");
    if (!start_index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(start_index))
    {
    goto end; //Numeric
    }

    // message_content_text_annotations_file_citation_object->end_index
    cJSON *end_index = cJSON_GetObjectItemCaseSensitive(message_content_text_annotations_file_citation_objectJSON, "end_index");
    if (!end_index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(end_index))
    {
    goto end; //Numeric
    }


    message_content_text_annotations_file_citation_object_local_var = message_content_text_annotations_file_citation_object_create (
        typeVariable,
        strdup(text->valuestring),
        file_citation_local_nonprim,
        start_index->valuedouble,
        end_index->valuedouble
        );

    return message_content_text_annotations_file_citation_object_local_var;
end:
    if (file_citation_local_nonprim) {
        message_content_text_annotations_file_citation_object_file_citation_free(file_citation_local_nonprim);
        file_citation_local_nonprim = NULL;
    }
    return NULL;

}
