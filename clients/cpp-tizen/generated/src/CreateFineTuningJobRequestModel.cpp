#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateFineTuningJobRequest_model.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateFineTuningJobRequest_model::CreateFineTuningJobRequest_model()
{
	//__init();
}

CreateFineTuningJobRequest_model::~CreateFineTuningJobRequest_model()
{
	//__cleanup();
}

void
CreateFineTuningJobRequest_model::__init()
{
}

void
CreateFineTuningJobRequest_model::__cleanup()
{
	//
}

void
CreateFineTuningJobRequest_model::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

CreateFineTuningJobRequest_model::CreateFineTuningJobRequest_model(char* json)
{
	this->fromJson(json);
}

char*
CreateFineTuningJobRequest_model::toJson()
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


