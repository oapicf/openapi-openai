

#include "ChatCompletionRequestUserMessage_content.h"

using namespace Tiny;

ChatCompletionRequestUserMessage_content::ChatCompletionRequestUserMessage_content()
{
}

ChatCompletionRequestUserMessage_content::ChatCompletionRequestUserMessage_content(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestUserMessage_content::~ChatCompletionRequestUserMessage_content()
{

}

void
ChatCompletionRequestUserMessage_content::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ChatCompletionRequestUserMessage_content::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



