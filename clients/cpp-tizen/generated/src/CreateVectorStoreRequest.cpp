#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateVectorStoreRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateVectorStoreRequest::CreateVectorStoreRequest()
{
	//__init();
}

CreateVectorStoreRequest::~CreateVectorStoreRequest()
{
	//__cleanup();
}

void
CreateVectorStoreRequest::__init()
{
	//new std::list()std::list> file_ids;
	//name = std::string();
	//expires_after = new VectorStoreExpirationAfter();
	//chunking_strategy = new CreateVectorStoreRequest_chunking_strategy();
	//metadata = null;
}

void
CreateVectorStoreRequest::__cleanup()
{
	//if(file_ids != NULL) {
	//file_ids.RemoveAll(true);
	//delete file_ids;
	//file_ids = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(expires_after != NULL) {
	//
	//delete expires_after;
	//expires_after = NULL;
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
CreateVectorStoreRequest::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *expires_afterKey = "expires_after";
	node = json_object_get_member(pJsonObject, expires_afterKey);
	if (node !=NULL) {
	

		if (isprimitive("VectorStoreExpirationAfter")) {
			jsonToValue(&expires_after, node, "VectorStoreExpirationAfter", "VectorStoreExpirationAfter");
		} else {
			
			VectorStoreExpirationAfter* obj = static_cast<VectorStoreExpirationAfter*> (&expires_after);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *chunking_strategyKey = "chunking_strategy";
	node = json_object_get_member(pJsonObject, chunking_strategyKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateVectorStoreRequest_chunking_strategy")) {
			jsonToValue(&chunking_strategy, node, "CreateVectorStoreRequest_chunking_strategy", "CreateVectorStoreRequest_chunking_strategy");
		} else {
			
			CreateVectorStoreRequest_chunking_strategy* obj = static_cast<CreateVectorStoreRequest_chunking_strategy*> (&chunking_strategy);
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

CreateVectorStoreRequest::CreateVectorStoreRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateVectorStoreRequest::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("VectorStoreExpirationAfter")) {
		VectorStoreExpirationAfter obj = getExpiresAfter();
		node = converttoJson(&obj, "VectorStoreExpirationAfter", "");
	}
	else {
		
		VectorStoreExpirationAfter obj = static_cast<VectorStoreExpirationAfter> (getExpiresAfter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *expires_afterKey = "expires_after";
	json_object_set_member(pJsonObject, expires_afterKey, node);
	if (isprimitive("CreateVectorStoreRequest_chunking_strategy")) {
		CreateVectorStoreRequest_chunking_strategy obj = getChunkingStrategy();
		node = converttoJson(&obj, "CreateVectorStoreRequest_chunking_strategy", "");
	}
	else {
		
		CreateVectorStoreRequest_chunking_strategy obj = static_cast<CreateVectorStoreRequest_chunking_strategy> (getChunkingStrategy());
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
CreateVectorStoreRequest::getFileIds()
{
	return file_ids;
}

void
CreateVectorStoreRequest::setFileIds(std::list <std::string> file_ids)
{
	this->file_ids = file_ids;
}

std::string
CreateVectorStoreRequest::getName()
{
	return name;
}

void
CreateVectorStoreRequest::setName(std::string  name)
{
	this->name = name;
}

VectorStoreExpirationAfter
CreateVectorStoreRequest::getExpiresAfter()
{
	return expires_after;
}

void
CreateVectorStoreRequest::setExpiresAfter(VectorStoreExpirationAfter  expires_after)
{
	this->expires_after = expires_after;
}

CreateVectorStoreRequest_chunking_strategy
CreateVectorStoreRequest::getChunkingStrategy()
{
	return chunking_strategy;
}

void
CreateVectorStoreRequest::setChunkingStrategy(CreateVectorStoreRequest_chunking_strategy  chunking_strategy)
{
	this->chunking_strategy = chunking_strategy;
}

std::string
CreateVectorStoreRequest::getMetadata()
{
	return metadata;
}

void
CreateVectorStoreRequest::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}


