

#include "ChatCompletionStreamOptions.h"

using namespace Tiny;

ChatCompletionStreamOptions::ChatCompletionStreamOptions()
{
	include_usage = bool(false);
}

ChatCompletionStreamOptions::ChatCompletionStreamOptions(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionStreamOptions::~ChatCompletionStreamOptions()
{

}

void
ChatCompletionStreamOptions::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *include_usageKey = "include_usage";

    if(object.has_key(include_usageKey))
    {
        bourne::json value = object[include_usageKey];



        jsonToValue(&include_usage, value, "bool");


    }


}

bourne::json
ChatCompletionStreamOptions::toJson()
{
    bourne::json object = bourne::json::object();





    object["include_usage"] = isIncludeUsage();



    return object;

}

bool
ChatCompletionStreamOptions::isIncludeUsage()
{
	return include_usage;
}

void
ChatCompletionStreamOptions::setIncludeUsage(bool  include_usage)
{
	this->include_usage = include_usage;
}



