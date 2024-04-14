#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionStreamResponseDelta_function_call.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionStreamResponseDelta_function_call::ChatCompletionStreamResponseDelta_function_call()
{
	//__init();
}

ChatCompletionStreamResponseDelta_function_call::~ChatCompletionStreamResponseDelta_function_call()
{
	//__cleanup();
}

void
ChatCompletionStreamResponseDelta_function_call::__init()
{
	//arguments = std::string();
	//name = std::string();
}

void
ChatCompletionStreamResponseDelta_function_call::__cleanup()
{
	//if(arguments != NULL) {
	//
	//delete arguments;
	//arguments = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
ChatCompletionStreamResponseDelta_function_call::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *argumentsKey = "arguments";
	node = json_object_get_member(pJsonObject, argumentsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&arguments, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

ChatCompletionStreamResponseDelta_function_call::ChatCompletionStreamResponseDelta_function_call(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionStreamResponseDelta_function_call::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getArguments();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *argumentsKey = "arguments";
	json_object_set_member(pJsonObject, argumentsKey, node);
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
ChatCompletionStreamResponseDelta_function_call::getArguments()
{
	return arguments;
}

void
ChatCompletionStreamResponseDelta_function_call::setArguments(std::string  arguments)
{
	this->arguments = arguments;
}

std::string
ChatCompletionStreamResponseDelta_function_call::getName()
{
	return name;
}

void
ChatCompletionStreamResponseDelta_function_call::setName(std::string  name)
{
	this->name = name;
}


