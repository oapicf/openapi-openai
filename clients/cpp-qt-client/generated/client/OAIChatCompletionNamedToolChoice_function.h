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
 * OAIChatCompletionNamedToolChoice_function.h
 *
 * 
 */

#ifndef OAIChatCompletionNamedToolChoice_function_H
#define OAIChatCompletionNamedToolChoice_function_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIChatCompletionNamedToolChoice_function : public OAIObject {
public:
    OAIChatCompletionNamedToolChoice_function();
    OAIChatCompletionNamedToolChoice_function(QString json);
    ~OAIChatCompletionNamedToolChoice_function() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_name;
    bool m_name_isSet;
    bool m_name_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIChatCompletionNamedToolChoice_function)

#endif // OAIChatCompletionNamedToolChoice_function_H