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
 * OAIChatCompletionResponseMessage.h
 *
 * A chat completion message generated by the model.
 */

#ifndef OAIChatCompletionResponseMessage_H
#define OAIChatCompletionResponseMessage_H

#include <QJsonObject>

#include "OAIChatCompletionMessageToolCall.h"
#include "OAIChatCompletionRequestAssistantMessage_function_call.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIChatCompletionMessageToolCall;
class OAIChatCompletionRequestAssistantMessage_function_call;

class OAIChatCompletionResponseMessage : public OAIObject {
public:
    OAIChatCompletionResponseMessage();
    OAIChatCompletionResponseMessage(QString json);
    ~OAIChatCompletionResponseMessage() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getContent() const;
    void setContent(const QString &content);
    bool is_content_Set() const;
    bool is_content_Valid() const;

    QList<OAIChatCompletionMessageToolCall> getToolCalls() const;
    void setToolCalls(const QList<OAIChatCompletionMessageToolCall> &tool_calls);
    bool is_tool_calls_Set() const;
    bool is_tool_calls_Valid() const;

    QString getRole() const;
    void setRole(const QString &role);
    bool is_role_Set() const;
    bool is_role_Valid() const;

    Q_DECL_DEPRECATED OAIChatCompletionRequestAssistantMessage_function_call getFunctionCall() const;
    Q_DECL_DEPRECATED void setFunctionCall(const OAIChatCompletionRequestAssistantMessage_function_call &function_call);
    Q_DECL_DEPRECATED bool is_function_call_Set() const;
    Q_DECL_DEPRECATED bool is_function_call_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_content;
    bool m_content_isSet;
    bool m_content_isValid;

    QList<OAIChatCompletionMessageToolCall> m_tool_calls;
    bool m_tool_calls_isSet;
    bool m_tool_calls_isValid;

    QString m_role;
    bool m_role_isSet;
    bool m_role_isValid;

    OAIChatCompletionRequestAssistantMessage_function_call m_function_call;
    bool m_function_call_isSet;
    bool m_function_call_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIChatCompletionResponseMessage)

#endif // OAIChatCompletionResponseMessage_H
