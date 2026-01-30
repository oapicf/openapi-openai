#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BatchRequestInput.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BatchRequestInput::BatchRequestInput()
{
	//__init();
}

BatchRequestInput::~BatchRequestInput()
{
	//__cleanup();
}

void
BatchRequestInput::__init()
{
	//custom_id = std::string();
	//method = std::string();
	//url = std::string();
}

void
BatchRequestInput::__cleanup()
{
	//if(custom_id != NULL) {
	//
	//delete custom_id;
	//custom_id = NULL;
	//}
	//if(method != NULL) {
	//
	//delete method;
	//method = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
BatchRequestInput::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *custom_idKey = "custom_id";
	node = json_object_get_member(pJsonObject, custom_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *methodKey = "method";
	node = json_object_get_member(pJsonObject, methodKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&method, node, "std::string", "");
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
}

BatchRequestInput::BatchRequestInput(char* json)
{
	this->fromJson(json);
}

char*
BatchRequestInput::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCustomId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_idKey = "custom_id";
	json_object_set_member(pJsonObject, custom_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMethod();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *methodKey = "method";
	json_object_set_member(pJsonObject, methodKey, node);
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
BatchRequestInput::getCustomId()
{
	return custom_id;
}

void
BatchRequestInput::setCustomId(std::string  custom_id)
{
	this->custom_id = custom_id;
}

std::string
BatchRequestInput::getMethod()
{
	return method;
}

void
BatchRequestInput::setMethod(std::string  method)
{
	this->method = method;
}

std::string
BatchRequestInput::getUrl()
{
	return url;
}

void
BatchRequestInput::setUrl(std::string  url)
{
	this->url = url;
}


