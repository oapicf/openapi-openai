#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageContentTextObject_text_annotations_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageContentTextObject_text_annotations_inner::MessageContentTextObject_text_annotations_inner()
{
	//__init();
}

MessageContentTextObject_text_annotations_inner::~MessageContentTextObject_text_annotations_inner()
{
	//__cleanup();
}

void
MessageContentTextObject_text_annotations_inner::__init()
{
	//type = std::string();
	//text = std::string();
	//file_citation = new MessageContentTextAnnotationsFileCitationObject_file_citation();
	//start_index = int(0);
	//end_index = int(0);
	//file_path = new MessageContentTextAnnotationsFilePathObject_file_path();
}

void
MessageContentTextObject_text_annotations_inner::__cleanup()
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
	//if(file_citation != NULL) {
	//
	//delete file_citation;
	//file_citation = NULL;
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
	//if(file_path != NULL) {
	//
	//delete file_path;
	//file_path = NULL;
	//}
	//
}

void
MessageContentTextObject_text_annotations_inner::fromJson(char* jsonStr)
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
	const gchar *file_citationKey = "file_citation";
	node = json_object_get_member(pJsonObject, file_citationKey);
	if (node !=NULL) {
	

		if (isprimitive("MessageContentTextAnnotationsFileCitationObject_file_citation")) {
			jsonToValue(&file_citation, node, "MessageContentTextAnnotationsFileCitationObject_file_citation", "MessageContentTextAnnotationsFileCitationObject_file_citation");
		} else {
			
			MessageContentTextAnnotationsFileCitationObject_file_citation* obj = static_cast<MessageContentTextAnnotationsFileCitationObject_file_citation*> (&file_citation);
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
}

MessageContentTextObject_text_annotations_inner::MessageContentTextObject_text_annotations_inner(char* json)
{
	this->fromJson(json);
}

char*
MessageContentTextObject_text_annotations_inner::toJson()
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
	if (isprimitive("MessageContentTextAnnotationsFileCitationObject_file_citation")) {
		MessageContentTextAnnotationsFileCitationObject_file_citation obj = getFileCitation();
		node = converttoJson(&obj, "MessageContentTextAnnotationsFileCitationObject_file_citation", "");
	}
	else {
		
		MessageContentTextAnnotationsFileCitationObject_file_citation obj = static_cast<MessageContentTextAnnotationsFileCitationObject_file_citation> (getFileCitation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *file_citationKey = "file_citation";
	json_object_set_member(pJsonObject, file_citationKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MessageContentTextObject_text_annotations_inner::getType()
{
	return type;
}

void
MessageContentTextObject_text_annotations_inner::setType(std::string  type)
{
	this->type = type;
}

std::string
MessageContentTextObject_text_annotations_inner::getText()
{
	return text;
}

void
MessageContentTextObject_text_annotations_inner::setText(std::string  text)
{
	this->text = text;
}

MessageContentTextAnnotationsFileCitationObject_file_citation
MessageContentTextObject_text_annotations_inner::getFileCitation()
{
	return file_citation;
}

void
MessageContentTextObject_text_annotations_inner::setFileCitation(MessageContentTextAnnotationsFileCitationObject_file_citation  file_citation)
{
	this->file_citation = file_citation;
}

int
MessageContentTextObject_text_annotations_inner::getStartIndex()
{
	return start_index;
}

void
MessageContentTextObject_text_annotations_inner::setStartIndex(int  start_index)
{
	this->start_index = start_index;
}

int
MessageContentTextObject_text_annotations_inner::getEndIndex()
{
	return end_index;
}

void
MessageContentTextObject_text_annotations_inner::setEndIndex(int  end_index)
{
	this->end_index = end_index;
}

MessageContentTextAnnotationsFilePathObject_file_path
MessageContentTextObject_text_annotations_inner::getFilePath()
{
	return file_path;
}

void
MessageContentTextObject_text_annotations_inner::setFilePath(MessageContentTextAnnotationsFilePathObject_file_path  file_path)
{
	this->file_path = file_path;
}


