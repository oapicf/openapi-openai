/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CreateRunRequest.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateRunRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateRunRequest_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/TruncationObject.h"
#include "CppRestOpenAPIClient/model/AssistantsApiToolChoiceOption.h"
#include "CppRestOpenAPIClient/model/AssistantObject_tools_inner.h"
#include "CppRestOpenAPIClient/model/CreateRunRequest_model.h"
#include "CppRestOpenAPIClient/model/CreateMessageRequest.h"
#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/AssistantsApiResponseFormatOption.h"
#include "CppRestOpenAPIClient/Object.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class CreateMessageRequest;
class AssistantObject_tools_inner;
class TruncationObject;
class AssistantsApiToolChoiceOption;
class AssistantsApiResponseFormatOption;


/// <summary>
/// 
/// </summary>
class  CreateRunRequest
    : public ModelBase
{
public:
    CreateRunRequest();
    virtual ~CreateRunRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateRunRequest members

    /// <summary>
    /// The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
    /// </summary>
    utility::string_t getAssistantId() const;
    bool assistantIdIsSet() const;
    void unsetAssistant_id();

    void setAssistantId(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CreateRunRequest_model> getModel() const;
    bool modelIsSet() const;
    void unsetModel();

    void setModel(const std::shared_ptr<CreateRunRequest_model>& value);

    /// <summary>
    /// Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
    /// </summary>
    utility::string_t getInstructions() const;
    bool instructionsIsSet() const;
    void unsetInstructions();

    void setInstructions(const utility::string_t& value);

    /// <summary>
    /// Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
    /// </summary>
    utility::string_t getAdditionalInstructions() const;
    bool additionalInstructionsIsSet() const;
    void unsetAdditional_instructions();

    void setAdditionalInstructions(const utility::string_t& value);

    /// <summary>
    /// Adds additional messages to the thread before creating the run.
    /// </summary>
    std::vector<std::shared_ptr<CreateMessageRequest>>& getAdditionalMessages();
    bool additionalMessagesIsSet() const;
    void unsetAdditional_messages();

    void setAdditionalMessages(const std::vector<std::shared_ptr<CreateMessageRequest>>& value);

    /// <summary>
    /// Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
    /// </summary>
    std::vector<std::shared_ptr<AssistantObject_tools_inner>>& getTools();
    bool toolsIsSet() const;
    void unsetTools();

    void setTools(const std::vector<std::shared_ptr<AssistantObject_tools_inner>>& value);

    /// <summary>
    /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    /// </summary>
    std::shared_ptr<Object> getMetadata() const;
    bool metadataIsSet() const;
    void unsetMetadata();

    void setMetadata(const std::shared_ptr<Object>& value);

    /// <summary>
    /// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
    /// </summary>
    double getTemperature() const;
    bool temperatureIsSet() const;
    void unsetTemperature();

    void setTemperature(double value);

    /// <summary>
    /// If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. 
    /// </summary>
    bool isStream() const;
    bool streamIsSet() const;
    void unsetStream();

    void setStream(bool value);

    /// <summary>
    /// The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;complete&#x60;. See &#x60;incomplete_details&#x60; for more info. 
    /// </summary>
    int32_t getMaxPromptTokens() const;
    bool maxPromptTokensIsSet() const;
    void unsetMax_prompt_tokens();

    void setMaxPromptTokens(int32_t value);

    /// <summary>
    /// The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;complete&#x60;. See &#x60;incomplete_details&#x60; for more info. 
    /// </summary>
    int32_t getMaxCompletionTokens() const;
    bool maxCompletionTokensIsSet() const;
    void unsetMax_completion_tokens();

    void setMaxCompletionTokens(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<TruncationObject> getTruncationStrategy() const;
    bool truncationStrategyIsSet() const;
    void unsetTruncation_strategy();

    void setTruncationStrategy(const std::shared_ptr<TruncationObject>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AssistantsApiToolChoiceOption> getToolChoice() const;
    bool toolChoiceIsSet() const;
    void unsetTool_choice();

    void setToolChoice(const std::shared_ptr<AssistantsApiToolChoiceOption>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AssistantsApiResponseFormatOption> getResponseFormat() const;
    bool responseFormatIsSet() const;
    void unsetResponse_format();

    void setResponseFormat(const std::shared_ptr<AssistantsApiResponseFormatOption>& value);


protected:
    utility::string_t m_Assistant_id;
    bool m_Assistant_idIsSet;
    std::shared_ptr<CreateRunRequest_model> m_Model;
    bool m_ModelIsSet;
    utility::string_t m_Instructions;
    bool m_InstructionsIsSet;
    utility::string_t m_Additional_instructions;
    bool m_Additional_instructionsIsSet;
    std::vector<std::shared_ptr<CreateMessageRequest>> m_Additional_messages;
    bool m_Additional_messagesIsSet;
    std::vector<std::shared_ptr<AssistantObject_tools_inner>> m_Tools;
    bool m_ToolsIsSet;
    std::shared_ptr<Object> m_Metadata;
    bool m_MetadataIsSet;
    double m_Temperature;
    bool m_TemperatureIsSet;
    bool m_Stream;
    bool m_StreamIsSet;
    int32_t m_Max_prompt_tokens;
    bool m_Max_prompt_tokensIsSet;
    int32_t m_Max_completion_tokens;
    bool m_Max_completion_tokensIsSet;
    std::shared_ptr<TruncationObject> m_Truncation_strategy;
    bool m_Truncation_strategyIsSet;
    std::shared_ptr<AssistantsApiToolChoiceOption> m_Tool_choice;
    bool m_Tool_choiceIsSet;
    std::shared_ptr<AssistantsApiResponseFormatOption> m_Response_format;
    bool m_Response_formatIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateRunRequest_H_ */
