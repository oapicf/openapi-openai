#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChatCompletionRequestMessageContentPartImage.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChatCompletionRequestMessageContentPartImage::ChatCompletionRequestMessageContentPartImage()
{
	//__init();
}

ChatCompletionRequestMessageContentPartImage::~ChatCompletionRequestMessageContentPartImage()
{
	//__cleanup();
}

void
ChatCompletionRequestMessageContentPartImage::__init()
{
	//type = std::string();
	//image_url = new ChatCompletionRequestMessageContentPartImage_image_url();
}

void
ChatCompletionRequestMessageContentPartImage::__cleanup()
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
ChatCompletionRequestMessageContentPartImage::fromJson(char* jsonStr)
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
	

		if (isprimitive("ChatCompletionRequestMessageContentPartImage_image_url")) {
			jsonToValue(&image_url, node, "ChatCompletionRequestMessageContentPartImage_image_url", "ChatCompletionRequestMessageContentPartImage_image_url");
		} else {
			
			ChatCompletionRequestMessageContentPartImage_image_url* obj = static_cast<ChatCompletionRequestMessageContentPartImage_image_url*> (&image_url);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ChatCompletionRequestMessageContentPartImage::ChatCompletionRequestMessageContentPartImage(char* json)
{
	this->fromJson(json);
}

char*
ChatCompletionRequestMessageContentPartImage::toJson()
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
ChatCompletionRequestMessageContentPartImage::getType()
{
	return type;
}

void
ChatCompletionRequestMessageContentPartImage::setType(std::string  type)
{
	this->type = type;
}

ChatCompletionRequestMessageContentPartImage_image_url
ChatCompletionRequestMessageContentPartImage::getImageUrl()
{
	return image_url;
}

void
ChatCompletionRequestMessageContentPartImage::setImageUrl(ChatCompletionRequestMessageContentPartImage_image_url  image_url)
{
	this->image_url = image_url;
}


