#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionMessageToolCall.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionMessageToolCall::ChatCompletionMessageToolCall()
{
	//__init();
}

ChatCompletionMessageToolCall::~ChatCompletionMessageToolCall()
{
	//__cleanup();
}

void
ChatCompletionMessageToolCall::__init()
{
	//id = std::string();
	//type = std::string();
	//function = new ChatCompletionMessageToolCall_function();
}

void
ChatCompletionMessageToolCall::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
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
ChatCompletionMessageToolCall::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
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
	

		if (isprimitive("ChatCompletionMessageToolCall_function")) {
			jsonToValue(&function, node, "ChatCompletionMessageToolCall_function", "ChatCompletionMessageToolCall_function");
		} else {
			
			ChatCompletionMessageToolCall_function* obj = static_cast<ChatCompletionMessageToolCall_function*> (&function);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ChatCompletionMessageToolCall::ChatCompletionMessageToolCall(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionMessageToolCall::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("ChatCompletionMessageToolCall_function")) {
		ChatCompletionMessageToolCall_function obj = getFunction();
		node = converttoJson(&obj, "ChatCompletionMessageToolCall_function", "");
	}
	else {
		
		ChatCompletionMessageToolCall_function obj = static_cast<ChatCompletionMessageToolCall_function> (getFunction());
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
ChatCompletionMessageToolCall::getId()
{
	return id;
}

void
ChatCompletionMessageToolCall::setId(std::string  id)
{
	this->id = id;
}

std::string
ChatCompletionMessageToolCall::getType()
{
	return type;
}

void
ChatCompletionMessageToolCall::setType(std::string  type)
{
	this->type = type;
}

ChatCompletionMessageToolCall_function
ChatCompletionMessageToolCall::getFunction()
{
	return function;
}

void
ChatCompletionMessageToolCall::setFunction(ChatCompletionMessageToolCall_function  function)
{
	this->function = function;
}


