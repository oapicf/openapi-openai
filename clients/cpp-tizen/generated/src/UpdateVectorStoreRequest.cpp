#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateVectorStoreRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateVectorStoreRequest::UpdateVectorStoreRequest()
{
	//__init();
}

UpdateVectorStoreRequest::~UpdateVectorStoreRequest()
{
	//__cleanup();
}

void
UpdateVectorStoreRequest::__init()
{
	//name = std::string();
	//expires_after = new VectorStoreExpirationAfter();
	//metadata = null;
}

void
UpdateVectorStoreRequest::__cleanup()
{
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
	//if(metadata != NULL) {
	//
	//delete metadata;
	//metadata = NULL;
	//}
	//
}

void
UpdateVectorStoreRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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

UpdateVectorStoreRequest::UpdateVectorStoreRequest(char* json)
{
	this->fromJson(json);
}

char*
UpdateVectorStoreRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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

std::string
UpdateVectorStoreRequest::getName()
{
	return name;
}

void
UpdateVectorStoreRequest::setName(std::string  name)
{
	this->name = name;
}

VectorStoreExpirationAfter
UpdateVectorStoreRequest::getExpiresAfter()
{
	return expires_after;
}

void
UpdateVectorStoreRequest::setExpiresAfter(VectorStoreExpirationAfter  expires_after)
{
	this->expires_after = expires_after;
}

std::string
UpdateVectorStoreRequest::getMetadata()
{
	return metadata;
}

void
UpdateVectorStoreRequest::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}


