#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateModerationRequest_input_oneOf_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateModerationRequest_input_oneOf_inner::CreateModerationRequest_input_oneOf_inner()
{
	//__init();
}

CreateModerationRequest_input_oneOf_inner::~CreateModerationRequest_input_oneOf_inner()
{
	//__cleanup();
}

void
CreateModerationRequest_input_oneOf_inner::__init()
{
	//type = std::string();
	//image_url = new CreateModerationRequest_input_oneOf_inner_oneOf_image_url();
	//text = std::string();
}

void
CreateModerationRequest_input_oneOf_inner::__cleanup()
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
	//if(text != NULL) {
	//
	//delete text;
	//text = NULL;
	//}
	//
}

void
CreateModerationRequest_input_oneOf_inner::fromJson(char* jsonStr)
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
	

		if (isprimitive("CreateModerationRequest_input_oneOf_inner_oneOf_image_url")) {
			jsonToValue(&image_url, node, "CreateModerationRequest_input_oneOf_inner_oneOf_image_url", "CreateModerationRequest_input_oneOf_inner_oneOf_image_url");
		} else {
			
			CreateModerationRequest_input_oneOf_inner_oneOf_image_url* obj = static_cast<CreateModerationRequest_input_oneOf_inner_oneOf_image_url*> (&image_url);
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

CreateModerationRequest_input_oneOf_inner::CreateModerationRequest_input_oneOf_inner(char* json)
{
	this->fromJson(json);
}

char*
CreateModerationRequest_input_oneOf_inner::toJson()
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
	if (isprimitive("CreateModerationRequest_input_oneOf_inner_oneOf_image_url")) {
		CreateModerationRequest_input_oneOf_inner_oneOf_image_url obj = getImageUrl();
		node = converttoJson(&obj, "CreateModerationRequest_input_oneOf_inner_oneOf_image_url", "");
	}
	else {
		
		CreateModerationRequest_input_oneOf_inner_oneOf_image_url obj = static_cast<CreateModerationRequest_input_oneOf_inner_oneOf_image_url> (getImageUrl());
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
CreateModerationRequest_input_oneOf_inner::getType()
{
	return type;
}

void
CreateModerationRequest_input_oneOf_inner::setType(std::string  type)
{
	this->type = type;
}

CreateModerationRequest_input_oneOf_inner_oneOf_image_url
CreateModerationRequest_input_oneOf_inner::getImageUrl()
{
	return image_url;
}

void
CreateModerationRequest_input_oneOf_inner::setImageUrl(CreateModerationRequest_input_oneOf_inner_oneOf_image_url  image_url)
{
	this->image_url = image_url;
}

std::string
CreateModerationRequest_input_oneOf_inner::getText()
{
	return text;
}

void
CreateModerationRequest_input_oneOf_inner::setText(std::string  text)
{
	this->text = text;
}


