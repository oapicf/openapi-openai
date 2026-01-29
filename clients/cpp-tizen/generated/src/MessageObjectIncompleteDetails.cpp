#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageObject_incomplete_details.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageObject_incomplete_details::MessageObject_incomplete_details()
{
	//__init();
}

MessageObject_incomplete_details::~MessageObject_incomplete_details()
{
	//__cleanup();
}

void
MessageObject_incomplete_details::__init()
{
	//reason = std::string();
}

void
MessageObject_incomplete_details::__cleanup()
{
	//if(reason != NULL) {
	//
	//delete reason;
	//reason = NULL;
	//}
	//
}

void
MessageObject_incomplete_details::fromJson(char* jsonStr)
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

MessageObject_incomplete_details::MessageObject_incomplete_details(char* json)
{
	this->fromJson(json);
}

char*
MessageObject_incomplete_details::toJson()
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
MessageObject_incomplete_details::getReason()
{
	return reason;
}

void
MessageObject_incomplete_details::setReason(std::string  reason)
{
	this->reason = reason;
}


