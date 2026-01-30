#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageDeltaObject_delta_content_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageDeltaObject_delta_content_inner::MessageDeltaObject_delta_content_inner()
{
	//__init();
}

MessageDeltaObject_delta_content_inner::~MessageDeltaObject_delta_content_inner()
{
	//__cleanup();
}

void
MessageDeltaObject_delta_content_inner::__init()
{
	//index = int(0);
	//type = std::string();
	//image_file = new MessageDeltaContentImageFileObject_image_file();
	//text = new MessageDeltaContentTextObject_text();
	//refusal = std::string();
	//image_url = new MessageDeltaContentImageUrlObject_image_url();
}

void
MessageDeltaObject_delta_content_inner::__cleanup()
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
	//if(image_file != NULL) {
	//
	//delete image_file;
	//image_file = NULL;
	//}
	//if(text != NULL) {
	//
	//delete text;
	//text = NULL;
	//}
	//if(refusal != NULL) {
	//
	//delete refusal;
	//refusal = NULL;
	//}
	//if(image_url != NULL) {
	//
	//delete image_url;
	//image_url = NULL;
	//}
	//
}

void
MessageDeltaObject_delta_content_inner::fromJson(char* jsonStr)
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
	const gchar *image_fileKey = "image_file";
	node = json_object_get_member(pJsonObject, image_fileKey);
	if (node !=NULL) {
	

		if (isprimitive("MessageDeltaContentImageFileObject_image_file")) {
			jsonToValue(&image_file, node, "MessageDeltaContentImageFileObject_image_file", "MessageDeltaContentImageFileObject_image_file");
		} else {
			
			MessageDeltaContentImageFileObject_image_file* obj = static_cast<MessageDeltaContentImageFileObject_image_file*> (&image_file);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *refusalKey = "refusal";
	node = json_object_get_member(pJsonObject, refusalKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&refusal, node, "std::string", "");
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

MessageDeltaObject_delta_content_inner::MessageDeltaObject_delta_content_inner(char* json)
{
	this->fromJson(json);
}

char*
MessageDeltaObject_delta_content_inner::toJson()
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
	if (isprimitive("MessageDeltaContentImageFileObject_image_file")) {
		MessageDeltaContentImageFileObject_image_file obj = getImageFile();
		node = converttoJson(&obj, "MessageDeltaContentImageFileObject_image_file", "");
	}
	else {
		
		MessageDeltaContentImageFileObject_image_file obj = static_cast<MessageDeltaContentImageFileObject_image_file> (getImageFile());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *image_fileKey = "image_file";
	json_object_set_member(pJsonObject, image_fileKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getRefusal();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *refusalKey = "refusal";
	json_object_set_member(pJsonObject, refusalKey, node);
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
MessageDeltaObject_delta_content_inner::getIndex()
{
	return index;
}

void
MessageDeltaObject_delta_content_inner::setIndex(int  index)
{
	this->index = index;
}

std::string
MessageDeltaObject_delta_content_inner::getType()
{
	return type;
}

void
MessageDeltaObject_delta_content_inner::setType(std::string  type)
{
	this->type = type;
}

MessageDeltaContentImageFileObject_image_file
MessageDeltaObject_delta_content_inner::getImageFile()
{
	return image_file;
}

void
MessageDeltaObject_delta_content_inner::setImageFile(MessageDeltaContentImageFileObject_image_file  image_file)
{
	this->image_file = image_file;
}

MessageDeltaContentTextObject_text
MessageDeltaObject_delta_content_inner::getText()
{
	return text;
}

void
MessageDeltaObject_delta_content_inner::setText(MessageDeltaContentTextObject_text  text)
{
	this->text = text;
}

std::string
MessageDeltaObject_delta_content_inner::getRefusal()
{
	return refusal;
}

void
MessageDeltaObject_delta_content_inner::setRefusal(std::string  refusal)
{
	this->refusal = refusal;
}

MessageDeltaContentImageUrlObject_image_url
MessageDeltaObject_delta_content_inner::getImageUrl()
{
	return image_url;
}

void
MessageDeltaObject_delta_content_inner::setImageUrl(MessageDeltaContentImageUrlObject_image_url  image_url)
{
	this->image_url = image_url;
}


