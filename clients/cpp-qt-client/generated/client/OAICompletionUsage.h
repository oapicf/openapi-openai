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
 * OAICompletionUsage.h
 *
 * Usage statistics for the completion request.
 */

#ifndef OAICompletionUsage_H
#define OAICompletionUsage_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICompletionUsage : public OAIObject {
public:
    OAICompletionUsage();
    OAICompletionUsage(QString json);
    ~OAICompletionUsage() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint32 getCompletionTokens() const;
    void setCompletionTokens(const qint32 &completion_tokens);
    bool is_completion_tokens_Set() const;
    bool is_completion_tokens_Valid() const;

    qint32 getPromptTokens() const;
    void setPromptTokens(const qint32 &prompt_tokens);
    bool is_prompt_tokens_Set() const;
    bool is_prompt_tokens_Valid() const;

    qint32 getTotalTokens() const;
    void setTotalTokens(const qint32 &total_tokens);
    bool is_total_tokens_Set() const;
    bool is_total_tokens_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint32 m_completion_tokens;
    bool m_completion_tokens_isSet;
    bool m_completion_tokens_isValid;

    qint32 m_prompt_tokens;
    bool m_prompt_tokens_isSet;
    bool m_prompt_tokens_isValid;

    qint32 m_total_tokens;
    bool m_total_tokens_isSet;
    bool m_total_tokens_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICompletionUsage)

#endif // OAICompletionUsage_H
