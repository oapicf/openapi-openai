

#include "CreateChatCompletionFunctionResponse_choices_inner.h"

using namespace Tiny;

CreateChatCompletionFunctionResponse_choices_inner::CreateChatCompletionFunctionResponse_choices_inner()
{
	finish_reason = std::string();
	index = int(0);
	message = ChatCompletionResponseMessage();
}

CreateChatCompletionFunctionResponse_choices_inner::CreateChatCompletionFunctionResponse_choices_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatCompletionFunctionResponse_choices_inner::~CreateChatCompletionFunctionResponse_choices_inner()
{

}

void
CreateChatCompletionFunctionResponse_choices_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *finish_reasonKey = "finish_reason";

    if(object.has_key(finish_reasonKey))
    {
        bourne::json value = object[finish_reasonKey];



        jsonToValue(&finish_reason, value, "std::string");


    }

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "int");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];




        ChatCompletionResponseMessage* obj = &message;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateChatCompletionFunctionResponse_choices_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["finish_reason"] = getFinishReason();






    object["index"] = getIndex();







	object["message"] = getMessage().toJson();


    return object;

}

std::string
CreateChatCompletionFunctionResponse_choices_inner::getFinishReason()
{
	return finish_reason;
}

void
CreateChatCompletionFunctionResponse_choices_inner::setFinishReason(std::string  finish_reason)
{
	this->finish_reason = finish_reason;
}

int
CreateChatCompletionFunctionResponse_choices_inner::getIndex()
{
	return index;
}

void
CreateChatCompletionFunctionResponse_choices_inner::setIndex(int  index)
{
	this->index = index;
}

ChatCompletionResponseMessage
CreateChatCompletionFunctionResponse_choices_inner::getMessage()
{
	return message;
}

void
CreateChatCompletionFunctionResponse_choices_inner::setMessage(ChatCompletionResponseMessage  message)
{
	this->message = message;
}



