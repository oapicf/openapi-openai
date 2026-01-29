#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageDeltaContentTextAnnotationsFilePathObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageDeltaContentTextAnnotationsFilePathObject::MessageDeltaContentTextAnnotationsFilePathObject()
{
	//__init();
}

MessageDeltaContentTextAnnotationsFilePathObject::~MessageDeltaContentTextAnnotationsFilePathObject()
{
	//__cleanup();
}

void
MessageDeltaContentTextAnnotationsFilePathObject::__init()
{
	//index = int(0);
	//type = std::string();
	//text = std::string();
	//file_path = new MessageDeltaContentTextAnnotationsFilePathObject_file_path();
	//start_index = int(0);
	//end_index = int(0);
}

void
MessageDeltaContentTextAnnotationsFilePathObject::__cleanup()
{
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(text != NULL) {
	//
	//delete text;
	//text = NULL;
	//}
	//if(file_path != NULL) {
	//
	//delete file_path;
	//file_path = NULL;
	//}
	//if(start_index != NULL) {
	//
	//delete start_index;
	//start_index = NULL;
	//}
	//if(end_index != NULL) {
	//
	//delete end_index;
	//end_index = NULL;
	//}
	//
}

void
MessageDeltaContentTextAnnotationsFilePathObject::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *indexKey = "index";
	node = json_object_get_member(pJsonObject, indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&index, node, "int", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *textKey = "text";
	node = json_object_get_member(pJsonObject, textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&text, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *file_pathKey = "file_path";
	node = json_object_get_member(pJsonObject, file_pathKey);
	if (node !=NULL) {
	

		if (isprimitive("MessageDeltaContentTextAnnotationsFilePathObject_file_path")) {
			jsonToValue(&file_path, node, "MessageDeltaContentTextAnnotationsFilePathObject_file_path", "MessageDeltaContentTextAnnotationsFilePathObject_file_path");
		} else {
			
			MessageDeltaContentTextAnnotationsFilePathObject_file_path* obj = static_cast<MessageDeltaContentTextAnnotationsFilePathObject_file_path*> (&file_path);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *start_indexKey = "start_index";
	node = json_object_get_member(pJsonObject, start_indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&start_index, node, "int", "");
		} else {
			
		}
	}
	const gchar *end_indexKey = "end_index";
	node = json_object_get_member(pJsonObject, end_indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&end_index, node, "int", "");
		} else {
			
		}
	}
}

MessageDeltaContentTextAnnotationsFilePathObject::MessageDeltaContentTextAnnotationsFilePathObject(char* json)
{
	this->fromJson(json);
}

char*
MessageDeltaContentTextAnnotationsFilePathObject::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *indexKey = "index";
	json_object_set_member(pJsonObject, indexKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *textKey = "text";
	json_object_set_member(pJsonObject, textKey, node);
	if (isprimitive("MessageDeltaContentTextAnnotationsFilePathObject_file_path")) {
		MessageDeltaContentTextAnnotationsFilePathObject_file_path obj = getFilePath();
		node = converttoJson(&obj, "MessageDeltaContentTextAnnotationsFilePathObject_file_path", "");
	}
	else {
		
		MessageDeltaContentTextAnnotationsFilePathObject_file_path obj = static_cast<MessageDeltaContentTextAnnotationsFilePathObject_file_path> (getFilePath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *file_pathKey = "file_path";
	json_object_set_member(pJsonObject, file_pathKey, node);
	if (isprimitive("int")) {
		int obj = getStartIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *start_indexKey = "start_index";
	json_object_set_member(pJsonObject, start_indexKey, node);
	if (isprimitive("int")) {
		int obj = getEndIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *end_indexKey = "end_index";
	json_object_set_member(pJsonObject, end_indexKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
MessageDeltaContentTextAnnotationsFilePathObject::getIndex()
{
	return index;
}

void
MessageDeltaContentTextAnnotationsFilePathObject::setIndex(int  index)
{
	this->index = index;
}

std::string
MessageDeltaContentTextAnnotationsFilePathObject::getType()
{
	return type;
}

void
MessageDeltaContentTextAnnotationsFilePathObject::setType(std::string  type)
{
	this->type = type;
}

std::string
MessageDeltaContentTextAnnotationsFilePathObject::getText()
{
	return text;
}

void
MessageDeltaContentTextAnnotationsFilePathObject::setText(std::string  text)
{
	this->text = text;
}

MessageDeltaContentTextAnnotationsFilePathObject_file_path
MessageDeltaContentTextAnnotationsFilePathObject::getFilePath()
{
	return file_path;
}

void
MessageDeltaContentTextAnnotationsFilePathObject::setFilePath(MessageDeltaContentTextAnnotationsFilePathObject_file_path  file_path)
{
	this->file_path = file_path;
}

int
MessageDeltaContentTextAnnotationsFilePathObject::getStartIndex()
{
	return start_index;
}

void
MessageDeltaContentTextAnnotationsFilePathObject::setStartIndex(int  start_index)
{
	this->start_index = start_index;
}

int
MessageDeltaContentTextAnnotationsFilePathObject::getEndIndex()
{
	return end_index;
}

void
MessageDeltaContentTextAnnotationsFilePathObject::setEndIndex(int  end_index)
{
	this->end_index = end_index;
}


