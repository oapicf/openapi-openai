#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTuningJob_hyperparameters_n_epochs.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTuningJob_hyperparameters_n_epochs::FineTuningJob_hyperparameters_n_epochs()
{
	//__init();
}

FineTuningJob_hyperparameters_n_epochs::~FineTuningJob_hyperparameters_n_epochs()
{
	//__cleanup();
}

void
FineTuningJob_hyperparameters_n_epochs::__init()
{
}

void
FineTuningJob_hyperparameters_n_epochs::__cleanup()
{
	//
}

void
FineTuningJob_hyperparameters_n_epochs::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

FineTuningJob_hyperparameters_n_epochs::FineTuningJob_hyperparameters_n_epochs(char* json)
{
	this->fromJson(json);
}

char*
FineTuningJob_hyperparameters_n_epochs::toJson()
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


