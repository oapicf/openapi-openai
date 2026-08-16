

#include "ChatCompletionMessageToolCallChunk.h"

using namespace Tiny;

ChatCompletionMessageToolCallChunk::ChatCompletionMessageToolCallChunk()
{
	index = int(0);
	id = std::string();
	type = std::string();
	function = ChatCompletionMessageToolCallChunk_function();
}

ChatCompletionMessageToolCallChunk::ChatCompletionMessageToolCallChunk(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionMessageToolCallChunk::~ChatCompletionMessageToolCallChunk()
{

}

void
ChatCompletionMessageToolCallChunk::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "int");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *functionKey = "function";

    if(object.has_key(functionKey))
    {
        bourne::json value = object[functionKey];




        ChatCompletionMessageToolCallChunk_function* obj = &function;
		obj->fromJson(value.dump());

    }


}

bourne::json
ChatCompletionMessageToolCallChunk::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();






    object["id"] = getId();






    object["type"] = getType();







	object["function"] = getFunction().toJson();


    return object;

}

int
ChatCompletionMessageToolCallChunk::getIndex()
{
	return index;
}

void
ChatCompletionMessageToolCallChunk::setIndex(int  index)
{
	this->index = index;
}

std::string
ChatCompletionMessageToolCallChunk::getId()
{
	return id;
}

void
ChatCompletionMessageToolCallChunk::setId(std::string  id)
{
	this->id = id;
}

std::string
ChatCompletionMessageToolCallChunk::getType()
{
	return type;
}

void
ChatCompletionMessageToolCallChunk::setType(std::string  type)
{
	this->type = type;
}

ChatCompletionMessageToolCallChunk_function
ChatCompletionMessageToolCallChunk::getFunction()
{
	return function;
}

void
ChatCompletionMessageToolCallChunk::setFunction(ChatCompletionMessageToolCallChunk_function  function)
{
	this->function = function;
}



