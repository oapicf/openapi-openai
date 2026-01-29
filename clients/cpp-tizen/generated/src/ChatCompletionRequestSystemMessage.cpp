#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionRequestSystemMessage.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionRequestSystemMessage::ChatCompletionRequestSystemMessage()
{
	//__init();
}

ChatCompletionRequestSystemMessage::~ChatCompletionRequestSystemMessage()
{
	//__cleanup();
}

void
ChatCompletionRequestSystemMessage::__init()
{
	//content = std::string();
	//role = std::string();
	//name = std::string();
}

void
ChatCompletionRequestSystemMessage::__cleanup()
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
ChatCompletionRequestSystemMessage::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *contentKey = "content";
	node = json_object_get_member(pJsonObject, contentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&content, node, "std::string", "");
		} else {
			
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

ChatCompletionRequestSystemMessage::ChatCompletionRequestSystemMessage(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionRequestSystemMessage::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getContent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
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

std::string
ChatCompletionRequestSystemMessage::getContent()
{
	return content;
}

void
ChatCompletionRequestSystemMessage::setContent(std::string  content)
{
	this->content = content;
}

std::string
ChatCompletionRequestSystemMessage::getRole()
{
	return role;
}

void
ChatCompletionRequestSystemMessage::setRole(std::string  role)
{
	this->role = role;
}

std::string
ChatCompletionRequestSystemMessage::getName()
{
	return name;
}

void
ChatCompletionRequestSystemMessage::setName(std::string  name)
{
	this->name = name;
}


