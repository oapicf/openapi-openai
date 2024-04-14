#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageContentTextObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageContentTextObject::MessageContentTextObject()
{
	//__init();
}

MessageContentTextObject::~MessageContentTextObject()
{
	//__cleanup();
}

void
MessageContentTextObject::__init()
{
	//type = std::string();
	//text = new MessageContentTextObject_text();
}

void
MessageContentTextObject::__cleanup()
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
MessageContentTextObject::fromJson(char* jsonStr)
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
	

		if (isprimitive("MessageContentTextObject_text")) {
			jsonToValue(&text, node, "MessageContentTextObject_text", "MessageContentTextObject_text");
		} else {
			
			MessageContentTextObject_text* obj = static_cast<MessageContentTextObject_text*> (&text);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MessageContentTextObject::MessageContentTextObject(char* json)
{
	this->fromJson(json);
}

char*
MessageContentTextObject::toJson()
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
	if (isprimitive("MessageContentTextObject_text")) {
		MessageContentTextObject_text obj = getText();
		node = converttoJson(&obj, "MessageContentTextObject_text", "");
	}
	else {
		
		MessageContentTextObject_text obj = static_cast<MessageContentTextObject_text> (getText());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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
MessageContentTextObject::getType()
{
	return type;
}

void
MessageContentTextObject::setType(std::string  type)
{
	this->type = type;
}

MessageContentTextObject_text
MessageContentTextObject::getText()
{
	return text;
}

void
MessageContentTextObject::setText(MessageContentTextObject_text  text)
{
	this->text = text;
}


