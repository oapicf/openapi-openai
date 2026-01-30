#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Admin_api_keys_create_request.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Admin_api_keys_create_request::Admin_api_keys_create_request()
{
	//__init();
}

Admin_api_keys_create_request::~Admin_api_keys_create_request()
{
	//__cleanup();
}

void
Admin_api_keys_create_request::__init()
{
	//name = std::string();
}

void
Admin_api_keys_create_request::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
Admin_api_keys_create_request::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

Admin_api_keys_create_request::Admin_api_keys_create_request(char* json)
{
	this->fromJson(json);
}

char*
Admin_api_keys_create_request::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Admin_api_keys_create_request::getName()
{
	return name;
}

void
Admin_api_keys_create_request::setName(std::string  name)
{
	this->name = name;
}


