#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionStreamOptions.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionStreamOptions::ChatCompletionStreamOptions()
{
	//__init();
}

ChatCompletionStreamOptions::~ChatCompletionStreamOptions()
{
	//__cleanup();
}

void
ChatCompletionStreamOptions::__init()
{
	//include_usage = bool(false);
}

void
ChatCompletionStreamOptions::__cleanup()
{
	//if(include_usage != NULL) {
	//
	//delete include_usage;
	//include_usage = NULL;
	//}
	//
}

void
ChatCompletionStreamOptions::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *include_usageKey = "include_usage";
	node = json_object_get_member(pJsonObject, include_usageKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&include_usage, node, "bool", "");
		} else {
			
		}
	}
}

ChatCompletionStreamOptions::ChatCompletionStreamOptions(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionStreamOptions::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getIncludeUsage();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *include_usageKey = "include_usage";
	json_object_set_member(pJsonObject, include_usageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
ChatCompletionStreamOptions::getIncludeUsage()
{
	return include_usage;
}

void
ChatCompletionStreamOptions::setIncludeUsage(bool  include_usage)
{
	this->include_usage = include_usage;
}


