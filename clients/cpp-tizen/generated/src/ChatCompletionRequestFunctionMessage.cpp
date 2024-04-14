#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionRequestFunctionMessage.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionRequestFunctionMessage::ChatCompletionRequestFunctionMessage()
{
	//__init();
}

ChatCompletionRequestFunctionMessage::~ChatCompletionRequestFunctionMessage()
{
	//__cleanup();
}

void
ChatCompletionRequestFunctionMessage::__init()
{
	//role = std::string();
	//content = std::string();
	//name = std::string();
}

void
ChatCompletionRequestFunctionMessage::__cleanup()
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
	//
}

void
ChatCompletionRequestFunctionMessage::fromJson(char* jsonStr)
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
}

ChatCompletionRequestFunctionMessage::ChatCompletionRequestFunctionMessage(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionRequestFunctionMessage::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ChatCompletionRequestFunctionMessage::getRole()
{
	return role;
}

void
ChatCompletionRequestFunctionMessage::setRole(std::string  role)
{
	this->role = role;
}

std::string
ChatCompletionRequestFunctionMessage::getContent()
{
	return content;
}

void
ChatCompletionRequestFunctionMessage::setContent(std::string  content)
{
	this->content = content;
}

std::string
ChatCompletionRequestFunctionMessage::getName()
{
	return name;
}

void
ChatCompletionRequestFunctionMessage::setName(std::string  name)
{
	this->name = name;
}


