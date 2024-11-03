#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageDeltaContentTextObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageDeltaContentTextObject::MessageDeltaContentTextObject()
{
	//__init();
}

MessageDeltaContentTextObject::~MessageDeltaContentTextObject()
{
	//__cleanup();
}

void
MessageDeltaContentTextObject::__init()
{
	//index = int(0);
	//type = std::string();
	//text = new MessageDeltaContentTextObject_text();
}

void
MessageDeltaContentTextObject::__cleanup()
{
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
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
MessageDeltaContentTextObject::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *indexKey = "index";
	node = json_object_get_member(pJsonObject, indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&index, node, "int", "");
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
	const gchar *textKey = "text";
	node = json_object_get_member(pJsonObject, textKey);
	if (node !=NULL) {
	

		if (isprimitive("MessageDeltaContentTextObject_text")) {
			jsonToValue(&text, node, "MessageDeltaContentTextObject_text", "MessageDeltaContentTextObject_text");
		} else {
			
			MessageDeltaContentTextObject_text* obj = static_cast<MessageDeltaContentTextObject_text*> (&text);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MessageDeltaContentTextObject::MessageDeltaContentTextObject(char* json)
{
	this->fromJson(json);
}

char*
MessageDeltaContentTextObject::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *indexKey = "index";
	json_object_set_member(pJsonObject, indexKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("MessageDeltaContentTextObject_text")) {
		MessageDeltaContentTextObject_text obj = getText();
		node = converttoJson(&obj, "MessageDeltaContentTextObject_text", "");
	}
	else {
		
		MessageDeltaContentTextObject_text obj = static_cast<MessageDeltaContentTextObject_text> (getText());
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

int
MessageDeltaContentTextObject::getIndex()
{
	return index;
}

void
MessageDeltaContentTextObject::setIndex(int  index)
{
	this->index = index;
}

std::string
MessageDeltaContentTextObject::getType()
{
	return type;
}

void
MessageDeltaContentTextObject::setType(std::string  type)
{
	this->type = type;
}

MessageDeltaContentTextObject_text
MessageDeltaContentTextObject::getText()
{
	return text;
}

void
MessageDeltaContentTextObject::setText(MessageDeltaContentTextObject_text  text)
{
	this->text = text;
}


