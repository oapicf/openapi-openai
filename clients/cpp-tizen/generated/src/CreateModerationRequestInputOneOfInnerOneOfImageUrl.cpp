#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateModerationRequest_input_oneOf_inner_oneOf_image_url.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateModerationRequest_input_oneOf_inner_oneOf_image_url::CreateModerationRequest_input_oneOf_inner_oneOf_image_url()
{
	//__init();
}

CreateModerationRequest_input_oneOf_inner_oneOf_image_url::~CreateModerationRequest_input_oneOf_inner_oneOf_image_url()
{
	//__cleanup();
}

void
CreateModerationRequest_input_oneOf_inner_oneOf_image_url::__init()
{
	//url = std::string();
}

void
CreateModerationRequest_input_oneOf_inner_oneOf_image_url::__cleanup()
{
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
CreateModerationRequest_input_oneOf_inner_oneOf_image_url::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
}

CreateModerationRequest_input_oneOf_inner_oneOf_image_url::CreateModerationRequest_input_oneOf_inner_oneOf_image_url(char* json)
{
	this->fromJson(json);
}

char*
CreateModerationRequest_input_oneOf_inner_oneOf_image_url::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateModerationRequest_input_oneOf_inner_oneOf_image_url::getUrl()
{
	return url;
}

void
CreateModerationRequest_input_oneOf_inner_oneOf_image_url::setUrl(std::string  url)
{
	this->url = url;
}


