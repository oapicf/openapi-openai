#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionRequestToolMessage.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionRequestToolMessage::ChatCompletionRequestToolMessage()
{
	//__init();
}

ChatCompletionRequestToolMessage::~ChatCompletionRequestToolMessage()
{
	//__cleanup();
}

void
ChatCompletionRequestToolMessage::__init()
{
	//role = std::string();
	//content = std::string();
	//tool_call_id = std::string();
}

void
ChatCompletionRequestToolMessage::__cleanup()
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
	//if(tool_call_id != NULL) {
	//
	//delete tool_call_id;
	//tool_call_id = NULL;
	//}
	//
}

void
ChatCompletionRequestToolMessage::fromJson(char* jsonStr)
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
	const gchar *tool_call_idKey = "tool_call_id";
	node = json_object_get_member(pJsonObject, tool_call_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&tool_call_id, node, "std::string", "");
		} else {
			
		}
	}
}

ChatCompletionRequestToolMessage::ChatCompletionRequestToolMessage(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionRequestToolMessage::toJson()
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
		std::string obj = getToolCallId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *tool_call_idKey = "tool_call_id";
	json_object_set_member(pJsonObject, tool_call_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ChatCompletionRequestToolMessage::getRole()
{
	return role;
}

void
ChatCompletionRequestToolMessage::setRole(std::string  role)
{
	this->role = role;
}

std::string
ChatCompletionRequestToolMessage::getContent()
{
	return content;
}

void
ChatCompletionRequestToolMessage::setContent(std::string  content)
{
	this->content = content;
}

std::string
ChatCompletionRequestToolMessage::getToolCallId()
{
	return tool_call_id;
}

void
ChatCompletionRequestToolMessage::setToolCallId(std::string  tool_call_id)
{
	this->tool_call_id = tool_call_id;
}


