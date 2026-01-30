#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Array_of_content_parts_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Array_of_content_parts_inner::Array_of_content_parts_inner()
{
	//__init();
}

Array_of_content_parts_inner::~Array_of_content_parts_inner()
{
	//__cleanup();
}

void
Array_of_content_parts_inner::__init()
{
	//type = std::string();
	//image_file = new MessageContentImageFileObject_image_file();
	//image_url = new MessageContentImageUrlObject_image_url();
	//text = std::string();
}

void
Array_of_content_parts_inner::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(image_file != NULL) {
	//
	//delete image_file;
	//image_file = NULL;
	//}
	//if(image_url != NULL) {
	//
	//delete image_url;
	//image_url = NULL;
	//}
	//if(text != NULL) {
	//
	//delete text;
	//text = NULL;
	//}
	//
}

void
Array_of_content_parts_inner::fromJson(char* jsonStr)
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
	const gchar *image_fileKey = "image_file";
	node = json_object_get_member(pJsonObject, image_fileKey);
	if (node !=NULL) {
	

		if (isprimitive("MessageContentImageFileObject_image_file")) {
			jsonToValue(&image_file, node, "MessageContentImageFileObject_image_file", "MessageContentImageFileObject_image_file");
		} else {
			
			MessageContentImageFileObject_image_file* obj = static_cast<MessageContentImageFileObject_image_file*> (&image_file);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *textKey = "text";
	node = json_object_get_member(pJsonObject, textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&text, node, "std::string", "");
		} else {
			
		}
	}
}

Array_of_content_parts_inner::Array_of_content_parts_inner(char* json)
{
	this->fromJson(json);
}

char*
Array_of_content_parts_inner::toJson()
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
	if (isprimitive("MessageContentImageFileObject_image_file")) {
		MessageContentImageFileObject_image_file obj = getImageFile();
		node = converttoJson(&obj, "MessageContentImageFileObject_image_file", "");
	}
	else {
		
		MessageContentImageFileObject_image_file obj = static_cast<MessageContentImageFileObject_image_file> (getImageFile());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *image_fileKey = "image_file";
	json_object_set_member(pJsonObject, image_fileKey, node);
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
Array_of_content_parts_inner::getType()
{
	return type;
}

void
Array_of_content_parts_inner::setType(std::string  type)
{
	this->type = type;
}

MessageContentImageFileObject_image_file
Array_of_content_parts_inner::getImageFile()
{
	return image_file;
}

void
Array_of_content_parts_inner::setImageFile(MessageContentImageFileObject_image_file  image_file)
{
	this->image_file = image_file;
}

MessageContentImageUrlObject_image_url
Array_of_content_parts_inner::getImageUrl()
{
	return image_url;
}

void
Array_of_content_parts_inner::setImageUrl(MessageContentImageUrlObject_image_url  image_url)
{
	this->image_url = image_url;
}

std::string
Array_of_content_parts_inner::getText()
{
	return text;
}

void
Array_of_content_parts_inner::setText(std::string  text)
{
	this->text = text;
}


