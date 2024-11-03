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
 * OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h
 *
 * 
 */

#ifndef OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H
#define OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H

#include <QJsonObject>

#include "OAIRunStepDeltaStepDetailsToolCallsCodeOutputImageObject.h"
#include "OAIRunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image.h"
#include "OAIRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner : public OAIObject {
public:
    OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner();
    OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(QString json);
    ~OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint32 getIndex() const;
    void setIndex(const qint32 &index);
    bool is_index_Set() const;
    bool is_index_Valid() const;

    QString getType() const;
    void setType(const QString &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    QString getLogs() const;
    void setLogs(const QString &logs);
    bool is_logs_Set() const;
    bool is_logs_Valid() const;

    OAIRunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image getImage() const;
    void setImage(const OAIRunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image &image);
    bool is_image_Set() const;
    bool is_image_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint32 index;
    bool m_index_isSet;
    bool m_index_isValid;

    QString type;
    bool m_type_isSet;
    bool m_type_isValid;

    QString logs;
    bool m_logs_isSet;
    bool m_logs_isValid;

    OAIRunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image image;
    bool m_image_isSet;
    bool m_image_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner)

#endif // OAIRunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H
