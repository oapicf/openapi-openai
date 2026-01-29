#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageDeltaContentTextAnnotationsFileCitationObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageDeltaContentTextAnnotationsFileCitationObject::MessageDeltaContentTextAnnotationsFileCitationObject()
{
	//__init();
}

MessageDeltaContentTextAnnotationsFileCitationObject::~MessageDeltaContentTextAnnotationsFileCitationObject()
{
	//__cleanup();
}

void
MessageDeltaContentTextAnnotationsFileCitationObject::__init()
{
	//index = int(0);
	//type = std::string();
	//text = std::string();
	//file_citation = new MessageDeltaContentTextAnnotationsFileCitationObject_file_citation();
	//start_index = int(0);
	//end_index = int(0);
}

void
MessageDeltaContentTextAnnotationsFileCitationObject::__cleanup()
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
	//
}

void
MessageDeltaContentTextAnnotationsFileCitationObject::fromJson(char* jsonStr)
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
	const gchar *file_citationKey = "file_citation";
	node = json_object_get_member(pJsonObject, file_citationKey);
	if (node !=NULL) {
	

		if (isprimitive("MessageDeltaContentTextAnnotationsFileCitationObject_file_citation")) {
			jsonToValue(&file_citation, node, "MessageDeltaContentTextAnnotationsFileCitationObject_file_citation", "MessageDeltaContentTextAnnotationsFileCitationObject_file_citation");
		} else {
			
			MessageDeltaContentTextAnnotationsFileCitationObject_file_citation* obj = static_cast<MessageDeltaContentTextAnnotationsFileCitationObject_file_citation*> (&file_citation);
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

MessageDeltaContentTextAnnotationsFileCitationObject::MessageDeltaContentTextAnnotationsFileCitationObject(char* json)
{
	this->fromJson(json);
}

char*
MessageDeltaContentTextAnnotationsFileCitationObject::toJson()
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
	if (isprimitive("MessageDeltaContentTextAnnotationsFileCitationObject_file_citation")) {
		MessageDeltaContentTextAnnotationsFileCitationObject_file_citation obj = getFileCitation();
		node = converttoJson(&obj, "MessageDeltaContentTextAnnotationsFileCitationObject_file_citation", "");
	}
	else {
		
		MessageDeltaContentTextAnnotationsFileCitationObject_file_citation obj = static_cast<MessageDeltaContentTextAnnotationsFileCitationObject_file_citation> (getFileCitation());
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
MessageDeltaContentTextAnnotationsFileCitationObject::getIndex()
{
	return index;
}

void
MessageDeltaContentTextAnnotationsFileCitationObject::setIndex(int  index)
{
	this->index = index;
}

std::string
MessageDeltaContentTextAnnotationsFileCitationObject::getType()
{
	return type;
}

void
MessageDeltaContentTextAnnotationsFileCitationObject::setType(std::string  type)
{
	this->type = type;
}

std::string
MessageDeltaContentTextAnnotationsFileCitationObject::getText()
{
	return text;
}

void
MessageDeltaContentTextAnnotationsFileCitationObject::setText(std::string  text)
{
	this->text = text;
}

MessageDeltaContentTextAnnotationsFileCitationObject_file_citation
MessageDeltaContentTextAnnotationsFileCitationObject::getFileCitation()
{
	return file_citation;
}

void
MessageDeltaContentTextAnnotationsFileCitationObject::setFileCitation(MessageDeltaContentTextAnnotationsFileCitationObject_file_citation  file_citation)
{
	this->file_citation = file_citation;
}

int
MessageDeltaContentTextAnnotationsFileCitationObject::getStartIndex()
{
	return start_index;
}

void
MessageDeltaContentTextAnnotationsFileCitationObject::setStartIndex(int  start_index)
{
	this->start_index = start_index;
}

int
MessageDeltaContentTextAnnotationsFileCitationObject::getEndIndex()
{
	return end_index;
}

void
MessageDeltaContentTextAnnotationsFileCitationObject::setEndIndex(int  end_index)
{
	this->end_index = end_index;
}


