

#include "ChatCompletionRequestToolMessage_content.h"

using namespace Tiny;

ChatCompletionRequestToolMessage_content::ChatCompletionRequestToolMessage_content()
{
}

ChatCompletionRequestToolMessage_content::ChatCompletionRequestToolMessage_content(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestToolMessage_content::~ChatCompletionRequestToolMessage_content()
{

}

void
ChatCompletionRequestToolMessage_content::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ChatCompletionRequestToolMessage_content::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



