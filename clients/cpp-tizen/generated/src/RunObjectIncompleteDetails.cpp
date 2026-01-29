#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunObject_incomplete_details.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunObject_incomplete_details::RunObject_incomplete_details()
{
	//__init();
}

RunObject_incomplete_details::~RunObject_incomplete_details()
{
	//__cleanup();
}

void
RunObject_incomplete_details::__init()
{
	//reason = std::string();
}

void
RunObject_incomplete_details::__cleanup()
{
	//if(reason != NULL) {
	//
	//delete reason;
	//reason = NULL;
	//}
	//
}

void
RunObject_incomplete_details::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *reasonKey = "reason";
	node = json_object_get_member(pJsonObject, reasonKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&reason, node, "std::string", "");
		} else {
			
		}
	}
}

RunObject_incomplete_details::RunObject_incomplete_details(char* json)
{
	this->fromJson(json);
}

char*
RunObject_incomplete_details::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getReason();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *reasonKey = "reason";
	json_object_set_member(pJsonObject, reasonKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RunObject_incomplete_details::getReason()
{
	return reason;
}

void
RunObject_incomplete_details::setReason(std::string  reason)
{
	this->reason = reason;
}


