#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateVectorStoreFileBatchRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateVectorStoreFileBatchRequest::CreateVectorStoreFileBatchRequest()
{
	//__init();
}

CreateVectorStoreFileBatchRequest::~CreateVectorStoreFileBatchRequest()
{
	//__cleanup();
}

void
CreateVectorStoreFileBatchRequest::__init()
{
	//new std::list()std::list> file_ids;
	//chunking_strategy = new ChunkingStrategyRequestParam();
}

void
CreateVectorStoreFileBatchRequest::__cleanup()
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
	//
}

void
CreateVectorStoreFileBatchRequest::fromJson(char* jsonStr)
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
	

		if (isprimitive("ChunkingStrategyRequestParam")) {
			jsonToValue(&chunking_strategy, node, "ChunkingStrategyRequestParam", "ChunkingStrategyRequestParam");
		} else {
			
			ChunkingStrategyRequestParam* obj = static_cast<ChunkingStrategyRequestParam*> (&chunking_strategy);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateVectorStoreFileBatchRequest::CreateVectorStoreFileBatchRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateVectorStoreFileBatchRequest::toJson()
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
	if (isprimitive("ChunkingStrategyRequestParam")) {
		ChunkingStrategyRequestParam obj = getChunkingStrategy();
		node = converttoJson(&obj, "ChunkingStrategyRequestParam", "");
	}
	else {
		
		ChunkingStrategyRequestParam obj = static_cast<ChunkingStrategyRequestParam> (getChunkingStrategy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *chunking_strategyKey = "chunking_strategy";
	json_object_set_member(pJsonObject, chunking_strategyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
CreateVectorStoreFileBatchRequest::getFileIds()
{
	return file_ids;
}

void
CreateVectorStoreFileBatchRequest::setFileIds(std::list <std::string> file_ids)
{
	this->file_ids = file_ids;
}

ChunkingStrategyRequestParam
CreateVectorStoreFileBatchRequest::getChunkingStrategy()
{
	return chunking_strategy;
}

void
CreateVectorStoreFileBatchRequest::setChunkingStrategy(ChunkingStrategyRequestParam  chunking_strategy)
{
	this->chunking_strategy = chunking_strategy;
}


