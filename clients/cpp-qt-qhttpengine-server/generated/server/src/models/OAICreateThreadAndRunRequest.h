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
 * OAICreateThreadAndRunRequest.h
 *
 * 
 */

#ifndef OAICreateThreadAndRunRequest_H
#define OAICreateThreadAndRunRequest_H

#include <QJsonObject>

#include "OAIAssistantsApiResponseFormatOption.h"
#include "OAIAssistantsApiToolChoiceOption.h"
#include "OAICreateRunRequest_model.h"
#include "OAICreateThreadAndRunRequest_tools_inner.h"
#include "OAICreateThreadRequest.h"
#include "OAIObject.h"
#include "OAITruncationObject.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICreateThreadAndRunRequest : public OAIObject {
public:
    OAICreateThreadAndRunRequest();
    OAICreateThreadAndRunRequest(QString json);
    ~OAICreateThreadAndRunRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getAssistantId() const;
    void setAssistantId(const QString &assistant_id);
    bool is_assistant_id_Set() const;
    bool is_assistant_id_Valid() const;

    OAICreateThreadRequest getThread() const;
    void setThread(const OAICreateThreadRequest &thread);
    bool is_thread_Set() const;
    bool is_thread_Valid() const;

    OAICreateRunRequest_model getModel() const;
    void setModel(const OAICreateRunRequest_model &model);
    bool is_model_Set() const;
    bool is_model_Valid() const;

    QString getInstructions() const;
    void setInstructions(const QString &instructions);
    bool is_instructions_Set() const;
    bool is_instructions_Valid() const;

    QList<OAICreateThreadAndRunRequest_tools_inner> getTools() const;
    void setTools(const QList<OAICreateThreadAndRunRequest_tools_inner> &tools);
    bool is_tools_Set() const;
    bool is_tools_Valid() const;

    OAIObject getMetadata() const;
    void setMetadata(const OAIObject &metadata);
    bool is_metadata_Set() const;
    bool is_metadata_Valid() const;

    double getTemperature() const;
    void setTemperature(const double &temperature);
    bool is_temperature_Set() const;
    bool is_temperature_Valid() const;

    bool isStream() const;
    void setStream(const bool &stream);
    bool is_stream_Set() const;
    bool is_stream_Valid() const;

    qint32 getMaxPromptTokens() const;
    void setMaxPromptTokens(const qint32 &max_prompt_tokens);
    bool is_max_prompt_tokens_Set() const;
    bool is_max_prompt_tokens_Valid() const;

    qint32 getMaxCompletionTokens() const;
    void setMaxCompletionTokens(const qint32 &max_completion_tokens);
    bool is_max_completion_tokens_Set() const;
    bool is_max_completion_tokens_Valid() const;

    OAITruncationObject getTruncationStrategy() const;
    void setTruncationStrategy(const OAITruncationObject &truncation_strategy);
    bool is_truncation_strategy_Set() const;
    bool is_truncation_strategy_Valid() const;

    OAIAssistantsApiToolChoiceOption getToolChoice() const;
    void setToolChoice(const OAIAssistantsApiToolChoiceOption &tool_choice);
    bool is_tool_choice_Set() const;
    bool is_tool_choice_Valid() const;

    OAIAssistantsApiResponseFormatOption getResponseFormat() const;
    void setResponseFormat(const OAIAssistantsApiResponseFormatOption &response_format);
    bool is_response_format_Set() const;
    bool is_response_format_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString assistant_id;
    bool m_assistant_id_isSet;
    bool m_assistant_id_isValid;

    OAICreateThreadRequest thread;
    bool m_thread_isSet;
    bool m_thread_isValid;

    OAICreateRunRequest_model model;
    bool m_model_isSet;
    bool m_model_isValid;

    QString instructions;
    bool m_instructions_isSet;
    bool m_instructions_isValid;

    QList<OAICreateThreadAndRunRequest_tools_inner> tools;
    bool m_tools_isSet;
    bool m_tools_isValid;

    OAIObject metadata;
    bool m_metadata_isSet;
    bool m_metadata_isValid;

    double temperature;
    bool m_temperature_isSet;
    bool m_temperature_isValid;

    bool stream;
    bool m_stream_isSet;
    bool m_stream_isValid;

    qint32 max_prompt_tokens;
    bool m_max_prompt_tokens_isSet;
    bool m_max_prompt_tokens_isValid;

    qint32 max_completion_tokens;
    bool m_max_completion_tokens_isSet;
    bool m_max_completion_tokens_isValid;

    OAITruncationObject truncation_strategy;
    bool m_truncation_strategy_isSet;
    bool m_truncation_strategy_isValid;

    OAIAssistantsApiToolChoiceOption tool_choice;
    bool m_tool_choice_isSet;
    bool m_tool_choice_isValid;

    OAIAssistantsApiResponseFormatOption response_format;
    bool m_response_format_isSet;
    bool m_response_format_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateThreadAndRunRequest)

#endif // OAICreateThreadAndRunRequest_H