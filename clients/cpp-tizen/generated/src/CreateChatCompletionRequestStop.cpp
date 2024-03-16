#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateChatCompletionRequest_stop.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateChatCompletionRequest_stop::CreateChatCompletionRequest_stop()
{
	//__init();
}

CreateChatCompletionRequest_stop::~CreateChatCompletionRequest_stop()
{
	//__cleanup();
}

void
CreateChatCompletionRequest_stop::__init()
{
}

void
CreateChatCompletionRequest_stop::__cleanup()
{
	//
}

void
CreateChatCompletionRequest_stop::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

CreateChatCompletionRequest_stop::CreateChatCompletionRequest_stop(char* json)
{
	this->fromJson(json);
}

char*
CreateChatCompletionRequest_stop::toJson()
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


