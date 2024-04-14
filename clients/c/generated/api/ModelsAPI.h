#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/delete_model_response.h"
#include "../model/list_models_response.h"
#include "../model/model.h"


// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
//
delete_model_response_t*
ModelsAPI_deleteModel(apiClient_t *apiClient, char *model);


// Lists the currently available models, and provides basic information about each one such as the owner and availability.
//
list_models_response_t*
ModelsAPI_listModels(apiClient_t *apiClient);


// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
//
model_t*
ModelsAPI_retrieveModel(apiClient_t *apiClient, char *model);


