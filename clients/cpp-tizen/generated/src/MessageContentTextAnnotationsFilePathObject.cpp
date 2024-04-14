#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageContentTextAnnotationsFilePathObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageContentTextAnnotationsFilePathObject::MessageContentTextAnnotationsFilePathObject()
{
	//__init();
}

MessageContentTextAnnotationsFilePathObject::~MessageContentTextAnnotationsFilePathObject()
{
	//__cleanup();
}

void
MessageContentTextAnnotationsFilePathObject::__init()
{
	//type = std::string();
	//text = std::string();
	//file_path = new MessageContentTextAnnotationsFilePathObject_file_path();
	//start_index = int(0);
	//end_index = int(0);
}

void
MessageContentTextAnnotationsFilePathObject::__cleanup()
{
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
MessageContentTextAnnotationsFilePathObject::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	

		if (isprimitive("MessageContentTextAnnotationsFilePathObject_file_path")) {
			jsonToValue(&file_path, node, "MessageContentTextAnnotationsFilePathObject_file_path", "MessageContentTextAnnotationsFilePathObject_file_path");
		} else {
			
			MessageContentTextAnnotationsFilePathObject_file_path* obj = static_cast<MessageContentTextAnnotationsFilePathObject_file_path*> (&file_path);
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

MessageContentTextAnnotationsFilePathObject::MessageContentTextAnnotationsFilePathObject(char* json)
{
	this->fromJson(json);
}

char*
MessageContentTextAnnotationsFilePathObject::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("MessageContentTextAnnotationsFilePathObject_file_path")) {
		MessageContentTextAnnotationsFilePathObject_file_path obj = getFilePath();
		node = converttoJson(&obj, "MessageContentTextAnnotationsFilePathObject_file_path", "");
	}
	else {
		
		MessageContentTextAnnotationsFilePathObject_file_path obj = static_cast<MessageContentTextAnnotationsFilePathObject_file_path> (getFilePath());
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

std::string
MessageContentTextAnnotationsFilePathObject::getType()
{
	return type;
}

void
MessageContentTextAnnotationsFilePathObject::setType(std::string  type)
{
	this->type = type;
}

std::string
MessageContentTextAnnotationsFilePathObject::getText()
{
	return text;
}

void
MessageContentTextAnnotationsFilePathObject::setText(std::string  text)
{
	this->text = text;
}

MessageContentTextAnnotationsFilePathObject_file_path
MessageContentTextAnnotationsFilePathObject::getFilePath()
{
	return file_path;
}

void
MessageContentTextAnnotationsFilePathObject::setFilePath(MessageContentTextAnnotationsFilePathObject_file_path  file_path)
{
	this->file_path = file_path;
}

int
MessageContentTextAnnotationsFilePathObject::getStartIndex()
{
	return start_index;
}

void
MessageContentTextAnnotationsFilePathObject::setStartIndex(int  start_index)
{
	this->start_index = start_index;
}

int
MessageContentTextAnnotationsFilePathObject::getEndIndex()
{
	return end_index;
}

void
MessageContentTextAnnotationsFilePathObject::setEndIndex(int  end_index)
{
	this->end_index = end_index;
}


