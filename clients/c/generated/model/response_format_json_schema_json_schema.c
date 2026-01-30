#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "response_format_json_schema_json_schema.h"



static response_format_json_schema_json_schema_t *response_format_json_schema_json_schema_create_internal(
    char *description,
    char *name,
    list_t* schema,
    int strict
    ) {
    response_format_json_schema_json_schema_t *response_format_json_schema_json_schema_local_var = malloc(sizeof(response_format_json_schema_json_schema_t));
    if (!response_format_json_schema_json_schema_local_var) {
        return NULL;
    }
    response_format_json_schema_json_schema_local_var->description = description;
    response_format_json_schema_json_schema_local_var->name = name;
    response_format_json_schema_json_schema_local_var->schema = schema;
    response_format_json_schema_json_schema_local_var->strict = strict;

    response_format_json_schema_json_schema_local_var->_library_owned = 1;
    return response_format_json_schema_json_schema_local_var;
}

__attribute__((deprecated)) response_format_json_schema_json_schema_t *response_format_json_schema_json_schema_create(
    char *description,
    char *name,
    list_t* schema,
    int strict
    ) {
    return response_format_json_schema_json_schema_create_internal (
        description,
        name,
        schema,
        strict
        );
}

void response_format_json_schema_json_schema_free(response_format_json_schema_json_schema_t *response_format_json_schema_json_schema) {
    if(NULL == response_format_json_schema_json_schema){
        return ;
    }
    if(response_format_json_schema_json_schema->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "response_format_json_schema_json_schema_free");
        return ;
    }
    listEntry_t *listEntry;
    if (response_format_json_schema_json_schema->description) {
        free(response_format_json_schema_json_schema->description);
        response_format_json_schema_json_schema->description = NULL;
    }
    if (response_format_json_schema_json_schema->name) {
        free(response_format_json_schema_json_schema->name);
        response_format_json_schema_json_schema->name = NULL;
    }
    if (response_format_json_schema_json_schema->schema) {
        list_ForEach(listEntry, response_format_json_schema_json_schema->schema) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(response_format_json_schema_json_schema->schema);
        response_format_json_schema_json_schema->schema = NULL;
    }
    free(response_format_json_schema_json_schema);
}

cJSON *response_format_json_schema_json_schema_convertToJSON(response_format_json_schema_json_schema_t *response_format_json_schema_json_schema) {
    cJSON *item = cJSON_CreateObject();

    // response_format_json_schema_json_schema->description
    if(response_format_json_schema_json_schema->description) {
    if(cJSON_AddStringToObject(item, "description", response_format_json_schema_json_schema->description) == NULL) {
    goto fail; //String
    }
    }


    // response_format_json_schema_json_schema->name
    if (!response_format_json_schema_json_schema->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", response_format_json_schema_json_schema->name) == NULL) {
    goto fail; //String
    }


    // response_format_json_schema_json_schema->schema
    if(response_format_json_schema_json_schema->schema) {
    cJSON *schema = cJSON_AddObjectToObject(item, "schema");
    if(schema == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = schema;
    listEntry_t *schemaListEntry;
    if (response_format_json_schema_json_schema->schema) {
    list_ForEach(schemaListEntry, response_format_json_schema_json_schema->schema) {
        keyValuePair_t *localKeyValue = schemaListEntry->data;
    }
    }
    }


    // response_format_json_schema_json_schema->strict
    if(response_format_json_schema_json_schema->strict) {
    if(cJSON_AddBoolToObject(item, "strict", response_format_json_schema_json_schema->strict) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

response_format_json_schema_json_schema_t *response_format_json_schema_json_schema_parseFromJSON(cJSON *response_format_json_schema_json_schemaJSON){

    response_format_json_schema_json_schema_t *response_format_json_schema_json_schema_local_var = NULL;

    // define the local map for response_format_json_schema_json_schema->schema
    list_t *schemaList = NULL;

    // response_format_json_schema_json_schema->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(response_format_json_schema_json_schemaJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // response_format_json_schema_json_schema->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(response_format_json_schema_json_schemaJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // response_format_json_schema_json_schema->schema
    cJSON *schema = cJSON_GetObjectItemCaseSensitive(response_format_json_schema_json_schemaJSON, "schema");
    if (cJSON_IsNull(schema)) {
        schema = NULL;
    }
    if (schema) { 
    cJSON *schema_local_map = NULL;
    if(!cJSON_IsObject(schema) && !cJSON_IsNull(schema))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(schema))
    {
        schemaList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(schema_local_map, schema)
        {
            cJSON *localMapObject = schema_local_map;
            list_addElement(schemaList , localMapKeyPair);
        }
    }
    }

    // response_format_json_schema_json_schema->strict
    cJSON *strict = cJSON_GetObjectItemCaseSensitive(response_format_json_schema_json_schemaJSON, "strict");
    if (cJSON_IsNull(strict)) {
        strict = NULL;
    }
    if (strict) { 
    if(!cJSON_IsBool(strict))
    {
    goto end; //Bool
    }
    }


    response_format_json_schema_json_schema_local_var = response_format_json_schema_json_schema_create_internal (
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        strdup(name->valuestring),
        schema ? schemaList : NULL,
        strict ? strict->valueint : 0
        );

    return response_format_json_schema_json_schema_local_var;
end:
    if (schemaList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, schemaList) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(schemaList);
        schemaList = NULL;
    }
    return NULL;

}
