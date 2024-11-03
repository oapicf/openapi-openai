#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AssistantsApiNamedToolChoice.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AssistantsApiNamedToolChoice::AssistantsApiNamedToolChoice()
{
	//__init();
}

AssistantsApiNamedToolChoice::~AssistantsApiNamedToolChoice()
{
	//__cleanup();
}

void
AssistantsApiNamedToolChoice::__init()
{
	//type = std::string();
	//function = new ChatCompletionNamedToolChoice_function();
}

void
AssistantsApiNamedToolChoice::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(function != NULL) {
	//
	//delete function;
	//function = NULL;
	//}
	//
}

void
AssistantsApiNamedToolChoice::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *functionKey = "function";
	node = json_object_get_member(pJsonObject, functionKey);
	if (node !=NULL) {
	

		if (isprimitive("ChatCompletionNamedToolChoice_function")) {
			jsonToValue(&function, node, "ChatCompletionNamedToolChoice_function", "ChatCompletionNamedToolChoice_function");
		} else {
			
			ChatCompletionNamedToolChoice_function* obj = static_cast<ChatCompletionNamedToolChoice_function*> (&function);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AssistantsApiNamedToolChoice::AssistantsApiNamedToolChoice(char* json)
{
	this->fromJson(json);
}

char*
AssistantsApiNamedToolChoice::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("ChatCompletionNamedToolChoice_function")) {
		ChatCompletionNamedToolChoice_function obj = getFunction();
		node = converttoJson(&obj, "ChatCompletionNamedToolChoice_function", "");
	}
	else {
		
		ChatCompletionNamedToolChoice_function obj = static_cast<ChatCompletionNamedToolChoice_function> (getFunction());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *functionKey = "function";
	json_object_set_member(pJsonObject, functionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AssistantsApiNamedToolChoice::getType()
{
	return type;
}

void
AssistantsApiNamedToolChoice::setType(std::string  type)
{
	this->type = type;
}

ChatCompletionNamedToolChoice_function
AssistantsApiNamedToolChoice::getFunction()
{
	return function;
}

void
AssistantsApiNamedToolChoice::setFunction(ChatCompletionNamedToolChoice_function  function)
{
	this->function = function;
}


