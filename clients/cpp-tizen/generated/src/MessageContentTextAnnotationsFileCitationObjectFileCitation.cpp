#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageContentTextAnnotationsFileCitationObject_file_citation.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageContentTextAnnotationsFileCitationObject_file_citation::MessageContentTextAnnotationsFileCitationObject_file_citation()
{
	//__init();
}

MessageContentTextAnnotationsFileCitationObject_file_citation::~MessageContentTextAnnotationsFileCitationObject_file_citation()
{
	//__cleanup();
}

void
MessageContentTextAnnotationsFileCitationObject_file_citation::__init()
{
	//file_id = std::string();
}

void
MessageContentTextAnnotationsFileCitationObject_file_citation::__cleanup()
{
	//if(file_id != NULL) {
	//
	//delete file_id;
	//file_id = NULL;
	//}
	//
}

void
MessageContentTextAnnotationsFileCitationObject_file_citation::fromJson(char* jsonStr)
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
}

MessageContentTextAnnotationsFileCitationObject_file_citation::MessageContentTextAnnotationsFileCitationObject_file_citation(char* json)
{
	this->fromJson(json);
}

char*
MessageContentTextAnnotationsFileCitationObject_file_citation::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MessageContentTextAnnotationsFileCitationObject_file_citation::getFileId()
{
	return file_id;
}

void
MessageContentTextAnnotationsFileCitationObject_file_citation::setFileId(std::string  file_id)
{
	this->file_id = file_id;
}


