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
 * OAIRunStepDetailsToolCallsCodeOutputImageObject_image.h
 *
 * 
 */

#ifndef OAIRunStepDetailsToolCallsCodeOutputImageObject_image_H
#define OAIRunStepDetailsToolCallsCodeOutputImageObject_image_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIRunStepDetailsToolCallsCodeOutputImageObject_image : public OAIObject {
public:
    OAIRunStepDetailsToolCallsCodeOutputImageObject_image();
    OAIRunStepDetailsToolCallsCodeOutputImageObject_image(QString json);
    ~OAIRunStepDetailsToolCallsCodeOutputImageObject_image() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getFileId() const;
    void setFileId(const QString &file_id);
    bool is_file_id_Set() const;
    bool is_file_id_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString file_id;
    bool m_file_id_isSet;
    bool m_file_id_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIRunStepDetailsToolCallsCodeOutputImageObject_image)

#endif // OAIRunStepDetailsToolCallsCodeOutputImageObject_image_H
