/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "CreateChatCompletionRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CreateChatCompletionRequest::CreateChatCompletionRequest()
{
    m_Frequency_penalty = 0;
    m_Frequency_penaltyIsSet = false;
    m_Logit_biasIsSet = false;
    m_Logprobs = false;
    m_LogprobsIsSet = false;
    m_Top_logprobs = 0;
    m_Top_logprobsIsSet = false;
    m_Max_tokens = 0;
    m_Max_tokensIsSet = false;
    m_n = 1;
    m_nIsSet = false;
    m_Presence_penalty = 0;
    m_Presence_penaltyIsSet = false;
    m_Response_formatIsSet = false;
    m_Seed = 0;
    m_SeedIsSet = false;
    m_StopIsSet = false;
    m_Stream = false;
    m_StreamIsSet = false;
    m_Temperature = 1;
    m_TemperatureIsSet = false;
    m_Top_p = 1;
    m_Top_pIsSet = false;
    m_ToolsIsSet = false;
    m_Tool_choiceIsSet = false;
    m_User = "";
    m_UserIsSet = false;
    m_Function_callIsSet = false;
    m_FunctionsIsSet = false;
    
}

void CreateChatCompletionRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CreateChatCompletionRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CreateChatCompletionRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CreateChatCompletionRequest" : pathPrefix;

         
    
    /* Messages */ {
        const std::vector<org::openapitools::server::model::ChatCompletionRequestMessage>& value = m_Messages;
        const std::string currentValuePath = _pathPrefix + ".messages";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::ChatCompletionRequestMessage& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".messages") && success;
 
                i++;
            }
        }

    }
        
    if (!m_Model.validate(msg, _pathPrefix + ".model")) {
        msg << _pathPrefix << ": Model is invalid;";
        success = false;
    }     
    if (frequencyPenaltyIsSet())
    {
        const double& value = m_Frequency_penalty;
        const std::string currentValuePath = _pathPrefix + ".frequencyPenalty";
                
        
        if (value < -2)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to -2;";
        }
        if (value > 2)
        {
            success = false;
            msg << currentValuePath << ": must be less than or equal to 2;";
        }

    }
                 
    if (topLogprobsIsSet())
    {
        const int32_t& value = m_Top_logprobs;
        const std::string currentValuePath = _pathPrefix + ".topLogprobs";
                
        
        if (value < 0)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to 0;";
        }
        if (value > 20)
        {
            success = false;
            msg << currentValuePath << ": must be less than or equal to 20;";
        }

    }
             
    if (NIsSet())
    {
        const int32_t& value = m_n;
        const std::string currentValuePath = _pathPrefix + ".N";
                
        
        if (value < 1)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to 1;";
        }
        if (value > 128)
        {
            success = false;
            msg << currentValuePath << ": must be less than or equal to 128;";
        }

    }
         
    if (presencePenaltyIsSet())
    {
        const double& value = m_Presence_penalty;
        const std::string currentValuePath = _pathPrefix + ".presencePenalty";
                
        
        if (value < -2)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to -2;";
        }
        if (value > 2)
        {
            success = false;
            msg << currentValuePath << ": must be less than or equal to 2;";
        }

    }
             
    if (seedIsSet())
    {
        const int32_t& value = m_Seed;
        const std::string currentValuePath = _pathPrefix + ".seed";
                
        
        if (value < -9223372036854775808)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to -9223372036854775808;";
        }
        if (value > 9223372036854775807)
        {
            success = false;
            msg << currentValuePath << ": must be less than or equal to 9223372036854775807;";
        }

    }
                 
    if (temperatureIsSet())
    {
        const double& value = m_Temperature;
        const std::string currentValuePath = _pathPrefix + ".temperature";
                
        
        if (value < 0)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to 0;";
        }
        if (value > 2)
        {
            success = false;
            msg << currentValuePath << ": must be less than or equal to 2;";
        }

    }
         
    if (topPIsSet())
    {
        const double& value = m_Top_p;
        const std::string currentValuePath = _pathPrefix + ".topP";
                
        
        if (value < 0)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to 0;";
        }
        if (value > 1)
        {
            success = false;
            msg << currentValuePath << ": must be less than or equal to 1;";
        }

    }
         
    if (toolsIsSet())
    {
        const std::vector<org::openapitools::server::model::ChatCompletionTool>& value = m_Tools;
        const std::string currentValuePath = _pathPrefix + ".tools";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::ChatCompletionTool& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".tools") && success;
 
                i++;
            }
        }

    }
                     
    if (functionsIsSet())
    {
        const std::vector<org::openapitools::server::model::ChatCompletionFunctions>& value = m_Functions;
        const std::string currentValuePath = _pathPrefix + ".functions";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 128)
        {
            success = false;
            msg << currentValuePath << ": must have at most 128 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::ChatCompletionFunctions& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".functions") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool CreateChatCompletionRequest::operator==(const CreateChatCompletionRequest& rhs) const
{
    return
    
    
    (getMessages() == rhs.getMessages())
     &&
    
    (getModel() == rhs.getModel())
     &&
    
    
    ((!frequencyPenaltyIsSet() && !rhs.frequencyPenaltyIsSet()) || (frequencyPenaltyIsSet() && rhs.frequencyPenaltyIsSet() && getFrequencyPenalty() == rhs.getFrequencyPenalty())) &&
    
    
    ((!logitBiasIsSet() && !rhs.logitBiasIsSet()) || (logitBiasIsSet() && rhs.logitBiasIsSet() && getLogitBias() == rhs.getLogitBias())) &&
    
    
    ((!logprobsIsSet() && !rhs.logprobsIsSet()) || (logprobsIsSet() && rhs.logprobsIsSet() && isLogprobs() == rhs.isLogprobs())) &&
    
    
    ((!topLogprobsIsSet() && !rhs.topLogprobsIsSet()) || (topLogprobsIsSet() && rhs.topLogprobsIsSet() && getTopLogprobs() == rhs.getTopLogprobs())) &&
    
    
    ((!maxTokensIsSet() && !rhs.maxTokensIsSet()) || (maxTokensIsSet() && rhs.maxTokensIsSet() && getMaxTokens() == rhs.getMaxTokens())) &&
    
    
    ((!NIsSet() && !rhs.NIsSet()) || (NIsSet() && rhs.NIsSet() && getN() == rhs.getN())) &&
    
    
    ((!presencePenaltyIsSet() && !rhs.presencePenaltyIsSet()) || (presencePenaltyIsSet() && rhs.presencePenaltyIsSet() && getPresencePenalty() == rhs.getPresencePenalty())) &&
    
    
    ((!responseFormatIsSet() && !rhs.responseFormatIsSet()) || (responseFormatIsSet() && rhs.responseFormatIsSet() && getResponseFormat() == rhs.getResponseFormat())) &&
    
    
    ((!seedIsSet() && !rhs.seedIsSet()) || (seedIsSet() && rhs.seedIsSet() && getSeed() == rhs.getSeed())) &&
    
    
    ((!stopIsSet() && !rhs.stopIsSet()) || (stopIsSet() && rhs.stopIsSet() && getStop() == rhs.getStop())) &&
    
    
    ((!streamIsSet() && !rhs.streamIsSet()) || (streamIsSet() && rhs.streamIsSet() && isStream() == rhs.isStream())) &&
    
    
    ((!temperatureIsSet() && !rhs.temperatureIsSet()) || (temperatureIsSet() && rhs.temperatureIsSet() && getTemperature() == rhs.getTemperature())) &&
    
    
    ((!topPIsSet() && !rhs.topPIsSet()) || (topPIsSet() && rhs.topPIsSet() && getTopP() == rhs.getTopP())) &&
    
    
    ((!toolsIsSet() && !rhs.toolsIsSet()) || (toolsIsSet() && rhs.toolsIsSet() && getTools() == rhs.getTools())) &&
    
    
    ((!toolChoiceIsSet() && !rhs.toolChoiceIsSet()) || (toolChoiceIsSet() && rhs.toolChoiceIsSet() && getToolChoice() == rhs.getToolChoice())) &&
    
    
    ((!userIsSet() && !rhs.userIsSet()) || (userIsSet() && rhs.userIsSet() && getUser() == rhs.getUser())) &&
    
    
    ((!functionCallIsSet() && !rhs.functionCallIsSet()) || (functionCallIsSet() && rhs.functionCallIsSet() && getFunctionCall() == rhs.getFunctionCall())) &&
    
    
    ((!functionsIsSet() && !rhs.functionsIsSet()) || (functionsIsSet() && rhs.functionsIsSet() && getFunctions() == rhs.getFunctions()))
    
    ;
}

bool CreateChatCompletionRequest::operator!=(const CreateChatCompletionRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CreateChatCompletionRequest& o)
{
    j = nlohmann::json::object();
    j["messages"] = o.m_Messages;
    j["model"] = o.m_Model;
    if(o.frequencyPenaltyIsSet())
        j["frequency_penalty"] = o.m_Frequency_penalty;
    if(o.logitBiasIsSet() || !o.m_Logit_bias.empty())
        j["logit_bias"] = o.m_Logit_bias;
    if(o.logprobsIsSet())
        j["logprobs"] = o.m_Logprobs;
    if(o.topLogprobsIsSet())
        j["top_logprobs"] = o.m_Top_logprobs;
    if(o.maxTokensIsSet())
        j["max_tokens"] = o.m_Max_tokens;
    if(o.NIsSet())
        j["n"] = o.m_n;
    if(o.presencePenaltyIsSet())
        j["presence_penalty"] = o.m_Presence_penalty;
    if(o.responseFormatIsSet())
        j["response_format"] = o.m_Response_format;
    if(o.seedIsSet())
        j["seed"] = o.m_Seed;
    if(o.stopIsSet())
        j["stop"] = o.m_Stop;
    if(o.streamIsSet())
        j["stream"] = o.m_Stream;
    if(o.temperatureIsSet())
        j["temperature"] = o.m_Temperature;
    if(o.topPIsSet())
        j["top_p"] = o.m_Top_p;
    if(o.toolsIsSet() || !o.m_Tools.empty())
        j["tools"] = o.m_Tools;
    if(o.toolChoiceIsSet())
        j["tool_choice"] = o.m_Tool_choice;
    if(o.userIsSet())
        j["user"] = o.m_User;
    if(o.functionCallIsSet())
        j["function_call"] = o.m_Function_call;
    if(o.functionsIsSet() || !o.m_Functions.empty())
        j["functions"] = o.m_Functions;
    
}

void from_json(const nlohmann::json& j, CreateChatCompletionRequest& o)
{
    j.at("messages").get_to(o.m_Messages);
    j.at("model").get_to(o.m_Model);
    if(j.find("frequency_penalty") != j.end())
    {
        j.at("frequency_penalty").get_to(o.m_Frequency_penalty);
        o.m_Frequency_penaltyIsSet = true;
    } 
    if(j.find("logit_bias") != j.end())
    {
        j.at("logit_bias").get_to(o.m_Logit_bias);
        o.m_Logit_biasIsSet = true;
    } 
    if(j.find("logprobs") != j.end())
    {
        j.at("logprobs").get_to(o.m_Logprobs);
        o.m_LogprobsIsSet = true;
    } 
    if(j.find("top_logprobs") != j.end())
    {
        j.at("top_logprobs").get_to(o.m_Top_logprobs);
        o.m_Top_logprobsIsSet = true;
    } 
    if(j.find("max_tokens") != j.end())
    {
        j.at("max_tokens").get_to(o.m_Max_tokens);
        o.m_Max_tokensIsSet = true;
    } 
    if(j.find("n") != j.end())
    {
        j.at("n").get_to(o.m_n);
        o.m_nIsSet = true;
    } 
    if(j.find("presence_penalty") != j.end())
    {
        j.at("presence_penalty").get_to(o.m_Presence_penalty);
        o.m_Presence_penaltyIsSet = true;
    } 
    if(j.find("response_format") != j.end())
    {
        j.at("response_format").get_to(o.m_Response_format);
        o.m_Response_formatIsSet = true;
    } 
    if(j.find("seed") != j.end())
    {
        j.at("seed").get_to(o.m_Seed);
        o.m_SeedIsSet = true;
    } 
    if(j.find("stop") != j.end())
    {
        j.at("stop").get_to(o.m_Stop);
        o.m_StopIsSet = true;
    } 
    if(j.find("stream") != j.end())
    {
        j.at("stream").get_to(o.m_Stream);
        o.m_StreamIsSet = true;
    } 
    if(j.find("temperature") != j.end())
    {
        j.at("temperature").get_to(o.m_Temperature);
        o.m_TemperatureIsSet = true;
    } 
    if(j.find("top_p") != j.end())
    {
        j.at("top_p").get_to(o.m_Top_p);
        o.m_Top_pIsSet = true;
    } 
    if(j.find("tools") != j.end())
    {
        j.at("tools").get_to(o.m_Tools);
        o.m_ToolsIsSet = true;
    } 
    if(j.find("tool_choice") != j.end())
    {
        j.at("tool_choice").get_to(o.m_Tool_choice);
        o.m_Tool_choiceIsSet = true;
    } 
    if(j.find("user") != j.end())
    {
        j.at("user").get_to(o.m_User);
        o.m_UserIsSet = true;
    } 
    if(j.find("function_call") != j.end())
    {
        j.at("function_call").get_to(o.m_Function_call);
        o.m_Function_callIsSet = true;
    } 
    if(j.find("functions") != j.end())
    {
        j.at("functions").get_to(o.m_Functions);
        o.m_FunctionsIsSet = true;
    } 
    
}

std::vector<org::openapitools::server::model::ChatCompletionRequestMessage> CreateChatCompletionRequest::getMessages() const
{
    return m_Messages;
}
void CreateChatCompletionRequest::setMessages(std::vector<org::openapitools::server::model::ChatCompletionRequestMessage> const& value)
{
    m_Messages = value;
}
org::openapitools::server::model::CreateChatCompletionRequest_model CreateChatCompletionRequest::getModel() const
{
    return m_Model;
}
void CreateChatCompletionRequest::setModel(org::openapitools::server::model::CreateChatCompletionRequest_model const& value)
{
    m_Model = value;
}
double CreateChatCompletionRequest::getFrequencyPenalty() const
{
    return m_Frequency_penalty;
}
void CreateChatCompletionRequest::setFrequencyPenalty(double const value)
{
    m_Frequency_penalty = value;
    m_Frequency_penaltyIsSet = true;
}
bool CreateChatCompletionRequest::frequencyPenaltyIsSet() const
{
    return m_Frequency_penaltyIsSet;
}
void CreateChatCompletionRequest::unsetFrequency_penalty()
{
    m_Frequency_penaltyIsSet = false;
}
std::map<std::string, int32_t> CreateChatCompletionRequest::getLogitBias() const
{
    return m_Logit_bias;
}
void CreateChatCompletionRequest::setLogitBias(std::map<std::string, int32_t> const value)
{
    m_Logit_bias = value;
    m_Logit_biasIsSet = true;
}
bool CreateChatCompletionRequest::logitBiasIsSet() const
{
    return m_Logit_biasIsSet;
}
void CreateChatCompletionRequest::unsetLogit_bias()
{
    m_Logit_biasIsSet = false;
}
bool CreateChatCompletionRequest::isLogprobs() const
{
    return m_Logprobs;
}
void CreateChatCompletionRequest::setLogprobs(bool const value)
{
    m_Logprobs = value;
    m_LogprobsIsSet = true;
}
bool CreateChatCompletionRequest::logprobsIsSet() const
{
    return m_LogprobsIsSet;
}
void CreateChatCompletionRequest::unsetLogprobs()
{
    m_LogprobsIsSet = false;
}
int32_t CreateChatCompletionRequest::getTopLogprobs() const
{
    return m_Top_logprobs;
}
void CreateChatCompletionRequest::setTopLogprobs(int32_t const value)
{
    m_Top_logprobs = value;
    m_Top_logprobsIsSet = true;
}
bool CreateChatCompletionRequest::topLogprobsIsSet() const
{
    return m_Top_logprobsIsSet;
}
void CreateChatCompletionRequest::unsetTop_logprobs()
{
    m_Top_logprobsIsSet = false;
}
int32_t CreateChatCompletionRequest::getMaxTokens() const
{
    return m_Max_tokens;
}
void CreateChatCompletionRequest::setMaxTokens(int32_t const value)
{
    m_Max_tokens = value;
    m_Max_tokensIsSet = true;
}
bool CreateChatCompletionRequest::maxTokensIsSet() const
{
    return m_Max_tokensIsSet;
}
void CreateChatCompletionRequest::unsetMax_tokens()
{
    m_Max_tokensIsSet = false;
}
int32_t CreateChatCompletionRequest::getN() const
{
    return m_n;
}
void CreateChatCompletionRequest::setN(int32_t const value)
{
    m_n = value;
    m_nIsSet = true;
}
bool CreateChatCompletionRequest::NIsSet() const
{
    return m_nIsSet;
}
void CreateChatCompletionRequest::unsetn()
{
    m_nIsSet = false;
}
double CreateChatCompletionRequest::getPresencePenalty() const
{
    return m_Presence_penalty;
}
void CreateChatCompletionRequest::setPresencePenalty(double const value)
{
    m_Presence_penalty = value;
    m_Presence_penaltyIsSet = true;
}
bool CreateChatCompletionRequest::presencePenaltyIsSet() const
{
    return m_Presence_penaltyIsSet;
}
void CreateChatCompletionRequest::unsetPresence_penalty()
{
    m_Presence_penaltyIsSet = false;
}
org::openapitools::server::model::CreateChatCompletionRequest_response_format CreateChatCompletionRequest::getResponseFormat() const
{
    return m_Response_format;
}
void CreateChatCompletionRequest::setResponseFormat(org::openapitools::server::model::CreateChatCompletionRequest_response_format const& value)
{
    m_Response_format = value;
    m_Response_formatIsSet = true;
}
bool CreateChatCompletionRequest::responseFormatIsSet() const
{
    return m_Response_formatIsSet;
}
void CreateChatCompletionRequest::unsetResponse_format()
{
    m_Response_formatIsSet = false;
}
int32_t CreateChatCompletionRequest::getSeed() const
{
    return m_Seed;
}
void CreateChatCompletionRequest::setSeed(int32_t const value)
{
    m_Seed = value;
    m_SeedIsSet = true;
}
bool CreateChatCompletionRequest::seedIsSet() const
{
    return m_SeedIsSet;
}
void CreateChatCompletionRequest::unsetSeed()
{
    m_SeedIsSet = false;
}
org::openapitools::server::model::CreateChatCompletionRequest_stop CreateChatCompletionRequest::getStop() const
{
    return m_Stop;
}
void CreateChatCompletionRequest::setStop(org::openapitools::server::model::CreateChatCompletionRequest_stop const& value)
{
    m_Stop = value;
    m_StopIsSet = true;
}
bool CreateChatCompletionRequest::stopIsSet() const
{
    return m_StopIsSet;
}
void CreateChatCompletionRequest::unsetStop()
{
    m_StopIsSet = false;
}
bool CreateChatCompletionRequest::isStream() const
{
    return m_Stream;
}
void CreateChatCompletionRequest::setStream(bool const value)
{
    m_Stream = value;
    m_StreamIsSet = true;
}
bool CreateChatCompletionRequest::streamIsSet() const
{
    return m_StreamIsSet;
}
void CreateChatCompletionRequest::unsetStream()
{
    m_StreamIsSet = false;
}
double CreateChatCompletionRequest::getTemperature() const
{
    return m_Temperature;
}
void CreateChatCompletionRequest::setTemperature(double const value)
{
    m_Temperature = value;
    m_TemperatureIsSet = true;
}
bool CreateChatCompletionRequest::temperatureIsSet() const
{
    return m_TemperatureIsSet;
}
void CreateChatCompletionRequest::unsetTemperature()
{
    m_TemperatureIsSet = false;
}
double CreateChatCompletionRequest::getTopP() const
{
    return m_Top_p;
}
void CreateChatCompletionRequest::setTopP(double const value)
{
    m_Top_p = value;
    m_Top_pIsSet = true;
}
bool CreateChatCompletionRequest::topPIsSet() const
{
    return m_Top_pIsSet;
}
void CreateChatCompletionRequest::unsetTop_p()
{
    m_Top_pIsSet = false;
}
std::vector<org::openapitools::server::model::ChatCompletionTool> CreateChatCompletionRequest::getTools() const
{
    return m_Tools;
}
void CreateChatCompletionRequest::setTools(std::vector<org::openapitools::server::model::ChatCompletionTool> const& value)
{
    m_Tools = value;
    m_ToolsIsSet = true;
}
bool CreateChatCompletionRequest::toolsIsSet() const
{
    return m_ToolsIsSet;
}
void CreateChatCompletionRequest::unsetTools()
{
    m_ToolsIsSet = false;
}
org::openapitools::server::model::ChatCompletionToolChoiceOption CreateChatCompletionRequest::getToolChoice() const
{
    return m_Tool_choice;
}
void CreateChatCompletionRequest::setToolChoice(org::openapitools::server::model::ChatCompletionToolChoiceOption const& value)
{
    m_Tool_choice = value;
    m_Tool_choiceIsSet = true;
}
bool CreateChatCompletionRequest::toolChoiceIsSet() const
{
    return m_Tool_choiceIsSet;
}
void CreateChatCompletionRequest::unsetTool_choice()
{
    m_Tool_choiceIsSet = false;
}
std::string CreateChatCompletionRequest::getUser() const
{
    return m_User;
}
void CreateChatCompletionRequest::setUser(std::string const& value)
{
    m_User = value;
    m_UserIsSet = true;
}
bool CreateChatCompletionRequest::userIsSet() const
{
    return m_UserIsSet;
}
void CreateChatCompletionRequest::unsetUser()
{
    m_UserIsSet = false;
}
org::openapitools::server::model::CreateChatCompletionRequest_function_call CreateChatCompletionRequest::getFunctionCall() const
{
    return m_Function_call;
}
void CreateChatCompletionRequest::setFunctionCall(org::openapitools::server::model::CreateChatCompletionRequest_function_call const& value)
{
    m_Function_call = value;
    m_Function_callIsSet = true;
}
bool CreateChatCompletionRequest::functionCallIsSet() const
{
    return m_Function_callIsSet;
}
void CreateChatCompletionRequest::unsetFunction_call()
{
    m_Function_callIsSet = false;
}
std::vector<org::openapitools::server::model::ChatCompletionFunctions> CreateChatCompletionRequest::getFunctions() const
{
    return m_Functions;
}
void CreateChatCompletionRequest::setFunctions(std::vector<org::openapitools::server::model::ChatCompletionFunctions> const& value)
{
    m_Functions = value;
    m_FunctionsIsSet = true;
}
bool CreateChatCompletionRequest::functionsIsSet() const
{
    return m_FunctionsIsSet;
}
void CreateChatCompletionRequest::unsetFunctions()
{
    m_FunctionsIsSet = false;
}


} // namespace org::openapitools::server::model

