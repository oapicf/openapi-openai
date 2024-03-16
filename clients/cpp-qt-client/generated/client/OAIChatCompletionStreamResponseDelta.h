/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIChatCompletionStreamResponseDelta.h
 *
 * 
 */

#ifndef OAIChatCompletionStreamResponseDelta_H
#define OAIChatCompletionStreamResponseDelta_H

#include <QJsonObject>

#include "OAIChatCompletionRequestMessage_function_call.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIChatCompletionRequestMessage_function_call;

class OAIChatCompletionStreamResponseDelta : public OAIObject {
public:
    OAIChatCompletionStreamResponseDelta();
    OAIChatCompletionStreamResponseDelta(QString json);
    ~OAIChatCompletionStreamResponseDelta() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getRole() const;
    void setRole(const QString &role);
    bool is_role_Set() const;
    bool is_role_Valid() const;

    QString getContent() const;
    void setContent(const QString &content);
    bool is_content_Set() const;
    bool is_content_Valid() const;

    OAIChatCompletionRequestMessage_function_call getFunctionCall() const;
    void setFunctionCall(const OAIChatCompletionRequestMessage_function_call &function_call);
    bool is_function_call_Set() const;
    bool is_function_call_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_role;
    bool m_role_isSet;
    bool m_role_isValid;

    QString m_content;
    bool m_content_isSet;
    bool m_content_isValid;

    OAIChatCompletionRequestMessage_function_call m_function_call;
    bool m_function_call_isSet;
    bool m_function_call_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIChatCompletionStreamResponseDelta)

#endif // OAIChatCompletionStreamResponseDelta_H