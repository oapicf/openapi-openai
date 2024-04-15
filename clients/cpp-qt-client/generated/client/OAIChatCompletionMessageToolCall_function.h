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
 * OAIChatCompletionMessageToolCall_function.h
 *
 * The function that the model called.
 */

#ifndef OAIChatCompletionMessageToolCall_function_H
#define OAIChatCompletionMessageToolCall_function_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIChatCompletionMessageToolCall_function : public OAIObject {
public:
    OAIChatCompletionMessageToolCall_function();
    OAIChatCompletionMessageToolCall_function(QString json);
    ~OAIChatCompletionMessageToolCall_function() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    QString getArguments() const;
    void setArguments(const QString &arguments);
    bool is_arguments_Set() const;
    bool is_arguments_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_name;
    bool m_name_isSet;
    bool m_name_isValid;

    QString m_arguments;
    bool m_arguments_isSet;
    bool m_arguments_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIChatCompletionMessageToolCall_function)

#endif // OAIChatCompletionMessageToolCall_function_H