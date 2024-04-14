#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Image.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Image::Image()
{
	//__init();
}

Image::~Image()
{
	//__cleanup();
}

void
Image::__init()
{
	//b64_json = std::string();
	//url = std::string();
	//revised_prompt = std::string();
}

void
Image::__cleanup()
{
	//if(b64_json != NULL) {
	//
	//delete b64_json;
	//b64_json = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//if(revised_prompt != NULL) {
	//
	//delete revised_prompt;
	//revised_prompt = NULL;
	//}
	//
}

void
Image::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *b64_jsonKey = "b64_json";
	node = json_object_get_member(pJsonObject, b64_jsonKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&b64_json, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *revised_promptKey = "revised_prompt";
	node = json_object_get_member(pJsonObject, revised_promptKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&revised_prompt, node, "std::string", "");
		} else {
			
		}
	}
}

Image::Image(char* json)
{
	this->fromJson(json);
}

char*
Image::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getB64Json();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *b64_jsonKey = "b64_json";
	json_object_set_member(pJsonObject, b64_jsonKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRevisedPrompt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *revised_promptKey = "revised_prompt";
	json_object_set_member(pJsonObject, revised_promptKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Image::getB64Json()
{
	return b64_json;
}

void
Image::setB64Json(std::string  b64_json)
{
	this->b64_json = b64_json;
}

std::string
Image::getUrl()
{
	return url;
}

void
Image::setUrl(std::string  url)
{
	this->url = url;
}

std::string
Image::getRevisedPrompt()
{
	return revised_prompt;
}

void
Image::setRevisedPrompt(std::string  revised_prompt)
{
	this->revised_prompt = revised_prompt;
}


