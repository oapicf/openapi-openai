#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateSpeechRequest_model.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateSpeechRequest_model::CreateSpeechRequest_model()
{
	//__init();
}

CreateSpeechRequest_model::~CreateSpeechRequest_model()
{
	//__cleanup();
}

void
CreateSpeechRequest_model::__init()
{
}

void
CreateSpeechRequest_model::__cleanup()
{
	//
}

void
CreateSpeechRequest_model::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

CreateSpeechRequest_model::CreateSpeechRequest_model(char* json)
{
	this->fromJson(json);
}

char*
CreateSpeechRequest_model::toJson()
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


