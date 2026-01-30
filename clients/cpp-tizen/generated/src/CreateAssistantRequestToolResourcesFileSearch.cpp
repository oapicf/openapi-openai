#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateAssistantRequest_tool_resources_file_search.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateAssistantRequest_tool_resources_file_search::CreateAssistantRequest_tool_resources_file_search()
{
	//__init();
}

CreateAssistantRequest_tool_resources_file_search::~CreateAssistantRequest_tool_resources_file_search()
{
	//__cleanup();
}

void
CreateAssistantRequest_tool_resources_file_search::__init()
{
	//new std::list()std::list> vector_store_ids;
	//new std::list()std::list> vector_stores;
}

void
CreateAssistantRequest_tool_resources_file_search::__cleanup()
{
	//if(vector_store_ids != NULL) {
	//vector_store_ids.RemoveAll(true);
	//delete vector_store_ids;
	//vector_store_ids = NULL;
	//}
	//if(vector_stores != NULL) {
	//vector_stores.RemoveAll(true);
	//delete vector_stores;
	//vector_stores = NULL;
	//}
	//
}

void
CreateAssistantRequest_tool_resources_file_search::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *vector_store_idsKey = "vector_store_ids";
	node = json_object_get_member(pJsonObject, vector_store_idsKey);
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
			vector_store_ids = new_list;
		}
		
	}
	const gchar *vector_storesKey = "vector_stores";
	node = json_object_get_member(pJsonObject, vector_storesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CreateAssistantRequest_tool_resources_file_search_vector_stores_inner> new_list;
			CreateAssistantRequest_tool_resources_file_search_vector_stores_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CreateAssistantRequest_tool_resources_file_search_vector_stores_inner")) {
					jsonToValue(&inst, temp_json, "CreateAssistantRequest_tool_resources_file_search_vector_stores_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			vector_stores = new_list;
		}
		
	}
}

CreateAssistantRequest_tool_resources_file_search::CreateAssistantRequest_tool_resources_file_search(char* json)
{
	this->fromJson(json);
}

char*
CreateAssistantRequest_tool_resources_file_search::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getVectorStoreIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getVectorStoreIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *vector_store_idsKey = "vector_store_ids";
	json_object_set_member(pJsonObject, vector_store_idsKey, node);
	if (isprimitive("CreateAssistantRequest_tool_resources_file_search_vector_stores_inner")) {
		list<CreateAssistantRequest_tool_resources_file_search_vector_stores_inner> new_list = static_cast<list <CreateAssistantRequest_tool_resources_file_search_vector_stores_inner> > (getVectorStores());
		node = converttoJson(&new_list, "CreateAssistantRequest_tool_resources_file_search_vector_stores_inner", "array");
	} else {
		node = json_node_alloc();
		list<CreateAssistantRequest_tool_resources_file_search_vector_stores_inner> new_list = static_cast<list <CreateAssistantRequest_tool_resources_file_search_vector_stores_inner> > (getVectorStores());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CreateAssistantRequest_tool_resources_file_search_vector_stores_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CreateAssistantRequest_tool_resources_file_search_vector_stores_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *vector_storesKey = "vector_stores";
	json_object_set_member(pJsonObject, vector_storesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
CreateAssistantRequest_tool_resources_file_search::getVectorStoreIds()
{
	return vector_store_ids;
}

void
CreateAssistantRequest_tool_resources_file_search::setVectorStoreIds(std::list <std::string> vector_store_ids)
{
	this->vector_store_ids = vector_store_ids;
}

std::list<CreateAssistantRequest_tool_resources_file_search_vector_stores_inner>
CreateAssistantRequest_tool_resources_file_search::getVectorStores()
{
	return vector_stores;
}

void
CreateAssistantRequest_tool_resources_file_search::setVectorStores(std::list <CreateAssistantRequest_tool_resources_file_search_vector_stores_inner> vector_stores)
{
	this->vector_stores = vector_stores;
}


