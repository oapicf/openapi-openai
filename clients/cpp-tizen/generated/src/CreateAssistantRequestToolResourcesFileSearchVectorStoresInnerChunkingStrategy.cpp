#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy()
{
	//__init();
}

CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::~CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy()
{
	//__cleanup();
}

void
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::__init()
{
	//type = std::string();
	//r_static = new Static_Chunking_Strategy_static();
}

void
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(r_static != NULL) {
	//
	//delete r_static;
	//r_static = NULL;
	//}
	//
}

void
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::fromJson(char* jsonStr)
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
	const gchar *r_staticKey = "static";
	node = json_object_get_member(pJsonObject, r_staticKey);
	if (node !=NULL) {
	

		if (isprimitive("Static_Chunking_Strategy_static")) {
			jsonToValue(&r_static, node, "Static_Chunking_Strategy_static", "Static_Chunking_Strategy_static");
		} else {
			
			Static_Chunking_Strategy_static* obj = static_cast<Static_Chunking_Strategy_static*> (&r_static);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy(char* json)
{
	this->fromJson(json);
}

char*
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::toJson()
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
	if (isprimitive("Static_Chunking_Strategy_static")) {
		Static_Chunking_Strategy_static obj = getRStatic();
		node = converttoJson(&obj, "Static_Chunking_Strategy_static", "");
	}
	else {
		
		Static_Chunking_Strategy_static obj = static_cast<Static_Chunking_Strategy_static> (getRStatic());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *r_staticKey = "static";
	json_object_set_member(pJsonObject, r_staticKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::getType()
{
	return type;
}

void
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::setType(std::string  type)
{
	this->type = type;
}

Static_Chunking_Strategy_static
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::getRStatic()
{
	return r_static;
}

void
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy::setRStatic(Static_Chunking_Strategy_static  r_static)
{
	this->r_static = r_static;
}


