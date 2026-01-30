#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Static_Chunking_Strategy_static.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Static_Chunking_Strategy_static::Static_Chunking_Strategy_static()
{
	//__init();
}

Static_Chunking_Strategy_static::~Static_Chunking_Strategy_static()
{
	//__cleanup();
}

void
Static_Chunking_Strategy_static::__init()
{
	//max_chunk_size_tokens = int(0);
	//chunk_overlap_tokens = int(0);
}

void
Static_Chunking_Strategy_static::__cleanup()
{
	//if(max_chunk_size_tokens != NULL) {
	//
	//delete max_chunk_size_tokens;
	//max_chunk_size_tokens = NULL;
	//}
	//if(chunk_overlap_tokens != NULL) {
	//
	//delete chunk_overlap_tokens;
	//chunk_overlap_tokens = NULL;
	//}
	//
}

void
Static_Chunking_Strategy_static::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *max_chunk_size_tokensKey = "max_chunk_size_tokens";
	node = json_object_get_member(pJsonObject, max_chunk_size_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_chunk_size_tokens, node, "int", "");
		} else {
			
		}
	}
	const gchar *chunk_overlap_tokensKey = "chunk_overlap_tokens";
	node = json_object_get_member(pJsonObject, chunk_overlap_tokensKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&chunk_overlap_tokens, node, "int", "");
		} else {
			
		}
	}
}

Static_Chunking_Strategy_static::Static_Chunking_Strategy_static(char* json)
{
	this->fromJson(json);
}

char*
Static_Chunking_Strategy_static::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getMaxChunkSizeTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_chunk_size_tokensKey = "max_chunk_size_tokens";
	json_object_set_member(pJsonObject, max_chunk_size_tokensKey, node);
	if (isprimitive("int")) {
		int obj = getChunkOverlapTokens();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *chunk_overlap_tokensKey = "chunk_overlap_tokens";
	json_object_set_member(pJsonObject, chunk_overlap_tokensKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
Static_Chunking_Strategy_static::getMaxChunkSizeTokens()
{
	return max_chunk_size_tokens;
}

void
Static_Chunking_Strategy_static::setMaxChunkSizeTokens(int  max_chunk_size_tokens)
{
	this->max_chunk_size_tokens = max_chunk_size_tokens;
}

int
Static_Chunking_Strategy_static::getChunkOverlapTokens()
{
	return chunk_overlap_tokens;
}

void
Static_Chunking_Strategy_static::setChunkOverlapTokens(int  chunk_overlap_tokens)
{
	this->chunk_overlap_tokens = chunk_overlap_tokens;
}


