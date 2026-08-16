

#include "MessageDeltaContentTextAnnotationsFileCitationObject.h"

using namespace Tiny;

MessageDeltaContentTextAnnotationsFileCitationObject::MessageDeltaContentTextAnnotationsFileCitationObject()
{
	index = int(0);
	type = std::string();
	text = std::string();
	file_citation = MessageDeltaContentTextAnnotationsFileCitationObject_file_citation();
	start_index = int(0);
	end_index = int(0);
}

MessageDeltaContentTextAnnotationsFileCitationObject::MessageDeltaContentTextAnnotationsFileCitationObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageDeltaContentTextAnnotationsFileCitationObject::~MessageDeltaContentTextAnnotationsFileCitationObject()
{

}

void
MessageDeltaContentTextAnnotationsFileCitationObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "int");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }

    const char *file_citationKey = "file_citation";

    if(object.has_key(file_citationKey))
    {
        bourne::json value = object[file_citationKey];




        MessageDeltaContentTextAnnotationsFileCitationObject_file_citation* obj = &file_citation;
		obj->fromJson(value.dump());

    }

    const char *start_indexKey = "start_index";

    if(object.has_key(start_indexKey))
    {
        bourne::json value = object[start_indexKey];



        jsonToValue(&start_index, value, "int");


    }

    const char *end_indexKey = "end_index";

    if(object.has_key(end_indexKey))
    {
        bourne::json value = object[end_indexKey];



        jsonToValue(&end_index, value, "int");


    }


}

bourne::json
MessageDeltaContentTextAnnotationsFileCitationObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();






    object["type"] = getType();






    object["text"] = getText();







	object["file_citation"] = getFileCitation().toJson();





    object["start_index"] = getStartIndex();






    object["end_index"] = getEndIndex();



    return object;

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



