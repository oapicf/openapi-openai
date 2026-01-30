#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeResponse_status_details_error.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeResponse_status_details_error::RealtimeResponse_status_details_error()
{
	//__init();
}

RealtimeResponse_status_details_error::~RealtimeResponse_status_details_error()
{
	//__cleanup();
}

void
RealtimeResponse_status_details_error::__init()
{
	//type = std::string();
	//code = std::string();
}

void
RealtimeResponse_status_details_error::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(code != NULL) {
	//
	//delete code;
	//code = NULL;
	//}
	//
}

void
RealtimeResponse_status_details_error::fromJson(char* jsonStr)
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
	const gchar *codeKey = "code";
	node = json_object_get_member(pJsonObject, codeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&code, node, "std::string", "");
		} else {
			
		}
	}
}

RealtimeResponse_status_details_error::RealtimeResponse_status_details_error(char* json)
{
	this->fromJson(json);
}

char*
RealtimeResponse_status_details_error::toJson()
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
		std::string obj = getCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *codeKey = "code";
	json_object_set_member(pJsonObject, codeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeResponse_status_details_error::getType()
{
	return type;
}

void
RealtimeResponse_status_details_error::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeResponse_status_details_error::getCode()
{
	return code;
}

void
RealtimeResponse_status_details_error::setCode(std::string  code)
{
	this->code = code;
}


