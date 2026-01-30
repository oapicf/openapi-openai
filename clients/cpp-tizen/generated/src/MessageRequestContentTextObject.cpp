#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageRequestContentTextObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageRequestContentTextObject::MessageRequestContentTextObject()
{
	//__init();
}

MessageRequestContentTextObject::~MessageRequestContentTextObject()
{
	//__cleanup();
}

void
MessageRequestContentTextObject::__init()
{
	//type = std::string();
	//text = std::string();
}

void
MessageRequestContentTextObject::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(text != NULL) {
	//
	//delete text;
	//text = NULL;
	//}
	//
}

void
MessageRequestContentTextObject::fromJson(char* jsonStr)
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
	const gchar *textKey = "text";
	node = json_object_get_member(pJsonObject, textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&text, node, "std::string", "");
		} else {
			
		}
	}
}

MessageRequestContentTextObject::MessageRequestContentTextObject(char* json)
{
	this->fromJson(json);
}

char*
MessageRequestContentTextObject::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *textKey = "text";
	json_object_set_member(pJsonObject, textKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MessageRequestContentTextObject::getType()
{
	return type;
}

void
MessageRequestContentTextObject::setType(std::string  type)
{
	this->type = type;
}

std::string
MessageRequestContentTextObject::getText()
{
	return text;
}

void
MessageRequestContentTextObject::setText(std::string  text)
{
	this->text = text;
}


