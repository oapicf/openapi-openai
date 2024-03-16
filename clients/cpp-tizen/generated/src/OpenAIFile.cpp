#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OpenAIFile.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OpenAIFile::OpenAIFile()
{
	//__init();
}

OpenAIFile::~OpenAIFile()
{
	//__cleanup();
}

void
OpenAIFile::__init()
{
	//id = std::string();
	//object = std::string();
	//bytes = int(0);
	//created_at = int(0);
	//filename = std::string();
	//purpose = std::string();
	//status = std::string();
	//status_details = null;
}

void
OpenAIFile::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(bytes != NULL) {
	//
	//delete bytes;
	//bytes = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(filename != NULL) {
	//
	//delete filename;
	//filename = NULL;
	//}
	//if(purpose != NULL) {
	//
	//delete purpose;
	//purpose = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(status_details != NULL) {
	//
	//delete status_details;
	//status_details = NULL;
	//}
	//
}

void
OpenAIFile::fromJson(char* jsonStr)
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
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *bytesKey = "bytes";
	node = json_object_get_member(pJsonObject, bytesKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&bytes, node, "int", "");
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
	const gchar *filenameKey = "filename";
	node = json_object_get_member(pJsonObject, filenameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&filename, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *purposeKey = "purpose";
	node = json_object_get_member(pJsonObject, purposeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&purpose, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *status_detailsKey = "status_details";
	node = json_object_get_member(pJsonObject, status_detailsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status_details, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&status_details);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OpenAIFile::OpenAIFile(char* json)
{
	this->fromJson(json);
}

char*
OpenAIFile::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	if (isprimitive("int")) {
		int obj = getBytes();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *bytesKey = "bytes";
	json_object_set_member(pJsonObject, bytesKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFilename();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *filenameKey = "filename";
	json_object_set_member(pJsonObject, filenameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPurpose();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *purposeKey = "purpose";
	json_object_set_member(pJsonObject, purposeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatusDetails();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getStatusDetails());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *status_detailsKey = "status_details";
	json_object_set_member(pJsonObject, status_detailsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OpenAIFile::getId()
{
	return id;
}

void
OpenAIFile::setId(std::string  id)
{
	this->id = id;
}

std::string
OpenAIFile::getObject()
{
	return object;
}

void
OpenAIFile::setObject(std::string  object)
{
	this->object = object;
}

int
OpenAIFile::getBytes()
{
	return bytes;
}

void
OpenAIFile::setBytes(int  bytes)
{
	this->bytes = bytes;
}

int
OpenAIFile::getCreatedAt()
{
	return created_at;
}

void
OpenAIFile::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
OpenAIFile::getFilename()
{
	return filename;
}

void
OpenAIFile::setFilename(std::string  filename)
{
	this->filename = filename;
}

std::string
OpenAIFile::getPurpose()
{
	return purpose;
}

void
OpenAIFile::setPurpose(std::string  purpose)
{
	this->purpose = purpose;
}

std::string
OpenAIFile::getStatus()
{
	return status;
}

void
OpenAIFile::setStatus(std::string  status)
{
	this->status = status;
}

std::string
OpenAIFile::getStatusDetails()
{
	return status_details;
}

void
OpenAIFile::setStatusDetails(std::string  status_details)
{
	this->status_details = status_details;
}


