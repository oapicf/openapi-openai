#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_moderation_response_results_inner_category_applied_input_types.h"


char* create_moderation_response_results_inner_category_applied_input_types_hate_ToString(openai_api_create_moderation_response_results_inner_category_applied_input_types_HATE_e hate) {
    char *hateArray[] =  { "NULL", "text" };
    return hateArray[hate - 1];
}

openai_api_create_moderation_response_results_inner_category_applied_input_types_HATE_e create_moderation_response_results_inner_category_applied_input_types_hate_FromString(char* hate) {
    int stringToReturn = 0;
    char *hateArray[] =  { "NULL", "text" };
    size_t sizeofArray = sizeof(hateArray) / sizeof(hateArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(hate, hateArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_moderation_response_results_inner_category_applied_input_types_hate_threatening_ToString(openai_api_create_moderation_response_results_inner_category_applied_input_types_HATETHREATENING_e hate_threatening) {
    char *hate_threateningArray[] =  { "NULL", "text" };
    return hate_threateningArray[hate_threatening - 1];
}

openai_api_create_moderation_response_results_inner_category_applied_input_types_HATETHREATENING_e create_moderation_response_results_inner_category_applied_input_types_hate_threatening_FromString(char* hate_threatening) {
    int stringToReturn = 0;
    char *hate_threateningArray[] =  { "NULL", "text" };
    size_t sizeofArray = sizeof(hate_threateningArray) / sizeof(hate_threateningArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(hate_threatening, hate_threateningArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_moderation_response_results_inner_category_applied_input_types_harassment_ToString(openai_api_create_moderation_response_results_inner_category_applied_input_types_HARASSMENT_e harassment) {
    char *harassmentArray[] =  { "NULL", "text" };
    return harassmentArray[harassment - 1];
}

openai_api_create_moderation_response_results_inner_category_applied_input_types_HARASSMENT_e create_moderation_response_results_inner_category_applied_input_types_harassment_FromString(char* harassment) {
    int stringToReturn = 0;
    char *harassmentArray[] =  { "NULL", "text" };
    size_t sizeofArray = sizeof(harassmentArray) / sizeof(harassmentArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(harassment, harassmentArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_moderation_response_results_inner_category_applied_input_types_harassment_threatening_ToString(openai_api_create_moderation_response_results_inner_category_applied_input_types_HARASSMENTTHREATENING_e harassment_threatening) {
    char *harassment_threateningArray[] =  { "NULL", "text" };
    return harassment_threateningArray[harassment_threatening - 1];
}

openai_api_create_moderation_response_results_inner_category_applied_input_types_HARASSMENTTHREATENING_e create_moderation_response_results_inner_category_applied_input_types_harassment_threatening_FromString(char* harassment_threatening) {
    int stringToReturn = 0;
    char *harassment_threateningArray[] =  { "NULL", "text" };
    size_t sizeofArray = sizeof(harassment_threateningArray) / sizeof(harassment_threateningArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(harassment_threatening, harassment_threateningArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_moderation_response_results_inner_category_applied_input_types_illicit_ToString(openai_api_create_moderation_response_results_inner_category_applied_input_types_ILLICIT_e illicit) {
    char *illicitArray[] =  { "NULL", "text" };
    return illicitArray[illicit - 1];
}

openai_api_create_moderation_response_results_inner_category_applied_input_types_ILLICIT_e create_moderation_response_results_inner_category_applied_input_types_illicit_FromString(char* illicit) {
    int stringToReturn = 0;
    char *illicitArray[] =  { "NULL", "text" };
    size_t sizeofArray = sizeof(illicitArray) / sizeof(illicitArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(illicit, illicitArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_moderation_response_results_inner_category_applied_input_types_illicit_violent_ToString(openai_api_create_moderation_response_results_inner_category_applied_input_types_ILLICITVIOLENT_e illicit_violent) {
    char *illicit_violentArray[] =  { "NULL", "text" };
    return illicit_violentArray[illicit_violent - 1];
}

openai_api_create_moderation_response_results_inner_category_applied_input_types_ILLICITVIOLENT_e create_moderation_response_results_inner_category_applied_input_types_illicit_violent_FromString(char* illicit_violent) {
    int stringToReturn = 0;
    char *illicit_violentArray[] =  { "NULL", "text" };
    size_t sizeofArray = sizeof(illicit_violentArray) / sizeof(illicit_violentArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(illicit_violent, illicit_violentArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_moderation_response_results_inner_category_applied_input_types_self_harm_ToString(openai_api_create_moderation_response_results_inner_category_applied_input_types_SELFHARM_e self_harm) {
    char *self_harmArray[] =  { "NULL", "text", "image" };
    return self_harmArray[self_harm - 1];
}

openai_api_create_moderation_response_results_inner_category_applied_input_types_SELFHARM_e create_moderation_response_results_inner_category_applied_input_types_self_harm_FromString(char* self_harm) {
    int stringToReturn = 0;
    char *self_harmArray[] =  { "NULL", "text", "image" };
    size_t sizeofArray = sizeof(self_harmArray) / sizeof(self_harmArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(self_harm, self_harmArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_moderation_response_results_inner_category_applied_input_types_self_harm_intent_ToString(openai_api_create_moderation_response_results_inner_category_applied_input_types_SELFHARMINTENT_e self_harm_intent) {
    char *self_harm_intentArray[] =  { "NULL", "text", "image" };
    return self_harm_intentArray[self_harm_intent - 1];
}

openai_api_create_moderation_response_results_inner_category_applied_input_types_SELFHARMINTENT_e create_moderation_response_results_inner_category_applied_input_types_self_harm_intent_FromString(char* self_harm_intent) {
    int stringToReturn = 0;
    char *self_harm_intentArray[] =  { "NULL", "text", "image" };
    size_t sizeofArray = sizeof(self_harm_intentArray) / sizeof(self_harm_intentArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(self_harm_intent, self_harm_intentArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_moderation_response_results_inner_category_applied_input_types_self_harm_instructions_ToString(openai_api_create_moderation_response_results_inner_category_applied_input_types_SELFHARMINSTRUCTIONS_e self_harm_instructions) {
    char *self_harm_instructionsArray[] =  { "NULL", "text", "image" };
    return self_harm_instructionsArray[self_harm_instructions - 1];
}

openai_api_create_moderation_response_results_inner_category_applied_input_types_SELFHARMINSTRUCTIONS_e create_moderation_response_results_inner_category_applied_input_types_self_harm_instructions_FromString(char* self_harm_instructions) {
    int stringToReturn = 0;
    char *self_harm_instructionsArray[] =  { "NULL", "text", "image" };
    size_t sizeofArray = sizeof(self_harm_instructionsArray) / sizeof(self_harm_instructionsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(self_harm_instructions, self_harm_instructionsArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_moderation_response_results_inner_category_applied_input_types_sexual_ToString(openai_api_create_moderation_response_results_inner_category_applied_input_types_SEXUAL_e sexual) {
    char *sexualArray[] =  { "NULL", "text", "image" };
    return sexualArray[sexual - 1];
}

openai_api_create_moderation_response_results_inner_category_applied_input_types_SEXUAL_e create_moderation_response_results_inner_category_applied_input_types_sexual_FromString(char* sexual) {
    int stringToReturn = 0;
    char *sexualArray[] =  { "NULL", "text", "image" };
    size_t sizeofArray = sizeof(sexualArray) / sizeof(sexualArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(sexual, sexualArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_moderation_response_results_inner_category_applied_input_types_sexual_minors_ToString(openai_api_create_moderation_response_results_inner_category_applied_input_types_SEXUALMINORS_e sexual_minors) {
    char *sexual_minorsArray[] =  { "NULL", "text" };
    return sexual_minorsArray[sexual_minors - 1];
}

openai_api_create_moderation_response_results_inner_category_applied_input_types_SEXUALMINORS_e create_moderation_response_results_inner_category_applied_input_types_sexual_minors_FromString(char* sexual_minors) {
    int stringToReturn = 0;
    char *sexual_minorsArray[] =  { "NULL", "text" };
    size_t sizeofArray = sizeof(sexual_minorsArray) / sizeof(sexual_minorsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(sexual_minors, sexual_minorsArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_moderation_response_results_inner_category_applied_input_types_violence_ToString(openai_api_create_moderation_response_results_inner_category_applied_input_types_VIOLENCE_e violence) {
    char *violenceArray[] =  { "NULL", "text", "image" };
    return violenceArray[violence - 1];
}

openai_api_create_moderation_response_results_inner_category_applied_input_types_VIOLENCE_e create_moderation_response_results_inner_category_applied_input_types_violence_FromString(char* violence) {
    int stringToReturn = 0;
    char *violenceArray[] =  { "NULL", "text", "image" };
    size_t sizeofArray = sizeof(violenceArray) / sizeof(violenceArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(violence, violenceArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_moderation_response_results_inner_category_applied_input_types_violence_graphic_ToString(openai_api_create_moderation_response_results_inner_category_applied_input_types_VIOLENCEGRAPHIC_e violence_graphic) {
    char *violence_graphicArray[] =  { "NULL", "text", "image" };
    return violence_graphicArray[violence_graphic - 1];
}

openai_api_create_moderation_response_results_inner_category_applied_input_types_VIOLENCEGRAPHIC_e create_moderation_response_results_inner_category_applied_input_types_violence_graphic_FromString(char* violence_graphic) {
    int stringToReturn = 0;
    char *violence_graphicArray[] =  { "NULL", "text", "image" };
    size_t sizeofArray = sizeof(violence_graphicArray) / sizeof(violence_graphicArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(violence_graphic, violence_graphicArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static create_moderation_response_results_inner_category_applied_input_types_t *create_moderation_response_results_inner_category_applied_input_types_create_internal(
    list_t *hate,
    list_t *hate_threatening,
    list_t *harassment,
    list_t *harassment_threatening,
    list_t *illicit,
    list_t *illicit_violent,
    list_t *self_harm,
    list_t *self_harm_intent,
    list_t *self_harm_instructions,
    list_t *sexual,
    list_t *sexual_minors,
    list_t *violence,
    list_t *violence_graphic
    ) {
    create_moderation_response_results_inner_category_applied_input_types_t *create_moderation_response_results_inner_category_applied_input_types_local_var = malloc(sizeof(create_moderation_response_results_inner_category_applied_input_types_t));
    if (!create_moderation_response_results_inner_category_applied_input_types_local_var) {
        return NULL;
    }
    create_moderation_response_results_inner_category_applied_input_types_local_var->hate = hate;
    create_moderation_response_results_inner_category_applied_input_types_local_var->hate_threatening = hate_threatening;
    create_moderation_response_results_inner_category_applied_input_types_local_var->harassment = harassment;
    create_moderation_response_results_inner_category_applied_input_types_local_var->harassment_threatening = harassment_threatening;
    create_moderation_response_results_inner_category_applied_input_types_local_var->illicit = illicit;
    create_moderation_response_results_inner_category_applied_input_types_local_var->illicit_violent = illicit_violent;
    create_moderation_response_results_inner_category_applied_input_types_local_var->self_harm = self_harm;
    create_moderation_response_results_inner_category_applied_input_types_local_var->self_harm_intent = self_harm_intent;
    create_moderation_response_results_inner_category_applied_input_types_local_var->self_harm_instructions = self_harm_instructions;
    create_moderation_response_results_inner_category_applied_input_types_local_var->sexual = sexual;
    create_moderation_response_results_inner_category_applied_input_types_local_var->sexual_minors = sexual_minors;
    create_moderation_response_results_inner_category_applied_input_types_local_var->violence = violence;
    create_moderation_response_results_inner_category_applied_input_types_local_var->violence_graphic = violence_graphic;

    create_moderation_response_results_inner_category_applied_input_types_local_var->_library_owned = 1;
    return create_moderation_response_results_inner_category_applied_input_types_local_var;
}

__attribute__((deprecated)) create_moderation_response_results_inner_category_applied_input_types_t *create_moderation_response_results_inner_category_applied_input_types_create(
    list_t *hate,
    list_t *hate_threatening,
    list_t *harassment,
    list_t *harassment_threatening,
    list_t *illicit,
    list_t *illicit_violent,
    list_t *self_harm,
    list_t *self_harm_intent,
    list_t *self_harm_instructions,
    list_t *sexual,
    list_t *sexual_minors,
    list_t *violence,
    list_t *violence_graphic
    ) {
    return create_moderation_response_results_inner_category_applied_input_types_create_internal (
        hate,
        hate_threatening,
        harassment,
        harassment_threatening,
        illicit,
        illicit_violent,
        self_harm,
        self_harm_intent,
        self_harm_instructions,
        sexual,
        sexual_minors,
        violence,
        violence_graphic
        );
}

void create_moderation_response_results_inner_category_applied_input_types_free(create_moderation_response_results_inner_category_applied_input_types_t *create_moderation_response_results_inner_category_applied_input_types) {
    if(NULL == create_moderation_response_results_inner_category_applied_input_types){
        return ;
    }
    if(create_moderation_response_results_inner_category_applied_input_types->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_moderation_response_results_inner_category_applied_input_types_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_moderation_response_results_inner_category_applied_input_types->hate) {
        list_ForEach(listEntry, create_moderation_response_results_inner_category_applied_input_types->hate) {
            free(listEntry->data);
        }
        list_freeList(create_moderation_response_results_inner_category_applied_input_types->hate);
        create_moderation_response_results_inner_category_applied_input_types->hate = NULL;
    }
    if (create_moderation_response_results_inner_category_applied_input_types->hate_threatening) {
        list_ForEach(listEntry, create_moderation_response_results_inner_category_applied_input_types->hate_threatening) {
            free(listEntry->data);
        }
        list_freeList(create_moderation_response_results_inner_category_applied_input_types->hate_threatening);
        create_moderation_response_results_inner_category_applied_input_types->hate_threatening = NULL;
    }
    if (create_moderation_response_results_inner_category_applied_input_types->harassment) {
        list_ForEach(listEntry, create_moderation_response_results_inner_category_applied_input_types->harassment) {
            free(listEntry->data);
        }
        list_freeList(create_moderation_response_results_inner_category_applied_input_types->harassment);
        create_moderation_response_results_inner_category_applied_input_types->harassment = NULL;
    }
    if (create_moderation_response_results_inner_category_applied_input_types->harassment_threatening) {
        list_ForEach(listEntry, create_moderation_response_results_inner_category_applied_input_types->harassment_threatening) {
            free(listEntry->data);
        }
        list_freeList(create_moderation_response_results_inner_category_applied_input_types->harassment_threatening);
        create_moderation_response_results_inner_category_applied_input_types->harassment_threatening = NULL;
    }
    if (create_moderation_response_results_inner_category_applied_input_types->illicit) {
        list_ForEach(listEntry, create_moderation_response_results_inner_category_applied_input_types->illicit) {
            free(listEntry->data);
        }
        list_freeList(create_moderation_response_results_inner_category_applied_input_types->illicit);
        create_moderation_response_results_inner_category_applied_input_types->illicit = NULL;
    }
    if (create_moderation_response_results_inner_category_applied_input_types->illicit_violent) {
        list_ForEach(listEntry, create_moderation_response_results_inner_category_applied_input_types->illicit_violent) {
            free(listEntry->data);
        }
        list_freeList(create_moderation_response_results_inner_category_applied_input_types->illicit_violent);
        create_moderation_response_results_inner_category_applied_input_types->illicit_violent = NULL;
    }
    if (create_moderation_response_results_inner_category_applied_input_types->self_harm) {
        list_ForEach(listEntry, create_moderation_response_results_inner_category_applied_input_types->self_harm) {
            free(listEntry->data);
        }
        list_freeList(create_moderation_response_results_inner_category_applied_input_types->self_harm);
        create_moderation_response_results_inner_category_applied_input_types->self_harm = NULL;
    }
    if (create_moderation_response_results_inner_category_applied_input_types->self_harm_intent) {
        list_ForEach(listEntry, create_moderation_response_results_inner_category_applied_input_types->self_harm_intent) {
            free(listEntry->data);
        }
        list_freeList(create_moderation_response_results_inner_category_applied_input_types->self_harm_intent);
        create_moderation_response_results_inner_category_applied_input_types->self_harm_intent = NULL;
    }
    if (create_moderation_response_results_inner_category_applied_input_types->self_harm_instructions) {
        list_ForEach(listEntry, create_moderation_response_results_inner_category_applied_input_types->self_harm_instructions) {
            free(listEntry->data);
        }
        list_freeList(create_moderation_response_results_inner_category_applied_input_types->self_harm_instructions);
        create_moderation_response_results_inner_category_applied_input_types->self_harm_instructions = NULL;
    }
    if (create_moderation_response_results_inner_category_applied_input_types->sexual) {
        list_ForEach(listEntry, create_moderation_response_results_inner_category_applied_input_types->sexual) {
            free(listEntry->data);
        }
        list_freeList(create_moderation_response_results_inner_category_applied_input_types->sexual);
        create_moderation_response_results_inner_category_applied_input_types->sexual = NULL;
    }
    if (create_moderation_response_results_inner_category_applied_input_types->sexual_minors) {
        list_ForEach(listEntry, create_moderation_response_results_inner_category_applied_input_types->sexual_minors) {
            free(listEntry->data);
        }
        list_freeList(create_moderation_response_results_inner_category_applied_input_types->sexual_minors);
        create_moderation_response_results_inner_category_applied_input_types->sexual_minors = NULL;
    }
    if (create_moderation_response_results_inner_category_applied_input_types->violence) {
        list_ForEach(listEntry, create_moderation_response_results_inner_category_applied_input_types->violence) {
            free(listEntry->data);
        }
        list_freeList(create_moderation_response_results_inner_category_applied_input_types->violence);
        create_moderation_response_results_inner_category_applied_input_types->violence = NULL;
    }
    if (create_moderation_response_results_inner_category_applied_input_types->violence_graphic) {
        list_ForEach(listEntry, create_moderation_response_results_inner_category_applied_input_types->violence_graphic) {
            free(listEntry->data);
        }
        list_freeList(create_moderation_response_results_inner_category_applied_input_types->violence_graphic);
        create_moderation_response_results_inner_category_applied_input_types->violence_graphic = NULL;
    }
    free(create_moderation_response_results_inner_category_applied_input_types);
}

cJSON *create_moderation_response_results_inner_category_applied_input_types_convertToJSON(create_moderation_response_results_inner_category_applied_input_types_t *create_moderation_response_results_inner_category_applied_input_types) {
    cJSON *item = cJSON_CreateObject();

    // create_moderation_response_results_inner_category_applied_input_types->hate
    if (openai_api_create_moderation_response_results_inner_category_applied_input_types_HATE_NULL == create_moderation_response_results_inner_category_applied_input_types->hate) {
        goto fail;
    }
    cJSON *hate = cJSON_AddArrayToObject(item, "hate");
    if(hate == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *hateListEntry;
    list_ForEach(hateListEntry, create_moderation_response_results_inner_category_applied_input_types->hate) {
    if(cJSON_AddStringToObject(hate, "", hateListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // create_moderation_response_results_inner_category_applied_input_types->hate_threatening
    if (openai_api_create_moderation_response_results_inner_category_applied_input_types_HATETHREATENING_NULL == create_moderation_response_results_inner_category_applied_input_types->hate_threatening) {
        goto fail;
    }
    cJSON *hate_threatening = cJSON_AddArrayToObject(item, "hate/threatening");
    if(hate_threatening == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *hate_threateningListEntry;
    list_ForEach(hate_threateningListEntry, create_moderation_response_results_inner_category_applied_input_types->hate_threatening) {
    if(cJSON_AddStringToObject(hate_threatening, "", hate_threateningListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // create_moderation_response_results_inner_category_applied_input_types->harassment
    if (openai_api_create_moderation_response_results_inner_category_applied_input_types_HARASSMENT_NULL == create_moderation_response_results_inner_category_applied_input_types->harassment) {
        goto fail;
    }
    cJSON *harassment = cJSON_AddArrayToObject(item, "harassment");
    if(harassment == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *harassmentListEntry;
    list_ForEach(harassmentListEntry, create_moderation_response_results_inner_category_applied_input_types->harassment) {
    if(cJSON_AddStringToObject(harassment, "", harassmentListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // create_moderation_response_results_inner_category_applied_input_types->harassment_threatening
    if (openai_api_create_moderation_response_results_inner_category_applied_input_types_HARASSMENTTHREATENING_NULL == create_moderation_response_results_inner_category_applied_input_types->harassment_threatening) {
        goto fail;
    }
    cJSON *harassment_threatening = cJSON_AddArrayToObject(item, "harassment/threatening");
    if(harassment_threatening == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *harassment_threateningListEntry;
    list_ForEach(harassment_threateningListEntry, create_moderation_response_results_inner_category_applied_input_types->harassment_threatening) {
    if(cJSON_AddStringToObject(harassment_threatening, "", harassment_threateningListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // create_moderation_response_results_inner_category_applied_input_types->illicit
    if (openai_api_create_moderation_response_results_inner_category_applied_input_types_ILLICIT_NULL == create_moderation_response_results_inner_category_applied_input_types->illicit) {
        goto fail;
    }
    cJSON *illicit = cJSON_AddArrayToObject(item, "illicit");
    if(illicit == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *illicitListEntry;
    list_ForEach(illicitListEntry, create_moderation_response_results_inner_category_applied_input_types->illicit) {
    if(cJSON_AddStringToObject(illicit, "", illicitListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // create_moderation_response_results_inner_category_applied_input_types->illicit_violent
    if (openai_api_create_moderation_response_results_inner_category_applied_input_types_ILLICITVIOLENT_NULL == create_moderation_response_results_inner_category_applied_input_types->illicit_violent) {
        goto fail;
    }
    cJSON *illicit_violent = cJSON_AddArrayToObject(item, "illicit/violent");
    if(illicit_violent == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *illicit_violentListEntry;
    list_ForEach(illicit_violentListEntry, create_moderation_response_results_inner_category_applied_input_types->illicit_violent) {
    if(cJSON_AddStringToObject(illicit_violent, "", illicit_violentListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // create_moderation_response_results_inner_category_applied_input_types->self_harm
    if (openai_api_create_moderation_response_results_inner_category_applied_input_types_SELFHARM_NULL == create_moderation_response_results_inner_category_applied_input_types->self_harm) {
        goto fail;
    }
    cJSON *self_harm = cJSON_AddArrayToObject(item, "self-harm");
    if(self_harm == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *self_harmListEntry;
    list_ForEach(self_harmListEntry, create_moderation_response_results_inner_category_applied_input_types->self_harm) {
    if(cJSON_AddStringToObject(self_harm, "", self_harmListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // create_moderation_response_results_inner_category_applied_input_types->self_harm_intent
    if (openai_api_create_moderation_response_results_inner_category_applied_input_types_SELFHARMINTENT_NULL == create_moderation_response_results_inner_category_applied_input_types->self_harm_intent) {
        goto fail;
    }
    cJSON *self_harm_intent = cJSON_AddArrayToObject(item, "self-harm/intent");
    if(self_harm_intent == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *self_harm_intentListEntry;
    list_ForEach(self_harm_intentListEntry, create_moderation_response_results_inner_category_applied_input_types->self_harm_intent) {
    if(cJSON_AddStringToObject(self_harm_intent, "", self_harm_intentListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // create_moderation_response_results_inner_category_applied_input_types->self_harm_instructions
    if (openai_api_create_moderation_response_results_inner_category_applied_input_types_SELFHARMINSTRUCTIONS_NULL == create_moderation_response_results_inner_category_applied_input_types->self_harm_instructions) {
        goto fail;
    }
    cJSON *self_harm_instructions = cJSON_AddArrayToObject(item, "self-harm/instructions");
    if(self_harm_instructions == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *self_harm_instructionsListEntry;
    list_ForEach(self_harm_instructionsListEntry, create_moderation_response_results_inner_category_applied_input_types->self_harm_instructions) {
    if(cJSON_AddStringToObject(self_harm_instructions, "", self_harm_instructionsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // create_moderation_response_results_inner_category_applied_input_types->sexual
    if (openai_api_create_moderation_response_results_inner_category_applied_input_types_SEXUAL_NULL == create_moderation_response_results_inner_category_applied_input_types->sexual) {
        goto fail;
    }
    cJSON *sexual = cJSON_AddArrayToObject(item, "sexual");
    if(sexual == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *sexualListEntry;
    list_ForEach(sexualListEntry, create_moderation_response_results_inner_category_applied_input_types->sexual) {
    if(cJSON_AddStringToObject(sexual, "", sexualListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // create_moderation_response_results_inner_category_applied_input_types->sexual_minors
    if (openai_api_create_moderation_response_results_inner_category_applied_input_types_SEXUALMINORS_NULL == create_moderation_response_results_inner_category_applied_input_types->sexual_minors) {
        goto fail;
    }
    cJSON *sexual_minors = cJSON_AddArrayToObject(item, "sexual/minors");
    if(sexual_minors == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *sexual_minorsListEntry;
    list_ForEach(sexual_minorsListEntry, create_moderation_response_results_inner_category_applied_input_types->sexual_minors) {
    if(cJSON_AddStringToObject(sexual_minors, "", sexual_minorsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // create_moderation_response_results_inner_category_applied_input_types->violence
    if (openai_api_create_moderation_response_results_inner_category_applied_input_types_VIOLENCE_NULL == create_moderation_response_results_inner_category_applied_input_types->violence) {
        goto fail;
    }
    cJSON *violence = cJSON_AddArrayToObject(item, "violence");
    if(violence == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *violenceListEntry;
    list_ForEach(violenceListEntry, create_moderation_response_results_inner_category_applied_input_types->violence) {
    if(cJSON_AddStringToObject(violence, "", violenceListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // create_moderation_response_results_inner_category_applied_input_types->violence_graphic
    if (openai_api_create_moderation_response_results_inner_category_applied_input_types_VIOLENCEGRAPHIC_NULL == create_moderation_response_results_inner_category_applied_input_types->violence_graphic) {
        goto fail;
    }
    cJSON *violence_graphic = cJSON_AddArrayToObject(item, "violence/graphic");
    if(violence_graphic == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *violence_graphicListEntry;
    list_ForEach(violence_graphicListEntry, create_moderation_response_results_inner_category_applied_input_types->violence_graphic) {
    if(cJSON_AddStringToObject(violence_graphic, "", violence_graphicListEntry->data) == NULL)
    {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_moderation_response_results_inner_category_applied_input_types_t *create_moderation_response_results_inner_category_applied_input_types_parseFromJSON(cJSON *create_moderation_response_results_inner_category_applied_input_typesJSON){

    create_moderation_response_results_inner_category_applied_input_types_t *create_moderation_response_results_inner_category_applied_input_types_local_var = NULL;

    // define the local list for create_moderation_response_results_inner_category_applied_input_types->hate
    list_t *hateList = NULL;

    // define the local list for create_moderation_response_results_inner_category_applied_input_types->hate_threatening
    list_t *hate_threateningList = NULL;

    // define the local list for create_moderation_response_results_inner_category_applied_input_types->harassment
    list_t *harassmentList = NULL;

    // define the local list for create_moderation_response_results_inner_category_applied_input_types->harassment_threatening
    list_t *harassment_threateningList = NULL;

    // define the local list for create_moderation_response_results_inner_category_applied_input_types->illicit
    list_t *illicitList = NULL;

    // define the local list for create_moderation_response_results_inner_category_applied_input_types->illicit_violent
    list_t *illicit_violentList = NULL;

    // define the local list for create_moderation_response_results_inner_category_applied_input_types->self_harm
    list_t *self_harmList = NULL;

    // define the local list for create_moderation_response_results_inner_category_applied_input_types->self_harm_intent
    list_t *self_harm_intentList = NULL;

    // define the local list for create_moderation_response_results_inner_category_applied_input_types->self_harm_instructions
    list_t *self_harm_instructionsList = NULL;

    // define the local list for create_moderation_response_results_inner_category_applied_input_types->sexual
    list_t *sexualList = NULL;

    // define the local list for create_moderation_response_results_inner_category_applied_input_types->sexual_minors
    list_t *sexual_minorsList = NULL;

    // define the local list for create_moderation_response_results_inner_category_applied_input_types->violence
    list_t *violenceList = NULL;

    // define the local list for create_moderation_response_results_inner_category_applied_input_types->violence_graphic
    list_t *violence_graphicList = NULL;

    // create_moderation_response_results_inner_category_applied_input_types->hate
    cJSON *hate = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_applied_input_typesJSON, "hate");
    if (cJSON_IsNull(hate)) {
        hate = NULL;
    }
    if (!hate) {
        goto end;
    }

    
    cJSON *hate_local = NULL;
    if(!cJSON_IsArray(hate)) {
        goto end;//primitive container
    }
    hateList = list_createList();

    cJSON_ArrayForEach(hate_local, hate)
    {
        if(!cJSON_IsString(hate_local))
        {
            goto end;
        }
        list_addElement(hateList , strdup(hate_local->valuestring));
    }

    // create_moderation_response_results_inner_category_applied_input_types->hate_threatening
    cJSON *hate_threatening = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_applied_input_typesJSON, "hate/threatening");
    if (cJSON_IsNull(hate_threatening)) {
        hate_threatening = NULL;
    }
    if (!hate_threatening) {
        goto end;
    }

    
    cJSON *hate_threatening_local = NULL;
    if(!cJSON_IsArray(hate_threatening)) {
        goto end;//primitive container
    }
    hate_threateningList = list_createList();

    cJSON_ArrayForEach(hate_threatening_local, hate_threatening)
    {
        if(!cJSON_IsString(hate_threatening_local))
        {
            goto end;
        }
        list_addElement(hate_threateningList , strdup(hate_threatening_local->valuestring));
    }

    // create_moderation_response_results_inner_category_applied_input_types->harassment
    cJSON *harassment = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_applied_input_typesJSON, "harassment");
    if (cJSON_IsNull(harassment)) {
        harassment = NULL;
    }
    if (!harassment) {
        goto end;
    }

    
    cJSON *harassment_local = NULL;
    if(!cJSON_IsArray(harassment)) {
        goto end;//primitive container
    }
    harassmentList = list_createList();

    cJSON_ArrayForEach(harassment_local, harassment)
    {
        if(!cJSON_IsString(harassment_local))
        {
            goto end;
        }
        list_addElement(harassmentList , strdup(harassment_local->valuestring));
    }

    // create_moderation_response_results_inner_category_applied_input_types->harassment_threatening
    cJSON *harassment_threatening = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_applied_input_typesJSON, "harassment/threatening");
    if (cJSON_IsNull(harassment_threatening)) {
        harassment_threatening = NULL;
    }
    if (!harassment_threatening) {
        goto end;
    }

    
    cJSON *harassment_threatening_local = NULL;
    if(!cJSON_IsArray(harassment_threatening)) {
        goto end;//primitive container
    }
    harassment_threateningList = list_createList();

    cJSON_ArrayForEach(harassment_threatening_local, harassment_threatening)
    {
        if(!cJSON_IsString(harassment_threatening_local))
        {
            goto end;
        }
        list_addElement(harassment_threateningList , strdup(harassment_threatening_local->valuestring));
    }

    // create_moderation_response_results_inner_category_applied_input_types->illicit
    cJSON *illicit = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_applied_input_typesJSON, "illicit");
    if (cJSON_IsNull(illicit)) {
        illicit = NULL;
    }
    if (!illicit) {
        goto end;
    }

    
    cJSON *illicit_local = NULL;
    if(!cJSON_IsArray(illicit)) {
        goto end;//primitive container
    }
    illicitList = list_createList();

    cJSON_ArrayForEach(illicit_local, illicit)
    {
        if(!cJSON_IsString(illicit_local))
        {
            goto end;
        }
        list_addElement(illicitList , strdup(illicit_local->valuestring));
    }

    // create_moderation_response_results_inner_category_applied_input_types->illicit_violent
    cJSON *illicit_violent = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_applied_input_typesJSON, "illicit/violent");
    if (cJSON_IsNull(illicit_violent)) {
        illicit_violent = NULL;
    }
    if (!illicit_violent) {
        goto end;
    }

    
    cJSON *illicit_violent_local = NULL;
    if(!cJSON_IsArray(illicit_violent)) {
        goto end;//primitive container
    }
    illicit_violentList = list_createList();

    cJSON_ArrayForEach(illicit_violent_local, illicit_violent)
    {
        if(!cJSON_IsString(illicit_violent_local))
        {
            goto end;
        }
        list_addElement(illicit_violentList , strdup(illicit_violent_local->valuestring));
    }

    // create_moderation_response_results_inner_category_applied_input_types->self_harm
    cJSON *self_harm = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_applied_input_typesJSON, "self-harm");
    if (cJSON_IsNull(self_harm)) {
        self_harm = NULL;
    }
    if (!self_harm) {
        goto end;
    }

    
    cJSON *self_harm_local = NULL;
    if(!cJSON_IsArray(self_harm)) {
        goto end;//primitive container
    }
    self_harmList = list_createList();

    cJSON_ArrayForEach(self_harm_local, self_harm)
    {
        if(!cJSON_IsString(self_harm_local))
        {
            goto end;
        }
        list_addElement(self_harmList , strdup(self_harm_local->valuestring));
    }

    // create_moderation_response_results_inner_category_applied_input_types->self_harm_intent
    cJSON *self_harm_intent = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_applied_input_typesJSON, "self-harm/intent");
    if (cJSON_IsNull(self_harm_intent)) {
        self_harm_intent = NULL;
    }
    if (!self_harm_intent) {
        goto end;
    }

    
    cJSON *self_harm_intent_local = NULL;
    if(!cJSON_IsArray(self_harm_intent)) {
        goto end;//primitive container
    }
    self_harm_intentList = list_createList();

    cJSON_ArrayForEach(self_harm_intent_local, self_harm_intent)
    {
        if(!cJSON_IsString(self_harm_intent_local))
        {
            goto end;
        }
        list_addElement(self_harm_intentList , strdup(self_harm_intent_local->valuestring));
    }

    // create_moderation_response_results_inner_category_applied_input_types->self_harm_instructions
    cJSON *self_harm_instructions = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_applied_input_typesJSON, "self-harm/instructions");
    if (cJSON_IsNull(self_harm_instructions)) {
        self_harm_instructions = NULL;
    }
    if (!self_harm_instructions) {
        goto end;
    }

    
    cJSON *self_harm_instructions_local = NULL;
    if(!cJSON_IsArray(self_harm_instructions)) {
        goto end;//primitive container
    }
    self_harm_instructionsList = list_createList();

    cJSON_ArrayForEach(self_harm_instructions_local, self_harm_instructions)
    {
        if(!cJSON_IsString(self_harm_instructions_local))
        {
            goto end;
        }
        list_addElement(self_harm_instructionsList , strdup(self_harm_instructions_local->valuestring));
    }

    // create_moderation_response_results_inner_category_applied_input_types->sexual
    cJSON *sexual = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_applied_input_typesJSON, "sexual");
    if (cJSON_IsNull(sexual)) {
        sexual = NULL;
    }
    if (!sexual) {
        goto end;
    }

    
    cJSON *sexual_local = NULL;
    if(!cJSON_IsArray(sexual)) {
        goto end;//primitive container
    }
    sexualList = list_createList();

    cJSON_ArrayForEach(sexual_local, sexual)
    {
        if(!cJSON_IsString(sexual_local))
        {
            goto end;
        }
        list_addElement(sexualList , strdup(sexual_local->valuestring));
    }

    // create_moderation_response_results_inner_category_applied_input_types->sexual_minors
    cJSON *sexual_minors = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_applied_input_typesJSON, "sexual/minors");
    if (cJSON_IsNull(sexual_minors)) {
        sexual_minors = NULL;
    }
    if (!sexual_minors) {
        goto end;
    }

    
    cJSON *sexual_minors_local = NULL;
    if(!cJSON_IsArray(sexual_minors)) {
        goto end;//primitive container
    }
    sexual_minorsList = list_createList();

    cJSON_ArrayForEach(sexual_minors_local, sexual_minors)
    {
        if(!cJSON_IsString(sexual_minors_local))
        {
            goto end;
        }
        list_addElement(sexual_minorsList , strdup(sexual_minors_local->valuestring));
    }

    // create_moderation_response_results_inner_category_applied_input_types->violence
    cJSON *violence = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_applied_input_typesJSON, "violence");
    if (cJSON_IsNull(violence)) {
        violence = NULL;
    }
    if (!violence) {
        goto end;
    }

    
    cJSON *violence_local = NULL;
    if(!cJSON_IsArray(violence)) {
        goto end;//primitive container
    }
    violenceList = list_createList();

    cJSON_ArrayForEach(violence_local, violence)
    {
        if(!cJSON_IsString(violence_local))
        {
            goto end;
        }
        list_addElement(violenceList , strdup(violence_local->valuestring));
    }

    // create_moderation_response_results_inner_category_applied_input_types->violence_graphic
    cJSON *violence_graphic = cJSON_GetObjectItemCaseSensitive(create_moderation_response_results_inner_category_applied_input_typesJSON, "violence/graphic");
    if (cJSON_IsNull(violence_graphic)) {
        violence_graphic = NULL;
    }
    if (!violence_graphic) {
        goto end;
    }

    
    cJSON *violence_graphic_local = NULL;
    if(!cJSON_IsArray(violence_graphic)) {
        goto end;//primitive container
    }
    violence_graphicList = list_createList();

    cJSON_ArrayForEach(violence_graphic_local, violence_graphic)
    {
        if(!cJSON_IsString(violence_graphic_local))
        {
            goto end;
        }
        list_addElement(violence_graphicList , strdup(violence_graphic_local->valuestring));
    }


    create_moderation_response_results_inner_category_applied_input_types_local_var = create_moderation_response_results_inner_category_applied_input_types_create_internal (
        hateList,
        hate_threateningList,
        harassmentList,
        harassment_threateningList,
        illicitList,
        illicit_violentList,
        self_harmList,
        self_harm_intentList,
        self_harm_instructionsList,
        sexualList,
        sexual_minorsList,
        violenceList,
        violence_graphicList
        );

    return create_moderation_response_results_inner_category_applied_input_types_local_var;
end:
    if (hateList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, hateList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(hateList);
        hateList = NULL;
    }
    if (hate_threateningList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, hate_threateningList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(hate_threateningList);
        hate_threateningList = NULL;
    }
    if (harassmentList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, harassmentList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(harassmentList);
        harassmentList = NULL;
    }
    if (harassment_threateningList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, harassment_threateningList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(harassment_threateningList);
        harassment_threateningList = NULL;
    }
    if (illicitList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, illicitList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(illicitList);
        illicitList = NULL;
    }
    if (illicit_violentList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, illicit_violentList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(illicit_violentList);
        illicit_violentList = NULL;
    }
    if (self_harmList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, self_harmList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(self_harmList);
        self_harmList = NULL;
    }
    if (self_harm_intentList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, self_harm_intentList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(self_harm_intentList);
        self_harm_intentList = NULL;
    }
    if (self_harm_instructionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, self_harm_instructionsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(self_harm_instructionsList);
        self_harm_instructionsList = NULL;
    }
    if (sexualList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, sexualList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(sexualList);
        sexualList = NULL;
    }
    if (sexual_minorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, sexual_minorsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(sexual_minorsList);
        sexual_minorsList = NULL;
    }
    if (violenceList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, violenceList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(violenceList);
        violenceList = NULL;
    }
    if (violence_graphicList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, violence_graphicList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(violence_graphicList);
        violence_graphicList = NULL;
    }
    return NULL;

}
