

#include "MessageContentTextAnnotationsFilePathObject.h"

using namespace Tiny;

MessageContentTextAnnotationsFilePathObject::MessageContentTextAnnotationsFilePathObject()
{
	type = std::string();
	text = std::string();
	file_path = MessageContentTextAnnotationsFilePathObject_file_path();
	start_index = int(0);
	end_index = int(0);
}

MessageContentTextAnnotationsFilePathObject::MessageContentTextAnnotationsFilePathObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageContentTextAnnotationsFilePathObject::~MessageContentTextAnnotationsFilePathObject()
{

}

void
MessageContentTextAnnotationsFilePathObject::fromJson(std::string jsonObj)
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

    const char *file_pathKey = "file_path";

    if(object.has_key(file_pathKey))
    {
        bourne::json value = object[file_pathKey];




        MessageContentTextAnnotationsFilePathObject_file_path* obj = &file_path;
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
MessageContentTextAnnotationsFilePathObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["text"] = getText();







	object["file_path"] = getFilePath().toJson();





    object["start_index"] = getStartIndex();






    object["end_index"] = getEndIndex();



    return object;

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



