#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionMessageToolCall_function.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionMessageToolCall_function::ChatCompletionMessageToolCall_function()
{
	//__init();
}

ChatCompletionMessageToolCall_function::~ChatCompletionMessageToolCall_function()
{
	//__cleanup();
}

void
ChatCompletionMessageToolCall_function::__init()
{
	//name = std::string();
	//arguments = std::string();
}

void
ChatCompletionMessageToolCall_function::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(arguments != NULL) {
	//
	//delete arguments;
	//arguments = NULL;
	//}
	//
}

void
ChatCompletionMessageToolCall_function::fromJson(char* jsonStr)
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
	const gchar *argumentsKey = "arguments";
	node = json_object_get_member(pJsonObject, argumentsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&arguments, node, "std::string", "");
		} else {
			
		}
	}
}

ChatCompletionMessageToolCall_function::ChatCompletionMessageToolCall_function(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionMessageToolCall_function::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getArguments();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *argumentsKey = "arguments";
	json_object_set_member(pJsonObject, argumentsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ChatCompletionMessageToolCall_function::getName()
{
	return name;
}

void
ChatCompletionMessageToolCall_function::setName(std::string  name)
{
	this->name = name;
}

std::string
ChatCompletionMessageToolCall_function::getArguments()
{
	return arguments;
}

void
ChatCompletionMessageToolCall_function::setArguments(std::string  arguments)
{
	this->arguments = arguments;
}


