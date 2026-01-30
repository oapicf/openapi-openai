#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuditLog_api_key_created_data.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuditLog_api_key_created_data::AuditLog_api_key_created_data()
{
	//__init();
}

AuditLog_api_key_created_data::~AuditLog_api_key_created_data()
{
	//__cleanup();
}

void
AuditLog_api_key_created_data::__init()
{
	//new std::list()std::list> scopes;
}

void
AuditLog_api_key_created_data::__cleanup()
{
	//if(scopes != NULL) {
	//scopes.RemoveAll(true);
	//delete scopes;
	//scopes = NULL;
	//}
	//
}

void
AuditLog_api_key_created_data::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *scopesKey = "scopes";
	node = json_object_get_member(pJsonObject, scopesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			scopes = new_list;
		}
		
	}
}

AuditLog_api_key_created_data::AuditLog_api_key_created_data(char* json)
{
	this->fromJson(json);
}

char*
AuditLog_api_key_created_data::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getScopes());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getScopes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *scopesKey = "scopes";
	json_object_set_member(pJsonObject, scopesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
AuditLog_api_key_created_data::getScopes()
{
	return scopes;
}

void
AuditLog_api_key_created_data::setScopes(std::list <std::string> scopes)
{
	this->scopes = scopes;
}


