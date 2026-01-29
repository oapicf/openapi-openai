#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionNamedToolChoice_function.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionNamedToolChoice_function::ChatCompletionNamedToolChoice_function()
{
	//__init();
}

ChatCompletionNamedToolChoice_function::~ChatCompletionNamedToolChoice_function()
{
	//__cleanup();
}

void
ChatCompletionNamedToolChoice_function::__init()
{
	//name = std::string();
}

void
ChatCompletionNamedToolChoice_function::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
ChatCompletionNamedToolChoice_function::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

ChatCompletionNamedToolChoice_function::ChatCompletionNamedToolChoice_function(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionNamedToolChoice_function::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ChatCompletionNamedToolChoice_function::getName()
{
	return name;
}

void
ChatCompletionNamedToolChoice_function::setName(std::string  name)
{
	this->name = name;
}


