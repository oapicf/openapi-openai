#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UploadPart.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UploadPart::UploadPart()
{
	//__init();
}

UploadPart::~UploadPart()
{
	//__cleanup();
}

void
UploadPart::__init()
{
	//id = std::string();
	//created_at = int(0);
	//upload_id = std::string();
	//object = std::string();
}

void
UploadPart::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(upload_id != NULL) {
	//
	//delete upload_id;
	//upload_id = NULL;
	//}
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//
}

void
UploadPart::fromJson(char* jsonStr)
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
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *upload_idKey = "upload_id";
	node = json_object_get_member(pJsonObject, upload_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&upload_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
}

UploadPart::UploadPart(char* json)
{
	this->fromJson(json);
}

char*
UploadPart::toJson()
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
	if (isprimitive("int")) {
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUploadId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *upload_idKey = "upload_id";
	json_object_set_member(pJsonObject, upload_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UploadPart::getId()
{
	return id;
}

void
UploadPart::setId(std::string  id)
{
	this->id = id;
}

int
UploadPart::getCreatedAt()
{
	return created_at;
}

void
UploadPart::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
UploadPart::getUploadId()
{
	return upload_id;
}

void
UploadPart::setUploadId(std::string  upload_id)
{
	this->upload_id = upload_id;
}

std::string
UploadPart::getObject()
{
	return object;
}

void
UploadPart::setObject(std::string  object)
{
	this->object = object;
}


