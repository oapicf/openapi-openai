

#include "CreateChatCompletionRequest.h"

using namespace Tiny;

CreateChatCompletionRequest::CreateChatCompletionRequest()
{
	messages = std::list<ChatCompletionRequestMessage>();
	model = CreateChatCompletionRequest_model();
	store = bool(false);
	reasoning_effort = std::string();
	metadata = null<std::string>();
	frequency_penalty = float(0);
	logit_bias = null<int>();
	logprobs = bool(false);
	top_logprobs = int(0);
	max_tokens = int(0);
	max_completion_tokens = int(0);
	n = int(0);
	modalities = std::list<std::string>();
	prediction = null;
	audio = CreateChatCompletionRequest_audio();
	presence_penalty = float(0);
	response_format = CreateChatCompletionRequest_response_format();
	seed = int(0);
	service_tier = std::string();
	stop = CreateChatCompletionRequest_stop();
	stream = bool(false);
	stream_options = ChatCompletionStreamOptions();
	temperature = float(0);
	top_p = float(0);
	tools = std::list<ChatCompletionTool>();
	tool_choice = ChatCompletionToolChoiceOption();
	parallel_tool_calls = bool(false);
	user = std::string();
	function_call = CreateChatCompletionRequest_function_call();
	functions = std::list<ChatCompletionFunctions>();
}

CreateChatCompletionRequest::CreateChatCompletionRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateChatCompletionRequest::~CreateChatCompletionRequest()
{

}

void
CreateChatCompletionRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *messagesKey = "messages";

    if(object.has_key(messagesKey))
    {
        bourne::json value = object[messagesKey];


        std::list<ChatCompletionRequestMessage> messages_list;
        ChatCompletionRequestMessage element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            messages_list.push_back(element);
        }
        messages = messages_list;


    }

    const char *modelKey = "model";

    if(object.has_key(modelKey))
    {
        bourne::json value = object[modelKey];




        CreateChatCompletionRequest_model* obj = &model;
		obj->fromJson(value.dump());

    }

    const char *storeKey = "store";

    if(object.has_key(storeKey))
    {
        bourne::json value = object[storeKey];



        jsonToValue(&store, value, "bool");


    }

    const char *reasoning_effortKey = "reasoning_effort";

    if(object.has_key(reasoning_effortKey))
    {
        bourne::json value = object[reasoning_effortKey];



        jsonToValue(&reasoning_effort, value, "std::string");


    }

    const char *metadataKey = "metadata";

    if(object.has_key(metadataKey))
    {
        bourne::json value = object[metadataKey];


    }

    const char *frequency_penaltyKey = "frequency_penalty";

    if(object.has_key(frequency_penaltyKey))
    {
        bourne::json value = object[frequency_penaltyKey];



        jsonToValue(&frequency_penalty, value, "long");


    }

    const char *logit_biasKey = "logit_bias";

    if(object.has_key(logit_biasKey))
    {
        bourne::json value = object[logit_biasKey];


    }

    const char *logprobsKey = "logprobs";

    if(object.has_key(logprobsKey))
    {
        bourne::json value = object[logprobsKey];



        jsonToValue(&logprobs, value, "bool");


    }

    const char *top_logprobsKey = "top_logprobs";

    if(object.has_key(top_logprobsKey))
    {
        bourne::json value = object[top_logprobsKey];



        jsonToValue(&top_logprobs, value, "int");


    }

    const char *max_tokensKey = "max_tokens";

    if(object.has_key(max_tokensKey))
    {
        bourne::json value = object[max_tokensKey];



        jsonToValue(&max_tokens, value, "int");


    }

    const char *max_completion_tokensKey = "max_completion_tokens";

    if(object.has_key(max_completion_tokensKey))
    {
        bourne::json value = object[max_completion_tokensKey];



        jsonToValue(&max_completion_tokens, value, "int");


    }

    const char *nKey = "n";

    if(object.has_key(nKey))
    {
        bourne::json value = object[nKey];



        jsonToValue(&n, value, "int");


    }

    const char *modalitiesKey = "modalities";

    if(object.has_key(modalitiesKey))
    {
        bourne::json value = object[modalitiesKey];


        std::list<std::string> modalities_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            modalities_list.push_back(element);
        }
        modalities = modalities_list;


    }

    const char *predictionKey = "prediction";

    if(object.has_key(predictionKey))
    {
        bourne::json value = object[predictionKey];




        PredictionContent* obj = &prediction;
		obj->fromJson(value.dump());

    }

    const char *audioKey = "audio";

    if(object.has_key(audioKey))
    {
        bourne::json value = object[audioKey];




        CreateChatCompletionRequest_audio* obj = &audio;
		obj->fromJson(value.dump());

    }

    const char *presence_penaltyKey = "presence_penalty";

    if(object.has_key(presence_penaltyKey))
    {
        bourne::json value = object[presence_penaltyKey];



        jsonToValue(&presence_penalty, value, "long");


    }

    const char *response_formatKey = "response_format";

    if(object.has_key(response_formatKey))
    {
        bourne::json value = object[response_formatKey];




        CreateChatCompletionRequest_response_format* obj = &response_format;
		obj->fromJson(value.dump());

    }

    const char *seedKey = "seed";

    if(object.has_key(seedKey))
    {
        bourne::json value = object[seedKey];



        jsonToValue(&seed, value, "int");


    }

    const char *service_tierKey = "service_tier";

    if(object.has_key(service_tierKey))
    {
        bourne::json value = object[service_tierKey];



        jsonToValue(&service_tier, value, "std::string");


    }

    const char *stopKey = "stop";

    if(object.has_key(stopKey))
    {
        bourne::json value = object[stopKey];




        CreateChatCompletionRequest_stop* obj = &stop;
		obj->fromJson(value.dump());

    }

    const char *streamKey = "stream";

    if(object.has_key(streamKey))
    {
        bourne::json value = object[streamKey];



        jsonToValue(&stream, value, "bool");


    }

    const char *stream_optionsKey = "stream_options";

    if(object.has_key(stream_optionsKey))
    {
        bourne::json value = object[stream_optionsKey];




        ChatCompletionStreamOptions* obj = &stream_options;
		obj->fromJson(value.dump());

    }

    const char *temperatureKey = "temperature";

    if(object.has_key(temperatureKey))
    {
        bourne::json value = object[temperatureKey];



        jsonToValue(&temperature, value, "long");


    }

    const char *top_pKey = "top_p";

    if(object.has_key(top_pKey))
    {
        bourne::json value = object[top_pKey];



        jsonToValue(&top_p, value, "long");


    }

    const char *toolsKey = "tools";

    if(object.has_key(toolsKey))
    {
        bourne::json value = object[toolsKey];


        std::list<ChatCompletionTool> tools_list;
        ChatCompletionTool element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tools_list.push_back(element);
        }
        tools = tools_list;


    }

    const char *tool_choiceKey = "tool_choice";

    if(object.has_key(tool_choiceKey))
    {
        bourne::json value = object[tool_choiceKey];




        ChatCompletionToolChoiceOption* obj = &tool_choice;
		obj->fromJson(value.dump());

    }

    const char *parallel_tool_callsKey = "parallel_tool_calls";

    if(object.has_key(parallel_tool_callsKey))
    {
        bourne::json value = object[parallel_tool_callsKey];



        jsonToValue(&parallel_tool_calls, value, "bool");


    }

    const char *userKey = "user";

    if(object.has_key(userKey))
    {
        bourne::json value = object[userKey];



        jsonToValue(&user, value, "std::string");


    }

    const char *function_callKey = "function_call";

    if(object.has_key(function_callKey))
    {
        bourne::json value = object[function_callKey];




        CreateChatCompletionRequest_function_call* obj = &function_call;
		obj->fromJson(value.dump());

    }

    const char *functionsKey = "functions";

    if(object.has_key(functionsKey))
    {
        bourne::json value = object[functionsKey];


        std::list<ChatCompletionFunctions> functions_list;
        ChatCompletionFunctions element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            functions_list.push_back(element);
        }
        functions = functions_list;


    }


}

bourne::json
CreateChatCompletionRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ChatCompletionRequestMessage> messages_list = getMessages();
    bourne::json messages_arr = bourne::json::array();

    for(auto& var : messages_list)
    {
        ChatCompletionRequestMessage obj = var;
        messages_arr.append(obj.toJson());
    }
    object["messages"] = messages_arr;








	object["model"] = getModel().toJson();





    object["store"] = isStore();






    object["reasoning_effort"] = getReasoningEffort();









    object["frequency_penalty"] = getFrequencyPenalty();









    object["logprobs"] = isLogprobs();






    object["top_logprobs"] = getTopLogprobs();






    object["max_tokens"] = getMaxTokens();






    object["max_completion_tokens"] = getMaxCompletionTokens();






    object["n"] = getN();





    std::list<std::string> modalities_list = getModalities();
    bourne::json modalities_arr = bourne::json::array();

    for(auto& var : modalities_list)
    {
        modalities_arr.append(var);
    }
    object["modalities"] = modalities_arr;










	object["prediction"] = getPrediction().toJson();






	object["audio"] = getAudio().toJson();





    object["presence_penalty"] = getPresencePenalty();







	object["response_format"] = getResponseFormat().toJson();





    object["seed"] = getSeed();






    object["service_tier"] = getServiceTier();







	object["stop"] = getStop().toJson();





    object["stream"] = isStream();







	object["stream_options"] = getStreamOptions().toJson();





    object["temperature"] = getTemperature();






    object["top_p"] = getTopP();





    std::list<ChatCompletionTool> tools_list = getTools();
    bourne::json tools_arr = bourne::json::array();

    for(auto& var : tools_list)
    {
        ChatCompletionTool obj = var;
        tools_arr.append(obj.toJson());
    }
    object["tools"] = tools_arr;








	object["tool_choice"] = getToolChoice().toJson();





    object["parallel_tool_calls"] = isParallelToolCalls();






    object["user"] = getUser();







	object["function_call"] = getFunctionCall().toJson();




    std::list<ChatCompletionFunctions> functions_list = getFunctions();
    bourne::json functions_arr = bourne::json::array();

    for(auto& var : functions_list)
    {
        ChatCompletionFunctions obj = var;
        functions_arr.append(obj.toJson());
    }
    object["functions"] = functions_arr;




    return object;

}

std::list<ChatCompletionRequestMessage>
CreateChatCompletionRequest::getMessages()
{
	return messages;
}

void
CreateChatCompletionRequest::setMessages(std::list <ChatCompletionRequestMessage> messages)
{
	this->messages = messages;
}

CreateChatCompletionRequest_model
CreateChatCompletionRequest::getModel()
{
	return model;
}

void
CreateChatCompletionRequest::setModel(CreateChatCompletionRequest_model  model)
{
	this->model = model;
}

bool
CreateChatCompletionRequest::isStore()
{
	return store;
}

void
CreateChatCompletionRequest::setStore(bool  store)
{
	this->store = store;
}

std::string
CreateChatCompletionRequest::getReasoningEffort()
{
	return reasoning_effort;
}

void
CreateChatCompletionRequest::setReasoningEffort(std::string  reasoning_effort)
{
	this->reasoning_effort = reasoning_effort;
}

Map<string, string>
CreateChatCompletionRequest::getMetadata()
{
	return metadata;
}

void
CreateChatCompletionRequest::setMetadata(Map <string, string> metadata)
{
	this->metadata = metadata;
}

long
CreateChatCompletionRequest::getFrequencyPenalty()
{
	return frequency_penalty;
}

void
CreateChatCompletionRequest::setFrequencyPenalty(long  frequency_penalty)
{
	this->frequency_penalty = frequency_penalty;
}

Map<string, string>
CreateChatCompletionRequest::getLogitBias()
{
	return logit_bias;
}

void
CreateChatCompletionRequest::setLogitBias(Map <string, string> logit_bias)
{
	this->logit_bias = logit_bias;
}

bool
CreateChatCompletionRequest::isLogprobs()
{
	return logprobs;
}

void
CreateChatCompletionRequest::setLogprobs(bool  logprobs)
{
	this->logprobs = logprobs;
}

int
CreateChatCompletionRequest::getTopLogprobs()
{
	return top_logprobs;
}

void
CreateChatCompletionRequest::setTopLogprobs(int  top_logprobs)
{
	this->top_logprobs = top_logprobs;
}

int
CreateChatCompletionRequest::getMaxTokens()
{
	return max_tokens;
}

void
CreateChatCompletionRequest::setMaxTokens(int  max_tokens)
{
	this->max_tokens = max_tokens;
}

int
CreateChatCompletionRequest::getMaxCompletionTokens()
{
	return max_completion_tokens;
}

void
CreateChatCompletionRequest::setMaxCompletionTokens(int  max_completion_tokens)
{
	this->max_completion_tokens = max_completion_tokens;
}

int
CreateChatCompletionRequest::getN()
{
	return n;
}

void
CreateChatCompletionRequest::setN(int  n)
{
	this->n = n;
}

std::list<std::string>
CreateChatCompletionRequest::getModalities()
{
	return modalities;
}

void
CreateChatCompletionRequest::setModalities(std::list <std::string> modalities)
{
	this->modalities = modalities;
}

PredictionContent
CreateChatCompletionRequest::getPrediction()
{
	return prediction;
}

void
CreateChatCompletionRequest::setPrediction(PredictionContent  prediction)
{
	this->prediction = prediction;
}

CreateChatCompletionRequest_audio
CreateChatCompletionRequest::getAudio()
{
	return audio;
}

void
CreateChatCompletionRequest::setAudio(CreateChatCompletionRequest_audio  audio)
{
	this->audio = audio;
}

long
CreateChatCompletionRequest::getPresencePenalty()
{
	return presence_penalty;
}

void
CreateChatCompletionRequest::setPresencePenalty(long  presence_penalty)
{
	this->presence_penalty = presence_penalty;
}

CreateChatCompletionRequest_response_format
CreateChatCompletionRequest::getResponseFormat()
{
	return response_format;
}

void
CreateChatCompletionRequest::setResponseFormat(CreateChatCompletionRequest_response_format  response_format)
{
	this->response_format = response_format;
}

int
CreateChatCompletionRequest::getSeed()
{
	return seed;
}

void
CreateChatCompletionRequest::setSeed(int  seed)
{
	this->seed = seed;
}

std::string
CreateChatCompletionRequest::getServiceTier()
{
	return service_tier;
}

void
CreateChatCompletionRequest::setServiceTier(std::string  service_tier)
{
	this->service_tier = service_tier;
}

CreateChatCompletionRequest_stop
CreateChatCompletionRequest::getStop()
{
	return stop;
}

void
CreateChatCompletionRequest::setStop(CreateChatCompletionRequest_stop  stop)
{
	this->stop = stop;
}

bool
CreateChatCompletionRequest::isStream()
{
	return stream;
}

void
CreateChatCompletionRequest::setStream(bool  stream)
{
	this->stream = stream;
}

ChatCompletionStreamOptions
CreateChatCompletionRequest::getStreamOptions()
{
	return stream_options;
}

void
CreateChatCompletionRequest::setStreamOptions(ChatCompletionStreamOptions  stream_options)
{
	this->stream_options = stream_options;
}

long
CreateChatCompletionRequest::getTemperature()
{
	return temperature;
}

void
CreateChatCompletionRequest::setTemperature(long  temperature)
{
	this->temperature = temperature;
}

long
CreateChatCompletionRequest::getTopP()
{
	return top_p;
}

void
CreateChatCompletionRequest::setTopP(long  top_p)
{
	this->top_p = top_p;
}

std::list<ChatCompletionTool>
CreateChatCompletionRequest::getTools()
{
	return tools;
}

void
CreateChatCompletionRequest::setTools(std::list <ChatCompletionTool> tools)
{
	this->tools = tools;
}

ChatCompletionToolChoiceOption
CreateChatCompletionRequest::getToolChoice()
{
	return tool_choice;
}

void
CreateChatCompletionRequest::setToolChoice(ChatCompletionToolChoiceOption  tool_choice)
{
	this->tool_choice = tool_choice;
}

bool
CreateChatCompletionRequest::isParallelToolCalls()
{
	return parallel_tool_calls;
}

void
CreateChatCompletionRequest::setParallelToolCalls(bool  parallel_tool_calls)
{
	this->parallel_tool_calls = parallel_tool_calls;
}

std::string
CreateChatCompletionRequest::getUser()
{
	return user;
}

void
CreateChatCompletionRequest::setUser(std::string  user)
{
	this->user = user;
}

CreateChatCompletionRequest_function_call
CreateChatCompletionRequest::getFunctionCall()
{
	return function_call;
}

void
CreateChatCompletionRequest::setFunctionCall(CreateChatCompletionRequest_function_call  function_call)
{
	this->function_call = function_call;
}

std::list<ChatCompletionFunctions>
CreateChatCompletionRequest::getFunctions()
{
	return functions;
}

void
CreateChatCompletionRequest::setFunctions(std::list <ChatCompletionFunctions> functions)
{
	this->functions = functions;
}



