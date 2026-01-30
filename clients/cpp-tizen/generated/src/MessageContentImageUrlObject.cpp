#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageContentImageUrlObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageContentImageUrlObject::MessageContentImageUrlObject()
{
	//__init();
}

MessageContentImageUrlObject::~MessageContentImageUrlObject()
{
	//__cleanup();
}

void
MessageContentImageUrlObject::__init()
{
	//type = std::string();
	//image_url = new MessageContentImageUrlObject_image_url();
}

void
MessageContentImageUrlObject::__cleanup()
{
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
MessageContentImageUrlObject::fromJson(char* jsonStr)
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
	const gchar *image_urlKey = "image_url";
	node = json_object_get_member(pJsonObject, image_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("MessageContentImageUrlObject_image_url")) {
			jsonToValue(&image_url, node, "MessageContentImageUrlObject_image_url", "MessageContentImageUrlObject_image_url");
		} else {
			
			MessageContentImageUrlObject_image_url* obj = static_cast<MessageContentImageUrlObject_image_url*> (&image_url);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MessageContentImageUrlObject::MessageContentImageUrlObject(char* json)
{
	this->fromJson(json);
}

char*
MessageContentImageUrlObject::toJson()
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
	if (isprimitive("MessageContentImageUrlObject_image_url")) {
		MessageContentImageUrlObject_image_url obj = getImageUrl();
		node = converttoJson(&obj, "MessageContentImageUrlObject_image_url", "");
	}
	else {
		
		MessageContentImageUrlObject_image_url obj = static_cast<MessageContentImageUrlObject_image_url> (getImageUrl());
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

std::string
MessageContentImageUrlObject::getType()
{
	return type;
}

void
MessageContentImageUrlObject::setType(std::string  type)
{
	this->type = type;
}

MessageContentImageUrlObject_image_url
MessageContentImageUrlObject::getImageUrl()
{
	return image_url;
}

void
MessageContentImageUrlObject::setImageUrl(MessageContentImageUrlObject_image_url  image_url)
{
	this->image_url = image_url;
}


