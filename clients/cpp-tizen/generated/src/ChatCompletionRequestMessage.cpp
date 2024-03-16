#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionRequestMessage.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionRequestMessage::ChatCompletionRequestMessage()
{
	//__init();
}

ChatCompletionRequestMessage::~ChatCompletionRequestMessage()
{
	//__cleanup();
}

void
ChatCompletionRequestMessage::__init()
{
	//role = std::string();
	//content = std::string();
	//name = std::string();
	//function_call = new ChatCompletionRequestMessage_function_call();
}

void
ChatCompletionRequestMessage::__cleanup()
{
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//if(content != NULL) {
	//
	//delete content;
	//content = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(function_call != NULL) {
	//
	//delete function_call;
	//function_call = NULL;
	//}
	//
}

void
ChatCompletionRequestMessage::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *roleKey = "role";
	node = json_object_get_member(pJsonObject, roleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&role, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *contentKey = "content";
	node = json_object_get_member(pJsonObject, contentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&content, node, "std::string", "");
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
	const gchar *function_callKey = "function_call";
	node = json_object_get_member(pJsonObject, function_callKey);
	if (node !=NULL) {
	

		if (isprimitive("ChatCompletionRequestMessage_function_call")) {
			jsonToValue(&function_call, node, "ChatCompletionRequestMessage_function_call", "ChatCompletionRequestMessage_function_call");
		} else {
			
			ChatCompletionRequestMessage_function_call* obj = static_cast<ChatCompletionRequestMessage_function_call*> (&function_call);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ChatCompletionRequestMessage::ChatCompletionRequestMessage(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionRequestMessage::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getRole();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *roleKey = "role";
	json_object_set_member(pJsonObject, roleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getContent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *contentKey = "content";
	json_object_set_member(pJsonObject, contentKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("ChatCompletionRequestMessage_function_call")) {
		ChatCompletionRequestMessage_function_call obj = getFunctionCall();
		node = converttoJson(&obj, "ChatCompletionRequestMessage_function_call", "");
	}
	else {
		
		ChatCompletionRequestMessage_function_call obj = static_cast<ChatCompletionRequestMessage_function_call> (getFunctionCall());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *function_callKey = "function_call";
	json_object_set_member(pJsonObject, function_callKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ChatCompletionRequestMessage::getRole()
{
	return role;
}

void
ChatCompletionRequestMessage::setRole(std::string  role)
{
	this->role = role;
}

std::string
ChatCompletionRequestMessage::getContent()
{
	return content;
}

void
ChatCompletionRequestMessage::setContent(std::string  content)
{
	this->content = content;
}

std::string
ChatCompletionRequestMessage::getName()
{
	return name;
}

void
ChatCompletionRequestMessage::setName(std::string  name)
{
	this->name = name;
}

ChatCompletionRequestMessage_function_call
ChatCompletionRequestMessage::getFunctionCall()
{
	return function_call;
}

void
ChatCompletionRequestMessage::setFunctionCall(ChatCompletionRequestMessage_function_call  function_call)
{
	this->function_call = function_call;
}

