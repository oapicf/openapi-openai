#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateUploadRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateUploadRequest::CreateUploadRequest()
{
	//__init();
}

CreateUploadRequest::~CreateUploadRequest()
{
	//__cleanup();
}

void
CreateUploadRequest::__init()
{
	//filename = std::string();
	//purpose = std::string();
	//bytes = int(0);
	//mime_type = std::string();
}

void
CreateUploadRequest::__cleanup()
{
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
	//if(bytes != NULL) {
	//
	//delete bytes;
	//bytes = NULL;
	//}
	//if(mime_type != NULL) {
	//
	//delete mime_type;
	//mime_type = NULL;
	//}
	//
}

void
CreateUploadRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *bytesKey = "bytes";
	node = json_object_get_member(pJsonObject, bytesKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&bytes, node, "int", "");
		} else {
			
		}
	}
	const gchar *mime_typeKey = "mime_type";
	node = json_object_get_member(pJsonObject, mime_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&mime_type, node, "std::string", "");
		} else {
			
		}
	}
}

CreateUploadRequest::CreateUploadRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateUploadRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("int")) {
		int obj = getBytes();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *bytesKey = "bytes";
	json_object_set_member(pJsonObject, bytesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMimeType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *mime_typeKey = "mime_type";
	json_object_set_member(pJsonObject, mime_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateUploadRequest::getFilename()
{
	return filename;
}

void
CreateUploadRequest::setFilename(std::string  filename)
{
	this->filename = filename;
}

std::string
CreateUploadRequest::getPurpose()
{
	return purpose;
}

void
CreateUploadRequest::setPurpose(std::string  purpose)
{
	this->purpose = purpose;
}

int
CreateUploadRequest::getBytes()
{
	return bytes;
}

void
CreateUploadRequest::setBytes(int  bytes)
{
	this->bytes = bytes;
}

std::string
CreateUploadRequest::getMimeType()
{
	return mime_type;
}

void
CreateUploadRequest::setMimeType(std::string  mime_type)
{
	this->mime_type = mime_type;
}


