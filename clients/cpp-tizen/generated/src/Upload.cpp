#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Upload.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Upload::Upload()
{
	//__init();
}

Upload::~Upload()
{
	//__cleanup();
}

void
Upload::__init()
{
	//id = std::string();
	//created_at = int(0);
	//filename = std::string();
	//bytes = int(0);
	//purpose = std::string();
	//status = std::string();
	//expires_at = int(0);
	//object = std::string();
	//file = new OpenAIFile();
}

void
Upload::__cleanup()
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
	//if(filename != NULL) {
	//
	//delete filename;
	//filename = NULL;
	//}
	//if(bytes != NULL) {
	//
	//delete bytes;
	//bytes = NULL;
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
	//if(expires_at != NULL) {
	//
	//delete expires_at;
	//expires_at = NULL;
	//}
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(file != NULL) {
	//
	//delete file;
	//file = NULL;
	//}
	//
}

void
Upload::fromJson(char* jsonStr)
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
	const gchar *filenameKey = "filename";
	node = json_object_get_member(pJsonObject, filenameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&filename, node, "std::string", "");
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
	const gchar *expires_atKey = "expires_at";
	node = json_object_get_member(pJsonObject, expires_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&expires_at, node, "int", "");
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
	const gchar *fileKey = "file";
	node = json_object_get_member(pJsonObject, fileKey);
	if (node !=NULL) {
	

		if (isprimitive("OpenAIFile")) {
			jsonToValue(&file, node, "OpenAIFile", "OpenAIFile");
		} else {
			
			OpenAIFile* obj = static_cast<OpenAIFile*> (&file);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Upload::Upload(char* json)
{
	this->fromJson(json);
}

char*
Upload::toJson()
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
		std::string obj = getFilename();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *filenameKey = "filename";
	json_object_set_member(pJsonObject, filenameKey, node);
	if (isprimitive("int")) {
		int obj = getBytes();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *bytesKey = "bytes";
	json_object_set_member(pJsonObject, bytesKey, node);
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
	if (isprimitive("int")) {
		int obj = getExpiresAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *expires_atKey = "expires_at";
	json_object_set_member(pJsonObject, expires_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	if (isprimitive("OpenAIFile")) {
		OpenAIFile obj = getFile();
		node = converttoJson(&obj, "OpenAIFile", "");
	}
	else {
		
		OpenAIFile obj = static_cast<OpenAIFile> (getFile());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fileKey = "file";
	json_object_set_member(pJsonObject, fileKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Upload::getId()
{
	return id;
}

void
Upload::setId(std::string  id)
{
	this->id = id;
}

int
Upload::getCreatedAt()
{
	return created_at;
}

void
Upload::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
Upload::getFilename()
{
	return filename;
}

void
Upload::setFilename(std::string  filename)
{
	this->filename = filename;
}

int
Upload::getBytes()
{
	return bytes;
}

void
Upload::setBytes(int  bytes)
{
	this->bytes = bytes;
}

std::string
Upload::getPurpose()
{
	return purpose;
}

void
Upload::setPurpose(std::string  purpose)
{
	this->purpose = purpose;
}

std::string
Upload::getStatus()
{
	return status;
}

void
Upload::setStatus(std::string  status)
{
	this->status = status;
}

int
Upload::getExpiresAt()
{
	return expires_at;
}

void
Upload::setExpiresAt(int  expires_at)
{
	this->expires_at = expires_at;
}

std::string
Upload::getObject()
{
	return object;
}

void
Upload::setObject(std::string  object)
{
	this->object = object;
}

OpenAIFile
Upload::getFile()
{
	return file;
}

void
Upload::setFile(OpenAIFile  file)
{
	this->file = file;
}


