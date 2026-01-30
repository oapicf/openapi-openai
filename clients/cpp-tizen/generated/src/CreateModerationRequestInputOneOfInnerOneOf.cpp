#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateModerationRequest_input_oneOf_inner_oneOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateModerationRequest_input_oneOf_inner_oneOf::CreateModerationRequest_input_oneOf_inner_oneOf()
{
	//__init();
}

CreateModerationRequest_input_oneOf_inner_oneOf::~CreateModerationRequest_input_oneOf_inner_oneOf()
{
	//__cleanup();
}

void
CreateModerationRequest_input_oneOf_inner_oneOf::__init()
{
	//type = std::string();
	//image_url = new CreateModerationRequest_input_oneOf_inner_oneOf_image_url();
}

void
CreateModerationRequest_input_oneOf_inner_oneOf::__cleanup()
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
CreateModerationRequest_input_oneOf_inner_oneOf::fromJson(char* jsonStr)
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
}

CreateModerationRequest_input_oneOf_inner_oneOf::CreateModerationRequest_input_oneOf_inner_oneOf(char* json)
{
	this->fromJson(json);
}

char*
CreateModerationRequest_input_oneOf_inner_oneOf::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateModerationRequest_input_oneOf_inner_oneOf::getType()
{
	return type;
}

void
CreateModerationRequest_input_oneOf_inner_oneOf::setType(std::string  type)
{
	this->type = type;
}

CreateModerationRequest_input_oneOf_inner_oneOf_image_url
CreateModerationRequest_input_oneOf_inner_oneOf::getImageUrl()
{
	return image_url;
}

void
CreateModerationRequest_input_oneOf_inner_oneOf::setImageUrl(CreateModerationRequest_input_oneOf_inner_oneOf_image_url  image_url)
{
	this->image_url = image_url;
}


