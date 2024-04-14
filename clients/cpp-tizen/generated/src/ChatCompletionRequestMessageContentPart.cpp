#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionRequestMessageContentPart.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionRequestMessageContentPart::ChatCompletionRequestMessageContentPart()
{
	//__init();
}

ChatCompletionRequestMessageContentPart::~ChatCompletionRequestMessageContentPart()
{
	//__cleanup();
}

void
ChatCompletionRequestMessageContentPart::__init()
{
	//type = std::string();
	//text = std::string();
	//image_url = new ChatCompletionRequestMessageContentPartImage_image_url();
}

void
ChatCompletionRequestMessageContentPart::__cleanup()
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
	//if(image_url != NULL) {
	//
	//delete image_url;
	//image_url = NULL;
	//}
	//
}

void
ChatCompletionRequestMessageContentPart::fromJson(char* jsonStr)
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
	const gchar *image_urlKey = "image_url";
	node = json_object_get_member(pJsonObject, image_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("ChatCompletionRequestMessageContentPartImage_image_url")) {
			jsonToValue(&image_url, node, "ChatCompletionRequestMessageContentPartImage_image_url", "ChatCompletionRequestMessageContentPartImage_image_url");
		} else {
			
			ChatCompletionRequestMessageContentPartImage_image_url* obj = static_cast<ChatCompletionRequestMessageContentPartImage_image_url*> (&image_url);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ChatCompletionRequestMessageContentPart::ChatCompletionRequestMessageContentPart(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionRequestMessageContentPart::toJson()
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
	if (isprimitive("ChatCompletionRequestMessageContentPartImage_image_url")) {
		ChatCompletionRequestMessageContentPartImage_image_url obj = getImageUrl();
		node = converttoJson(&obj, "ChatCompletionRequestMessageContentPartImage_image_url", "");
	}
	else {
		
		ChatCompletionRequestMessageContentPartImage_image_url obj = static_cast<ChatCompletionRequestMessageContentPartImage_image_url> (getImageUrl());
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
ChatCompletionRequestMessageContentPart::getType()
{
	return type;
}

void
ChatCompletionRequestMessageContentPart::setType(std::string  type)
{
	this->type = type;
}

std::string
ChatCompletionRequestMessageContentPart::getText()
{
	return text;
}

void
ChatCompletionRequestMessageContentPart::setText(std::string  text)
{
	this->text = text;
}

ChatCompletionRequestMessageContentPartImage_image_url
ChatCompletionRequestMessageContentPart::getImageUrl()
{
	return image_url;
}

void
ChatCompletionRequestMessageContentPart::setImageUrl(ChatCompletionRequestMessageContentPartImage_image_url  image_url)
{
	this->image_url = image_url;
}


