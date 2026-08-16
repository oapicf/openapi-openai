

#include "MessageContentTextAnnotationsFileCitationObject.h"

using namespace Tiny;

MessageContentTextAnnotationsFileCitationObject::MessageContentTextAnnotationsFileCitationObject()
{
	type = std::string();
	text = std::string();
	file_citation = MessageContentTextAnnotationsFileCitationObject_file_citation();
	start_index = int(0);
	end_index = int(0);
}

MessageContentTextAnnotationsFileCitationObject::MessageContentTextAnnotationsFileCitationObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageContentTextAnnotationsFileCitationObject::~MessageContentTextAnnotationsFileCitationObject()
{

}

void
MessageContentTextAnnotationsFileCitationObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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




        MessageContentTextAnnotationsFileCitationObject_file_citation* obj = &file_citation;
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
MessageContentTextAnnotationsFileCitationObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["text"] = getText();







	object["file_citation"] = getFileCitation().toJson();





    object["start_index"] = getStartIndex();






    object["end_index"] = getEndIndex();



    return object;

}

std::string
MessageContentTextAnnotationsFileCitationObject::getType()
{
	return type;
}

void
MessageContentTextAnnotationsFileCitationObject::setType(std::string  type)
{
	this->type = type;
}

std::string
MessageContentTextAnnotationsFileCitationObject::getText()
{
	return text;
}

void
MessageContentTextAnnotationsFileCitationObject::setText(std::string  text)
{
	this->text = text;
}

MessageContentTextAnnotationsFileCitationObject_file_citation
MessageContentTextAnnotationsFileCitationObject::getFileCitation()
{
	return file_citation;
}

void
MessageContentTextAnnotationsFileCitationObject::setFileCitation(MessageContentTextAnnotationsFileCitationObject_file_citation  file_citation)
{
	this->file_citation = file_citation;
}

int
MessageContentTextAnnotationsFileCitationObject::getStartIndex()
{
	return start_index;
}

void
MessageContentTextAnnotationsFileCitationObject::setStartIndex(int  start_index)
{
	this->start_index = start_index;
}

int
MessageContentTextAnnotationsFileCitationObject::getEndIndex()
{
	return end_index;
}

void
MessageContentTextAnnotationsFileCitationObject::setEndIndex(int  end_index)
{
	this->end_index = end_index;
}



