#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateVectorStoreFileRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateVectorStoreFileRequest::CreateVectorStoreFileRequest()
{
	//__init();
}

CreateVectorStoreFileRequest::~CreateVectorStoreFileRequest()
{
	//__cleanup();
}

void
CreateVectorStoreFileRequest::__init()
{
	//file_id = std::string();
	//chunking_strategy = new ChunkingStrategyRequestParam();
}

void
CreateVectorStoreFileRequest::__cleanup()
{
	//if(file_id != NULL) {
	//
	//delete file_id;
	//file_id = NULL;
	//}
	//if(chunking_strategy != NULL) {
	//
	//delete chunking_strategy;
	//chunking_strategy = NULL;
	//}
	//
}

void
CreateVectorStoreFileRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *file_idKey = "file_id";
	node = json_object_get_member(pJsonObject, file_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&file_id, node, "std::string", "");
		} else {
			
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

CreateVectorStoreFileRequest::CreateVectorStoreFileRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateVectorStoreFileRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getFileId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *file_idKey = "file_id";
	json_object_set_member(pJsonObject, file_idKey, node);
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

std::string
CreateVectorStoreFileRequest::getFileId()
{
	return file_id;
}

void
CreateVectorStoreFileRequest::setFileId(std::string  file_id)
{
	this->file_id = file_id;
}

ChunkingStrategyRequestParam
CreateVectorStoreFileRequest::getChunkingStrategy()
{
	return chunking_strategy;
}

void
CreateVectorStoreFileRequest::setChunkingStrategy(ChunkingStrategyRequestParam  chunking_strategy)
{
	this->chunking_strategy = chunking_strategy;
}


