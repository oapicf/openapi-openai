#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTuneDPOMethod_hyperparameters_beta.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTuneDPOMethod_hyperparameters_beta::FineTuneDPOMethod_hyperparameters_beta()
{
	//__init();
}

FineTuneDPOMethod_hyperparameters_beta::~FineTuneDPOMethod_hyperparameters_beta()
{
	//__cleanup();
}

void
FineTuneDPOMethod_hyperparameters_beta::__init()
{
}

void
FineTuneDPOMethod_hyperparameters_beta::__cleanup()
{
	//
}

void
FineTuneDPOMethod_hyperparameters_beta::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

FineTuneDPOMethod_hyperparameters_beta::FineTuneDPOMethod_hyperparameters_beta(char* json)
{
	this->fromJson(json);
}

char*
FineTuneDPOMethod_hyperparameters_beta::toJson()
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


