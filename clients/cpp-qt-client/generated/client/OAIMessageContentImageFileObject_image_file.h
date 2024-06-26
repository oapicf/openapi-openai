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
 * OAIMessageContentImageFileObject_image_file.h
 *
 * 
 */

#ifndef OAIMessageContentImageFileObject_image_file_H
#define OAIMessageContentImageFileObject_image_file_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIMessageContentImageFileObject_image_file : public OAIObject {
public:
    OAIMessageContentImageFileObject_image_file();
    OAIMessageContentImageFileObject_image_file(QString json);
    ~OAIMessageContentImageFileObject_image_file() override;

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

    QString m_file_id;
    bool m_file_id_isSet;
    bool m_file_id_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIMessageContentImageFileObject_image_file)

#endif // OAIMessageContentImageFileObject_image_file_H
