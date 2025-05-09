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
/*
 * CreateThreadAndRunRequest.h
 *
 * 
 */

#ifndef CreateThreadAndRunRequest_H_
#define CreateThreadAndRunRequest_H_


#include "CreateThreadRequest.h"
#include <nlohmann/json.hpp>
#include "CreateRunRequest_model.h"
#include "CreateThreadAndRunRequest_tools_inner.h"
#include "TruncationObject.h"
#include <string>
#include "AssistantsApiResponseFormatOption.h"
#include "AssistantsApiToolChoiceOption.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  CreateThreadAndRunRequest
{
public:
    CreateThreadAndRunRequest();
    virtual ~CreateThreadAndRunRequest() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const CreateThreadAndRunRequest& rhs) const;
    bool operator!=(const CreateThreadAndRunRequest& rhs) const;

    /////////////////////////////////////////////
    /// CreateThreadAndRunRequest members

    /// <summary>
    /// The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
    /// </summary>
    std::string getAssistantId() const;
    void setAssistantId(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CreateThreadRequest getThread() const;
    void setThread(org::openapitools::server::model::CreateThreadRequest const& value);
    bool threadIsSet() const;
    void unsetThread();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CreateRunRequest_model getModel() const;
    void setModel(org::openapitools::server::model::CreateRunRequest_model const& value);
    bool modelIsSet() const;
    void unsetModel();
    /// <summary>
    /// Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
    /// </summary>
    std::string getInstructions() const;
    void setInstructions(std::string const& value);
    bool instructionsIsSet() const;
    void unsetInstructions();
    /// <summary>
    /// Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
    /// </summary>
    std::vector<org::openapitools::server::model::CreateThreadAndRunRequest_tools_inner> getTools() const;
    void setTools(std::vector<org::openapitools::server::model::CreateThreadAndRunRequest_tools_inner> const& value);
    bool toolsIsSet() const;
    void unsetTools();
    /// <summary>
    /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    /// </summary>
    nlohmann::json getMetadata() const;
    void setMetadata(nlohmann::json const& value);
    bool metadataIsSet() const;
    void unsetMetadata();
    /// <summary>
    /// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
    /// </summary>
    double getTemperature() const;
    void setTemperature(double const value);
    bool temperatureIsSet() const;
    void unsetTemperature();
    /// <summary>
    /// If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. 
    /// </summary>
    bool isStream() const;
    void setStream(bool const value);
    bool streamIsSet() const;
    void unsetStream();
    /// <summary>
    /// The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;complete&#x60;. See &#x60;incomplete_details&#x60; for more info. 
    /// </summary>
    int32_t getMaxPromptTokens() const;
    void setMaxPromptTokens(int32_t const value);
    bool maxPromptTokensIsSet() const;
    void unsetMax_prompt_tokens();
    /// <summary>
    /// The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info. 
    /// </summary>
    int32_t getMaxCompletionTokens() const;
    void setMaxCompletionTokens(int32_t const value);
    bool maxCompletionTokensIsSet() const;
    void unsetMax_completion_tokens();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::TruncationObject getTruncationStrategy() const;
    void setTruncationStrategy(org::openapitools::server::model::TruncationObject const& value);
    bool truncationStrategyIsSet() const;
    void unsetTruncation_strategy();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::AssistantsApiToolChoiceOption getToolChoice() const;
    void setToolChoice(org::openapitools::server::model::AssistantsApiToolChoiceOption const& value);
    bool toolChoiceIsSet() const;
    void unsetTool_choice();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::AssistantsApiResponseFormatOption getResponseFormat() const;
    void setResponseFormat(org::openapitools::server::model::AssistantsApiResponseFormatOption const& value);
    bool responseFormatIsSet() const;
    void unsetResponse_format();

    friend  void to_json(nlohmann::json& j, const CreateThreadAndRunRequest& o);
    friend  void from_json(const nlohmann::json& j, CreateThreadAndRunRequest& o);
protected:
    std::string m_Assistant_id;

    org::openapitools::server::model::CreateThreadRequest m_Thread;
    bool m_ThreadIsSet;
    org::openapitools::server::model::CreateRunRequest_model m_Model;
    bool m_ModelIsSet;
    std::string m_Instructions;
    bool m_InstructionsIsSet;
    std::vector<org::openapitools::server::model::CreateThreadAndRunRequest_tools_inner> m_Tools;
    bool m_ToolsIsSet;
    nlohmann::json m_Metadata;
    bool m_MetadataIsSet;
    double m_Temperature;
    bool m_TemperatureIsSet;
    bool m_Stream;
    bool m_StreamIsSet;
    int32_t m_Max_prompt_tokens;
    bool m_Max_prompt_tokensIsSet;
    int32_t m_Max_completion_tokens;
    bool m_Max_completion_tokensIsSet;
    org::openapitools::server::model::TruncationObject m_Truncation_strategy;
    bool m_Truncation_strategyIsSet;
    org::openapitools::server::model::AssistantsApiToolChoiceOption m_Tool_choice;
    bool m_Tool_choiceIsSet;
    org::openapitools::server::model::AssistantsApiResponseFormatOption m_Response_format;
    bool m_Response_formatIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* CreateThreadAndRunRequest_H_ */
