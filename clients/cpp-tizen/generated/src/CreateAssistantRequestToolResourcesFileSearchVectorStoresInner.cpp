#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateAssistantRequest_tool_resources_file_search_vector_stores_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateAssistantRequest_tool_resources_file_search_vector_stores_inner::CreateAssistantRequest_tool_resources_file_search_vector_stores_inner()
{
	//__init();
}

CreateAssistantRequest_tool_resources_file_search_vector_stores_inner::~CreateAssistantRequest_tool_resources_file_search_vector_stores_inner()
{
	//__cleanup();
}

void
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner::__init()
{
	//new std::list()std::list> file_ids;
	//chunking_strategy = new CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy();
	//metadata = null;
}

void
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner::__cleanup()
{
	//if(file_ids != NULL) {
	//file_ids.RemoveAll(true);
	//delete file_ids;
	//file_ids = NULL;
	//}
	//if(chunking_strategy != NULL) {
	//
	//delete chunking_strategy;
	//chunking_strategy = NULL;
	//}
	//if(metadata != NULL) {
	//
	//delete metadata;
	//metadata = NULL;
	//}
	//
}

void
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *file_idsKey = "file_ids";
	node = json_object_get_member(pJsonObject, file_idsKey);
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
			file_ids = new_list;
		}
		
	}
	const gchar *chunking_strategyKey = "chunking_strategy";
	node = json_object_get_member(pJsonObject, chunking_strategyKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy")) {
			jsonToValue(&chunking_strategy, node, "CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy", "CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy");
		} else {
			
			CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy* obj = static_cast<CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy*> (&chunking_strategy);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *metadataKey = "metadata";
	node = json_object_get_member(pJsonObject, metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&metadata, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateAssistantRequest_tool_resources_file_search_vector_stores_inner::CreateAssistantRequest_tool_resources_file_search_vector_stores_inner(char* json)
{
	this->fromJson(json);
}

char*
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getFileIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getFileIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *file_idsKey = "file_ids";
	json_object_set_member(pJsonObject, file_idsKey, node);
	if (isprimitive("CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy")) {
		CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy obj = getChunkingStrategy();
		node = converttoJson(&obj, "CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy", "");
	}
	else {
		
		CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy obj = static_cast<CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy> (getChunkingStrategy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *chunking_strategyKey = "chunking_strategy";
	json_object_set_member(pJsonObject, chunking_strategyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMetadata();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *metadataKey = "metadata";
	json_object_set_member(pJsonObject, metadataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner::getFileIds()
{
	return file_ids;
}

void
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner::setFileIds(std::list <std::string> file_ids)
{
	this->file_ids = file_ids;
}

CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner::getChunkingStrategy()
{
	return chunking_strategy;
}

void
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner::setChunkingStrategy(CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy  chunking_strategy)
{
	this->chunking_strategy = chunking_strategy;
}

std::string
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner::getMetadata()
{
	return metadata;
}

void
CreateAssistantRequest_tool_resources_file_search_vector_stores_inner::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}


