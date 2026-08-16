

#include "ChatCompletionRequestDeveloperMessage_content.h"

using namespace Tiny;

ChatCompletionRequestDeveloperMessage_content::ChatCompletionRequestDeveloperMessage_content()
{
}

ChatCompletionRequestDeveloperMessage_content::ChatCompletionRequestDeveloperMessage_content(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRequestDeveloperMessage_content::~ChatCompletionRequestDeveloperMessage_content()
{

}

void
ChatCompletionRequestDeveloperMessage_content::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ChatCompletionRequestDeveloperMessage_content::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



