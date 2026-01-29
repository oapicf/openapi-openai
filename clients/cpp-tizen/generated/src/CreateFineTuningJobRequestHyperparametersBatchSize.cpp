#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateFineTuningJobRequest_hyperparameters_batch_size.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateFineTuningJobRequest_hyperparameters_batch_size::CreateFineTuningJobRequest_hyperparameters_batch_size()
{
	//__init();
}

CreateFineTuningJobRequest_hyperparameters_batch_size::~CreateFineTuningJobRequest_hyperparameters_batch_size()
{
	//__cleanup();
}

void
CreateFineTuningJobRequest_hyperparameters_batch_size::__init()
{
}

void
CreateFineTuningJobRequest_hyperparameters_batch_size::__cleanup()
{
	//
}

void
CreateFineTuningJobRequest_hyperparameters_batch_size::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

CreateFineTuningJobRequest_hyperparameters_batch_size::CreateFineTuningJobRequest_hyperparameters_batch_size(char* json)
{
	this->fromJson(json);
}

char*
CreateFineTuningJobRequest_hyperparameters_batch_size::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}


