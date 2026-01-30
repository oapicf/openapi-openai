#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeSessionCreateResponse_client_secret.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeSessionCreateResponse_client_secret::RealtimeSessionCreateResponse_client_secret()
{
	//__init();
}

RealtimeSessionCreateResponse_client_secret::~RealtimeSessionCreateResponse_client_secret()
{
	//__cleanup();
}

void
RealtimeSessionCreateResponse_client_secret::__init()
{
	//value = std::string();
	//expires_at = int(0);
}

void
RealtimeSessionCreateResponse_client_secret::__cleanup()
{
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(expires_at != NULL) {
	//
	//delete expires_at;
	//expires_at = NULL;
	//}
	//
}

void
RealtimeSessionCreateResponse_client_secret::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *expires_atKey = "expires_at";
	node = json_object_get_member(pJsonObject, expires_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&expires_at, node, "int", "");
		} else {
			
		}
	}
}

RealtimeSessionCreateResponse_client_secret::RealtimeSessionCreateResponse_client_secret(char* json)
{
	this->fromJson(json);
}

char*
RealtimeSessionCreateResponse_client_secret::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	if (isprimitive("int")) {
		int obj = getExpiresAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *expires_atKey = "expires_at";
	json_object_set_member(pJsonObject, expires_atKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeSessionCreateResponse_client_secret::getValue()
{
	return value;
}

void
RealtimeSessionCreateResponse_client_secret::setValue(std::string  value)
{
	this->value = value;
}

int
RealtimeSessionCreateResponse_client_secret::getExpiresAt()
{
	return expires_at;
}

void
RealtimeSessionCreateResponse_client_secret::setExpiresAt(int  expires_at)
{
	this->expires_at = expires_at;
}


