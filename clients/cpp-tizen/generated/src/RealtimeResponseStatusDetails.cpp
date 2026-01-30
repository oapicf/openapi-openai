#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeResponse_status_details.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeResponse_status_details::RealtimeResponse_status_details()
{
	//__init();
}

RealtimeResponse_status_details::~RealtimeResponse_status_details()
{
	//__cleanup();
}

void
RealtimeResponse_status_details::__init()
{
	//type = std::string();
	//reason = std::string();
	//error = new RealtimeResponse_status_details_error();
}

void
RealtimeResponse_status_details::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(reason != NULL) {
	//
	//delete reason;
	//reason = NULL;
	//}
	//if(error != NULL) {
	//
	//delete error;
	//error = NULL;
	//}
	//
}

void
RealtimeResponse_status_details::fromJson(char* jsonStr)
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
	const gchar *reasonKey = "reason";
	node = json_object_get_member(pJsonObject, reasonKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&reason, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *errorKey = "error";
	node = json_object_get_member(pJsonObject, errorKey);
	if (node !=NULL) {
	

		if (isprimitive("RealtimeResponse_status_details_error")) {
			jsonToValue(&error, node, "RealtimeResponse_status_details_error", "RealtimeResponse_status_details_error");
		} else {
			
			RealtimeResponse_status_details_error* obj = static_cast<RealtimeResponse_status_details_error*> (&error);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RealtimeResponse_status_details::RealtimeResponse_status_details(char* json)
{
	this->fromJson(json);
}

char*
RealtimeResponse_status_details::toJson()
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
		std::string obj = getReason();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *reasonKey = "reason";
	json_object_set_member(pJsonObject, reasonKey, node);
	if (isprimitive("RealtimeResponse_status_details_error")) {
		RealtimeResponse_status_details_error obj = getError();
		node = converttoJson(&obj, "RealtimeResponse_status_details_error", "");
	}
	else {
		
		RealtimeResponse_status_details_error obj = static_cast<RealtimeResponse_status_details_error> (getError());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *errorKey = "error";
	json_object_set_member(pJsonObject, errorKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeResponse_status_details::getType()
{
	return type;
}

void
RealtimeResponse_status_details::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeResponse_status_details::getReason()
{
	return reason;
}

void
RealtimeResponse_status_details::setReason(std::string  reason)
{
	this->reason = reason;
}

RealtimeResponse_status_details_error
RealtimeResponse_status_details::getError()
{
	return error;
}

void
RealtimeResponse_status_details::setError(RealtimeResponse_status_details_error  error)
{
	this->error = error;
}


