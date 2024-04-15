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
 * OAIRunStepDetailsToolCallsCodeOutputLogsObject.h
 *
 * Text output from the Code Interpreter tool call as part of a run step.
 */

#ifndef OAIRunStepDetailsToolCallsCodeOutputLogsObject_H
#define OAIRunStepDetailsToolCallsCodeOutputLogsObject_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIRunStepDetailsToolCallsCodeOutputLogsObject : public OAIObject {
public:
    OAIRunStepDetailsToolCallsCodeOutputLogsObject();
    OAIRunStepDetailsToolCallsCodeOutputLogsObject(QString json);
    ~OAIRunStepDetailsToolCallsCodeOutputLogsObject() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getType() const;
    void setType(const QString &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    QString getLogs() const;
    void setLogs(const QString &logs);
    bool is_logs_Set() const;
    bool is_logs_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_type;
    bool m_type_isSet;
    bool m_type_isValid;

    QString m_logs;
    bool m_logs_isSet;
    bool m_logs_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIRunStepDetailsToolCallsCodeOutputLogsObject)

#endif // OAIRunStepDetailsToolCallsCodeOutputLogsObject_H