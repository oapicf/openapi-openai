#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionRole.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionRole::ChatCompletionRole()
{
	//__init();
}

ChatCompletionRole::~ChatCompletionRole()
{
	//__cleanup();
}

void
ChatCompletionRole::__init()
{
}

void
ChatCompletionRole::__cleanup()
{
	//
}

void
ChatCompletionRole::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

ChatCompletionRole::ChatCompletionRole(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionRole::toJson()
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


