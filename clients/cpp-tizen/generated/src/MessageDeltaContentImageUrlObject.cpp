#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageDeltaContentImageUrlObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageDeltaContentImageUrlObject::MessageDeltaContentImageUrlObject()
{
	//__init();
}

MessageDeltaContentImageUrlObject::~MessageDeltaContentImageUrlObject()
{
	//__cleanup();
}

void
MessageDeltaContentImageUrlObject::__init()
{
	//index = int(0);
	//type = std::string();
	//image_url = new MessageDeltaContentImageUrlObject_image_url();
}

void
MessageDeltaContentImageUrlObject::__cleanup()
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
	//if(image_url != NULL) {
	//
	//delete image_url;
	//image_url = NULL;
	//}
	//
}

void
MessageDeltaContentImageUrlObject::fromJson(char* jsonStr)
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
	const gchar *image_urlKey = "image_url";
	node = json_object_get_member(pJsonObject, image_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("MessageDeltaContentImageUrlObject_image_url")) {
			jsonToValue(&image_url, node, "MessageDeltaContentImageUrlObject_image_url", "MessageDeltaContentImageUrlObject_image_url");
		} else {
			
			MessageDeltaContentImageUrlObject_image_url* obj = static_cast<MessageDeltaContentImageUrlObject_image_url*> (&image_url);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MessageDeltaContentImageUrlObject::MessageDeltaContentImageUrlObject(char* json)
{
	this->fromJson(json);
}

char*
MessageDeltaContentImageUrlObject::toJson()
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
	if (isprimitive("MessageDeltaContentImageUrlObject_image_url")) {
		MessageDeltaContentImageUrlObject_image_url obj = getImageUrl();
		node = converttoJson(&obj, "MessageDeltaContentImageUrlObject_image_url", "");
	}
	else {
		
		MessageDeltaContentImageUrlObject_image_url obj = static_cast<MessageDeltaContentImageUrlObject_image_url> (getImageUrl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *image_urlKey = "image_url";
	json_object_set_member(pJsonObject, image_urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
MessageDeltaContentImageUrlObject::getIndex()
{
	return index;
}

void
MessageDeltaContentImageUrlObject::setIndex(int  index)
{
	this->index = index;
}

std::string
MessageDeltaContentImageUrlObject::getType()
{
	return type;
}

void
MessageDeltaContentImageUrlObject::setType(std::string  type)
{
	this->type = type;
}

MessageDeltaContentImageUrlObject_image_url
MessageDeltaContentImageUrlObject::getImageUrl()
{
	return image_url;
}

void
MessageDeltaContentImageUrlObject::setImageUrl(MessageDeltaContentImageUrlObject_image_url  image_url)
{
	this->image_url = image_url;
}


