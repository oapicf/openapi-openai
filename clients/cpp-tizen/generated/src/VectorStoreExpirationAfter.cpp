#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VectorStoreExpirationAfter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VectorStoreExpirationAfter::VectorStoreExpirationAfter()
{
	//__init();
}

VectorStoreExpirationAfter::~VectorStoreExpirationAfter()
{
	//__cleanup();
}

void
VectorStoreExpirationAfter::__init()
{
	//anchor = std::string();
	//days = int(0);
}

void
VectorStoreExpirationAfter::__cleanup()
{
	//if(anchor != NULL) {
	//
	//delete anchor;
	//anchor = NULL;
	//}
	//if(days != NULL) {
	//
	//delete days;
	//days = NULL;
	//}
	//
}

void
VectorStoreExpirationAfter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *anchorKey = "anchor";
	node = json_object_get_member(pJsonObject, anchorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&anchor, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *daysKey = "days";
	node = json_object_get_member(pJsonObject, daysKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&days, node, "int", "");
		} else {
			
		}
	}
}

VectorStoreExpirationAfter::VectorStoreExpirationAfter(char* json)
{
	this->fromJson(json);
}

char*
VectorStoreExpirationAfter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAnchor();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *anchorKey = "anchor";
	json_object_set_member(pJsonObject, anchorKey, node);
	if (isprimitive("int")) {
		int obj = getDays();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *daysKey = "days";
	json_object_set_member(pJsonObject, daysKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
VectorStoreExpirationAfter::getAnchor()
{
	return anchor;
}

void
VectorStoreExpirationAfter::setAnchor(std::string  anchor)
{
	this->anchor = anchor;
}

int
VectorStoreExpirationAfter::getDays()
{
	return days;
}

void
VectorStoreExpirationAfter::setDays(int  days)
{
	this->days = days;
}


