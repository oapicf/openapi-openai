#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLog_api_key_created.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLog_api_key_created::AuditLog_api_key_created()
{
	//__init();
}

AuditLog_api_key_created::~AuditLog_api_key_created()
{
	//__cleanup();
}

void
AuditLog_api_key_created::__init()
{
	//id = std::string();
	//data = new AuditLog_api_key_created_data();
}

void
AuditLog_api_key_created::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//
}

void
AuditLog_api_key_created::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("AuditLog_api_key_created_data")) {
			jsonToValue(&data, node, "AuditLog_api_key_created_data", "AuditLog_api_key_created_data");
		} else {
			
			AuditLog_api_key_created_data* obj = static_cast<AuditLog_api_key_created_data*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AuditLog_api_key_created::AuditLog_api_key_created(char* json)
{
	this->fromJson(json);
}

char*
AuditLog_api_key_created::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("AuditLog_api_key_created_data")) {
		AuditLog_api_key_created_data obj = getData();
		node = converttoJson(&obj, "AuditLog_api_key_created_data", "");
	}
	else {
		
		AuditLog_api_key_created_data obj = static_cast<AuditLog_api_key_created_data> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AuditLog_api_key_created::getId()
{
	return id;
}

void
AuditLog_api_key_created::setId(std::string  id)
{
	this->id = id;
}

AuditLog_api_key_created_data
AuditLog_api_key_created::getData()
{
	return data;
}

void
AuditLog_api_key_created::setData(AuditLog_api_key_created_data  data)
{
	this->data = data;
}


