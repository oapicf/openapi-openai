#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageDeltaContentTextAnnotationsFilePathObject_file_path.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageDeltaContentTextAnnotationsFilePathObject_file_path::MessageDeltaContentTextAnnotationsFilePathObject_file_path()
{
	//__init();
}

MessageDeltaContentTextAnnotationsFilePathObject_file_path::~MessageDeltaContentTextAnnotationsFilePathObject_file_path()
{
	//__cleanup();
}

void
MessageDeltaContentTextAnnotationsFilePathObject_file_path::__init()
{
	//file_id = std::string();
}

void
MessageDeltaContentTextAnnotationsFilePathObject_file_path::__cleanup()
{
	//if(file_id != NULL) {
	//
	//delete file_id;
	//file_id = NULL;
	//}
	//
}

void
MessageDeltaContentTextAnnotationsFilePathObject_file_path::fromJson(char* jsonStr)
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

MessageDeltaContentTextAnnotationsFilePathObject_file_path::MessageDeltaContentTextAnnotationsFilePathObject_file_path(char* json)
{
	this->fromJson(json);
}

char*
MessageDeltaContentTextAnnotationsFilePathObject_file_path::toJson()
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
MessageDeltaContentTextAnnotationsFilePathObject_file_path::getFileId()
{
	return file_id;
}

void
MessageDeltaContentTextAnnotationsFilePathObject_file_path::setFileId(std::string  file_id)
{
	this->file_id = file_id;
}


