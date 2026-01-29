#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionRequestUserMessage.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionRequestUserMessage::ChatCompletionRequestUserMessage()
{
	//__init();
}

ChatCompletionRequestUserMessage::~ChatCompletionRequestUserMessage()
{
	//__cleanup();
}

void
ChatCompletionRequestUserMessage::__init()
{
	//content = new ChatCompletionRequestUserMessage_content();
	//role = std::string();
	//name = std::string();
}

void
ChatCompletionRequestUserMessage::__cleanup()
{
	//if(content != NULL) {
	//
	//delete content;
	//content = NULL;
	//}
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
ChatCompletionRequestUserMessage::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *contentKey = "content";
	node = json_object_get_member(pJsonObject, contentKey);
	if (node !=NULL) {
	

		if (isprimitive("ChatCompletionRequestUserMessage_content")) {
			jsonToValue(&content, node, "ChatCompletionRequestUserMessage_content", "ChatCompletionRequestUserMessage_content");
		} else {
			
			ChatCompletionRequestUserMessage_content* obj = static_cast<ChatCompletionRequestUserMessage_content*> (&content);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *roleKey = "role";
	node = json_object_get_member(pJsonObject, roleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&role, node, "std::string", "");
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

ChatCompletionRequestUserMessage::ChatCompletionRequestUserMessage(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionRequestUserMessage::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ChatCompletionRequestUserMessage_content")) {
		ChatCompletionRequestUserMessage_content obj = getContent();
		node = converttoJson(&obj, "ChatCompletionRequestUserMessage_content", "");
	}
	else {
		
		ChatCompletionRequestUserMessage_content obj = static_cast<ChatCompletionRequestUserMessage_content> (getContent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *contentKey = "content";
	json_object_set_member(pJsonObject, contentKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRole();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *roleKey = "role";
	json_object_set_member(pJsonObject, roleKey, node);
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

ChatCompletionRequestUserMessage_content
ChatCompletionRequestUserMessage::getContent()
{
	return content;
}

void
ChatCompletionRequestUserMessage::setContent(ChatCompletionRequestUserMessage_content  content)
{
	this->content = content;
}

std::string
ChatCompletionRequestUserMessage::getRole()
{
	return role;
}

void
ChatCompletionRequestUserMessage::setRole(std::string  role)
{
	this->role = role;
}

std::string
ChatCompletionRequestUserMessage::getName()
{
	return name;
}

void
ChatCompletionRequestUserMessage::setName(std::string  name)
{
	this->name = name;
}


